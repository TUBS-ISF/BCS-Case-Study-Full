/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getParameterizedElement()
 * @model abstract="true"
 * @generated
 */
public interface ParameterizedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage#getParameterizedElement_Parameters()
	 * @model mapType="de.tu_bs.cs.isf.familymining.models.base.StringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is a wrapper method, which exists in order to set parameters more conveniently.
	 * It wraps the Map method put(String key, String value) for the Map returned by getParameters().
	 * Consequently, it overwrites any value, which is already set for the given parameter.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getParameters().put(key, value);'"
	 * @generated
	 */
	void setParameter(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is a wrapper method, which exists in order to access parameters more conveniently.
	 * It wraps the Map method get(String key) for the Map returned by getParameters().
	 * It consequently returns null if no value is found for the given key.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getParameters().get(key);'"
	 * @generated
	 */
	String getParameter(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is a wrapper method, which exists in order to remove parameters more conveniently.
	 * It wraps the Map method removeKey(String key) for the Map returned by getParameters().
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.getParameters().removeKey(key);'"
	 * @generated
	 */
	void removeParameter(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is a wrapper method, which exists in order to check whether a given parameter exists more conveniently.
	 * It wraps the Map method containsKey(String key) for the Map returned by getParameters().
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getParameters().containsKey(key);'"
	 * @generated
	 */
	boolean containsParameter(String key);

} // ParameterizedElement
