/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalValue <em>Temporal Value</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalOperator <em>Temporal Operator</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getOnAction()
 * @model
 * @generated
 */
public interface OnAction extends StateAction {
	/**
	 * Returns the value of the '<em><b>Temporal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Value</em>' attribute.
	 * @see #setTemporalValue(int)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getOnAction_TemporalValue()
	 * @model required="true"
	 * @generated
	 */
	int getTemporalValue();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalValue <em>Temporal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Value</em>' attribute.
	 * @see #getTemporalValue()
	 * @generated
	 */
	void setTemporalValue(int value);

	/**
	 * Returns the value of the '<em><b>Temporal Operator</b></em>' attribute.
	 * The default value is <code>"AFTER"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Operator</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator
	 * @see #setTemporalOperator(TemporalOperator)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getOnAction_TemporalOperator()
	 * @model default="AFTER" required="true"
	 * @generated
	 */
	TemporalOperator getTemporalOperator();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.OnAction#getTemporalOperator <em>Temporal Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Operator</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.TemporalOperator
	 * @see #getTemporalOperator()
	 * @generated
	 */
	void setTemporalOperator(TemporalOperator value);

} // OnAction
