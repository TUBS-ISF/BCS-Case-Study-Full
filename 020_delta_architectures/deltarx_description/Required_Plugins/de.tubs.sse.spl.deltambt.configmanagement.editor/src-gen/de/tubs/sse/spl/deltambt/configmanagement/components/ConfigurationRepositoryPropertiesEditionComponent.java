/**
 * Generated with Acceleo
 */
package de.tubs.sse.spl.deltambt.configmanagement.components;

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
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesValidationEditionEvent;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPartProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage;
import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;
import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigmanagementViewsRepository;
import de.tubs.sse.spl.deltambt.configmanagement.parts.ConfigurationRepositoryPropertiesEditionPart;
import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;
	

// End of user code

/**
 * 
 * 
 */
@SuppressWarnings("rawtypes")
public class ConfigurationRepositoryPropertiesEditionComponent extends StandardPropertiesEditionComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	private String[] parts = {BASE_PART};

	/**
	 * The EObject to edit
	 * 
	 */
	private ConfigurationRepository configurationRepository;

	/**
	 * The Base part
	 * 
	 */
	protected ConfigurationRepositoryPropertiesEditionPart basePart;

	/**
	 * Default constructor
	 * 
	 */
	public ConfigurationRepositoryPropertiesEditionComponent(EObject configurationRepository, String editing_mode) {
		if (configurationRepository instanceof ConfigurationRepository) {
			this.configurationRepository = (ConfigurationRepository)configurationRepository;
			if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode)) {
				semanticAdapter = initializeSemanticAdapter();
				this.configurationRepository.eAdapters().add(semanticAdapter);
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
					ConfigurationRepositoryPropertiesEditionComponent.this.dispose();
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
		if (ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Name().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setName(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setName("");
			}
		}
		if (ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_BelongToSPL().equals(msg.getFeature()) && basePart != null){
			if (msg.getNewValue() != null) {
				basePart.setBelongToSPL(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
			} else {
				basePart.setBelongToSPL("");
			}
		}
		if (ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_LinkedToFM().equals(msg.getFeature()) && basePart != null)
			basePart.setLinkedToFM((EObject)msg.getNewValue());
		if (msg.getFeature() != null && ((EStructuralFeature)msg.getFeature() == ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Configs())) {
			basePart.updateConfigs(configurationRepository);
		}

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#translatePart(java.lang.String)
	 * 
	 */
	public java.lang.Class translatePart(String key) {
		if (BASE_PART.equals(key))
			return ConfigmanagementViewsRepository.ConfigurationRepository.class;
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
		if (configurationRepository != null && BASE_PART.equals(key)) {
			if (basePart == null) {
				IPropertiesEditionPartProvider provider = PropertiesEditionPartProviderService.getInstance().getProvider(ConfigmanagementViewsRepository.class);
				if (provider != null) {
					basePart = (ConfigurationRepositoryPropertiesEditionPart)provider.getPropertiesEditionPart(ConfigmanagementViewsRepository.ConfigurationRepository.class, kind, this);
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
		if (key == ConfigmanagementViewsRepository.ConfigurationRepository.class)
			this.basePart = (ConfigurationRepositoryPropertiesEditionPart) propertiesEditionPart;
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
		if (basePart != null && key == ConfigmanagementViewsRepository.ConfigurationRepository.class) {
			((IPropertiesEditionPart)basePart).setContext(elt, allResource);
			final ConfigurationRepository configurationRepository = (ConfigurationRepository)elt;
			// init values
			if (configurationRepository.getName() != null)
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), configurationRepository.getName()));

			if (configurationRepository.getBelongToSPL() != null)
				basePart.setBelongToSPL(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), configurationRepository.getBelongToSPL()));

			// init part
			basePart.initLinkedToFM(allResource, configurationRepository.getLinkedToFM());
			// set the button mode
			basePart.setLinkedToFMButtonMode(ButtonsModeEnum.BROWSE);
			basePart.initConfigs(configurationRepository, null, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Configs());
			// init filters


			basePart.addFilterToLinkedToFM(new ViewerFilter() {

				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					return (element instanceof FeatureModel);
				}

			});
			// Start of user code for additional businessfilters for linkedToFM
			
			// End of user code

			basePart.addFilterToConfigs(new ViewerFilter() {

					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Configuration); //$NON-NLS-1$ 
				}

			});
			// Start of user code for additional businessfilters for configs
			
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
		if ((configurationRepository != null) && (basePart != null)) { 
			cc.append(SetCommand.create(editingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName())));
			cc.append(SetCommand.create(editingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_BelongToSPL(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getBelongToSPL())));
			if (configurationRepository.eGet(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_LinkedToFM()) == null || !configurationRepository.eGet(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_LinkedToFM()).equals(basePart.getLinkedToFM())) {
				cc.append(SetCommand.create(editingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_LinkedToFM(), basePart.getLinkedToFM()));
			}
			List configsToAddFromConfigs = basePart.getConfigsToAdd();
			for (Iterator iter = configsToAddFromConfigs.iterator(); iter.hasNext();)
				cc.append(AddCommand.create(editingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Configs(), iter.next()));
			Map configsToRefreshFromConfigs = basePart.getConfigsToEdit();
			for (Iterator iter = configsToRefreshFromConfigs.keySet().iterator(); iter.hasNext();) {
				Configuration nextElement = (Configuration) iter.next();
				Configuration configs = (Configuration) configsToRefreshFromConfigs.get(nextElement);
				for (EStructuralFeature feature : nextElement.eClass().getEAllStructuralFeatures()) {
					if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
						cc.append(SetCommand.create(editingDomain, nextElement, feature, configs.eGet(feature)));
					}
				}
			}
			List configsToRemoveFromConfigs = basePart.getConfigsToRemove();
			for (Iterator iter = configsToRemoveFromConfigs.iterator(); iter.hasNext();)
				cc.append(DeleteCommand.create(editingDomain, iter.next()));
			List configsToMoveFromConfigs = basePart.getConfigsToMove();
			for (Iterator iter = configsToMoveFromConfigs.iterator(); iter.hasNext();){
				org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement moveElement = (org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil.MoveElement)iter.next();
				cc.append(MoveCommand.create(editingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfiguration(), moveElement.getElement(), moveElement.getIndex()));
			}

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
		if (source instanceof ConfigurationRepository) {
			ConfigurationRepository configurationRepositoryToUpdate = (ConfigurationRepository)source;
			configurationRepositoryToUpdate.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getName()));

			configurationRepositoryToUpdate.setBelongToSPL((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), basePart.getBelongToSPL()));

			configurationRepositoryToUpdate.setLinkedToFM((FeatureModel)basePart.getLinkedToFM());
			configurationRepositoryToUpdate.getConfigs().addAll(basePart.getConfigsToAdd());

			return configurationRepositoryToUpdate;
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
			if (ConfigmanagementViewsRepository.ConfigurationRepository.name == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Name(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL == event.getAffectedEditor()) {
				command.append(SetCommand.create(liveEditingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_BelongToSPL(), EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue())));
			}
			if (ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM == event.getAffectedEditor())
				command.append(SetCommand.create(liveEditingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_LinkedToFM(), event.getNewValue()));
			if (ConfigmanagementViewsRepository.ConfigurationRepository.configs == event.getAffectedEditor()) {
				if (PropertiesEditionEvent.SET == event.getKind()) {
					Configuration oldValue = (Configuration)event.getOldValue();
					Configuration newValue = (Configuration)event.getNewValue();
					// TODO: Complete the configurationRepository update command
					for (EStructuralFeature feature : newValue.eClass().getEAllStructuralFeatures()) {
						if (feature.isChangeable() && !(feature instanceof EReference && ((EReference) feature).isContainer())) {
							command.append(SetCommand.create(liveEditingDomain, oldValue, feature, newValue.eGet(feature)));
						}
					}
				}
				else if (PropertiesEditionEvent.ADD == event.getKind())
					command.append(AddCommand.create(liveEditingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Configs(), event.getNewValue()));
				else if (PropertiesEditionEvent.REMOVE == event.getKind())
					command.append(DeleteCommand.create(liveEditingDomain, event.getNewValue()));
				else if (PropertiesEditionEvent.MOVE == event.getKind())
					command.append(MoveCommand.create(liveEditingDomain, configurationRepository, ConfigmanagementPackage.eINSTANCE.getConfiguration(), event.getNewValue(), event.getNewIndex()));
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.String, int)
	 * 
	 */
	public boolean isRequired(String key, int kind) {
		return key == ConfigmanagementViewsRepository.ConfigurationRepository.linkedToFM;
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
				if (ConfigmanagementViewsRepository.ConfigurationRepository.name == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Name().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_Name().getEAttributeType(), newValue);
				}
				if (ConfigmanagementViewsRepository.ConfigurationRepository.belongToSPL == event.getAffectedEditor()) {
					Object newValue = EcoreUtil.createFromString(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_BelongToSPL().getEAttributeType(), newStringValue);
					ret = Diagnostician.INSTANCE.validate(ConfigmanagementPackage.eINSTANCE.getConfigurationRepository_BelongToSPL().getEAttributeType(), newValue);
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
			EObject copy = EcoreUtil.copy(configurationRepository);
			copy = getPropertiesEditionObject(copy);
			validate =  EEFRuntimePlugin.getEEFValidator().validate(copy);
		}
		else if (IPropertiesEditionComponent.LIVE_MODE.equals(editing_mode))
			validate = EEFRuntimePlugin.getEEFValidator().validate(configurationRepository);
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
			configurationRepository.eAdapters().remove(semanticAdapter);
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
