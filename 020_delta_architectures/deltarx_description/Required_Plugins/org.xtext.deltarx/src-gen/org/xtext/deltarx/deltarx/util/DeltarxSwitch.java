/**
 */
package org.xtext.deltarx.deltarx.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.deltarx.deltarx.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.deltarx.deltarx.DeltarxPackage
 * @generated
 */
public class DeltarxSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeltarxPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltarxSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DeltarxPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DeltarxPackage.DELTARX:
      {
        Deltarx deltarx = (Deltarx)theEObject;
        T result = caseDeltarx(deltarx);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.SIGNAL:
      {
        Signal signal = (Signal)theEObject;
        T result = caseSignal(signal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.CONNECTOR_TYPE_ONE:
      {
        ConnectorTypeOne connectorTypeOne = (ConnectorTypeOne)theEObject;
        T result = caseConnectorTypeOne(connectorTypeOne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.CONNECTOR_TYPE_TWO:
      {
        ConnectorTypeTwo connectorTypeTwo = (ConnectorTypeTwo)theEObject;
        T result = caseConnectorTypeTwo(connectorTypeTwo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA:
      {
        Delta delta = (Delta)theEObject;
        T result = caseDelta(delta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_ADD_PORT:
      {
        DeltaAddPort deltaAddPort = (DeltaAddPort)theEObject;
        T result = caseDeltaAddPort(deltaAddPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_REMOVE_PORT:
      {
        DeltaRemovePort deltaRemovePort = (DeltaRemovePort)theEObject;
        T result = caseDeltaRemovePort(deltaRemovePort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_ADD_COMPONENT:
      {
        DeltaAddComponent deltaAddComponent = (DeltaAddComponent)theEObject;
        T result = caseDeltaAddComponent(deltaAddComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_REMOVE_COMPONENT:
      {
        DeltaRemoveComponent deltaRemoveComponent = (DeltaRemoveComponent)theEObject;
        T result = caseDeltaRemoveComponent(deltaRemoveComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_ADD_CONNECTOR:
      {
        DeltaAddConnector deltaAddConnector = (DeltaAddConnector)theEObject;
        T result = caseDeltaAddConnector(deltaAddConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR:
      {
        DeltaRemoveConnector deltaRemoveConnector = (DeltaRemoveConnector)theEObject;
        T result = caseDeltaRemoveConnector(deltaRemoveConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deltarx</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deltarx</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltarx(Deltarx object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignal(Signal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector Type One</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector Type One</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectorTypeOne(ConnectorTypeOne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector Type Two</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector Type Two</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectorTypeTwo(ConnectorTypeTwo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDelta(Delta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Add Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Add Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaAddPort(DeltaAddPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Remove Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Remove Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaRemovePort(DeltaRemovePort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Add Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Add Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaAddComponent(DeltaAddComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Remove Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Remove Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaRemoveComponent(DeltaRemoveComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Add Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Add Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaAddConnector(DeltaAddConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delta Remove Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delta Remove Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeltaRemoveConnector(DeltaRemoveConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DeltarxSwitch
