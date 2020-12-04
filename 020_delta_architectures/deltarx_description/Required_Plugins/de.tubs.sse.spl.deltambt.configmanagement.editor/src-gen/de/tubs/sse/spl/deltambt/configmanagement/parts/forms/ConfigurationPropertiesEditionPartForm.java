/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

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
public class ConfigurationPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ConfigurationPropertiesEditionPart {

	protected Text name;
	private EMFListEditUtil featuresEditUtil;
		protected ReferencesTable<? extends EObject> features;
		protected List<ViewerFilter> featuresBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> featuresFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigurationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ConfigmanagementMessages.ConfigurationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(widgetFactory, propertiesGroup);
		createFeaturesReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ConfigmanagementMessages.ConfigurationPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ConfigmanagementViewsRepository.Configuration.name, ConfigmanagementViewsRepository.FORM_KIND));
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ConfigmanagementViewsRepository.Configuration.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.Configuration.name, ConfigmanagementViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void createFeaturesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.features = new ReferencesTable<Feature>(ConfigmanagementMessages.ConfigurationPropertiesEditionPart_FeaturesLabel, new ReferencesTableListener<Feature>() {
			public void handleAdd() {
				// No Adding of features without edit dialog
//				TabElementTreeSelectionDialog<Feature> dialog = new TabElementTreeSelectionDialog<Feature>(resourceSet, featuresFilters, featuresBusinessFilters,
//				"Feature", FeaturemodelPackage.eINSTANCE.getFeature(), current.eResource()) {
//					@Override
//					public void process(IStructuredSelection selection) {
//						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
//							EObject elem = (EObject) iter.next();
//							if (!featuresEditUtil.getVirtualList().contains(elem))
//								featuresEditUtil.addElement(elem);
//							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.features,
//								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
//						}
//						features.refresh();
//					}
//				};
//				dialog.open();
			}
			public void handleEdit(Feature element) { } //No editing of Features  editFeatures(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveFeatures(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { } //No removing of element from Configuration removeFromFeatures(element); }
			public void navigateTo(Feature element) { }
		});
		this.features.setHelpText(propertiesEditionComponent.getHelpContent(ConfigmanagementViewsRepository.Configuration.features, ConfigmanagementViewsRepository.FORM_KIND));
		this.features.createControls(parent, widgetFactory);
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	//No removing of features from Configuration
//	/**
//	 * 
//	 */
//	protected void removeFromFeatures(Feature element) {
//		// Start of user code for the removeFromFeatures() method body
//				EObject editedElement = featuresEditUtil.foundCorrespondingEObject(element);
//				featuresEditUtil.removeElement(element);
//				features.refresh();
//				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
//		
//		// End of user code
//	}

	// No editing of referenced Features
//	/**
//	 * 
//	 */
//	protected void editFeatures(Feature element) {
//		// Start of user code editFeatures() method body		
//				EObject editedElement = featuresEditUtil.foundCorrespondingEObject(element);
//				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
//				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
//				if (editionPolicy != null) {
//					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
//					if (propertiesEditionObject != null) {
//						featuresEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
//						features.refresh();
//						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigurationPropertiesEditionPartForm.this, ConfigmanagementViewsRepository.Configuration.features, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
//					}
//				}
//		
//		// End of user code
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
