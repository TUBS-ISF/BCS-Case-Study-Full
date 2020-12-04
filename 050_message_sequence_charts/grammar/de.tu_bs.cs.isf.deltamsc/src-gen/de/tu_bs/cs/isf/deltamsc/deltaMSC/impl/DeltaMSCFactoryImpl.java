/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC.impl;

import de.tu_bs.cs.isf.deltamsc.deltaMSC.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltaMSCFactoryImpl extends EFactoryImpl implements DeltaMSCFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeltaMSCFactory init()
  {
    try
    {
      DeltaMSCFactory theDeltaMSCFactory = (DeltaMSCFactory)EPackage.Registry.INSTANCE.getEFactory(DeltaMSCPackage.eNS_URI);
      if (theDeltaMSCFactory != null)
      {
        return theDeltaMSCFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeltaMSCFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaMSCFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DeltaMSCPackage.DELTA_MSC: return createDeltaMSC();
      case DeltaMSCPackage.INPUT: return createInput();
      case DeltaMSCPackage.TESTCASE: return createTestcase();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaMSC createDeltaMSC()
  {
    DeltaMSCImpl deltaMSC = new DeltaMSCImpl();
    return deltaMSC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Testcase createTestcase()
  {
    TestcaseImpl testcase = new TestcaseImpl();
    return testcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaMSCPackage getDeltaMSCPackage()
  {
    return (DeltaMSCPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DeltaMSCPackage getPackage()
  {
    return DeltaMSCPackage.eINSTANCE;
  }

} //DeltaMSCFactoryImpl
