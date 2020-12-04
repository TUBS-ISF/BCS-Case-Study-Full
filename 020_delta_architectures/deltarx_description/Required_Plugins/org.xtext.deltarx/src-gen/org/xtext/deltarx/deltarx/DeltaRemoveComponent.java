/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Remove Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveComponent()
 * @model
 * @generated
 */
public interface DeltaRemoveComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' attribute.
   * @see #setComponent(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveComponent_Component()
   * @model
   * @generated
   */
  String getComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getComponent <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' attribute.
   * @see #getComponent()
   * @generated
   */
  void setComponent(String value);

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaRemoveComponent_SuperComponent()
   * @model
   * @generated
   */
  String getSuperComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getSuperComponent <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Component</em>' attribute.
   * @see #getSuperComponent()
   * @generated
   */
  void setSuperComponent(String value);

} // DeltaRemoveComponent
