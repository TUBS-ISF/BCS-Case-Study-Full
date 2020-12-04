/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.configmanagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigmanagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configmanagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/tubs/sse/spl/deltambt/configurationmanagement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.tubs.sse.spl.deltambt.configurationmanagement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigmanagementPackage eINSTANCE = de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigmanagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl <em>Configuration Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl
	 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigmanagementPackageImpl#getConfigurationRepository()
	 * @generated
	 */
	int CONFIGURATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Belong To SPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REPOSITORY__BELONG_TO_SPL = 1;

	/**
	 * The feature id for the '<em><b>Linked To FM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REPOSITORY__LINKED_TO_FM = 2;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REPOSITORY__CONFIGS = 3;

	/**
	 * The number of structural features of the '<em>Configuration Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationImpl
	 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigmanagementPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository <em>Configuration Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Repository</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository
	 * @generated
	 */
	EClass getConfigurationRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getName()
	 * @see #getConfigurationRepository()
	 * @generated
	 */
	EAttribute getConfigurationRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getBelongToSPL <em>Belong To SPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Belong To SPL</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getBelongToSPL()
	 * @see #getConfigurationRepository()
	 * @generated
	 */
	EAttribute getConfigurationRepository_BelongToSPL();

	/**
	 * Returns the meta object for the reference '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getLinkedToFM <em>Linked To FM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To FM</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getLinkedToFM()
	 * @see #getConfigurationRepository()
	 * @generated
	 */
	EReference getConfigurationRepository_LinkedToFM();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository#getConfigs()
	 * @see #getConfigurationRepository()
	 * @generated
	 */
	EReference getConfigurationRepository_Configs();

	/**
	 * Returns the meta object for class '{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.Configuration#getFeatures()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Features();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigmanagementFactory getConfigmanagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl <em>Configuration Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl
		 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigmanagementPackageImpl#getConfigurationRepository()
		 * @generated
		 */
		EClass CONFIGURATION_REPOSITORY = eINSTANCE.getConfigurationRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_REPOSITORY__NAME = eINSTANCE.getConfigurationRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Belong To SPL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_REPOSITORY__BELONG_TO_SPL = eINSTANCE.getConfigurationRepository_BelongToSPL();

		/**
		 * The meta object literal for the '<em><b>Linked To FM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_REPOSITORY__LINKED_TO_FM = eINSTANCE.getConfigurationRepository_LinkedToFM();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_REPOSITORY__CONFIGS = eINSTANCE.getConfigurationRepository_Configs();

		/**
		 * The meta object literal for the '{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationImpl
		 * @see de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigmanagementPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__FEATURES = eINSTANCE.getConfiguration_Features();

	}

} //ConfigmanagementPackage
