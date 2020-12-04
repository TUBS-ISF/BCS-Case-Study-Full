/**
 */
package org.xtext.deltarx.deltarx.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.deltarx.deltarx.Component;
import org.xtext.deltarx.deltarx.Connector;
import org.xtext.deltarx.deltarx.ConnectorTypeOne;
import org.xtext.deltarx.deltarx.ConnectorTypeTwo;
import org.xtext.deltarx.deltarx.Delta;
import org.xtext.deltarx.deltarx.DeltaAddComponent;
import org.xtext.deltarx.deltarx.DeltaAddConnector;
import org.xtext.deltarx.deltarx.DeltaAddPort;
import org.xtext.deltarx.deltarx.DeltaRemoveComponent;
import org.xtext.deltarx.deltarx.DeltaRemoveConnector;
import org.xtext.deltarx.deltarx.DeltaRemovePort;
import org.xtext.deltarx.deltarx.Deltarx;
import org.xtext.deltarx.deltarx.DeltarxFactory;
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Port;
import org.xtext.deltarx.deltarx.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltarxPackageImpl extends EPackageImpl implements DeltarxPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltarxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorTypeOneEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectorTypeTwoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaAddPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaRemovePortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaAddComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaRemoveComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaAddConnectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deltaRemoveConnectorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.deltarx.deltarx.DeltarxPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DeltarxPackageImpl()
  {
    super(eNS_URI, DeltarxFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DeltarxPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DeltarxPackage init()
  {
    if (isInited) return (DeltarxPackage)EPackage.Registry.INSTANCE.getEPackage(DeltarxPackage.eNS_URI);

    // Obtain or create and register package
    DeltarxPackageImpl theDeltarxPackage = (DeltarxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeltarxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeltarxPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDeltarxPackage.createPackageContents();

    // Initialize created meta-data
    theDeltarxPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeltarxPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DeltarxPackage.eNS_URI, theDeltarxPackage);
    return theDeltarxPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltarx()
  {
    return deltarxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltarx_Name()
  {
    return (EAttribute)deltarxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltarx_Fmdir()
  {
    return (EAttribute)deltarxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltarx_Signals()
  {
    return (EReference)deltarxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltarx_Components()
  {
    return (EReference)deltarxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltarx_Connectors()
  {
    return (EReference)deltarxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltarx_Deltas()
  {
    return (EReference)deltarxEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_Name()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_Type()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Ports()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Connectors()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Subcomponents()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Direction()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Name()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_Signal()
  {
    return (EReference)portEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector()
  {
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnector_Name()
  {
    return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Type()
  {
    return (EReference)connectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectorTypeOne()
  {
    return connectorTypeOneEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Source()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Portnameone()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Signaltypeone()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Signaltypetwo()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Portnametwo()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeOne_Destination()
  {
    return (EAttribute)connectorTypeOneEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectorTypeTwo()
  {
    return connectorTypeTwoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeTwo_Source()
  {
    return (EAttribute)connectorTypeTwoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeTwo_Sourcesignal()
  {
    return (EAttribute)connectorTypeTwoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeTwo_Destinationsignal()
  {
    return (EAttribute)connectorTypeTwoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConnectorTypeTwo_Destination()
  {
    return (EAttribute)connectorTypeTwoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelta()
  {
    return deltaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_Name()
  {
    return (EAttribute)deltaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_After()
  {
    return (EAttribute)deltaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDelta_Appcon()
  {
    return (EAttribute)deltaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_RemoveConnector()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_RemoveComponent()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_RemoveSignal()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_RemovePort()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_NewSignal()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_NewComponent()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_NewConnector()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelta_NewPort()
  {
    return (EReference)deltaEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaAddPort()
  {
    return deltaAddPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaAddPort_Port()
  {
    return (EReference)deltaAddPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaAddPort_PortComponent()
  {
    return (EAttribute)deltaAddPortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaRemovePort()
  {
    return deltaRemovePortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemovePort_PortName()
  {
    return (EAttribute)deltaRemovePortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemovePort_PortComponent()
  {
    return (EAttribute)deltaRemovePortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaAddComponent()
  {
    return deltaAddComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaAddComponent_Component()
  {
    return (EReference)deltaAddComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaAddComponent_SuperComponent()
  {
    return (EAttribute)deltaAddComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaRemoveComponent()
  {
    return deltaRemoveComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemoveComponent_Component()
  {
    return (EAttribute)deltaRemoveComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemoveComponent_SuperComponent()
  {
    return (EAttribute)deltaRemoveComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaAddConnector()
  {
    return deltaAddConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeltaAddConnector_Connector()
  {
    return (EReference)deltaAddConnectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaAddConnector_SuperComponent()
  {
    return (EAttribute)deltaAddConnectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeltaRemoveConnector()
  {
    return deltaRemoveConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemoveConnector_Connector()
  {
    return (EAttribute)deltaRemoveConnectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeltaRemoveConnector_SuperComponent()
  {
    return (EAttribute)deltaRemoveConnectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeltarxFactory getDeltarxFactory()
  {
    return (DeltarxFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    deltarxEClass = createEClass(DELTARX);
    createEAttribute(deltarxEClass, DELTARX__NAME);
    createEAttribute(deltarxEClass, DELTARX__FMDIR);
    createEReference(deltarxEClass, DELTARX__SIGNALS);
    createEReference(deltarxEClass, DELTARX__COMPONENTS);
    createEReference(deltarxEClass, DELTARX__CONNECTORS);
    createEReference(deltarxEClass, DELTARX__DELTAS);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__NAME);
    createEAttribute(signalEClass, SIGNAL__TYPE);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__PORTS);
    createEReference(componentEClass, COMPONENT__CONNECTORS);
    createEReference(componentEClass, COMPONENT__SUBCOMPONENTS);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__DIRECTION);
    createEAttribute(portEClass, PORT__NAME);
    createEReference(portEClass, PORT__SIGNAL);

    connectorEClass = createEClass(CONNECTOR);
    createEAttribute(connectorEClass, CONNECTOR__NAME);
    createEReference(connectorEClass, CONNECTOR__TYPE);

    connectorTypeOneEClass = createEClass(CONNECTOR_TYPE_ONE);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__SOURCE);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__PORTNAMEONE);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__SIGNALTYPEONE);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__SIGNALTYPETWO);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__PORTNAMETWO);
    createEAttribute(connectorTypeOneEClass, CONNECTOR_TYPE_ONE__DESTINATION);

    connectorTypeTwoEClass = createEClass(CONNECTOR_TYPE_TWO);
    createEAttribute(connectorTypeTwoEClass, CONNECTOR_TYPE_TWO__SOURCE);
    createEAttribute(connectorTypeTwoEClass, CONNECTOR_TYPE_TWO__SOURCESIGNAL);
    createEAttribute(connectorTypeTwoEClass, CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL);
    createEAttribute(connectorTypeTwoEClass, CONNECTOR_TYPE_TWO__DESTINATION);

    deltaEClass = createEClass(DELTA);
    createEAttribute(deltaEClass, DELTA__NAME);
    createEAttribute(deltaEClass, DELTA__AFTER);
    createEAttribute(deltaEClass, DELTA__APPCON);
    createEReference(deltaEClass, DELTA__REMOVE_CONNECTOR);
    createEReference(deltaEClass, DELTA__REMOVE_COMPONENT);
    createEReference(deltaEClass, DELTA__REMOVE_SIGNAL);
    createEReference(deltaEClass, DELTA__REMOVE_PORT);
    createEReference(deltaEClass, DELTA__NEW_SIGNAL);
    createEReference(deltaEClass, DELTA__NEW_COMPONENT);
    createEReference(deltaEClass, DELTA__NEW_CONNECTOR);
    createEReference(deltaEClass, DELTA__NEW_PORT);

    deltaAddPortEClass = createEClass(DELTA_ADD_PORT);
    createEReference(deltaAddPortEClass, DELTA_ADD_PORT__PORT);
    createEAttribute(deltaAddPortEClass, DELTA_ADD_PORT__PORT_COMPONENT);

    deltaRemovePortEClass = createEClass(DELTA_REMOVE_PORT);
    createEAttribute(deltaRemovePortEClass, DELTA_REMOVE_PORT__PORT_NAME);
    createEAttribute(deltaRemovePortEClass, DELTA_REMOVE_PORT__PORT_COMPONENT);

    deltaAddComponentEClass = createEClass(DELTA_ADD_COMPONENT);
    createEReference(deltaAddComponentEClass, DELTA_ADD_COMPONENT__COMPONENT);
    createEAttribute(deltaAddComponentEClass, DELTA_ADD_COMPONENT__SUPER_COMPONENT);

    deltaRemoveComponentEClass = createEClass(DELTA_REMOVE_COMPONENT);
    createEAttribute(deltaRemoveComponentEClass, DELTA_REMOVE_COMPONENT__COMPONENT);
    createEAttribute(deltaRemoveComponentEClass, DELTA_REMOVE_COMPONENT__SUPER_COMPONENT);

    deltaAddConnectorEClass = createEClass(DELTA_ADD_CONNECTOR);
    createEReference(deltaAddConnectorEClass, DELTA_ADD_CONNECTOR__CONNECTOR);
    createEAttribute(deltaAddConnectorEClass, DELTA_ADD_CONNECTOR__SUPER_COMPONENT);

    deltaRemoveConnectorEClass = createEClass(DELTA_REMOVE_CONNECTOR);
    createEAttribute(deltaRemoveConnectorEClass, DELTA_REMOVE_CONNECTOR__CONNECTOR);
    createEAttribute(deltaRemoveConnectorEClass, DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(deltarxEClass, Deltarx.class, "Deltarx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeltarx_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltarx_Fmdir(), ecorePackage.getEString(), "fmdir", null, 0, 1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeltarx_Signals(), this.getSignal(), null, "signals", null, 0, -1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeltarx_Components(), this.getComponent(), null, "components", null, 0, -1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeltarx_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeltarx_Deltas(), this.getDelta(), null, "deltas", null, 0, -1, Deltarx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_Type(), ecorePackage.getEString(), "type", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Ports(), this.getPort(), null, "ports", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Subcomponents(), this.getComponent(), null, "subcomponents", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPort_Signal(), this.getSignal(), null, "signal", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConnector_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorTypeOneEClass, ConnectorTypeOne.class, "ConnectorTypeOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnectorTypeOne_Source(), ecorePackage.getEString(), "source", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeOne_Portnameone(), ecorePackage.getEString(), "portnameone", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeOne_Signaltypeone(), ecorePackage.getEString(), "signaltypeone", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeOne_Signaltypetwo(), ecorePackage.getEString(), "signaltypetwo", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeOne_Portnametwo(), ecorePackage.getEString(), "portnametwo", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeOne_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, ConnectorTypeOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(connectorTypeTwoEClass, ConnectorTypeTwo.class, "ConnectorTypeTwo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConnectorTypeTwo_Source(), ecorePackage.getEString(), "source", null, 0, 1, ConnectorTypeTwo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeTwo_Sourcesignal(), ecorePackage.getEString(), "sourcesignal", null, 0, 1, ConnectorTypeTwo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeTwo_Destinationsignal(), ecorePackage.getEString(), "destinationsignal", null, 0, 1, ConnectorTypeTwo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConnectorTypeTwo_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, ConnectorTypeTwo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaEClass, Delta.class, "Delta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDelta_Name(), ecorePackage.getEString(), "name", null, 0, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelta_After(), ecorePackage.getEString(), "after", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDelta_Appcon(), ecorePackage.getEString(), "appcon", null, 0, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_RemoveConnector(), this.getDeltaRemoveConnector(), null, "removeConnector", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_RemoveComponent(), this.getDeltaRemoveComponent(), null, "removeComponent", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_RemoveSignal(), this.getSignal(), null, "removeSignal", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_RemovePort(), this.getDeltaRemovePort(), null, "removePort", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_NewSignal(), this.getSignal(), null, "newSignal", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_NewComponent(), this.getDeltaAddComponent(), null, "newComponent", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_NewConnector(), this.getDeltaAddConnector(), null, "newConnector", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDelta_NewPort(), this.getDeltaAddPort(), null, "newPort", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaAddPortEClass, DeltaAddPort.class, "DeltaAddPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeltaAddPort_Port(), this.getPort(), null, "port", null, 0, 1, DeltaAddPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaAddPort_PortComponent(), ecorePackage.getEString(), "portComponent", null, 0, 1, DeltaAddPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaRemovePortEClass, DeltaRemovePort.class, "DeltaRemovePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeltaRemovePort_PortName(), ecorePackage.getEString(), "portName", null, 0, 1, DeltaRemovePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaRemovePort_PortComponent(), ecorePackage.getEString(), "portComponent", null, 0, 1, DeltaRemovePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaAddComponentEClass, DeltaAddComponent.class, "DeltaAddComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeltaAddComponent_Component(), this.getComponent(), null, "component", null, 0, 1, DeltaAddComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaAddComponent_SuperComponent(), ecorePackage.getEString(), "superComponent", null, 0, 1, DeltaAddComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaRemoveComponentEClass, DeltaRemoveComponent.class, "DeltaRemoveComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeltaRemoveComponent_Component(), ecorePackage.getEString(), "component", null, 0, 1, DeltaRemoveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaRemoveComponent_SuperComponent(), ecorePackage.getEString(), "superComponent", null, 0, 1, DeltaRemoveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaAddConnectorEClass, DeltaAddConnector.class, "DeltaAddConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeltaAddConnector_Connector(), this.getConnector(), null, "connector", null, 0, 1, DeltaAddConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaAddConnector_SuperComponent(), ecorePackage.getEString(), "superComponent", null, 0, 1, DeltaAddConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deltaRemoveConnectorEClass, DeltaRemoveConnector.class, "DeltaRemoveConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeltaRemoveConnector_Connector(), ecorePackage.getEString(), "connector", null, 0, 1, DeltaRemoveConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeltaRemoveConnector_SuperComponent(), ecorePackage.getEString(), "superComponent", null, 0, 1, DeltaRemoveConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DeltarxPackageImpl
