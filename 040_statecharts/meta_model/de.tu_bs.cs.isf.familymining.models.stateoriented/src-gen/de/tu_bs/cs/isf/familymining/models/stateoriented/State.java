/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getHistory <em>History</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getActions <em>Actions</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getState()
 * @model
 * @generated
 */
public interface State extends IncomingState, OutgoingState {
	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator
	 * @see #setHistory(HistoryOperator)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getState_History()
	 * @model default="NONE" required="true"
	 * @generated
	 */
	HistoryOperator getHistory();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.State#getHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.HistoryOperator
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryOperator value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.StateAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getState_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateAction> getActions();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link de.tu_bs.cs.isf.familymining.models.stateoriented.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getState_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // State
