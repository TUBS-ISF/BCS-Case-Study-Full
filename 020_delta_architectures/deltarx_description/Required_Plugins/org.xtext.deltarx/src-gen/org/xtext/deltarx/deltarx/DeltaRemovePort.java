/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Remove Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortComponent <em>Port Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemovePort()
 * @model
 * @generated
 */
public interface DeltaRemovePort extends EObject
{
  /**
   * Returns the value of the '<em><b>Port Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Name</em>' attribute.
   * @see #setPortName(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemovePort_PortName()
   * @model
   * @generated
   */
  String getPortName();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortName <em>Port Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port Name</em>' attribute.
   * @see #getPortName()
   * @generated
   */
  void setPortName(String value);

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemovePort_PortComponent()
   * @model
   * @generated
   */
  String getPortComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortComponent <em>Port Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port Component</em>' attribute.
   * @see #getPortComponent()
   * @generated
   */
  void setPortComponent(String value);

} // DeltaRemovePort
