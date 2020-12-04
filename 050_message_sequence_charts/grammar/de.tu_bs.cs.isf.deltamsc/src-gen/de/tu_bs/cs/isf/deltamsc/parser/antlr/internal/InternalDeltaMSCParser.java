package de.tu_bs.cs.isf.deltamsc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tu_bs.cs.isf.deltamsc.services.DeltaMSCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeltaMSCParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ENV'", "'->'", "','", "'tick'", "'Testcase'", "'{'", "'}'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
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


        public InternalDeltaMSCParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeltaMSCParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeltaMSCParser.tokenNames; }
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g"; }



     	private DeltaMSCGrammarAccess grammarAccess;
     	
        public InternalDeltaMSCParser(TokenStream input, DeltaMSCGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DeltaMSC";	
       	}
       	
       	@Override
       	protected DeltaMSCGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDeltaMSC"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:67:1: entryRuleDeltaMSC returns [EObject current=null] : iv_ruleDeltaMSC= ruleDeltaMSC EOF ;
    public final EObject entryRuleDeltaMSC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeltaMSC = null;


        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:68:2: (iv_ruleDeltaMSC= ruleDeltaMSC EOF )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:69:2: iv_ruleDeltaMSC= ruleDeltaMSC EOF
            {
             newCompositeNode(grammarAccess.getDeltaMSCRule()); 
            pushFollow(FOLLOW_ruleDeltaMSC_in_entryRuleDeltaMSC75);
            iv_ruleDeltaMSC=ruleDeltaMSC();

            state._fsp--;

             current =iv_ruleDeltaMSC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaMSC85); 

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
    // $ANTLR end "entryRuleDeltaMSC"


    // $ANTLR start "ruleDeltaMSC"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:76:1: ruleDeltaMSC returns [EObject current=null] : ( (lv_testcases_0_0= ruleTestcase ) )* ;
    public final EObject ruleDeltaMSC() throws RecognitionException {
        EObject current = null;

        EObject lv_testcases_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:79:28: ( ( (lv_testcases_0_0= ruleTestcase ) )* )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:80:1: ( (lv_testcases_0_0= ruleTestcase ) )*
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:80:1: ( (lv_testcases_0_0= ruleTestcase ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:81:1: (lv_testcases_0_0= ruleTestcase )
            	    {
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:81:1: (lv_testcases_0_0= ruleTestcase )
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:82:3: lv_testcases_0_0= ruleTestcase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDeltaMSCAccess().getTestcasesTestcaseParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTestcase_in_ruleDeltaMSC130);
            	    lv_testcases_0_0=ruleTestcase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDeltaMSCRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"testcases",
            	            		lv_testcases_0_0, 
            	            		"Testcase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDeltaMSC"


    // $ANTLR start "entryRuleInput"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:106:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:107:2: (iv_ruleInput= ruleInput EOF )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:108:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput166);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput176); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:115:1: ruleInput returns [EObject current=null] : ( ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' ) (otherlv_2= '->' | otherlv_3= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' ) (otherlv_6= '->' | otherlv_7= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:118:28: ( ( ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' ) (otherlv_2= '->' | otherlv_3= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' ) (otherlv_6= '->' | otherlv_7= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' ) ) )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:1: ( ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' ) (otherlv_2= '->' | otherlv_3= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' ) (otherlv_6= '->' | otherlv_7= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:1: ( ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' ) (otherlv_2= '->' | otherlv_3= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' ) (otherlv_6= '->' | otherlv_7= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' ) )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:2: ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' ) (otherlv_2= '->' | otherlv_3= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' ) (otherlv_6= '->' | otherlv_7= ',' ) ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' )
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:2: ( ( ( ruleQualifiedName ) ) | otherlv_1= 'ENV' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:3: ( ( ruleQualifiedName ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:119:3: ( ( ruleQualifiedName ) )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:120:1: ( ruleQualifiedName )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:120:1: ( ruleQualifiedName )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:121:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getFirstComponentCrossReference_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInput225);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:135:7: otherlv_1= 'ENV'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleInput243); 

                        	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getENVKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:139:2: (otherlv_2= '->' | otherlv_3= ',' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:139:4: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleInput257); 

                        	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:144:7: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleInput275); 

                        	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getCommaKeyword_1_1());
                        

                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:148:2: ( ( ( ruleQualifiedName ) ) | otherlv_5= 'tick' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:148:3: ( ( ruleQualifiedName ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:148:3: ( ( ruleQualifiedName ) )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:149:1: ( ruleQualifiedName )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:149:1: ( ruleQualifiedName )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:150:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getSignalSignalCrossReference_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInput300);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:164:7: otherlv_5= 'tick'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleInput318); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getTickKeyword_2_1());
                        

                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:168:2: (otherlv_6= '->' | otherlv_7= ',' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:168:4: otherlv_6= '->'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleInput332); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:173:7: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInput350); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getCommaKeyword_3_1());
                        

                    }
                    break;

            }

            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:177:2: ( ( ( ruleQualifiedName ) ) | otherlv_9= 'ENV' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:177:3: ( ( ruleQualifiedName ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:177:3: ( ( ruleQualifiedName ) )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:178:1: ( ruleQualifiedName )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:178:1: ( ruleQualifiedName )
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:179:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getSecondComponentCrossReference_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInput375);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:193:7: otherlv_9= 'ENV'
                    {
                    otherlv_9=(Token)match(input,11,FOLLOW_11_in_ruleInput393); 

                        	newLeafNode(otherlv_9, grammarAccess.getInputAccess().getENVKeyword_4_1());
                        

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleTestcase"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:205:1: entryRuleTestcase returns [EObject current=null] : iv_ruleTestcase= ruleTestcase EOF ;
    public final EObject entryRuleTestcase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestcase = null;


        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:206:2: (iv_ruleTestcase= ruleTestcase EOF )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:207:2: iv_ruleTestcase= ruleTestcase EOF
            {
             newCompositeNode(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_ruleTestcase_in_entryRuleTestcase430);
            iv_ruleTestcase=ruleTestcase();

            state._fsp--;

             current =iv_ruleTestcase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcase440); 

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
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:214:1: ruleTestcase returns [EObject current=null] : (otherlv_0= 'Testcase' ( (lv_filename_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' ) ;
    public final EObject ruleTestcase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filename_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inputs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:217:28: ( (otherlv_0= 'Testcase' ( (lv_filename_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' ) )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:218:1: (otherlv_0= 'Testcase' ( (lv_filename_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' )
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:218:1: (otherlv_0= 'Testcase' ( (lv_filename_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}' )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:218:3: otherlv_0= 'Testcase' ( (lv_filename_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputs_3_0= ruleInput ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTestcase477); 

                	newLeafNode(otherlv_0, grammarAccess.getTestcaseAccess().getTestcaseKeyword_0());
                
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:222:1: ( (lv_filename_1_0= RULE_ID ) )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:223:1: (lv_filename_1_0= RULE_ID )
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:223:1: (lv_filename_1_0= RULE_ID )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:224:3: lv_filename_1_0= RULE_ID
            {
            lv_filename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestcase494); 

            			newLeafNode(lv_filename_1_0, grammarAccess.getTestcaseAccess().getFilenameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestcaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTestcase511); 

                	newLeafNode(otherlv_2, grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:244:1: ( (lv_inputs_3_0= ruleInput ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:245:1: (lv_inputs_3_0= ruleInput )
            	    {
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:245:1: (lv_inputs_3_0= ruleInput )
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:246:3: lv_inputs_3_0= ruleInput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestcaseAccess().getInputsInputParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInput_in_ruleTestcase532);
            	    lv_inputs_3_0=ruleInput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestcaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inputs",
            	            		lv_inputs_3_0, 
            	            		"Input");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTestcase545); 

                	newLeafNode(otherlv_4, grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:274:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:275:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:276:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName582);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName593); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:283:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:286:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:287:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:287:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:287:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName633); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:294:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc/src-gen/de/tu_bs/cs/isf/deltamsc/parser/antlr/internal/InternalDeltaMSC.g:295:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName652); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName667); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDeltaMSC_in_entryRuleDeltaMSC75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaMSC85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_ruleDeltaMSC130 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInput225 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_11_in_ruleInput243 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleInput257 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_13_in_ruleInput275 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInput300 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_14_in_ruleInput318 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleInput332 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_13_in_ruleInput350 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInput375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInput393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_entryRuleTestcase430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcase440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTestcase477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestcase494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTestcase511 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_ruleInput_in_ruleTestcase532 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_17_in_ruleTestcase545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName633 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName667 = new BitSet(new long[]{0x0000000000040002L});

}