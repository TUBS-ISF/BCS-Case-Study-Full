/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC.impl;

import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCFactory;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.Input;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltaMSCPackageImpl extends EPackageImpl implements DeltaMSCPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaMSCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testcaseEClass = null;

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
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DeltaMSCPackageImpl()
  {
    super(eNS_URI, DeltaMSCFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DeltaMSCPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DeltaMSCPackage init()
  {
    if (isInited) return (DeltaMSCPackage)EPackage.Registry.INSTANCE.getEPackage(DeltaMSCPackage.eNS_URI);

    // Obtain or create and register package
    DeltaMSCPackageImpl theDeltaMSCPackage = (DeltaMSCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeltaMSCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeltaMSCPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    DeltarxPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDeltaMSCPackage.createPackageContents();

    // Initialize created meta-data
    theDeltaMSCPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeltaMSCPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DeltaMSCPackage.eNS_URI, theDeltaMSCPackage);
    return theDeltaMSCPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaMSC()
  {
    return deltaMSCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaMSC_Testcases()
  {
    return (EReference)deltaMSCEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_First()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Signal()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Second()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestcase()
  {
    return testcaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestcase_Filename()
  {
    return (EAttribute)testcaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestcase_Inputs()
  {
    return (EReference)testcaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaMSCFactory getDeltaMSCFactory()
  {
    return (DeltaMSCFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    deltaMSCEClass = createEClass(DELTA_MSC);
    createEReference(deltaMSCEClass, DELTA_MSC__TESTCASES);

    inputEClass = createEClass(INPUT);
    createEReference(inputEClass, INPUT__FIRST);
    createEReference(inputEClass, INPUT__SIGNAL);
    createEReference(inputEClass, INPUT__SECOND);

    testcaseEClass = createEClass(TESTCASE);
    createEAttribute(testcaseEClass, TESTCASE__FILENAME);
    createEReference(testcaseEClass, TESTCASE__INPUTS);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    DeltarxPackage theDeltarxPackage = (DeltarxPackage)EPackage.Registry.INSTANCE.getEPackage(DeltarxPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(deltaMSCEClass, DeltaMSC.class, "DeltaMSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeltaMSC_Testcases(), this.getTestcase(), null, "testcases", null, 0, -1, DeltaMSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInput_First(), theDeltarxPackage.getComponent(), null, "first", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Signal(), theDeltarxPackage.getSignal(), null, "signal", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_Second(), theDeltarxPackage.getComponent(), null, "second", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testcaseEClass, Testcase.class, "Testcase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestcase_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestcase_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DeltaMSCPackageImpl
