/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.deltarx.deltarx.DeltarxPackage
 * @generated
 */
public interface DeltarxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeltarxFactory eINSTANCE = org.xtext.deltarx.deltarx.impl.DeltarxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Deltarx</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deltarx</em>'.
   * @generated
   */
  Deltarx createDeltarx();

  /**
   * Returns a new object of class '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal</em>'.
   * @generated
   */
  Signal createSignal();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector</em>'.
   * @generated
   */
  Connector createConnector();

  /**
   * Returns a new object of class '<em>Connector Type One</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector Type One</em>'.
   * @generated
   */
  ConnectorTypeOne createConnectorTypeOne();

  /**
   * Returns a new object of class '<em>Connector Type Two</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connector Type Two</em>'.
   * @generated
   */
  ConnectorTypeTwo createConnectorTypeTwo();

  /**
   * Returns a new object of class '<em>Delta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta</em>'.
   * @generated
   */
  Delta createDelta();

  /**
   * Returns a new object of class '<em>Delta Add Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Add Port</em>'.
   * @generated
   */
  DeltaAddPort createDeltaAddPort();

  /**
   * Returns a new object of class '<em>Delta Remove Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Remove Port</em>'.
   * @generated
   */
  DeltaRemovePort createDeltaRemovePort();

  /**
   * Returns a new object of class '<em>Delta Add Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Add Component</em>'.
   * @generated
   */
  DeltaAddComponent createDeltaAddComponent();

  /**
   * Returns a new object of class '<em>Delta Remove Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Remove Component</em>'.
   * @generated
   */
  DeltaRemoveComponent createDeltaRemoveComponent();

  /**
   * Returns a new object of class '<em>Delta Add Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Add Connector</em>'.
   * @generated
   */
  DeltaAddConnector createDeltaAddConnector();

  /**
   * Returns a new object of class '<em>Delta Remove Connector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delta Remove Connector</em>'.
   * @generated
   */
  DeltaRemoveConnector createDeltaRemoveConnector();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeltarxPackage getDeltarxPackage();

} //DeltarxFactory
