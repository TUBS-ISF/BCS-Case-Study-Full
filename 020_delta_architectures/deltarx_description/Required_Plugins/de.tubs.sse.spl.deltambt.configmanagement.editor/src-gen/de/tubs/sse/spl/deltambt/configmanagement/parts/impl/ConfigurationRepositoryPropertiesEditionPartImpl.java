/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigmanagementViewsRepository;
import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.ConfigManagementEditorPlugin;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.ConfigmanagementEditor;
import de.tubs.sse.spl.deltambt.configmanagement.presentation.action.CreateConfigurationAction;
import de.tubs.sse.spl.deltambt.configmanagement.providers.ConfigmanagementMessages;



// End of user code	

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class ConfigurationRepositoryPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConfigurationRepositoryPropertiesEditionPart {

	protected Text name;
	protected Text belongToSPL;
	protected EObjectFlatComboViewer linkedToFM;
	protected EMFListEditUtil configsEditUtil;
	protected ReferencesTable<? extends EObject> configs;
	protected List<ViewerFilter> configsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> configsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigurationRepositoryPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ConfigmanagementMessages.ConfigurationRepositoryPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
		createBelongToSPLText(propertiesGroup);
		createLinkedToFMFlatComboViewer(propertiesGroup);
		createConfigsAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConfigmanagementMessages.ConfigurationRepositoryPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ConfigmanagementViewsRepository.ConfigurationRepository.name, ConfigmanagementViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ConfigmanagementViewsRepository.ConfigurationRepository.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.ConfigurationRepository.name, ConfigmanagementViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBelongToSPLText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConfigmanagementMessages.ConfigurationRepositoryPropertiesEditionPart_BelongToSPLLabel, propertiesEditionComponent.isRequired(ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL, ConfigmanagementViewsRepository.SWT_KIND));
		belongToSPL = new Text(parent, SWT.BORDER);
		GridData belongToSPLData = new GridData(GridData.FILL_HORIZONTAL);
		belongToSPL.setLayoutData(belongToSPLData);
		belongToSPL.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, belongToSPL.getText()));
			}

		});
		belongToSPL.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, belongToSPL.getText()));
				}
			}

		});
		EditingUtils.setID(belongToSPL, ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL);
		EditingUtils.setEEFtype(belongToSPL, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL, ConfigmanagementViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param propertiesGroup
	 * 
	 */
	protected void createLinkedToFMFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ConfigmanagementMessages.ConfigurationRepositoryPropertiesEditionPart_LinkedToFMLabel, propertiesEditionComponent.isRequired(ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM, ConfigmanagementViewsRepository.SWT_KIND));
		linkedToFM = new EObjectFlatComboViewer(parent, false);
		linkedToFM.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		linkedToFM.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getLinkedToFM()));
			}

		});
		GridData linkedToFMData = new GridData(GridData.FILL_HORIZONTAL);
		linkedToFM.setLayoutData(linkedToFMData);
		linkedToFM.setID(ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM, ConfigmanagementViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createConfigsAdvancedTableComposition(Composite parent) {
		this.configs = new ReferencesTable<Configuration>(ConfigmanagementMessages.ConfigurationRepositoryPropertiesEditionPart_ConfigsLabel, new ReferencesTableListener<Configuration>() {			
			public void handleAdd() { addToConfigs();}
			public void handleEdit(Configuration element) { editConfigs(element); }
			public void handleMove(Configuration element, int oldIndex, int newIndex) { moveConfigs(element, oldIndex, newIndex); }
			public void handleRemove(Configuration element) { removeFromConfigs(element); }
			public void navigateTo(Configuration element) { }
		});
		this.configs.setHelpText(propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.ConfigurationRepository.configs, ConfigmanagementViewsRepository.SWT_KIND));
		this.configs.createControls(parent);
		GridData configsData = new GridData(GridData.FILL_HORIZONTAL);
		configsData.horizontalSpan = 3;
		this.configs.setLayoutData(configsData);
		this.configs.setLowerBound(0);
		this.configs.setUpperBound(-1);
		configs.setID(ConfigmanagementViewsRepository.ConfigurationRepository.configs);
		configs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveConfigs(Configuration element, int oldIndex, int newIndex) {
		EObject editedElement = configsEditUtil.foundCorrespondingEObject(element);
		configsEditUtil.moveElement(element, oldIndex, newIndex);
		configs.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.configs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToConfigs() {
		ConfigmanagementEditor editor = 
			(ConfigmanagementEditor)ConfigManagementEditorPlugin.getPlugin().getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		IAction act = new Action("Action") {
			@Override
			public void run() {
			}
		};
		
		if(editor != null)
		{
			CreateConfigurationAction action = new CreateConfigurationAction();
			action.setActiveEditor(act, editor);
			action.selectionChanged(act, editor.getSelection());
			action.run(act);
		}
		
		//Old Version
		// Start of user code addToConfigs() method body
//				Configuration eObject = ConfigmanagementFactory.eINSTANCE.createConfiguration();
//				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
//				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
//				if (editionPolicy != null) {
//					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
//					if (propertiesEditionObject != null) {
//						configsEditUtil.addElement(propertiesEditionObject);
//						configs.refresh();
//						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.configs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
//					}
//				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromConfigs(Configuration element) {
		// Start of user code removeFromConfigs() method body
				EObject editedElement = configsEditUtil.foundCorrespondingEObject(element);
				configsEditUtil.removeElement(element);
				configs.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.configs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editConfigs(Configuration element) {
		// Start of user code editConfigs() method body
				EObject editedElement = configsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						configsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						configs.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationRepositoryPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.ConfigurationRepository.configs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getBelongToSPL()
	 * 
	 */
	public String getBelongToSPL() {
		return belongToSPL.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#setBelongToSPL(String newValue)
	 * 
	 */
	public void setBelongToSPL(String newValue) {
		if (newValue != null) {
			belongToSPL.setText(newValue);
		} else {
			belongToSPL.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getLinkedToFM()
	 * 
	 */
	public EObject getLinkedToFM() {
		if (linkedToFM.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) linkedToFM.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#initLinkedToFM(ResourceSet allResources, EObject current)
	 */
	public void initLinkedToFM(ResourceSet allResources, EObject current) {
		linkedToFM.setInput(allResources);
		if (current != null) {
			linkedToFM.setSelection(new StructuredSelection(current));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#setLinkedToFM(EObject newValue)
	 * 
	 */
	public void setLinkedToFM(EObject newValue) {
		if (newValue != null) {
			linkedToFM.setSelection(new StructuredSelection(newValue));
		} else {
			linkedToFM.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#setLinkedToFMButtonMode(ButtonsModeEnum newValue)
	 */
	public void setLinkedToFMButtonMode(ButtonsModeEnum newValue) {
		linkedToFM.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#addFilterLinkedToFM(ViewerFilter filter)
	 * 
	 */
	public void addFilterToLinkedToFM(ViewerFilter filter) {
		linkedToFM.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#addBusinessFilterLinkedToFM(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToLinkedToFM(ViewerFilter filter) {
		linkedToFM.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getConfigsToAdd()
	 * 
	 */
	public List getConfigsToAdd() {
		return configsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getConfigsToRemove()
	 * 
	 */
	public List getConfigsToRemove() {
		return configsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getConfigsToEdit()
	 * 
	 */
	public Map getConfigsToEdit() {
		return configsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getConfigsToMove()
	 * 
	 */
	public List getConfigsToMove() {
		return configsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#getConfigsTable()
	 * 
	 */
	public List getConfigsTable() {
		return configsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#initConfigs(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initConfigs(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			configsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			configsEditUtil = new EMFListEditUtil(current, feature);
		this.configs.setInput(configsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#updateConfigs(EObject newValue)
	 * 
	 */
	public void updateConfigs(EObject newValue) {
		if(configsEditUtil != null){
			configsEditUtil.reinit(newValue);
			configs.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#addFilterConfigs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToConfigs(ViewerFilter filter) {
		configsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#addBusinessFilterConfigs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToConfigs(ViewerFilter filter) {
		configsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart#isContainedInConfigsTable(EObject element)
	 * 
	 */
	public boolean isContainedInConfigsTable(EObject element) {
		return configsEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConfigmanagementMessages.ConfigurationRepository_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
