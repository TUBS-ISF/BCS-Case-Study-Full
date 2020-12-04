/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getBaseModel <em>Base Model</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getCompareModels <em>Compare Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getContainingModels <em>Containing Models</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableModel()
 * @model abstract="true"
 * @generated
 */
public interface VariableModel extends VariableValueElement {
	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' attribute.
	 * @see #setBaseModel(String)
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableModel_BaseModel()
	 * @model
	 * @generated
	 */
	String getBaseModel();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel#getBaseModel <em>Base Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' attribute.
	 * @see #getBaseModel()
	 * @generated
	 */
	void setBaseModel(String value);

	/**
	 * Returns the value of the '<em><b>Compare Models</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare Models</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare Models</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableModel_CompareModels()
	 * @model
	 * @generated
	 */
	EList<String> getCompareModels();

	/**
	 * Returns the value of the '<em><b>Containing Models</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Models</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Models</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableModel_ContainingModels()
	 * @model
	 * @generated
	 */
	EList<String> getContainingModels();

} // VariableModel
