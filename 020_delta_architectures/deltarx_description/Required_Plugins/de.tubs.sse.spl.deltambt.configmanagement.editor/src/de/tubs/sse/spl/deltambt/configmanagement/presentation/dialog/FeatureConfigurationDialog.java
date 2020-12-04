package de.tubs.sse.spl.deltambt.configmanagement.presentation.dialog;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementFactory;
import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.ConfigManagementEditorPlugin;
import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;

/**
 * This dialog controls the definition of a valid feature configuration.
 * 
 * @author Sascha Lity
 */
public class FeatureConfigurationDialog {
	
	/** The dialog shell. */
	private Shell shell;
	
	/** The configuration name Text (widget). */
	private Text configNameText;
	
	/** A HashMap which consists of all features. */
	private HashMap<String, Feature> features;

	/** The possible feature table. */
	private Table possibleFeatureTable;
	
	/** The config feature table. */
	private Table configFeatureTable;
	
	/** The validate Button (Widget). */
	private Button validate;
	
	/** The create Button (Widget). */
	private Button create;
	
	/** The current feature configuration. */
	private Configuration currentConfig;
	
	/** The path to the current configuration repository. */
	private String repository;
	
	/** This flag represents the validation status of the current configuration. */
	private boolean validConfig;
	
	/** The title of the dialog. */
	private String title;
	
	/** The dialog style. */
	private int style;
	
	/** The parent shell. */
	private Shell parent;
	
	/** The root feature. */
	private Feature root;
	
	/** The map of deleted features for each feature. */
	private HashMap<Feature, List<Feature>> deletedFeatures;
	
	
	/**
	 * Std. Constructor
	 */
	@SuppressWarnings("unused")
	private FeatureConfigurationDialog() {}
	
	/**
	 * Instantiates a new feature configuration dialog.
	 *
	 * @param parent the parent shell
	 * @param style the dialog style
	 * @param title the dialog title
	 */
	public FeatureConfigurationDialog(Shell parent, int style, String title)
	{
		this.parent = parent;
		this.style = style;
		this.title = title;
		
		validConfig = false;
		currentConfig = ConfigmanagementFactory.eINSTANCE.createConfiguration();
		deletedFeatures = new HashMap<Feature, List<Feature>>();
	}
	
	/**
	 * Checks if the configuration is empty.
	 *
	 * @return true, if the configuration is empty
	 */
	public boolean isConfigurationEmpty()
	{
		return currentConfig.getFeatures().size() == 0;
	}
	
	/**
	 * Checks if it is a valid configuration.
	 *
	 * @return true, if it is a valid configuration
	 */
	public boolean isValidConfig()
	{
		return validConfig;
	}
	
	/**
	 * Open the {@link FeatureConfigurationDialog}.
	 */
	public void openDialog()
	{
		initDialog();		
		shell.pack();
		shell.open();
	}
	
	/**
	 * Handle the event of adding a selected feature to the current configuration.
	 */
	private void handleAddFeatureToConfiguration() {
		if(possibleFeatureTable.getSelection().length > 0)
		{
			validConfig = false;
			validate.setEnabled(true);
			create.setEnabled(false);
			
			List<Feature> removeFeatures = new LinkedList<Feature>();
			List<Feature> addFeatures = new LinkedList<Feature>();
			Feature selectedFeat = features.get(possibleFeatureTable.getItem(
					possibleFeatureTable.getSelectionIndices()[0]).getText(0));
			
			addFeatures.add(selectedFeat);
			removeFeatures.add(selectedFeat);

			//delete all excluded features from table of possible features
			for(Feature excluded: selectedFeat.getExclude())
			{
				if(!removeFeatures.contains(excluded))
				{
					removeFeatures.add(excluded);
					removeChildren(excluded, removeFeatures);
				}
			}
			
			if(selectedFeat.eContainer() != null &&  
					selectedFeat.eContainmentFeature().getName().equals("alternative"))
			{
				for(Feature alternative: ((Feature)selectedFeat.eContainer()).getAlternative())
				{
					if(!removeFeatures.contains(alternative))
					{
						removeFeatures.add(alternative);
						removeChildren(alternative, removeFeatures);
					}
				}
			}
			
			deletedFeatures.put(selectedFeat, removeFeatures);
			
			List<Feature> moreRemoveFeatures = new LinkedList<Feature>();
			
			if(selectedFeat.eContainer() != null && !selectedFeat.eContainer().equals(root))
			{
				handleHierarchyRelation((Feature)selectedFeat.eContainer(), addFeatures, moreRemoveFeatures);
			}
			
			moreRemoveFeatures.addAll(removeFeatures);

			//Add Feature to configuration
			int indexRemItem = 0;
			for(Feature feat: addFeatures)
			{
				if(!currentConfig.getFeatures().contains(feat))
				{
					TableItem newItem = new TableItem(configFeatureTable, SWT.NONE);
					setTableFeature(feat, newItem);
					currentConfig.getFeatures().add(feat);
					
					indexRemItem = 0;
					for(TableItem item : possibleFeatureTable.getItems())
					{
						if(item.getText(0).equals(feat.getName()))
						{
							possibleFeatureTable.remove(indexRemItem);
							break;
						}
						
						indexRemItem += 1;
					}
				}
			}
			
			//Remove not ppossible features from table of possible features
			int indexRemFeatItem = 0;
			for(Feature feat: moreRemoveFeatures)
			{
				indexRemFeatItem = 0;
				for(TableItem item : possibleFeatureTable.getItems())
				{
					if(item.getText(0).equals(feat.getName()))
					{
						possibleFeatureTable.remove(indexRemFeatItem);
						break;
					}
					
					indexRemFeatItem += 1;
				}
			}
			
			for(TableColumn column : possibleFeatureTable.getColumns())
			{
				column.pack();				
			}
			for(TableColumn column : configFeatureTable.getColumns())
			{
				column.pack();				
			}
		}
	}
	
