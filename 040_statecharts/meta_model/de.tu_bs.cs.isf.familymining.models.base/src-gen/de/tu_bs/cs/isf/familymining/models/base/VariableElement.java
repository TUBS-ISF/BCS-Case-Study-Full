/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariabilityGroupId <em>Variability Group Id</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getContainingModels <em>Containing Models</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getRelatedVariabilityGroupIds <em>Related Variability Group Ids</em>}</li>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariability <em>Variability</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableElement()
 * @model abstract="true"
 * @generated
 */
public interface VariableElement extends VariableValueElement {
	/**
	 * Returns the value of the '<em><b>Variability Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability Group Id</em>' attribute.
	 * @see #setVariabilityGroupId(String)
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableElement_VariabilityGroupId()
	 * @model
	 * @generated
	 */
	String getVariabilityGroupId();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariabilityGroupId <em>Variability Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability Group Id</em>' attribute.
	 * @see #getVariabilityGroupId()
	 * @generated
	 */
	void setVariabilityGroupId(String value);

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
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableElement_ContainingModels()
	 * @model
	 * @generated
	 */
	EList<String> getContainingModels();

	/**
	 * Returns the value of the '<em><b>Related Variability Group Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Variability Group Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Variability Group Ids</em>' attribute list.
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableElement_RelatedVariabilityGroupIds()
	 * @model
	 * @generated
	 */
	EList<String> getRelatedVariabilityGroupIds();

	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link de.tu_bs.cs.isf.familymining.models.base.Variability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Variability
	 * @see #setVariability(Variability)
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getVariableElement_Variability()
	 * @model default="NONE"
	 * @generated
	 */
	Variability getVariability();

	/**
	 * Sets the value of the '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Variability
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(Variability value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks whether the element is contained in the given model.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getContainingModels().contains(model);'"
	 * @generated
	 */
	boolean isContainedInModel(String model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this element is mandatory.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getVariability() == Variability.MANDATORY) {\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this element is alternative.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getVariability() == Variability.ALTERNATIVE) {\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isAlternative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this element is optional.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getVariability() == Variability.OPTIONAL) {\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether this element is optional alternative.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getVariability() == Variability.OPTIONAL_ALTERNATIVE) {\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isOptionalAlternative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether the variability for this element was set.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getVariability() != Variability.NONE) {\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean isVariabilitySet();

} // VariableElement
