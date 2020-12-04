/**
 */
package de.tu_bs.cs.isf.familymining.models.base.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.WrappedEObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wrapped EObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.impl.WrappedEObjectImpl#getWrappedEObject <em>Wrapped EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WrappedEObjectImpl extends WrappedTypeImpl implements WrappedEObject {
	/**
	 * The cached value of the '{@link #getWrappedEObject() <em>Wrapped EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject wrappedEObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrappedEObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.WRAPPED_EOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getWrappedEObject() {
		if (wrappedEObject != null && wrappedEObject.eIsProxy()) {
			InternalEObject oldWrappedEObject = (InternalEObject)wrappedEObject;
			wrappedEObject = eResolveProxy(oldWrappedEObject);
			if (wrappedEObject != oldWrappedEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT, oldWrappedEObject, wrappedEObject));
			}
		}
		return wrappedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetWrappedEObject() {
		return wrappedEObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedEObject(EObject newWrappedEObject) {
		EObject oldWrappedEObject = wrappedEObject;
		wrappedEObject = newWrappedEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT, oldWrappedEObject, wrappedEObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT:
				if (resolve) return getWrappedEObject();
				return basicGetWrappedEObject();
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
			case BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT:
				setWrappedEObject((EObject)newValue);
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
			case BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT:
				setWrappedEObject((EObject)null);
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
			case BasePackage.WRAPPED_EOBJECT__WRAPPED_EOBJECT:
				return wrappedEObject != null;
		}
		return super.eIsSet(featureID);
	}

} //WrappedEObjectImpl
