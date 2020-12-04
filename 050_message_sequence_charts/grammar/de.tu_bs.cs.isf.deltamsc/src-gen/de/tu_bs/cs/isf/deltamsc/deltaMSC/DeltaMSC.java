/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta MSC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC#getTestcases <em>Testcases</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getDeltaMSC()
 * @model
 * @generated
 */
public interface DeltaMSC extends EObject
{
  /**
   * Returns the value of the '<em><b>Testcases</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Testcases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Testcases</em>' containment reference list.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getDeltaMSC_Testcases()
   * @model containment="true"
   * @generated
   */
  EList<Testcase> getTestcases();

} // DeltaMSC
