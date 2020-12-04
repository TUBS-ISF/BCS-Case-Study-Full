/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Remove Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveConnector()
 * @model
 * @generated
 */
public interface DeltaRemoveConnector extends EObject
{
  /**
   * Returns the value of the '<em><b>Connector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connector</em>' attribute.
   * @see #setConnector(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveConnector_Connector()
   * @model
   * @generated
   */
  String getConnector();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getConnector <em>Connector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connector</em>' attribute.
   * @see #getConnector()
   * @generated
   */
  void setConnector(String value);

  /**
   * Returns the value of the '<em><b>Super Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Component</em>' attribute.
   * @see #setSuperComponent(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveConnector_SuperComponent()
   * @model
   * @generated
   */
  String getSuperComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getSuperComponent <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Component</em>' attribute.
   * @see #getSuperComponent()
   * @generated
   */
  void setSuperComponent(String value);

} // DeltaRemoveConnector
