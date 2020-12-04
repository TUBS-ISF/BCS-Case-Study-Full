package de.tu_bs.cs.isf.deltamsc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.tu_bs.cs.isf.deltamsc.services.DeltaMSCGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeltaMSCParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g"; }


     
     	private DeltaMSCGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DeltaMSCGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDeltaMSC"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:60:1: entryRuleDeltaMSC : ruleDeltaMSC EOF ;
    public final void entryRuleDeltaMSC() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:61:1: ( ruleDeltaMSC EOF )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:62:1: ruleDeltaMSC EOF
            {
             before(grammarAccess.getDeltaMSCRule()); 
            pushFollow(FOLLOW_ruleDeltaMSC_in_entryRuleDeltaMSC61);
            ruleDeltaMSC();

            state._fsp--;

             after(grammarAccess.getDeltaMSCRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaMSC68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeltaMSC"


    // $ANTLR start "ruleDeltaMSC"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:69:1: ruleDeltaMSC : ( ( rule__DeltaMSC__TestcasesAssignment )* ) ;
    public final void ruleDeltaMSC() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:73:2: ( ( ( rule__DeltaMSC__TestcasesAssignment )* ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:74:1: ( ( rule__DeltaMSC__TestcasesAssignment )* )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:74:1: ( ( rule__DeltaMSC__TestcasesAssignment )* )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:75:1: ( rule__DeltaMSC__TestcasesAssignment )*
            {
             before(grammarAccess.getDeltaMSCAccess().getTestcasesAssignment()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:76:1: ( rule__DeltaMSC__TestcasesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:76:2: rule__DeltaMSC__TestcasesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__DeltaMSC__TestcasesAssignment_in_ruleDeltaMSC94);
            	    rule__DeltaMSC__TestcasesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDeltaMSCAccess().getTestcasesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeltaMSC"


    // $ANTLR start "entryRuleInput"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:88:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:89:1: ( ruleInput EOF )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:90:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput122);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:97:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:101:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:102:1: ( ( rule__Input__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:102:1: ( ( rule__Input__Group__0 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:103:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:104:1: ( rule__Input__Group__0 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:104:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput155);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleTestcase"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:116:1: entryRuleTestcase : ruleTestcase EOF ;
    public final void entryRuleTestcase() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:117:1: ( ruleTestcase EOF )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:118:1: ruleTestcase EOF
            {
             before(grammarAccess.getTestcaseRule()); 
            pushFollow(FOLLOW_ruleTestcase_in_entryRuleTestcase182);
            ruleTestcase();

            state._fsp--;

             after(grammarAccess.getTestcaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestcase189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestcase"


    // $ANTLR start "ruleTestcase"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:125:1: ruleTestcase : ( ( rule__Testcase__Group__0 ) ) ;
    public final void ruleTestcase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:129:2: ( ( ( rule__Testcase__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:130:1: ( ( rule__Testcase__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:130:1: ( ( rule__Testcase__Group__0 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:131:1: ( rule__Testcase__Group__0 )
            {
             before(grammarAccess.getTestcaseAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:132:1: ( rule__Testcase__Group__0 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:132:2: rule__Testcase__Group__0
            {
            pushFollow(FOLLOW_rule__Testcase__Group__0_in_ruleTestcase215);
            rule__Testcase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestcaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestcase"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:145:1: ( ruleQualifiedName EOF )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:146:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:159:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Input__Alternatives_0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:172:1: rule__Input__Alternatives_0 : ( ( ( rule__Input__FirstAssignment_0_0 ) ) | ( 'ENV' ) );
    public final void rule__Input__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:176:1: ( ( ( rule__Input__FirstAssignment_0_0 ) ) | ( 'ENV' ) )
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
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:177:1: ( ( rule__Input__FirstAssignment_0_0 ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:177:1: ( ( rule__Input__FirstAssignment_0_0 ) )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:178:1: ( rule__Input__FirstAssignment_0_0 )
                    {
                     before(grammarAccess.getInputAccess().getFirstAssignment_0_0()); 
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:179:1: ( rule__Input__FirstAssignment_0_0 )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:179:2: rule__Input__FirstAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Input__FirstAssignment_0_0_in_rule__Input__Alternatives_0311);
                    rule__Input__FirstAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getFirstAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:183:6: ( 'ENV' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:183:6: ( 'ENV' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:184:1: 'ENV'
                    {
                     before(grammarAccess.getInputAccess().getENVKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Input__Alternatives_0330); 
                     after(grammarAccess.getInputAccess().getENVKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_0"


    // $ANTLR start "rule__Input__Alternatives_1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:196:1: rule__Input__Alternatives_1 : ( ( '->' ) | ( ',' ) );
    public final void rule__Input__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:200:1: ( ( '->' ) | ( ',' ) )
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
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:201:1: ( '->' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:201:1: ( '->' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:202:1: '->'
                    {
                     before(grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__Input__Alternatives_1365); 
                     after(grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:209:6: ( ',' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:209:6: ( ',' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:210:1: ','
                    {
                     before(grammarAccess.getInputAccess().getCommaKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__Input__Alternatives_1385); 
                     after(grammarAccess.getInputAccess().getCommaKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_1"


    // $ANTLR start "rule__Input__Alternatives_2"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:222:1: rule__Input__Alternatives_2 : ( ( ( rule__Input__SignalAssignment_2_0 ) ) | ( 'tick' ) );
    public final void rule__Input__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:226:1: ( ( ( rule__Input__SignalAssignment_2_0 ) ) | ( 'tick' ) )
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
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:227:1: ( ( rule__Input__SignalAssignment_2_0 ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:227:1: ( ( rule__Input__SignalAssignment_2_0 ) )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:228:1: ( rule__Input__SignalAssignment_2_0 )
                    {
                     before(grammarAccess.getInputAccess().getSignalAssignment_2_0()); 
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:229:1: ( rule__Input__SignalAssignment_2_0 )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:229:2: rule__Input__SignalAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Input__SignalAssignment_2_0_in_rule__Input__Alternatives_2419);
                    rule__Input__SignalAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getSignalAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:233:6: ( 'tick' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:233:6: ( 'tick' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:234:1: 'tick'
                    {
                     before(grammarAccess.getInputAccess().getTickKeyword_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__Input__Alternatives_2438); 
                     after(grammarAccess.getInputAccess().getTickKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_2"


    // $ANTLR start "rule__Input__Alternatives_3"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:246:1: rule__Input__Alternatives_3 : ( ( '->' ) | ( ',' ) );
    public final void rule__Input__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:250:1: ( ( '->' ) | ( ',' ) )
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
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:251:1: ( '->' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:251:1: ( '->' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:252:1: '->'
                    {
                     before(grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
                    match(input,12,FOLLOW_12_in_rule__Input__Alternatives_3473); 
                     after(grammarAccess.getInputAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:259:6: ( ',' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:259:6: ( ',' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:260:1: ','
                    {
                     before(grammarAccess.getInputAccess().getCommaKeyword_3_1()); 
                    match(input,13,FOLLOW_13_in_rule__Input__Alternatives_3493); 
                     after(grammarAccess.getInputAccess().getCommaKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_3"


    // $ANTLR start "rule__Input__Alternatives_4"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:272:1: rule__Input__Alternatives_4 : ( ( ( rule__Input__SecondAssignment_4_0 ) ) | ( 'ENV' ) );
    public final void rule__Input__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:276:1: ( ( ( rule__Input__SecondAssignment_4_0 ) ) | ( 'ENV' ) )
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
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:277:1: ( ( rule__Input__SecondAssignment_4_0 ) )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:277:1: ( ( rule__Input__SecondAssignment_4_0 ) )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:278:1: ( rule__Input__SecondAssignment_4_0 )
                    {
                     before(grammarAccess.getInputAccess().getSecondAssignment_4_0()); 
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:279:1: ( rule__Input__SecondAssignment_4_0 )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:279:2: rule__Input__SecondAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Input__SecondAssignment_4_0_in_rule__Input__Alternatives_4527);
                    rule__Input__SecondAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputAccess().getSecondAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:283:6: ( 'ENV' )
                    {
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:283:6: ( 'ENV' )
                    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:284:1: 'ENV'
                    {
                     before(grammarAccess.getInputAccess().getENVKeyword_4_1()); 
                    match(input,11,FOLLOW_11_in_rule__Input__Alternatives_4546); 
                     after(grammarAccess.getInputAccess().getENVKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives_4"


    // $ANTLR start "rule__Input__Group__0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:298:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:302:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:303:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0578);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0581);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:310:1: rule__Input__Group__0__Impl : ( ( rule__Input__Alternatives_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:314:1: ( ( ( rule__Input__Alternatives_0 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:315:1: ( ( rule__Input__Alternatives_0 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:315:1: ( ( rule__Input__Alternatives_0 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:316:1: ( rule__Input__Alternatives_0 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_0()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:317:1: ( rule__Input__Alternatives_0 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:317:2: rule__Input__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_0_in_rule__Input__Group__0__Impl608);
            rule__Input__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:327:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:331:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:332:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1638);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1641);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:339:1: rule__Input__Group__1__Impl : ( ( rule__Input__Alternatives_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:343:1: ( ( ( rule__Input__Alternatives_1 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:344:1: ( ( rule__Input__Alternatives_1 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:344:1: ( ( rule__Input__Alternatives_1 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:345:1: ( rule__Input__Alternatives_1 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_1()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:346:1: ( rule__Input__Alternatives_1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:346:2: rule__Input__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_1_in_rule__Input__Group__1__Impl668);
            rule__Input__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:356:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:360:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:361:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2698);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__2701);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:368:1: rule__Input__Group__2__Impl : ( ( rule__Input__Alternatives_2 ) ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:372:1: ( ( ( rule__Input__Alternatives_2 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:373:1: ( ( rule__Input__Alternatives_2 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:373:1: ( ( rule__Input__Alternatives_2 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:374:1: ( rule__Input__Alternatives_2 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_2()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:375:1: ( rule__Input__Alternatives_2 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:375:2: rule__Input__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_2_in_rule__Input__Group__2__Impl728);
            rule__Input__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:385:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:389:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:390:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__3758);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__3761);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:397:1: rule__Input__Group__3__Impl : ( ( rule__Input__Alternatives_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:401:1: ( ( ( rule__Input__Alternatives_3 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:402:1: ( ( rule__Input__Alternatives_3 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:402:1: ( ( rule__Input__Alternatives_3 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:403:1: ( rule__Input__Alternatives_3 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_3()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:404:1: ( rule__Input__Alternatives_3 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:404:2: rule__Input__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl788);
            rule__Input__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:414:1: rule__Input__Group__4 : rule__Input__Group__4__Impl ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:418:1: ( rule__Input__Group__4__Impl )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:419:2: rule__Input__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__4818);
            rule__Input__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:425:1: rule__Input__Group__4__Impl : ( ( rule__Input__Alternatives_4 ) ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:429:1: ( ( ( rule__Input__Alternatives_4 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:430:1: ( ( rule__Input__Alternatives_4 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:430:1: ( ( rule__Input__Alternatives_4 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:431:1: ( rule__Input__Alternatives_4 )
            {
             before(grammarAccess.getInputAccess().getAlternatives_4()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:432:1: ( rule__Input__Alternatives_4 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:432:2: rule__Input__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Input__Alternatives_4_in_rule__Input__Group__4__Impl845);
            rule__Input__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Testcase__Group__0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:452:1: rule__Testcase__Group__0 : rule__Testcase__Group__0__Impl rule__Testcase__Group__1 ;
    public final void rule__Testcase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:456:1: ( rule__Testcase__Group__0__Impl rule__Testcase__Group__1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:457:2: rule__Testcase__Group__0__Impl rule__Testcase__Group__1
            {
            pushFollow(FOLLOW_rule__Testcase__Group__0__Impl_in_rule__Testcase__Group__0885);
            rule__Testcase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__1_in_rule__Testcase__Group__0888);
            rule__Testcase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__0"


    // $ANTLR start "rule__Testcase__Group__0__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:464:1: rule__Testcase__Group__0__Impl : ( 'Testcase' ) ;
    public final void rule__Testcase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:468:1: ( ( 'Testcase' ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:469:1: ( 'Testcase' )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:469:1: ( 'Testcase' )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:470:1: 'Testcase'
            {
             before(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Testcase__Group__0__Impl916); 
             after(grammarAccess.getTestcaseAccess().getTestcaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__0__Impl"


    // $ANTLR start "rule__Testcase__Group__1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:483:1: rule__Testcase__Group__1 : rule__Testcase__Group__1__Impl rule__Testcase__Group__2 ;
    public final void rule__Testcase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:487:1: ( rule__Testcase__Group__1__Impl rule__Testcase__Group__2 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:488:2: rule__Testcase__Group__1__Impl rule__Testcase__Group__2
            {
            pushFollow(FOLLOW_rule__Testcase__Group__1__Impl_in_rule__Testcase__Group__1947);
            rule__Testcase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__2_in_rule__Testcase__Group__1950);
            rule__Testcase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__1"


    // $ANTLR start "rule__Testcase__Group__1__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:495:1: rule__Testcase__Group__1__Impl : ( ( rule__Testcase__FilenameAssignment_1 ) ) ;
    public final void rule__Testcase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:499:1: ( ( ( rule__Testcase__FilenameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:500:1: ( ( rule__Testcase__FilenameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:500:1: ( ( rule__Testcase__FilenameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:501:1: ( rule__Testcase__FilenameAssignment_1 )
            {
             before(grammarAccess.getTestcaseAccess().getFilenameAssignment_1()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:502:1: ( rule__Testcase__FilenameAssignment_1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:502:2: rule__Testcase__FilenameAssignment_1
            {
            pushFollow(FOLLOW_rule__Testcase__FilenameAssignment_1_in_rule__Testcase__Group__1__Impl977);
            rule__Testcase__FilenameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestcaseAccess().getFilenameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__1__Impl"


    // $ANTLR start "rule__Testcase__Group__2"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:512:1: rule__Testcase__Group__2 : rule__Testcase__Group__2__Impl rule__Testcase__Group__3 ;
    public final void rule__Testcase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:516:1: ( rule__Testcase__Group__2__Impl rule__Testcase__Group__3 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:517:2: rule__Testcase__Group__2__Impl rule__Testcase__Group__3
            {
            pushFollow(FOLLOW_rule__Testcase__Group__2__Impl_in_rule__Testcase__Group__21007);
            rule__Testcase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__3_in_rule__Testcase__Group__21010);
            rule__Testcase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__2"


    // $ANTLR start "rule__Testcase__Group__2__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:524:1: rule__Testcase__Group__2__Impl : ( '{' ) ;
    public final void rule__Testcase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:528:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:529:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:529:1: ( '{' )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:530:1: '{'
            {
             before(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Testcase__Group__2__Impl1038); 
             after(grammarAccess.getTestcaseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__2__Impl"


    // $ANTLR start "rule__Testcase__Group__3"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:543:1: rule__Testcase__Group__3 : rule__Testcase__Group__3__Impl rule__Testcase__Group__4 ;
    public final void rule__Testcase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:547:1: ( rule__Testcase__Group__3__Impl rule__Testcase__Group__4 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:548:2: rule__Testcase__Group__3__Impl rule__Testcase__Group__4
            {
            pushFollow(FOLLOW_rule__Testcase__Group__3__Impl_in_rule__Testcase__Group__31069);
            rule__Testcase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Testcase__Group__4_in_rule__Testcase__Group__31072);
            rule__Testcase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__3"


    // $ANTLR start "rule__Testcase__Group__3__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:555:1: rule__Testcase__Group__3__Impl : ( ( rule__Testcase__InputsAssignment_3 )* ) ;
    public final void rule__Testcase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:559:1: ( ( ( rule__Testcase__InputsAssignment_3 )* ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:560:1: ( ( rule__Testcase__InputsAssignment_3 )* )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:560:1: ( ( rule__Testcase__InputsAssignment_3 )* )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:561:1: ( rule__Testcase__InputsAssignment_3 )*
            {
             before(grammarAccess.getTestcaseAccess().getInputsAssignment_3()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:562:1: ( rule__Testcase__InputsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:562:2: rule__Testcase__InputsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Testcase__InputsAssignment_3_in_rule__Testcase__Group__3__Impl1099);
            	    rule__Testcase__InputsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTestcaseAccess().getInputsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__3__Impl"


    // $ANTLR start "rule__Testcase__Group__4"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:572:1: rule__Testcase__Group__4 : rule__Testcase__Group__4__Impl ;
    public final void rule__Testcase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:576:1: ( rule__Testcase__Group__4__Impl )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:577:2: rule__Testcase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Testcase__Group__4__Impl_in_rule__Testcase__Group__41130);
            rule__Testcase__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__4"


    // $ANTLR start "rule__Testcase__Group__4__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:583:1: rule__Testcase__Group__4__Impl : ( '}' ) ;
    public final void rule__Testcase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:587:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:588:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:588:1: ( '}' )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:589:1: '}'
            {
             before(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Testcase__Group__4__Impl1158); 
             after(grammarAccess.getTestcaseAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:612:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:616:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:617:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01199);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01202);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:624:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:628:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:629:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:629:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:630:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1229); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:641:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:645:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:646:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11258);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:652:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:656:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:657:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:657:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:658:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:659:1: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:659:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1285);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:673:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:677:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:678:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01320);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01323);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:685:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:689:1: ( ( '.' ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:690:1: ( '.' )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:690:1: ( '.' )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:691:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1351); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:704:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:708:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:709:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11382);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:715:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:719:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:720:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:720:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:721:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1409); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DeltaMSC__TestcasesAssignment"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:737:1: rule__DeltaMSC__TestcasesAssignment : ( ruleTestcase ) ;
    public final void rule__DeltaMSC__TestcasesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:741:1: ( ( ruleTestcase ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:742:1: ( ruleTestcase )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:742:1: ( ruleTestcase )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:743:1: ruleTestcase
            {
             before(grammarAccess.getDeltaMSCAccess().getTestcasesTestcaseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTestcase_in_rule__DeltaMSC__TestcasesAssignment1447);
            ruleTestcase();

            state._fsp--;

             after(grammarAccess.getDeltaMSCAccess().getTestcasesTestcaseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeltaMSC__TestcasesAssignment"


    // $ANTLR start "rule__Input__FirstAssignment_0_0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:752:1: rule__Input__FirstAssignment_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Input__FirstAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:756:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:757:1: ( ( ruleQualifiedName ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:757:1: ( ( ruleQualifiedName ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:758:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInputAccess().getFirstComponentCrossReference_0_0_0()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:759:1: ( ruleQualifiedName )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:760:1: ruleQualifiedName
            {
             before(grammarAccess.getInputAccess().getFirstComponentQualifiedNameParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Input__FirstAssignment_0_01482);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInputAccess().getFirstComponentQualifiedNameParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getInputAccess().getFirstComponentCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__FirstAssignment_0_0"


    // $ANTLR start "rule__Input__SignalAssignment_2_0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:771:1: rule__Input__SignalAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Input__SignalAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:775:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:776:1: ( ( ruleQualifiedName ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:776:1: ( ( ruleQualifiedName ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:777:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInputAccess().getSignalSignalCrossReference_2_0_0()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:778:1: ( ruleQualifiedName )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:779:1: ruleQualifiedName
            {
             before(grammarAccess.getInputAccess().getSignalSignalQualifiedNameParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Input__SignalAssignment_2_01521);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInputAccess().getSignalSignalQualifiedNameParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getInputAccess().getSignalSignalCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SignalAssignment_2_0"


    // $ANTLR start "rule__Input__SecondAssignment_4_0"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:790:1: rule__Input__SecondAssignment_4_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Input__SecondAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:794:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:795:1: ( ( ruleQualifiedName ) )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:795:1: ( ( ruleQualifiedName ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:796:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getInputAccess().getSecondComponentCrossReference_4_0_0()); 
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:797:1: ( ruleQualifiedName )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:798:1: ruleQualifiedName
            {
             before(grammarAccess.getInputAccess().getSecondComponentQualifiedNameParserRuleCall_4_0_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Input__SecondAssignment_4_01560);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInputAccess().getSecondComponentQualifiedNameParserRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getInputAccess().getSecondComponentCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SecondAssignment_4_0"


    // $ANTLR start "rule__Testcase__FilenameAssignment_1"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:809:1: rule__Testcase__FilenameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Testcase__FilenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:813:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:814:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:814:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:815:1: RULE_ID
            {
             before(grammarAccess.getTestcaseAccess().getFilenameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Testcase__FilenameAssignment_11595); 
             after(grammarAccess.getTestcaseAccess().getFilenameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__FilenameAssignment_1"


    // $ANTLR start "rule__Testcase__InputsAssignment_3"
    // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:824:1: rule__Testcase__InputsAssignment_3 : ( ruleInput ) ;
    public final void rule__Testcase__InputsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:828:1: ( ( ruleInput ) )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:829:1: ( ruleInput )
            {
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:829:1: ( ruleInput )
            // ../de.tu_bs.cs.isf.deltamsc.ui/src-gen/de/tu_bs/cs/isf/deltamsc/ui/contentassist/antlr/internal/InternalDeltaMSC.g:830:1: ruleInput
            {
             before(grammarAccess.getTestcaseAccess().getInputsInputParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInput_in_rule__Testcase__InputsAssignment_31626);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getTestcaseAccess().getInputsInputParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testcase__InputsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDeltaMSC_in_entryRuleDeltaMSC61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaMSC68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaMSC__TestcasesAssignment_in_ruleDeltaMSC94 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_entryRuleTestcase182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestcase189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__0_in_ruleTestcase215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__FirstAssignment_0_0_in_rule__Input__Alternatives_0311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Input__Alternatives_0330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Input__Alternatives_1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Input__Alternatives_1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__SignalAssignment_2_0_in_rule__Input__Alternatives_2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Input__Alternatives_2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Input__Alternatives_3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Input__Alternatives_3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__SecondAssignment_4_0_in_rule__Input__Alternatives_4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Input__Alternatives_4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__0578 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__0581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_0_in_rule__Input__Group__0__Impl608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__1638 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_1_in_rule__Input__Group__1__Impl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__2698 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_2_in_rule__Input__Group__2__Impl728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__3758 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_3_in_rule__Input__Group__3__Impl788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Alternatives_4_in_rule__Input__Group__4__Impl845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__0__Impl_in_rule__Testcase__Group__0885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Testcase__Group__1_in_rule__Testcase__Group__0888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Testcase__Group__0__Impl916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__1__Impl_in_rule__Testcase__Group__1947 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Testcase__Group__2_in_rule__Testcase__Group__1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__FilenameAssignment_1_in_rule__Testcase__Group__1__Impl977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__2__Impl_in_rule__Testcase__Group__21007 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_rule__Testcase__Group__3_in_rule__Testcase__Group__21010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Testcase__Group__2__Impl1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__Group__3__Impl_in_rule__Testcase__Group__31069 = new BitSet(new long[]{0x0000000000020810L});
    public static final BitSet FOLLOW_rule__Testcase__Group__4_in_rule__Testcase__Group__31072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Testcase__InputsAssignment_3_in_rule__Testcase__Group__3__Impl1099 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_rule__Testcase__Group__4__Impl_in_rule__Testcase__Group__41130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Testcase__Group__4__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01199 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1285 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QualifiedName__Group_1__0__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestcase_in_rule__DeltaMSC__TestcasesAssignment1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Input__FirstAssignment_0_01482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Input__SignalAssignment_2_01521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Input__SecondAssignment_4_01560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Testcase__FilenameAssignment_11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Testcase__InputsAssignment_31626 = new BitSet(new long[]{0x0000000000000002L});

}