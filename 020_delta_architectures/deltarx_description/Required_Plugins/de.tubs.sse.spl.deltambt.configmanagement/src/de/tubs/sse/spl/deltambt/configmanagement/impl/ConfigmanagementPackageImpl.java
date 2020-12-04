/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.configmanagement.impl;

import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementFactory;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage;
import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigmanagementPackageImpl extends EPackageImpl implements ConfigmanagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigmanagementPackageImpl() {
		super(eNS_URI, ConfigmanagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfigmanagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigmanagementPackage init() {
		if (isInited) return (ConfigmanagementPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigmanagementPackage.eNS_URI);

		// Obtain or create and register package
		ConfigmanagementPackageImpl theConfigmanagementPackage = (ConfigmanagementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigmanagementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigmanagementPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		FeaturemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigmanagementPackage.createPackageContents();

		// Initialize created meta-data
		theConfigmanagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigmanagementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigmanagementPackage.eNS_URI, theConfigmanagementPackage);
		return theConfigmanagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationRepository() {
		return configurationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationRepository_Name() {
		return (EAttribute)configurationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationRepository_BelongToSPL() {
		return (EAttribute)configurationRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationRepository_LinkedToFM() {
		return (EReference)configurationRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationRepository_Configs() {
		return (EReference)configurationRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Features() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigmanagementFactory getConfigmanagementFactory() {
		return (ConfigmanagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationRepositoryEClass = createEClass(CONFIGURATION_REPOSITORY);
		createEAttribute(configurationRepositoryEClass, CONFIGURATION_REPOSITORY__NAME);
		createEAttribute(configurationRepositoryEClass, CONFIGURATION_REPOSITORY__BELONG_TO_SPL);
		createEReference(configurationRepositoryEClass, CONFIGURATION_REPOSITORY__LINKED_TO_FM);
		createEReference(configurationRepositoryEClass, CONFIGURATION_REPOSITORY__CONFIGS);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);
		createEReference(configurationEClass, CONFIGURATION__FEATURES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FeaturemodelPackage theFeaturemodelPackage = (FeaturemodelPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configurationRepositoryEClass, ConfigurationRepository.class, "ConfigurationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigurationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationRepository_BelongToSPL(), ecorePackage.getEString(), "belongToSPL", null, 0, 1, ConfigurationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationRepository_LinkedToFM(), theFeaturemodelPackage.getFeatureModel(), null, "linkedToFM", null, 1, 1, ConfigurationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConfigurationRepository_LinkedToFM().getEKeys().add(theFeaturemodelPackage.getFeatureModel_Name());
		initEReference(getConfigurationRepository_Configs(), this.getConfiguration(), null, "configs", null, 0, -1, ConfigurationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Features(), theFeaturemodelPackage.getFeature(), null, "features", null, 1, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConfiguration_Features().getEKeys().add(theFeaturemodelPackage.getFeature_Name());

		// Create resource
		createResource(eNS_URI);
	}

} //ConfigmanagementPackageImpl
