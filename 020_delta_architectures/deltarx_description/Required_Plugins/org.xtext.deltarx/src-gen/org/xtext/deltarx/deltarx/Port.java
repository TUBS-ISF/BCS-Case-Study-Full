/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Port#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Port#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see #setDirection(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getPort_Direction()
   * @model
   * @generated
   */
  String getDirection();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Port#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see #getDirection()
   * @generated
   */
  void setDirection(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getPort_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Port#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

} // Port
