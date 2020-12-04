/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.DeltaAddPort;
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Add Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl#getPortComponent <em>Port Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaAddPortImpl extends MinimalEObjectImpl.Container implements DeltaAddPort
{
  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected Port port;

  /**
   * The default value of the '{@link #getPortComponent() <em>Port Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortComponent()
   * @generated
   * @ordered
   */
  protected static final String PORT_COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortComponent() <em>Port Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortComponent()
   * @generated
   * @ordered
   */
  protected String portComponent = PORT_COMPONENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltaAddPortImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeltarxPackage.Literals.DELTA_ADD_PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPort(Port newPort, NotificationChain msgs)
  {
    Port oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_PORT__PORT, oldPort, newPort);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(Port newPort)
  {
    if (newPort != port)
    {
      NotificationChain msgs = null;
      if (port != null)
        msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_PORT__PORT, null, msgs);
      if (newPort != null)
        msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_PORT__PORT, null, msgs);
      msgs = basicSetPort(newPort, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_PORT__PORT, newPort, newPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortComponent()
  {
    return portComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortComponent(String newPortComponent)
  {
    String oldPortComponent = portComponent;
    portComponent = newPortComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_PORT__PORT_COMPONENT, oldPortComponent, portComponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA_ADD_PORT__PORT:
        return basicSetPort(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA_ADD_PORT__PORT:
        return getPort();
      case DeltarxPackage.DELTA_ADD_PORT__PORT_COMPONENT:
        return getPortComponent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA_ADD_PORT__PORT:
        setPort((Port)newValue);
        return;
      case DeltarxPackage.DELTA_ADD_PORT__PORT_COMPONENT:
        setPortComponent((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA_ADD_PORT__PORT:
        setPort((Port)null);
        return;
      case DeltarxPackage.DELTA_ADD_PORT__PORT_COMPONENT:
        setPortComponent(PORT_COMPONENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA_ADD_PORT__PORT:
        return port != null;
      case DeltarxPackage.DELTA_ADD_PORT__PORT_COMPONENT:
        return PORT_COMPONENT_EDEFAULT == null ? portComponent != null : !PORT_COMPONENT_EDEFAULT.equals(portComponent);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (portComponent: ");
    result.append(portComponent);
    result.append(')');
    return result.toString();
  }

} //DeltaAddPortImpl