	/**
	 * Remove the children of a feature from the table of possible features.
	 * 
	 * @param feature The feature for which the children features will be removed
	 * @param removeFeatures The List of features which will be removed from the table of possible features.
	 */
	private void removeChildren(Feature feature, List<Feature> removeFeatures) {
		List<Feature> children = new LinkedList<Feature>();
		children.addAll(feature.getAlternative());
		children.addAll(feature.getOr());
		children.addAll(feature.getSub());
		
		for(Feature child: children)
		{
			if(!removeFeatures.contains(child))
				removeFeatures.add(child);
			
			removeChildren(child, removeFeatures);
		}
	}

	/**
	 * Handle the hierarchy relations for adding the ancestor of aa feature.
	 * @param currentFeat The current feature for which the parent is added.
	 * @param addFeatures A List of features which will be added to the configuration.
	 * @param moreRemoveFeatures A List of features which will be removed from the table of possible features.
	 */
	private void handleHierarchyRelation(Feature currentFeat, List<Feature> addFeatures,
			List<Feature> moreRemoveFeatures) {
		
		List<Feature> removeFeatures = new LinkedList<Feature>();
		addFeatures.add(currentFeat);
		removeFeatures.add(currentFeat);
		
		for(Feature excluded: currentFeat.getExclude())
		{
			if(!removeFeatures.contains(excluded))
			{
				removeChildren(excluded, removeFeatures);
				removeFeatures.add(excluded);
			}
		}
		
		if(currentFeat.eContainer() != null && 
				currentFeat.eContainmentFeature().getName().equals("alternative"))
		{	
			for(Feature alternative: ((Feature)currentFeat.eContainer()).getAlternative())
			{
				if(!removeFeatures.contains(alternative))
				{
					removeFeatures.add(alternative);
					removeChildren(alternative, removeFeatures);
				}
			}
		}	

		deletedFeatures.put(currentFeat, removeFeatures);		
		moreRemoveFeatures.addAll(removeFeatures);		
		if(currentFeat.eContainer() != null && !currentFeat.eContainer().equals(root))
		{
			handleHierarchyRelation((Feature)currentFeat.eContainer(), addFeatures, moreRemoveFeatures);
		}		
	}

	/**
	 * Gets the children of a feature which are in the current configuration.
	 *
	 * @param currentFeat the current feature
	 * @param children the list of children which are in the configuration as well
	 */
	private void getChildrenInConfiguration(Feature currentFeat, List<Feature> children)
	{
		List<Feature> tempList = new LinkedList<Feature>();
		tempList.addAll(currentFeat.getAlternative());
		tempList.addAll(currentFeat.getOr());
		tempList.addAll(currentFeat.getSub());
		for(Feature child: tempList)
		{
			if (currentConfig.getFeatures().contains(child))
			{
				children.add(child);
				getChildrenInConfiguration(child, children);
			}			
		}
	}
	
