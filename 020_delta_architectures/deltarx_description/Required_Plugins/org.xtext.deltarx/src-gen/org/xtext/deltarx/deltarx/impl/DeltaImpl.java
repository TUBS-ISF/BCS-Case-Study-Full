/**
 */
package org.xtext.deltarx.deltarx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.deltarx.deltarx.Delta;
import org.xtext.deltarx.deltarx.DeltaAddComponent;
import org.xtext.deltarx.deltarx.DeltaAddConnector;
import org.xtext.deltarx.deltarx.DeltaAddPort;
import org.xtext.deltarx.deltarx.DeltaRemoveComponent;
import org.xtext.deltarx.deltarx.DeltaRemoveConnector;
import org.xtext.deltarx.deltarx.DeltaRemovePort;
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getAfter <em>After</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getAppcon <em>Appcon</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getRemoveConnector <em>Remove Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getRemoveComponent <em>Remove Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getRemoveSignal <em>Remove Signal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getRemovePort <em>Remove Port</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getNewSignal <em>New Signal</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getNewComponent <em>New Component</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getNewConnector <em>New Connector</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltaImpl#getNewPort <em>New Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaImpl extends MinimalEObjectImpl.Container implements Delta
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected EList<String> after;

  /**
   * The default value of the '{@link #getAppcon() <em>Appcon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppcon()
   * @generated
   * @ordered
   */
  protected static final String APPCON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAppcon() <em>Appcon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAppcon()
   * @generated
   * @ordered
   */
  protected String appcon = APPCON_EDEFAULT;

  /**
   * The cached value of the '{@link #getRemoveConnector() <em>Remove Connector</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveConnector()
   * @generated
   * @ordered
   */
  protected EList<DeltaRemoveConnector> removeConnector;

  /**
   * The cached value of the '{@link #getRemoveComponent() <em>Remove Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveComponent()
   * @generated
   * @ordered
   */
  protected EList<DeltaRemoveComponent> removeComponent;

  /**
   * The cached value of the '{@link #getRemoveSignal() <em>Remove Signal</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveSignal()
   * @generated
   * @ordered
   */
  protected EList<Signal> removeSignal;

  /**
   * The cached value of the '{@link #getRemovePort() <em>Remove Port</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemovePort()
   * @generated
   * @ordered
   */
  protected EList<DeltaRemovePort> removePort;

  /**
   * The cached value of the '{@link #getNewSignal() <em>New Signal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewSignal()
   * @generated
   * @ordered
   */
  protected EList<Signal> newSignal;

  /**
   * The cached value of the '{@link #getNewComponent() <em>New Component</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewComponent()
   * @generated
   * @ordered
   */
  protected EList<DeltaAddComponent> newComponent;

  /**
   * The cached value of the '{@link #getNewConnector() <em>New Connector</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewConnector()
   * @generated
   * @ordered
   */
  protected EList<DeltaAddConnector> newConnector;

  /**
   * The cached value of the '{@link #getNewPort() <em>New Port</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewPort()
   * @generated
   * @ordered
   */
  protected EList<DeltaAddPort> newPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltaImpl()
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
    return DeltarxPackage.Literals.DELTA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAfter()
  {
    if (after == null)
    {
      after = new EDataTypeEList<String>(String.class, this, DeltarxPackage.DELTA__AFTER);
    }
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAppcon()
  {
    return appcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAppcon(String newAppcon)
  {
    String oldAppcon = appcon;
    appcon = newAppcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTA__APPCON, oldAppcon, appcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaRemoveConnector> getRemoveConnector()
  {
    if (removeConnector == null)
    {
      removeConnector = new EObjectContainmentEList<DeltaRemoveConnector>(DeltaRemoveConnector.class, this, DeltarxPackage.DELTA__REMOVE_CONNECTOR);
    }
    return removeConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaRemoveComponent> getRemoveComponent()
  {
    if (removeComponent == null)
    {
      removeComponent = new EObjectContainmentEList<DeltaRemoveComponent>(DeltaRemoveComponent.class, this, DeltarxPackage.DELTA__REMOVE_COMPONENT);
    }
    return removeComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getRemoveSignal()
  {
    if (removeSignal == null)
    {
      removeSignal = new EObjectResolvingEList<Signal>(Signal.class, this, DeltarxPackage.DELTA__REMOVE_SIGNAL);
    }
    return removeSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaRemovePort> getRemovePort()
  {
    if (removePort == null)
    {
      removePort = new EObjectContainmentEList<DeltaRemovePort>(DeltaRemovePort.class, this, DeltarxPackage.DELTA__REMOVE_PORT);
    }
    return removePort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getNewSignal()
  {
    if (newSignal == null)
    {
      newSignal = new EObjectContainmentEList<Signal>(Signal.class, this, DeltarxPackage.DELTA__NEW_SIGNAL);
    }
    return newSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaAddComponent> getNewComponent()
  {
    if (newComponent == null)
    {
      newComponent = new EObjectContainmentEList<DeltaAddComponent>(DeltaAddComponent.class, this, DeltarxPackage.DELTA__NEW_COMPONENT);
    }
    return newComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaAddConnector> getNewConnector()
  {
    if (newConnector == null)
    {
      newConnector = new EObjectContainmentEList<DeltaAddConnector>(DeltaAddConnector.class, this, DeltarxPackage.DELTA__NEW_CONNECTOR);
    }
    return newConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DeltaAddPort> getNewPort()
  {
    if (newPort == null)
    {
      newPort = new EObjectContainmentEList<DeltaAddPort>(DeltaAddPort.class, this, DeltarxPackage.DELTA__NEW_PORT);
    }
    return newPort;
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
      case DeltarxPackage.DELTA__REMOVE_CONNECTOR:
        return ((InternalEList<?>)getRemoveConnector()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__REMOVE_COMPONENT:
        return ((InternalEList<?>)getRemoveComponent()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__REMOVE_PORT:
        return ((InternalEList<?>)getRemovePort()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__NEW_SIGNAL:
        return ((InternalEList<?>)getNewSignal()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__NEW_COMPONENT:
        return ((InternalEList<?>)getNewComponent()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__NEW_CONNECTOR:
        return ((InternalEList<?>)getNewConnector()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTA__NEW_PORT:
        return ((InternalEList<?>)getNewPort()).basicRemove(otherEnd, msgs);
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
      case DeltarxPackage.DELTA__NAME:
        return getName();
      case DeltarxPackage.DELTA__AFTER:
        return getAfter();
      case DeltarxPackage.DELTA__APPCON:
        return getAppcon();
      case DeltarxPackage.DELTA__REMOVE_CONNECTOR:
        return getRemoveConnector();
      case DeltarxPackage.DELTA__REMOVE_COMPONENT:
        return getRemoveComponent();
      case DeltarxPackage.DELTA__REMOVE_SIGNAL:
        return getRemoveSignal();
      case DeltarxPackage.DELTA__REMOVE_PORT:
        return getRemovePort();
      case DeltarxPackage.DELTA__NEW_SIGNAL:
        return getNewSignal();
      case DeltarxPackage.DELTA__NEW_COMPONENT:
        return getNewComponent();
      case DeltarxPackage.DELTA__NEW_CONNECTOR:
        return getNewConnector();
      case DeltarxPackage.DELTA__NEW_PORT:
        return getNewPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeltarxPackage.DELTA__NAME:
        setName((String)newValue);
        return;
      case DeltarxPackage.DELTA__AFTER:
        getAfter().clear();
        getAfter().addAll((Collection<? extends String>)newValue);
        return;
      case DeltarxPackage.DELTA__APPCON:
        setAppcon((String)newValue);
        return;
      case DeltarxPackage.DELTA__REMOVE_CONNECTOR:
        getRemoveConnector().clear();
        getRemoveConnector().addAll((Collection<? extends DeltaRemoveConnector>)newValue);
        return;
      case DeltarxPackage.DELTA__REMOVE_COMPONENT:
        getRemoveComponent().clear();
        getRemoveComponent().addAll((Collection<? extends DeltaRemoveComponent>)newValue);
        return;
      case DeltarxPackage.DELTA__REMOVE_SIGNAL:
        getRemoveSignal().clear();
        getRemoveSignal().addAll((Collection<? extends Signal>)newValue);
        return;
      case DeltarxPackage.DELTA__REMOVE_PORT:
        getRemovePort().clear();
        getRemovePort().addAll((Collection<? extends DeltaRemovePort>)newValue);
        return;
      case DeltarxPackage.DELTA__NEW_SIGNAL:
        getNewSignal().clear();
        getNewSignal().addAll((Collection<? extends Signal>)newValue);
        return;
      case DeltarxPackage.DELTA__NEW_COMPONENT:
        getNewComponent().clear();
        getNewComponent().addAll((Collection<? extends DeltaAddComponent>)newValue);
        return;
      case DeltarxPackage.DELTA__NEW_CONNECTOR:
        getNewConnector().clear();
        getNewConnector().addAll((Collection<? extends DeltaAddConnector>)newValue);
        return;
      case DeltarxPackage.DELTA__NEW_PORT:
        getNewPort().clear();
        getNewPort().addAll((Collection<? extends DeltaAddPort>)newValue);
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
      case DeltarxPackage.DELTA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeltarxPackage.DELTA__AFTER:
        getAfter().clear();
        return;
      case DeltarxPackage.DELTA__APPCON:
        setAppcon(APPCON_EDEFAULT);
        return;
      case DeltarxPackage.DELTA__REMOVE_CONNECTOR:
        getRemoveConnector().clear();
        return;
      case DeltarxPackage.DELTA__REMOVE_COMPONENT:
        getRemoveComponent().clear();
        return;
      case DeltarxPackage.DELTA__REMOVE_SIGNAL:
        getRemoveSignal().clear();
        return;
      case DeltarxPackage.DELTA__REMOVE_PORT:
        getRemovePort().clear();
        return;
      case DeltarxPackage.DELTA__NEW_SIGNAL:
        getNewSignal().clear();
        return;
      case DeltarxPackage.DELTA__NEW_COMPONENT:
        getNewComponent().clear();
        return;
      case DeltarxPackage.DELTA__NEW_CONNECTOR:
        getNewConnector().clear();
        return;
      case DeltarxPackage.DELTA__NEW_PORT:
        getNewPort().clear();
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
      case DeltarxPackage.DELTA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeltarxPackage.DELTA__AFTER:
        return after != null && !after.isEmpty();
      case DeltarxPackage.DELTA__APPCON:
        return APPCON_EDEFAULT == null ? appcon != null : !APPCON_EDEFAULT.equals(appcon);
      case DeltarxPackage.DELTA__REMOVE_CONNECTOR:
        return removeConnector != null && !removeConnector.isEmpty();
      case DeltarxPackage.DELTA__REMOVE_COMPONENT:
        return removeComponent != null && !removeComponent.isEmpty();
      case DeltarxPackage.DELTA__REMOVE_SIGNAL:
        return removeSignal != null && !removeSignal.isEmpty();
      case DeltarxPackage.DELTA__REMOVE_PORT:
        return removePort != null && !removePort.isEmpty();
      case DeltarxPackage.DELTA__NEW_SIGNAL:
        return newSignal != null && !newSignal.isEmpty();
      case DeltarxPackage.DELTA__NEW_COMPONENT:
        return newComponent != null && !newComponent.isEmpty();
      case DeltarxPackage.DELTA__NEW_CONNECTOR:
        return newConnector != null && !newConnector.isEmpty();
      case DeltarxPackage.DELTA__NEW_PORT:
        return newPort != null && !newPort.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", after: ");
    result.append(after);
    result.append(", appcon: ");
    result.append(appcon);
    result.append(')');
    return result.toString();
  }

} //DeltaImpl
