/**
 */
package org.xtext.deltarx.deltarx.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.deltarx.deltarx.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.deltarx.deltarx.DeltarxPackage
 * @generated
 */
public class DeltarxAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeltarxPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltarxAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DeltarxPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltarxSwitch<Adapter> modelSwitch =
    new DeltarxSwitch<Adapter>()
    {
      @Override
      public Adapter caseDeltarx(Deltarx object)
      {
        return createDeltarxAdapter();
      }
      @Override
      public Adapter caseSignal(Signal object)
      {
        return createSignalAdapter();
      }
      @Override
      public Adapter caseComponent(Component object)
      {
        return createComponentAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseConnectorTypeOne(ConnectorTypeOne object)
      {
        return createConnectorTypeOneAdapter();
      }
      @Override
      public Adapter caseConnectorTypeTwo(ConnectorTypeTwo object)
      {
        return createConnectorTypeTwoAdapter();
      }
      @Override
      public Adapter caseDelta(Delta object)
      {
        return createDeltaAdapter();
      }
      @Override
      public Adapter caseDeltaAddPort(DeltaAddPort object)
      {
        return createDeltaAddPortAdapter();
      }
      @Override
      public Adapter caseDeltaRemovePort(DeltaRemovePort object)
      {
        return createDeltaRemovePortAdapter();
      }
      @Override
      public Adapter caseDeltaAddComponent(DeltaAddComponent object)
      {
        return createDeltaAddComponentAdapter();
      }
      @Override
      public Adapter caseDeltaRemoveComponent(DeltaRemoveComponent object)
      {
        return createDeltaRemoveComponentAdapter();
      }
      @Override
      public Adapter caseDeltaAddConnector(DeltaAddConnector object)
      {
        return createDeltaAddConnectorAdapter();
      }
      @Override
      public Adapter caseDeltaRemoveConnector(DeltaRemoveConnector object)
      {
        return createDeltaRemoveConnectorAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Deltarx <em>Deltarx</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Deltarx
   * @generated
   */
  public Adapter createDeltarxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Signal
   * @generated
   */
  public Adapter createSignalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Component
   * @generated
   */
  public Adapter createComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne <em>Connector Type One</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne
   * @generated
   */
  public Adapter createConnectorTypeOneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo <em>Connector Type Two</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo
   * @generated
   */
  public Adapter createConnectorTypeTwoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.Delta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.Delta
   * @generated
   */
  public Adapter createDeltaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaAddPort <em>Delta Add Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaAddPort
   * @generated
   */
  public Adapter createDeltaAddPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaRemovePort <em>Delta Remove Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaRemovePort
   * @generated
   */
  public Adapter createDeltaRemovePortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaAddComponent <em>Delta Add Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaAddComponent
   * @generated
   */
  public Adapter createDeltaAddComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent <em>Delta Remove Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveComponent
   * @generated
   */
  public Adapter createDeltaRemoveComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaAddConnector <em>Delta Add Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaAddConnector
   * @generated
   */
  public Adapter createDeltaAddConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector <em>Delta Remove Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveConnector
   * @generated
   */
  public Adapter createDeltaRemoveConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DeltarxAdapterFactory
