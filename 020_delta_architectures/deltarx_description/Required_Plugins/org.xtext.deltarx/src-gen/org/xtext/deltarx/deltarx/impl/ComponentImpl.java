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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.deltarx.deltarx.Component;
import org.xtext.deltarx.deltarx.Connector;
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.ComponentImpl#getSubcomponents <em>Subcomponents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
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
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectors()
   * @generated
   * @ordered
   */
  protected EList<Connector> connectors;

  /**
   * The cached value of the '{@link #getSubcomponents() <em>Subcomponents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubcomponents()
   * @generated
   * @ordered
   */
  protected EList<Component> subcomponents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return DeltarxPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, DeltarxPackage.COMPONENT__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Connector> getConnectors()
  {
    if (connectors == null)
    {
      connectors = new EObjectContainmentEList<Connector>(Connector.class, this, DeltarxPackage.COMPONENT__CONNECTORS);
    }
    return connectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getSubcomponents()
  {
    if (subcomponents == null)
    {
      subcomponents = new EObjectContainmentEList<Component>(Component.class, this, DeltarxPackage.COMPONENT__SUBCOMPONENTS);
    }
    return subcomponents;
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
      case DeltarxPackage.COMPONENT__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.COMPONENT__CONNECTORS:
        return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.COMPONENT__SUBCOMPONENTS:
        return ((InternalEList<?>)getSubcomponents()).basicRemove(otherEnd, msgs);
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
      case DeltarxPackage.COMPONENT__NAME:
        return getName();
      case DeltarxPackage.COMPONENT__PORTS:
        return getPorts();
      case DeltarxPackage.COMPONENT__CONNECTORS:
        return getConnectors();
      case DeltarxPackage.COMPONENT__SUBCOMPONENTS:
        return getSubcomponents();
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
      case DeltarxPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case DeltarxPackage.COMPONENT__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case DeltarxPackage.COMPONENT__CONNECTORS:
        getConnectors().clear();
        getConnectors().addAll((Collection<? extends Connector>)newValue);
        return;
      case DeltarxPackage.COMPONENT__SUBCOMPONENTS:
        getSubcomponents().clear();
        getSubcomponents().addAll((Collection<? extends Component>)newValue);
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
      case DeltarxPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeltarxPackage.COMPONENT__PORTS:
        getPorts().clear();
        return;
      case DeltarxPackage.COMPONENT__CONNECTORS:
        getConnectors().clear();
        return;
      case DeltarxPackage.COMPONENT__SUBCOMPONENTS:
        getSubcomponents().clear();
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
      case DeltarxPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeltarxPackage.COMPONENT__PORTS:
        return ports != null && !ports.isEmpty();
      case DeltarxPackage.COMPONENT__CONNECTORS:
        return connectors != null && !connectors.isEmpty();
      case DeltarxPackage.COMPONENT__SUBCOMPONENTS:
        return subcomponents != null && !subcomponents.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ComponentImpl
