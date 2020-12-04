/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;

import de.tu_bs.cs.isf.familymining.models.base.impl.NodeEntityImpl;
import de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.AbstractState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Region;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl#getStereotypes <em>Stereotypes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.AbstractStateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends NodeEntityImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameters;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Region parent;

	/**
	 * The cached value of the '{@link #getStereotypes() <em>Stereotypes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stereotypes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,String>(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, StateChartsPackage.ABSTRACT_STATE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Region)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateChartsPackage.ABSTRACT_STATE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Region newParent) {
		Region oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.ABSTRACT_STATE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStereotypes() {
		if (stereotypes == null) {
			stereotypes = new EDataTypeUniqueEList<String>(String.class, this, StateChartsPackage.ABSTRACT_STATE__STEREOTYPES);
		}
		return stereotypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.ABSTRACT_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHierarchical() {
		if (this instanceof de.tu_bs.cs.isf.familymining.models.stateoriented.State) {
			if (((de.tu_bs.cs.isf.familymining.models.stateoriented.State) this).getRegions().size() == 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParallel() {
		if (this instanceof de.tu_bs.cs.isf.familymining.models.stateoriented.State) {
			if (((de.tu_bs.cs.isf.familymining.models.stateoriented.State) this).getRegions().size() > 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(final String key, final String value) {
		this.getParameters().put(key, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter(final String key) {
		return this.getParameters().get(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeParameter(final String key) {
		this.getParameters().removeKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsParameter(final String key) {
		return this.getParameters().containsKey(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StateChartsPackage.ABSTRACT_STATE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case StateChartsPackage.ABSTRACT_STATE__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case StateChartsPackage.ABSTRACT_STATE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case StateChartsPackage.ABSTRACT_STATE__STEREOTYPES:
				return getStereotypes();
			case StateChartsPackage.ABSTRACT_STATE__NAME:
				return getName();
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
			case StateChartsPackage.ABSTRACT_STATE__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case StateChartsPackage.ABSTRACT_STATE__PARENT:
				setParent((Region)newValue);
				return;
			case StateChartsPackage.ABSTRACT_STATE__STEREOTYPES:
				getStereotypes().clear();
				getStereotypes().addAll((Collection<? extends String>)newValue);
				return;
			case StateChartsPackage.ABSTRACT_STATE__NAME:
				setName((String)newValue);
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
			case StateChartsPackage.ABSTRACT_STATE__PARAMETERS:
				getParameters().clear();
				return;
			case StateChartsPackage.ABSTRACT_STATE__PARENT:
				setParent((Region)null);
				return;
			case StateChartsPackage.ABSTRACT_STATE__STEREOTYPES:
				getStereotypes().clear();
				return;
			case StateChartsPackage.ABSTRACT_STATE__NAME:
				setName(NAME_EDEFAULT);
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
			case StateChartsPackage.ABSTRACT_STATE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StateChartsPackage.ABSTRACT_STATE__PARENT:
				return parent != null;
			case StateChartsPackage.ABSTRACT_STATE__STEREOTYPES:
				return stereotypes != null && !stereotypes.isEmpty();
			case StateChartsPackage.ABSTRACT_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizedElement.class) {
			switch (derivedFeatureID) {
				case StateChartsPackage.ABSTRACT_STATE__PARAMETERS: return BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterizedElement.class) {
			switch (baseFeatureID) {
				case BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS: return StateChartsPackage.ABSTRACT_STATE__PARAMETERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterizedElement.class) {
			switch (baseOperationID) {
				case BasePackage.PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING: return StateChartsPackage.ABSTRACT_STATE___SET_PARAMETER__STRING_STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING: return StateChartsPackage.ABSTRACT_STATE___GET_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING: return StateChartsPackage.ABSTRACT_STATE___REMOVE_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING: return StateChartsPackage.ABSTRACT_STATE___CONTAINS_PARAMETER__STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StateChartsPackage.ABSTRACT_STATE___IS_HIERARCHICAL:
				return isHierarchical();
			case StateChartsPackage.ABSTRACT_STATE___IS_PARALLEL:
				return isParallel();
			case StateChartsPackage.ABSTRACT_STATE___SET_PARAMETER__STRING_STRING:
				setParameter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StateChartsPackage.ABSTRACT_STATE___GET_PARAMETER__STRING:
				return getParameter((String)arguments.get(0));
			case StateChartsPackage.ABSTRACT_STATE___REMOVE_PARAMETER__STRING:
				removeParameter((String)arguments.get(0));
				return null;
			case StateChartsPackage.ABSTRACT_STATE___CONTAINS_PARAMETER__STRING:
				return containsParameter((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (stereotypes: ");
		result.append(stereotypes);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AbstractStateImpl
