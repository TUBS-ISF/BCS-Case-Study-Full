/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getAfter <em>After</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getAppcon <em>Appcon</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getRemoveConnector <em>Remove Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getRemoveComponent <em>Remove Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getRemoveSignal <em>Remove Signal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getRemovePort <em>Remove Port</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getNewSignal <em>New Signal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getNewComponent <em>New Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getNewConnector <em>New Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.Delta#getNewPort <em>New Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta()
 * @model
 * @generated
 */
public interface Delta extends EObject
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
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Delta#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>After</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' attribute list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_After()
   * @model unique="false"
   * @generated
   */
  EList<String> getAfter();

  /**
   * Returns the value of the '<em><b>Appcon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Appcon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Appcon</em>' attribute.
   * @see #setAppcon(String)
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_Appcon()
   * @model
   * @generated
   */
  String getAppcon();

  /**
   * Sets the value of the '{@link org.xtext.deltarx.deltarx.Delta#getAppcon <em>Appcon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Appcon</em>' attribute.
   * @see #getAppcon()
   * @generated
   */
  void setAppcon(String value);

  /**
   * Returns the value of the '<em><b>Remove Connector</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaRemoveConnector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Connector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Connector</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_RemoveConnector()
   * @model containment="true"
   * @generated
   */
  EList<DeltaRemoveConnector> getRemoveConnector();

  /**
   * Returns the value of the '<em><b>Remove Component</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaRemoveComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Component</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_RemoveComponent()
   * @model containment="true"
   * @generated
   */
  EList<DeltaRemoveComponent> getRemoveComponent();

  /**
   * Returns the value of the '<em><b>Remove Signal</b></em>' reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Signal</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Signal</em>' reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_RemoveSignal()
   * @model
   * @generated
   */
  EList<Signal> getRemoveSignal();

  /**
   * Returns the value of the '<em><b>Remove Port</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaRemovePort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Port</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Port</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_RemovePort()
   * @model containment="true"
   * @generated
   */
  EList<DeltaRemovePort> getRemovePort();

  /**
   * Returns the value of the '<em><b>New Signal</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.Signal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Signal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Signal</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_NewSignal()
   * @model containment="true"
   * @generated
   */
  EList<Signal> getNewSignal();

  /**
   * Returns the value of the '<em><b>New Component</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaAddComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Component</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_NewComponent()
   * @model containment="true"
   * @generated
   */
  EList<DeltaAddComponent> getNewComponent();

  /**
   * Returns the value of the '<em><b>New Connector</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaAddConnector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Connector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Connector</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_NewConnector()
   * @model containment="true"
   * @generated
   */
  EList<DeltaAddConnector> getNewConnector();

  /**
   * Returns the value of the '<em><b>New Port</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.deltarx.deltarx.DeltaAddPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Port</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Port</em>' containment reference list.
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#getDelta_NewPort()
   * @model containment="true"
   * @generated
   */
  EList<DeltaAddPort> getNewPort();

} // Delta
