/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelFactory;
import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;
import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart;
import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturemodelViewsRepository;
import de.tubs.sse.spl.deltambt.featuremodel.providers.FeaturemodelMessages;


// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class FeaturePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, FeaturePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer type;
	protected Text description;
	protected EMFListEditUtil subEditUtil;
		protected ReferencesTable<? extends EObject> sub;
		protected List<ViewerFilter> subBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> subFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil orEditUtil;
		protected ReferencesTable<? extends EObject> or;
		protected List<ViewerFilter> orBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> orFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil alternativeEditUtil;
		protected ReferencesTable<? extends EObject> alternative;
		protected List<ViewerFilter> alternativeBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> alternativeFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil requireEditUtil;
		protected ReferencesTable<? extends EObject> require;
		protected List<ViewerFilter> requireBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> requireFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil excludeEditUtil;
		protected ReferencesTable<? extends EObject> exclude;
		protected List<ViewerFilter> excludeBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> excludeFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil interactWithEditUtil;
		protected ReferencesTable<? extends EObject> interactWith;
		protected List<ViewerFilter> interactWithBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> interactWithFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public FeaturePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(FeaturemodelMessages.FeaturePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(widgetFactory, propertiesGroup);
		createTypeEMFComboViewer(widgetFactory, propertiesGroup);
		createDescriptionTextarea(widgetFactory, propertiesGroup);
		createSubTableComposition(widgetFactory, propertiesGroup);
		createOrTableComposition(widgetFactory, propertiesGroup);
		createAlternativeTableComposition(widgetFactory, propertiesGroup);
		createRequireReferencesTable(widgetFactory, propertiesGroup);
		createExcludeReferencesTable(widgetFactory, propertiesGroup);
		createInteractWithReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, FeaturemodelMessages.FeaturePropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(FeaturemodelViewsRepository.Feature.name, FeaturemodelViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, FeaturemodelViewsRepository.Feature.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.name, FeaturemodelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, FeaturemodelMessages.FeaturePropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(FeaturemodelViewsRepository.Feature.type, FeaturemodelViewsRepository.FORM_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(FeaturemodelViewsRepository.Feature.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.type, FeaturemodelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionTextarea(FormToolkit widgetFactory, Composite parent) {
		Label descriptionLabel = FormUtils.createPartLabel(widgetFactory, parent, FeaturemodelMessages.FeaturePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(FeaturemodelViewsRepository.Feature.description, FeaturemodelViewsRepository.FORM_KIND));
		GridData descriptionLabelData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionLabelData.horizontalSpan = 3;
		descriptionLabel.setLayoutData(descriptionLabelData);
		description = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		descriptionData.horizontalSpan = 2;
		descriptionData.heightHint = 80;
		descriptionData.widthHint = 200;
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		EditingUtils.setID(description, FeaturemodelViewsRepository.Feature.description);
		EditingUtils.setEEFtype(description, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.description, FeaturemodelViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSubTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.sub = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_SubLabel, new ReferencesTableListener<Feature>() {			
			public void handleAdd() { addToSub();}
			public void handleEdit(Feature element) { editSub(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveSub(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromSub(element); }
			public void navigateTo(Feature element) { }
		});
		this.sub.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.sub, FeaturemodelViewsRepository.FORM_KIND));
		this.sub.createControls(parent, widgetFactory);
		GridData subData = new GridData(GridData.FILL_HORIZONTAL);
		subData.horizontalSpan = 3;
		this.sub.setLayoutData(subData);
		this.sub.setLowerBound(0);
		this.sub.setUpperBound(-1);
		sub.setID(FeaturemodelViewsRepository.Feature.sub);
		sub.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSub(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = subEditUtil.foundCorrespondingEObject(element);
		subEditUtil.moveElement(element, oldIndex, newIndex);
		sub.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.sub, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToSub() {
		// Start of user code addToSub() method body
				Feature eObject = FeaturemodelFactory.eINSTANCE.createFeature();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						subEditUtil.addElement(propertiesEditionObject);
						sub.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.sub, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromSub(Feature element) {
		// Start of user code for the removeFromSub() method body
				EObject editedElement = subEditUtil.foundCorrespondingEObject(element);
				subEditUtil.removeElement(element);
				sub.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.sub, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editSub(Feature element) {
		// Start of user code editSub() method body
				EObject editedElement = subEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						subEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						sub.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.sub, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createOrTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.or = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_OrLabel, new ReferencesTableListener<Feature>() {			
			public void handleAdd() { addToOr();}
			public void handleEdit(Feature element) { editOr(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveOr(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromOr(element); }
			public void navigateTo(Feature element) { }
		});
		this.or.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.or, FeaturemodelViewsRepository.FORM_KIND));
		this.or.createControls(parent, widgetFactory);
		GridData orData = new GridData(GridData.FILL_HORIZONTAL);
		orData.horizontalSpan = 3;
		this.or.setLayoutData(orData);
		this.or.setLowerBound(0);
		this.or.setUpperBound(-1);
		or.setID(FeaturemodelViewsRepository.Feature.or);
		or.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveOr(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = orEditUtil.foundCorrespondingEObject(element);
		orEditUtil.moveElement(element, oldIndex, newIndex);
		or.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.or, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToOr() {
		// Start of user code addToOr() method body
				Feature eObject = FeaturemodelFactory.eINSTANCE.createFeature();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						orEditUtil.addElement(propertiesEditionObject);
						or.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.or, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromOr(Feature element) {
		// Start of user code for the removeFromOr() method body
				EObject editedElement = orEditUtil.foundCorrespondingEObject(element);
				orEditUtil.removeElement(element);
				or.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.or, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editOr(Feature element) {
		// Start of user code editOr() method body
				EObject editedElement = orEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						orEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						or.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.or, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAlternativeTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.alternative = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_AlternativeLabel, new ReferencesTableListener<Feature>() {			
			public void handleAdd() { addToAlternative();}
			public void handleEdit(Feature element) { editAlternative(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveAlternative(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromAlternative(element); }
			public void navigateTo(Feature element) { }
		});
		this.alternative.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.alternative, FeaturemodelViewsRepository.FORM_KIND));
		this.alternative.createControls(parent, widgetFactory);
		GridData alternativeData = new GridData(GridData.FILL_HORIZONTAL);
		alternativeData.horizontalSpan = 3;
		this.alternative.setLayoutData(alternativeData);
		this.alternative.setLowerBound(0);
		this.alternative.setUpperBound(-1);
		alternative.setID(FeaturemodelViewsRepository.Feature.alternative);
		alternative.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAlternative(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = alternativeEditUtil.foundCorrespondingEObject(element);
		alternativeEditUtil.moveElement(element, oldIndex, newIndex);
		alternative.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.alternative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAlternative() {
		// Start of user code addToAlternative() method body
				Feature eObject = FeaturemodelFactory.eINSTANCE.createFeature();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						alternativeEditUtil.addElement(propertiesEditionObject);
						alternative.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.alternative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAlternative(Feature element) {
		// Start of user code for the removeFromAlternative() method body
				EObject editedElement = alternativeEditUtil.foundCorrespondingEObject(element);
				alternativeEditUtil.removeElement(element);
				alternative.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.alternative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAlternative(Feature element) {
		// Start of user code editAlternative() method body
				EObject editedElement = alternativeEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						alternativeEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						alternative.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.alternative, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createRequireReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.require = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_RequireLabel, new ReferencesTableListener<Feature>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Feature> dialog = new TabElementTreeSelectionDialog<Feature>(resourceSet, requireFilters, requireBusinessFilters,
				"Feature", FeaturemodelPackage.eINSTANCE.getFeature(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!requireEditUtil.getVirtualList().contains(elem))
								requireEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.require,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						require.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Feature element) { editRequire(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveRequire(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromRequire(element); }
			public void navigateTo(Feature element) { }
		});
		this.require.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.require, FeaturemodelViewsRepository.FORM_KIND));
		this.require.createControls(parent, widgetFactory);
		GridData requireData = new GridData(GridData.FILL_HORIZONTAL);
		requireData.horizontalSpan = 3;
		this.require.setLayoutData(requireData);
		this.require.disableMove();
		require.setID(FeaturemodelViewsRepository.Feature.require);
		require.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveRequire(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = requireEditUtil.foundCorrespondingEObject(element);
		requireEditUtil.moveElement(element, oldIndex, newIndex);
		require.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.require, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromRequire(Feature element) {
		// Start of user code for the removeFromRequire() method body
				EObject editedElement = requireEditUtil.foundCorrespondingEObject(element);
				requireEditUtil.removeElement(element);
				require.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.require, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editRequire(Feature element) {
		// Start of user code editRequire() method body		
				EObject editedElement = requireEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						requireEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						require.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.require, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createExcludeReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.exclude = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_ExcludeLabel, new ReferencesTableListener<Feature>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Feature> dialog = new TabElementTreeSelectionDialog<Feature>(resourceSet, excludeFilters, excludeBusinessFilters,
				"Feature", FeaturemodelPackage.eINSTANCE.getFeature(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!excludeEditUtil.getVirtualList().contains(elem))
								excludeEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.exclude,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						exclude.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Feature element) { editExclude(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveExclude(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromExclude(element); }
			public void navigateTo(Feature element) { }
		});
		this.exclude.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.exclude, FeaturemodelViewsRepository.FORM_KIND));
		this.exclude.createControls(parent, widgetFactory);
		GridData excludeData = new GridData(GridData.FILL_HORIZONTAL);
		excludeData.horizontalSpan = 3;
		this.exclude.setLayoutData(excludeData);
		this.exclude.disableMove();
		exclude.setID(FeaturemodelViewsRepository.Feature.exclude);
		exclude.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveExclude(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = excludeEditUtil.foundCorrespondingEObject(element);
		excludeEditUtil.moveElement(element, oldIndex, newIndex);
		exclude.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.exclude, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromExclude(Feature element) {
		// Start of user code for the removeFromExclude() method body
				EObject editedElement = excludeEditUtil.foundCorrespondingEObject(element);
				excludeEditUtil.removeElement(element);
				exclude.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.exclude, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editExclude(Feature element) {
		// Start of user code editExclude() method body		
				EObject editedElement = excludeEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						excludeEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						exclude.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.exclude, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createInteractWithReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.interactWith = new ReferencesTable<Feature>(FeaturemodelMessages.FeaturePropertiesEditionPart_InteractWithLabel, new ReferencesTableListener<Feature>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Feature> dialog = new TabElementTreeSelectionDialog<Feature>(resourceSet, interactWithFilters, interactWithBusinessFilters,
				"Feature", FeaturemodelPackage.eINSTANCE.getFeature(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!interactWithEditUtil.getVirtualList().contains(elem))
								interactWithEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.interactWith,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						interactWith.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Feature element) { editInteractWith(element); }
			public void handleMove(Feature element, int oldIndex, int newIndex) { moveInteractWith(element, oldIndex, newIndex); }
			public void handleRemove(Feature element) { removeFromInteractWith(element); }
			public void navigateTo(Feature element) { }
		});
		this.interactWith.setHelpText(propertiesEditionComponent.getHelpContent(FeaturemodelViewsRepository.Feature.interactWith, FeaturemodelViewsRepository.FORM_KIND));
		this.interactWith.createControls(parent, widgetFactory);
		GridData interactWithData = new GridData(GridData.FILL_HORIZONTAL);
		interactWithData.horizontalSpan = 3;
		this.interactWith.setLayoutData(interactWithData);
		this.interactWith.disableMove();
		interactWith.setID(FeaturemodelViewsRepository.Feature.interactWith);
		interactWith.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveInteractWith(Feature element, int oldIndex, int newIndex) {
		EObject editedElement = interactWithEditUtil.foundCorrespondingEObject(element);
		interactWithEditUtil.moveElement(element, oldIndex, newIndex);
		interactWith.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.interactWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromInteractWith(Feature element) {
		// Start of user code for the removeFromInteractWith() method body
				EObject editedElement = interactWithEditUtil.foundCorrespondingEObject(element);
				interactWithEditUtil.removeElement(element);
				interactWith.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.interactWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editInteractWith(Feature element) {
		// Start of user code editInteractWith() method body		
				EObject editedElement = interactWithEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						interactWithEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						interactWith.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(FeaturePropertiesEditionPartForm.this, FeaturemodelViewsRepository.Feature.interactWith, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#setName(String newValue)
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
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getSubToAdd()
	 * 
	 */
	public List getSubToAdd() {
		return subEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getSubToRemove()
	 * 
	 */
	public List getSubToRemove() {
		return subEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getSubToEdit()
	 * 
	 */
	public Map getSubToEdit() {
		return subEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getSubToMove()
	 * 
	 */
	public List getSubToMove() {
		return subEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getSubTable()
	 * 
	 */
	public List getSubTable() {
		return subEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initSub(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initSub(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			subEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			subEditUtil = new EMFListEditUtil(current, feature);
		this.sub.setInput(subEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateSub(EObject newValue)
	 * 
	 */
	public void updateSub(EObject newValue) {
		if(subEditUtil != null){
			subEditUtil.reinit(newValue);
			sub.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterSub(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSub(ViewerFilter filter) {
		subFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterSub(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSub(ViewerFilter filter) {
		subBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInSubTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubTable(EObject element) {
		return subEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getOrToAdd()
	 * 
	 */
	public List getOrToAdd() {
		return orEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getOrToRemove()
	 * 
	 */
	public List getOrToRemove() {
		return orEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getOrToEdit()
	 * 
	 */
	public Map getOrToEdit() {
		return orEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getOrToMove()
	 * 
	 */
	public List getOrToMove() {
		return orEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getOrTable()
	 * 
	 */
	public List getOrTable() {
		return orEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initOr(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initOr(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			orEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			orEditUtil = new EMFListEditUtil(current, feature);
		this.or.setInput(orEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateOr(EObject newValue)
	 * 
	 */
	public void updateOr(EObject newValue) {
		if(orEditUtil != null){
			orEditUtil.reinit(newValue);
			or.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterOr(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOr(ViewerFilter filter) {
		orFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterOr(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOr(ViewerFilter filter) {
		orBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInOrTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrTable(EObject element) {
		return orEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getAlternativeToAdd()
	 * 
	 */
	public List getAlternativeToAdd() {
		return alternativeEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getAlternativeToRemove()
	 * 
	 */
	public List getAlternativeToRemove() {
		return alternativeEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getAlternativeToEdit()
	 * 
	 */
	public Map getAlternativeToEdit() {
		return alternativeEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getAlternativeToMove()
	 * 
	 */
	public List getAlternativeToMove() {
		return alternativeEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getAlternativeTable()
	 * 
	 */
	public List getAlternativeTable() {
		return alternativeEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initAlternative(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initAlternative(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			alternativeEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			alternativeEditUtil = new EMFListEditUtil(current, feature);
		this.alternative.setInput(alternativeEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateAlternative(EObject newValue)
	 * 
	 */
	public void updateAlternative(EObject newValue) {
		if(alternativeEditUtil != null){
			alternativeEditUtil.reinit(newValue);
			alternative.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterAlternative(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAlternative(ViewerFilter filter) {
		alternativeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterAlternative(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAlternative(ViewerFilter filter) {
		alternativeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInAlternativeTable(EObject element)
	 * 
	 */
	public boolean isContainedInAlternativeTable(EObject element) {
		return alternativeEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getRequireToAdd()
	 * 
	 */
	public List getRequireToAdd() {
		return requireEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getRequireToRemove()
	 * 
	 */
	public List getRequireToRemove() {
		return requireEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getRequireTable()
	 * 
	 */
	public List getRequireTable() {
		return requireEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initRequire(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initRequire(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			requireEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			requireEditUtil = new EMFListEditUtil(current, feature);
		this.require.setInput(requireEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateRequire(EObject newValue)
	 * 
	 */
	public void updateRequire(EObject newValue) {
		if(requireEditUtil != null){
			requireEditUtil.reinit(newValue);
			require.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterRequire(ViewerFilter filter)
	 * 
	 */
	public void addFilterToRequire(ViewerFilter filter) {
		requireFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterRequire(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToRequire(ViewerFilter filter) {
		requireBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInRequireTable(EObject element)
	 * 
	 */
	public boolean isContainedInRequireTable(EObject element) {
		return requireEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getExcludeToAdd()
	 * 
	 */
	public List getExcludeToAdd() {
		return excludeEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getExcludeToRemove()
	 * 
	 */
	public List getExcludeToRemove() {
		return excludeEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getExcludeTable()
	 * 
	 */
	public List getExcludeTable() {
		return excludeEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initExclude(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initExclude(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			excludeEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			excludeEditUtil = new EMFListEditUtil(current, feature);
		this.exclude.setInput(excludeEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateExclude(EObject newValue)
	 * 
	 */
	public void updateExclude(EObject newValue) {
		if(excludeEditUtil != null){
			excludeEditUtil.reinit(newValue);
			exclude.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterExclude(ViewerFilter filter)
	 * 
	 */
	public void addFilterToExclude(ViewerFilter filter) {
		excludeFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterExclude(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToExclude(ViewerFilter filter) {
		excludeBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInExcludeTable(EObject element)
	 * 
	 */
	public boolean isContainedInExcludeTable(EObject element) {
		return excludeEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getInteractWithToAdd()
	 * 
	 */
	public List getInteractWithToAdd() {
		return interactWithEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getInteractWithToRemove()
	 * 
	 */
	public List getInteractWithToRemove() {
		return interactWithEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#getInteractWithTable()
	 * 
	 */
	public List getInteractWithTable() {
		return interactWithEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#initInteractWith(EObject current, EReference containingFeature, EReference feature)
	 */
	@SuppressWarnings("unchecked")
	public void initInteractWith(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			interactWithEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			interactWithEditUtil = new EMFListEditUtil(current, feature);
		this.interactWith.setInput(interactWithEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#updateInteractWith(EObject newValue)
	 * 
	 */
	public void updateInteractWith(EObject newValue) {
		if(interactWithEditUtil != null){
			interactWithEditUtil.reinit(newValue);
			interactWith.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addFilterInteractWith(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInteractWith(ViewerFilter filter) {
		interactWithFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#addBusinessFilterInteractWith(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInteractWith(ViewerFilter filter) {
		interactWithBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart#isContainedInInteractWithTable(EObject element)
	 * 
	 */
	public boolean isContainedInInteractWithTable(EObject element) {
		return interactWithEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return FeaturemodelMessages.Feature_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