	/**
	 * Handle the removing of a feature from the current configuration.
	 */
	private void handleRemoveFeatureFromConfiguration()
	{
		if(configFeatureTable.getSelection().length > 0)
		{
			validConfig = false;
			validate.setEnabled(true);
			create.setEnabled(false);
			
			Feature selectedFeat = features.get(configFeatureTable.
					getItem(configFeatureTable.getSelectionIndices()[0]).getText(0));
			
			List<Feature> children  = new LinkedList<Feature>();
			getChildrenInConfiguration(selectedFeat, children);
					
			currentConfig.getFeatures().remove(selectedFeat);
			currentConfig.getFeatures().removeAll(children);
			
			List<Feature> list = deletedFeatures.get(selectedFeat);
			deletedFeatures.remove(selectedFeat);
			
			for(Feature child: children)
			{
				for(Feature remFeat: deletedFeatures.get(child))
				{
					if(!list.contains(remFeat))
						list.add(remFeat);
				}
				deletedFeatures.remove(child);
			}
			
			for(List<Feature> removedFeatures: deletedFeatures.values())
			{
				for(Feature feat: removedFeatures)
				{
					if(list.contains(feat))
						list.remove(feat);
				}
			}
			
			int indexItem = 0;
			for(Feature feat: list)
			{
				TableItem newItem = new TableItem(possibleFeatureTable, SWT.NONE);
				setTableFeature(feat, newItem);
				
				indexItem = 0;
				for(TableItem item : configFeatureTable.getItems())
				{
					if(item.getText(0).equals(feat.getName()))
					{
						configFeatureTable.remove(indexItem);						
					}
					
					indexItem += 1;
				}				
			}
			
			for(TableColumn column : possibleFeatureTable.getColumns())
			{
				column.pack();				
			}
			for(TableColumn column : configFeatureTable.getColumns())
			{
				column.pack();				
			}
		}
	}
	
