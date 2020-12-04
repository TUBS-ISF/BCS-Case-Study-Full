/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage
 * @generated
 */
public interface DeltaMSCFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeltaMSCFactory eINSTANCE = de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Delta MSC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta MSC</em>'.
   * @generated
   */
  DeltaMSC createDeltaMSC();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Testcase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Testcase</em>'.
   * @generated
   */
  Testcase createTestcase();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeltaMSCPackage getDeltaMSCPackage();

} //DeltaMSCFactory
