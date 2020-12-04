/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.deltarx.deltarx.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltarxFactoryImpl extends EFactoryImpl implements DeltarxFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeltarxFactory init()
  {
    try
    {
      DeltarxFactory theDeltarxFactory = (DeltarxFactory)EPackage.Registry.INSTANCE.getEFactory(DeltarxPackage.eNS_URI);
      if (theDeltarxFactory != null)
      {
        return theDeltarxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeltarxFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltarxFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DeltarxPackage.DELTARX: return createDeltarx();
      case DeltarxPackage.SIGNAL: return createSignal();
      case DeltarxPackage.COMPONENT: return createComponent();
      case DeltarxPackage.PORT: return createPort();
      case DeltarxPackage.CONNECTOR: return createConnector();
      case DeltarxPackage.CONNECTOR_TYPE_ONE: return createConnectorTypeOne();
      case DeltarxPackage.CONNECTOR_TYPE_TWO: return createConnectorTypeTwo();
      case DeltarxPackage.DELTA: return createDelta();
      case DeltarxPackage.DELTA_ADD_PORT: return createDeltaAddPort();
      case DeltarxPackage.DELTA_REMOVE_PORT: return createDeltaRemovePort();
      case DeltarxPackage.DELTA_ADD_COMPONENT: return createDeltaAddComponent();
      case DeltarxPackage.DELTA_REMOVE_COMPONENT: return createDeltaRemoveComponent();
      case DeltarxPackage.DELTA_ADD_CONNECTOR: return createDeltaAddConnector();
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR: return createDeltaRemoveConnector();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deltarx createDeltarx()
  {
    DeltarxImpl deltarx = new DeltarxImpl();
    return deltarx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal createSignal()
  {
    SignalImpl signal = new SignalImpl();
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorTypeOne createConnectorTypeOne()
  {
    ConnectorTypeOneImpl connectorTypeOne = new ConnectorTypeOneImpl();
    return connectorTypeOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorTypeTwo createConnectorTypeTwo()
  {
    ConnectorTypeTwoImpl connectorTypeTwo = new ConnectorTypeTwoImpl();
    return connectorTypeTwo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delta createDelta()
  {
    DeltaImpl delta = new DeltaImpl();
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaAddPort createDeltaAddPort()
  {
    DeltaAddPortImpl deltaAddPort = new DeltaAddPortImpl();
    return deltaAddPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaRemovePort createDeltaRemovePort()
  {
    DeltaRemovePortImpl deltaRemovePort = new DeltaRemovePortImpl();
    return deltaRemovePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaAddComponent createDeltaAddComponent()
  {
    DeltaAddComponentImpl deltaAddComponent = new DeltaAddComponentImpl();
    return deltaAddComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaRemoveComponent createDeltaRemoveComponent()
  {
    DeltaRemoveComponentImpl deltaRemoveComponent = new DeltaRemoveComponentImpl();
    return deltaRemoveComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaAddConnector createDeltaAddConnector()
  {
    DeltaAddConnectorImpl deltaAddConnector = new DeltaAddConnectorImpl();
    return deltaAddConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltaRemoveConnector createDeltaRemoveConnector()
  {
    DeltaRemoveConnectorImpl deltaRemoveConnector = new DeltaRemoveConnectorImpl();
    return deltaRemoveConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltarxPackage getDeltarxPackage()
  {
    return (DeltarxPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DeltarxPackage getPackage()
  {
    return DeltarxPackage.eINSTANCE;
  }

} //DeltarxFactoryImpl
