/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.configmanagement.impl;

import de.tubs.sse.spl.deltambt.featuremodel.FeatureModel;

import de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage;
import de.tubs.sse.spl.deltambt.configmanagement.Configuration;
import de.tubs.sse.spl.deltambt.configmanagement.ConfigurationRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl#getBelongToSPL <em>Belong To SPL</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl#getLinkedToFM <em>Linked To FM</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.impl.ConfigurationRepositoryImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationRepositoryImpl extends EObjectImpl implements ConfigurationRepository {
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
	 * The cached value of the '{@link #getLinkedToFM() <em>Linked To FM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedToFM()
	 * @generated
	 * @ordered
	 */
	protected FeatureModel linkedToFM;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigmanagementPackage.Literals.CONFIGURATION_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.CONFIGURATION_REPOSITORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.CONFIGURATION_REPOSITORY__BELONG_TO_SPL, oldBelongToSPL, belongToSPL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel getLinkedToFM() {
		if (linkedToFM != null && linkedToFM.eIsProxy()) {
			InternalEObject oldLinkedToFM = (InternalEObject)linkedToFM;
			linkedToFM = (FeatureModel)eResolveProxy(oldLinkedToFM);
			if (linkedToFM != oldLinkedToFM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM, oldLinkedToFM, linkedToFM));
			}
		}
		return linkedToFM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModel basicGetLinkedToFM() {
		return linkedToFM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedToFM(FeatureModel newLinkedToFM) {
		FeatureModel oldLinkedToFM = linkedToFM;
		linkedToFM = newLinkedToFM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM, oldLinkedToFM, linkedToFM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList<Configuration>(Configuration.class, this, ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
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
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__NAME:
				return getName();
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__BELONG_TO_SPL:
				return getBelongToSPL();
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM:
				if (resolve) return getLinkedToFM();
				return basicGetLinkedToFM();
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS:
				return getConfigs();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__BELONG_TO_SPL:
				setBelongToSPL((String)newValue);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM:
				setLinkedToFM((FeatureModel)newValue);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends Configuration>)newValue);
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
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__BELONG_TO_SPL:
				setBelongToSPL(BELONG_TO_SPL_EDEFAULT);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM:
				setLinkedToFM((FeatureModel)null);
				return;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS:
				getConfigs().clear();
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
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__BELONG_TO_SPL:
				return BELONG_TO_SPL_EDEFAULT == null ? belongToSPL != null : !BELONG_TO_SPL_EDEFAULT.equals(belongToSPL);
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__LINKED_TO_FM:
				return linkedToFM != null;
			case ConfigmanagementPackage.CONFIGURATION_REPOSITORY__CONFIGS:
				return configs != null && !configs.isEmpty();
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

} //ConfigurationRepositoryImpl
