/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.Component;
import org.xtext.deltarx.deltarx.DeltaAddComponent;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Add Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaAddComponentImpl extends MinimalEObjectImpl.Container implements DeltaAddComponent
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected Component component;

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
  protected DeltaAddComponentImpl()
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
    return DeltarxPackage.Literals.DELTA_ADD_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComponent(Component newComponent, NotificationChain msgs)
  {
    Component oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT, oldComponent, newComponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(Component newComponent)
  {
    if (newComponent != component)
    {
      NotificationChain msgs = null;
      if (component != null)
        msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT, null, msgs);
      if (newComponent != null)
        msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT, null, msgs);
      msgs = basicSetComponent(newComponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT, newComponent, newComponent));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_ADD_COMPONENT__SUPER_COMPONENT, oldSuperComponent, superComponent));
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
      case DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT:
        return basicSetComponent(null, msgs);
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
      case DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT:
        return getComponent();
      case DeltarxPackage.DELTA_ADD_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT:
        setComponent((Component)newValue);
        return;
      case DeltarxPackage.DELTA_ADD_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT:
        setComponent((Component)null);
        return;
      case DeltarxPackage.DELTA_ADD_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_ADD_COMPONENT__COMPONENT:
        return component != null;
      case DeltarxPackage.DELTA_ADD_COMPONENT__SUPER_COMPONENT:
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

} //DeltaAddComponentImpl
