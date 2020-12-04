/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.configmanagement;

import de.tubs.sse.spl.deltambt.featuremodel.Feature;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.configmanagement.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link de.tubs.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see de.tubs.sse.spl.deltambt.configmanagement.ConfigmanagementPackage#getConfiguration_Features()
	 * @model keys="name" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Configuration
