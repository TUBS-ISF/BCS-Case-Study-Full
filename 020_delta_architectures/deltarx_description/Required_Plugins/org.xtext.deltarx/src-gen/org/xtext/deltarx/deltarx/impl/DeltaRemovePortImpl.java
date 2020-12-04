/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.DeltaRemovePort;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Remove Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl#getPortName <em>Port Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl#getPortComponent <em>Port Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaRemovePortImpl extends MinimalEObjectImpl.Container implements DeltaRemovePort
{
  /**
   * The default value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortName()
   * @generated
   * @ordered
   */
  protected static final String PORT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortName() <em>Port Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortName()
   * @generated
   * @ordered
   */
  protected String portName = PORT_NAME_EDEFAULT;

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
  protected DeltaRemovePortImpl()
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
    return DeltarxPackage.Literals.DELTA_REMOVE_PORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortName()
  {
    return portName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortName(String newPortName)
  {
    String oldPortName = portName;
    portName = newPortName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_PORT__PORT_NAME, oldPortName, portName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_PORT__PORT_COMPONENT, oldPortComponent, portComponent));
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
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_NAME:
        return getPortName();
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_NAME:
        setPortName((String)newValue);
        return;
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_NAME:
        setPortName(PORT_NAME_EDEFAULT);
        return;
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_NAME:
        return PORT_NAME_EDEFAULT == null ? portName != null : !PORT_NAME_EDEFAULT.equals(portName);
      case DeltarxPackage.DELTA_REMOVE_PORT__PORT_COMPONENT:
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
    result.append(" (portName: ");
    result.append(portName);
    result.append(", portComponent: ");
    result.append(portComponent);
    result.append(')');
    return result.toString();
  }

} //DeltaRemovePortImpl
