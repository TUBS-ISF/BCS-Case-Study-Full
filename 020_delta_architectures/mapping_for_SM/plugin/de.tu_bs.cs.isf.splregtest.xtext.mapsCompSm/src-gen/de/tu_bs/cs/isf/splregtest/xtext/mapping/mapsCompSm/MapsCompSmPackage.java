/**
 */
package de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm;

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
 * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.MapsCompSmFactory
 * @model kind="package"
 * @generated
 */
public interface MapsCompSmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapsCompSm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tu_bs.de/cs/isf/splregtest/xtext/mapping/MapsCompSm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapsCompSm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapsCompSmPackage eINSTANCE = de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl.init();

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MappingImpl
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.ComponentImpl
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Bsms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__BSMS = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.BSMImpl <em>BSM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.BSMImpl
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getBSM()
   * @generated
   */
  int BSM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSM__NAME = 0;

  /**
   * The number of structural features of the '<em>BSM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Mapping#getComponents()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Components();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component#getBsms <em>Bsms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bsms</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.Component#getBsms()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Bsms();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.BSM <em>BSM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BSM</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.BSM
   * @generated
   */
  EClass getBSM();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.BSM#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.BSM#getName()
   * @see #getBSM()
   * @generated
   */
  EAttribute getBSM_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapsCompSmFactory getMapsCompSmFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MappingImpl
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__COMPONENTS = eINSTANCE.getMapping_Components();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.ComponentImpl
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Bsms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__BSMS = eINSTANCE.getComponent_Bsms();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.BSMImpl <em>BSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.BSMImpl
     * @see de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl.MapsCompSmPackageImpl#getBSM()
     * @generated
     */
    EClass BSM = eINSTANCE.getBSM();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSM__NAME = eINSTANCE.getBSM_Name();

  }

} //MapsCompSmPackage
