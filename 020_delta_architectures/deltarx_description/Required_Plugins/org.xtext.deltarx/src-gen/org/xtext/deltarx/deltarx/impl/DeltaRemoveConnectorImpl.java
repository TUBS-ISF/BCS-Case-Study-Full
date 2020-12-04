/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.DeltaRemoveConnector;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Remove Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaRemoveConnectorImpl extends MinimalEObjectImpl.Container implements DeltaRemoveConnector
{
  /**
   * The default value of the '{@link #getConnector() <em>Connector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnector()
   * @generated
   * @ordered
   */
  protected static final String CONNECTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConnector() <em>Connector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnector()
   * @generated
   * @ordered
   */
  protected String connector = CONNECTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getSuperComponent() <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperComponent()
   * @generated
   * @ordered
   */
  protected static final String SUPER_COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSuperComponent() <em>Super Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperComponent()
   * @generated
   * @ordered
   */
  protected String superComponent = SUPER_COMPONENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltaRemoveConnectorImpl()
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
    return DeltarxPackage.Literals.DELTA_REMOVE_CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConnector()
  {
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnector(String newConnector)
  {
    String oldConnector = connector;
    connector = newConnector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_CONNECTOR__CONNECTOR, oldConnector, connector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSuperComponent()
  {
    return superComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperComponent(String newSuperComponent)
  {
    String oldSuperComponent = superComponent;
    superComponent = newSuperComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT, oldSuperComponent, superComponent));
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
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__CONNECTOR:
        return getConnector();
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT:
        return getSuperComponent();
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
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__CONNECTOR:
        setConnector((String)newValue);
        return;
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT:
        setSuperComponent((String)newValue);
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
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__CONNECTOR:
        setConnector(CONNECTOR_EDEFAULT);
        return;
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT:
        setSuperComponent(SUPER_COMPONENT_EDEFAULT);
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
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__CONNECTOR:
        return CONNECTOR_EDEFAULT == null ? connector != null : !CONNECTOR_EDEFAULT.equals(connector);
      case DeltarxPackage.DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT:
        return SUPER_COMPONENT_EDEFAULT == null ? superComponent != null : !SUPER_COMPONENT_EDEFAULT.equals(superComponent);
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
    result.append(" (connector: ");
    result.append(connector);
    result.append(", superComponent: ");
    result.append(superComponent);
    result.append(')');
    return result.toString();
  }

} //DeltaRemoveConnectorImpl
