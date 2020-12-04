/**
 */
package de.tu_bs.cs.isf.deltamsc.deltaMSC.impl;

import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta MSC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.deltamsc.deltaMSC.impl.DeltaMSCImpl#getTestcases <em>Testcases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeltaMSCImpl extends MinimalEObjectImpl.Container implements DeltaMSC
{
  /**
   * The cached value of the '{@link #getTestcases() <em>Testcases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestcases()
   * @generated
   * @ordered
   */
  protected EList<Testcase> testcases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeltaMSCImpl()
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
    return DeltaMSCPackage.Literals.DELTA_MSC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Testcase> getTestcases()
  {
    if (testcases == null)
    {
      testcases = new EObjectContainmentEList<Testcase>(Testcase.class, this, DeltaMSCPackage.DELTA_MSC__TESTCASES);
    }
    return testcases;
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
      case DeltaMSCPackage.DELTA_MSC__TESTCASES:
        return ((InternalEList<?>)getTestcases()).basicRemove(otherEnd, msgs);
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
      case DeltaMSCPackage.DELTA_MSC__TESTCASES:
        return getTestcases();
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
      case DeltaMSCPackage.DELTA_MSC__TESTCASES:
        getTestcases().clear();
        getTestcases().addAll((Collection<? extends Testcase>)newValue);
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
      case DeltaMSCPackage.DELTA_MSC__TESTCASES:
        getTestcases().clear();
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
      case DeltaMSCPackage.DELTA_MSC__TESTCASES:
        return testcases != null && !testcases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeltaMSCImpl
