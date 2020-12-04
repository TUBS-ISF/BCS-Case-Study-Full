/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.tubs.sse.spl.deltambt.featuremodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getType <em>Type</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getOr <em>Or</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getSub <em>Sub</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getExclude <em>Exclude</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getRequire <em>Require</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getInteract <em>Interact</em>}</li>
 *   <li>{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
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
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.tubs.sse.spl.deltambt.featuremodel.EFeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.EFeatureType
	 * @see #setType(EFeatureType)
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Type()
	 * @model
	 * @generated
	 */
	EFeatureType getType();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.EFeatureType
	 * @see #getType()
	 * @generated
	 */
	void setType(EFeatureType value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Or()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Feature> getOr();

	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Alternative()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Feature> getAlternative();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Sub()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Feature> getSub();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Exclude()
	 * @model keys="name"
	 * @generated
	 */
	EList<Feature> getExclude();

	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Require()
	 * @model keys="name"
	 * @generated
	 */
	EList<Feature> getRequire();

	/**
	 * Returns the value of the '<em><b>Interact</b></em>' reference list.
	 * The list contents are of type {@link de.tubs.sse.spl.deltambt.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interact</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interact</em>' reference list.
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Interact()
	 * @model keys="name"
	 * @generated
	 */
	EList<Feature> getInteract();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.tubs.sse.spl.deltambt.featuremodel.FeaturemodelPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.tubs.sse.spl.deltambt.featuremodel.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Feature
