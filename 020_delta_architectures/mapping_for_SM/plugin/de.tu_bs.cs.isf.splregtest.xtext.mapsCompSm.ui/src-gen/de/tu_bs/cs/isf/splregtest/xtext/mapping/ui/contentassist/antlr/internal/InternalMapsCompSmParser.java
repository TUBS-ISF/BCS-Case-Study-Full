package de.tu_bs.cs.isf.splregtest.xtext.mapping.ui.contentassist.antlr.internal; 

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
import de.tu_bs.cs.isf.splregtest.xtext.mapping.services.MapsCompSmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMapsCompSmParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g"; }


     
     	private MapsCompSmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MapsCompSmGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMapping"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:60:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:61:1: ( ruleMapping EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:62:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping61);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping68); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:69:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:73:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:74:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:74:1: ( ( rule__Mapping__Group__0 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:75:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:76:1: ( rule__Mapping__Group__0 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:76:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping94);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleComponent"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:88:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:89:1: ( ruleComponent EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:90:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent121);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent128); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:97:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:101:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:102:1: ( ( rule__Component__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:102:1: ( ( rule__Component__Group__0 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:103:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:104:1: ( rule__Component__Group__0 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:104:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent154);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleBSM"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:116:1: entryRuleBSM : ruleBSM EOF ;
    public final void entryRuleBSM() throws RecognitionException {
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:117:1: ( ruleBSM EOF )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:118:1: ruleBSM EOF
            {
             before(grammarAccess.getBSMRule()); 
            pushFollow(FOLLOW_ruleBSM_in_entryRuleBSM181);
            ruleBSM();

            state._fsp--;

             after(grammarAccess.getBSMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBSM188); 

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
    // $ANTLR end "entryRuleBSM"


    // $ANTLR start "ruleBSM"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:125:1: ruleBSM : ( ( rule__BSM__Group__0 ) ) ;
    public final void ruleBSM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:129:2: ( ( ( rule__BSM__Group__0 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:130:1: ( ( rule__BSM__Group__0 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:130:1: ( ( rule__BSM__Group__0 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:131:1: ( rule__BSM__Group__0 )
            {
             before(grammarAccess.getBSMAccess().getGroup()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:132:1: ( rule__BSM__Group__0 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:132:2: rule__BSM__Group__0
            {
            pushFollow(FOLLOW_rule__BSM__Group__0_in_ruleBSM214);
            rule__BSM__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBSMAccess().getGroup()); 

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
    // $ANTLR end "ruleBSM"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:146:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:150:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:151:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0248);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0251);
            rule__Mapping__Group__1();

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
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:158:1: rule__Mapping__Group__0__Impl : ( 'Mapping' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:162:1: ( ( 'Mapping' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:163:1: ( 'Mapping' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:163:1: ( 'Mapping' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:164:1: 'Mapping'
            {
             before(grammarAccess.getMappingAccess().getMappingKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Mapping__Group__0__Impl279); 
             after(grammarAccess.getMappingAccess().getMappingKeyword_0()); 

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
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:177:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:181:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:182:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1310);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1313);
            rule__Mapping__Group__2();

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
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:189:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:193:1: ( ( ( rule__Mapping__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:194:1: ( ( rule__Mapping__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:194:1: ( ( rule__Mapping__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:195:1: ( rule__Mapping__NameAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:196:1: ( rule__Mapping__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:196:2: rule__Mapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl340);
            rule__Mapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:206:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:210:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:211:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2370);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2373);
            rule__Mapping__Group__3();

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
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:218:1: rule__Mapping__Group__2__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:222:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:223:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:223:1: ( '{' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:224:1: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Mapping__Group__2__Impl401); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:237:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:241:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:242:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3432);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3435);
            rule__Mapping__Group__4();

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
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:249:1: rule__Mapping__Group__3__Impl : ( ( rule__Mapping__ComponentsAssignment_3 )* ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:253:1: ( ( ( rule__Mapping__ComponentsAssignment_3 )* ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:254:1: ( ( rule__Mapping__ComponentsAssignment_3 )* )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:254:1: ( ( rule__Mapping__ComponentsAssignment_3 )* )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:255:1: ( rule__Mapping__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getMappingAccess().getComponentsAssignment_3()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:256:1: ( rule__Mapping__ComponentsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:256:2: rule__Mapping__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Mapping__ComponentsAssignment_3_in_rule__Mapping__Group__3__Impl462);
            	    rule__Mapping__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:266:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:270:1: ( rule__Mapping__Group__4__Impl )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:271:2: rule__Mapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4493);
            rule__Mapping__Group__4__Impl();

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
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:277:1: rule__Mapping__Group__4__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:281:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:282:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:282:1: ( '}' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:283:1: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Mapping__Group__4__Impl521); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:306:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:310:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:311:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0562);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0565);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:318:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:322:1: ( ( 'component' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:323:1: ( 'component' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:323:1: ( 'component' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:324:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__0__Impl593); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:337:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:341:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:342:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__1624);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__1627);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:349:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:353:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:354:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:354:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:355:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:356:1: ( rule__Component__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:356:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl654);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:366:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:370:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:371:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__2684);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__2687);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:378:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:382:1: ( ( '{' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:383:1: ( '{' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:383:1: ( '{' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:384:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Component__Group__2__Impl715); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:397:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:401:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:402:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__3746);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__3749);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:409:1: rule__Component__Group__3__Impl : ( ( rule__Component__BsmsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:413:1: ( ( ( rule__Component__BsmsAssignment_3 )* ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:414:1: ( ( rule__Component__BsmsAssignment_3 )* )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:414:1: ( ( rule__Component__BsmsAssignment_3 )* )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:415:1: ( rule__Component__BsmsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getBsmsAssignment_3()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:416:1: ( rule__Component__BsmsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:416:2: rule__Component__BsmsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__BsmsAssignment_3_in_rule__Component__Group__3__Impl776);
            	    rule__Component__BsmsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getBsmsAssignment_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:426:1: rule__Component__Group__4 : rule__Component__Group__4__Impl ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:430:1: ( rule__Component__Group__4__Impl )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:431:2: rule__Component__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__4807);
            rule__Component__Group__4__Impl();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:437:1: rule__Component__Group__4__Impl : ( '}' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:441:1: ( ( '}' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:442:1: ( '}' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:442:1: ( '}' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:443:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Component__Group__4__Impl835); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__BSM__Group__0"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:466:1: rule__BSM__Group__0 : rule__BSM__Group__0__Impl rule__BSM__Group__1 ;
    public final void rule__BSM__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:470:1: ( rule__BSM__Group__0__Impl rule__BSM__Group__1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:471:2: rule__BSM__Group__0__Impl rule__BSM__Group__1
            {
            pushFollow(FOLLOW_rule__BSM__Group__0__Impl_in_rule__BSM__Group__0876);
            rule__BSM__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BSM__Group__1_in_rule__BSM__Group__0879);
            rule__BSM__Group__1();

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
    // $ANTLR end "rule__BSM__Group__0"


    // $ANTLR start "rule__BSM__Group__0__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:478:1: rule__BSM__Group__0__Impl : ( 'bsm' ) ;
    public final void rule__BSM__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:482:1: ( ( 'bsm' ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:483:1: ( 'bsm' )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:483:1: ( 'bsm' )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:484:1: 'bsm'
            {
             before(grammarAccess.getBSMAccess().getBsmKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__BSM__Group__0__Impl907); 
             after(grammarAccess.getBSMAccess().getBsmKeyword_0()); 

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
    // $ANTLR end "rule__BSM__Group__0__Impl"


    // $ANTLR start "rule__BSM__Group__1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:497:1: rule__BSM__Group__1 : rule__BSM__Group__1__Impl rule__BSM__Group__2 ;
    public final void rule__BSM__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:501:1: ( rule__BSM__Group__1__Impl rule__BSM__Group__2 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:502:2: rule__BSM__Group__1__Impl rule__BSM__Group__2
            {
            pushFollow(FOLLOW_rule__BSM__Group__1__Impl_in_rule__BSM__Group__1938);
            rule__BSM__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BSM__Group__2_in_rule__BSM__Group__1941);
            rule__BSM__Group__2();

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
    // $ANTLR end "rule__BSM__Group__1"


    // $ANTLR start "rule__BSM__Group__1__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:509:1: rule__BSM__Group__1__Impl : ( ( rule__BSM__NameAssignment_1 ) ) ;
    public final void rule__BSM__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:513:1: ( ( ( rule__BSM__NameAssignment_1 ) ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:514:1: ( ( rule__BSM__NameAssignment_1 ) )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:514:1: ( ( rule__BSM__NameAssignment_1 ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:515:1: ( rule__BSM__NameAssignment_1 )
            {
             before(grammarAccess.getBSMAccess().getNameAssignment_1()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:516:1: ( rule__BSM__NameAssignment_1 )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:516:2: rule__BSM__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__BSM__NameAssignment_1_in_rule__BSM__Group__1__Impl968);
            rule__BSM__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBSMAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__BSM__Group__1__Impl"


    // $ANTLR start "rule__BSM__Group__2"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:526:1: rule__BSM__Group__2 : rule__BSM__Group__2__Impl ;
    public final void rule__BSM__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:530:1: ( rule__BSM__Group__2__Impl )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:531:2: rule__BSM__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BSM__Group__2__Impl_in_rule__BSM__Group__2998);
            rule__BSM__Group__2__Impl();

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
    // $ANTLR end "rule__BSM__Group__2"


    // $ANTLR start "rule__BSM__Group__2__Impl"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:537:1: rule__BSM__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__BSM__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:541:1: ( ( ( ',' )? ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:542:1: ( ( ',' )? )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:542:1: ( ( ',' )? )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:543:1: ( ',' )?
            {
             before(grammarAccess.getBSMAccess().getCommaKeyword_2()); 
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:544:1: ( ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:545:2: ','
                    {
                    match(input,16,FOLLOW_16_in_rule__BSM__Group__2__Impl1027); 

                    }
                    break;

            }

             after(grammarAccess.getBSMAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__BSM__Group__2__Impl"


    // $ANTLR start "rule__Mapping__NameAssignment_1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:563:1: rule__Mapping__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:567:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:568:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:568:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:569:1: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_11071); 
             after(grammarAccess.getMappingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Mapping__NameAssignment_1"


    // $ANTLR start "rule__Mapping__ComponentsAssignment_3"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:578:1: rule__Mapping__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Mapping__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:582:1: ( ( ruleComponent ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:583:1: ( ruleComponent )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:583:1: ( ruleComponent )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:584:1: ruleComponent
            {
             before(grammarAccess.getMappingAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Mapping__ComponentsAssignment_31102);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Mapping__ComponentsAssignment_3"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:593:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:597:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:598:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:598:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:599:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_11133); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__BsmsAssignment_3"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:608:1: rule__Component__BsmsAssignment_3 : ( ruleBSM ) ;
    public final void rule__Component__BsmsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:612:1: ( ( ruleBSM ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:613:1: ( ruleBSM )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:613:1: ( ruleBSM )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:614:1: ruleBSM
            {
             before(grammarAccess.getComponentAccess().getBsmsBSMParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBSM_in_rule__Component__BsmsAssignment_31164);
            ruleBSM();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBsmsBSMParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Component__BsmsAssignment_3"


    // $ANTLR start "rule__BSM__NameAssignment_1"
    // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:623:1: rule__BSM__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BSM__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:627:1: ( ( RULE_ID ) )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:628:1: ( RULE_ID )
            {
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:628:1: ( RULE_ID )
            // ../de.tu_bs.cs.isf.splregtest.xtext.mapsCompSm.ui/src-gen/de/tu_bs/cs/isf/splregtest/xtext/mapping/ui/contentassist/antlr/internal/InternalMapsCompSm.g:629:1: RULE_ID
            {
             before(grammarAccess.getBSMAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BSM__NameAssignment_11195); 
             after(grammarAccess.getBSMAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BSM__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSM_in_entryRuleBSM181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBSM188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSM__Group__0_in_ruleBSM214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Mapping__Group__0__Impl279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1310 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_1_in_rule__Mapping__Group__1__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__2370 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Mapping__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__3432 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4_in_rule__Mapping__Group__3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ComponentsAssignment_3_in_rule__Mapping__Group__3__Impl462 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__4__Impl_in_rule__Mapping__Group__4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mapping__Group__4__Impl521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__0__Impl593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__1624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__2684 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Component__Group__2__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__3746 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__BsmsAssignment_3_in_rule__Component__Group__3__Impl776 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Component__Group__4__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSM__Group__0__Impl_in_rule__BSM__Group__0876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BSM__Group__1_in_rule__BSM__Group__0879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BSM__Group__0__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSM__Group__1__Impl_in_rule__BSM__Group__1938 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BSM__Group__2_in_rule__BSM__Group__1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSM__NameAssignment_1_in_rule__BSM__Group__1__Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BSM__Group__2__Impl_in_rule__BSM__Group__2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BSM__Group__2__Impl1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__NameAssignment_11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Mapping__ComponentsAssignment_31102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBSM_in_rule__Component__BsmsAssignment_31164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BSM__NameAssignment_11195 = new BitSet(new long[]{0x0000000000000002L});

}