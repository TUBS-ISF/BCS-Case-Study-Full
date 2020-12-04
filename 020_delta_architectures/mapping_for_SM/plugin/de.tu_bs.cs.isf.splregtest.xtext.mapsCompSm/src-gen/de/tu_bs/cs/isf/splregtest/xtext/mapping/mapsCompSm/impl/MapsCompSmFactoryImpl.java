/**
 */
package de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.impl;

import de.tu_bs.cs.isf.splregtest.xtext.mapping.mapsCompSm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapsCompSmFactoryImpl extends EFactoryImpl implements MapsCompSmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MapsCompSmFactory init()
  {
    try
    {
      MapsCompSmFactory theMapsCompSmFactory = (MapsCompSmFactory)EPackage.Registry.INSTANCE.getEFactory(MapsCompSmPackage.eNS_URI);
      if (theMapsCompSmFactory != null)
      {
        return theMapsCompSmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MapsCompSmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapsCompSmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MapsCompSmPackage.MAPPING: return createMapping();
      case MapsCompSmPackage.COMPONENT: return createComponent();
      case MapsCompSmPackage.BSM: return createBSM();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSM createBSM()
  {
    BSMImpl bsm = new BSMImpl();
    return bsm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapsCompSmPackage getMapsCompSmPackage()
  {
    return (MapsCompSmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MapsCompSmPackage getPackage()
  {
    return MapsCompSmPackage.eINSTANCE;
  }

} //MapsCompSmFactoryImpl
