/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incoming State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.IncomingState#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getIncomingState()
 * @model abstract="true"
 * @generated
 */
public interface IncomingState extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getIncomingState_IncomingTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // IncomingState
