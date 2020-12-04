/**
 */
package org.xtext.deltarx.deltarx;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.deltarx.deltarx.DeltarxFactory
 * @model kind="package"
 * @generated
 */
public interface DeltarxPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "deltarx";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/deltarx/Deltarx";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "deltarx";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeltarxPackage eINSTANCE = org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl <em>Deltarx</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltarxImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltarx()
   * @generated
   */
  int DELTARX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__NAME = 0;

  /**
   * The feature id for the '<em><b>Fmdir</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__FMDIR = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__COMPONENTS = 3;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__CONNECTORS = 4;

  /**
   * The feature id for the '<em><b>Deltas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX__DELTAS = 5;

  /**
   * The number of structural features of the '<em>Deltarx</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTARX_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.SignalImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__TYPE = 1;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.ComponentImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = 1;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONNECTORS = 2;

  /**
   * The feature id for the '<em><b>Subcomponents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__SUBCOMPONENTS = 3;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.PortImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getPort()
   * @generated
   */
  int PORT = 3;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 1;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__SIGNAL = 2;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.ConnectorImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__TYPE = 1;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl <em>Connector Type One</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnectorTypeOne()
   * @generated
   */
  int CONNECTOR_TYPE_ONE = 5;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Portnameone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__PORTNAMEONE = 1;

  /**
   * The feature id for the '<em><b>Signaltypeone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__SIGNALTYPEONE = 2;

  /**
   * The feature id for the '<em><b>Signaltypetwo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__SIGNALTYPETWO = 3;

  /**
   * The feature id for the '<em><b>Portnametwo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__PORTNAMETWO = 4;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE__DESTINATION = 5;

  /**
   * The number of structural features of the '<em>Connector Type One</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_ONE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl <em>Connector Type Two</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnectorTypeTwo()
   * @generated
   */
  int CONNECTOR_TYPE_TWO = 6;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_TWO__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Sourcesignal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_TWO__SOURCESIGNAL = 1;

  /**
   * The feature id for the '<em><b>Destinationsignal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL = 2;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_TWO__DESTINATION = 3;

  /**
   * The number of structural features of the '<em>Connector Type Two</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_TYPE_TWO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaImpl <em>Delta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDelta()
   * @generated
   */
  int DELTA = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__NAME = 0;

  /**
   * The feature id for the '<em><b>After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__AFTER = 1;

  /**
   * The feature id for the '<em><b>Appcon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__APPCON = 2;

  /**
   * The feature id for the '<em><b>Remove Connector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__REMOVE_CONNECTOR = 3;

  /**
   * The feature id for the '<em><b>Remove Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__REMOVE_COMPONENT = 4;

  /**
   * The feature id for the '<em><b>Remove Signal</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__REMOVE_SIGNAL = 5;

  /**
   * The feature id for the '<em><b>Remove Port</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__REMOVE_PORT = 6;

  /**
   * The feature id for the '<em><b>New Signal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__NEW_SIGNAL = 7;

  /**
   * The feature id for the '<em><b>New Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__NEW_COMPONENT = 8;

  /**
   * The feature id for the '<em><b>New Connector</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__NEW_CONNECTOR = 9;

  /**
   * The feature id for the '<em><b>New Port</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA__NEW_PORT = 10;

  /**
   * The number of structural features of the '<em>Delta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl <em>Delta Add Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddPort()
   * @generated
   */
  int DELTA_ADD_PORT = 8;

  /**
   * The feature id for the '<em><b>Port</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_PORT__PORT = 0;

  /**
   * The feature id for the '<em><b>Port Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_PORT__PORT_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Add Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl <em>Delta Remove Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemovePort()
   * @generated
   */
  int DELTA_REMOVE_PORT = 9;

  /**
   * The feature id for the '<em><b>Port Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_PORT__PORT_NAME = 0;

  /**
   * The feature id for the '<em><b>Port Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_PORT__PORT_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Remove Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl <em>Delta Add Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddComponent()
   * @generated
   */
  int DELTA_ADD_COMPONENT = 10;

  /**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_COMPONENT__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Super Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_COMPONENT__SUPER_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Add Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl <em>Delta Remove Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemoveComponent()
   * @generated
   */
  int DELTA_REMOVE_COMPONENT = 11;

  /**
   * The feature id for the '<em><b>Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_COMPONENT__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Super Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_COMPONENT__SUPER_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Remove Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl <em>Delta Add Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddConnector()
   * @generated
   */
  int DELTA_ADD_CONNECTOR = 12;

  /**
   * The feature id for the '<em><b>Connector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_CONNECTOR__CONNECTOR = 0;

  /**
   * The feature id for the '<em><b>Super Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_CONNECTOR__SUPER_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Add Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_ADD_CONNECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl <em>Delta Remove Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl
   * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemoveConnector()
   * @generated
   */
  int DELTA_REMOVE_CONNECTOR = 13;

  /**
   * The feature id for the '<em><b>Connector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_CONNECTOR__CONNECTOR = 0;

  /**
   * The feature id for the '<em><b>Super Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT = 1;

  /**
   * The number of structural features of the '<em>Delta Remove Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELTA_REMOVE_CONNECTOR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Deltarx <em>Deltarx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deltarx</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx
   * @generated
   */
  EClass getDeltarx();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Deltarx#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getName()
   * @see #getDeltarx()
   * @generated
   */
  EAttribute getDeltarx_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Deltarx#getFmdir <em>Fmdir</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fmdir</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getFmdir()
   * @see #getDeltarx()
   * @generated
   */
  EAttribute getDeltarx_Fmdir();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Deltarx#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getSignals()
   * @see #getDeltarx()
   * @generated
   */
  EReference getDeltarx_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Deltarx#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getComponents()
   * @see #getDeltarx()
   * @generated
   */
  EReference getDeltarx_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Deltarx#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getConnectors()
   * @see #getDeltarx()
   * @generated
   */
  EReference getDeltarx_Connectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Deltarx#getDeltas <em>Deltas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deltas</em>'.
   * @see org.xtext.deltarx.deltarx.Deltarx#getDeltas()
   * @see #getDeltarx()
   * @generated
   */
  EReference getDeltarx_Deltas();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see org.xtext.deltarx.deltarx.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Signal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.deltarx.deltarx.Signal#getType()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.xtext.deltarx.deltarx.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.xtext.deltarx.deltarx.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Component#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.xtext.deltarx.deltarx.Component#getConnectors()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Connectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Component#getSubcomponents <em>Subcomponents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subcomponents</em>'.
   * @see org.xtext.deltarx.deltarx.Component#getSubcomponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Subcomponents();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.xtext.deltarx.deltarx.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Port#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.xtext.deltarx.deltarx.Port#getDirection()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.deltarx.deltarx.Port#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see org.xtext.deltarx.deltarx.Port#getSignal()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Signal();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see org.xtext.deltarx.deltarx.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Connector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Connector#getName()
   * @see #getConnector()
   * @generated
   */
  EAttribute getConnector_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.deltarx.deltarx.Connector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.deltarx.deltarx.Connector#getType()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne <em>Connector Type One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector Type One</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne
   * @generated
   */
  EClass getConnectorTypeOne();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getSource()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Source();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getPortnameone <em>Portnameone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Portnameone</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getPortnameone()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Portnameone();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getSignaltypeone <em>Signaltypeone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signaltypeone</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getSignaltypeone()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Signaltypeone();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getSignaltypetwo <em>Signaltypetwo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signaltypetwo</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getSignaltypetwo()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Signaltypetwo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getPortnametwo <em>Portnametwo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Portnametwo</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getPortnametwo()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Portnametwo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeOne#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeOne#getDestination()
   * @see #getConnectorTypeOne()
   * @generated
   */
  EAttribute getConnectorTypeOne_Destination();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo <em>Connector Type Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector Type Two</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo
   * @generated
   */
  EClass getConnectorTypeTwo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo#getSource()
   * @see #getConnectorTypeTwo()
   * @generated
   */
  EAttribute getConnectorTypeTwo_Source();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo#getSourcesignal <em>Sourcesignal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcesignal</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo#getSourcesignal()
   * @see #getConnectorTypeTwo()
   * @generated
   */
  EAttribute getConnectorTypeTwo_Sourcesignal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo#getDestinationsignal <em>Destinationsignal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destinationsignal</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo#getDestinationsignal()
   * @see #getConnectorTypeTwo()
   * @generated
   */
  EAttribute getConnectorTypeTwo_Destinationsignal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.ConnectorTypeTwo#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see org.xtext.deltarx.deltarx.ConnectorTypeTwo#getDestination()
   * @see #getConnectorTypeTwo()
   * @generated
   */
  EAttribute getConnectorTypeTwo_Destination();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.Delta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta</em>'.
   * @see org.xtext.deltarx.deltarx.Delta
   * @generated
   */
  EClass getDelta();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Delta#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getName()
   * @see #getDelta()
   * @generated
   */
  EAttribute getDelta_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.deltarx.deltarx.Delta#getAfter <em>After</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>After</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getAfter()
   * @see #getDelta()
   * @generated
   */
  EAttribute getDelta_After();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.Delta#getAppcon <em>Appcon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Appcon</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getAppcon()
   * @see #getDelta()
   * @generated
   */
  EAttribute getDelta_Appcon();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getRemoveConnector <em>Remove Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Remove Connector</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getRemoveConnector()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_RemoveConnector();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getRemoveComponent <em>Remove Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Remove Component</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getRemoveComponent()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_RemoveComponent();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.deltarx.deltarx.Delta#getRemoveSignal <em>Remove Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Remove Signal</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getRemoveSignal()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_RemoveSignal();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getRemovePort <em>Remove Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Remove Port</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getRemovePort()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_RemovePort();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getNewSignal <em>New Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Signal</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getNewSignal()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_NewSignal();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getNewComponent <em>New Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Component</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getNewComponent()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_NewComponent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getNewConnector <em>New Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Connector</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getNewConnector()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_NewConnector();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.deltarx.deltarx.Delta#getNewPort <em>New Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Port</em>'.
   * @see org.xtext.deltarx.deltarx.Delta#getNewPort()
   * @see #getDelta()
   * @generated
   */
  EReference getDelta_NewPort();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaAddPort <em>Delta Add Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Add Port</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddPort
   * @generated
   */
  EClass getDeltaAddPort();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Port</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddPort#getPort()
   * @see #getDeltaAddPort()
   * @generated
   */
  EReference getDeltaAddPort_Port();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaAddPort#getPortComponent <em>Port Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddPort#getPortComponent()
   * @see #getDeltaAddPort()
   * @generated
   */
  EAttribute getDeltaAddPort_PortComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaRemovePort <em>Delta Remove Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Remove Port</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemovePort
   * @generated
   */
  EClass getDeltaRemovePort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortName <em>Port Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port Name</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemovePort#getPortName()
   * @see #getDeltaRemovePort()
   * @generated
   */
  EAttribute getDeltaRemovePort_PortName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemovePort#getPortComponent <em>Port Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemovePort#getPortComponent()
   * @see #getDeltaRemovePort()
   * @generated
   */
  EAttribute getDeltaRemovePort_PortComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaAddComponent <em>Delta Add Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Add Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddComponent
   * @generated
   */
  EClass getDeltaAddComponent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddComponent#getComponent()
   * @see #getDeltaAddComponent()
   * @generated
   */
  EReference getDeltaAddComponent_Component();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaAddComponent#getSuperComponent <em>Super Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddComponent#getSuperComponent()
   * @see #getDeltaAddComponent()
   * @generated
   */
  EAttribute getDeltaAddComponent_SuperComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent <em>Delta Remove Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Remove Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveComponent
   * @generated
   */
  EClass getDeltaRemoveComponent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveComponent#getComponent()
   * @see #getDeltaRemoveComponent()
   * @generated
   */
  EAttribute getDeltaRemoveComponent_Component();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemoveComponent#getSuperComponent <em>Super Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveComponent#getSuperComponent()
   * @see #getDeltaRemoveComponent()
   * @generated
   */
  EAttribute getDeltaRemoveComponent_SuperComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaAddConnector <em>Delta Add Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Add Connector</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddConnector
   * @generated
   */
  EClass getDeltaAddConnector();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getConnector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Connector</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddConnector#getConnector()
   * @see #getDeltaAddConnector()
   * @generated
   */
  EReference getDeltaAddConnector_Connector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaAddConnector#getSuperComponent <em>Super Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaAddConnector#getSuperComponent()
   * @see #getDeltaAddConnector()
   * @generated
   */
  EAttribute getDeltaAddConnector_SuperComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector <em>Delta Remove Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delta Remove Connector</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveConnector
   * @generated
   */
  EClass getDeltaRemoveConnector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getConnector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connector</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveConnector#getConnector()
   * @see #getDeltaRemoveConnector()
   * @generated
   */
  EAttribute getDeltaRemoveConnector_Connector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.deltarx.deltarx.DeltaRemoveConnector#getSuperComponent <em>Super Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super Component</em>'.
   * @see org.xtext.deltarx.deltarx.DeltaRemoveConnector#getSuperComponent()
   * @see #getDeltaRemoveConnector()
   * @generated
   */
  EAttribute getDeltaRemoveConnector_SuperComponent();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DeltarxFactory getDeltarxFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltarxImpl <em>Deltarx</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltarxImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltarx()
     * @generated
     */
    EClass DELTARX = eINSTANCE.getDeltarx();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTARX__NAME = eINSTANCE.getDeltarx_Name();

    /**
     * The meta object literal for the '<em><b>Fmdir</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTARX__FMDIR = eINSTANCE.getDeltarx_Fmdir();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTARX__SIGNALS = eINSTANCE.getDeltarx_Signals();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTARX__COMPONENTS = eINSTANCE.getDeltarx_Components();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTARX__CONNECTORS = eINSTANCE.getDeltarx_Connectors();

    /**
     * The meta object literal for the '<em><b>Deltas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTARX__DELTAS = eINSTANCE.getDeltarx_Deltas();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.SignalImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__TYPE = eINSTANCE.getSignal_Type();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.ComponentImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CONNECTORS = eINSTANCE.getComponent_Connectors();

    /**
     * The meta object literal for the '<em><b>Subcomponents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__SUBCOMPONENTS = eINSTANCE.getComponent_Subcomponents();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.PortImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__SIGNAL = eINSTANCE.getPort_Signal();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.ConnectorImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl <em>Connector Type One</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.ConnectorTypeOneImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnectorTypeOne()
     * @generated
     */
    EClass CONNECTOR_TYPE_ONE = eINSTANCE.getConnectorTypeOne();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__SOURCE = eINSTANCE.getConnectorTypeOne_Source();

    /**
     * The meta object literal for the '<em><b>Portnameone</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__PORTNAMEONE = eINSTANCE.getConnectorTypeOne_Portnameone();

    /**
     * The meta object literal for the '<em><b>Signaltypeone</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__SIGNALTYPEONE = eINSTANCE.getConnectorTypeOne_Signaltypeone();

    /**
     * The meta object literal for the '<em><b>Signaltypetwo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__SIGNALTYPETWO = eINSTANCE.getConnectorTypeOne_Signaltypetwo();

    /**
     * The meta object literal for the '<em><b>Portnametwo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__PORTNAMETWO = eINSTANCE.getConnectorTypeOne_Portnametwo();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_ONE__DESTINATION = eINSTANCE.getConnectorTypeOne_Destination();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl <em>Connector Type Two</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.ConnectorTypeTwoImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getConnectorTypeTwo()
     * @generated
     */
    EClass CONNECTOR_TYPE_TWO = eINSTANCE.getConnectorTypeTwo();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_TWO__SOURCE = eINSTANCE.getConnectorTypeTwo_Source();

    /**
     * The meta object literal for the '<em><b>Sourcesignal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_TWO__SOURCESIGNAL = eINSTANCE.getConnectorTypeTwo_Sourcesignal();

    /**
     * The meta object literal for the '<em><b>Destinationsignal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL = eINSTANCE.getConnectorTypeTwo_Destinationsignal();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR_TYPE_TWO__DESTINATION = eINSTANCE.getConnectorTypeTwo_Destination();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaImpl <em>Delta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDelta()
     * @generated
     */
    EClass DELTA = eINSTANCE.getDelta();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA__NAME = eINSTANCE.getDelta_Name();

    /**
     * The meta object literal for the '<em><b>After</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA__AFTER = eINSTANCE.getDelta_After();

    /**
     * The meta object literal for the '<em><b>Appcon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA__APPCON = eINSTANCE.getDelta_Appcon();

    /**
     * The meta object literal for the '<em><b>Remove Connector</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__REMOVE_CONNECTOR = eINSTANCE.getDelta_RemoveConnector();

    /**
     * The meta object literal for the '<em><b>Remove Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__REMOVE_COMPONENT = eINSTANCE.getDelta_RemoveComponent();

    /**
     * The meta object literal for the '<em><b>Remove Signal</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__REMOVE_SIGNAL = eINSTANCE.getDelta_RemoveSignal();

    /**
     * The meta object literal for the '<em><b>Remove Port</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__REMOVE_PORT = eINSTANCE.getDelta_RemovePort();

    /**
     * The meta object literal for the '<em><b>New Signal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__NEW_SIGNAL = eINSTANCE.getDelta_NewSignal();

    /**
     * The meta object literal for the '<em><b>New Component</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__NEW_COMPONENT = eINSTANCE.getDelta_NewComponent();

    /**
     * The meta object literal for the '<em><b>New Connector</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__NEW_CONNECTOR = eINSTANCE.getDelta_NewConnector();

    /**
     * The meta object literal for the '<em><b>New Port</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA__NEW_PORT = eINSTANCE.getDelta_NewPort();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl <em>Delta Add Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaAddPortImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddPort()
     * @generated
     */
    EClass DELTA_ADD_PORT = eINSTANCE.getDeltaAddPort();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_ADD_PORT__PORT = eINSTANCE.getDeltaAddPort_Port();

    /**
     * The meta object literal for the '<em><b>Port Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_ADD_PORT__PORT_COMPONENT = eINSTANCE.getDeltaAddPort_PortComponent();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl <em>Delta Remove Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaRemovePortImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemovePort()
     * @generated
     */
    EClass DELTA_REMOVE_PORT = eINSTANCE.getDeltaRemovePort();

    /**
     * The meta object literal for the '<em><b>Port Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_PORT__PORT_NAME = eINSTANCE.getDeltaRemovePort_PortName();

    /**
     * The meta object literal for the '<em><b>Port Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_PORT__PORT_COMPONENT = eINSTANCE.getDeltaRemovePort_PortComponent();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl <em>Delta Add Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaAddComponentImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddComponent()
     * @generated
     */
    EClass DELTA_ADD_COMPONENT = eINSTANCE.getDeltaAddComponent();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_ADD_COMPONENT__COMPONENT = eINSTANCE.getDeltaAddComponent_Component();

    /**
     * The meta object literal for the '<em><b>Super Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_ADD_COMPONENT__SUPER_COMPONENT = eINSTANCE.getDeltaAddComponent_SuperComponent();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl <em>Delta Remove Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaRemoveComponentImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemoveComponent()
     * @generated
     */
    EClass DELTA_REMOVE_COMPONENT = eINSTANCE.getDeltaRemoveComponent();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_COMPONENT__COMPONENT = eINSTANCE.getDeltaRemoveComponent_Component();

    /**
     * The meta object literal for the '<em><b>Super Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_COMPONENT__SUPER_COMPONENT = eINSTANCE.getDeltaRemoveComponent_SuperComponent();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl <em>Delta Add Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaAddConnectorImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaAddConnector()
     * @generated
     */
    EClass DELTA_ADD_CONNECTOR = eINSTANCE.getDeltaAddConnector();

    /**
     * The meta object literal for the '<em><b>Connector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELTA_ADD_CONNECTOR__CONNECTOR = eINSTANCE.getDeltaAddConnector_Connector();

    /**
     * The meta object literal for the '<em><b>Super Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_ADD_CONNECTOR__SUPER_COMPONENT = eINSTANCE.getDeltaAddConnector_SuperComponent();

    /**
     * The meta object literal for the '{@link org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl <em>Delta Remove Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.deltarx.deltarx.impl.DeltaRemoveConnectorImpl
     * @see org.xtext.deltarx.deltarx.impl.DeltarxPackageImpl#getDeltaRemoveConnector()
     * @generated
     */
    EClass DELTA_REMOVE_CONNECTOR = eINSTANCE.getDeltaRemoveConnector();

    /**
     * The meta object literal for the '<em><b>Connector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_CONNECTOR__CONNECTOR = eINSTANCE.getDeltaRemoveConnector_Connector();

    /**
     * The meta object literal for the '<em><b>Super Component</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELTA_REMOVE_CONNECTOR__SUPER_COMPONENT = eINSTANCE.getDeltaRemoveConnector_SuperComponent();

  }

} //DeltarxPackage
