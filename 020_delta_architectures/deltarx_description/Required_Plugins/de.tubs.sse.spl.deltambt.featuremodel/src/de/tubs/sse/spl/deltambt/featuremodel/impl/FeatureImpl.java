/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.featuremodel.impl;

import de.tubs.sse.spl.deltambt.featuremodel.EFeatureType;
import de.tubs.sse.spl.deltambt.featuremodel.Feature;
import de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getOr <em>Or</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getInteract <em>Interact</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.impl.FeatureImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends EObjectImpl implements Feature {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EFeatureType TYPE_EDEFAULT = EFeatureType.MANDATORY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EFeatureType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> or;

	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> alternative;

	/**
	 * The cached value of the '{@link #getSub() <em>Sub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> sub;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> exclude;

	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> require;

	/**
	 * The cached value of the '{@link #getInteract() <em>Interact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteract()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> interact;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFeatureType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EFeatureType newType) {
		EFeatureType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOr() {
		if (or == null) {
			or = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__OR);
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSub() {
		if (sub == null) {
			sub = new EObjectContainmentEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__SUB);
		}
		return sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getExclude() {
		if (exclude == null) {
			exclude = new EObjectResolvingEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getRequire() {
		if (require == null) {
			require = new EObjectResolvingEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__REQUIRE);
		}
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInteract() {
		if (interact == null) {
			interact = new EObjectResolvingEList<Feature>(Feature.class, this, FeaturemodelPackage.FEATURE__INTERACT);
		}
		return interact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeaturemodelPackage.FEATURE__OR:
				return ((InternalEList<?>)getOr()).basicRemove(otherEnd, msgs);
			case FeaturemodelPackage.FEATURE__ALTERNATIVE:
				return ((InternalEList<?>)getAlternative()).basicRemove(otherEnd, msgs);
			case FeaturemodelPackage.FEATURE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
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
			case FeaturemodelPackage.FEATURE__NAME:
				return getName();
			case FeaturemodelPackage.FEATURE__TYPE:
				return getType();
			case FeaturemodelPackage.FEATURE__OR:
				return getOr();
			case FeaturemodelPackage.FEATURE__ALTERNATIVE:
				return getAlternative();
			case FeaturemodelPackage.FEATURE__SUB:
				return getSub();
			case FeaturemodelPackage.FEATURE__EXCLUDE:
				return getExclude();
			case FeaturemodelPackage.FEATURE__REQUIRE:
				return getRequire();
			case FeaturemodelPackage.FEATURE__INTERACT:
				return getInteract();
			case FeaturemodelPackage.FEATURE__DESCRIPTION:
				return getDescription();
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
			case FeaturemodelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeaturemodelPackage.FEATURE__TYPE:
				setType((EFeatureType)newValue);
				return;
			case FeaturemodelPackage.FEATURE__OR:
				getOr().clear();
				getOr().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__REQUIRE:
				getRequire().clear();
				getRequire().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__INTERACT:
				getInteract().clear();
				getInteract().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeaturemodelPackage.FEATURE__DESCRIPTION:
				setDescription((String)newValue);
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
			case FeaturemodelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeaturemodelPackage.FEATURE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FeaturemodelPackage.FEATURE__OR:
				getOr().clear();
				return;
			case FeaturemodelPackage.FEATURE__ALTERNATIVE:
				getAlternative().clear();
				return;
			case FeaturemodelPackage.FEATURE__SUB:
				getSub().clear();
				return;
			case FeaturemodelPackage.FEATURE__EXCLUDE:
				getExclude().clear();
				return;
			case FeaturemodelPackage.FEATURE__REQUIRE:
				getRequire().clear();
				return;
			case FeaturemodelPackage.FEATURE__INTERACT:
				getInteract().clear();
				return;
			case FeaturemodelPackage.FEATURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case FeaturemodelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeaturemodelPackage.FEATURE__TYPE:
				return type != TYPE_EDEFAULT;
			case FeaturemodelPackage.FEATURE__OR:
				return or != null && !or.isEmpty();
			case FeaturemodelPackage.FEATURE__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
			case FeaturemodelPackage.FEATURE__SUB:
				return sub != null && !sub.isEmpty();
			case FeaturemodelPackage.FEATURE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case FeaturemodelPackage.FEATURE__REQUIRE:
				return require != null && !require.isEmpty();
			case FeaturemodelPackage.FEATURE__INTERACT:
				return interact != null && !interact.isEmpty();
			case FeaturemodelPackage.FEATURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
