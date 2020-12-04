/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.featuremodel.impl;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;
import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureModelImpl#getBelongToSPL <em>Belong To SPL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelImpl extends EObjectImpl implements FeatureModel {
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
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Feature root;

	/**
	 * The default value of the '{@link #getBelongToSPL() <em>Belong To SPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongToSPL()
	 * @generated
	 * @ordered
	 */
	protected static final String BELONG_TO_SPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBelongToSPL() <em>Belong To SPL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongToSPL()
	 * @generated
	 * @ordered
	 */
	protected String belongToSPL = BELONG_TO_SPL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Feature newRoot, NotificationChain msgs) {
		Feature oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_MODEL__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Feature newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE_MODEL__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE_MODEL__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_MODEL__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBelongToSPL() {
		return belongToSPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongToSPL(String newBelongToSPL) {
		String oldBelongToSPL = belongToSPL;
		belongToSPL = newBelongToSPL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_MODEL__BELONG_TO_SPL, oldBelongToSPL, belongToSPL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__ROOT:
				return basicSetRoot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__NAME:
				return getName();
			case FeaturemodelPackage.FEATURE_MODEL__ROOT:
				return getRoot();
			case FeaturemodelPackage.FEATURE_MODEL__BELONG_TO_SPL:
				return getBelongToSPL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__NAME:
				setName((String)newValue);
				return;
			case FeaturemodelPackage.FEATURE_MODEL__ROOT:
				setRoot((Feature)newValue);
				return;
			case FeaturemodelPackage.FEATURE_MODEL__BELONG_TO_SPL:
				setBelongToSPL((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturemodelPackage.FEATURE_MODEL__ROOT:
				setRoot((Feature)null);
				return;
			case FeaturemodelPackage.FEATURE_MODEL__BELONG_TO_SPL:
				setBelongToSPL(BELONG_TO_SPL_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturemodelPackage.FEATURE_MODEL__ROOT:
				return root != null;
			case FeaturemodelPackage.FEATURE_MODEL__BELONG_TO_SPL:
				return BELONG_TO_SPL_EDEFAULT == null ? belongToSPL != null : !BELONG_TO_SPL_EDEFAULT.equals(belongToSPL);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", belongToSPL: ");
		result.append(belongToSPL);
		result.append(')');
		return result.toString();
	}

} //FeatureModelImpl
