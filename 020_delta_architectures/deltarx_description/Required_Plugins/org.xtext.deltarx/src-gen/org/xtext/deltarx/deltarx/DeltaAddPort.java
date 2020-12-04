/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Add Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPortComponent <em>Port Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddPort()
 * @model
 * @generated
 */
public interface DeltaAddPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' containment reference.
   * @see #setPort(Port)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddPort_Port()
   * @model containment="true"
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPort <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' containment reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

  /**
   * Returns the value of the '<em><b>Port Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Component</em>' attribute.
   * @see #setPortComponent(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddPort_PortComponent()
   * @model
   * @generated
   */
  String getPortComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPortComponent <em>Port Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port Component</em>' attribute.
   * @see #getPortComponent()
   * @generated
   */
  void setPortComponent(String value);

} // DeltaAddPort
