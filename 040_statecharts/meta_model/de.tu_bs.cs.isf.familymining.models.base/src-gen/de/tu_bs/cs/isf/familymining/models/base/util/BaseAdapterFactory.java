/**
 */
package de.tu_bs.cs.isf.familymining.models.base.util;

import de.tu_bs.cs.isf.familymining.models.base.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tu_bs.cs.isf.familymining.models.base.BasePackage
 * @generated
 */
public class BaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseSwitch<Adapter> modelSwitch =
		new BaseSwitch<Adapter>() {
			@Override
			public Adapter caseStringToStringMapEntry(Map.Entry<String, String> object) {
				return createStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseEStructuralFeatureToWrappedTypeMapEntry(Map.Entry<EStructuralFeature, WrappedType> object) {
				return createEStructuralFeatureToWrappedTypeMapEntryAdapter();
			}
			@Override
			public Adapter caseStringToAlternativeValuesMap(Map.Entry<String, EMap<EStructuralFeature, WrappedType>> object) {
				return createStringToAlternativeValuesMapAdapter();
			}
			@Override
			public Adapter caseParameterizedElement(ParameterizedElement object) {
				return createParameterizedElementAdapter();
			}
			@Override
			public Adapter caseVariableValueElement(VariableValueElement object) {
				return createVariableValueElementAdapter();
			}
			@Override
			public Adapter caseVariableModel(VariableModel object) {
				return createVariableModelAdapter();
			}
			@Override
			public Adapter caseVariableElement(VariableElement object) {
				return createVariableElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseModelEntity(ModelEntity object) {
				return createModelEntityAdapter();
			}
			@Override
			public Adapter caseContainerEntity(ContainerEntity object) {
				return createContainerEntityAdapter();
			}
			@Override
			public Adapter caseNodeEntity(NodeEntity object) {
				return createNodeEntityAdapter();
			}
			@Override
			public Adapter caseEdgeEntity(EdgeEntity object) {
				return createEdgeEntityAdapter();
			}
			@Override
			public Adapter caseWrappedType(WrappedType object) {
				return createWrappedTypeAdapter();
			}
			@Override
			public Adapter caseWrappedString(WrappedString object) {
				return createWrappedStringAdapter();
			}
			@Override
			public Adapter caseWrappedEObject(WrappedEObject object) {
				return createWrappedEObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EStructural Feature To Wrapped Type Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStructuralFeatureToWrappedTypeMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Alternative Values Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToAlternativeValuesMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement <em>Parameterized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ParameterizedElement
	 * @generated
	 */
	public Adapter createParameterizedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableValueElement <em>Variable Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableValueElement
	 * @generated
	 */
	public Adapter createVariableValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableModel <em>Variable Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableModel
	 * @generated
	 */
	public Adapter createVariableModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.VariableElement <em>Variable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.VariableElement
	 * @generated
	 */
	public Adapter createVariableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ModelEntity <em>Model Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ModelEntity
	 * @generated
	 */
	public Adapter createModelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.ContainerEntity <em>Container Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.ContainerEntity
	 * @generated
	 */
	public Adapter createContainerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.NodeEntity <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.NodeEntity
	 * @generated
	 */
	public Adapter createNodeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.EdgeEntity <em>Edge Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.EdgeEntity
	 * @generated
	 */
	public Adapter createEdgeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedType <em>Wrapped Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedType
	 * @generated
	 */
	public Adapter createWrappedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedString <em>Wrapped String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedString
	 * @generated
	 */
	public Adapter createWrappedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tu_bs.cs.isf.familymining.models.base.WrappedEObject <em>Wrapped EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tu_bs.cs.isf.familymining.models.base.WrappedEObject
	 * @generated
	 */
	public Adapter createWrappedEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BaseAdapterFactory
