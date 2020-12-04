package org.xtext.deltarx.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.deltarx.services.DeltarxGrammarAccess;

@SuppressWarnings("all")
public class DeltarxSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DeltarxGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Component___ConnectorsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_Component___PortsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q;
	protected AbstractElementAlias match_Component___SubcomponentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_Delta_AfterKeyword_1_0_q;
	protected AbstractElementAlias match_Delta___AddcomponentKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q;
	protected AbstractElementAlias match_Delta___AddconnectorKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	protected AbstractElementAlias match_Delta___AddportKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q;
	protected AbstractElementAlias match_Delta___AddsignalKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q;
	protected AbstractElementAlias match_Delta___RemovecomponentKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_Delta___RemoveconnectorKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_Delta___RemoveportKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	protected AbstractElementAlias match_Delta___RemovesignalKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_Deltarx_RightCurlyBracketKeyword_4_a;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a__q;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a__q;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a__q;
	protected AbstractElementAlias match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a;
	protected AbstractElementAlias match_Deltarx___SignalsKeyword_0_5_0_LeftCurlyBracketKeyword_0_5_1_RightCurlyBracketKeyword_0_5_3__q;
	protected AbstractElementAlias match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or_____ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a;
	protected AbstractElementAlias match_Deltarx_______DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_______RightCurlyBracketKeyword_4_a__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DeltarxGrammarAccess) access;
		match_Component___ConnectorsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentAccess().getConnectorsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_3()));
		match_Component___PortsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentAccess().getPortsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_3()));
		match_Component___SubcomponentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentAccess().getSubcomponentsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3()));
		match_Delta_AfterKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getDeltaAccess().getAfterKeyword_1_0());
		match_Delta___AddcomponentKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getAddcomponentKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_10_3()));
		match_Delta___AddconnectorKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getAddconnectorKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_11_3()));
		match_Delta___AddportKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getAddportKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_12_3()));
		match_Delta___AddsignalKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getAddsignalKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_9_3()));
		match_Delta___RemovecomponentKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRemovecomponentKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_6_3()));
		match_Delta___RemoveconnectorKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRemoveconnectorKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_5_3()));
		match_Delta___RemoveportKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRemoveportKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_8_3()));
		match_Delta___RemovesignalKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRemovesignalKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_7_3()));
		match_Deltarx_RightCurlyBracketKeyword_4_a = new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4());
		match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1())));
		match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()));
		match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1())));
		match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()));
		match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1())));
		match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()), new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4())), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()));
		match_Deltarx___SignalsKeyword_0_5_0_LeftCurlyBracketKeyword_0_5_1_RightCurlyBracketKeyword_0_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getSignalsKeyword_0_5_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_5_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_0_5_3()));
		match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or_____ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
		match_Deltarx_______DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_______RightCurlyBracketKeyword_4_a__a = new GroupAlias(true, true, new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()))), new TokenAlias(true, true, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()));
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
			if(match_Component___ConnectorsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_Component___ConnectorsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component___PortsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q.equals(syntax))
				emit_Component___PortsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component___SubcomponentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_Component___SubcomponentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta_AfterKeyword_1_0_q.equals(syntax))
				emit_Delta_AfterKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___AddcomponentKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q.equals(syntax))
				emit_Delta___AddcomponentKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___AddconnectorKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_Delta___AddconnectorKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___AddportKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q.equals(syntax))
				emit_Delta___AddportKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___AddsignalKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q.equals(syntax))
				emit_Delta___AddsignalKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___RemovecomponentKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Delta___RemovecomponentKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___RemoveconnectorKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_Delta___RemoveconnectorKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___RemoveportKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_Delta___RemoveportKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Delta___RemovesignalKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_Delta___RemovesignalKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_RightCurlyBracketKeyword_4_a.equals(syntax))
				emit_Deltarx_RightCurlyBracketKeyword_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a__q.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a__q.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a__q.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a.equals(syntax))
				emit_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx___SignalsKeyword_0_5_0_LeftCurlyBracketKeyword_0_5_1_RightCurlyBracketKeyword_0_5_3__q.equals(syntax))
				emit_Deltarx___SignalsKeyword_0_5_0_LeftCurlyBracketKeyword_0_5_1_RightCurlyBracketKeyword_0_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or_____ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or_____ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Deltarx_______DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_______RightCurlyBracketKeyword_4_a__a.equals(syntax))
				emit_Deltarx_______DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_______RightCurlyBracketKeyword_4_a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('connectors' '{' '}')?
	 */
	protected void emit_Component___ConnectorsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ports' '{' '}')?
	 */
	protected void emit_Component___PortsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('subcomponents' '{' '}')?
	 */
	protected void emit_Component___SubcomponentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'after'?
	 */
	protected void emit_Delta_AfterKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('addcomponent' '{' '}')?
	 */
	protected void emit_Delta___AddcomponentKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('addconnector' '{' '}')?
	 */
	protected void emit_Delta___AddconnectorKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('addport' '{' '}')?
	 */
	protected void emit_Delta___AddportKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('addsignal' '{' '}')?
	 */
	protected void emit_Delta___AddsignalKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('removecomponent' '{' '}')?
	 */
	protected void emit_Delta___RemovecomponentKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('removeconnector' '{' '}')?
	 */
	protected void emit_Delta___RemoveconnectorKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('removeport' '{' '}')?
	 */
	protected void emit_Delta___RemoveportKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('removesignal' '{' '}')?
	 */
	protected void emit_Delta___RemovesignalKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_Deltarx_RightCurlyBracketKeyword_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '}' 
	     '}'* 
	     ((('deltas' '{' '}') | ('connectors' '{' '}')) '}'*)* 
	     'components' 
	     '{' 
	     ('}' '}'* ((('deltas' '{' '}') | ('connectors' '{' '}')) '}'*)* 'components' '{')*
	 )?
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' '}'* ((('deltas' '{' '}') | ('connectors' '{' '}')) '}'*)* 'components' '{')*
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_1_3_RightCurlyBracketKeyword_4_a_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '}' 
	     '}'* 
	     ((('deltas' '{' '}') | ('components' '{' '}')) '}'*)* 
	     'connectors' 
	     '{' 
	     ('}' '}'* ((('deltas' '{' '}') | ('components' '{' '}')) '}'*)* 'connectors' '{')*
	 )?
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' '}'* ((('deltas' '{' '}') | ('components' '{' '}')) '}'*)* 'connectors' '{')*
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_2_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a_ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '}' 
	     '}'* 
	     ((('components' '{' '}') | ('connectors' '{' '}')) '}'*)* 
	     'deltas' 
	     '{' 
	     ('}' '}'* ((('components' '{' '}') | ('connectors' '{' '}')) '}'*)* 'deltas' '{')*
	 )?
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('}' '}'* ((('components' '{' '}') | ('connectors' '{' '}')) '}'*)* 'deltas' '{')*
	 */
	protected void emit_Deltarx___RightCurlyBracketKeyword_3_3_RightCurlyBracketKeyword_4_a_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a_DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('signals' '{' '}')?
	 */
	protected void emit_Deltarx___SignalsKeyword_0_5_0_LeftCurlyBracketKeyword_0_5_1_RightCurlyBracketKeyword_0_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('components' '{' '}') | ('connectors' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_____RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('deltas' '{' '}') | ('components' '{' '}') | ('connectors' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('deltas' '{' '}') | ('components' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (((('deltas' '{' '}') | ('connectors' '{' '}')) | ('components' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or_____ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('deltas' '{' '}') | ('connectors' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_____RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ((('connectors' '{' '}') | (('deltas' '{' '}') | ('components' '{' '}'))) '}'*)*
	 */
	protected void emit_Deltarx_______ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3_______RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (((('components' '{' '}') | ('connectors' '{' '}')) | ('deltas' '{' '}')) '}'*)*
	 */
	protected void emit_Deltarx_______DeltasKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3___or_____ComponentsKeyword_1_0_LeftCurlyBracketKeyword_1_1_RightCurlyBracketKeyword_1_3___or___ConnectorsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_3_______RightCurlyBracketKeyword_4_a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
