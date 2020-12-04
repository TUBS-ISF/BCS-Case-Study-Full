/**
 */
package de.tu_bs.cs.isf.familymining.models.stateoriented;

import de.tu_bs.cs.isf.familymining.models.base.Entity;
import de.tu_bs.cs.isf.familymining.models.base.VariableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Action#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends VariableElement, Entity {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see de.tu_bs.cs.isf.familymining.models.stateoriented.StateChartsPackage#getAction_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.stateoriented.Action#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Action
