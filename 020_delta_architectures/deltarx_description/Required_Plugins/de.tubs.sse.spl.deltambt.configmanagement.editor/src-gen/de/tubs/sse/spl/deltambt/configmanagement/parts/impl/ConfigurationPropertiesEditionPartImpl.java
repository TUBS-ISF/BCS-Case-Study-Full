/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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

import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigmanagementViewsRepository;
import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart;
import de.tubs.sse.spl.deltambt.configmanagement.providers.ConfigmanagementMessages;
import de.tubs.sse.spl.deltambt.featuremodel.Feature;



// End of user code	

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class ConfigurationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConfigurationPropertiesEditionPart {

	protected Text name;
	protected EMFListEditUtil featuresEditUtil;
	protected ReferencesTable<? extends EObject> features;
	protected List<ViewerFilter> featuresBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> featuresFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigurationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(ConfigmanagementMessages.ConfigurationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
		createFeaturesAdvancedReferencesTable(propertiesGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ConfigmanagementMessages.ConfigurationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ConfigmanagementViewsRepository.Configuration.name, ConfigmanagementViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ConfigmanagementViewsRepository.Configuration.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.Configuration.name, ConfigmanagementViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void createFeaturesAdvancedReferencesTable(Composite parent) {
		this.features = new ReferencesTable<Feature>(ConfigmanagementMessages.ConfigurationPropertiesEditionPart_FeaturesLabel, new ReferencesTableListener<Feature>() {
			public void handleAdd() {
				//No adding of features without editing dialog
//				TabElementTreeSelectionDialog<Feature> dialog = new TabElementTreeSelectionDialog<Feature>(resourceSet, featuresFilters, featuresBusinessFilters,
//				"Feature", FeaturemodelPackage.eINSTANCE.getFeature(), current.eResource()) {
//
//					public void process(IStructuredSelection selection) {
//						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
//							EObject elem = (EObject) iter.next();
//							if (!featuresEditUtil.getVirtualList().contains(elem))
//								featuresEditUtil.addElement(elem);
//							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.features,
//								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
//						}
//						features.refresh();
//					}
//
//				};
//				dialog.open();
			}
			public void handleEdit(Feature element) { }//No editing of referenced Features editFeatures(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveFeatures(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { } //No removing of Features from a configuration: removeFromFeatures(element); }
			public void navigateTo(Feature element) { }
		});
		this.features.setHelpText(propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.Configuration.features, ConfigmanagementViewsRepository.SWT_KIND));
		this.features.createControls(parent);
		GridData featuresData = new GridData(GridData.FILL_HORIZONTAL);
		featuresData.horizontalSpan = 3;
		this.features.setLayoutData(featuresData);
		this.features.disableMove();
		features.setID(ConfigmanagementViewsRepository.Configuration.features);
		features.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveFeatures(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = featuresEditUtil.foundCorrespondingEObject(element);
		featuresEditUtil.moveElement(element, oldIndex, newIndex);
		features.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	//No removing of Features from a Configuration
//	/**
//	 * 
//	 */
//	protected void removeFromFeatures(Feature element) {
//
//		// Start of user code removeFromFeatures() method body
//				EObject editedElement = featuresEditUtil.foundCorrespondingEObject(element);
//				featuresEditUtil.removeElement(element);
//				features.refresh();
//				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
//				
//		// End of user code
//
//	}

	//No editing of referenced Features
//	/**
//	 * 
//	 */
//	protected void editFeatures(Feature element) {
//
//		// Start of user code editFeatures() method body
//				EObject editedElement = featuresEditUtil.foundCorrespondingEObject(element);
//				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
//				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
//				if (editionPolicy != null) {
//					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
//					if (propertiesEditionObject != null) {
//						featuresEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
//						features.refresh();
//						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartImpl.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
//					}
//				}
//				
//		// End of user code
//
//	}



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
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#setName(String newValue)
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
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#getFeaturesToAdd()
	 * 
	 */
	public List getFeaturesToAdd() {
		return featuresEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#getFeaturesToRemove()
	 * 
	 */
	public List getFeaturesToRemove() {
		return featuresEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#getFeaturesTable()
	 * 
	 */
	public List getFeaturesTable() {
		return featuresEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#initFeatures(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initFeatures(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			featuresEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			featuresEditUtil = new EMFListEditUtil(current, feature);
		this.features.setInput(featuresEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#updateFeatures(EObject newValue)
	 * 
	 */
	public void updateFeatures(EObject newValue) {
		if(featuresEditUtil != null){
			featuresEditUtil.reinit(newValue);
			features.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#addFilterFeatures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFeatures(ViewerFilter filter) {
		featuresFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#addBusinessFilterFeatures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFeatures(ViewerFilter filter) {
		featuresBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationPropertiesEditionPart#isContainedInFeaturesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFeaturesTable(EObject element) {
		return featuresEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ConfigmanagementMessages.Configuration_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
