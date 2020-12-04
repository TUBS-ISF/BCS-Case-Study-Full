/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testcase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getFilename <em>Filename</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getTestcase()
 * @model
 * @generated
 */
public interface Testcase extends EObject
{
  /**
   * Returns the value of the '<em><b>Filename</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filename</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filename</em>' attribute.
   * @see #setFilename(String)
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getTestcase_Filename()
   * @model
   * @generated
   */
  String getFilename();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase#getFilename <em>Filename</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filename</em>' attribute.
   * @see #getFilename()
   * @generated
   */
  void setFilename(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getTestcase_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<Input> getInputs();

} // Testcase
