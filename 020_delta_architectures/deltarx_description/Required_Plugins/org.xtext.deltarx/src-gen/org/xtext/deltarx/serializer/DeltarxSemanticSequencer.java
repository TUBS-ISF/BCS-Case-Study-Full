package org.xtext.deltarx.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
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
import org.xtext.deltarx.deltarx.DeltarxPackage;
import org.xtext.deltarx.deltarx.Port;
import org.xtext.deltarx.deltarx.Signal;
import org.xtext.deltarx.services.DeltarxGrammarAccess;

@SuppressWarnings("all")
public class DeltarxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeltarxGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DeltarxPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeltarxPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.CONNECTOR:
				if(context == grammarAccess.getConnectorRule()) {
					sequence_Connector(context, (Connector) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.CONNECTOR_TYPE_ONE:
				if(context == grammarAccess.getConnectorTypeOneRule()) {
					sequence_ConnectorTypeOne(context, (ConnectorTypeOne) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.CONNECTOR_TYPE_TWO:
				if(context == grammarAccess.getConnectorTypeTwoRule()) {
					sequence_ConnectorTypeTwo(context, (ConnectorTypeTwo) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA:
				if(context == grammarAccess.getDeltaRule()) {
					sequence_Delta(context, (Delta) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_ADD_COMPONENT:
				if(context == grammarAccess.getDeltaAddComponentRule()) {
					sequence_DeltaAddComponent(context, (DeltaAddComponent) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_ADD_CONNECTOR:
				if(context == grammarAccess.getDeltaAddConnectorRule()) {
					sequence_DeltaAddConnector(context, (DeltaAddConnector) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_ADD_PORT:
				if(context == grammarAccess.getDeltaAddPortRule()) {
					sequence_DeltaAddPort(context, (DeltaAddPort) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_REMOVE_COMPONENT:
				if(context == grammarAccess.getDeltaRemoveComponentRule()) {
					sequence_DeltaRemoveComponent(context, (DeltaRemoveComponent) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_REMOVE_CONNECTOR:
				if(context == grammarAccess.getDeltaRemoveConnectorRule()) {
					sequence_DeltaRemoveConnector(context, (DeltaRemoveConnector) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTA_REMOVE_PORT:
				if(context == grammarAccess.getDeltaRemovePortRule()) {
					sequence_DeltaRemovePort(context, (DeltaRemovePort) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.DELTARX:
				if(context == grammarAccess.getDeltarxRule()) {
					sequence_Deltarx(context, (Deltarx) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.PORT:
				if(context == grammarAccess.getPortRule()) {
					sequence_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case DeltarxPackage.SIGNAL:
				if(context == grammarAccess.getSignalRule()) {
					sequence_Signal(context, (Signal) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID ports+=Port* connectors+=Connector* subcomponents+=Component*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         source=ID 
	 *         (portnameone=ID | portnameone=EnvironmentMessage) 
	 *         signaltypeone=ID 
	 *         signaltypetwo=ID 
	 *         (portnametwo=ID | portnametwo=EnvironmentMessage) 
	 *         destination=ID
	 *     )
	 */
	protected void sequence_ConnectorTypeOne(EObject context, ConnectorTypeOne semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=ID sourcesignal=ID destinationsignal=ID destination=ID)
	 */
	protected void sequence_ConnectorTypeTwo(EObject context, ConnectorTypeTwo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__SOURCE));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__SOURCESIGNAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__SOURCESIGNAL));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__DESTINATIONSIGNAL));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.CONNECTOR_TYPE_TWO__DESTINATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConnectorTypeTwoAccess().getSourceIDTerminalRuleCall_1_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getConnectorTypeTwoAccess().getSourcesignalIDTerminalRuleCall_3_0(), semanticObject.getSourcesignal());
		feeder.accept(grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalIDTerminalRuleCall_5_0(), semanticObject.getDestinationsignal());
		feeder.accept(grammarAccess.getConnectorTypeTwoAccess().getDestinationIDTerminalRuleCall_7_0(), semanticObject.getDestination());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (type=ConnectorTypeOne | type=ConnectorTypeTwo))
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (component=Component superComponent=ID?)
	 */
	protected void sequence_DeltaAddComponent(EObject context, DeltaAddComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (connector=Connector superComponent=ID?)
	 */
	protected void sequence_DeltaAddConnector(EObject context, DeltaAddConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (port=Port portComponent=ID)
	 */
	protected void sequence_DeltaAddPort(EObject context, DeltaAddPort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.DELTA_ADD_PORT__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.DELTA_ADD_PORT__PORT));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.DELTA_ADD_PORT__PORT_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.DELTA_ADD_PORT__PORT_COMPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeltaAddPortAccess().getPortPortParserRuleCall_0_0(), semanticObject.getPort());
		feeder.accept(grammarAccess.getDeltaAddPortAccess().getPortComponentIDTerminalRuleCall_2_0(), semanticObject.getPortComponent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (component=ID superComponent=ID?)
	 */
	protected void sequence_DeltaRemoveComponent(EObject context, DeltaRemoveComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (connector=ID superComponent=ID?)
	 */
	protected void sequence_DeltaRemoveConnector(EObject context, DeltaRemoveConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (portName=ID portComponent=ID)
	 */
	protected void sequence_DeltaRemovePort(EObject context, DeltaRemovePort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.DELTA_REMOVE_PORT__PORT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.DELTA_REMOVE_PORT__PORT_NAME));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.DELTA_REMOVE_PORT__PORT_COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.DELTA_REMOVE_PORT__PORT_COMPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeltaRemovePortAccess().getPortNameIDTerminalRuleCall_0_0(), semanticObject.getPortName());
		feeder.accept(grammarAccess.getDeltaRemovePortAccess().getPortComponentIDTerminalRuleCall_2_0(), semanticObject.getPortComponent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         after+=ID* 
	 *         appcon=STRING 
	 *         removeConnector+=DeltaRemoveConnector* 
	 *         removeComponent+=DeltaRemoveComponent* 
	 *         removeSignal+=[Signal|ID]* 
	 *         removePort+=DeltaRemovePort* 
	 *         newSignal+=Signal* 
	 *         newComponent+=DeltaAddComponent* 
	 *         newConnector+=DeltaAddConnector* 
	 *         newPort+=DeltaAddPort*
	 *     )
	 */
	protected void sequence_Delta(EObject context, Delta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         fmdir=STRING 
	 *         signals+=Signal* 
	 *         components+=Component* 
	 *         connectors+=Connector* 
	 *         deltas+=Delta*
	 *     )
	 */
	protected void sequence_Deltarx(EObject context, Deltarx semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (direction=PortDirection name=ID signal=[Signal|ID]?)
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=SignalType)
	 */
	protected void sequence_Signal(EObject context, Signal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.SIGNAL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.SIGNAL__NAME));
			if(transientValues.isValueTransient(semanticObject, DeltarxPackage.Literals.SIGNAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeltarxPackage.Literals.SIGNAL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
}
