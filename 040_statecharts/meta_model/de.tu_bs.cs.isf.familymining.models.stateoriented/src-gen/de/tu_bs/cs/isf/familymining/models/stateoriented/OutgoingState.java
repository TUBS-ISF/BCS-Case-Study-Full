/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outgoing State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OutgoingState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getOutgoingState()
 * @model abstract="true"
 * @generated
 */
public interface OutgoingState extends AbstractState {
	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getOutgoingState_OutgoingTransitions()
	 * @model
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // OutgoingState
