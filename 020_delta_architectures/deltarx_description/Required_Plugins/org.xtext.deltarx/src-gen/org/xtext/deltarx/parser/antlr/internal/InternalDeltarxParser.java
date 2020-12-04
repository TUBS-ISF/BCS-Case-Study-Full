package org.xtext.deltarx.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.deltarx.services.DeltarxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeltarxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'architecture'", "'for featuremodel'", "'{'", "'signals'", "'}'", "'components'", "'connectors'", "'deltas'", "'ports'", "'subcomponents'", "'boolean'", "'char'", "'int'", "'double'", "'in'", "'out'", "'envmsg'", "'('", "','", "')'", "'after'", "'when'", "'removeconnector'", "'removecomponent'", "'removesignal'", "'removeport'", "'addsignal'", "'addcomponent'", "'addconnector'", "'addport'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDeltarxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeltarxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeltarxParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g"; }



     	private DeltarxGrammarAccess grammarAccess;
     	
        public InternalDeltarxParser(TokenStream input, DeltarxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Deltarx";	
       	}
       	
       	@Override
       	protected DeltarxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDeltarx"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:67:1: entryRuleDeltarx returns [EObject current=null] : iv_ruleDeltarx= ruleDeltarx EOF ;
    public final EObject entryRuleDeltarx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltarx = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:68:2: (iv_ruleDeltarx= ruleDeltarx EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:69:2: iv_ruleDeltarx= ruleDeltarx EOF
            {
             newCompositeNode(grammarAccess.getDeltarxRule()); 
            pushFollow(FOLLOW_ruleDeltarx_in_entryRuleDeltarx75);
            iv_ruleDeltarx=ruleDeltarx();

            state._fsp--;

             current =iv_ruleDeltarx; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltarx85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltarx"


    // $ANTLR start "ruleDeltarx"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:76:1: ruleDeltarx returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDeltarx() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_fmdir_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_signals_8_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_connectors_16_0 = null;

        EObject lv_deltas_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?)
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=6;
                int LA6_0 = input.LA(1);

                if ( LA6_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                    alt6=5;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:90:102: ( ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:91:6: ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:94:6: ({...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:94:7: {...}? => (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "true");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:94:16: (otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )? )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:94:18: otherlv_1= 'architecture' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for featuremodel' ( (lv_fmdir_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleDeltarx167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDeltarxAccess().getArchitectureKeyword_0_0());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:98:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:99:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:99:1: (lv_name_2_0= RULE_ID )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:100:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltarx184); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getDeltarxAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeltarxRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDeltarx201); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDeltarxAccess().getForFeaturemodelKeyword_0_2());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:120:1: ( (lv_fmdir_4_0= RULE_STRING ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:121:1: (lv_fmdir_4_0= RULE_STRING )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:121:1: (lv_fmdir_4_0= RULE_STRING )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:122:3: lv_fmdir_4_0= RULE_STRING
            	    {
            	    lv_fmdir_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeltarx218); 

            	    			newLeafNode(lv_fmdir_4_0, grammarAccess.getDeltarxAccess().getFmdirSTRINGTerminalRuleCall_0_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDeltarxRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"fmdir",
            	            		lv_fmdir_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDeltarx235); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_4());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:142:1: (otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==14) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:142:3: otherlv_6= 'signals' otherlv_7= '{' ( (lv_signals_8_0= ruleSignal ) )* otherlv_9= '}'
            	            {
            	            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDeltarx248); 

            	                	newLeafNode(otherlv_6, grammarAccess.getDeltarxAccess().getSignalsKeyword_0_5_0());
            	                
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDeltarx260); 

            	                	newLeafNode(otherlv_7, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_5_1());
            	                
            	            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:150:1: ( (lv_signals_8_0= ruleSignal ) )*
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( (LA1_0==RULE_ID) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:151:1: (lv_signals_8_0= ruleSignal )
            	            	    {
            	            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:151:1: (lv_signals_8_0= ruleSignal )
            	            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:152:3: lv_signals_8_0= ruleSignal
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getDeltarxAccess().getSignalsSignalParserRuleCall_0_5_2_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleSignal_in_ruleDeltarx281);
            	            	    lv_signals_8_0=ruleSignal();

            	            	    state._fsp--;


            	            	    	        if (current==null) {
            	            	    	            current = createModelElementForParent(grammarAccess.getDeltarxRule());
            	            	    	        }
            	            	           		add(
            	            	           			current, 
            	            	           			"signals",
            	            	            		lv_signals_8_0, 
            	            	            		"Signal");
            	            	    	        afterParserOrEnumRuleCall();
            	            	    	    

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop1;
            	                }
            	            } while (true);

            	            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleDeltarx294); 

            	                	newLeafNode(otherlv_9, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_0_5_3());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:179:4: ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:179:4: ({...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:180:5: {...}? => ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:180:102: ( ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:181:6: ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:184:6: ({...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:184:7: {...}? => (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "true");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:184:16: (otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}' )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:184:18: otherlv_10= 'components' otherlv_11= '{' ( (lv_components_12_0= ruleComponent ) )* otherlv_13= '}'
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleDeltarx364); 

            	        	newLeafNode(otherlv_10, grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0());
            	        
            	    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleDeltarx376); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:192:1: ( (lv_components_12_0= ruleComponent ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:193:1: (lv_components_12_0= ruleComponent )
            	    	    {
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:193:1: (lv_components_12_0= ruleComponent )
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:194:3: lv_components_12_0= ruleComponent
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeltarxAccess().getComponentsComponentParserRuleCall_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleComponent_in_ruleDeltarx397);
            	    	    lv_components_12_0=ruleComponent();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeltarxRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"components",
            	    	            		lv_components_12_0, 
            	    	            		"Component");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleDeltarx410); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:221:4: ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:221:4: ({...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:222:5: {...}? => ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:222:102: ( ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:223:6: ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:226:6: ({...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:226:7: {...}? => (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "true");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:226:16: (otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}' )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:226:18: otherlv_14= 'connectors' otherlv_15= '{' ( (lv_connectors_16_0= ruleConnector ) )* otherlv_17= '}'
            	    {
            	    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleDeltarx478); 

            	        	newLeafNode(otherlv_14, grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0());
            	        
            	    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleDeltarx490); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:234:1: ( (lv_connectors_16_0= ruleConnector ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==RULE_ID) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:235:1: (lv_connectors_16_0= ruleConnector )
            	    	    {
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:235:1: (lv_connectors_16_0= ruleConnector )
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:236:3: lv_connectors_16_0= ruleConnector
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeltarxAccess().getConnectorsConnectorParserRuleCall_2_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleConnector_in_ruleDeltarx511);
            	    	    lv_connectors_16_0=ruleConnector();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeltarxRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connectors",
            	    	            		lv_connectors_16_0, 
            	    	            		"Connector");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleDeltarx524); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:263:4: ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:263:4: ({...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:264:5: {...}? => ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:264:102: ( ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:265:6: ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:268:6: ({...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:268:7: {...}? => (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "true");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:268:16: (otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}' )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:268:18: otherlv_18= 'deltas' otherlv_19= '{' ( (lv_deltas_20_0= ruleDelta ) )* otherlv_21= '}'
            	    {
            	    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleDeltarx592); 

            	        	newLeafNode(otherlv_18, grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0());
            	        
            	    otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleDeltarx604); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1());
            	        
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:276:1: ( (lv_deltas_20_0= ruleDelta ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:277:1: (lv_deltas_20_0= ruleDelta )
            	    	    {
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:277:1: (lv_deltas_20_0= ruleDelta )
            	    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:278:3: lv_deltas_20_0= ruleDelta
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDeltarxAccess().getDeltasDeltaParserRuleCall_3_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDelta_in_ruleDeltarx625);
            	    	    lv_deltas_20_0=ruleDelta();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDeltarxRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"deltas",
            	    	            		lv_deltas_20_0, 
            	    	            		"Delta");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleDeltarx638); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:305:4: ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) )
            	    {
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:305:4: ({...}? => ( ({...}? => (otherlv_22= '}' ) ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:306:5: {...}? => ( ({...}? => (otherlv_22= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:306:102: ( ({...}? => (otherlv_22= '}' ) ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:307:6: ({...}? => (otherlv_22= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:310:6: ({...}? => (otherlv_22= '}' ) )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:310:7: {...}? => (otherlv_22= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDeltarx", "true");
            	    }
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:310:16: (otherlv_22= '}' )
            	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:310:18: otherlv_22= '}'
            	    {
            	    otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleDeltarx706); 

            	        	newLeafNode(otherlv_22, grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeltarxAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDeltarx", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeltarxAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltarx"


    // $ANTLR start "entryRuleSignal"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:337:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:338:2: (iv_ruleSignal= ruleSignal EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:339:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal788);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:346:1: ruleSignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleSignalType ) ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:349:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleSignalType ) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:350:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleSignalType ) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:350:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleSignalType ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:350:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleSignalType ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:350:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:351:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:351:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:352:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal840); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:368:2: ( (lv_type_1_0= ruleSignalType ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:369:1: (lv_type_1_0= ruleSignalType )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:369:1: (lv_type_1_0= ruleSignalType )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:370:3: lv_type_1_0= ruleSignalType
            {
             
            	        newCompositeNode(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSignalType_in_ruleSignal866);
            lv_type_1_0=ruleSignalType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignalRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"SignalType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:394:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:395:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:396:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent902);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:403:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )? (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )? (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_ports_4_0 = null;

        EObject lv_connectors_8_0 = null;

        EObject lv_subcomponents_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:406:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )? (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )? (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:407:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )? (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )? (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:407:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )? (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )? (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:407:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )? (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )? (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:407:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:408:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:408:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:409:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent954); 

            			newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleComponent971); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:429:1: (otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:429:3: otherlv_2= 'ports' otherlv_3= '{' ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleComponent984); 

                        	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getPortsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleComponent996); 

                        	newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:437:1: ( (lv_ports_4_0= rulePort ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=25 && LA7_0<=26)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:438:1: (lv_ports_4_0= rulePort )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:438:1: (lv_ports_4_0= rulePort )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:439:3: lv_ports_4_0= rulePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePort_in_ruleComponent1017);
                    	    lv_ports_4_0=rulePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ports",
                    	            		lv_ports_4_0, 
                    	            		"Port");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleComponent1030); 

                        	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:459:3: (otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:459:5: otherlv_6= 'connectors' otherlv_7= '{' ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleComponent1045); 

                        	newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getConnectorsKeyword_3_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleComponent1057); 

                        	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:467:1: ( (lv_connectors_8_0= ruleConnector ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:468:1: (lv_connectors_8_0= ruleConnector )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:468:1: (lv_connectors_8_0= ruleConnector )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:469:3: lv_connectors_8_0= ruleConnector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnector_in_ruleComponent1078);
                    	    lv_connectors_8_0=ruleConnector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"connectors",
                    	            		lv_connectors_8_0, 
                    	            		"Connector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleComponent1091); 

                        	newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:489:3: (otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:489:5: otherlv_10= 'subcomponents' otherlv_11= '{' ( (lv_subcomponents_12_0= ruleComponent ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleComponent1106); 

                        	newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getSubcomponentsKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleComponent1118); 

                        	newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:497:1: ( (lv_subcomponents_12_0= ruleComponent ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:498:1: (lv_subcomponents_12_0= ruleComponent )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:498:1: (lv_subcomponents_12_0= ruleComponent )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:499:3: lv_subcomponents_12_0= ruleComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getComponentAccess().getSubcomponentsComponentParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComponent_in_ruleComponent1139);
                    	    lv_subcomponents_12_0=ruleComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subcomponents",
                    	            		lv_subcomponents_12_0, 
                    	            		"Component");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleComponent1152); 

                        	newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleComponent1166); 

                	newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:531:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:532:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:533:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1202);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:540:1: rulePort returns [EObject current=null] : ( ( (lv_direction_0_0= rulePortDirection ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_direction_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:543:28: ( ( ( (lv_direction_0_0= rulePortDirection ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:544:1: ( ( (lv_direction_0_0= rulePortDirection ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:544:1: ( ( (lv_direction_0_0= rulePortDirection ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )? )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:544:2: ( (lv_direction_0_0= rulePortDirection ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:544:2: ( (lv_direction_0_0= rulePortDirection ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:545:1: (lv_direction_0_0= rulePortDirection )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:545:1: (lv_direction_0_0= rulePortDirection )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:546:3: lv_direction_0_0= rulePortDirection
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getDirectionPortDirectionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePortDirection_in_rulePort1258);
            lv_direction_0_0=rulePortDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_0_0, 
                    		"PortDirection");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:562:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:563:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:563:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:564:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1275); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:580:2: ( (otherlv_2= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:581:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:581:1: (otherlv_2= RULE_ID )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:582:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPortRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1300); 

                    		newLeafNode(otherlv_2, grammarAccess.getPortAccess().getSignalSignalCrossReference_2_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleSignalType"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:601:1: entryRuleSignalType returns [String current=null] : iv_ruleSignalType= ruleSignalType EOF ;
    public final String entryRuleSignalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignalType = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:602:2: (iv_ruleSignalType= ruleSignalType EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:603:2: iv_ruleSignalType= ruleSignalType EOF
            {
             newCompositeNode(grammarAccess.getSignalTypeRule()); 
            pushFollow(FOLLOW_ruleSignalType_in_entryRuleSignalType1338);
            iv_ruleSignalType=ruleSignalType();

            state._fsp--;

             current =iv_ruleSignalType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalType1349); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalType"


    // $ANTLR start "ruleSignalType"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:610:1: ruleSignalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'char' | kw= 'int' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken ruleSignalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:613:28: ( (kw= 'boolean' | kw= 'char' | kw= 'int' | kw= 'double' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:614:1: (kw= 'boolean' | kw= 'char' | kw= 'int' | kw= 'double' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:614:1: (kw= 'boolean' | kw= 'char' | kw= 'int' | kw= 'double' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case 22:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 24:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:615:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleSignalType1387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignalTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:622:2: kw= 'char'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleSignalType1406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignalTypeAccess().getCharKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:629:2: kw= 'int'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleSignalType1425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignalTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:636:2: kw= 'double'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleSignalType1444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignalTypeAccess().getDoubleKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalType"


    // $ANTLR start "entryRulePortDirection"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:649:1: entryRulePortDirection returns [String current=null] : iv_rulePortDirection= rulePortDirection EOF ;
    public final String entryRulePortDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePortDirection = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:650:2: (iv_rulePortDirection= rulePortDirection EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:651:2: iv_rulePortDirection= rulePortDirection EOF
            {
             newCompositeNode(grammarAccess.getPortDirectionRule()); 
            pushFollow(FOLLOW_rulePortDirection_in_entryRulePortDirection1485);
            iv_rulePortDirection=rulePortDirection();

            state._fsp--;

             current =iv_rulePortDirection.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePortDirection1496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortDirection"


    // $ANTLR start "rulePortDirection"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:658:1: rulePortDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'in' | kw= 'out' ) ;
    public final AntlrDatatypeRuleToken rulePortDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:661:28: ( (kw= 'in' | kw= 'out' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:662:1: (kw= 'in' | kw= 'out' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:662:1: (kw= 'in' | kw= 'out' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:663:2: kw= 'in'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulePortDirection1534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPortDirectionAccess().getInKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:670:2: kw= 'out'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_rulePortDirection1553); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPortDirectionAccess().getOutKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortDirection"


    // $ANTLR start "entryRuleEnvironmentMessage"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:683:1: entryRuleEnvironmentMessage returns [String current=null] : iv_ruleEnvironmentMessage= ruleEnvironmentMessage EOF ;
    public final String entryRuleEnvironmentMessage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnvironmentMessage = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:684:2: (iv_ruleEnvironmentMessage= ruleEnvironmentMessage EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:685:2: iv_ruleEnvironmentMessage= ruleEnvironmentMessage EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentMessageRule()); 
            pushFollow(FOLLOW_ruleEnvironmentMessage_in_entryRuleEnvironmentMessage1594);
            iv_ruleEnvironmentMessage=ruleEnvironmentMessage();

            state._fsp--;

             current =iv_ruleEnvironmentMessage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentMessage1605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironmentMessage"


    // $ANTLR start "ruleEnvironmentMessage"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:692:1: ruleEnvironmentMessage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'envmsg' ;
    public final AntlrDatatypeRuleToken ruleEnvironmentMessage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:695:28: (kw= 'envmsg' )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:697:2: kw= 'envmsg'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleEnvironmentMessage1642); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEnvironmentMessageAccess().getEnvmsgKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironmentMessage"


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:710:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:711:2: (iv_ruleConnector= ruleConnector EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:712:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1681);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:719:1: ruleConnector returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:722:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:723:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:723:2: ( (lv_name_0_0= RULE_ID ) ) ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:723:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:724:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:724:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:725:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector1733); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:741:2: ( ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:742:1: ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:742:1: ( (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:743:1: (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:743:1: (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:744:3: lv_type_1_1= ruleConnectorTypeOne
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getTypeConnectorTypeOneParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConnectorTypeOne_in_ruleConnector1761);
                    lv_type_1_1=ruleConnectorTypeOne();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_1, 
                            		"ConnectorTypeOne");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:759:8: lv_type_1_2= ruleConnectorTypeTwo
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorAccess().getTypeConnectorTypeTwoParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleConnectorTypeTwo_in_ruleConnector1780);
                    lv_type_1_2=ruleConnectorTypeTwo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_2, 
                            		"ConnectorTypeTwo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleConnectorTypeOne"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:785:1: entryRuleConnectorTypeOne returns [EObject current=null] : iv_ruleConnectorTypeOne= ruleConnectorTypeOne EOF ;
    public final EObject entryRuleConnectorTypeOne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTypeOne = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:786:2: (iv_ruleConnectorTypeOne= ruleConnectorTypeOne EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:787:2: iv_ruleConnectorTypeOne= ruleConnectorTypeOne EOF
            {
             newCompositeNode(grammarAccess.getConnectorTypeOneRule()); 
            pushFollow(FOLLOW_ruleConnectorTypeOne_in_entryRuleConnectorTypeOne1819);
            iv_ruleConnectorTypeOne=ruleConnectorTypeOne();

            state._fsp--;

             current =iv_ruleConnectorTypeOne; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorTypeOne1829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorTypeOne"


    // $ANTLR start "ruleConnectorTypeOne"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:794:1: ruleConnectorTypeOne returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) ) otherlv_4= ',' ( (lv_signaltypeone_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_signaltypetwo_7_0= RULE_ID ) ) otherlv_8= ',' ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) ) otherlv_10= ',' ( (lv_destination_11_0= RULE_ID ) ) otherlv_12= ')' ) ;
    public final EObject ruleConnectorTypeOne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token lv_portnameone_3_1=null;
        Token otherlv_4=null;
        Token lv_signaltypeone_5_0=null;
        Token otherlv_6=null;
        Token lv_signaltypetwo_7_0=null;
        Token otherlv_8=null;
        Token lv_portnametwo_9_1=null;
        Token otherlv_10=null;
        Token lv_destination_11_0=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_portnameone_3_2 = null;

        AntlrDatatypeRuleToken lv_portnametwo_9_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:797:28: ( (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) ) otherlv_4= ',' ( (lv_signaltypeone_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_signaltypetwo_7_0= RULE_ID ) ) otherlv_8= ',' ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) ) otherlv_10= ',' ( (lv_destination_11_0= RULE_ID ) ) otherlv_12= ')' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:798:1: (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) ) otherlv_4= ',' ( (lv_signaltypeone_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_signaltypetwo_7_0= RULE_ID ) ) otherlv_8= ',' ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) ) otherlv_10= ',' ( (lv_destination_11_0= RULE_ID ) ) otherlv_12= ')' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:798:1: (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) ) otherlv_4= ',' ( (lv_signaltypeone_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_signaltypetwo_7_0= RULE_ID ) ) otherlv_8= ',' ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) ) otherlv_10= ',' ( (lv_destination_11_0= RULE_ID ) ) otherlv_12= ')' )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:798:3: otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) ) otherlv_4= ',' ( (lv_signaltypeone_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_signaltypetwo_7_0= RULE_ID ) ) otherlv_8= ',' ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) ) otherlv_10= ',' ( (lv_destination_11_0= RULE_ID ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConnectorTypeOne1866); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorTypeOneAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:802:1: ( (lv_source_1_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:803:1: (lv_source_1_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:803:1: (lv_source_1_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:804:3: lv_source_1_0= RULE_ID
            {
            lv_source_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne1883); 

            			newLeafNode(lv_source_1_0, grammarAccess.getConnectorTypeOneAccess().getSourceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"source",
                    		lv_source_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeOne1900); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_2());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:824:1: ( ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:825:1: ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:825:1: ( (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:826:1: (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:826:1: (lv_portnameone_3_1= RULE_ID | lv_portnameone_3_2= ruleEnvironmentMessage )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:827:3: lv_portnameone_3_1= RULE_ID
                    {
                    lv_portnameone_3_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne1919); 

                    			newLeafNode(lv_portnameone_3_1, grammarAccess.getConnectorTypeOneAccess().getPortnameoneIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"portnameone",
                            		lv_portnameone_3_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:842:8: lv_portnameone_3_2= ruleEnvironmentMessage
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorTypeOneAccess().getPortnameoneEnvironmentMessageParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleEnvironmentMessage_in_ruleConnectorTypeOne1943);
                    lv_portnameone_3_2=ruleEnvironmentMessage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorTypeOneRule());
                    	        }
                           		set(
                           			current, 
                           			"portnameone",
                            		lv_portnameone_3_2, 
                            		"EnvironmentMessage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeOne1958); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_4());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:864:1: ( (lv_signaltypeone_5_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:865:1: (lv_signaltypeone_5_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:865:1: (lv_signaltypeone_5_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:866:3: lv_signaltypeone_5_0= RULE_ID
            {
            lv_signaltypeone_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne1975); 

            			newLeafNode(lv_signaltypeone_5_0, grammarAccess.getConnectorTypeOneAccess().getSignaltypeoneIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"signaltypeone",
                    		lv_signaltypeone_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeOne1992); 

                	newLeafNode(otherlv_6, grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_6());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:886:1: ( (lv_signaltypetwo_7_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:887:1: (lv_signaltypetwo_7_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:887:1: (lv_signaltypetwo_7_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:888:3: lv_signaltypetwo_7_0= RULE_ID
            {
            lv_signaltypetwo_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne2009); 

            			newLeafNode(lv_signaltypetwo_7_0, grammarAccess.getConnectorTypeOneAccess().getSignaltypetwoIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"signaltypetwo",
                    		lv_signaltypetwo_7_0, 
                    		"ID");
            	    

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeOne2026); 

                	newLeafNode(otherlv_8, grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_8());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:908:1: ( ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:909:1: ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:909:1: ( (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:910:1: (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:910:1: (lv_portnametwo_9_1= RULE_ID | lv_portnametwo_9_2= ruleEnvironmentMessage )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:911:3: lv_portnametwo_9_1= RULE_ID
                    {
                    lv_portnametwo_9_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne2045); 

                    			newLeafNode(lv_portnametwo_9_1, grammarAccess.getConnectorTypeOneAccess().getPortnametwoIDTerminalRuleCall_9_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"portnametwo",
                            		lv_portnametwo_9_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:926:8: lv_portnametwo_9_2= ruleEnvironmentMessage
                    {
                     
                    	        newCompositeNode(grammarAccess.getConnectorTypeOneAccess().getPortnametwoEnvironmentMessageParserRuleCall_9_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleEnvironmentMessage_in_ruleConnectorTypeOne2069);
                    lv_portnametwo_9_2=ruleEnvironmentMessage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConnectorTypeOneRule());
                    	        }
                           		set(
                           			current, 
                           			"portnametwo",
                            		lv_portnametwo_9_2, 
                            		"EnvironmentMessage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeOne2084); 

                	newLeafNode(otherlv_10, grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_10());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:948:1: ( (lv_destination_11_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:949:1: (lv_destination_11_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:949:1: (lv_destination_11_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:950:3: lv_destination_11_0= RULE_ID
            {
            lv_destination_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeOne2101); 

            			newLeafNode(lv_destination_11_0, grammarAccess.getConnectorTypeOneAccess().getDestinationIDTerminalRuleCall_11_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeOneRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"destination",
                    		lv_destination_11_0, 
                    		"ID");
            	    

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleConnectorTypeOne2118); 

                	newLeafNode(otherlv_12, grammarAccess.getConnectorTypeOneAccess().getRightParenthesisKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorTypeOne"


    // $ANTLR start "entryRuleConnectorTypeTwo"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:978:1: entryRuleConnectorTypeTwo returns [EObject current=null] : iv_ruleConnectorTypeTwo= ruleConnectorTypeTwo EOF ;
    public final EObject entryRuleConnectorTypeTwo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectorTypeTwo = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:979:2: (iv_ruleConnectorTypeTwo= ruleConnectorTypeTwo EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:980:2: iv_ruleConnectorTypeTwo= ruleConnectorTypeTwo EOF
            {
             newCompositeNode(grammarAccess.getConnectorTypeTwoRule()); 
            pushFollow(FOLLOW_ruleConnectorTypeTwo_in_entryRuleConnectorTypeTwo2154);
            iv_ruleConnectorTypeTwo=ruleConnectorTypeTwo();

            state._fsp--;

             current =iv_ruleConnectorTypeTwo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorTypeTwo2164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectorTypeTwo"


    // $ANTLR start "ruleConnectorTypeTwo"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:987:1: ruleConnectorTypeTwo returns [EObject current=null] : (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_sourcesignal_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_destinationsignal_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_destination_7_0= RULE_ID ) ) otherlv_8= ')' ) ;
    public final EObject ruleConnectorTypeTwo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token lv_sourcesignal_3_0=null;
        Token otherlv_4=null;
        Token lv_destinationsignal_5_0=null;
        Token otherlv_6=null;
        Token lv_destination_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:990:28: ( (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_sourcesignal_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_destinationsignal_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_destination_7_0= RULE_ID ) ) otherlv_8= ')' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:991:1: (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_sourcesignal_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_destinationsignal_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_destination_7_0= RULE_ID ) ) otherlv_8= ')' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:991:1: (otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_sourcesignal_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_destinationsignal_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_destination_7_0= RULE_ID ) ) otherlv_8= ')' )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:991:3: otherlv_0= '(' ( (lv_source_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_sourcesignal_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_destinationsignal_5_0= RULE_ID ) ) otherlv_6= ',' ( (lv_destination_7_0= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleConnectorTypeTwo2201); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorTypeTwoAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:995:1: ( (lv_source_1_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:996:1: (lv_source_1_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:996:1: (lv_source_1_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:997:3: lv_source_1_0= RULE_ID
            {
            lv_source_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2218); 

            			newLeafNode(lv_source_1_0, grammarAccess.getConnectorTypeTwoAccess().getSourceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeTwoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"source",
                    		lv_source_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeTwo2235); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_2());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1017:1: ( (lv_sourcesignal_3_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1018:1: (lv_sourcesignal_3_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1018:1: (lv_sourcesignal_3_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1019:3: lv_sourcesignal_3_0= RULE_ID
            {
            lv_sourcesignal_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2252); 

            			newLeafNode(lv_sourcesignal_3_0, grammarAccess.getConnectorTypeTwoAccess().getSourcesignalIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeTwoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcesignal",
                    		lv_sourcesignal_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeTwo2269); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_4());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1039:1: ( (lv_destinationsignal_5_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1040:1: (lv_destinationsignal_5_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1040:1: (lv_destinationsignal_5_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1041:3: lv_destinationsignal_5_0= RULE_ID
            {
            lv_destinationsignal_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2286); 

            			newLeafNode(lv_destinationsignal_5_0, grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeTwoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"destinationsignal",
                    		lv_destinationsignal_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleConnectorTypeTwo2303); 

                	newLeafNode(otherlv_6, grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_6());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1061:1: ( (lv_destination_7_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1062:1: (lv_destination_7_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1062:1: (lv_destination_7_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1063:3: lv_destination_7_0= RULE_ID
            {
            lv_destination_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2320); 

            			newLeafNode(lv_destination_7_0, grammarAccess.getConnectorTypeTwoAccess().getDestinationIDTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorTypeTwoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"destination",
                    		lv_destination_7_0, 
                    		"ID");
            	    

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleConnectorTypeTwo2337); 

                	newLeafNode(otherlv_8, grammarAccess.getConnectorTypeTwoAccess().getRightParenthesisKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectorTypeTwo"


    // $ANTLR start "entryRuleDelta"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1091:1: entryRuleDelta returns [EObject current=null] : iv_ruleDelta= ruleDelta EOF ;
    public final EObject entryRuleDelta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelta = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1092:2: (iv_ruleDelta= ruleDelta EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1093:2: iv_ruleDelta= ruleDelta EOF
            {
             newCompositeNode(grammarAccess.getDeltaRule()); 
            pushFollow(FOLLOW_ruleDelta_in_entryRuleDelta2373);
            iv_ruleDelta=ruleDelta();

            state._fsp--;

             current =iv_ruleDelta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelta2383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelta"


    // $ANTLR start "ruleDelta"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1100:1: ruleDelta returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )? otherlv_3= 'when' ( (lv_appcon_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )? (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )? (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )? (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )? (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )? (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )? (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )? (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )? otherlv_38= '}' ) ;
    public final EObject ruleDelta() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_after_2_0=null;
        Token otherlv_3=null;
        Token lv_appcon_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_removeConnector_8_0 = null;

        EObject lv_removeComponent_12_0 = null;

        EObject lv_removePort_20_0 = null;

        EObject lv_newSignal_24_0 = null;

        EObject lv_newComponent_28_0 = null;

        EObject lv_newConnector_32_0 = null;

        EObject lv_newPort_36_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1103:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )? otherlv_3= 'when' ( (lv_appcon_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )? (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )? (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )? (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )? (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )? (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )? (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )? (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )? otherlv_38= '}' ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1104:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )? otherlv_3= 'when' ( (lv_appcon_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )? (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )? (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )? (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )? (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )? (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )? (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )? (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )? otherlv_38= '}' )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1104:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )? otherlv_3= 'when' ( (lv_appcon_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )? (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )? (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )? (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )? (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )? (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )? (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )? (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )? otherlv_38= '}' )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1104:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )? otherlv_3= 'when' ( (lv_appcon_4_0= RULE_STRING ) ) otherlv_5= '{' (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )? (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )? (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )? (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )? (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )? (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )? (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )? (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )? otherlv_38= '}'
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1104:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1105:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1105:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1106:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelta2425); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDeltaAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1122:2: (otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1122:4: otherlv_1= 'after' ( (lv_after_2_0= RULE_ID ) )*
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDelta2443); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeltaAccess().getAfterKeyword_1_0());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1126:1: ( (lv_after_2_0= RULE_ID ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1127:1: (lv_after_2_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1127:1: (lv_after_2_0= RULE_ID )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1128:3: lv_after_2_0= RULE_ID
                    	    {
                    	    lv_after_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelta2460); 

                    	    			newLeafNode(lv_after_2_0, grammarAccess.getDeltaAccess().getAfterIDTerminalRuleCall_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"after",
                    	            		lv_after_2_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDelta2480); 

                	newLeafNode(otherlv_3, grammarAccess.getDeltaAccess().getWhenKeyword_2());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1148:1: ( (lv_appcon_4_0= RULE_STRING ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1149:1: (lv_appcon_4_0= RULE_STRING )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1149:1: (lv_appcon_4_0= RULE_STRING )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1150:3: lv_appcon_4_0= RULE_STRING
            {
            lv_appcon_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDelta2497); 

            			newLeafNode(lv_appcon_4_0, grammarAccess.getDeltaAccess().getAppconSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"appcon",
                    		lv_appcon_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDelta2514); 

                	newLeafNode(otherlv_5, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1170:1: (otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1170:3: otherlv_6= 'removeconnector' otherlv_7= '{' ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleDelta2527); 

                        	newLeafNode(otherlv_6, grammarAccess.getDeltaAccess().getRemoveconnectorKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDelta2539); 

                        	newLeafNode(otherlv_7, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1178:1: ( (lv_removeConnector_8_0= ruleDeltaRemoveConnector ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1179:1: (lv_removeConnector_8_0= ruleDeltaRemoveConnector )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1179:1: (lv_removeConnector_8_0= ruleDeltaRemoveConnector )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1180:3: lv_removeConnector_8_0= ruleDeltaRemoveConnector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getRemoveConnectorDeltaRemoveConnectorParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaRemoveConnector_in_ruleDelta2560);
                    	    lv_removeConnector_8_0=ruleDeltaRemoveConnector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"removeConnector",
                    	            		lv_removeConnector_8_0, 
                    	            		"DeltaRemoveConnector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleDelta2573); 

                        	newLeafNode(otherlv_9, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1200:3: (otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1200:5: otherlv_10= 'removecomponent' otherlv_11= '{' ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_34_in_ruleDelta2588); 

                        	newLeafNode(otherlv_10, grammarAccess.getDeltaAccess().getRemovecomponentKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleDelta2600); 

                        	newLeafNode(otherlv_11, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1208:1: ( (lv_removeComponent_12_0= ruleDeltaRemoveComponent ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_ID) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1209:1: (lv_removeComponent_12_0= ruleDeltaRemoveComponent )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1209:1: (lv_removeComponent_12_0= ruleDeltaRemoveComponent )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1210:3: lv_removeComponent_12_0= ruleDeltaRemoveComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getRemoveComponentDeltaRemoveComponentParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaRemoveComponent_in_ruleDelta2621);
                    	    lv_removeComponent_12_0=ruleDeltaRemoveComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"removeComponent",
                    	            		lv_removeComponent_12_0, 
                    	            		"DeltaRemoveComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleDelta2634); 

                        	newLeafNode(otherlv_13, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1230:3: (otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1230:5: otherlv_14= 'removesignal' otherlv_15= '{' ( (otherlv_16= RULE_ID ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,35,FOLLOW_35_in_ruleDelta2649); 

                        	newLeafNode(otherlv_14, grammarAccess.getDeltaAccess().getRemovesignalKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleDelta2661); 

                        	newLeafNode(otherlv_15, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1238:1: ( (otherlv_16= RULE_ID ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_ID) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1239:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1239:1: (otherlv_16= RULE_ID )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1240:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getDeltaRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelta2681); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getDeltaAccess().getRemoveSignalSignalCrossReference_7_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleDelta2694); 

                        	newLeafNode(otherlv_17, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_7_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1255:3: (otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1255:5: otherlv_18= 'removeport' otherlv_19= '{' ( (lv_removePort_20_0= ruleDeltaRemovePort ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_ruleDelta2709); 

                        	newLeafNode(otherlv_18, grammarAccess.getDeltaAccess().getRemoveportKeyword_8_0());
                        
                    otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleDelta2721); 

                        	newLeafNode(otherlv_19, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1263:1: ( (lv_removePort_20_0= ruleDeltaRemovePort ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_ID) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1264:1: (lv_removePort_20_0= ruleDeltaRemovePort )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1264:1: (lv_removePort_20_0= ruleDeltaRemovePort )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1265:3: lv_removePort_20_0= ruleDeltaRemovePort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getRemovePortDeltaRemovePortParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaRemovePort_in_ruleDelta2742);
                    	    lv_removePort_20_0=ruleDeltaRemovePort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"removePort",
                    	            		lv_removePort_20_0, 
                    	            		"DeltaRemovePort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleDelta2755); 

                        	newLeafNode(otherlv_21, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1285:3: (otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1285:5: otherlv_22= 'addsignal' otherlv_23= '{' ( (lv_newSignal_24_0= ruleSignal ) )* otherlv_25= '}'
                    {
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_ruleDelta2770); 

                        	newLeafNode(otherlv_22, grammarAccess.getDeltaAccess().getAddsignalKeyword_9_0());
                        
                    otherlv_23=(Token)match(input,13,FOLLOW_13_in_ruleDelta2782); 

                        	newLeafNode(otherlv_23, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1293:1: ( (lv_newSignal_24_0= ruleSignal ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==RULE_ID) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1294:1: (lv_newSignal_24_0= ruleSignal )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1294:1: (lv_newSignal_24_0= ruleSignal )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1295:3: lv_newSignal_24_0= ruleSignal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getNewSignalSignalParserRuleCall_9_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleDelta2803);
                    	    lv_newSignal_24_0=ruleSignal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newSignal",
                    	            		lv_newSignal_24_0, 
                    	            		"Signal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleDelta2816); 

                        	newLeafNode(otherlv_25, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_9_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1315:3: (otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1315:5: otherlv_26= 'addcomponent' otherlv_27= '{' ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )* otherlv_29= '}'
                    {
                    otherlv_26=(Token)match(input,38,FOLLOW_38_in_ruleDelta2831); 

                        	newLeafNode(otherlv_26, grammarAccess.getDeltaAccess().getAddcomponentKeyword_10_0());
                        
                    otherlv_27=(Token)match(input,13,FOLLOW_13_in_ruleDelta2843); 

                        	newLeafNode(otherlv_27, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_10_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1323:1: ( (lv_newComponent_28_0= ruleDeltaAddComponent ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==RULE_ID) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1324:1: (lv_newComponent_28_0= ruleDeltaAddComponent )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1324:1: (lv_newComponent_28_0= ruleDeltaAddComponent )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1325:3: lv_newComponent_28_0= ruleDeltaAddComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getNewComponentDeltaAddComponentParserRuleCall_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaAddComponent_in_ruleDelta2864);
                    	    lv_newComponent_28_0=ruleDeltaAddComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newComponent",
                    	            		lv_newComponent_28_0, 
                    	            		"DeltaAddComponent");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,15,FOLLOW_15_in_ruleDelta2877); 

                        	newLeafNode(otherlv_29, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_10_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1345:3: (otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1345:5: otherlv_30= 'addconnector' otherlv_31= '{' ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )* otherlv_33= '}'
                    {
                    otherlv_30=(Token)match(input,39,FOLLOW_39_in_ruleDelta2892); 

                        	newLeafNode(otherlv_30, grammarAccess.getDeltaAccess().getAddconnectorKeyword_11_0());
                        
                    otherlv_31=(Token)match(input,13,FOLLOW_13_in_ruleDelta2904); 

                        	newLeafNode(otherlv_31, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1353:1: ( (lv_newConnector_32_0= ruleDeltaAddConnector ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_ID) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1354:1: (lv_newConnector_32_0= ruleDeltaAddConnector )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1354:1: (lv_newConnector_32_0= ruleDeltaAddConnector )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1355:3: lv_newConnector_32_0= ruleDeltaAddConnector
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getNewConnectorDeltaAddConnectorParserRuleCall_11_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaAddConnector_in_ruleDelta2925);
                    	    lv_newConnector_32_0=ruleDeltaAddConnector();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newConnector",
                    	            		lv_newConnector_32_0, 
                    	            		"DeltaAddConnector");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_15_in_ruleDelta2938); 

                        	newLeafNode(otherlv_33, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_11_3());
                        

                    }
                    break;

            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1375:3: (otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1375:5: otherlv_34= 'addport' otherlv_35= '{' ( (lv_newPort_36_0= ruleDeltaAddPort ) )* otherlv_37= '}'
                    {
                    otherlv_34=(Token)match(input,40,FOLLOW_40_in_ruleDelta2953); 

                        	newLeafNode(otherlv_34, grammarAccess.getDeltaAccess().getAddportKeyword_12_0());
                        
                    otherlv_35=(Token)match(input,13,FOLLOW_13_in_ruleDelta2965); 

                        	newLeafNode(otherlv_35, grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1383:1: ( (lv_newPort_36_0= ruleDeltaAddPort ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=25 && LA35_0<=26)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1384:1: (lv_newPort_36_0= ruleDeltaAddPort )
                    	    {
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1384:1: (lv_newPort_36_0= ruleDeltaAddPort )
                    	    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1385:3: lv_newPort_36_0= ruleDeltaAddPort
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDeltaAccess().getNewPortDeltaAddPortParserRuleCall_12_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDeltaAddPort_in_ruleDelta2986);
                    	    lv_newPort_36_0=ruleDeltaAddPort();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDeltaRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"newPort",
                    	            		lv_newPort_36_0, 
                    	            		"DeltaAddPort");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,15,FOLLOW_15_in_ruleDelta2999); 

                        	newLeafNode(otherlv_37, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_12_3());
                        

                    }
                    break;

            }

            otherlv_38=(Token)match(input,15,FOLLOW_15_in_ruleDelta3013); 

                	newLeafNode(otherlv_38, grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelta"


    // $ANTLR start "entryRuleDeltaAddPort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1417:1: entryRuleDeltaAddPort returns [EObject current=null] : iv_ruleDeltaAddPort= ruleDeltaAddPort EOF ;
    public final EObject entryRuleDeltaAddPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaAddPort = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1418:2: (iv_ruleDeltaAddPort= ruleDeltaAddPort EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1419:2: iv_ruleDeltaAddPort= ruleDeltaAddPort EOF
            {
             newCompositeNode(grammarAccess.getDeltaAddPortRule()); 
            pushFollow(FOLLOW_ruleDeltaAddPort_in_entryRuleDeltaAddPort3049);
            iv_ruleDeltaAddPort=ruleDeltaAddPort();

            state._fsp--;

             current =iv_ruleDeltaAddPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddPort3059); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaAddPort"


    // $ANTLR start "ruleDeltaAddPort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1426:1: ruleDeltaAddPort returns [EObject current=null] : ( ( (lv_port_0_0= rulePort ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeltaAddPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_portComponent_2_0=null;
        EObject lv_port_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1429:28: ( ( ( (lv_port_0_0= rulePort ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1430:1: ( ( (lv_port_0_0= rulePort ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1430:1: ( ( (lv_port_0_0= rulePort ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1430:2: ( (lv_port_0_0= rulePort ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1430:2: ( (lv_port_0_0= rulePort ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1431:1: (lv_port_0_0= rulePort )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1431:1: (lv_port_0_0= rulePort )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1432:3: lv_port_0_0= rulePort
            {
             
            	        newCompositeNode(grammarAccess.getDeltaAddPortAccess().getPortPortParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePort_in_ruleDeltaAddPort3105);
            lv_port_0_0=rulePort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeltaAddPortRule());
            	        }
                   		set(
                   			current, 
                   			"port",
                    		lv_port_0_0, 
                    		"Port");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaAddPort3117); 

                	newLeafNode(otherlv_1, grammarAccess.getDeltaAddPortAccess().getInKeyword_1());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1452:1: ( (lv_portComponent_2_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1453:1: (lv_portComponent_2_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1453:1: (lv_portComponent_2_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1454:3: lv_portComponent_2_0= RULE_ID
            {
            lv_portComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaAddPort3134); 

            			newLeafNode(lv_portComponent_2_0, grammarAccess.getDeltaAddPortAccess().getPortComponentIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaAddPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"portComponent",
                    		lv_portComponent_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaAddPort"


    // $ANTLR start "entryRuleDeltaRemovePort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1478:1: entryRuleDeltaRemovePort returns [EObject current=null] : iv_ruleDeltaRemovePort= ruleDeltaRemovePort EOF ;
    public final EObject entryRuleDeltaRemovePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaRemovePort = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1479:2: (iv_ruleDeltaRemovePort= ruleDeltaRemovePort EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1480:2: iv_ruleDeltaRemovePort= ruleDeltaRemovePort EOF
            {
             newCompositeNode(grammarAccess.getDeltaRemovePortRule()); 
            pushFollow(FOLLOW_ruleDeltaRemovePort_in_entryRuleDeltaRemovePort3175);
            iv_ruleDeltaRemovePort=ruleDeltaRemovePort();

            state._fsp--;

             current =iv_ruleDeltaRemovePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemovePort3185); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaRemovePort"


    // $ANTLR start "ruleDeltaRemovePort"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1487:1: ruleDeltaRemovePort returns [EObject current=null] : ( ( (lv_portName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeltaRemovePort() throws RecognitionException {
        EObject current = null;

        Token lv_portName_0_0=null;
        Token otherlv_1=null;
        Token lv_portComponent_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1490:28: ( ( ( (lv_portName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1491:1: ( ( (lv_portName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1491:1: ( ( (lv_portName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1491:2: ( (lv_portName_0_0= RULE_ID ) ) otherlv_1= 'in' ( (lv_portComponent_2_0= RULE_ID ) )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1491:2: ( (lv_portName_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1492:1: (lv_portName_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1492:1: (lv_portName_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1493:3: lv_portName_0_0= RULE_ID
            {
            lv_portName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemovePort3227); 

            			newLeafNode(lv_portName_0_0, grammarAccess.getDeltaRemovePortAccess().getPortNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRemovePortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"portName",
                    		lv_portName_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaRemovePort3244); 

                	newLeafNode(otherlv_1, grammarAccess.getDeltaRemovePortAccess().getInKeyword_1());
                
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1513:1: ( (lv_portComponent_2_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1514:1: (lv_portComponent_2_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1514:1: (lv_portComponent_2_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1515:3: lv_portComponent_2_0= RULE_ID
            {
            lv_portComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemovePort3261); 

            			newLeafNode(lv_portComponent_2_0, grammarAccess.getDeltaRemovePortAccess().getPortComponentIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRemovePortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"portComponent",
                    		lv_portComponent_2_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaRemovePort"


    // $ANTLR start "entryRuleDeltaAddComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1539:1: entryRuleDeltaAddComponent returns [EObject current=null] : iv_ruleDeltaAddComponent= ruleDeltaAddComponent EOF ;
    public final EObject entryRuleDeltaAddComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaAddComponent = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1540:2: (iv_ruleDeltaAddComponent= ruleDeltaAddComponent EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1541:2: iv_ruleDeltaAddComponent= ruleDeltaAddComponent EOF
            {
             newCompositeNode(grammarAccess.getDeltaAddComponentRule()); 
            pushFollow(FOLLOW_ruleDeltaAddComponent_in_entryRuleDeltaAddComponent3302);
            iv_ruleDeltaAddComponent=ruleDeltaAddComponent();

            state._fsp--;

             current =iv_ruleDeltaAddComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddComponent3312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaAddComponent"


    // $ANTLR start "ruleDeltaAddComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1548:1: ruleDeltaAddComponent returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeltaAddComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_superComponent_2_0=null;
        EObject lv_component_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1551:28: ( ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1552:1: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1552:1: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1552:2: ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1552:2: ( (lv_component_0_0= ruleComponent ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1553:1: (lv_component_0_0= ruleComponent )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1553:1: (lv_component_0_0= ruleComponent )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1554:3: lv_component_0_0= ruleComponent
            {
             
            	        newCompositeNode(grammarAccess.getDeltaAddComponentAccess().getComponentComponentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleDeltaAddComponent3358);
            lv_component_0_0=ruleComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeltaAddComponentRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_0_0, 
                    		"Component");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1570:2: (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1570:4: otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaAddComponent3371); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeltaAddComponentAccess().getInKeyword_1_0());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1574:1: ( (lv_superComponent_2_0= RULE_ID ) )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1575:1: (lv_superComponent_2_0= RULE_ID )
                    {
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1575:1: (lv_superComponent_2_0= RULE_ID )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1576:3: lv_superComponent_2_0= RULE_ID
                    {
                    lv_superComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaAddComponent3388); 

                    			newLeafNode(lv_superComponent_2_0, grammarAccess.getDeltaAddComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeltaAddComponentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"superComponent",
                            		lv_superComponent_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaAddComponent"


    // $ANTLR start "entryRuleDeltaRemoveComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1600:1: entryRuleDeltaRemoveComponent returns [EObject current=null] : iv_ruleDeltaRemoveComponent= ruleDeltaRemoveComponent EOF ;
    public final EObject entryRuleDeltaRemoveComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaRemoveComponent = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1601:2: (iv_ruleDeltaRemoveComponent= ruleDeltaRemoveComponent EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1602:2: iv_ruleDeltaRemoveComponent= ruleDeltaRemoveComponent EOF
            {
             newCompositeNode(grammarAccess.getDeltaRemoveComponentRule()); 
            pushFollow(FOLLOW_ruleDeltaRemoveComponent_in_entryRuleDeltaRemoveComponent3431);
            iv_ruleDeltaRemoveComponent=ruleDeltaRemoveComponent();

            state._fsp--;

             current =iv_ruleDeltaRemoveComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemoveComponent3441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaRemoveComponent"


    // $ANTLR start "ruleDeltaRemoveComponent"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1609:1: ruleDeltaRemoveComponent returns [EObject current=null] : ( ( (lv_component_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeltaRemoveComponent() throws RecognitionException {
        EObject current = null;

        Token lv_component_0_0=null;
        Token otherlv_1=null;
        Token lv_superComponent_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1612:28: ( ( ( (lv_component_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1613:1: ( ( (lv_component_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1613:1: ( ( (lv_component_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1613:2: ( (lv_component_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1613:2: ( (lv_component_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1614:1: (lv_component_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1614:1: (lv_component_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1615:3: lv_component_0_0= RULE_ID
            {
            lv_component_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemoveComponent3483); 

            			newLeafNode(lv_component_0_0, grammarAccess.getDeltaRemoveComponentAccess().getComponentIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRemoveComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"component",
                    		lv_component_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1631:2: (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1631:4: otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaRemoveComponent3501); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeltaRemoveComponentAccess().getInKeyword_1_0());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1635:1: ( (lv_superComponent_2_0= RULE_ID ) )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1636:1: (lv_superComponent_2_0= RULE_ID )
                    {
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1636:1: (lv_superComponent_2_0= RULE_ID )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1637:3: lv_superComponent_2_0= RULE_ID
                    {
                    lv_superComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemoveComponent3518); 

                    			newLeafNode(lv_superComponent_2_0, grammarAccess.getDeltaRemoveComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeltaRemoveComponentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"superComponent",
                            		lv_superComponent_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaRemoveComponent"


    // $ANTLR start "entryRuleDeltaAddConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1661:1: entryRuleDeltaAddConnector returns [EObject current=null] : iv_ruleDeltaAddConnector= ruleDeltaAddConnector EOF ;
    public final EObject entryRuleDeltaAddConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaAddConnector = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1662:2: (iv_ruleDeltaAddConnector= ruleDeltaAddConnector EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1663:2: iv_ruleDeltaAddConnector= ruleDeltaAddConnector EOF
            {
             newCompositeNode(grammarAccess.getDeltaAddConnectorRule()); 
            pushFollow(FOLLOW_ruleDeltaAddConnector_in_entryRuleDeltaAddConnector3561);
            iv_ruleDeltaAddConnector=ruleDeltaAddConnector();

            state._fsp--;

             current =iv_ruleDeltaAddConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddConnector3571); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaAddConnector"


    // $ANTLR start "ruleDeltaAddConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1670:1: ruleDeltaAddConnector returns [EObject current=null] : ( ( (lv_connector_0_0= ruleConnector ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeltaAddConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_superComponent_2_0=null;
        EObject lv_connector_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1673:28: ( ( ( (lv_connector_0_0= ruleConnector ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1674:1: ( ( (lv_connector_0_0= ruleConnector ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1674:1: ( ( (lv_connector_0_0= ruleConnector ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1674:2: ( (lv_connector_0_0= ruleConnector ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1674:2: ( (lv_connector_0_0= ruleConnector ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1675:1: (lv_connector_0_0= ruleConnector )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1675:1: (lv_connector_0_0= ruleConnector )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1676:3: lv_connector_0_0= ruleConnector
            {
             
            	        newCompositeNode(grammarAccess.getDeltaAddConnectorAccess().getConnectorConnectorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConnector_in_ruleDeltaAddConnector3617);
            lv_connector_0_0=ruleConnector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeltaAddConnectorRule());
            	        }
                   		set(
                   			current, 
                   			"connector",
                    		lv_connector_0_0, 
                    		"Connector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1692:2: (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1692:4: otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaAddConnector3630); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeltaAddConnectorAccess().getInKeyword_1_0());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1696:1: ( (lv_superComponent_2_0= RULE_ID ) )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1697:1: (lv_superComponent_2_0= RULE_ID )
                    {
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1697:1: (lv_superComponent_2_0= RULE_ID )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1698:3: lv_superComponent_2_0= RULE_ID
                    {
                    lv_superComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaAddConnector3647); 

                    			newLeafNode(lv_superComponent_2_0, grammarAccess.getDeltaAddConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeltaAddConnectorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"superComponent",
                            		lv_superComponent_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaAddConnector"


    // $ANTLR start "entryRuleDeltaRemoveConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1722:1: entryRuleDeltaRemoveConnector returns [EObject current=null] : iv_ruleDeltaRemoveConnector= ruleDeltaRemoveConnector EOF ;
    public final EObject entryRuleDeltaRemoveConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaRemoveConnector = null;


        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1723:2: (iv_ruleDeltaRemoveConnector= ruleDeltaRemoveConnector EOF )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1724:2: iv_ruleDeltaRemoveConnector= ruleDeltaRemoveConnector EOF
            {
             newCompositeNode(grammarAccess.getDeltaRemoveConnectorRule()); 
            pushFollow(FOLLOW_ruleDeltaRemoveConnector_in_entryRuleDeltaRemoveConnector3690);
            iv_ruleDeltaRemoveConnector=ruleDeltaRemoveConnector();

            state._fsp--;

             current =iv_ruleDeltaRemoveConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemoveConnector3700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeltaRemoveConnector"


    // $ANTLR start "ruleDeltaRemoveConnector"
    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1731:1: ruleDeltaRemoveConnector returns [EObject current=null] : ( ( (lv_connector_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDeltaRemoveConnector() throws RecognitionException {
        EObject current = null;

        Token lv_connector_0_0=null;
        Token otherlv_1=null;
        Token lv_superComponent_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1734:28: ( ( ( (lv_connector_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1735:1: ( ( (lv_connector_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1735:1: ( ( (lv_connector_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )? )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1735:2: ( (lv_connector_0_0= RULE_ID ) ) (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1735:2: ( (lv_connector_0_0= RULE_ID ) )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1736:1: (lv_connector_0_0= RULE_ID )
            {
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1736:1: (lv_connector_0_0= RULE_ID )
            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1737:3: lv_connector_0_0= RULE_ID
            {
            lv_connector_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemoveConnector3742); 

            			newLeafNode(lv_connector_0_0, grammarAccess.getDeltaRemoveConnectorAccess().getConnectorIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeltaRemoveConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"connector",
                    		lv_connector_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1753:2: (otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1753:4: otherlv_1= 'in' ( (lv_superComponent_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDeltaRemoveConnector3760); 

                        	newLeafNode(otherlv_1, grammarAccess.getDeltaRemoveConnectorAccess().getInKeyword_1_0());
                        
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1757:1: ( (lv_superComponent_2_0= RULE_ID ) )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1758:1: (lv_superComponent_2_0= RULE_ID )
                    {
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1758:1: (lv_superComponent_2_0= RULE_ID )
                    // ../org.xtext.deltarx/src-gen/org/xtext/deltarx/parser/antlr/internal/InternalDeltarx.g:1759:3: lv_superComponent_2_0= RULE_ID
                    {
                    lv_superComponent_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeltaRemoveConnector3777); 

                    			newLeafNode(lv_superComponent_2_0, grammarAccess.getDeltaRemoveConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeltaRemoveConnectorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"superComponent",
                            		lv_superComponent_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeltaRemoveConnector"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\34\1\4\1\35\1\4\1\35\1\uffff\1\4\1\35\1\4\1\35\1\uffff";
    static final String DFA16_maxS =
        "\1\34\1\4\1\35\1\33\1\35\1\uffff\1\4\1\35\1\4\1\36\1\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\1\4\uffff\1\2";
    static final String DFA16_specialS =
        "\13\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\26\uffff\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\5\1\12",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "743:1: (lv_type_1_1= ruleConnectorTypeOne | lv_type_1_2= ruleConnectorTypeTwo )";
        }
    }
 

    public static final BitSet FOLLOW_ruleDeltarx_in_entryRuleDeltarx75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltarx85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDeltarx167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltarx184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDeltarx201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeltarx218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeltarx235 = new BitSet(new long[]{0x000000000007C802L});
    public static final BitSet FOLLOW_14_in_ruleDeltarx248 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeltarx260 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleDeltarx281 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDeltarx294 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_16_in_ruleDeltarx364 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeltarx376 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleDeltarx397 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDeltarx410 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_17_in_ruleDeltarx478 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeltarx490 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleDeltarx511 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDeltarx524 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_18_in_ruleDeltarx592 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeltarx604 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDelta_in_ruleDeltarx625 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDeltarx638 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_15_in_ruleDeltarx706 = new BitSet(new long[]{0x0000000000078802L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal840 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_ruleSignalType_in_ruleSignal866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent954 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent971 = new BitSet(new long[]{0x00000000001A8000L});
    public static final BitSet FOLLOW_19_in_ruleComponent984 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent996 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent1017 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent1030 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleComponent1045 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent1057 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleComponent1078 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleComponent1091 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleComponent1106 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleComponent1118 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleComponent1139 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleComponent1152 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleComponent1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortDirection_in_rulePort1258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1275 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_entryRuleSignalType1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalType1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSignalType1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSignalType1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSignalType1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSignalType1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortDirection_in_entryRulePortDirection1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePortDirection1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulePortDirection1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePortDirection1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_entryRuleEnvironmentMessage1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentMessage1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEnvironmentMessage1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector1733 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleConnectorTypeOne_in_ruleConnector1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeTwo_in_ruleConnector1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeOne_in_entryRuleConnectorTypeOne1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorTypeOne1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConnectorTypeOne1866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne1883 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeOne1900 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne1919 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_ruleConnectorTypeOne1943 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeOne1958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne1975 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeOne1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne2009 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeOne2026 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne2045 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_ruleConnectorTypeOne2069 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeOne2084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeOne2101 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConnectorTypeOne2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeTwo_in_entryRuleConnectorTypeTwo2154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorTypeTwo2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleConnectorTypeTwo2201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2218 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeTwo2235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeTwo2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2286 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleConnectorTypeTwo2303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectorTypeTwo2320 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleConnectorTypeTwo2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelta_in_entryRuleDelta2373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelta2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelta2425 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleDelta2443 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelta2460 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleDelta2480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDelta2497 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2514 = new BitSet(new long[]{0x000001FE00008000L});
    public static final BitSet FOLLOW_33_in_ruleDelta2527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2539 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDeltaRemoveConnector_in_ruleDelta2560 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2573 = new BitSet(new long[]{0x000001FC00008000L});
    public static final BitSet FOLLOW_34_in_ruleDelta2588 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2600 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDeltaRemoveComponent_in_ruleDelta2621 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2634 = new BitSet(new long[]{0x000001F800008000L});
    public static final BitSet FOLLOW_35_in_ruleDelta2649 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2661 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelta2681 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2694 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_36_in_ruleDelta2709 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2721 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDeltaRemovePort_in_ruleDelta2742 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2755 = new BitSet(new long[]{0x000001E000008000L});
    public static final BitSet FOLLOW_37_in_ruleDelta2770 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2782 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleDelta2803 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2816 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_38_in_ruleDelta2831 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2843 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDeltaAddComponent_in_ruleDelta2864 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2877 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_39_in_ruleDelta2892 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2904 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleDeltaAddConnector_in_ruleDelta2925 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleDelta2938 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_40_in_ruleDelta2953 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDelta2965 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_ruleDeltaAddPort_in_ruleDelta2986 = new BitSet(new long[]{0x0000000006008000L});
    public static final BitSet FOLLOW_15_in_ruleDelta2999 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDelta3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddPort_in_entryRuleDeltaAddPort3049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddPort3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_ruleDeltaAddPort3105 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeltaAddPort3117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaAddPort3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemovePort_in_entryRuleDeltaRemovePort3175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemovePort3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemovePort3227 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDeltaRemovePort3244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemovePort3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddComponent_in_entryRuleDeltaAddComponent3302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddComponent3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleDeltaAddComponent3358 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDeltaAddComponent3371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaAddComponent3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveComponent_in_entryRuleDeltaRemoveComponent3431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemoveComponent3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemoveComponent3483 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDeltaRemoveComponent3501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemoveComponent3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddConnector_in_entryRuleDeltaAddConnector3561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddConnector3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleDeltaAddConnector3617 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDeltaAddConnector3630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaAddConnector3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveConnector_in_entryRuleDeltaRemoveConnector3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemoveConnector3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemoveConnector3742 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleDeltaRemoveConnector3760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeltaRemoveConnector3777 = new BitSet(new long[]{0x0000000000000002L});

}
