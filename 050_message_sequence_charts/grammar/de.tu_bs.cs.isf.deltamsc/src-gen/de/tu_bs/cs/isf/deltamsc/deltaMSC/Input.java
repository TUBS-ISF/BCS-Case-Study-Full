/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC;

import org.eclipse.emf.ecore.EObject;

import org.xtext.deltarx.deltarx.Component;
import org.xtext.deltarx.deltarx.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getFirst <em>First</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(Component)
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getInput_First()
   * @model
   * @generated
   */
  Component getFirst();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Component value);

  /**
   * Returns the value of the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(Signal)
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getInput_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(Component)
   * @see de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage#getInput_Second()
   * @model
   * @generated
   */
  Component getSecond();

  /**
   * Sets the value of the '{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.Input#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(Component value);

} // Input
