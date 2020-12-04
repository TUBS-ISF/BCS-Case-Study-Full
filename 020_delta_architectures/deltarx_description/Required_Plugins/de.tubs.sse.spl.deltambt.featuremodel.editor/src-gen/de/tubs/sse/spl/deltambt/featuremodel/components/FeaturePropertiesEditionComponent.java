/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.featuremodel.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.tubs.sse.spl.deltambt.featuremodel.EFeatureType;
import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;
import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturePropertiesEditionPart;
import de.tubs.sse.spl.deltambt.featuremodel.parts.FeaturemodelViewsRepository;
	

// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class FeaturePropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private Feature feature;

	/**
	 * The Base part
	 * 
	 */
	protected FeaturePropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public FeaturePropertiesEditionComponent(EObject feature, String editing_mode) {
		if (feature instanceof Feature) {
			this.feature = (Feature)feature;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.feature.eAdapters().add(semanticAdapter);
			}
		}
		this.editing_mode = editing_mode;
	}

	/**
	 * Initialize the semantic model listener for live editing mode
	 * 
	 * @return the semantic model listener
	 * 
	 */
	private AdapterImpl initializeSemanticAdapter() {
		return new EContentAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#notifyChanged(org.eclipse.emf.common.notify.Notification)
			 * 
			 */
			public void notifyChanged(final Notification msg) {
				if (basePart == null)
					FeaturePropertiesEditionComponent.this.dispose();
				else {
					Runnable updateRunnable = new Runnable() {
						public void run() {
							runUpdateRunnable(msg);
						}
					};
					if (null == Display.getCurrent()) {
						PlatformUI.getWorkbench().getDisplay().syncExec(updateRunnable);
					} else {
						updateRunnable.run();
					}
				}
			}

		};
	}

	/**
	 * Used to update the views
	 * 
	 */
	protected void runUpdateRunnable(final Notification msg) {
		if (FeaturemodelPackage.eINSTANCE.getFeature_Name().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setName("");
			}
		}
		if (FeaturemodelPackage.eINSTANCE.getFeature_Type().equals(msg.getFeature()) && basePart != null)
			basePart.setType((Enumerator)msg.getNewValue());

		if (FeaturemodelPackage.eINSTANCE.getFeature_Description().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setDescription("");
			}
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == FeaturemodelPackage.eINSTANCE.getFeature_Or())) {
			basePart.updateOr(feature);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == FeaturemodelPackage.eINSTANCE.getFeature_Alternative())) {
			basePart.updateAlternative(feature);
		}
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == FeaturemodelPackage.eINSTANCE.getFeature_Sub())) {
			basePart.updateSub(feature);
		}
		if (FeaturemodelPackage.eINSTANCE.getFeature_Exclude().equals(msg.getFeature()))
			basePart.updateExclude(feature);
		if (FeaturemodelPackage.eINSTANCE.getFeature_Require().equals(msg.getFeature()))
			basePart.updateRequire(feature);
		if (FeaturemodelPackage.eINSTANCE.getFeature_Interact().equals(msg.getFeature()))
			basePart.updateInteractWith(feature);

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return FeaturemodelViewsRepository.Feature.class;
		return super.translatePart(key);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#partsList()
	 * 
	 */
	public String[] partsList() {
		return parts;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionPart
	 *  (java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(int kind, String key) {
		if (feature != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(FeaturemodelViewsRepository.class);
				if (provider != null) {
					basePart = (FeaturePropertiesEditionPart)provider.getPropertiesEditionPart(FeaturemodelViewsRepository.Feature.class, kind, this);
					addListener((IPropertiesEditionListener)basePart);
				}
			}
			return (IPropertiesEditionPart)basePart;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#
	 *      setPropertiesEditionPart(java.lang.Class, int, org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart)
	 * 
	 */
	public void setPropertiesEditionPart(java.lang.Class key, int kind, IPropertiesEditionPart propertiesEditionPart) {
		if (key == FeaturemodelViewsRepository.Feature.class)
			this.basePart = (FeaturePropertiesEditionPart) propertiesEditionPart;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Class, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(java.lang.Class key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (basePart != null && key == FeaturemodelViewsRepository.Feature.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final Feature feature = (Feature)elt;
			// init values
			if (feature.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), feature.getName()));

			basePart.initType((EEnum) FeaturemodelPackage.eINSTANCE.getFeature_Type().getEType(), feature.getType());
			if (feature.getDescription() != null)
				basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), feature.getDescription()));
			basePart.initOr(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Or());
			basePart.initAlternative(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Alternative());
			basePart.initSub(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Sub());
			basePart.initExclude(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Exclude());
			basePart.initRequire(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Require());
			basePart.initInteractWith(feature, null, FeaturemodelPackage.eINSTANCE.getFeature_Interact());
			// init filters



			basePart.addFilterToOr(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Feature); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for or
			
			// End of user code

			basePart.addFilterToAlternative(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Feature); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for alternative
			
			// End of user code

			basePart.addFilterToSub(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Feature); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for sub
			
			// End of user code

			basePart.addFilterToExclude(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInExcludeTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToExclude(new EObjectFilter(FeaturemodelPackage.eINSTANCE.getFeature()));
			// Start of user code for additional businessfilters for exclude
			
			// End of user code

			basePart.addFilterToRequire(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInRequireTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToRequire(new EObjectFilter(FeaturemodelPackage.eINSTANCE.getFeature()));
			// Start of user code for additional businessfilters for require
			
			// End of user code

			basePart.addFilterToInteractWith(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInInteractWithTable((EObject)element));
					return element instanceof Resource;
				}

			});
			basePart.addFilterToInteractWith(new EObjectFilter(FeaturemodelPackage.eINSTANCE.getFeature()));
			// Start of user code for additional businessfilters for interact
			
			// End of user code

		}
		// init values for referenced views

		// init filters for referenced views

		setInitializing(false);
	}












	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionCommand
	 *     (org.eclipse.emf.edit.domain.EditingDomain)
	 * 
	 */
	public CompoundCommand getPropertiesEditionCommand(EditingDomain editingDomain) {
		CompoundCommand cc = new CompoundCommand();
		if ((feature != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName())));
			cc.append(SetCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Type(), basePart.getType()));

			cc.append(SetCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Description(), EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getDescription())));
			List orToAddFromOr = basePart.getOrToAdd();
			for (Iterator iter = orToAddFromOr.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Or(), iter.next()));
			Map orToRefreshFromOr = basePart.getOrToEdit();
			for (Iterator iter = orToRefreshFromOr.keySet().iterator(); iter.hasNext();) {
				Feature nextElement = (Feature) iter.next();
				Feature or = (Feature) orToRefreshFromOr.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, or.eGet(feature)));
					}
				}
			}
			List orToRemoveFromOr = basePart.getOrToRemove();
			for (Iterator iter = orToRemoveFromOr.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List orToMoveFromOr = basePart.getOrToMove();
			for (Iterator iter = orToMoveFromOr.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			}
			List alternativeToAddFromAlternative = basePart.getAlternativeToAdd();
			for (Iterator iter = alternativeToAddFromAlternative.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Alternative(), iter.next()));
			Map alternativeToRefreshFromAlternative = basePart.getAlternativeToEdit();
			for (Iterator iter = alternativeToRefreshFromAlternative.keySet().iterator(); iter.hasNext();) {
				Feature nextElement = (Feature) iter.next();
				Feature alternative = (Feature) alternativeToRefreshFromAlternative.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, alternative.eGet(feature)));
					}
				}
			}
			List alternativeToRemoveFromAlternative = basePart.getAlternativeToRemove();
			for (Iterator iter = alternativeToRemoveFromAlternative.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List alternativeToMoveFromAlternative = basePart.getAlternativeToMove();
			for (Iterator iter = alternativeToMoveFromAlternative.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			}
			List subToAddFromSub = basePart.getSubToAdd();
			for (Iterator iter = subToAddFromSub.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Sub(), iter.next()));
			Map subToRefreshFromSub = basePart.getSubToEdit();
			for (Iterator iter = subToRefreshFromSub.keySet().iterator(); iter.hasNext();) {
				Feature nextElement = (Feature) iter.next();
				Feature sub = (Feature) subToRefreshFromSub.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, sub.eGet(feature)));
					}
				}
			}
			List subToRemoveFromSub = basePart.getSubToRemove();
			for (Iterator iter = subToRemoveFromSub.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List subToMoveFromSub = basePart.getSubToMove();
			for (Iterator iter = subToMoveFromSub.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			}
			List excludeToAddFromExclude = basePart.getExcludeToAdd();
			for (Iterator iter = excludeToAddFromExclude.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Exclude(), iter.next()));
			List excludeToRemoveFromExclude = basePart.getExcludeToRemove();
			for (Iterator iter = excludeToRemoveFromExclude.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Exclude(), iter.next()));
			//List excludeToMoveFromExclude = basePart.getExcludeToMove();
			//for (Iterator iter = excludeToMoveFromExclude.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List requireToAddFromRequire = basePart.getRequireToAdd();
			for (Iterator iter = requireToAddFromRequire.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Require(), iter.next()));
			List requireToRemoveFromRequire = basePart.getRequireToRemove();
			for (Iterator iter = requireToRemoveFromRequire.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Require(), iter.next()));
			//List requireToMoveFromRequire = basePart.getRequireToMove();
			//for (Iterator iter = requireToMoveFromRequire.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			//}
			List interactToAddFromInteractWith = basePart.getInteractWithToAdd();
			for (Iterator iter = interactToAddFromInteractWith.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Interact(), iter.next()));
			List interactToRemoveFromInteractWith = basePart.getInteractWithToRemove();
			for (Iterator iter = interactToRemoveFromInteractWith.iterator(); iter.hasNext();)
				cc.append(RemoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Interact(), iter.next()));
			//List interactToMoveFromInteractWith = basePart.getInteractWithToMove();
			//for (Iterator iter = interactToMoveFromInteractWith.iterator(); iter.hasNext();){
			//	org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
			//	cc.append(MoveCommand.create(editingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), moveElement.getElement(), moveElement.getIndex()));
			//}

		}
		if (!cc.isEmpty())
			return cc;
		cc.append(IdentityCommand.INSTANCE);
		return cc;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getPropertiesEditionObject()
	 * 
	 */
	@SuppressWarnings("unchecked")
	public EObject getPropertiesEditionObject(EObject source) {
		if (source instanceof Feature) {
			Feature featureToUpdate = (Feature)source;
			featureToUpdate.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName()));

			featureToUpdate.setType((EFeatureType)basePart.getType());

			featureToUpdate.setDescription((java.lang.String)EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getDescription()));
			featureToUpdate.getOr().addAll(basePart.getOrToAdd());
			featureToUpdate.getAlternative().addAll(basePart.getAlternativeToAdd());
			featureToUpdate.getSub().addAll(basePart.getSubToAdd());
			featureToUpdate.getExclude().addAll(basePart.getExcludeToAdd());
			featureToUpdate.getRequire().addAll(basePart.getRequireToAdd());
			featureToUpdate.getInteract().addAll(basePart.getInteractWithToAdd());

			return featureToUpdate;
		}
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		if (!isInitializing()) {
			Diagnostic valueDiagnostic = validateValue(event);
			if (PropertiesEditionEvent.COMMIT == event.getState() && IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode) && valueDiagnostic.getSeverity() == Diagnostic.OK) {
				CompoundCommand command = new CompoundCommand();
			if (FeaturemodelViewsRepository.Feature.name == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (FeaturemodelViewsRepository.Feature.type == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Type(), event.getNewValue()));

			if (FeaturemodelViewsRepository.Feature.description == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Description(), EcoreUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (FeaturemodelViewsRepository.Feature.or == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Feature oldValue = (Feature)event.getOldValue();
					Feature newValue = (Feature)event.getNewValue();
					// TODO: Complete the feature update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Or(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), event.getNewValue(), event.getNewIndex()));
			}
			if (FeaturemodelViewsRepository.Feature.alternative == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Feature oldValue = (Feature)event.getOldValue();
					Feature newValue = (Feature)event.getNewValue();
					// TODO: Complete the feature update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Alternative(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), event.getNewValue(), event.getNewIndex()));
			}
			if (FeaturemodelViewsRepository.Feature.sub == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Feature oldValue = (Feature)event.getOldValue();
					Feature newValue = (Feature)event.getNewValue();
					// TODO: Complete the feature update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Sub(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature(), event.getNewValue(), event.getNewIndex()));
			}
			if (FeaturemodelViewsRepository.Feature.exclude == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Exclude(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Exclude(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Exclude(), event.getNewValue(), event.getNewIndex()));
			}
			if (FeaturemodelViewsRepository.Feature.require == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Require(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Require(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Require(), event.getNewValue(), event.getNewIndex()));
			}
			if (FeaturemodelViewsRepository.Feature.interactWith == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Interact(), event.getNewValue()));
				if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(RemoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Interact(), event.getNewValue()));
				if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, feature, FeaturemodelPackage.eINSTANCE.getFeature_Interact(), event.getNewValue(), event.getNewIndex()));
			}

				if (!command.isEmpty() && !command.canExecute()) {
					EEFRuntimePlugin.getDefault().logError("Cannot perform model change command.", null);
				} else {
					liveEditingDomain.getCommandStack().execute(command);
				}
			}
			if (valueDiagnostic.getSeverity() != Diagnostic.OK && valueDiagnostic instanceof BasicDiagnostic)
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, valueDiagnostic));
			else {
				Diagnostic validate = validate();
				super.firePropertiesChanged(new PropertiesValidationEditionEvent(event, validate));
			}
			super.firePropertiesChanged(event);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			String newStringValue = event.getNewValue().toString();
			try {
				if (FeaturemodelViewsRepository.Feature.name == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(FeaturemodelPackage.eINSTANCE.getFeature_Name().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(FeaturemodelPackage.eINSTANCE.getFeature_Name().getEAttributeType(), newValue);
				}
				if (FeaturemodelViewsRepository.Feature.type == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(FeaturemodelPackage.eINSTANCE.getFeature_Type().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(FeaturemodelPackage.eINSTANCE.getFeature_Type().getEAttributeType(), newValue);
				}
				if (FeaturemodelViewsRepository.Feature.description == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(FeaturemodelPackage.eINSTANCE.getFeature_Description().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(FeaturemodelPackage.eINSTANCE.getFeature_Description().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validate()
	 * 
	 */
	public Diagnostic validate() {
		Diagnostic validate = Diagnostic.OK_INSTANCE;
		if (IPropertiesEditionComponent.BATCH_MODE.equals(editing_mode)) {
			EObject copy = EcoreUtil.copy(feature);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(feature);
		// Start of user code for custom validation check
		
		// End of user code
		return validate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#dispose()
	 * 
	 */
	public void dispose() {
		if (semanticAdapter != null)
			feature.eAdapters().remove(semanticAdapter);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#getTabText(java.lang.String)
	 * 
	 */
	public String getTabText(String p_key) {
		return basePart.getTitle();
	}
}
