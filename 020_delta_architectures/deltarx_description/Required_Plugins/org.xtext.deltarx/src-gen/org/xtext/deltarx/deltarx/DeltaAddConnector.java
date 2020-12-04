/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Add Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddConnector()
 * @model
 * @generated
 */
public interface DeltaAddConnector extends EObject
{
  /**
   * Returns the value of the '<em><b>Connector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connector</em>' containment reference.
   * @see #setConnector(Connector)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddConnector_Connector()
   * @model containment="true"
   * @generated
   */
  Connector getConnector();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getConnector <em>Connector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connector</em>' containment reference.
   * @see #getConnector()
   * @generated
   */
  void setConnector(Connector value);

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddConnector_SuperComponent()
   * @model
   * @generated
   */
  String getSuperComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getSuperComponent <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Component</em>' attribute.
   * @see #getSuperComponent()
   * @generated
   */
  void setSuperComponent(String value);

} // DeltaAddConnector
