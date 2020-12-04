/**
 */
package de.tu_bs.cs.isf.familymining.models.base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage
 * @generated
 */
public interface BaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaseFactory eINSTANCE = de.tu_bs.cs.isf.familymining.models.base.impl.BaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Wrapped String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapped String</em>'.
	 * @generated
	 */
	WrappedString createWrappedString();

	/**
	 * Returns a new object of class '<em>Wrapped EObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wrapped EObject</em>'.
	 * @generated
	 */
	WrappedEObject createWrappedEObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasePackage getBasePackage();

} //BaseFactory
