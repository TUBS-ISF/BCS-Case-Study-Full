package de.tu_bs.cs.isf.splregtest.xtext.mapping.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tu_bs.cs.isf.splregtest.xtext.mapping.services.MapsCompSmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapsCompSmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mapping'", "'{'", "'}'", "'component'", "'bsm'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMapsCompSmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMapsCompSmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMapsCompSmParser.tokenNames; }
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g"; }



     	private MapsCompSmGrammarAccess grammarAccess;
     	
        public InternalMapsCompSmParser(TokenStream input, MapsCompSmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Mapping";	
       	}
       	
       	@Override
       	protected MapsCompSmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMapping"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:67:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:68:2: (iv_ruleMapping= ruleMapping EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:69:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping75);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping85); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:76:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'Mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:79:28: ( (otherlv_0= 'Mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:80:1: (otherlv_0= 'Mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:80:1: (otherlv_0= 'Mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:80:3: otherlv_0= 'Mapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleMapping122); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getMappingKeyword_0());
                
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:85:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMapping156); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:106:1: ( (lv_components_3_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:107:1: (lv_components_3_0= ruleComponent )
            	    {
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:107:1: (lv_components_3_0= ruleComponent )
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:108:3: lv_components_3_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleMapping177);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMapping190); 

                	newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleComponent"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:136:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:137:2: (iv_ruleComponent= ruleComponent EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:138:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent226);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent236); 

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
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:145:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_bsms_3_0= ruleBSM ) )* otherlv_4= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_bsms_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:148:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_bsms_3_0= ruleBSM ) )* otherlv_4= '}' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:149:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_bsms_3_0= ruleBSM ) )* otherlv_4= '}' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:149:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_bsms_3_0= ruleBSM ) )* otherlv_4= '}' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:149:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_bsms_3_0= ruleBSM ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent273); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:154:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent307); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:175:1: ( (lv_bsms_3_0= ruleBSM ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:176:1: (lv_bsms_3_0= ruleBSM )
            	    {
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:176:1: (lv_bsms_3_0= ruleBSM )
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:177:3: lv_bsms_3_0= ruleBSM
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getBsmsBSMParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBSM_in_ruleComponent328);
            	    lv_bsms_3_0=ruleBSM();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bsms",
            	            		lv_bsms_3_0, 
            	            		"BSM");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleComponent341); 

                	newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleBSM"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:205:1: entryRuleBSM returns [EObject current=null] : iv_ruleBSM= ruleBSM EOF ;
    public final EObject entryRuleBSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBSM = null;


        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:206:2: (iv_ruleBSM= ruleBSM EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:207:2: iv_ruleBSM= ruleBSM EOF
            {
             newCompositeNode(grammarAccess.getBSMRule()); 
            pushFollow(FOLLOW_ruleBSM_in_entryRuleBSM377);
            iv_ruleBSM=ruleBSM();

            state._fsp--;

             current =iv_ruleBSM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSM387); 

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
    // $ANTLR end "entryRuleBSM"


    // $ANTLR start "ruleBSM"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:214:1: ruleBSM returns [EObject current=null] : (otherlv_0= 'bsm' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? ) ;
    public final EObject ruleBSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:217:28: ( (otherlv_0= 'bsm' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:218:1: (otherlv_0= 'bsm' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:218:1: (otherlv_0= 'bsm' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:218:3: otherlv_0= 'bsm' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleBSM424); 

                	newLeafNode(otherlv_0, grammarAccess.getBSMAccess().getBsmKeyword_0());
                
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:223:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:223:1: (lv_name_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBSM441); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBSMAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBSMRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:240:2: (otherlv_2= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/parser/antlr/internal/InternalMapsCompSm.g:240:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBSM459); 

                        	newLeafNode(otherlv_2, grammarAccess.getBSMAccess().getCommaKeyword_2());
                        

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
    // $ANTLR end "ruleBSM"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMapping122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMapping156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleMapping177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleMapping190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent307 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleBSM_in_ruleComponent328 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleComponent341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSM_in_entryRuleBSM377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSM387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBSM424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBSM441 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleBSM459 = new BitSet(new long[]{0x0000000000000002L});

}