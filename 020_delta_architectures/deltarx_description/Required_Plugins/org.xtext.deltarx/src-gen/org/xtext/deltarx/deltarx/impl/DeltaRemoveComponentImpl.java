/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.deltarx.deltarx.DeltaRemoveComponent;
import org.xtext.deltarx.deltarx.DeltarxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Remove Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl#getSuperComponent <em>Super Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaRemoveComponentImpl extends MinimalEObjectImpl.Container implements DeltaRemoveComponent
{
  /**
   * The default value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected static final String COMPONENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected String component = COMPONENT_EDEFAULT;

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
  protected DeltaRemoveComponentImpl()
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
    return DeltarxPackage.Literals.DELTA_REMOVE_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(String newComponent)
  {
    String oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_COMPONENT__COMPONENT, oldComponent, component));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA_REMOVE_COMPONENT__SUPER_COMPONENT, oldSuperComponent, superComponent));
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
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__COMPONENT:
        return getComponent();
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__COMPONENT:
        setComponent((String)newValue);
        return;
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__COMPONENT:
        setComponent(COMPONENT_EDEFAULT);
        return;
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__SUPER_COMPONENT:
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
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__COMPONENT:
        return COMPONENT_EDEFAULT == null ? component != null : !COMPONENT_EDEFAULT.equals(component);
      case DeltarxPackage.DELTA_REMOVE_COMPONENT__SUPER_COMPONENT:
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
    result.append(" (component: ");
    result.append(component);
    result.append(", superComponent: ");
    result.append(superComponent);
    result.append(')');
    return result.toString();
  }

} //DeltaRemoveComponentImpl
