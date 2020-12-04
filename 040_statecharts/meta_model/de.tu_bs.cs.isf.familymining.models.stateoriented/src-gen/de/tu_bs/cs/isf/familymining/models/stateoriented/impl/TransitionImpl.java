/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented.impl;

import de.tu_bs.cs.isf.familymining.models.base.BasePackage;
import de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement;

import de.tu_bs.cs.isf.familymining.models.base.impl.EdgeEntityImpl;
import de.tu_bs.cs.isf.familymining.models.base.impl.StringToStringMapEntryImpl;

import de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState;
import de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage;
import de.tu_bs.cs.isf.familymining.models.stateoriented.Transition;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel;
import de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionType;

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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getStereotypes <em>Stereotypes</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends EdgeEntityImpl implements Transition {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionType TYPE_EDEFAULT = TransitionType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TransitionType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutgoingState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IncomingState target;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected TransitionLabel label;

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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateChartsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameters() {
		if (parameters == null) {
			parameters = new EcoreEMap<String,String>(BasePackage.Literals.STRING_TO_STRING_MAP_ENTRY, StringToStringMapEntryImpl.class, this, StateChartsPackage.TRANSITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TransitionType newType) {
		TransitionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStereotypes() {
		if (stereotypes == null) {
			stereotypes = new EDataTypeUniqueEList<String>(String.class, this, StateChartsPackage.TRANSITION__STEREOTYPES);
		}
		return stereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (OutgoingState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateChartsPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutgoingState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(OutgoingState newSource) {
		OutgoingState oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IncomingState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateChartsPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncomingState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IncomingState newTarget) {
		IncomingState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(TransitionLabel newLabel, NotificationChain msgs) {
		TransitionLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(TransitionLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateChartsPackage.TRANSITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateChartsPackage.TRANSITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__LABEL, newLabel, newLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateChartsPackage.TRANSITION__NAME, oldName, name));
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
			case StateChartsPackage.TRANSITION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case StateChartsPackage.TRANSITION__LABEL:
				return basicSetLabel(null, msgs);
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
			case StateChartsPackage.TRANSITION__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case StateChartsPackage.TRANSITION__PRIORITY:
				return getPriority();
			case StateChartsPackage.TRANSITION__TYPE:
				return getType();
			case StateChartsPackage.TRANSITION__STEREOTYPES:
				return getStereotypes();
			case StateChartsPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StateChartsPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StateChartsPackage.TRANSITION__LABEL:
				return getLabel();
			case StateChartsPackage.TRANSITION__NAME:
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
			case StateChartsPackage.TRANSITION__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case StateChartsPackage.TRANSITION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case StateChartsPackage.TRANSITION__TYPE:
				setType((TransitionType)newValue);
				return;
			case StateChartsPackage.TRANSITION__STEREOTYPES:
				getStereotypes().clear();
				getStereotypes().addAll((Collection<? extends String>)newValue);
				return;
			case StateChartsPackage.TRANSITION__SOURCE:
				setSource((OutgoingState)newValue);
				return;
			case StateChartsPackage.TRANSITION__TARGET:
				setTarget((IncomingState)newValue);
				return;
			case StateChartsPackage.TRANSITION__LABEL:
				setLabel((TransitionLabel)newValue);
				return;
			case StateChartsPackage.TRANSITION__NAME:
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
			case StateChartsPackage.TRANSITION__PARAMETERS:
				getParameters().clear();
				return;
			case StateChartsPackage.TRANSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case StateChartsPackage.TRANSITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StateChartsPackage.TRANSITION__STEREOTYPES:
				getStereotypes().clear();
				return;
			case StateChartsPackage.TRANSITION__SOURCE:
				setSource((OutgoingState)null);
				return;
			case StateChartsPackage.TRANSITION__TARGET:
				setTarget((IncomingState)null);
				return;
			case StateChartsPackage.TRANSITION__LABEL:
				setLabel((TransitionLabel)null);
				return;
			case StateChartsPackage.TRANSITION__NAME:
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
			case StateChartsPackage.TRANSITION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case StateChartsPackage.TRANSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case StateChartsPackage.TRANSITION__TYPE:
				return type != TYPE_EDEFAULT;
			case StateChartsPackage.TRANSITION__STEREOTYPES:
				return stereotypes != null && !stereotypes.isEmpty();
			case StateChartsPackage.TRANSITION__SOURCE:
				return source != null;
			case StateChartsPackage.TRANSITION__TARGET:
				return target != null;
			case StateChartsPackage.TRANSITION__LABEL:
				return label != null;
			case StateChartsPackage.TRANSITION__NAME:
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
				case StateChartsPackage.TRANSITION__PARAMETERS: return BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS;
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
				case BasePackage.PARAMETERIZED_ELEMENT__PARAMETERS: return StateChartsPackage.TRANSITION__PARAMETERS;
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
				case BasePackage.PARAMETERIZED_ELEMENT___SET_PARAMETER__STRING_STRING: return StateChartsPackage.TRANSITION___SET_PARAMETER__STRING_STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___GET_PARAMETER__STRING: return StateChartsPackage.TRANSITION___GET_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___REMOVE_PARAMETER__STRING: return StateChartsPackage.TRANSITION___REMOVE_PARAMETER__STRING;
				case BasePackage.PARAMETERIZED_ELEMENT___CONTAINS_PARAMETER__STRING: return StateChartsPackage.TRANSITION___CONTAINS_PARAMETER__STRING;
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
			case StateChartsPackage.TRANSITION___SET_PARAMETER__STRING_STRING:
				setParameter((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StateChartsPackage.TRANSITION___GET_PARAMETER__STRING:
				return getParameter((String)arguments.get(0));
			case StateChartsPackage.TRANSITION___REMOVE_PARAMETER__STRING:
				removeParameter((String)arguments.get(0));
				return null;
			case StateChartsPackage.TRANSITION___CONTAINS_PARAMETER__STRING:
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", type: ");
		result.append(type);
		result.append(", stereotypes: ");
		result.append(stereotypes);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
