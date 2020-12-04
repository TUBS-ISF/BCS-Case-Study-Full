/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.Entity;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getEvents <em>Events</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditions <em>Conditions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getConditionActions <em>Condition Actions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionLabel#getTransitionActions <em>Transition Actions</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransitionLabel()
 * @model
 * @generated
 */
public interface TransitionLabel extends VariableElement, Entity {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransitionLabel_Events()
	 * @model
	 * @generated
	 */
	EList<String> getEvents();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransitionLabel_Conditions()
	 * @model
	 * @generated
	 */
	EList<String> getConditions();

	/**
	 * Returns the value of the '<em><b>Condition Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.ConditionAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Actions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransitionLabel_ConditionActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionAction> getConditionActions();

	/**
	 * Returns the value of the '<em><b>Transition Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.TransitionAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Actions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getTransitionLabel_TransitionActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransitionAction> getTransitionActions();

} // TransitionLabel
