package de.tu_bs.cs.isf.deltamsc.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSC;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.DeltaMSCPackage;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.Input;
import de.tu_bs.cs.isf.deltamsc.deltaMSC.Testcase;
import de.tu_bs.cs.isf.deltamsc.services.DeltaMSCGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DeltaMSCSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DeltaMSCGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DeltaMSCPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeltaMSCPackage.DELTA_MSC:
				if(context == grammarAccess.getDeltaMSCRule()) {
					sequence_DeltaMSC(context, (DeltaMSC) semanticObject); 
					return; 
				}
				else break;
			case DeltaMSCPackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case DeltaMSCPackage.TESTCASE:
				if(context == grammarAccess.getTestcaseRule()) {
					sequence_Testcase(context, (Testcase) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     testcases+=Testcase*
	 */
	protected void sequence_DeltaMSC(EObject context, DeltaMSC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (first=[Component|QualifiedName]? signal=[Signal|QualifiedName]? second=[Component|QualifiedName]?)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (filename=ID inputs+=Input*)
	 */
	protected void sequence_Testcase(EObject context, Testcase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
