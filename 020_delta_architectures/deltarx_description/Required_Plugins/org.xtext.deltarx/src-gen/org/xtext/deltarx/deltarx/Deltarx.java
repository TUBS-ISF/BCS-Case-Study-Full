/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deltarx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getFmdir <em>Fmdir</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Deltarx#getDeltas <em>Deltas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx()
 * @model
 * @generated
 */
public interface Deltarx extends EObject
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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Deltarx#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fmdir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fmdir</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fmdir</em>' attribute.
   * @see #setFmdir(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Fmdir()
   * @model
   * @generated
   */
  String getFmdir();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Deltarx#getFmdir <em>Fmdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fmdir</em>' attribute.
   * @see #getFmdir()
   * @generated
   */
  void setFmdir(String value);

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Signals()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getSignals();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Connectors()
   * @model containment="true"
   * @generated
   */
  EList<Connector> getConnectors();

  /**
   * Returns the value of the '<em><b>Deltas</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Delta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deltas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deltas</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDeltarx_Deltas()
   * @model containment="true"
   * @generated
   */
  EList<Delta> getDeltas();

} // Deltarx
