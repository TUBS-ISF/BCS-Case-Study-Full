package de.tu_bs.cs.isf.deltamsc.serializer;

import com.google.inject.Inject;
import de.tu_bs.cs.isf.deltamsc.services.DeltaMSCGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DeltaMSCSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DeltaMSCGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Input_CommaKeyword_1_1_or_HyphenMinusGreaterThanSignKeyword_1_0;
	protected AbstractElementAlias match_Input_CommaKeyword_3_1_or_HyphenMinusGreaterThanSignKeyword_3_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DeltaMSCGrammarAccess) access;
		match_Input_CommaKeyword_1_1_or_HyphenMinusGreaterThanSignKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInputAccess().getCommaKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_1_0()));
		match_Input_CommaKeyword_3_1_or_HyphenMinusGreaterThanSignKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInputAccess().getCommaKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_3_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Input_CommaKeyword_1_1_or_HyphenMinusGreaterThanSignKeyword_1_0.equals(syntax))
				emit_Input_CommaKeyword_1_1_or_HyphenMinusGreaterThanSignKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Input_CommaKeyword_3_1_or_HyphenMinusGreaterThanSignKeyword_3_0.equals(syntax))
				emit_Input_CommaKeyword_3_1_or_HyphenMinusGreaterThanSignKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ',' | '->'
	 */
	protected void emit_Input_CommaKeyword_1_1_or_HyphenMinusGreaterThanSignKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ',' | '->'
	 */
	protected void emit_Input_CommaKeyword_3_1_or_HyphenMinusGreaterThanSignKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