	/**
	 * Initiate the dialog with content.
	 */
	private void initDialog()
	{
		shell = new Shell(parent, style);
		shell.setText(title);
		
		GridLayout layout = new GridLayout();
		shell.setLayout(layout);
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		
		Composite nameGroup = new Composite(shell, SWT.NULL);
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		nameGroup.setLayout(layout);
		
		Label label = new Label(nameGroup, SWT.NULL);
		label.setText("Configuration Name: ");
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.grabExcessHorizontalSpace = true;
		
		nameGroup.setLayoutData(gd);
		
		configNameText = new Text(nameGroup, SWT.BORDER | SWT.SINGLE);
		configNameText.setLayoutData(gd);
		
		Composite group = new Composite(shell, SWT.NULL);
		GridData gdGroup = new GridData(GridData.FILL_HORIZONTAL | GridData.FILL_VERTICAL);
		gdGroup.horizontalAlignment = GridData.CENTER;
		layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 10;
		layout.horizontalSpacing = 10;
		group.setLayout(layout);
		group.setLayoutData(gdGroup);
		
		label = new Label(group, SWT.NULL);
		label.setText("Possible Features: ");
			
		label = new Label(group, SWT.NULL);
			
		label = new Label(group, SWT.NULL);
		label.setText("Configuration: ");
			
		possibleFeatureTable = new Table (group, SWT.SINGLE | SWT.BORDER 
				| SWT.FULL_SELECTION | SWT.READ_ONLY);
		possibleFeatureTable.setLinesVisible (true);
		possibleFeatureTable.setHeaderVisible (true);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.minimumHeight = 300;
		data.minimumWidth = 400;
		possibleFeatureTable.setLayoutData(data);
		String[] titles = {"Name", "Type", "Parent"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (possibleFeatureTable, 
					SWT.NONE);
			column.setText (titles [i]);
			column.setWidth(125);
		}
					
		Composite buttonGroup = new Composite(group, SWT.NULL);
		GridLayout layoutGroup = new GridLayout();
		buttonGroup.setLayout(layoutGroup);
		layoutGroup.verticalSpacing = 15;
			
		Button add = new Button(buttonGroup, SWT.PUSH);
		add.setLayoutData(gd);
		add.setText("Add");
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleAddFeatureToConfiguration();
			}
		});
		
		Button remove = new Button(buttonGroup, SWT.PUSH);
		remove.setLayoutData(gd);
		remove.setText("Remove");
		remove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(root.equals(features.get(configFeatureTable.
						getItem(configFeatureTable.getSelectionIndices()[0]).getText(0))))
				{
					MessageDialog.openWarning(shell, "Warning...", 
							"You cannot remove the Root Feature.");
				}
				else
				{
					handleRemoveFeatureFromConfiguration();					
				}			
			}
		});
		
		configFeatureTable = new Table (group, SWT.SINGLE | SWT.BORDER 
				| SWT.FULL_SELECTION | SWT.READ_ONLY);
		configFeatureTable.setLinesVisible (true);
		configFeatureTable.setHeaderVisible (true);
		configFeatureTable.setLayoutData(data);
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (configFeatureTable, 
					SWT.NONE);
			column.setText (titles [i]);
			column.setWidth(125);
		}
		
		GridData gdBut = new GridData();
		gdBut.horizontalAlignment = GridData.CENTER;
		
		validate = new Button(group, SWT.PUSH);
		validate.setLayoutData(gdBut);
		validate.setText("Validate");
		validate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validate();
				if (validConfig) {
					create.setEnabled(true);
					validate.setEnabled(false);
				}
			}
		});
		
		gdBut = new GridData();
		gdBut.horizontalAlignment = GridData.CENTER;
		
		create = new Button(group, SWT.PUSH);
		create.setLayoutData(gdBut);
		create.setText("Create");
		create.setEnabled(false);
		create.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				createConfiguration();
			}
		});
		
		gdBut = new GridData();
		gdBut.horizontalAlignment = GridData.CENTER;
		
		Button close = new Button(group, SWT.PUSH);
		close.setText("Close");
		close.setLayoutData(gdBut);
		close.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
			}
		});

		boolean exists = false;
		for(Feature feat : features.values())
		{
			if(!currentConfig.getFeatures().contains(feat))
			{
				exists = false;
				for(List<Feature> list: deletedFeatures.values())
				{
					if(list.contains(feat))
					{
						exists = true;
						break;
					}
				}
				if(!exists)
				{
					TableItem item = new TableItem(possibleFeatureTable, SWT.NONE);
					setTableFeature(feat, item);
				}
			}
		}
		
		for(Feature feat : currentConfig.getFeatures())
		{
			TableItem item = new TableItem(configFeatureTable, SWT.NONE);
			setTableFeature(feat, item);
		}

		for(TableColumn column : possibleFeatureTable.getColumns())
		{
			column.pack();				
		}
		for(TableColumn column : configFeatureTable.getColumns())
		{
			column.pack();				
		}
	}

	/**
	 * Set the value for the table item of a feature.
	 * @param feature The feature for which the item is created
	 * @param item The TableItem where the columns value is set
	 */
	private void setTableFeature(Feature feature, TableItem item) {
		item.setText(0, feature.getName());
		if(feature.eContainmentFeature().getName().equals("alternative"))
			item.setText(1, "Alternative");
		else if(feature.eContainmentFeature().getName().equals("or"))
			item.setText(1, "Or");
		else
			item.setText(1, feature.getType().toString());
	
		if(feature.eContainer() instanceof Feature)
			item.setText(2, ((Feature)feature.eContainer()).getName());
	}
	
	/**
	 * Creates the configuration.
	 */
	private void createConfiguration()
	{
		if(configNameText.getText().isEmpty())
		{
			MessageDialog.openWarning(shell, "Warning...", 
				"You have to define a name for the current configuration.");
			return;
		}
		currentConfig.setName(configNameText.getText());
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
	    	
	    	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	    			Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	    					
	    	URI fileURI = URI.createURI(repository);
	    	Resource resource = resourceSet.getResource(fileURI, true);
	    				
			ConfigurationRepository repo = (ConfigurationRepository)resource.getContents().get(0);
			
			for(Configuration config: repo.getConfigs())
			{
				if(config.getName().equals(configNameText.getText()))
				{
					MessageDialog.openError(shell, "Error...", 
					"You have to define another name for the current configuration. " +
					"There exists a configuration with the same name.");
					return;
				}
			}
			
			repo.getConfigs().add(currentConfig);
			
			// Save the contents of the resource to the file system.
			//
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
			
			shell.dispose();
		}
		catch(Exception exception)
		{
			ConfigManagementEditorPlugin.INSTANCE.log(exception);
		}
	}
	
	/**
	 * Gets the configuration.
	 *
	 * @return the configuration
	 */
	public Configuration getConfiguration()
	{
		return currentConfig;
	}
	
	/**
	 * Reset the configuration dialog.
	 */
	public void reset()
	{
		currentConfig = ConfigmanagementFactory.eINSTANCE.createConfiguration();
		if(features != null)
			features.clear();
		else
			features = new HashMap<String, Feature>();
	}
	
	/**
	 * Sets the feature model.
	 *
	 * @param model the new feature model
	 */
	public void setFeatureModel(FeatureModel model)
	{
		if (features != null) 
		{
			features.clear();			
		}
		else
			features = new HashMap<String, Feature>();
		
		deletedFeatures.clear();
		
		root = model.getRoot();
		currentConfig.getFeatures().add(root);
		
		for (TreeIterator<EObject> iter =
		       model.eAllContents(); iter.hasNext(); ) 
		{
		    Feature feature = (Feature)iter.next();
		    features.put(feature.getName(), feature);
		}
	}
	
	/**
	 * Validate the feature configuration.
	 */
	public void validate()
	{
		validConfig = false;
		
		List<String> mandatoryFeatNames = new LinkedList<String>();
		List<String> orFeatNames = new LinkedList<String>();
		List<String> alternativeFeatNames = new LinkedList<String>();
		List<String> requireErrorMessages = new LinkedList<String>();
		
		//All require relations have to be valid
		for(Feature configFeat: currentConfig.getFeatures())
		{
			for(Feature reqFeat: configFeat.getRequire())
			{
				if(!currentConfig.getFeatures().contains(reqFeat))
				{
					requireErrorMessages.add("The Feature " + configFeat.getName() + " requires the Feature " 
							+ reqFeat.getName());
				}
			}
		}
		
		boolean existsOrInConfig = false;
		for(TableItem item: possibleFeatureTable.getItems())
		{
			//Collect all not selected mandatory features
			if(features.get(item.getText(0)).getType().getName().equals("mandatory") && 
					features.get(item.getText(0)).eContainmentFeature().getName().equals("sub"))
			{
				if(currentConfig.getFeatures().contains((Feature)features.get(item.getText(0)).eContainer()))
				{
					mandatoryFeatNames.add(item.getText(0));					
				}
			}
			if(features.get(item.getText(0)).eContainmentFeature().getName().equals("or") &&
					currentConfig.getFeatures().contains(features.get(item.getText(0)).eContainer()))
			{
				existsOrInConfig = false;
				for(Feature orFeat: ((Feature)(features.get(item.getText(0)).eContainer())).getOr())
				{
					if(currentConfig.getFeatures().contains(orFeat))
						existsOrInConfig = true;
				}
				if(!existsOrInConfig)
				{
					if(!orFeatNames.contains(((Feature)(features.get(item.getText(0)).eContainer())).getName()))
						orFeatNames.add(((Feature)(features.get(item.getText(0)).eContainer())).getName());
				}
			}
			
			if(features.get(item.getText(0)).eContainmentFeature().getName().equals("alternative") &&
					currentConfig.getFeatures().contains(features.get(item.getText(0)).eContainer()))
			{
				if(!alternativeFeatNames.contains(((Feature)(features.get(item.getText(0)).eContainer())).getName()))
					alternativeFeatNames.add(((Feature)(features.get(item.getText(0)).eContainer())).getName());
			}
							
		}
			
		if(mandatoryFeatNames.isEmpty() && orFeatNames.isEmpty() && alternativeFeatNames.isEmpty() &&
				requireErrorMessages.isEmpty())
		{
			validConfig = true;
			MessageDialog.openInformation(shell, "The configuration is valid...", "It is a valid configuration.");
		}
		else
		{
			String errorMessage = "";
			int lineCounter = 0;
			for(String name: mandatoryFeatNames)
			{
				if(lineCounter <= 20)
				{
					errorMessage += "The Mandatory Feature " + name 
						+ " has to be selected.\n";
					lineCounter++;
				}
				else
					break;
			}
			
			for(String name: orFeatNames)
			{
				if(lineCounter <= 20)
				{
					errorMessage += "At least one of the Or Features of Feature " + name 
						+ " has to be selected.\n";
					lineCounter++;
				}
				else
					break;
				
			}
			
			for(String name: alternativeFeatNames)
			{
				if(lineCounter <= 20)
				{
					errorMessage += "One of the Alternative Features of Feature " + name 
						+ " has to be selected.\n";
					lineCounter++;
				}
				else
					break;				
			}
			
			for(String message: requireErrorMessages)
			{
				if(lineCounter <= 20)
				{
					errorMessage += message + "\n";
					lineCounter++;
				}
				else
					break;
			}
			if (lineCounter > 20) 
			{
				errorMessage += "...";
			}
						
			MessageDialog.openError(shell, "The configuration is invalid...", errorMessage);
		}
	}
	
	/**
	 * Sets the configuration repository.
	 *
	 * @param repository the path of the new configuration repository
	 */
	public void setConfigurationRepository(String repositoryPath)
	{
		repository = repositoryPath;
	}
}
