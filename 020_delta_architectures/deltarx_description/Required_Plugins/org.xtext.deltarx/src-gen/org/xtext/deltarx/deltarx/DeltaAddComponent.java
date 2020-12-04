/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Add Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddComponent()
 * @model
 * @generated
 */
public interface DeltaAddComponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference.
   * @see #setComponent(Component)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddComponent_Component()
   * @model containment="true"
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getComponent <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' containment reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltaAddComponent_SuperComponent()
   * @model
   * @generated
   */
  String getSuperComponent();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getSuperComponent <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Component</em>' attribute.
   * @see #getSuperComponent()
   * @generated
   */
  void setSuperComponent(String value);

} // DeltaAddComponent
