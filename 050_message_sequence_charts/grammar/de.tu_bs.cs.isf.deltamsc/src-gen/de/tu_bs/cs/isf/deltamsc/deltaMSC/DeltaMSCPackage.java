/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC;

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
 * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCFactory
 * @model kind="package"
 * @generated
 */
public interface DeltaMSCPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "deltaMSC";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tu_bs.de/cs/isf/deltamsc/DeltaMSC";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "deltaMSC";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeltaMSCPackage eINSTANCE = de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl.init();

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCImpl <em>Delta MSC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCImpl
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getDeltaMSC()
   * @generated
   */
  int DELTA_MSC = 0;

  /**
   * The feature id for the '<em><b>Testcases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_MSC__TESTCASES = 0;

  /**
   * The number of structural features of the '<em>Delta MSC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_MSC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.InputImpl
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getInput()
   * @generated
   */
  int INPUT = 1;

  /**
   * The feature id for the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__FIRST = 0;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__SIGNAL = 1;

  /**
   * The feature id for the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__SECOND = 2;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.TestcaseImpl <em>Testcase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.TestcaseImpl
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getTestcase()
   * @generated
   */
  int TESTCASE = 2;

  /**
   * The feature id for the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTCASE__FILENAME = 0;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTCASE__INPUTS = 1;

  /**
   * The number of structural features of the '<em>Testcase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTCASE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC <em>Delta MSC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta MSC</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC
   * @generated
   */
  EClass getDeltaMSC();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC#getTestcases <em>Testcases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Testcases</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC#getTestcases()
   * @see #getDeltaMSC()
   * @generated
   */
  EReference getDeltaMSC_Testcases();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getFirst <em>First</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getFirst()
   * @see #getInput()
   * @generated
   */
  EReference getInput_First();

  /**
   * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSignal()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Signal();

  /**
   * Returns the meta object for the reference '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSecond()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Second();

  /**
   * Returns the meta object for class '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase <em>Testcase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Testcase</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase
   * @generated
   */
  EClass getTestcase();

  /**
   * Returns the meta object for the attribute '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getFilename <em>Filename</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filename</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getFilename()
   * @see #getTestcase()
   * @generated
   */
  EAttribute getTestcase_Filename();

  /**
   * Returns the meta object for the containment reference list '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getInputs()
   * @see #getTestcase()
   * @generated
   */
  EReference getTestcase_Inputs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DeltaMSCFactory getDeltaMSCFactory();

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
     * The meta object literal for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCImpl <em>Delta MSC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCImpl
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getDeltaMSC()
     * @generated
     */
    EClass DELTA_MSC = eINSTANCE.getDeltaMSC();

    /**
     * The meta object literal for the '<em><b>Testcases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_MSC__TESTCASES = eINSTANCE.getDeltaMSC_Testcases();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.InputImpl
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>First</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__FIRST = eINSTANCE.getInput_First();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__SIGNAL = eINSTANCE.getInput_Signal();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__SECOND = eINSTANCE.getInput_Second();

    /**
     * The meta object literal for the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.TestcaseImpl <em>Testcase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.TestcaseImpl
     * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCPackageImpl#getTestcase()
     * @generated
     */
    EClass TESTCASE = eINSTANCE.getTestcase();

    /**
     * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTCASE__FILENAME = eINSTANCE.getTestcase_Filename();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TESTCASE__INPUTS = eINSTANCE.getTestcase_Inputs();

  }

} //DeltaMSCPackage
