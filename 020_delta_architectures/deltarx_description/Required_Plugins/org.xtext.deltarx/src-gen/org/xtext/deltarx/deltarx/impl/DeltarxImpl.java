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
import org.xtext.deltarx.deltarx.Delta;
import org.xtext.deltarx.deltarx.Deltarx;
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deltarx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getFmdir <em>Fmdir</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl#getDeltas <em>Deltas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltarxImpl extends MinimalEObjectImpl.Container implements Deltarx
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
   * The default value of the '{@link #getFmdir() <em>Fmdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFmdir()
   * @generated
   * @ordered
   */
  protected static final String FMDIR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFmdir() <em>Fmdir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFmdir()
   * @generated
   * @ordered
   */
  protected String fmdir = FMDIR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signal> signals;

  /**
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

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
   * The cached value of the '{@link #getDeltas() <em>Deltas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeltas()
   * @generated
   * @ordered
   */
  protected EList<Delta> deltas;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltarxImpl()
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
    return DeltarxPackage.Literals.DELTARX;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTARX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFmdir()
  {
    return fmdir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFmdir(String newFmdir)
  {
    String oldFmdir = fmdir;
    fmdir = newFmdir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeltarxPackage.DELTARX__FMDIR, oldFmdir, fmdir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<Signal>(Signal.class, this, DeltarxPackage.DELTARX__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, DeltarxPackage.DELTARX__COMPONENTS);
    }
    return components;
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
      connectors = new EObjectContainmentEList<Connector>(Connector.class, this, DeltarxPackage.DELTARX__CONNECTORS);
    }
    return connectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Delta> getDeltas()
  {
    if (deltas == null)
    {
      deltas = new EObjectContainmentEList<Delta>(Delta.class, this, DeltarxPackage.DELTARX__DELTAS);
    }
    return deltas;
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
      case DeltarxPackage.DELTARX__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTARX__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTARX__CONNECTORS:
        return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
      case DeltarxPackage.DELTARX__DELTAS:
        return ((InternalEList<?>)getDeltas()).basicRemove(otherEnd, msgs);
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
      case DeltarxPackage.DELTARX__NAME:
        return getName();
      case DeltarxPackage.DELTARX__FMDIR:
        return getFmdir();
      case DeltarxPackage.DELTARX__SIGNALS:
        return getSignals();
      case DeltarxPackage.DELTARX__COMPONENTS:
        return getComponents();
      case DeltarxPackage.DELTARX__CONNECTORS:
        return getConnectors();
      case DeltarxPackage.DELTARX__DELTAS:
        return getDeltas();
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
      case DeltarxPackage.DELTARX__NAME:
        setName((String)newValue);
        return;
      case DeltarxPackage.DELTARX__FMDIR:
        setFmdir((String)newValue);
        return;
      case DeltarxPackage.DELTARX__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signal>)newValue);
        return;
      case DeltarxPackage.DELTARX__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case DeltarxPackage.DELTARX__CONNECTORS:
        getConnectors().clear();
        getConnectors().addAll((Collection<? extends Connector>)newValue);
        return;
      case DeltarxPackage.DELTARX__DELTAS:
        getDeltas().clear();
        getDeltas().addAll((Collection<? extends Delta>)newValue);
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
      case DeltarxPackage.DELTARX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeltarxPackage.DELTARX__FMDIR:
        setFmdir(FMDIR_EDEFAULT);
        return;
      case DeltarxPackage.DELTARX__SIGNALS:
        getSignals().clear();
        return;
      case DeltarxPackage.DELTARX__COMPONENTS:
        getComponents().clear();
        return;
      case DeltarxPackage.DELTARX__CONNECTORS:
        getConnectors().clear();
        return;
      case DeltarxPackage.DELTARX__DELTAS:
        getDeltas().clear();
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
      case DeltarxPackage.DELTARX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeltarxPackage.DELTARX__FMDIR:
        return FMDIR_EDEFAULT == null ? fmdir != null : !FMDIR_EDEFAULT.equals(fmdir);
      case DeltarxPackage.DELTARX__SIGNALS:
        return signals != null && !signals.isEmpty();
      case DeltarxPackage.DELTARX__COMPONENTS:
        return components != null && !components.isEmpty();
      case DeltarxPackage.DELTARX__CONNECTORS:
        return connectors != null && !connectors.isEmpty();
      case DeltarxPackage.DELTARX__DELTAS:
        return deltas != null && !deltas.isEmpty();
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
    result.append(", fmdir: ");
    result.append(fmdir);
    result.append(')');
    return result.toString();
  }

} //DeltarxImpl
