/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.Connector;
import org.xtext.deltarx.deltarx.DeltaAddConnector;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Add Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaAddConnectorImpl extends MinimalEObjectImpl.Container implements DeltaAddConnector
{
  /**
   * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnector()
   * @generated
   * @ordered
   */
  protected Connector connector;

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
  protected DeltaAddConnectorImpl()
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
    return DeltarxPackage.Literals.DELTA_ADD_CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connector getConnector()
  {
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs)
  {
    Connector oldConnector = connector;
    connector = newConnector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR, oldConnector, newConnector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnector(Connector newConnector)
  {
    if (newConnector != connector)
    {
      NotificationChain msgs = null;
      if (connector != null)
        msgs = ((InternalEObject)connector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR, null, msgs);
      if (newConnector != null)
        msgs = ((InternalEObject)newConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR, null, msgs);
      msgs = basicSetConnector(newConnector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR, newConnector, newConnector));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_CONNECTOR__SUPER_COMPONENT, oldSuperComponent, superComponent));
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
      case DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR:
        return basicSetConnector(null, msgs);
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
      case DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR:
        return getConnector();
      case DeltarxPackage.DELTA_ADD_CONNECTOR__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR:
        setConnector((Connector)newValue);
        return;
      case DeltarxPackage.DELTA_ADD_CONNECTOR__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR:
        setConnector((Connector)null);
        return;
      case DeltarxPackage.DELTA_ADD_CONNECTOR__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_CONNECTOR__CONNECTOR:
        return connector != null;
      case DeltarxPackage.DELTA_ADD_CONNECTOR__SUPER_COMPONENT:
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
    result.append(" (superComponent: ");
    result.append(superComponent);
    result.append(')');
    return result.toString();
  }

} //DeltaAddConnectorImpl
