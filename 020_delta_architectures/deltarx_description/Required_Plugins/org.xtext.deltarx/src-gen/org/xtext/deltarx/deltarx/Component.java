/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Component#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Component#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Component#getSubcomponents <em>Subcomponents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
{
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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getComponent_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Connector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectors</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getComponent_Connectors()
   * @model containment="true"
   * @generated
   */
  EList<Connector> getConnectors();

  /**
   * Returns the value of the '<em><b>Subcomponents</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subcomponents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subcomponents</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getComponent_Subcomponents()
   * @model containment="true"
   * @generated
   */
  EList<Component> getSubcomponents();

} // Component
