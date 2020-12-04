/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.featuremodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de/tubs/sse/spl/deltambt/featuremodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.tubs.sse.spl.deltambt.featuremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemodelPackage eINSTANCE = de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl
	 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT = 1;

	/**
	 * The feature id for the '<em><b>Belong To SPL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__BELONG_TO_SPL = 2;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl
	 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__OR = 2;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ALTERNATIVE = 3;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB = 4;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__EXCLUDE = 5;

	/**
	 * The feature id for the '<em><b>Require</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIRE = 6;

	/**
	 * The feature id for the '<em><b>Interact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INTERACT = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 8;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link de.tubs.sse.spl.deltambt.featuremodel.EFeatureType <em>EFeature Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tubs.sse.spl.deltambt.featuremodel.EFeatureType
	 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getEFeatureType()
	 * @generated
	 */
	int EFEATURE_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getName()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EAttribute getFeatureModel_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getRoot()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Root();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getBelongToSPL <em>Belong To SPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Belong To SPL</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeatureModel#getBelongToSPL()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EAttribute getFeatureModel_BelongToSPL();

	/**
	 * Returns the meta object for class '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getOr()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getAlternative()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Alternative();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getSub()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Sub();

	/**
	 * Returns the meta object for the reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exclude</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getExclude()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Exclude();

	/**
	 * Returns the meta object for the reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Require</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getRequire()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Require();

	/**
	 * Returns the meta object for the reference list '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getInteract <em>Interact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interact</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getInteract()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Interact();

	/**
	 * Returns the meta object for the attribute '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for enum '{@link de.tubs.sse.spl.deltambt.featuremodel.EFeatureType <em>EFeature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EFeature Type</em>'.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.EFeatureType
	 * @generated
	 */
	EEnum getEFeatureType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemodelFactory getFeaturemodelFactory();

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
		 * The meta object literal for the '{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl
		 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__NAME = eINSTANCE.getFeatureModel_Name();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT = eINSTANCE.getFeatureModel_Root();

		/**
		 * The meta object literal for the '<em><b>Belong To SPL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_MODEL__BELONG_TO_SPL = eINSTANCE.getFeatureModel_BelongToSPL();

		/**
		 * The meta object literal for the '{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl
		 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__OR = eINSTANCE.getFeature_Or();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ALTERNATIVE = eINSTANCE.getFeature_Alternative();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUB = eINSTANCE.getFeature_Sub();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__EXCLUDE = eINSTANCE.getFeature_Exclude();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIRE = eINSTANCE.getFeature_Require();

		/**
		 * The meta object literal for the '<em><b>Interact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__INTERACT = eINSTANCE.getFeature_Interact();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '{@link de.tubs.sse.spl.deltambt.featuremodel.EFeatureType <em>EFeature Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tubs.sse.spl.deltambt.featuremodel.EFeatureType
		 * @see de.tubs.sse.spl.deltambt.featuremodel.impl.FeaturemodelPackageImpl#getEFeatureType()
		 * @generated
		 */
		EEnum EFEATURE_TYPE = eINSTANCE.getEFeatureType();

	}

} //FeaturemodelPackage
