package org.xtext.deltarx.ui.contentassist.antlr.internal; 

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
import org.xtext.deltarx.services.DeltarxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeltarxParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'envmsg'", "'boolean'", "'char'", "'int'", "'double'", "'in'", "'out'", "'architecture'", "'for featuremodel'", "'{'", "'signals'", "'}'", "'components'", "'connectors'", "'deltas'", "'ports'", "'subcomponents'", "'('", "','", "')'", "'when'", "'after'", "'removeconnector'", "'removecomponent'", "'removesignal'", "'removeport'", "'addsignal'", "'addcomponent'", "'addconnector'", "'addport'"
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
    public String getGrammarFileName() { return "../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g"; }


     
     	private DeltarxGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DeltarxGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDeltarx"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:60:1: entryRuleDeltarx : ruleDeltarx EOF ;
    public final void entryRuleDeltarx() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:61:1: ( ruleDeltarx EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:62:1: ruleDeltarx EOF
            {
             before(grammarAccess.getDeltarxRule()); 
            pushFollow(FOLLOW_ruleDeltarx_in_entryRuleDeltarx61);
            ruleDeltarx();

            state._fsp--;

             after(grammarAccess.getDeltarxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltarx68); 

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
    // $ANTLR end "entryRuleDeltarx"


    // $ANTLR start "ruleDeltarx"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:69:1: ruleDeltarx : ( ( rule__Deltarx__UnorderedGroup ) ) ;
    public final void ruleDeltarx() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:73:2: ( ( ( rule__Deltarx__UnorderedGroup ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:74:1: ( ( rule__Deltarx__UnorderedGroup ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:74:1: ( ( rule__Deltarx__UnorderedGroup ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:75:1: ( rule__Deltarx__UnorderedGroup )
            {
             before(grammarAccess.getDeltarxAccess().getUnorderedGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:76:1: ( rule__Deltarx__UnorderedGroup )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:76:2: rule__Deltarx__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup_in_ruleDeltarx94);
            rule__Deltarx__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getDeltarxAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleDeltarx"


    // $ANTLR start "entryRuleSignal"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:88:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:89:1: ( ruleSignal EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:90:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal121);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal128); 

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:97:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:101:2: ( ( ( rule__Signal__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:102:1: ( ( rule__Signal__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:102:1: ( ( rule__Signal__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:103:1: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:104:1: ( rule__Signal__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:104:2: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_rule__Signal__Group__0_in_ruleSignal154);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:116:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:117:1: ( ruleComponent EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:118:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent181);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent188); 

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:125:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:129:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:130:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:130:1: ( ( rule__Component__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:131:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:132:1: ( rule__Component__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:132:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent214);
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


    // $ANTLR start "entryRulePort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:144:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:145:1: ( rulePort EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:146:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort241);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort248); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:153:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:157:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:158:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:158:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:159:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:160:1: ( rule__Port__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:160:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort274);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleSignalType"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:172:1: entryRuleSignalType : ruleSignalType EOF ;
    public final void entryRuleSignalType() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:173:1: ( ruleSignalType EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:174:1: ruleSignalType EOF
            {
             before(grammarAccess.getSignalTypeRule()); 
            pushFollow(FOLLOW_ruleSignalType_in_entryRuleSignalType301);
            ruleSignalType();

            state._fsp--;

             after(grammarAccess.getSignalTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalType308); 

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
    // $ANTLR end "entryRuleSignalType"


    // $ANTLR start "ruleSignalType"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:181:1: ruleSignalType : ( ( rule__SignalType__Alternatives ) ) ;
    public final void ruleSignalType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:185:2: ( ( ( rule__SignalType__Alternatives ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:186:1: ( ( rule__SignalType__Alternatives ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:186:1: ( ( rule__SignalType__Alternatives ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:187:1: ( rule__SignalType__Alternatives )
            {
             before(grammarAccess.getSignalTypeAccess().getAlternatives()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:188:1: ( rule__SignalType__Alternatives )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:188:2: rule__SignalType__Alternatives
            {
            pushFollow(FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType334);
            rule__SignalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSignalType"


    // $ANTLR start "entryRulePortDirection"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:200:1: entryRulePortDirection : rulePortDirection EOF ;
    public final void entryRulePortDirection() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:201:1: ( rulePortDirection EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:202:1: rulePortDirection EOF
            {
             before(grammarAccess.getPortDirectionRule()); 
            pushFollow(FOLLOW_rulePortDirection_in_entryRulePortDirection361);
            rulePortDirection();

            state._fsp--;

             after(grammarAccess.getPortDirectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePortDirection368); 

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
    // $ANTLR end "entryRulePortDirection"


    // $ANTLR start "rulePortDirection"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:209:1: rulePortDirection : ( ( rule__PortDirection__Alternatives ) ) ;
    public final void rulePortDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:213:2: ( ( ( rule__PortDirection__Alternatives ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:214:1: ( ( rule__PortDirection__Alternatives ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:214:1: ( ( rule__PortDirection__Alternatives ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:215:1: ( rule__PortDirection__Alternatives )
            {
             before(grammarAccess.getPortDirectionAccess().getAlternatives()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:216:1: ( rule__PortDirection__Alternatives )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:216:2: rule__PortDirection__Alternatives
            {
            pushFollow(FOLLOW_rule__PortDirection__Alternatives_in_rulePortDirection394);
            rule__PortDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePortDirection"


    // $ANTLR start "entryRuleEnvironmentMessage"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:228:1: entryRuleEnvironmentMessage : ruleEnvironmentMessage EOF ;
    public final void entryRuleEnvironmentMessage() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:229:1: ( ruleEnvironmentMessage EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:230:1: ruleEnvironmentMessage EOF
            {
             before(grammarAccess.getEnvironmentMessageRule()); 
            pushFollow(FOLLOW_ruleEnvironmentMessage_in_entryRuleEnvironmentMessage421);
            ruleEnvironmentMessage();

            state._fsp--;

             after(grammarAccess.getEnvironmentMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnvironmentMessage428); 

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
    // $ANTLR end "entryRuleEnvironmentMessage"


    // $ANTLR start "ruleEnvironmentMessage"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:237:1: ruleEnvironmentMessage : ( 'envmsg' ) ;
    public final void ruleEnvironmentMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:241:2: ( ( 'envmsg' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:242:1: ( 'envmsg' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:242:1: ( 'envmsg' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:243:1: 'envmsg'
            {
             before(grammarAccess.getEnvironmentMessageAccess().getEnvmsgKeyword()); 
            match(input,11,FOLLOW_11_in_ruleEnvironmentMessage455); 
             after(grammarAccess.getEnvironmentMessageAccess().getEnvmsgKeyword()); 

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
    // $ANTLR end "ruleEnvironmentMessage"


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:258:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:259:1: ( ruleConnector EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:260:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector483);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector490); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:267:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:271:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:272:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:272:1: ( ( rule__Connector__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:273:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:274:1: ( rule__Connector__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:274:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector516);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleConnectorTypeOne"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:286:1: entryRuleConnectorTypeOne : ruleConnectorTypeOne EOF ;
    public final void entryRuleConnectorTypeOne() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:287:1: ( ruleConnectorTypeOne EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:288:1: ruleConnectorTypeOne EOF
            {
             before(grammarAccess.getConnectorTypeOneRule()); 
            pushFollow(FOLLOW_ruleConnectorTypeOne_in_entryRuleConnectorTypeOne543);
            ruleConnectorTypeOne();

            state._fsp--;

             after(grammarAccess.getConnectorTypeOneRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorTypeOne550); 

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
    // $ANTLR end "entryRuleConnectorTypeOne"


    // $ANTLR start "ruleConnectorTypeOne"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:295:1: ruleConnectorTypeOne : ( ( rule__ConnectorTypeOne__Group__0 ) ) ;
    public final void ruleConnectorTypeOne() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:299:2: ( ( ( rule__ConnectorTypeOne__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:300:1: ( ( rule__ConnectorTypeOne__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:300:1: ( ( rule__ConnectorTypeOne__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:301:1: ( rule__ConnectorTypeOne__Group__0 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:302:1: ( rule__ConnectorTypeOne__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:302:2: rule__ConnectorTypeOne__Group__0
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__0_in_ruleConnectorTypeOne576);
            rule__ConnectorTypeOne__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getGroup()); 

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
    // $ANTLR end "ruleConnectorTypeOne"


    // $ANTLR start "entryRuleConnectorTypeTwo"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:314:1: entryRuleConnectorTypeTwo : ruleConnectorTypeTwo EOF ;
    public final void entryRuleConnectorTypeTwo() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:315:1: ( ruleConnectorTypeTwo EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:316:1: ruleConnectorTypeTwo EOF
            {
             before(grammarAccess.getConnectorTypeTwoRule()); 
            pushFollow(FOLLOW_ruleConnectorTypeTwo_in_entryRuleConnectorTypeTwo603);
            ruleConnectorTypeTwo();

            state._fsp--;

             after(grammarAccess.getConnectorTypeTwoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectorTypeTwo610); 

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
    // $ANTLR end "entryRuleConnectorTypeTwo"


    // $ANTLR start "ruleConnectorTypeTwo"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:323:1: ruleConnectorTypeTwo : ( ( rule__ConnectorTypeTwo__Group__0 ) ) ;
    public final void ruleConnectorTypeTwo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:327:2: ( ( ( rule__ConnectorTypeTwo__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:328:1: ( ( rule__ConnectorTypeTwo__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:328:1: ( ( rule__ConnectorTypeTwo__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:329:1: ( rule__ConnectorTypeTwo__Group__0 )
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:330:1: ( rule__ConnectorTypeTwo__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:330:2: rule__ConnectorTypeTwo__Group__0
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__0_in_ruleConnectorTypeTwo636);
            rule__ConnectorTypeTwo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeTwoAccess().getGroup()); 

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
    // $ANTLR end "ruleConnectorTypeTwo"


    // $ANTLR start "entryRuleDelta"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:342:1: entryRuleDelta : ruleDelta EOF ;
    public final void entryRuleDelta() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:343:1: ( ruleDelta EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:344:1: ruleDelta EOF
            {
             before(grammarAccess.getDeltaRule()); 
            pushFollow(FOLLOW_ruleDelta_in_entryRuleDelta663);
            ruleDelta();

            state._fsp--;

             after(grammarAccess.getDeltaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelta670); 

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
    // $ANTLR end "entryRuleDelta"


    // $ANTLR start "ruleDelta"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:351:1: ruleDelta : ( ( rule__Delta__Group__0 ) ) ;
    public final void ruleDelta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:355:2: ( ( ( rule__Delta__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:356:1: ( ( rule__Delta__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:356:1: ( ( rule__Delta__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:357:1: ( rule__Delta__Group__0 )
            {
             before(grammarAccess.getDeltaAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:358:1: ( rule__Delta__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:358:2: rule__Delta__Group__0
            {
            pushFollow(FOLLOW_rule__Delta__Group__0_in_ruleDelta696);
            rule__Delta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAccess().getGroup()); 

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
    // $ANTLR end "ruleDelta"


    // $ANTLR start "entryRuleDeltaAddPort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:370:1: entryRuleDeltaAddPort : ruleDeltaAddPort EOF ;
    public final void entryRuleDeltaAddPort() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:371:1: ( ruleDeltaAddPort EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:372:1: ruleDeltaAddPort EOF
            {
             before(grammarAccess.getDeltaAddPortRule()); 
            pushFollow(FOLLOW_ruleDeltaAddPort_in_entryRuleDeltaAddPort723);
            ruleDeltaAddPort();

            state._fsp--;

             after(grammarAccess.getDeltaAddPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddPort730); 

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
    // $ANTLR end "entryRuleDeltaAddPort"


    // $ANTLR start "ruleDeltaAddPort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:379:1: ruleDeltaAddPort : ( ( rule__DeltaAddPort__Group__0 ) ) ;
    public final void ruleDeltaAddPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:383:2: ( ( ( rule__DeltaAddPort__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:384:1: ( ( rule__DeltaAddPort__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:384:1: ( ( rule__DeltaAddPort__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:385:1: ( rule__DeltaAddPort__Group__0 )
            {
             before(grammarAccess.getDeltaAddPortAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:386:1: ( rule__DeltaAddPort__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:386:2: rule__DeltaAddPort__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__Group__0_in_ruleDeltaAddPort756);
            rule__DeltaAddPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddPortAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaAddPort"


    // $ANTLR start "entryRuleDeltaRemovePort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:398:1: entryRuleDeltaRemovePort : ruleDeltaRemovePort EOF ;
    public final void entryRuleDeltaRemovePort() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:399:1: ( ruleDeltaRemovePort EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:400:1: ruleDeltaRemovePort EOF
            {
             before(grammarAccess.getDeltaRemovePortRule()); 
            pushFollow(FOLLOW_ruleDeltaRemovePort_in_entryRuleDeltaRemovePort783);
            ruleDeltaRemovePort();

            state._fsp--;

             after(grammarAccess.getDeltaRemovePortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemovePort790); 

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
    // $ANTLR end "entryRuleDeltaRemovePort"


    // $ANTLR start "ruleDeltaRemovePort"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:407:1: ruleDeltaRemovePort : ( ( rule__DeltaRemovePort__Group__0 ) ) ;
    public final void ruleDeltaRemovePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:411:2: ( ( ( rule__DeltaRemovePort__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:412:1: ( ( rule__DeltaRemovePort__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:412:1: ( ( rule__DeltaRemovePort__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:413:1: ( rule__DeltaRemovePort__Group__0 )
            {
             before(grammarAccess.getDeltaRemovePortAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:414:1: ( rule__DeltaRemovePort__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:414:2: rule__DeltaRemovePort__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__0_in_ruleDeltaRemovePort816);
            rule__DeltaRemovePort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemovePortAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaRemovePort"


    // $ANTLR start "entryRuleDeltaAddComponent"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:426:1: entryRuleDeltaAddComponent : ruleDeltaAddComponent EOF ;
    public final void entryRuleDeltaAddComponent() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:427:1: ( ruleDeltaAddComponent EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:428:1: ruleDeltaAddComponent EOF
            {
             before(grammarAccess.getDeltaAddComponentRule()); 
            pushFollow(FOLLOW_ruleDeltaAddComponent_in_entryRuleDeltaAddComponent843);
            ruleDeltaAddComponent();

            state._fsp--;

             after(grammarAccess.getDeltaAddComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddComponent850); 

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
    // $ANTLR end "entryRuleDeltaAddComponent"


    // $ANTLR start "ruleDeltaAddComponent"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:435:1: ruleDeltaAddComponent : ( ( rule__DeltaAddComponent__Group__0 ) ) ;
    public final void ruleDeltaAddComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:439:2: ( ( ( rule__DeltaAddComponent__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:440:1: ( ( rule__DeltaAddComponent__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:440:1: ( ( rule__DeltaAddComponent__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:441:1: ( rule__DeltaAddComponent__Group__0 )
            {
             before(grammarAccess.getDeltaAddComponentAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:442:1: ( rule__DeltaAddComponent__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:442:2: rule__DeltaAddComponent__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__Group__0_in_ruleDeltaAddComponent876);
            rule__DeltaAddComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaAddComponent"


    // $ANTLR start "entryRuleDeltaRemoveComponent"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:454:1: entryRuleDeltaRemoveComponent : ruleDeltaRemoveComponent EOF ;
    public final void entryRuleDeltaRemoveComponent() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:455:1: ( ruleDeltaRemoveComponent EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:456:1: ruleDeltaRemoveComponent EOF
            {
             before(grammarAccess.getDeltaRemoveComponentRule()); 
            pushFollow(FOLLOW_ruleDeltaRemoveComponent_in_entryRuleDeltaRemoveComponent903);
            ruleDeltaRemoveComponent();

            state._fsp--;

             after(grammarAccess.getDeltaRemoveComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemoveComponent910); 

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
    // $ANTLR end "entryRuleDeltaRemoveComponent"


    // $ANTLR start "ruleDeltaRemoveComponent"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:463:1: ruleDeltaRemoveComponent : ( ( rule__DeltaRemoveComponent__Group__0 ) ) ;
    public final void ruleDeltaRemoveComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:467:2: ( ( ( rule__DeltaRemoveComponent__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:468:1: ( ( rule__DeltaRemoveComponent__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:468:1: ( ( rule__DeltaRemoveComponent__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:469:1: ( rule__DeltaRemoveComponent__Group__0 )
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:470:1: ( rule__DeltaRemoveComponent__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:470:2: rule__DeltaRemoveComponent__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group__0_in_ruleDeltaRemoveComponent936);
            rule__DeltaRemoveComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaRemoveComponent"


    // $ANTLR start "entryRuleDeltaAddConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:482:1: entryRuleDeltaAddConnector : ruleDeltaAddConnector EOF ;
    public final void entryRuleDeltaAddConnector() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:483:1: ( ruleDeltaAddConnector EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:484:1: ruleDeltaAddConnector EOF
            {
             before(grammarAccess.getDeltaAddConnectorRule()); 
            pushFollow(FOLLOW_ruleDeltaAddConnector_in_entryRuleDeltaAddConnector963);
            ruleDeltaAddConnector();

            state._fsp--;

             after(grammarAccess.getDeltaAddConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaAddConnector970); 

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
    // $ANTLR end "entryRuleDeltaAddConnector"


    // $ANTLR start "ruleDeltaAddConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:491:1: ruleDeltaAddConnector : ( ( rule__DeltaAddConnector__Group__0 ) ) ;
    public final void ruleDeltaAddConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:495:2: ( ( ( rule__DeltaAddConnector__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:496:1: ( ( rule__DeltaAddConnector__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:496:1: ( ( rule__DeltaAddConnector__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:497:1: ( rule__DeltaAddConnector__Group__0 )
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:498:1: ( rule__DeltaAddConnector__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:498:2: rule__DeltaAddConnector__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__Group__0_in_ruleDeltaAddConnector996);
            rule__DeltaAddConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaAddConnector"


    // $ANTLR start "entryRuleDeltaRemoveConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:510:1: entryRuleDeltaRemoveConnector : ruleDeltaRemoveConnector EOF ;
    public final void entryRuleDeltaRemoveConnector() throws RecognitionException {
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:511:1: ( ruleDeltaRemoveConnector EOF )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:512:1: ruleDeltaRemoveConnector EOF
            {
             before(grammarAccess.getDeltaRemoveConnectorRule()); 
            pushFollow(FOLLOW_ruleDeltaRemoveConnector_in_entryRuleDeltaRemoveConnector1023);
            ruleDeltaRemoveConnector();

            state._fsp--;

             after(grammarAccess.getDeltaRemoveConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeltaRemoveConnector1030); 

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
    // $ANTLR end "entryRuleDeltaRemoveConnector"


    // $ANTLR start "ruleDeltaRemoveConnector"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:519:1: ruleDeltaRemoveConnector : ( ( rule__DeltaRemoveConnector__Group__0 ) ) ;
    public final void ruleDeltaRemoveConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:523:2: ( ( ( rule__DeltaRemoveConnector__Group__0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:524:1: ( ( rule__DeltaRemoveConnector__Group__0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:524:1: ( ( rule__DeltaRemoveConnector__Group__0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:525:1: ( rule__DeltaRemoveConnector__Group__0 )
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getGroup()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:526:1: ( rule__DeltaRemoveConnector__Group__0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:526:2: rule__DeltaRemoveConnector__Group__0
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group__0_in_ruleDeltaRemoveConnector1056);
            rule__DeltaRemoveConnector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleDeltaRemoveConnector"


    // $ANTLR start "rule__SignalType__Alternatives"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:538:1: rule__SignalType__Alternatives : ( ( 'boolean' ) | ( 'char' ) | ( 'int' ) | ( 'double' ) );
    public final void rule__SignalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:542:1: ( ( 'boolean' ) | ( 'char' ) | ( 'int' ) | ( 'double' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:543:1: ( 'boolean' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:543:1: ( 'boolean' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:544:1: 'boolean'
                    {
                     before(grammarAccess.getSignalTypeAccess().getBooleanKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__SignalType__Alternatives1093); 
                     after(grammarAccess.getSignalTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:551:6: ( 'char' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:551:6: ( 'char' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:552:1: 'char'
                    {
                     before(grammarAccess.getSignalTypeAccess().getCharKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__SignalType__Alternatives1113); 
                     after(grammarAccess.getSignalTypeAccess().getCharKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:559:6: ( 'int' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:559:6: ( 'int' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:560:1: 'int'
                    {
                     before(grammarAccess.getSignalTypeAccess().getIntKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__SignalType__Alternatives1133); 
                     after(grammarAccess.getSignalTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:567:6: ( 'double' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:567:6: ( 'double' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:568:1: 'double'
                    {
                     before(grammarAccess.getSignalTypeAccess().getDoubleKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__SignalType__Alternatives1153); 
                     after(grammarAccess.getSignalTypeAccess().getDoubleKeyword_3()); 

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
    // $ANTLR end "rule__SignalType__Alternatives"


    // $ANTLR start "rule__PortDirection__Alternatives"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:580:1: rule__PortDirection__Alternatives : ( ( 'in' ) | ( 'out' ) );
    public final void rule__PortDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:584:1: ( ( 'in' ) | ( 'out' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:585:1: ( 'in' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:585:1: ( 'in' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:586:1: 'in'
                    {
                     before(grammarAccess.getPortDirectionAccess().getInKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__PortDirection__Alternatives1188); 
                     after(grammarAccess.getPortDirectionAccess().getInKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:593:6: ( 'out' )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:593:6: ( 'out' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:594:1: 'out'
                    {
                     before(grammarAccess.getPortDirectionAccess().getOutKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__PortDirection__Alternatives1208); 
                     after(grammarAccess.getPortDirectionAccess().getOutKeyword_1()); 

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
    // $ANTLR end "rule__PortDirection__Alternatives"


    // $ANTLR start "rule__Connector__TypeAlternatives_1_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:606:1: rule__Connector__TypeAlternatives_1_0 : ( ( ruleConnectorTypeOne ) | ( ruleConnectorTypeTwo ) );
    public final void rule__Connector__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:610:1: ( ( ruleConnectorTypeOne ) | ( ruleConnectorTypeTwo ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:611:1: ( ruleConnectorTypeOne )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:611:1: ( ruleConnectorTypeOne )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:612:1: ruleConnectorTypeOne
                    {
                     before(grammarAccess.getConnectorAccess().getTypeConnectorTypeOneParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleConnectorTypeOne_in_rule__Connector__TypeAlternatives_1_01242);
                    ruleConnectorTypeOne();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getTypeConnectorTypeOneParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:617:6: ( ruleConnectorTypeTwo )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:617:6: ( ruleConnectorTypeTwo )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:618:1: ruleConnectorTypeTwo
                    {
                     before(grammarAccess.getConnectorAccess().getTypeConnectorTypeTwoParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleConnectorTypeTwo_in_rule__Connector__TypeAlternatives_1_01259);
                    ruleConnectorTypeTwo();

                    state._fsp--;

                     after(grammarAccess.getConnectorAccess().getTypeConnectorTypeTwoParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Connector__TypeAlternatives_1_0"


    // $ANTLR start "rule__ConnectorTypeOne__PortnameoneAlternatives_3_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:628:1: rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 : ( ( RULE_ID ) | ( ruleEnvironmentMessage ) );
    public final void rule__ConnectorTypeOne__PortnameoneAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:632:1: ( ( RULE_ID ) | ( ruleEnvironmentMessage ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:633:1: ( RULE_ID )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:633:1: ( RULE_ID )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:634:1: RULE_ID
                    {
                     before(grammarAccess.getConnectorTypeOneAccess().getPortnameoneIDTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__PortnameoneAlternatives_3_01291); 
                     after(grammarAccess.getConnectorTypeOneAccess().getPortnameoneIDTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:639:6: ( ruleEnvironmentMessage )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:639:6: ( ruleEnvironmentMessage )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:640:1: ruleEnvironmentMessage
                    {
                     before(grammarAccess.getConnectorTypeOneAccess().getPortnameoneEnvironmentMessageParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleEnvironmentMessage_in_rule__ConnectorTypeOne__PortnameoneAlternatives_3_01308);
                    ruleEnvironmentMessage();

                    state._fsp--;

                     after(grammarAccess.getConnectorTypeOneAccess().getPortnameoneEnvironmentMessageParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__PortnameoneAlternatives_3_0"


    // $ANTLR start "rule__ConnectorTypeOne__PortnametwoAlternatives_9_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:650:1: rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 : ( ( RULE_ID ) | ( ruleEnvironmentMessage ) );
    public final void rule__ConnectorTypeOne__PortnametwoAlternatives_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:654:1: ( ( RULE_ID ) | ( ruleEnvironmentMessage ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:655:1: ( RULE_ID )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:655:1: ( RULE_ID )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:656:1: RULE_ID
                    {
                     before(grammarAccess.getConnectorTypeOneAccess().getPortnametwoIDTerminalRuleCall_9_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__PortnametwoAlternatives_9_01340); 
                     after(grammarAccess.getConnectorTypeOneAccess().getPortnametwoIDTerminalRuleCall_9_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:661:6: ( ruleEnvironmentMessage )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:661:6: ( ruleEnvironmentMessage )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:662:1: ruleEnvironmentMessage
                    {
                     before(grammarAccess.getConnectorTypeOneAccess().getPortnametwoEnvironmentMessageParserRuleCall_9_0_1()); 
                    pushFollow(FOLLOW_ruleEnvironmentMessage_in_rule__ConnectorTypeOne__PortnametwoAlternatives_9_01357);
                    ruleEnvironmentMessage();

                    state._fsp--;

                     after(grammarAccess.getConnectorTypeOneAccess().getPortnametwoEnvironmentMessageParserRuleCall_9_0_1()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__PortnametwoAlternatives_9_0"


    // $ANTLR start "rule__Deltarx__Group_0__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:674:1: rule__Deltarx__Group_0__0 : rule__Deltarx__Group_0__0__Impl rule__Deltarx__Group_0__1 ;
    public final void rule__Deltarx__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:678:1: ( rule__Deltarx__Group_0__0__Impl rule__Deltarx__Group_0__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:679:2: rule__Deltarx__Group_0__0__Impl rule__Deltarx__Group_0__1
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__0__Impl_in_rule__Deltarx__Group_0__01387);
            rule__Deltarx__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0__1_in_rule__Deltarx__Group_0__01390);
            rule__Deltarx__Group_0__1();

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
    // $ANTLR end "rule__Deltarx__Group_0__0"


    // $ANTLR start "rule__Deltarx__Group_0__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:686:1: rule__Deltarx__Group_0__0__Impl : ( 'architecture' ) ;
    public final void rule__Deltarx__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:690:1: ( ( 'architecture' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:691:1: ( 'architecture' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:691:1: ( 'architecture' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:692:1: 'architecture'
            {
             before(grammarAccess.getDeltarxAccess().getArchitectureKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Deltarx__Group_0__0__Impl1418); 
             after(grammarAccess.getDeltarxAccess().getArchitectureKeyword_0_0()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__0__Impl"


    // $ANTLR start "rule__Deltarx__Group_0__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:705:1: rule__Deltarx__Group_0__1 : rule__Deltarx__Group_0__1__Impl rule__Deltarx__Group_0__2 ;
    public final void rule__Deltarx__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:709:1: ( rule__Deltarx__Group_0__1__Impl rule__Deltarx__Group_0__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:710:2: rule__Deltarx__Group_0__1__Impl rule__Deltarx__Group_0__2
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__1__Impl_in_rule__Deltarx__Group_0__11449);
            rule__Deltarx__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0__2_in_rule__Deltarx__Group_0__11452);
            rule__Deltarx__Group_0__2();

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
    // $ANTLR end "rule__Deltarx__Group_0__1"


    // $ANTLR start "rule__Deltarx__Group_0__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:717:1: rule__Deltarx__Group_0__1__Impl : ( ( rule__Deltarx__NameAssignment_0_1 ) ) ;
    public final void rule__Deltarx__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:721:1: ( ( ( rule__Deltarx__NameAssignment_0_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:722:1: ( ( rule__Deltarx__NameAssignment_0_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:722:1: ( ( rule__Deltarx__NameAssignment_0_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:723:1: ( rule__Deltarx__NameAssignment_0_1 )
            {
             before(grammarAccess.getDeltarxAccess().getNameAssignment_0_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:724:1: ( rule__Deltarx__NameAssignment_0_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:724:2: rule__Deltarx__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Deltarx__NameAssignment_0_1_in_rule__Deltarx__Group_0__1__Impl1479);
            rule__Deltarx__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeltarxAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__1__Impl"


    // $ANTLR start "rule__Deltarx__Group_0__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:734:1: rule__Deltarx__Group_0__2 : rule__Deltarx__Group_0__2__Impl rule__Deltarx__Group_0__3 ;
    public final void rule__Deltarx__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:738:1: ( rule__Deltarx__Group_0__2__Impl rule__Deltarx__Group_0__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:739:2: rule__Deltarx__Group_0__2__Impl rule__Deltarx__Group_0__3
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__2__Impl_in_rule__Deltarx__Group_0__21509);
            rule__Deltarx__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0__3_in_rule__Deltarx__Group_0__21512);
            rule__Deltarx__Group_0__3();

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
    // $ANTLR end "rule__Deltarx__Group_0__2"


    // $ANTLR start "rule__Deltarx__Group_0__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:746:1: rule__Deltarx__Group_0__2__Impl : ( 'for featuremodel' ) ;
    public final void rule__Deltarx__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:750:1: ( ( 'for featuremodel' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:751:1: ( 'for featuremodel' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:751:1: ( 'for featuremodel' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:752:1: 'for featuremodel'
            {
             before(grammarAccess.getDeltarxAccess().getForFeaturemodelKeyword_0_2()); 
            match(input,19,FOLLOW_19_in_rule__Deltarx__Group_0__2__Impl1540); 
             after(grammarAccess.getDeltarxAccess().getForFeaturemodelKeyword_0_2()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__2__Impl"


    // $ANTLR start "rule__Deltarx__Group_0__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:765:1: rule__Deltarx__Group_0__3 : rule__Deltarx__Group_0__3__Impl rule__Deltarx__Group_0__4 ;
    public final void rule__Deltarx__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:769:1: ( rule__Deltarx__Group_0__3__Impl rule__Deltarx__Group_0__4 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:770:2: rule__Deltarx__Group_0__3__Impl rule__Deltarx__Group_0__4
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__3__Impl_in_rule__Deltarx__Group_0__31571);
            rule__Deltarx__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0__4_in_rule__Deltarx__Group_0__31574);
            rule__Deltarx__Group_0__4();

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
    // $ANTLR end "rule__Deltarx__Group_0__3"


    // $ANTLR start "rule__Deltarx__Group_0__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:777:1: rule__Deltarx__Group_0__3__Impl : ( ( rule__Deltarx__FmdirAssignment_0_3 ) ) ;
    public final void rule__Deltarx__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:781:1: ( ( ( rule__Deltarx__FmdirAssignment_0_3 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:782:1: ( ( rule__Deltarx__FmdirAssignment_0_3 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:782:1: ( ( rule__Deltarx__FmdirAssignment_0_3 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:783:1: ( rule__Deltarx__FmdirAssignment_0_3 )
            {
             before(grammarAccess.getDeltarxAccess().getFmdirAssignment_0_3()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:784:1: ( rule__Deltarx__FmdirAssignment_0_3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:784:2: rule__Deltarx__FmdirAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Deltarx__FmdirAssignment_0_3_in_rule__Deltarx__Group_0__3__Impl1601);
            rule__Deltarx__FmdirAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDeltarxAccess().getFmdirAssignment_0_3()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__3__Impl"


    // $ANTLR start "rule__Deltarx__Group_0__4"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:794:1: rule__Deltarx__Group_0__4 : rule__Deltarx__Group_0__4__Impl rule__Deltarx__Group_0__5 ;
    public final void rule__Deltarx__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:798:1: ( rule__Deltarx__Group_0__4__Impl rule__Deltarx__Group_0__5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:799:2: rule__Deltarx__Group_0__4__Impl rule__Deltarx__Group_0__5
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__4__Impl_in_rule__Deltarx__Group_0__41631);
            rule__Deltarx__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0__5_in_rule__Deltarx__Group_0__41634);
            rule__Deltarx__Group_0__5();

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
    // $ANTLR end "rule__Deltarx__Group_0__4"


    // $ANTLR start "rule__Deltarx__Group_0__4__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:806:1: rule__Deltarx__Group_0__4__Impl : ( '{' ) ;
    public final void rule__Deltarx__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:810:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:811:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:811:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:812:1: '{'
            {
             before(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_4()); 
            match(input,20,FOLLOW_20_in_rule__Deltarx__Group_0__4__Impl1662); 
             after(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_4()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__4__Impl"


    // $ANTLR start "rule__Deltarx__Group_0__5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:825:1: rule__Deltarx__Group_0__5 : rule__Deltarx__Group_0__5__Impl ;
    public final void rule__Deltarx__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:829:1: ( rule__Deltarx__Group_0__5__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:830:2: rule__Deltarx__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0__5__Impl_in_rule__Deltarx__Group_0__51693);
            rule__Deltarx__Group_0__5__Impl();

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
    // $ANTLR end "rule__Deltarx__Group_0__5"


    // $ANTLR start "rule__Deltarx__Group_0__5__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:836:1: rule__Deltarx__Group_0__5__Impl : ( ( rule__Deltarx__Group_0_5__0 )? ) ;
    public final void rule__Deltarx__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:840:1: ( ( ( rule__Deltarx__Group_0_5__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:841:1: ( ( rule__Deltarx__Group_0_5__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:841:1: ( ( rule__Deltarx__Group_0_5__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:842:1: ( rule__Deltarx__Group_0_5__0 )?
            {
             before(grammarAccess.getDeltarxAccess().getGroup_0_5()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:843:1: ( rule__Deltarx__Group_0_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:843:2: rule__Deltarx__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Deltarx__Group_0_5__0_in_rule__Deltarx__Group_0__5__Impl1720);
                    rule__Deltarx__Group_0_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltarxAccess().getGroup_0_5()); 

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
    // $ANTLR end "rule__Deltarx__Group_0__5__Impl"


    // $ANTLR start "rule__Deltarx__Group_0_5__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:865:1: rule__Deltarx__Group_0_5__0 : rule__Deltarx__Group_0_5__0__Impl rule__Deltarx__Group_0_5__1 ;
    public final void rule__Deltarx__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:869:1: ( rule__Deltarx__Group_0_5__0__Impl rule__Deltarx__Group_0_5__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:870:2: rule__Deltarx__Group_0_5__0__Impl rule__Deltarx__Group_0_5__1
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__0__Impl_in_rule__Deltarx__Group_0_5__01763);
            rule__Deltarx__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__1_in_rule__Deltarx__Group_0_5__01766);
            rule__Deltarx__Group_0_5__1();

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
    // $ANTLR end "rule__Deltarx__Group_0_5__0"


    // $ANTLR start "rule__Deltarx__Group_0_5__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:877:1: rule__Deltarx__Group_0_5__0__Impl : ( 'signals' ) ;
    public final void rule__Deltarx__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:881:1: ( ( 'signals' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:882:1: ( 'signals' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:882:1: ( 'signals' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:883:1: 'signals'
            {
             before(grammarAccess.getDeltarxAccess().getSignalsKeyword_0_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Deltarx__Group_0_5__0__Impl1794); 
             after(grammarAccess.getDeltarxAccess().getSignalsKeyword_0_5_0()); 

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
    // $ANTLR end "rule__Deltarx__Group_0_5__0__Impl"


    // $ANTLR start "rule__Deltarx__Group_0_5__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:896:1: rule__Deltarx__Group_0_5__1 : rule__Deltarx__Group_0_5__1__Impl rule__Deltarx__Group_0_5__2 ;
    public final void rule__Deltarx__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:900:1: ( rule__Deltarx__Group_0_5__1__Impl rule__Deltarx__Group_0_5__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:901:2: rule__Deltarx__Group_0_5__1__Impl rule__Deltarx__Group_0_5__2
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__1__Impl_in_rule__Deltarx__Group_0_5__11825);
            rule__Deltarx__Group_0_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__2_in_rule__Deltarx__Group_0_5__11828);
            rule__Deltarx__Group_0_5__2();

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
    // $ANTLR end "rule__Deltarx__Group_0_5__1"


    // $ANTLR start "rule__Deltarx__Group_0_5__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:908:1: rule__Deltarx__Group_0_5__1__Impl : ( '{' ) ;
    public final void rule__Deltarx__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:912:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:913:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:913:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:914:1: '{'
            {
             before(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_5_1()); 
            match(input,20,FOLLOW_20_in_rule__Deltarx__Group_0_5__1__Impl1856); 
             after(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_0_5_1()); 

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
    // $ANTLR end "rule__Deltarx__Group_0_5__1__Impl"


    // $ANTLR start "rule__Deltarx__Group_0_5__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:927:1: rule__Deltarx__Group_0_5__2 : rule__Deltarx__Group_0_5__2__Impl rule__Deltarx__Group_0_5__3 ;
    public final void rule__Deltarx__Group_0_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:931:1: ( rule__Deltarx__Group_0_5__2__Impl rule__Deltarx__Group_0_5__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:932:2: rule__Deltarx__Group_0_5__2__Impl rule__Deltarx__Group_0_5__3
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__2__Impl_in_rule__Deltarx__Group_0_5__21887);
            rule__Deltarx__Group_0_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__3_in_rule__Deltarx__Group_0_5__21890);
            rule__Deltarx__Group_0_5__3();

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
    // $ANTLR end "rule__Deltarx__Group_0_5__2"


    // $ANTLR start "rule__Deltarx__Group_0_5__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:939:1: rule__Deltarx__Group_0_5__2__Impl : ( ( rule__Deltarx__SignalsAssignment_0_5_2 )* ) ;
    public final void rule__Deltarx__Group_0_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:943:1: ( ( ( rule__Deltarx__SignalsAssignment_0_5_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:944:1: ( ( rule__Deltarx__SignalsAssignment_0_5_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:944:1: ( ( rule__Deltarx__SignalsAssignment_0_5_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:945:1: ( rule__Deltarx__SignalsAssignment_0_5_2 )*
            {
             before(grammarAccess.getDeltarxAccess().getSignalsAssignment_0_5_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:946:1: ( rule__Deltarx__SignalsAssignment_0_5_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:946:2: rule__Deltarx__SignalsAssignment_0_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Deltarx__SignalsAssignment_0_5_2_in_rule__Deltarx__Group_0_5__2__Impl1917);
            	    rule__Deltarx__SignalsAssignment_0_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDeltarxAccess().getSignalsAssignment_0_5_2()); 

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
    // $ANTLR end "rule__Deltarx__Group_0_5__2__Impl"


    // $ANTLR start "rule__Deltarx__Group_0_5__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:956:1: rule__Deltarx__Group_0_5__3 : rule__Deltarx__Group_0_5__3__Impl ;
    public final void rule__Deltarx__Group_0_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:960:1: ( rule__Deltarx__Group_0_5__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:961:2: rule__Deltarx__Group_0_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_0_5__3__Impl_in_rule__Deltarx__Group_0_5__31948);
            rule__Deltarx__Group_0_5__3__Impl();

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
    // $ANTLR end "rule__Deltarx__Group_0_5__3"


    // $ANTLR start "rule__Deltarx__Group_0_5__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:967:1: rule__Deltarx__Group_0_5__3__Impl : ( '}' ) ;
    public final void rule__Deltarx__Group_0_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:971:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:972:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:972:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:973:1: '}'
            {
             before(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_0_5_3()); 
            match(input,22,FOLLOW_22_in_rule__Deltarx__Group_0_5__3__Impl1976); 
             after(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_0_5_3()); 

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
    // $ANTLR end "rule__Deltarx__Group_0_5__3__Impl"


    // $ANTLR start "rule__Deltarx__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:994:1: rule__Deltarx__Group_1__0 : rule__Deltarx__Group_1__0__Impl rule__Deltarx__Group_1__1 ;
    public final void rule__Deltarx__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:998:1: ( rule__Deltarx__Group_1__0__Impl rule__Deltarx__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:999:2: rule__Deltarx__Group_1__0__Impl rule__Deltarx__Group_1__1
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_1__0__Impl_in_rule__Deltarx__Group_1__02015);
            rule__Deltarx__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_1__1_in_rule__Deltarx__Group_1__02018);
            rule__Deltarx__Group_1__1();

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
    // $ANTLR end "rule__Deltarx__Group_1__0"


    // $ANTLR start "rule__Deltarx__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1006:1: rule__Deltarx__Group_1__0__Impl : ( 'components' ) ;
    public final void rule__Deltarx__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1010:1: ( ( 'components' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1011:1: ( 'components' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1011:1: ( 'components' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1012:1: 'components'
            {
             before(grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Deltarx__Group_1__0__Impl2046); 
             after(grammarAccess.getDeltarxAccess().getComponentsKeyword_1_0()); 

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
    // $ANTLR end "rule__Deltarx__Group_1__0__Impl"


    // $ANTLR start "rule__Deltarx__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1025:1: rule__Deltarx__Group_1__1 : rule__Deltarx__Group_1__1__Impl rule__Deltarx__Group_1__2 ;
    public final void rule__Deltarx__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1029:1: ( rule__Deltarx__Group_1__1__Impl rule__Deltarx__Group_1__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1030:2: rule__Deltarx__Group_1__1__Impl rule__Deltarx__Group_1__2
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_1__1__Impl_in_rule__Deltarx__Group_1__12077);
            rule__Deltarx__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_1__2_in_rule__Deltarx__Group_1__12080);
            rule__Deltarx__Group_1__2();

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
    // $ANTLR end "rule__Deltarx__Group_1__1"


    // $ANTLR start "rule__Deltarx__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1037:1: rule__Deltarx__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Deltarx__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1041:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1042:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1042:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1043:1: '{'
            {
             before(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__Deltarx__Group_1__1__Impl2108); 
             after(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Deltarx__Group_1__1__Impl"


    // $ANTLR start "rule__Deltarx__Group_1__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1056:1: rule__Deltarx__Group_1__2 : rule__Deltarx__Group_1__2__Impl rule__Deltarx__Group_1__3 ;
    public final void rule__Deltarx__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1060:1: ( rule__Deltarx__Group_1__2__Impl rule__Deltarx__Group_1__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1061:2: rule__Deltarx__Group_1__2__Impl rule__Deltarx__Group_1__3
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_1__2__Impl_in_rule__Deltarx__Group_1__22139);
            rule__Deltarx__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_1__3_in_rule__Deltarx__Group_1__22142);
            rule__Deltarx__Group_1__3();

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
    // $ANTLR end "rule__Deltarx__Group_1__2"


    // $ANTLR start "rule__Deltarx__Group_1__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1068:1: rule__Deltarx__Group_1__2__Impl : ( ( rule__Deltarx__ComponentsAssignment_1_2 )* ) ;
    public final void rule__Deltarx__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1072:1: ( ( ( rule__Deltarx__ComponentsAssignment_1_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1073:1: ( ( rule__Deltarx__ComponentsAssignment_1_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1073:1: ( ( rule__Deltarx__ComponentsAssignment_1_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1074:1: ( rule__Deltarx__ComponentsAssignment_1_2 )*
            {
             before(grammarAccess.getDeltarxAccess().getComponentsAssignment_1_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1075:1: ( rule__Deltarx__ComponentsAssignment_1_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1075:2: rule__Deltarx__ComponentsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Deltarx__ComponentsAssignment_1_2_in_rule__Deltarx__Group_1__2__Impl2169);
            	    rule__Deltarx__ComponentsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDeltarxAccess().getComponentsAssignment_1_2()); 

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
    // $ANTLR end "rule__Deltarx__Group_1__2__Impl"


    // $ANTLR start "rule__Deltarx__Group_1__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1085:1: rule__Deltarx__Group_1__3 : rule__Deltarx__Group_1__3__Impl ;
    public final void rule__Deltarx__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1089:1: ( rule__Deltarx__Group_1__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1090:2: rule__Deltarx__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_1__3__Impl_in_rule__Deltarx__Group_1__32200);
            rule__Deltarx__Group_1__3__Impl();

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
    // $ANTLR end "rule__Deltarx__Group_1__3"


    // $ANTLR start "rule__Deltarx__Group_1__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1096:1: rule__Deltarx__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Deltarx__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1100:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1101:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1101:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1102:1: '}'
            {
             before(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,22,FOLLOW_22_in_rule__Deltarx__Group_1__3__Impl2228); 
             after(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Deltarx__Group_1__3__Impl"


    // $ANTLR start "rule__Deltarx__Group_2__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1123:1: rule__Deltarx__Group_2__0 : rule__Deltarx__Group_2__0__Impl rule__Deltarx__Group_2__1 ;
    public final void rule__Deltarx__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1127:1: ( rule__Deltarx__Group_2__0__Impl rule__Deltarx__Group_2__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1128:2: rule__Deltarx__Group_2__0__Impl rule__Deltarx__Group_2__1
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_2__0__Impl_in_rule__Deltarx__Group_2__02267);
            rule__Deltarx__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_2__1_in_rule__Deltarx__Group_2__02270);
            rule__Deltarx__Group_2__1();

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
    // $ANTLR end "rule__Deltarx__Group_2__0"


    // $ANTLR start "rule__Deltarx__Group_2__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1135:1: rule__Deltarx__Group_2__0__Impl : ( 'connectors' ) ;
    public final void rule__Deltarx__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1139:1: ( ( 'connectors' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1140:1: ( 'connectors' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1140:1: ( 'connectors' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1141:1: 'connectors'
            {
             before(grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Deltarx__Group_2__0__Impl2298); 
             after(grammarAccess.getDeltarxAccess().getConnectorsKeyword_2_0()); 

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
    // $ANTLR end "rule__Deltarx__Group_2__0__Impl"


    // $ANTLR start "rule__Deltarx__Group_2__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1154:1: rule__Deltarx__Group_2__1 : rule__Deltarx__Group_2__1__Impl rule__Deltarx__Group_2__2 ;
    public final void rule__Deltarx__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1158:1: ( rule__Deltarx__Group_2__1__Impl rule__Deltarx__Group_2__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1159:2: rule__Deltarx__Group_2__1__Impl rule__Deltarx__Group_2__2
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_2__1__Impl_in_rule__Deltarx__Group_2__12329);
            rule__Deltarx__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_2__2_in_rule__Deltarx__Group_2__12332);
            rule__Deltarx__Group_2__2();

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
    // $ANTLR end "rule__Deltarx__Group_2__1"


    // $ANTLR start "rule__Deltarx__Group_2__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1166:1: rule__Deltarx__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Deltarx__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1170:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1171:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1171:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1172:1: '{'
            {
             before(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,20,FOLLOW_20_in_rule__Deltarx__Group_2__1__Impl2360); 
             after(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Deltarx__Group_2__1__Impl"


    // $ANTLR start "rule__Deltarx__Group_2__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1185:1: rule__Deltarx__Group_2__2 : rule__Deltarx__Group_2__2__Impl rule__Deltarx__Group_2__3 ;
    public final void rule__Deltarx__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1189:1: ( rule__Deltarx__Group_2__2__Impl rule__Deltarx__Group_2__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1190:2: rule__Deltarx__Group_2__2__Impl rule__Deltarx__Group_2__3
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_2__2__Impl_in_rule__Deltarx__Group_2__22391);
            rule__Deltarx__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_2__3_in_rule__Deltarx__Group_2__22394);
            rule__Deltarx__Group_2__3();

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
    // $ANTLR end "rule__Deltarx__Group_2__2"


    // $ANTLR start "rule__Deltarx__Group_2__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1197:1: rule__Deltarx__Group_2__2__Impl : ( ( rule__Deltarx__ConnectorsAssignment_2_2 )* ) ;
    public final void rule__Deltarx__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1201:1: ( ( ( rule__Deltarx__ConnectorsAssignment_2_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1202:1: ( ( rule__Deltarx__ConnectorsAssignment_2_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1202:1: ( ( rule__Deltarx__ConnectorsAssignment_2_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1203:1: ( rule__Deltarx__ConnectorsAssignment_2_2 )*
            {
             before(grammarAccess.getDeltarxAccess().getConnectorsAssignment_2_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1204:1: ( rule__Deltarx__ConnectorsAssignment_2_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1204:2: rule__Deltarx__ConnectorsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Deltarx__ConnectorsAssignment_2_2_in_rule__Deltarx__Group_2__2__Impl2421);
            	    rule__Deltarx__ConnectorsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDeltarxAccess().getConnectorsAssignment_2_2()); 

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
    // $ANTLR end "rule__Deltarx__Group_2__2__Impl"


    // $ANTLR start "rule__Deltarx__Group_2__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1214:1: rule__Deltarx__Group_2__3 : rule__Deltarx__Group_2__3__Impl ;
    public final void rule__Deltarx__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1218:1: ( rule__Deltarx__Group_2__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1219:2: rule__Deltarx__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_2__3__Impl_in_rule__Deltarx__Group_2__32452);
            rule__Deltarx__Group_2__3__Impl();

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
    // $ANTLR end "rule__Deltarx__Group_2__3"


    // $ANTLR start "rule__Deltarx__Group_2__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1225:1: rule__Deltarx__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Deltarx__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1229:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1230:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1230:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1231:1: '}'
            {
             before(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,22,FOLLOW_22_in_rule__Deltarx__Group_2__3__Impl2480); 
             after(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Deltarx__Group_2__3__Impl"


    // $ANTLR start "rule__Deltarx__Group_3__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1252:1: rule__Deltarx__Group_3__0 : rule__Deltarx__Group_3__0__Impl rule__Deltarx__Group_3__1 ;
    public final void rule__Deltarx__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1256:1: ( rule__Deltarx__Group_3__0__Impl rule__Deltarx__Group_3__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1257:2: rule__Deltarx__Group_3__0__Impl rule__Deltarx__Group_3__1
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_3__0__Impl_in_rule__Deltarx__Group_3__02519);
            rule__Deltarx__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_3__1_in_rule__Deltarx__Group_3__02522);
            rule__Deltarx__Group_3__1();

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
    // $ANTLR end "rule__Deltarx__Group_3__0"


    // $ANTLR start "rule__Deltarx__Group_3__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1264:1: rule__Deltarx__Group_3__0__Impl : ( 'deltas' ) ;
    public final void rule__Deltarx__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1268:1: ( ( 'deltas' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1269:1: ( 'deltas' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1269:1: ( 'deltas' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1270:1: 'deltas'
            {
             before(grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Deltarx__Group_3__0__Impl2550); 
             after(grammarAccess.getDeltarxAccess().getDeltasKeyword_3_0()); 

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
    // $ANTLR end "rule__Deltarx__Group_3__0__Impl"


    // $ANTLR start "rule__Deltarx__Group_3__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1283:1: rule__Deltarx__Group_3__1 : rule__Deltarx__Group_3__1__Impl rule__Deltarx__Group_3__2 ;
    public final void rule__Deltarx__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1287:1: ( rule__Deltarx__Group_3__1__Impl rule__Deltarx__Group_3__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1288:2: rule__Deltarx__Group_3__1__Impl rule__Deltarx__Group_3__2
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_3__1__Impl_in_rule__Deltarx__Group_3__12581);
            rule__Deltarx__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_3__2_in_rule__Deltarx__Group_3__12584);
            rule__Deltarx__Group_3__2();

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
    // $ANTLR end "rule__Deltarx__Group_3__1"


    // $ANTLR start "rule__Deltarx__Group_3__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1295:1: rule__Deltarx__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Deltarx__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1299:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1300:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1300:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1301:1: '{'
            {
             before(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_20_in_rule__Deltarx__Group_3__1__Impl2612); 
             after(grammarAccess.getDeltarxAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Deltarx__Group_3__1__Impl"


    // $ANTLR start "rule__Deltarx__Group_3__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1314:1: rule__Deltarx__Group_3__2 : rule__Deltarx__Group_3__2__Impl rule__Deltarx__Group_3__3 ;
    public final void rule__Deltarx__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1318:1: ( rule__Deltarx__Group_3__2__Impl rule__Deltarx__Group_3__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1319:2: rule__Deltarx__Group_3__2__Impl rule__Deltarx__Group_3__3
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_3__2__Impl_in_rule__Deltarx__Group_3__22643);
            rule__Deltarx__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Deltarx__Group_3__3_in_rule__Deltarx__Group_3__22646);
            rule__Deltarx__Group_3__3();

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
    // $ANTLR end "rule__Deltarx__Group_3__2"


    // $ANTLR start "rule__Deltarx__Group_3__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1326:1: rule__Deltarx__Group_3__2__Impl : ( ( rule__Deltarx__DeltasAssignment_3_2 )* ) ;
    public final void rule__Deltarx__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1330:1: ( ( ( rule__Deltarx__DeltasAssignment_3_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1331:1: ( ( rule__Deltarx__DeltasAssignment_3_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1331:1: ( ( rule__Deltarx__DeltasAssignment_3_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1332:1: ( rule__Deltarx__DeltasAssignment_3_2 )*
            {
             before(grammarAccess.getDeltarxAccess().getDeltasAssignment_3_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1333:1: ( rule__Deltarx__DeltasAssignment_3_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1333:2: rule__Deltarx__DeltasAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Deltarx__DeltasAssignment_3_2_in_rule__Deltarx__Group_3__2__Impl2673);
            	    rule__Deltarx__DeltasAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDeltarxAccess().getDeltasAssignment_3_2()); 

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
    // $ANTLR end "rule__Deltarx__Group_3__2__Impl"


    // $ANTLR start "rule__Deltarx__Group_3__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1343:1: rule__Deltarx__Group_3__3 : rule__Deltarx__Group_3__3__Impl ;
    public final void rule__Deltarx__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1347:1: ( rule__Deltarx__Group_3__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1348:2: rule__Deltarx__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__Group_3__3__Impl_in_rule__Deltarx__Group_3__32704);
            rule__Deltarx__Group_3__3__Impl();

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
    // $ANTLR end "rule__Deltarx__Group_3__3"


    // $ANTLR start "rule__Deltarx__Group_3__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1354:1: rule__Deltarx__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Deltarx__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1358:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1359:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1359:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1360:1: '}'
            {
             before(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_22_in_rule__Deltarx__Group_3__3__Impl2732); 
             after(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Deltarx__Group_3__3__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1381:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1385:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1386:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__02771);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__02774);
            rule__Signal__Group__1();

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
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1393:1: rule__Signal__Group__0__Impl : ( ( rule__Signal__NameAssignment_0 ) ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1397:1: ( ( ( rule__Signal__NameAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1398:1: ( ( rule__Signal__NameAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1398:1: ( ( rule__Signal__NameAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1399:1: ( rule__Signal__NameAssignment_0 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1400:1: ( rule__Signal__NameAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1400:2: rule__Signal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl2801);
            rule__Signal__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1410:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1414:1: ( rule__Signal__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1415:2: rule__Signal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__12831);
            rule__Signal__Group__1__Impl();

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
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1421:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__TypeAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1425:1: ( ( ( rule__Signal__TypeAssignment_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1426:1: ( ( rule__Signal__TypeAssignment_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1426:1: ( ( rule__Signal__TypeAssignment_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1427:1: ( rule__Signal__TypeAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getTypeAssignment_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1428:1: ( rule__Signal__TypeAssignment_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1428:2: rule__Signal__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Signal__TypeAssignment_1_in_rule__Signal__Group__1__Impl2858);
            rule__Signal__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1442:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1446:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1447:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02892);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02895);
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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1454:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1458:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1459:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1459:1: ( ( rule__Component__NameAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1460:1: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1461:1: ( rule__Component__NameAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1461:2: rule__Component__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_0_in_rule__Component__Group__0__Impl2922);
            rule__Component__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_0()); 

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1471:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1475:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1476:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12952);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12955);
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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1483:1: rule__Component__Group__1__Impl : ( '{' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1487:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1488:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1488:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1489:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group__1__Impl2983); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1502:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1506:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1507:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__23014);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23017);
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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1514:1: rule__Component__Group__2__Impl : ( ( rule__Component__Group_2__0 )? ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1518:1: ( ( ( rule__Component__Group_2__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1519:1: ( ( rule__Component__Group_2__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1519:1: ( ( rule__Component__Group_2__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1520:1: ( rule__Component__Group_2__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1521:1: ( rule__Component__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1521:2: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__2__Impl3044);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_2()); 

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1531:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1535:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1536:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__33075);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__33078);
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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1543:1: rule__Component__Group__3__Impl : ( ( rule__Component__Group_3__0 )? ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1547:1: ( ( ( rule__Component__Group_3__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1548:1: ( ( rule__Component__Group_3__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1548:1: ( ( rule__Component__Group_3__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1549:1: ( rule__Component__Group_3__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_3()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1550:1: ( rule__Component__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1550:2: rule__Component__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_3__0_in_rule__Component__Group__3__Impl3105);
                    rule__Component__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_3()); 

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1560:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1564:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1565:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__43136);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__43139);
            rule__Component__Group__5();

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
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1572:1: rule__Component__Group__4__Impl : ( ( rule__Component__Group_4__0 )? ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1576:1: ( ( ( rule__Component__Group_4__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1577:1: ( ( rule__Component__Group_4__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1577:1: ( ( rule__Component__Group_4__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1578:1: ( rule__Component__Group_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_4()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1579:1: ( rule__Component__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1579:2: rule__Component__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl3166);
                    rule__Component__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Component__Group__5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1589:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1593:1: ( rule__Component__Group__5__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1594:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__53197);
            rule__Component__Group__5__Impl();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1600:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1604:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1605:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1605:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1606:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Component__Group__5__Impl3225); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1631:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1635:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1636:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_rule__Component__Group_2__0__Impl_in_rule__Component__Group_2__03268);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03271);
            rule__Component__Group_2__1();

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
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1643:1: rule__Component__Group_2__0__Impl : ( 'ports' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1647:1: ( ( 'ports' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1648:1: ( 'ports' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1648:1: ( 'ports' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1649:1: 'ports'
            {
             before(grammarAccess.getComponentAccess().getPortsKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Component__Group_2__0__Impl3299); 
             after(grammarAccess.getComponentAccess().getPortsKeyword_2_0()); 

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
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1662:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl rule__Component__Group_2__2 ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1666:1: ( rule__Component__Group_2__1__Impl rule__Component__Group_2__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1667:2: rule__Component__Group_2__1__Impl rule__Component__Group_2__2
            {
            pushFollow(FOLLOW_rule__Component__Group_2__1__Impl_in_rule__Component__Group_2__13330);
            rule__Component__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_2__2_in_rule__Component__Group_2__13333);
            rule__Component__Group_2__2();

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
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1674:1: rule__Component__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1678:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1679:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1679:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1680:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group_2__1__Impl3361); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_2__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1693:1: rule__Component__Group_2__2 : rule__Component__Group_2__2__Impl rule__Component__Group_2__3 ;
    public final void rule__Component__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1697:1: ( rule__Component__Group_2__2__Impl rule__Component__Group_2__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1698:2: rule__Component__Group_2__2__Impl rule__Component__Group_2__3
            {
            pushFollow(FOLLOW_rule__Component__Group_2__2__Impl_in_rule__Component__Group_2__23392);
            rule__Component__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_2__3_in_rule__Component__Group_2__23395);
            rule__Component__Group_2__3();

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
    // $ANTLR end "rule__Component__Group_2__2"


    // $ANTLR start "rule__Component__Group_2__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1705:1: rule__Component__Group_2__2__Impl : ( ( rule__Component__PortsAssignment_2_2 )* ) ;
    public final void rule__Component__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1709:1: ( ( ( rule__Component__PortsAssignment_2_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1710:1: ( ( rule__Component__PortsAssignment_2_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1710:1: ( ( rule__Component__PortsAssignment_2_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1711:1: ( rule__Component__PortsAssignment_2_2 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_2_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1712:1: ( rule__Component__PortsAssignment_2_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1712:2: rule__Component__PortsAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_2_2_in_rule__Component__Group_2__2__Impl3422);
            	    rule__Component__PortsAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPortsAssignment_2_2()); 

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
    // $ANTLR end "rule__Component__Group_2__2__Impl"


    // $ANTLR start "rule__Component__Group_2__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1722:1: rule__Component__Group_2__3 : rule__Component__Group_2__3__Impl ;
    public final void rule__Component__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1726:1: ( rule__Component__Group_2__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1727:2: rule__Component__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_2__3__Impl_in_rule__Component__Group_2__33453);
            rule__Component__Group_2__3__Impl();

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
    // $ANTLR end "rule__Component__Group_2__3"


    // $ANTLR start "rule__Component__Group_2__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1733:1: rule__Component__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Component__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1737:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1738:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1738:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1739:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,22,FOLLOW_22_in_rule__Component__Group_2__3__Impl3481); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__Component__Group_2__3__Impl"


    // $ANTLR start "rule__Component__Group_3__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1760:1: rule__Component__Group_3__0 : rule__Component__Group_3__0__Impl rule__Component__Group_3__1 ;
    public final void rule__Component__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1764:1: ( rule__Component__Group_3__0__Impl rule__Component__Group_3__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1765:2: rule__Component__Group_3__0__Impl rule__Component__Group_3__1
            {
            pushFollow(FOLLOW_rule__Component__Group_3__0__Impl_in_rule__Component__Group_3__03520);
            rule__Component__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_3__1_in_rule__Component__Group_3__03523);
            rule__Component__Group_3__1();

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
    // $ANTLR end "rule__Component__Group_3__0"


    // $ANTLR start "rule__Component__Group_3__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1772:1: rule__Component__Group_3__0__Impl : ( 'connectors' ) ;
    public final void rule__Component__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1776:1: ( ( 'connectors' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1777:1: ( 'connectors' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1777:1: ( 'connectors' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1778:1: 'connectors'
            {
             before(grammarAccess.getComponentAccess().getConnectorsKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Component__Group_3__0__Impl3551); 
             after(grammarAccess.getComponentAccess().getConnectorsKeyword_3_0()); 

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
    // $ANTLR end "rule__Component__Group_3__0__Impl"


    // $ANTLR start "rule__Component__Group_3__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1791:1: rule__Component__Group_3__1 : rule__Component__Group_3__1__Impl rule__Component__Group_3__2 ;
    public final void rule__Component__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1795:1: ( rule__Component__Group_3__1__Impl rule__Component__Group_3__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1796:2: rule__Component__Group_3__1__Impl rule__Component__Group_3__2
            {
            pushFollow(FOLLOW_rule__Component__Group_3__1__Impl_in_rule__Component__Group_3__13582);
            rule__Component__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_3__2_in_rule__Component__Group_3__13585);
            rule__Component__Group_3__2();

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
    // $ANTLR end "rule__Component__Group_3__1"


    // $ANTLR start "rule__Component__Group_3__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1803:1: rule__Component__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1807:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1808:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1808:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1809:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group_3__1__Impl3613); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Component__Group_3__1__Impl"


    // $ANTLR start "rule__Component__Group_3__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1822:1: rule__Component__Group_3__2 : rule__Component__Group_3__2__Impl rule__Component__Group_3__3 ;
    public final void rule__Component__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1826:1: ( rule__Component__Group_3__2__Impl rule__Component__Group_3__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1827:2: rule__Component__Group_3__2__Impl rule__Component__Group_3__3
            {
            pushFollow(FOLLOW_rule__Component__Group_3__2__Impl_in_rule__Component__Group_3__23644);
            rule__Component__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_3__3_in_rule__Component__Group_3__23647);
            rule__Component__Group_3__3();

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
    // $ANTLR end "rule__Component__Group_3__2"


    // $ANTLR start "rule__Component__Group_3__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1834:1: rule__Component__Group_3__2__Impl : ( ( rule__Component__ConnectorsAssignment_3_2 )* ) ;
    public final void rule__Component__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1838:1: ( ( ( rule__Component__ConnectorsAssignment_3_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1839:1: ( ( rule__Component__ConnectorsAssignment_3_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1839:1: ( ( rule__Component__ConnectorsAssignment_3_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1840:1: ( rule__Component__ConnectorsAssignment_3_2 )*
            {
             before(grammarAccess.getComponentAccess().getConnectorsAssignment_3_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1841:1: ( rule__Component__ConnectorsAssignment_3_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1841:2: rule__Component__ConnectorsAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Component__ConnectorsAssignment_3_2_in_rule__Component__Group_3__2__Impl3674);
            	    rule__Component__ConnectorsAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getConnectorsAssignment_3_2()); 

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
    // $ANTLR end "rule__Component__Group_3__2__Impl"


    // $ANTLR start "rule__Component__Group_3__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1851:1: rule__Component__Group_3__3 : rule__Component__Group_3__3__Impl ;
    public final void rule__Component__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1855:1: ( rule__Component__Group_3__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1856:2: rule__Component__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_3__3__Impl_in_rule__Component__Group_3__33705);
            rule__Component__Group_3__3__Impl();

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
    // $ANTLR end "rule__Component__Group_3__3"


    // $ANTLR start "rule__Component__Group_3__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1862:1: rule__Component__Group_3__3__Impl : ( '}' ) ;
    public final void rule__Component__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1866:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1867:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1867:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1868:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,22,FOLLOW_22_in_rule__Component__Group_3__3__Impl3733); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__Component__Group_3__3__Impl"


    // $ANTLR start "rule__Component__Group_4__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1889:1: rule__Component__Group_4__0 : rule__Component__Group_4__0__Impl rule__Component__Group_4__1 ;
    public final void rule__Component__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1893:1: ( rule__Component__Group_4__0__Impl rule__Component__Group_4__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1894:2: rule__Component__Group_4__0__Impl rule__Component__Group_4__1
            {
            pushFollow(FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__03772);
            rule__Component__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__03775);
            rule__Component__Group_4__1();

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
    // $ANTLR end "rule__Component__Group_4__0"


    // $ANTLR start "rule__Component__Group_4__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1901:1: rule__Component__Group_4__0__Impl : ( 'subcomponents' ) ;
    public final void rule__Component__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1905:1: ( ( 'subcomponents' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1906:1: ( 'subcomponents' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1906:1: ( 'subcomponents' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1907:1: 'subcomponents'
            {
             before(grammarAccess.getComponentAccess().getSubcomponentsKeyword_4_0()); 
            match(input,27,FOLLOW_27_in_rule__Component__Group_4__0__Impl3803); 
             after(grammarAccess.getComponentAccess().getSubcomponentsKeyword_4_0()); 

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
    // $ANTLR end "rule__Component__Group_4__0__Impl"


    // $ANTLR start "rule__Component__Group_4__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1920:1: rule__Component__Group_4__1 : rule__Component__Group_4__1__Impl rule__Component__Group_4__2 ;
    public final void rule__Component__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1924:1: ( rule__Component__Group_4__1__Impl rule__Component__Group_4__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1925:2: rule__Component__Group_4__1__Impl rule__Component__Group_4__2
            {
            pushFollow(FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__13834);
            rule__Component__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__2_in_rule__Component__Group_4__13837);
            rule__Component__Group_4__2();

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
    // $ANTLR end "rule__Component__Group_4__1"


    // $ANTLR start "rule__Component__Group_4__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1932:1: rule__Component__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Component__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1936:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1937:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1937:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1938:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_20_in_rule__Component__Group_4__1__Impl3865); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Component__Group_4__1__Impl"


    // $ANTLR start "rule__Component__Group_4__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1951:1: rule__Component__Group_4__2 : rule__Component__Group_4__2__Impl rule__Component__Group_4__3 ;
    public final void rule__Component__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1955:1: ( rule__Component__Group_4__2__Impl rule__Component__Group_4__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1956:2: rule__Component__Group_4__2__Impl rule__Component__Group_4__3
            {
            pushFollow(FOLLOW_rule__Component__Group_4__2__Impl_in_rule__Component__Group_4__23896);
            rule__Component__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group_4__3_in_rule__Component__Group_4__23899);
            rule__Component__Group_4__3();

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
    // $ANTLR end "rule__Component__Group_4__2"


    // $ANTLR start "rule__Component__Group_4__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1963:1: rule__Component__Group_4__2__Impl : ( ( rule__Component__SubcomponentsAssignment_4_2 )* ) ;
    public final void rule__Component__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1967:1: ( ( ( rule__Component__SubcomponentsAssignment_4_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1968:1: ( ( rule__Component__SubcomponentsAssignment_4_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1968:1: ( ( rule__Component__SubcomponentsAssignment_4_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1969:1: ( rule__Component__SubcomponentsAssignment_4_2 )*
            {
             before(grammarAccess.getComponentAccess().getSubcomponentsAssignment_4_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1970:1: ( rule__Component__SubcomponentsAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1970:2: rule__Component__SubcomponentsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__Component__SubcomponentsAssignment_4_2_in_rule__Component__Group_4__2__Impl3926);
            	    rule__Component__SubcomponentsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getSubcomponentsAssignment_4_2()); 

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
    // $ANTLR end "rule__Component__Group_4__2__Impl"


    // $ANTLR start "rule__Component__Group_4__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1980:1: rule__Component__Group_4__3 : rule__Component__Group_4__3__Impl ;
    public final void rule__Component__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1984:1: ( rule__Component__Group_4__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1985:2: rule__Component__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group_4__3__Impl_in_rule__Component__Group_4__33957);
            rule__Component__Group_4__3__Impl();

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
    // $ANTLR end "rule__Component__Group_4__3"


    // $ANTLR start "rule__Component__Group_4__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1991:1: rule__Component__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Component__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1995:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1996:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1996:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:1997:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,22,FOLLOW_22_in_rule__Component__Group_4__3__Impl3985); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Component__Group_4__3__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2018:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2022:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2023:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__04024);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__04027);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2030:1: rule__Port__Group__0__Impl : ( ( rule__Port__DirectionAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2034:1: ( ( ( rule__Port__DirectionAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2035:1: ( ( rule__Port__DirectionAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2035:1: ( ( rule__Port__DirectionAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2036:1: ( rule__Port__DirectionAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getDirectionAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2037:1: ( rule__Port__DirectionAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2037:2: rule__Port__DirectionAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl4054);
            rule__Port__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getDirectionAssignment_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2047:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2051:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2052:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__14084);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__2_in_rule__Port__Group__14087);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2059:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2063:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2064:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2064:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2065:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2066:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2066:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl4114);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2076:1: rule__Port__Group__2 : rule__Port__Group__2__Impl ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2080:1: ( rule__Port__Group__2__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2081:2: rule__Port__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__24144);
            rule__Port__Group__2__Impl();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2087:1: rule__Port__Group__2__Impl : ( ( rule__Port__SignalAssignment_2 )? ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2091:1: ( ( ( rule__Port__SignalAssignment_2 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2092:1: ( ( rule__Port__SignalAssignment_2 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2092:1: ( ( rule__Port__SignalAssignment_2 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2093:1: ( rule__Port__SignalAssignment_2 )?
            {
             before(grammarAccess.getPortAccess().getSignalAssignment_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2094:1: ( rule__Port__SignalAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2094:2: rule__Port__SignalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Port__SignalAssignment_2_in_rule__Port__Group__2__Impl4171);
                    rule__Port__SignalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getSignalAssignment_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2110:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2114:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2115:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__04208);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__04211);
            rule__Connector__Group__1();

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
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2122:1: rule__Connector__Group__0__Impl : ( ( rule__Connector__NameAssignment_0 ) ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2126:1: ( ( ( rule__Connector__NameAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2127:1: ( ( rule__Connector__NameAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2127:1: ( ( rule__Connector__NameAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2128:1: ( rule__Connector__NameAssignment_0 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2129:1: ( rule__Connector__NameAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2129:2: rule__Connector__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_0_in_rule__Connector__Group__0__Impl4238);
            rule__Connector__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2139:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2143:1: ( rule__Connector__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2144:2: rule__Connector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__14268);
            rule__Connector__Group__1__Impl();

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
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2150:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__TypeAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2154:1: ( ( ( rule__Connector__TypeAssignment_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2155:1: ( ( rule__Connector__TypeAssignment_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2155:1: ( ( rule__Connector__TypeAssignment_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2156:1: ( rule__Connector__TypeAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getTypeAssignment_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2157:1: ( rule__Connector__TypeAssignment_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2157:2: rule__Connector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl4295);
            rule__Connector__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2171:1: rule__ConnectorTypeOne__Group__0 : rule__ConnectorTypeOne__Group__0__Impl rule__ConnectorTypeOne__Group__1 ;
    public final void rule__ConnectorTypeOne__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2175:1: ( rule__ConnectorTypeOne__Group__0__Impl rule__ConnectorTypeOne__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2176:2: rule__ConnectorTypeOne__Group__0__Impl rule__ConnectorTypeOne__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__0__Impl_in_rule__ConnectorTypeOne__Group__04329);
            rule__ConnectorTypeOne__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__1_in_rule__ConnectorTypeOne__Group__04332);
            rule__ConnectorTypeOne__Group__1();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__0"


    // $ANTLR start "rule__ConnectorTypeOne__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2183:1: rule__ConnectorTypeOne__Group__0__Impl : ( '(' ) ;
    public final void rule__ConnectorTypeOne__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2187:1: ( ( '(' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2188:1: ( '(' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2188:1: ( '(' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2189:1: '('
            {
             before(grammarAccess.getConnectorTypeOneAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ConnectorTypeOne__Group__0__Impl4360); 
             after(grammarAccess.getConnectorTypeOneAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__0__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2202:1: rule__ConnectorTypeOne__Group__1 : rule__ConnectorTypeOne__Group__1__Impl rule__ConnectorTypeOne__Group__2 ;
    public final void rule__ConnectorTypeOne__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2206:1: ( rule__ConnectorTypeOne__Group__1__Impl rule__ConnectorTypeOne__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2207:2: rule__ConnectorTypeOne__Group__1__Impl rule__ConnectorTypeOne__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__1__Impl_in_rule__ConnectorTypeOne__Group__14391);
            rule__ConnectorTypeOne__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__2_in_rule__ConnectorTypeOne__Group__14394);
            rule__ConnectorTypeOne__Group__2();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__1"


    // $ANTLR start "rule__ConnectorTypeOne__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2214:1: rule__ConnectorTypeOne__Group__1__Impl : ( ( rule__ConnectorTypeOne__SourceAssignment_1 ) ) ;
    public final void rule__ConnectorTypeOne__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2218:1: ( ( ( rule__ConnectorTypeOne__SourceAssignment_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2219:1: ( ( rule__ConnectorTypeOne__SourceAssignment_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2219:1: ( ( rule__ConnectorTypeOne__SourceAssignment_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2220:1: ( rule__ConnectorTypeOne__SourceAssignment_1 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSourceAssignment_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2221:1: ( rule__ConnectorTypeOne__SourceAssignment_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2221:2: rule__ConnectorTypeOne__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__SourceAssignment_1_in_rule__ConnectorTypeOne__Group__1__Impl4421);
            rule__ConnectorTypeOne__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getSourceAssignment_1()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__1__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2231:1: rule__ConnectorTypeOne__Group__2 : rule__ConnectorTypeOne__Group__2__Impl rule__ConnectorTypeOne__Group__3 ;
    public final void rule__ConnectorTypeOne__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2235:1: ( rule__ConnectorTypeOne__Group__2__Impl rule__ConnectorTypeOne__Group__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2236:2: rule__ConnectorTypeOne__Group__2__Impl rule__ConnectorTypeOne__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__2__Impl_in_rule__ConnectorTypeOne__Group__24451);
            rule__ConnectorTypeOne__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__3_in_rule__ConnectorTypeOne__Group__24454);
            rule__ConnectorTypeOne__Group__3();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__2"


    // $ANTLR start "rule__ConnectorTypeOne__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2243:1: rule__ConnectorTypeOne__Group__2__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeOne__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2247:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2248:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2248:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2249:1: ','
            {
             before(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeOne__Group__2__Impl4482); 
             after(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__2__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2262:1: rule__ConnectorTypeOne__Group__3 : rule__ConnectorTypeOne__Group__3__Impl rule__ConnectorTypeOne__Group__4 ;
    public final void rule__ConnectorTypeOne__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2266:1: ( rule__ConnectorTypeOne__Group__3__Impl rule__ConnectorTypeOne__Group__4 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2267:2: rule__ConnectorTypeOne__Group__3__Impl rule__ConnectorTypeOne__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__3__Impl_in_rule__ConnectorTypeOne__Group__34513);
            rule__ConnectorTypeOne__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__4_in_rule__ConnectorTypeOne__Group__34516);
            rule__ConnectorTypeOne__Group__4();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__3"


    // $ANTLR start "rule__ConnectorTypeOne__Group__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2274:1: rule__ConnectorTypeOne__Group__3__Impl : ( ( rule__ConnectorTypeOne__PortnameoneAssignment_3 ) ) ;
    public final void rule__ConnectorTypeOne__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2278:1: ( ( ( rule__ConnectorTypeOne__PortnameoneAssignment_3 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2279:1: ( ( rule__ConnectorTypeOne__PortnameoneAssignment_3 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2279:1: ( ( rule__ConnectorTypeOne__PortnameoneAssignment_3 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2280:1: ( rule__ConnectorTypeOne__PortnameoneAssignment_3 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getPortnameoneAssignment_3()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2281:1: ( rule__ConnectorTypeOne__PortnameoneAssignment_3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2281:2: rule__ConnectorTypeOne__PortnameoneAssignment_3
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__PortnameoneAssignment_3_in_rule__ConnectorTypeOne__Group__3__Impl4543);
            rule__ConnectorTypeOne__PortnameoneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getPortnameoneAssignment_3()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__3__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__4"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2291:1: rule__ConnectorTypeOne__Group__4 : rule__ConnectorTypeOne__Group__4__Impl rule__ConnectorTypeOne__Group__5 ;
    public final void rule__ConnectorTypeOne__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2295:1: ( rule__ConnectorTypeOne__Group__4__Impl rule__ConnectorTypeOne__Group__5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2296:2: rule__ConnectorTypeOne__Group__4__Impl rule__ConnectorTypeOne__Group__5
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__4__Impl_in_rule__ConnectorTypeOne__Group__44573);
            rule__ConnectorTypeOne__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__5_in_rule__ConnectorTypeOne__Group__44576);
            rule__ConnectorTypeOne__Group__5();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__4"


    // $ANTLR start "rule__ConnectorTypeOne__Group__4__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2303:1: rule__ConnectorTypeOne__Group__4__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeOne__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2307:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2308:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2308:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2309:1: ','
            {
             before(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeOne__Group__4__Impl4604); 
             after(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__4__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2322:1: rule__ConnectorTypeOne__Group__5 : rule__ConnectorTypeOne__Group__5__Impl rule__ConnectorTypeOne__Group__6 ;
    public final void rule__ConnectorTypeOne__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2326:1: ( rule__ConnectorTypeOne__Group__5__Impl rule__ConnectorTypeOne__Group__6 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2327:2: rule__ConnectorTypeOne__Group__5__Impl rule__ConnectorTypeOne__Group__6
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__5__Impl_in_rule__ConnectorTypeOne__Group__54635);
            rule__ConnectorTypeOne__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__6_in_rule__ConnectorTypeOne__Group__54638);
            rule__ConnectorTypeOne__Group__6();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__5"


    // $ANTLR start "rule__ConnectorTypeOne__Group__5__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2334:1: rule__ConnectorTypeOne__Group__5__Impl : ( ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 ) ) ;
    public final void rule__ConnectorTypeOne__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2338:1: ( ( ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2339:1: ( ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2339:1: ( ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2340:1: ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSignaltypeoneAssignment_5()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2341:1: ( rule__ConnectorTypeOne__SignaltypeoneAssignment_5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2341:2: rule__ConnectorTypeOne__SignaltypeoneAssignment_5
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__SignaltypeoneAssignment_5_in_rule__ConnectorTypeOne__Group__5__Impl4665);
            rule__ConnectorTypeOne__SignaltypeoneAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getSignaltypeoneAssignment_5()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__5__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__6"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2351:1: rule__ConnectorTypeOne__Group__6 : rule__ConnectorTypeOne__Group__6__Impl rule__ConnectorTypeOne__Group__7 ;
    public final void rule__ConnectorTypeOne__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2355:1: ( rule__ConnectorTypeOne__Group__6__Impl rule__ConnectorTypeOne__Group__7 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2356:2: rule__ConnectorTypeOne__Group__6__Impl rule__ConnectorTypeOne__Group__7
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__6__Impl_in_rule__ConnectorTypeOne__Group__64695);
            rule__ConnectorTypeOne__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__7_in_rule__ConnectorTypeOne__Group__64698);
            rule__ConnectorTypeOne__Group__7();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__6"


    // $ANTLR start "rule__ConnectorTypeOne__Group__6__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2363:1: rule__ConnectorTypeOne__Group__6__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeOne__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2367:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2368:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2368:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2369:1: ','
            {
             before(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeOne__Group__6__Impl4726); 
             after(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__6__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__7"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2382:1: rule__ConnectorTypeOne__Group__7 : rule__ConnectorTypeOne__Group__7__Impl rule__ConnectorTypeOne__Group__8 ;
    public final void rule__ConnectorTypeOne__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2386:1: ( rule__ConnectorTypeOne__Group__7__Impl rule__ConnectorTypeOne__Group__8 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2387:2: rule__ConnectorTypeOne__Group__7__Impl rule__ConnectorTypeOne__Group__8
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__7__Impl_in_rule__ConnectorTypeOne__Group__74757);
            rule__ConnectorTypeOne__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__8_in_rule__ConnectorTypeOne__Group__74760);
            rule__ConnectorTypeOne__Group__8();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__7"


    // $ANTLR start "rule__ConnectorTypeOne__Group__7__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2394:1: rule__ConnectorTypeOne__Group__7__Impl : ( ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 ) ) ;
    public final void rule__ConnectorTypeOne__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2398:1: ( ( ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2399:1: ( ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2399:1: ( ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2400:1: ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSignaltypetwoAssignment_7()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2401:1: ( rule__ConnectorTypeOne__SignaltypetwoAssignment_7 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2401:2: rule__ConnectorTypeOne__SignaltypetwoAssignment_7
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__SignaltypetwoAssignment_7_in_rule__ConnectorTypeOne__Group__7__Impl4787);
            rule__ConnectorTypeOne__SignaltypetwoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getSignaltypetwoAssignment_7()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__7__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__8"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2411:1: rule__ConnectorTypeOne__Group__8 : rule__ConnectorTypeOne__Group__8__Impl rule__ConnectorTypeOne__Group__9 ;
    public final void rule__ConnectorTypeOne__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2415:1: ( rule__ConnectorTypeOne__Group__8__Impl rule__ConnectorTypeOne__Group__9 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2416:2: rule__ConnectorTypeOne__Group__8__Impl rule__ConnectorTypeOne__Group__9
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__8__Impl_in_rule__ConnectorTypeOne__Group__84817);
            rule__ConnectorTypeOne__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__9_in_rule__ConnectorTypeOne__Group__84820);
            rule__ConnectorTypeOne__Group__9();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__8"


    // $ANTLR start "rule__ConnectorTypeOne__Group__8__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2423:1: rule__ConnectorTypeOne__Group__8__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeOne__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2427:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2428:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2428:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2429:1: ','
            {
             before(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_8()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeOne__Group__8__Impl4848); 
             after(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__8__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__9"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2442:1: rule__ConnectorTypeOne__Group__9 : rule__ConnectorTypeOne__Group__9__Impl rule__ConnectorTypeOne__Group__10 ;
    public final void rule__ConnectorTypeOne__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2446:1: ( rule__ConnectorTypeOne__Group__9__Impl rule__ConnectorTypeOne__Group__10 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2447:2: rule__ConnectorTypeOne__Group__9__Impl rule__ConnectorTypeOne__Group__10
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__9__Impl_in_rule__ConnectorTypeOne__Group__94879);
            rule__ConnectorTypeOne__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__10_in_rule__ConnectorTypeOne__Group__94882);
            rule__ConnectorTypeOne__Group__10();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__9"


    // $ANTLR start "rule__ConnectorTypeOne__Group__9__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2454:1: rule__ConnectorTypeOne__Group__9__Impl : ( ( rule__ConnectorTypeOne__PortnametwoAssignment_9 ) ) ;
    public final void rule__ConnectorTypeOne__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2458:1: ( ( ( rule__ConnectorTypeOne__PortnametwoAssignment_9 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2459:1: ( ( rule__ConnectorTypeOne__PortnametwoAssignment_9 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2459:1: ( ( rule__ConnectorTypeOne__PortnametwoAssignment_9 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2460:1: ( rule__ConnectorTypeOne__PortnametwoAssignment_9 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getPortnametwoAssignment_9()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2461:1: ( rule__ConnectorTypeOne__PortnametwoAssignment_9 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2461:2: rule__ConnectorTypeOne__PortnametwoAssignment_9
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__PortnametwoAssignment_9_in_rule__ConnectorTypeOne__Group__9__Impl4909);
            rule__ConnectorTypeOne__PortnametwoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getPortnametwoAssignment_9()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__9__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__10"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2471:1: rule__ConnectorTypeOne__Group__10 : rule__ConnectorTypeOne__Group__10__Impl rule__ConnectorTypeOne__Group__11 ;
    public final void rule__ConnectorTypeOne__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2475:1: ( rule__ConnectorTypeOne__Group__10__Impl rule__ConnectorTypeOne__Group__11 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2476:2: rule__ConnectorTypeOne__Group__10__Impl rule__ConnectorTypeOne__Group__11
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__10__Impl_in_rule__ConnectorTypeOne__Group__104939);
            rule__ConnectorTypeOne__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__11_in_rule__ConnectorTypeOne__Group__104942);
            rule__ConnectorTypeOne__Group__11();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__10"


    // $ANTLR start "rule__ConnectorTypeOne__Group__10__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2483:1: rule__ConnectorTypeOne__Group__10__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeOne__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2487:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2488:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2488:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2489:1: ','
            {
             before(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_10()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeOne__Group__10__Impl4970); 
             after(grammarAccess.getConnectorTypeOneAccess().getCommaKeyword_10()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__10__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__11"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2502:1: rule__ConnectorTypeOne__Group__11 : rule__ConnectorTypeOne__Group__11__Impl rule__ConnectorTypeOne__Group__12 ;
    public final void rule__ConnectorTypeOne__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2506:1: ( rule__ConnectorTypeOne__Group__11__Impl rule__ConnectorTypeOne__Group__12 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2507:2: rule__ConnectorTypeOne__Group__11__Impl rule__ConnectorTypeOne__Group__12
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__11__Impl_in_rule__ConnectorTypeOne__Group__115001);
            rule__ConnectorTypeOne__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__12_in_rule__ConnectorTypeOne__Group__115004);
            rule__ConnectorTypeOne__Group__12();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__11"


    // $ANTLR start "rule__ConnectorTypeOne__Group__11__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2514:1: rule__ConnectorTypeOne__Group__11__Impl : ( ( rule__ConnectorTypeOne__DestinationAssignment_11 ) ) ;
    public final void rule__ConnectorTypeOne__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2518:1: ( ( ( rule__ConnectorTypeOne__DestinationAssignment_11 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2519:1: ( ( rule__ConnectorTypeOne__DestinationAssignment_11 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2519:1: ( ( rule__ConnectorTypeOne__DestinationAssignment_11 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2520:1: ( rule__ConnectorTypeOne__DestinationAssignment_11 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getDestinationAssignment_11()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2521:1: ( rule__ConnectorTypeOne__DestinationAssignment_11 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2521:2: rule__ConnectorTypeOne__DestinationAssignment_11
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__DestinationAssignment_11_in_rule__ConnectorTypeOne__Group__11__Impl5031);
            rule__ConnectorTypeOne__DestinationAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getDestinationAssignment_11()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__11__Impl"


    // $ANTLR start "rule__ConnectorTypeOne__Group__12"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2531:1: rule__ConnectorTypeOne__Group__12 : rule__ConnectorTypeOne__Group__12__Impl ;
    public final void rule__ConnectorTypeOne__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2535:1: ( rule__ConnectorTypeOne__Group__12__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2536:2: rule__ConnectorTypeOne__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__Group__12__Impl_in_rule__ConnectorTypeOne__Group__125061);
            rule__ConnectorTypeOne__Group__12__Impl();

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__12"


    // $ANTLR start "rule__ConnectorTypeOne__Group__12__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2542:1: rule__ConnectorTypeOne__Group__12__Impl : ( ')' ) ;
    public final void rule__ConnectorTypeOne__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2546:1: ( ( ')' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2547:1: ( ')' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2547:1: ( ')' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2548:1: ')'
            {
             before(grammarAccess.getConnectorTypeOneAccess().getRightParenthesisKeyword_12()); 
            match(input,30,FOLLOW_30_in_rule__ConnectorTypeOne__Group__12__Impl5089); 
             after(grammarAccess.getConnectorTypeOneAccess().getRightParenthesisKeyword_12()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__Group__12__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2587:1: rule__ConnectorTypeTwo__Group__0 : rule__ConnectorTypeTwo__Group__0__Impl rule__ConnectorTypeTwo__Group__1 ;
    public final void rule__ConnectorTypeTwo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2591:1: ( rule__ConnectorTypeTwo__Group__0__Impl rule__ConnectorTypeTwo__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2592:2: rule__ConnectorTypeTwo__Group__0__Impl rule__ConnectorTypeTwo__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__0__Impl_in_rule__ConnectorTypeTwo__Group__05146);
            rule__ConnectorTypeTwo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__1_in_rule__ConnectorTypeTwo__Group__05149);
            rule__ConnectorTypeTwo__Group__1();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__0"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2599:1: rule__ConnectorTypeTwo__Group__0__Impl : ( '(' ) ;
    public final void rule__ConnectorTypeTwo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2603:1: ( ( '(' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2604:1: ( '(' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2604:1: ( '(' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2605:1: '('
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ConnectorTypeTwo__Group__0__Impl5177); 
             after(grammarAccess.getConnectorTypeTwoAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__0__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2618:1: rule__ConnectorTypeTwo__Group__1 : rule__ConnectorTypeTwo__Group__1__Impl rule__ConnectorTypeTwo__Group__2 ;
    public final void rule__ConnectorTypeTwo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2622:1: ( rule__ConnectorTypeTwo__Group__1__Impl rule__ConnectorTypeTwo__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2623:2: rule__ConnectorTypeTwo__Group__1__Impl rule__ConnectorTypeTwo__Group__2
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__1__Impl_in_rule__ConnectorTypeTwo__Group__15208);
            rule__ConnectorTypeTwo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__2_in_rule__ConnectorTypeTwo__Group__15211);
            rule__ConnectorTypeTwo__Group__2();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__1"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2630:1: rule__ConnectorTypeTwo__Group__1__Impl : ( ( rule__ConnectorTypeTwo__SourceAssignment_1 ) ) ;
    public final void rule__ConnectorTypeTwo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2634:1: ( ( ( rule__ConnectorTypeTwo__SourceAssignment_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2635:1: ( ( rule__ConnectorTypeTwo__SourceAssignment_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2635:1: ( ( rule__ConnectorTypeTwo__SourceAssignment_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2636:1: ( rule__ConnectorTypeTwo__SourceAssignment_1 )
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getSourceAssignment_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2637:1: ( rule__ConnectorTypeTwo__SourceAssignment_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2637:2: rule__ConnectorTypeTwo__SourceAssignment_1
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__SourceAssignment_1_in_rule__ConnectorTypeTwo__Group__1__Impl5238);
            rule__ConnectorTypeTwo__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeTwoAccess().getSourceAssignment_1()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__1__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2647:1: rule__ConnectorTypeTwo__Group__2 : rule__ConnectorTypeTwo__Group__2__Impl rule__ConnectorTypeTwo__Group__3 ;
    public final void rule__ConnectorTypeTwo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2651:1: ( rule__ConnectorTypeTwo__Group__2__Impl rule__ConnectorTypeTwo__Group__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2652:2: rule__ConnectorTypeTwo__Group__2__Impl rule__ConnectorTypeTwo__Group__3
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__2__Impl_in_rule__ConnectorTypeTwo__Group__25268);
            rule__ConnectorTypeTwo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__3_in_rule__ConnectorTypeTwo__Group__25271);
            rule__ConnectorTypeTwo__Group__3();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__2"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2659:1: rule__ConnectorTypeTwo__Group__2__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeTwo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2663:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2664:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2664:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2665:1: ','
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeTwo__Group__2__Impl5299); 
             after(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__2__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2678:1: rule__ConnectorTypeTwo__Group__3 : rule__ConnectorTypeTwo__Group__3__Impl rule__ConnectorTypeTwo__Group__4 ;
    public final void rule__ConnectorTypeTwo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2682:1: ( rule__ConnectorTypeTwo__Group__3__Impl rule__ConnectorTypeTwo__Group__4 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2683:2: rule__ConnectorTypeTwo__Group__3__Impl rule__ConnectorTypeTwo__Group__4
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__3__Impl_in_rule__ConnectorTypeTwo__Group__35330);
            rule__ConnectorTypeTwo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__4_in_rule__ConnectorTypeTwo__Group__35333);
            rule__ConnectorTypeTwo__Group__4();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__3"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2690:1: rule__ConnectorTypeTwo__Group__3__Impl : ( ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 ) ) ;
    public final void rule__ConnectorTypeTwo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2694:1: ( ( ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2695:1: ( ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2695:1: ( ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2696:1: ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 )
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getSourcesignalAssignment_3()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2697:1: ( rule__ConnectorTypeTwo__SourcesignalAssignment_3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2697:2: rule__ConnectorTypeTwo__SourcesignalAssignment_3
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__SourcesignalAssignment_3_in_rule__ConnectorTypeTwo__Group__3__Impl5360);
            rule__ConnectorTypeTwo__SourcesignalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeTwoAccess().getSourcesignalAssignment_3()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__3__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__4"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2707:1: rule__ConnectorTypeTwo__Group__4 : rule__ConnectorTypeTwo__Group__4__Impl rule__ConnectorTypeTwo__Group__5 ;
    public final void rule__ConnectorTypeTwo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2711:1: ( rule__ConnectorTypeTwo__Group__4__Impl rule__ConnectorTypeTwo__Group__5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2712:2: rule__ConnectorTypeTwo__Group__4__Impl rule__ConnectorTypeTwo__Group__5
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__4__Impl_in_rule__ConnectorTypeTwo__Group__45390);
            rule__ConnectorTypeTwo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__5_in_rule__ConnectorTypeTwo__Group__45393);
            rule__ConnectorTypeTwo__Group__5();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__4"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__4__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2719:1: rule__ConnectorTypeTwo__Group__4__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeTwo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2723:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2724:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2724:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2725:1: ','
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeTwo__Group__4__Impl5421); 
             after(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__4__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2738:1: rule__ConnectorTypeTwo__Group__5 : rule__ConnectorTypeTwo__Group__5__Impl rule__ConnectorTypeTwo__Group__6 ;
    public final void rule__ConnectorTypeTwo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2742:1: ( rule__ConnectorTypeTwo__Group__5__Impl rule__ConnectorTypeTwo__Group__6 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2743:2: rule__ConnectorTypeTwo__Group__5__Impl rule__ConnectorTypeTwo__Group__6
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__5__Impl_in_rule__ConnectorTypeTwo__Group__55452);
            rule__ConnectorTypeTwo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__6_in_rule__ConnectorTypeTwo__Group__55455);
            rule__ConnectorTypeTwo__Group__6();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__5"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__5__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2750:1: rule__ConnectorTypeTwo__Group__5__Impl : ( ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 ) ) ;
    public final void rule__ConnectorTypeTwo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2754:1: ( ( ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2755:1: ( ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2755:1: ( ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2756:1: ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 )
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalAssignment_5()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2757:1: ( rule__ConnectorTypeTwo__DestinationsignalAssignment_5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2757:2: rule__ConnectorTypeTwo__DestinationsignalAssignment_5
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__DestinationsignalAssignment_5_in_rule__ConnectorTypeTwo__Group__5__Impl5482);
            rule__ConnectorTypeTwo__DestinationsignalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalAssignment_5()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__5__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__6"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2767:1: rule__ConnectorTypeTwo__Group__6 : rule__ConnectorTypeTwo__Group__6__Impl rule__ConnectorTypeTwo__Group__7 ;
    public final void rule__ConnectorTypeTwo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2771:1: ( rule__ConnectorTypeTwo__Group__6__Impl rule__ConnectorTypeTwo__Group__7 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2772:2: rule__ConnectorTypeTwo__Group__6__Impl rule__ConnectorTypeTwo__Group__7
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__6__Impl_in_rule__ConnectorTypeTwo__Group__65512);
            rule__ConnectorTypeTwo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__7_in_rule__ConnectorTypeTwo__Group__65515);
            rule__ConnectorTypeTwo__Group__7();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__6"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__6__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2779:1: rule__ConnectorTypeTwo__Group__6__Impl : ( ',' ) ;
    public final void rule__ConnectorTypeTwo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2783:1: ( ( ',' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2784:1: ( ',' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2784:1: ( ',' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2785:1: ','
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ConnectorTypeTwo__Group__6__Impl5543); 
             after(grammarAccess.getConnectorTypeTwoAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__6__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__7"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2798:1: rule__ConnectorTypeTwo__Group__7 : rule__ConnectorTypeTwo__Group__7__Impl rule__ConnectorTypeTwo__Group__8 ;
    public final void rule__ConnectorTypeTwo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2802:1: ( rule__ConnectorTypeTwo__Group__7__Impl rule__ConnectorTypeTwo__Group__8 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2803:2: rule__ConnectorTypeTwo__Group__7__Impl rule__ConnectorTypeTwo__Group__8
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__7__Impl_in_rule__ConnectorTypeTwo__Group__75574);
            rule__ConnectorTypeTwo__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__8_in_rule__ConnectorTypeTwo__Group__75577);
            rule__ConnectorTypeTwo__Group__8();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__7"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__7__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2810:1: rule__ConnectorTypeTwo__Group__7__Impl : ( ( rule__ConnectorTypeTwo__DestinationAssignment_7 ) ) ;
    public final void rule__ConnectorTypeTwo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2814:1: ( ( ( rule__ConnectorTypeTwo__DestinationAssignment_7 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2815:1: ( ( rule__ConnectorTypeTwo__DestinationAssignment_7 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2815:1: ( ( rule__ConnectorTypeTwo__DestinationAssignment_7 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2816:1: ( rule__ConnectorTypeTwo__DestinationAssignment_7 )
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getDestinationAssignment_7()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2817:1: ( rule__ConnectorTypeTwo__DestinationAssignment_7 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2817:2: rule__ConnectorTypeTwo__DestinationAssignment_7
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__DestinationAssignment_7_in_rule__ConnectorTypeTwo__Group__7__Impl5604);
            rule__ConnectorTypeTwo__DestinationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeTwoAccess().getDestinationAssignment_7()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__7__Impl"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__8"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2827:1: rule__ConnectorTypeTwo__Group__8 : rule__ConnectorTypeTwo__Group__8__Impl ;
    public final void rule__ConnectorTypeTwo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2831:1: ( rule__ConnectorTypeTwo__Group__8__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2832:2: rule__ConnectorTypeTwo__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ConnectorTypeTwo__Group__8__Impl_in_rule__ConnectorTypeTwo__Group__85634);
            rule__ConnectorTypeTwo__Group__8__Impl();

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__8"


    // $ANTLR start "rule__ConnectorTypeTwo__Group__8__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2838:1: rule__ConnectorTypeTwo__Group__8__Impl : ( ')' ) ;
    public final void rule__ConnectorTypeTwo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2842:1: ( ( ')' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2843:1: ( ')' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2843:1: ( ')' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2844:1: ')'
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_30_in_rule__ConnectorTypeTwo__Group__8__Impl5662); 
             after(grammarAccess.getConnectorTypeTwoAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__Group__8__Impl"


    // $ANTLR start "rule__Delta__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2875:1: rule__Delta__Group__0 : rule__Delta__Group__0__Impl rule__Delta__Group__1 ;
    public final void rule__Delta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2879:1: ( rule__Delta__Group__0__Impl rule__Delta__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2880:2: rule__Delta__Group__0__Impl rule__Delta__Group__1
            {
            pushFollow(FOLLOW_rule__Delta__Group__0__Impl_in_rule__Delta__Group__05711);
            rule__Delta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__1_in_rule__Delta__Group__05714);
            rule__Delta__Group__1();

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
    // $ANTLR end "rule__Delta__Group__0"


    // $ANTLR start "rule__Delta__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2887:1: rule__Delta__Group__0__Impl : ( ( rule__Delta__NameAssignment_0 ) ) ;
    public final void rule__Delta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2891:1: ( ( ( rule__Delta__NameAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2892:1: ( ( rule__Delta__NameAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2892:1: ( ( rule__Delta__NameAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2893:1: ( rule__Delta__NameAssignment_0 )
            {
             before(grammarAccess.getDeltaAccess().getNameAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2894:1: ( rule__Delta__NameAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2894:2: rule__Delta__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Delta__NameAssignment_0_in_rule__Delta__Group__0__Impl5741);
            rule__Delta__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Delta__Group__0__Impl"


    // $ANTLR start "rule__Delta__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2904:1: rule__Delta__Group__1 : rule__Delta__Group__1__Impl rule__Delta__Group__2 ;
    public final void rule__Delta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2908:1: ( rule__Delta__Group__1__Impl rule__Delta__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2909:2: rule__Delta__Group__1__Impl rule__Delta__Group__2
            {
            pushFollow(FOLLOW_rule__Delta__Group__1__Impl_in_rule__Delta__Group__15771);
            rule__Delta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__2_in_rule__Delta__Group__15774);
            rule__Delta__Group__2();

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
    // $ANTLR end "rule__Delta__Group__1"


    // $ANTLR start "rule__Delta__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2916:1: rule__Delta__Group__1__Impl : ( ( rule__Delta__Group_1__0 )? ) ;
    public final void rule__Delta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2920:1: ( ( ( rule__Delta__Group_1__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2921:1: ( ( rule__Delta__Group_1__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2921:1: ( ( rule__Delta__Group_1__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2922:1: ( rule__Delta__Group_1__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2923:1: ( rule__Delta__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2923:2: rule__Delta__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_1__0_in_rule__Delta__Group__1__Impl5801);
                    rule__Delta__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Delta__Group__1__Impl"


    // $ANTLR start "rule__Delta__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2933:1: rule__Delta__Group__2 : rule__Delta__Group__2__Impl rule__Delta__Group__3 ;
    public final void rule__Delta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2937:1: ( rule__Delta__Group__2__Impl rule__Delta__Group__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2938:2: rule__Delta__Group__2__Impl rule__Delta__Group__3
            {
            pushFollow(FOLLOW_rule__Delta__Group__2__Impl_in_rule__Delta__Group__25832);
            rule__Delta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__3_in_rule__Delta__Group__25835);
            rule__Delta__Group__3();

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
    // $ANTLR end "rule__Delta__Group__2"


    // $ANTLR start "rule__Delta__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2945:1: rule__Delta__Group__2__Impl : ( 'when' ) ;
    public final void rule__Delta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2949:1: ( ( 'when' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2950:1: ( 'when' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2950:1: ( 'when' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2951:1: 'when'
            {
             before(grammarAccess.getDeltaAccess().getWhenKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Delta__Group__2__Impl5863); 
             after(grammarAccess.getDeltaAccess().getWhenKeyword_2()); 

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
    // $ANTLR end "rule__Delta__Group__2__Impl"


    // $ANTLR start "rule__Delta__Group__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2964:1: rule__Delta__Group__3 : rule__Delta__Group__3__Impl rule__Delta__Group__4 ;
    public final void rule__Delta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2968:1: ( rule__Delta__Group__3__Impl rule__Delta__Group__4 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2969:2: rule__Delta__Group__3__Impl rule__Delta__Group__4
            {
            pushFollow(FOLLOW_rule__Delta__Group__3__Impl_in_rule__Delta__Group__35894);
            rule__Delta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__4_in_rule__Delta__Group__35897);
            rule__Delta__Group__4();

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
    // $ANTLR end "rule__Delta__Group__3"


    // $ANTLR start "rule__Delta__Group__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2976:1: rule__Delta__Group__3__Impl : ( ( rule__Delta__AppconAssignment_3 ) ) ;
    public final void rule__Delta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2980:1: ( ( ( rule__Delta__AppconAssignment_3 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2981:1: ( ( rule__Delta__AppconAssignment_3 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2981:1: ( ( rule__Delta__AppconAssignment_3 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2982:1: ( rule__Delta__AppconAssignment_3 )
            {
             before(grammarAccess.getDeltaAccess().getAppconAssignment_3()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2983:1: ( rule__Delta__AppconAssignment_3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2983:2: rule__Delta__AppconAssignment_3
            {
            pushFollow(FOLLOW_rule__Delta__AppconAssignment_3_in_rule__Delta__Group__3__Impl5924);
            rule__Delta__AppconAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAccess().getAppconAssignment_3()); 

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
    // $ANTLR end "rule__Delta__Group__3__Impl"


    // $ANTLR start "rule__Delta__Group__4"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2993:1: rule__Delta__Group__4 : rule__Delta__Group__4__Impl rule__Delta__Group__5 ;
    public final void rule__Delta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2997:1: ( rule__Delta__Group__4__Impl rule__Delta__Group__5 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:2998:2: rule__Delta__Group__4__Impl rule__Delta__Group__5
            {
            pushFollow(FOLLOW_rule__Delta__Group__4__Impl_in_rule__Delta__Group__45954);
            rule__Delta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__5_in_rule__Delta__Group__45957);
            rule__Delta__Group__5();

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
    // $ANTLR end "rule__Delta__Group__4"


    // $ANTLR start "rule__Delta__Group__4__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3005:1: rule__Delta__Group__4__Impl : ( '{' ) ;
    public final void rule__Delta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3009:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3010:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3010:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3011:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group__4__Impl5985); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Delta__Group__4__Impl"


    // $ANTLR start "rule__Delta__Group__5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3024:1: rule__Delta__Group__5 : rule__Delta__Group__5__Impl rule__Delta__Group__6 ;
    public final void rule__Delta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3028:1: ( rule__Delta__Group__5__Impl rule__Delta__Group__6 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3029:2: rule__Delta__Group__5__Impl rule__Delta__Group__6
            {
            pushFollow(FOLLOW_rule__Delta__Group__5__Impl_in_rule__Delta__Group__56016);
            rule__Delta__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__6_in_rule__Delta__Group__56019);
            rule__Delta__Group__6();

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
    // $ANTLR end "rule__Delta__Group__5"


    // $ANTLR start "rule__Delta__Group__5__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3036:1: rule__Delta__Group__5__Impl : ( ( rule__Delta__Group_5__0 )? ) ;
    public final void rule__Delta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3040:1: ( ( ( rule__Delta__Group_5__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3041:1: ( ( rule__Delta__Group_5__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3041:1: ( ( rule__Delta__Group_5__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3042:1: ( rule__Delta__Group_5__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_5()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3043:1: ( rule__Delta__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3043:2: rule__Delta__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_5__0_in_rule__Delta__Group__5__Impl6046);
                    rule__Delta__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Delta__Group__5__Impl"


    // $ANTLR start "rule__Delta__Group__6"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3053:1: rule__Delta__Group__6 : rule__Delta__Group__6__Impl rule__Delta__Group__7 ;
    public final void rule__Delta__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3057:1: ( rule__Delta__Group__6__Impl rule__Delta__Group__7 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3058:2: rule__Delta__Group__6__Impl rule__Delta__Group__7
            {
            pushFollow(FOLLOW_rule__Delta__Group__6__Impl_in_rule__Delta__Group__66077);
            rule__Delta__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__7_in_rule__Delta__Group__66080);
            rule__Delta__Group__7();

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
    // $ANTLR end "rule__Delta__Group__6"


    // $ANTLR start "rule__Delta__Group__6__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3065:1: rule__Delta__Group__6__Impl : ( ( rule__Delta__Group_6__0 )? ) ;
    public final void rule__Delta__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3069:1: ( ( ( rule__Delta__Group_6__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3070:1: ( ( rule__Delta__Group_6__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3070:1: ( ( rule__Delta__Group_6__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3071:1: ( rule__Delta__Group_6__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_6()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3072:1: ( rule__Delta__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3072:2: rule__Delta__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_6__0_in_rule__Delta__Group__6__Impl6107);
                    rule__Delta__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Delta__Group__6__Impl"


    // $ANTLR start "rule__Delta__Group__7"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3082:1: rule__Delta__Group__7 : rule__Delta__Group__7__Impl rule__Delta__Group__8 ;
    public final void rule__Delta__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3086:1: ( rule__Delta__Group__7__Impl rule__Delta__Group__8 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3087:2: rule__Delta__Group__7__Impl rule__Delta__Group__8
            {
            pushFollow(FOLLOW_rule__Delta__Group__7__Impl_in_rule__Delta__Group__76138);
            rule__Delta__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__8_in_rule__Delta__Group__76141);
            rule__Delta__Group__8();

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
    // $ANTLR end "rule__Delta__Group__7"


    // $ANTLR start "rule__Delta__Group__7__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3094:1: rule__Delta__Group__7__Impl : ( ( rule__Delta__Group_7__0 )? ) ;
    public final void rule__Delta__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3098:1: ( ( ( rule__Delta__Group_7__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3099:1: ( ( rule__Delta__Group_7__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3099:1: ( ( rule__Delta__Group_7__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3100:1: ( rule__Delta__Group_7__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_7()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3101:1: ( rule__Delta__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3101:2: rule__Delta__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_7__0_in_rule__Delta__Group__7__Impl6168);
                    rule__Delta__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Delta__Group__7__Impl"


    // $ANTLR start "rule__Delta__Group__8"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3111:1: rule__Delta__Group__8 : rule__Delta__Group__8__Impl rule__Delta__Group__9 ;
    public final void rule__Delta__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3115:1: ( rule__Delta__Group__8__Impl rule__Delta__Group__9 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3116:2: rule__Delta__Group__8__Impl rule__Delta__Group__9
            {
            pushFollow(FOLLOW_rule__Delta__Group__8__Impl_in_rule__Delta__Group__86199);
            rule__Delta__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__9_in_rule__Delta__Group__86202);
            rule__Delta__Group__9();

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
    // $ANTLR end "rule__Delta__Group__8"


    // $ANTLR start "rule__Delta__Group__8__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3123:1: rule__Delta__Group__8__Impl : ( ( rule__Delta__Group_8__0 )? ) ;
    public final void rule__Delta__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3127:1: ( ( ( rule__Delta__Group_8__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3128:1: ( ( rule__Delta__Group_8__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3128:1: ( ( rule__Delta__Group_8__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3129:1: ( rule__Delta__Group_8__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_8()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3130:1: ( rule__Delta__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3130:2: rule__Delta__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_8__0_in_rule__Delta__Group__8__Impl6229);
                    rule__Delta__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Delta__Group__8__Impl"


    // $ANTLR start "rule__Delta__Group__9"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3140:1: rule__Delta__Group__9 : rule__Delta__Group__9__Impl rule__Delta__Group__10 ;
    public final void rule__Delta__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3144:1: ( rule__Delta__Group__9__Impl rule__Delta__Group__10 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3145:2: rule__Delta__Group__9__Impl rule__Delta__Group__10
            {
            pushFollow(FOLLOW_rule__Delta__Group__9__Impl_in_rule__Delta__Group__96260);
            rule__Delta__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__10_in_rule__Delta__Group__96263);
            rule__Delta__Group__10();

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
    // $ANTLR end "rule__Delta__Group__9"


    // $ANTLR start "rule__Delta__Group__9__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3152:1: rule__Delta__Group__9__Impl : ( ( rule__Delta__Group_9__0 )? ) ;
    public final void rule__Delta__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3156:1: ( ( ( rule__Delta__Group_9__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3157:1: ( ( rule__Delta__Group_9__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3157:1: ( ( rule__Delta__Group_9__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3158:1: ( rule__Delta__Group_9__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_9()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3159:1: ( rule__Delta__Group_9__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3159:2: rule__Delta__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_9__0_in_rule__Delta__Group__9__Impl6290);
                    rule__Delta__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Delta__Group__9__Impl"


    // $ANTLR start "rule__Delta__Group__10"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3169:1: rule__Delta__Group__10 : rule__Delta__Group__10__Impl rule__Delta__Group__11 ;
    public final void rule__Delta__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3173:1: ( rule__Delta__Group__10__Impl rule__Delta__Group__11 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3174:2: rule__Delta__Group__10__Impl rule__Delta__Group__11
            {
            pushFollow(FOLLOW_rule__Delta__Group__10__Impl_in_rule__Delta__Group__106321);
            rule__Delta__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__11_in_rule__Delta__Group__106324);
            rule__Delta__Group__11();

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
    // $ANTLR end "rule__Delta__Group__10"


    // $ANTLR start "rule__Delta__Group__10__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3181:1: rule__Delta__Group__10__Impl : ( ( rule__Delta__Group_10__0 )? ) ;
    public final void rule__Delta__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3185:1: ( ( ( rule__Delta__Group_10__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3186:1: ( ( rule__Delta__Group_10__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3186:1: ( ( rule__Delta__Group_10__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3187:1: ( rule__Delta__Group_10__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_10()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3188:1: ( rule__Delta__Group_10__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3188:2: rule__Delta__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_10__0_in_rule__Delta__Group__10__Impl6351);
                    rule__Delta__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Delta__Group__10__Impl"


    // $ANTLR start "rule__Delta__Group__11"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3198:1: rule__Delta__Group__11 : rule__Delta__Group__11__Impl rule__Delta__Group__12 ;
    public final void rule__Delta__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3202:1: ( rule__Delta__Group__11__Impl rule__Delta__Group__12 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3203:2: rule__Delta__Group__11__Impl rule__Delta__Group__12
            {
            pushFollow(FOLLOW_rule__Delta__Group__11__Impl_in_rule__Delta__Group__116382);
            rule__Delta__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__12_in_rule__Delta__Group__116385);
            rule__Delta__Group__12();

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
    // $ANTLR end "rule__Delta__Group__11"


    // $ANTLR start "rule__Delta__Group__11__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3210:1: rule__Delta__Group__11__Impl : ( ( rule__Delta__Group_11__0 )? ) ;
    public final void rule__Delta__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3214:1: ( ( ( rule__Delta__Group_11__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3215:1: ( ( rule__Delta__Group_11__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3215:1: ( ( rule__Delta__Group_11__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3216:1: ( rule__Delta__Group_11__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_11()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3217:1: ( rule__Delta__Group_11__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3217:2: rule__Delta__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_11__0_in_rule__Delta__Group__11__Impl6412);
                    rule__Delta__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Delta__Group__11__Impl"


    // $ANTLR start "rule__Delta__Group__12"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3227:1: rule__Delta__Group__12 : rule__Delta__Group__12__Impl rule__Delta__Group__13 ;
    public final void rule__Delta__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3231:1: ( rule__Delta__Group__12__Impl rule__Delta__Group__13 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3232:2: rule__Delta__Group__12__Impl rule__Delta__Group__13
            {
            pushFollow(FOLLOW_rule__Delta__Group__12__Impl_in_rule__Delta__Group__126443);
            rule__Delta__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group__13_in_rule__Delta__Group__126446);
            rule__Delta__Group__13();

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
    // $ANTLR end "rule__Delta__Group__12"


    // $ANTLR start "rule__Delta__Group__12__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3239:1: rule__Delta__Group__12__Impl : ( ( rule__Delta__Group_12__0 )? ) ;
    public final void rule__Delta__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3243:1: ( ( ( rule__Delta__Group_12__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3244:1: ( ( rule__Delta__Group_12__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3244:1: ( ( rule__Delta__Group_12__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3245:1: ( rule__Delta__Group_12__0 )?
            {
             before(grammarAccess.getDeltaAccess().getGroup_12()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3246:1: ( rule__Delta__Group_12__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3246:2: rule__Delta__Group_12__0
                    {
                    pushFollow(FOLLOW_rule__Delta__Group_12__0_in_rule__Delta__Group__12__Impl6473);
                    rule__Delta__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Delta__Group__12__Impl"


    // $ANTLR start "rule__Delta__Group__13"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3256:1: rule__Delta__Group__13 : rule__Delta__Group__13__Impl ;
    public final void rule__Delta__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3260:1: ( rule__Delta__Group__13__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3261:2: rule__Delta__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group__13__Impl_in_rule__Delta__Group__136504);
            rule__Delta__Group__13__Impl();

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
    // $ANTLR end "rule__Delta__Group__13"


    // $ANTLR start "rule__Delta__Group__13__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3267:1: rule__Delta__Group__13__Impl : ( '}' ) ;
    public final void rule__Delta__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3271:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3272:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3272:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3273:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_13()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group__13__Impl6532); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Delta__Group__13__Impl"


    // $ANTLR start "rule__Delta__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3314:1: rule__Delta__Group_1__0 : rule__Delta__Group_1__0__Impl rule__Delta__Group_1__1 ;
    public final void rule__Delta__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3318:1: ( rule__Delta__Group_1__0__Impl rule__Delta__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3319:2: rule__Delta__Group_1__0__Impl rule__Delta__Group_1__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_1__0__Impl_in_rule__Delta__Group_1__06591);
            rule__Delta__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_1__1_in_rule__Delta__Group_1__06594);
            rule__Delta__Group_1__1();

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
    // $ANTLR end "rule__Delta__Group_1__0"


    // $ANTLR start "rule__Delta__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3326:1: rule__Delta__Group_1__0__Impl : ( 'after' ) ;
    public final void rule__Delta__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3330:1: ( ( 'after' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3331:1: ( 'after' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3331:1: ( 'after' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3332:1: 'after'
            {
             before(grammarAccess.getDeltaAccess().getAfterKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Delta__Group_1__0__Impl6622); 
             after(grammarAccess.getDeltaAccess().getAfterKeyword_1_0()); 

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
    // $ANTLR end "rule__Delta__Group_1__0__Impl"


    // $ANTLR start "rule__Delta__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3345:1: rule__Delta__Group_1__1 : rule__Delta__Group_1__1__Impl ;
    public final void rule__Delta__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3349:1: ( rule__Delta__Group_1__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3350:2: rule__Delta__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_1__1__Impl_in_rule__Delta__Group_1__16653);
            rule__Delta__Group_1__1__Impl();

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
    // $ANTLR end "rule__Delta__Group_1__1"


    // $ANTLR start "rule__Delta__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3356:1: rule__Delta__Group_1__1__Impl : ( ( rule__Delta__AfterAssignment_1_1 )* ) ;
    public final void rule__Delta__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3360:1: ( ( ( rule__Delta__AfterAssignment_1_1 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3361:1: ( ( rule__Delta__AfterAssignment_1_1 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3361:1: ( ( rule__Delta__AfterAssignment_1_1 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3362:1: ( rule__Delta__AfterAssignment_1_1 )*
            {
             before(grammarAccess.getDeltaAccess().getAfterAssignment_1_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3363:1: ( rule__Delta__AfterAssignment_1_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3363:2: rule__Delta__AfterAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Delta__AfterAssignment_1_1_in_rule__Delta__Group_1__1__Impl6680);
            	    rule__Delta__AfterAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getAfterAssignment_1_1()); 

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
    // $ANTLR end "rule__Delta__Group_1__1__Impl"


    // $ANTLR start "rule__Delta__Group_5__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3377:1: rule__Delta__Group_5__0 : rule__Delta__Group_5__0__Impl rule__Delta__Group_5__1 ;
    public final void rule__Delta__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3381:1: ( rule__Delta__Group_5__0__Impl rule__Delta__Group_5__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3382:2: rule__Delta__Group_5__0__Impl rule__Delta__Group_5__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_5__0__Impl_in_rule__Delta__Group_5__06715);
            rule__Delta__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_5__1_in_rule__Delta__Group_5__06718);
            rule__Delta__Group_5__1();

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
    // $ANTLR end "rule__Delta__Group_5__0"


    // $ANTLR start "rule__Delta__Group_5__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3389:1: rule__Delta__Group_5__0__Impl : ( 'removeconnector' ) ;
    public final void rule__Delta__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3393:1: ( ( 'removeconnector' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3394:1: ( 'removeconnector' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3394:1: ( 'removeconnector' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3395:1: 'removeconnector'
            {
             before(grammarAccess.getDeltaAccess().getRemoveconnectorKeyword_5_0()); 
            match(input,33,FOLLOW_33_in_rule__Delta__Group_5__0__Impl6746); 
             after(grammarAccess.getDeltaAccess().getRemoveconnectorKeyword_5_0()); 

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
    // $ANTLR end "rule__Delta__Group_5__0__Impl"


    // $ANTLR start "rule__Delta__Group_5__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3408:1: rule__Delta__Group_5__1 : rule__Delta__Group_5__1__Impl rule__Delta__Group_5__2 ;
    public final void rule__Delta__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3412:1: ( rule__Delta__Group_5__1__Impl rule__Delta__Group_5__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3413:2: rule__Delta__Group_5__1__Impl rule__Delta__Group_5__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_5__1__Impl_in_rule__Delta__Group_5__16777);
            rule__Delta__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_5__2_in_rule__Delta__Group_5__16780);
            rule__Delta__Group_5__2();

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
    // $ANTLR end "rule__Delta__Group_5__1"


    // $ANTLR start "rule__Delta__Group_5__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3420:1: rule__Delta__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3424:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3425:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3425:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3426:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_5__1__Impl6808); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Delta__Group_5__1__Impl"


    // $ANTLR start "rule__Delta__Group_5__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3439:1: rule__Delta__Group_5__2 : rule__Delta__Group_5__2__Impl rule__Delta__Group_5__3 ;
    public final void rule__Delta__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3443:1: ( rule__Delta__Group_5__2__Impl rule__Delta__Group_5__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3444:2: rule__Delta__Group_5__2__Impl rule__Delta__Group_5__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_5__2__Impl_in_rule__Delta__Group_5__26839);
            rule__Delta__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_5__3_in_rule__Delta__Group_5__26842);
            rule__Delta__Group_5__3();

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
    // $ANTLR end "rule__Delta__Group_5__2"


    // $ANTLR start "rule__Delta__Group_5__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3451:1: rule__Delta__Group_5__2__Impl : ( ( rule__Delta__RemoveConnectorAssignment_5_2 )* ) ;
    public final void rule__Delta__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3455:1: ( ( ( rule__Delta__RemoveConnectorAssignment_5_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3456:1: ( ( rule__Delta__RemoveConnectorAssignment_5_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3456:1: ( ( rule__Delta__RemoveConnectorAssignment_5_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3457:1: ( rule__Delta__RemoveConnectorAssignment_5_2 )*
            {
             before(grammarAccess.getDeltaAccess().getRemoveConnectorAssignment_5_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3458:1: ( rule__Delta__RemoveConnectorAssignment_5_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3458:2: rule__Delta__RemoveConnectorAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__RemoveConnectorAssignment_5_2_in_rule__Delta__Group_5__2__Impl6869);
            	    rule__Delta__RemoveConnectorAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getRemoveConnectorAssignment_5_2()); 

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
    // $ANTLR end "rule__Delta__Group_5__2__Impl"


    // $ANTLR start "rule__Delta__Group_5__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3468:1: rule__Delta__Group_5__3 : rule__Delta__Group_5__3__Impl ;
    public final void rule__Delta__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3472:1: ( rule__Delta__Group_5__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3473:2: rule__Delta__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_5__3__Impl_in_rule__Delta__Group_5__36900);
            rule__Delta__Group_5__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_5__3"


    // $ANTLR start "rule__Delta__Group_5__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3479:1: rule__Delta__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3483:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3484:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3484:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3485:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_5__3__Impl6928); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__Delta__Group_5__3__Impl"


    // $ANTLR start "rule__Delta__Group_6__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3506:1: rule__Delta__Group_6__0 : rule__Delta__Group_6__0__Impl rule__Delta__Group_6__1 ;
    public final void rule__Delta__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3510:1: ( rule__Delta__Group_6__0__Impl rule__Delta__Group_6__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3511:2: rule__Delta__Group_6__0__Impl rule__Delta__Group_6__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_6__0__Impl_in_rule__Delta__Group_6__06967);
            rule__Delta__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_6__1_in_rule__Delta__Group_6__06970);
            rule__Delta__Group_6__1();

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
    // $ANTLR end "rule__Delta__Group_6__0"


    // $ANTLR start "rule__Delta__Group_6__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3518:1: rule__Delta__Group_6__0__Impl : ( 'removecomponent' ) ;
    public final void rule__Delta__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3522:1: ( ( 'removecomponent' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3523:1: ( 'removecomponent' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3523:1: ( 'removecomponent' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3524:1: 'removecomponent'
            {
             before(grammarAccess.getDeltaAccess().getRemovecomponentKeyword_6_0()); 
            match(input,34,FOLLOW_34_in_rule__Delta__Group_6__0__Impl6998); 
             after(grammarAccess.getDeltaAccess().getRemovecomponentKeyword_6_0()); 

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
    // $ANTLR end "rule__Delta__Group_6__0__Impl"


    // $ANTLR start "rule__Delta__Group_6__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3537:1: rule__Delta__Group_6__1 : rule__Delta__Group_6__1__Impl rule__Delta__Group_6__2 ;
    public final void rule__Delta__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3541:1: ( rule__Delta__Group_6__1__Impl rule__Delta__Group_6__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3542:2: rule__Delta__Group_6__1__Impl rule__Delta__Group_6__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_6__1__Impl_in_rule__Delta__Group_6__17029);
            rule__Delta__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_6__2_in_rule__Delta__Group_6__17032);
            rule__Delta__Group_6__2();

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
    // $ANTLR end "rule__Delta__Group_6__1"


    // $ANTLR start "rule__Delta__Group_6__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3549:1: rule__Delta__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3553:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3554:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3554:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3555:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_6__1__Impl7060); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Delta__Group_6__1__Impl"


    // $ANTLR start "rule__Delta__Group_6__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3568:1: rule__Delta__Group_6__2 : rule__Delta__Group_6__2__Impl rule__Delta__Group_6__3 ;
    public final void rule__Delta__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3572:1: ( rule__Delta__Group_6__2__Impl rule__Delta__Group_6__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3573:2: rule__Delta__Group_6__2__Impl rule__Delta__Group_6__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_6__2__Impl_in_rule__Delta__Group_6__27091);
            rule__Delta__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_6__3_in_rule__Delta__Group_6__27094);
            rule__Delta__Group_6__3();

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
    // $ANTLR end "rule__Delta__Group_6__2"


    // $ANTLR start "rule__Delta__Group_6__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3580:1: rule__Delta__Group_6__2__Impl : ( ( rule__Delta__RemoveComponentAssignment_6_2 )* ) ;
    public final void rule__Delta__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3584:1: ( ( ( rule__Delta__RemoveComponentAssignment_6_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3585:1: ( ( rule__Delta__RemoveComponentAssignment_6_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3585:1: ( ( rule__Delta__RemoveComponentAssignment_6_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3586:1: ( rule__Delta__RemoveComponentAssignment_6_2 )*
            {
             before(grammarAccess.getDeltaAccess().getRemoveComponentAssignment_6_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3587:1: ( rule__Delta__RemoveComponentAssignment_6_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3587:2: rule__Delta__RemoveComponentAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__RemoveComponentAssignment_6_2_in_rule__Delta__Group_6__2__Impl7121);
            	    rule__Delta__RemoveComponentAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getRemoveComponentAssignment_6_2()); 

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
    // $ANTLR end "rule__Delta__Group_6__2__Impl"


    // $ANTLR start "rule__Delta__Group_6__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3597:1: rule__Delta__Group_6__3 : rule__Delta__Group_6__3__Impl ;
    public final void rule__Delta__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3601:1: ( rule__Delta__Group_6__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3602:2: rule__Delta__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_6__3__Impl_in_rule__Delta__Group_6__37152);
            rule__Delta__Group_6__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_6__3"


    // $ANTLR start "rule__Delta__Group_6__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3608:1: rule__Delta__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3612:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3613:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3613:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3614:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_6__3__Impl7180); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__Delta__Group_6__3__Impl"


    // $ANTLR start "rule__Delta__Group_7__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3635:1: rule__Delta__Group_7__0 : rule__Delta__Group_7__0__Impl rule__Delta__Group_7__1 ;
    public final void rule__Delta__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3639:1: ( rule__Delta__Group_7__0__Impl rule__Delta__Group_7__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3640:2: rule__Delta__Group_7__0__Impl rule__Delta__Group_7__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_7__0__Impl_in_rule__Delta__Group_7__07219);
            rule__Delta__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_7__1_in_rule__Delta__Group_7__07222);
            rule__Delta__Group_7__1();

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
    // $ANTLR end "rule__Delta__Group_7__0"


    // $ANTLR start "rule__Delta__Group_7__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3647:1: rule__Delta__Group_7__0__Impl : ( 'removesignal' ) ;
    public final void rule__Delta__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3651:1: ( ( 'removesignal' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3652:1: ( 'removesignal' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3652:1: ( 'removesignal' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3653:1: 'removesignal'
            {
             before(grammarAccess.getDeltaAccess().getRemovesignalKeyword_7_0()); 
            match(input,35,FOLLOW_35_in_rule__Delta__Group_7__0__Impl7250); 
             after(grammarAccess.getDeltaAccess().getRemovesignalKeyword_7_0()); 

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
    // $ANTLR end "rule__Delta__Group_7__0__Impl"


    // $ANTLR start "rule__Delta__Group_7__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3666:1: rule__Delta__Group_7__1 : rule__Delta__Group_7__1__Impl rule__Delta__Group_7__2 ;
    public final void rule__Delta__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3670:1: ( rule__Delta__Group_7__1__Impl rule__Delta__Group_7__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3671:2: rule__Delta__Group_7__1__Impl rule__Delta__Group_7__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_7__1__Impl_in_rule__Delta__Group_7__17281);
            rule__Delta__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_7__2_in_rule__Delta__Group_7__17284);
            rule__Delta__Group_7__2();

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
    // $ANTLR end "rule__Delta__Group_7__1"


    // $ANTLR start "rule__Delta__Group_7__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3678:1: rule__Delta__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3682:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3683:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3683:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3684:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_7__1__Impl7312); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Delta__Group_7__1__Impl"


    // $ANTLR start "rule__Delta__Group_7__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3697:1: rule__Delta__Group_7__2 : rule__Delta__Group_7__2__Impl rule__Delta__Group_7__3 ;
    public final void rule__Delta__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3701:1: ( rule__Delta__Group_7__2__Impl rule__Delta__Group_7__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3702:2: rule__Delta__Group_7__2__Impl rule__Delta__Group_7__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_7__2__Impl_in_rule__Delta__Group_7__27343);
            rule__Delta__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_7__3_in_rule__Delta__Group_7__27346);
            rule__Delta__Group_7__3();

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
    // $ANTLR end "rule__Delta__Group_7__2"


    // $ANTLR start "rule__Delta__Group_7__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3709:1: rule__Delta__Group_7__2__Impl : ( ( rule__Delta__RemoveSignalAssignment_7_2 )* ) ;
    public final void rule__Delta__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3713:1: ( ( ( rule__Delta__RemoveSignalAssignment_7_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3714:1: ( ( rule__Delta__RemoveSignalAssignment_7_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3714:1: ( ( rule__Delta__RemoveSignalAssignment_7_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3715:1: ( rule__Delta__RemoveSignalAssignment_7_2 )*
            {
             before(grammarAccess.getDeltaAccess().getRemoveSignalAssignment_7_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3716:1: ( rule__Delta__RemoveSignalAssignment_7_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3716:2: rule__Delta__RemoveSignalAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__RemoveSignalAssignment_7_2_in_rule__Delta__Group_7__2__Impl7373);
            	    rule__Delta__RemoveSignalAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getRemoveSignalAssignment_7_2()); 

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
    // $ANTLR end "rule__Delta__Group_7__2__Impl"


    // $ANTLR start "rule__Delta__Group_7__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3726:1: rule__Delta__Group_7__3 : rule__Delta__Group_7__3__Impl ;
    public final void rule__Delta__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3730:1: ( rule__Delta__Group_7__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3731:2: rule__Delta__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_7__3__Impl_in_rule__Delta__Group_7__37404);
            rule__Delta__Group_7__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_7__3"


    // $ANTLR start "rule__Delta__Group_7__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3737:1: rule__Delta__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3741:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3742:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3742:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3743:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_7__3__Impl7432); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Delta__Group_7__3__Impl"


    // $ANTLR start "rule__Delta__Group_8__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3764:1: rule__Delta__Group_8__0 : rule__Delta__Group_8__0__Impl rule__Delta__Group_8__1 ;
    public final void rule__Delta__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3768:1: ( rule__Delta__Group_8__0__Impl rule__Delta__Group_8__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3769:2: rule__Delta__Group_8__0__Impl rule__Delta__Group_8__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_8__0__Impl_in_rule__Delta__Group_8__07471);
            rule__Delta__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_8__1_in_rule__Delta__Group_8__07474);
            rule__Delta__Group_8__1();

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
    // $ANTLR end "rule__Delta__Group_8__0"


    // $ANTLR start "rule__Delta__Group_8__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3776:1: rule__Delta__Group_8__0__Impl : ( 'removeport' ) ;
    public final void rule__Delta__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3780:1: ( ( 'removeport' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3781:1: ( 'removeport' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3781:1: ( 'removeport' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3782:1: 'removeport'
            {
             before(grammarAccess.getDeltaAccess().getRemoveportKeyword_8_0()); 
            match(input,36,FOLLOW_36_in_rule__Delta__Group_8__0__Impl7502); 
             after(grammarAccess.getDeltaAccess().getRemoveportKeyword_8_0()); 

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
    // $ANTLR end "rule__Delta__Group_8__0__Impl"


    // $ANTLR start "rule__Delta__Group_8__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3795:1: rule__Delta__Group_8__1 : rule__Delta__Group_8__1__Impl rule__Delta__Group_8__2 ;
    public final void rule__Delta__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3799:1: ( rule__Delta__Group_8__1__Impl rule__Delta__Group_8__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3800:2: rule__Delta__Group_8__1__Impl rule__Delta__Group_8__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_8__1__Impl_in_rule__Delta__Group_8__17533);
            rule__Delta__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_8__2_in_rule__Delta__Group_8__17536);
            rule__Delta__Group_8__2();

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
    // $ANTLR end "rule__Delta__Group_8__1"


    // $ANTLR start "rule__Delta__Group_8__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3807:1: rule__Delta__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3811:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3812:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3812:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3813:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_8__1__Impl7564); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__Delta__Group_8__1__Impl"


    // $ANTLR start "rule__Delta__Group_8__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3826:1: rule__Delta__Group_8__2 : rule__Delta__Group_8__2__Impl rule__Delta__Group_8__3 ;
    public final void rule__Delta__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3830:1: ( rule__Delta__Group_8__2__Impl rule__Delta__Group_8__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3831:2: rule__Delta__Group_8__2__Impl rule__Delta__Group_8__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_8__2__Impl_in_rule__Delta__Group_8__27595);
            rule__Delta__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_8__3_in_rule__Delta__Group_8__27598);
            rule__Delta__Group_8__3();

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
    // $ANTLR end "rule__Delta__Group_8__2"


    // $ANTLR start "rule__Delta__Group_8__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3838:1: rule__Delta__Group_8__2__Impl : ( ( rule__Delta__RemovePortAssignment_8_2 )* ) ;
    public final void rule__Delta__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3842:1: ( ( ( rule__Delta__RemovePortAssignment_8_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3843:1: ( ( rule__Delta__RemovePortAssignment_8_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3843:1: ( ( rule__Delta__RemovePortAssignment_8_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3844:1: ( rule__Delta__RemovePortAssignment_8_2 )*
            {
             before(grammarAccess.getDeltaAccess().getRemovePortAssignment_8_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3845:1: ( rule__Delta__RemovePortAssignment_8_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3845:2: rule__Delta__RemovePortAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__RemovePortAssignment_8_2_in_rule__Delta__Group_8__2__Impl7625);
            	    rule__Delta__RemovePortAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getRemovePortAssignment_8_2()); 

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
    // $ANTLR end "rule__Delta__Group_8__2__Impl"


    // $ANTLR start "rule__Delta__Group_8__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3855:1: rule__Delta__Group_8__3 : rule__Delta__Group_8__3__Impl ;
    public final void rule__Delta__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3859:1: ( rule__Delta__Group_8__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3860:2: rule__Delta__Group_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_8__3__Impl_in_rule__Delta__Group_8__37656);
            rule__Delta__Group_8__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_8__3"


    // $ANTLR start "rule__Delta__Group_8__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3866:1: rule__Delta__Group_8__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3870:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3871:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3871:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3872:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_8__3__Impl7684); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_8_3()); 

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
    // $ANTLR end "rule__Delta__Group_8__3__Impl"


    // $ANTLR start "rule__Delta__Group_9__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3893:1: rule__Delta__Group_9__0 : rule__Delta__Group_9__0__Impl rule__Delta__Group_9__1 ;
    public final void rule__Delta__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3897:1: ( rule__Delta__Group_9__0__Impl rule__Delta__Group_9__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3898:2: rule__Delta__Group_9__0__Impl rule__Delta__Group_9__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_9__0__Impl_in_rule__Delta__Group_9__07723);
            rule__Delta__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_9__1_in_rule__Delta__Group_9__07726);
            rule__Delta__Group_9__1();

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
    // $ANTLR end "rule__Delta__Group_9__0"


    // $ANTLR start "rule__Delta__Group_9__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3905:1: rule__Delta__Group_9__0__Impl : ( 'addsignal' ) ;
    public final void rule__Delta__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3909:1: ( ( 'addsignal' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3910:1: ( 'addsignal' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3910:1: ( 'addsignal' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3911:1: 'addsignal'
            {
             before(grammarAccess.getDeltaAccess().getAddsignalKeyword_9_0()); 
            match(input,37,FOLLOW_37_in_rule__Delta__Group_9__0__Impl7754); 
             after(grammarAccess.getDeltaAccess().getAddsignalKeyword_9_0()); 

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
    // $ANTLR end "rule__Delta__Group_9__0__Impl"


    // $ANTLR start "rule__Delta__Group_9__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3924:1: rule__Delta__Group_9__1 : rule__Delta__Group_9__1__Impl rule__Delta__Group_9__2 ;
    public final void rule__Delta__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3928:1: ( rule__Delta__Group_9__1__Impl rule__Delta__Group_9__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3929:2: rule__Delta__Group_9__1__Impl rule__Delta__Group_9__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_9__1__Impl_in_rule__Delta__Group_9__17785);
            rule__Delta__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_9__2_in_rule__Delta__Group_9__17788);
            rule__Delta__Group_9__2();

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
    // $ANTLR end "rule__Delta__Group_9__1"


    // $ANTLR start "rule__Delta__Group_9__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3936:1: rule__Delta__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3940:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3941:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3941:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3942:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_9__1__Impl7816); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Delta__Group_9__1__Impl"


    // $ANTLR start "rule__Delta__Group_9__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3955:1: rule__Delta__Group_9__2 : rule__Delta__Group_9__2__Impl rule__Delta__Group_9__3 ;
    public final void rule__Delta__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3959:1: ( rule__Delta__Group_9__2__Impl rule__Delta__Group_9__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3960:2: rule__Delta__Group_9__2__Impl rule__Delta__Group_9__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_9__2__Impl_in_rule__Delta__Group_9__27847);
            rule__Delta__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_9__3_in_rule__Delta__Group_9__27850);
            rule__Delta__Group_9__3();

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
    // $ANTLR end "rule__Delta__Group_9__2"


    // $ANTLR start "rule__Delta__Group_9__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3967:1: rule__Delta__Group_9__2__Impl : ( ( rule__Delta__NewSignalAssignment_9_2 )* ) ;
    public final void rule__Delta__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3971:1: ( ( ( rule__Delta__NewSignalAssignment_9_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3972:1: ( ( rule__Delta__NewSignalAssignment_9_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3972:1: ( ( rule__Delta__NewSignalAssignment_9_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3973:1: ( rule__Delta__NewSignalAssignment_9_2 )*
            {
             before(grammarAccess.getDeltaAccess().getNewSignalAssignment_9_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3974:1: ( rule__Delta__NewSignalAssignment_9_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3974:2: rule__Delta__NewSignalAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__NewSignalAssignment_9_2_in_rule__Delta__Group_9__2__Impl7877);
            	    rule__Delta__NewSignalAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getNewSignalAssignment_9_2()); 

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
    // $ANTLR end "rule__Delta__Group_9__2__Impl"


    // $ANTLR start "rule__Delta__Group_9__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3984:1: rule__Delta__Group_9__3 : rule__Delta__Group_9__3__Impl ;
    public final void rule__Delta__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3988:1: ( rule__Delta__Group_9__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3989:2: rule__Delta__Group_9__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_9__3__Impl_in_rule__Delta__Group_9__37908);
            rule__Delta__Group_9__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_9__3"


    // $ANTLR start "rule__Delta__Group_9__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3995:1: rule__Delta__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:3999:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4000:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4000:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4001:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_9__3__Impl7936); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_9_3()); 

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
    // $ANTLR end "rule__Delta__Group_9__3__Impl"


    // $ANTLR start "rule__Delta__Group_10__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4022:1: rule__Delta__Group_10__0 : rule__Delta__Group_10__0__Impl rule__Delta__Group_10__1 ;
    public final void rule__Delta__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4026:1: ( rule__Delta__Group_10__0__Impl rule__Delta__Group_10__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4027:2: rule__Delta__Group_10__0__Impl rule__Delta__Group_10__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_10__0__Impl_in_rule__Delta__Group_10__07975);
            rule__Delta__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_10__1_in_rule__Delta__Group_10__07978);
            rule__Delta__Group_10__1();

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
    // $ANTLR end "rule__Delta__Group_10__0"


    // $ANTLR start "rule__Delta__Group_10__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4034:1: rule__Delta__Group_10__0__Impl : ( 'addcomponent' ) ;
    public final void rule__Delta__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4038:1: ( ( 'addcomponent' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4039:1: ( 'addcomponent' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4039:1: ( 'addcomponent' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4040:1: 'addcomponent'
            {
             before(grammarAccess.getDeltaAccess().getAddcomponentKeyword_10_0()); 
            match(input,38,FOLLOW_38_in_rule__Delta__Group_10__0__Impl8006); 
             after(grammarAccess.getDeltaAccess().getAddcomponentKeyword_10_0()); 

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
    // $ANTLR end "rule__Delta__Group_10__0__Impl"


    // $ANTLR start "rule__Delta__Group_10__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4053:1: rule__Delta__Group_10__1 : rule__Delta__Group_10__1__Impl rule__Delta__Group_10__2 ;
    public final void rule__Delta__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4057:1: ( rule__Delta__Group_10__1__Impl rule__Delta__Group_10__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4058:2: rule__Delta__Group_10__1__Impl rule__Delta__Group_10__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_10__1__Impl_in_rule__Delta__Group_10__18037);
            rule__Delta__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_10__2_in_rule__Delta__Group_10__18040);
            rule__Delta__Group_10__2();

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
    // $ANTLR end "rule__Delta__Group_10__1"


    // $ANTLR start "rule__Delta__Group_10__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4065:1: rule__Delta__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4069:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4070:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4070:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4071:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_10__1__Impl8068); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__Delta__Group_10__1__Impl"


    // $ANTLR start "rule__Delta__Group_10__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4084:1: rule__Delta__Group_10__2 : rule__Delta__Group_10__2__Impl rule__Delta__Group_10__3 ;
    public final void rule__Delta__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4088:1: ( rule__Delta__Group_10__2__Impl rule__Delta__Group_10__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4089:2: rule__Delta__Group_10__2__Impl rule__Delta__Group_10__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_10__2__Impl_in_rule__Delta__Group_10__28099);
            rule__Delta__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_10__3_in_rule__Delta__Group_10__28102);
            rule__Delta__Group_10__3();

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
    // $ANTLR end "rule__Delta__Group_10__2"


    // $ANTLR start "rule__Delta__Group_10__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4096:1: rule__Delta__Group_10__2__Impl : ( ( rule__Delta__NewComponentAssignment_10_2 )* ) ;
    public final void rule__Delta__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4100:1: ( ( ( rule__Delta__NewComponentAssignment_10_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4101:1: ( ( rule__Delta__NewComponentAssignment_10_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4101:1: ( ( rule__Delta__NewComponentAssignment_10_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4102:1: ( rule__Delta__NewComponentAssignment_10_2 )*
            {
             before(grammarAccess.getDeltaAccess().getNewComponentAssignment_10_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4103:1: ( rule__Delta__NewComponentAssignment_10_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4103:2: rule__Delta__NewComponentAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__NewComponentAssignment_10_2_in_rule__Delta__Group_10__2__Impl8129);
            	    rule__Delta__NewComponentAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getNewComponentAssignment_10_2()); 

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
    // $ANTLR end "rule__Delta__Group_10__2__Impl"


    // $ANTLR start "rule__Delta__Group_10__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4113:1: rule__Delta__Group_10__3 : rule__Delta__Group_10__3__Impl ;
    public final void rule__Delta__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4117:1: ( rule__Delta__Group_10__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4118:2: rule__Delta__Group_10__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_10__3__Impl_in_rule__Delta__Group_10__38160);
            rule__Delta__Group_10__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_10__3"


    // $ANTLR start "rule__Delta__Group_10__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4124:1: rule__Delta__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4128:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4129:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4129:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4130:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_10__3__Impl8188); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_10_3()); 

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
    // $ANTLR end "rule__Delta__Group_10__3__Impl"


    // $ANTLR start "rule__Delta__Group_11__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4151:1: rule__Delta__Group_11__0 : rule__Delta__Group_11__0__Impl rule__Delta__Group_11__1 ;
    public final void rule__Delta__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4155:1: ( rule__Delta__Group_11__0__Impl rule__Delta__Group_11__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4156:2: rule__Delta__Group_11__0__Impl rule__Delta__Group_11__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_11__0__Impl_in_rule__Delta__Group_11__08227);
            rule__Delta__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_11__1_in_rule__Delta__Group_11__08230);
            rule__Delta__Group_11__1();

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
    // $ANTLR end "rule__Delta__Group_11__0"


    // $ANTLR start "rule__Delta__Group_11__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4163:1: rule__Delta__Group_11__0__Impl : ( 'addconnector' ) ;
    public final void rule__Delta__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4167:1: ( ( 'addconnector' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4168:1: ( 'addconnector' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4168:1: ( 'addconnector' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4169:1: 'addconnector'
            {
             before(grammarAccess.getDeltaAccess().getAddconnectorKeyword_11_0()); 
            match(input,39,FOLLOW_39_in_rule__Delta__Group_11__0__Impl8258); 
             after(grammarAccess.getDeltaAccess().getAddconnectorKeyword_11_0()); 

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
    // $ANTLR end "rule__Delta__Group_11__0__Impl"


    // $ANTLR start "rule__Delta__Group_11__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4182:1: rule__Delta__Group_11__1 : rule__Delta__Group_11__1__Impl rule__Delta__Group_11__2 ;
    public final void rule__Delta__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4186:1: ( rule__Delta__Group_11__1__Impl rule__Delta__Group_11__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4187:2: rule__Delta__Group_11__1__Impl rule__Delta__Group_11__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_11__1__Impl_in_rule__Delta__Group_11__18289);
            rule__Delta__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_11__2_in_rule__Delta__Group_11__18292);
            rule__Delta__Group_11__2();

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
    // $ANTLR end "rule__Delta__Group_11__1"


    // $ANTLR start "rule__Delta__Group_11__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4194:1: rule__Delta__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4198:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4199:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4199:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4200:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_11__1__Impl8320); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__Delta__Group_11__1__Impl"


    // $ANTLR start "rule__Delta__Group_11__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4213:1: rule__Delta__Group_11__2 : rule__Delta__Group_11__2__Impl rule__Delta__Group_11__3 ;
    public final void rule__Delta__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4217:1: ( rule__Delta__Group_11__2__Impl rule__Delta__Group_11__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4218:2: rule__Delta__Group_11__2__Impl rule__Delta__Group_11__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_11__2__Impl_in_rule__Delta__Group_11__28351);
            rule__Delta__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_11__3_in_rule__Delta__Group_11__28354);
            rule__Delta__Group_11__3();

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
    // $ANTLR end "rule__Delta__Group_11__2"


    // $ANTLR start "rule__Delta__Group_11__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4225:1: rule__Delta__Group_11__2__Impl : ( ( rule__Delta__NewConnectorAssignment_11_2 )* ) ;
    public final void rule__Delta__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4229:1: ( ( ( rule__Delta__NewConnectorAssignment_11_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4230:1: ( ( rule__Delta__NewConnectorAssignment_11_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4230:1: ( ( rule__Delta__NewConnectorAssignment_11_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4231:1: ( rule__Delta__NewConnectorAssignment_11_2 )*
            {
             before(grammarAccess.getDeltaAccess().getNewConnectorAssignment_11_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4232:1: ( rule__Delta__NewConnectorAssignment_11_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4232:2: rule__Delta__NewConnectorAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__NewConnectorAssignment_11_2_in_rule__Delta__Group_11__2__Impl8381);
            	    rule__Delta__NewConnectorAssignment_11_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getNewConnectorAssignment_11_2()); 

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
    // $ANTLR end "rule__Delta__Group_11__2__Impl"


    // $ANTLR start "rule__Delta__Group_11__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4242:1: rule__Delta__Group_11__3 : rule__Delta__Group_11__3__Impl ;
    public final void rule__Delta__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4246:1: ( rule__Delta__Group_11__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4247:2: rule__Delta__Group_11__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_11__3__Impl_in_rule__Delta__Group_11__38412);
            rule__Delta__Group_11__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_11__3"


    // $ANTLR start "rule__Delta__Group_11__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4253:1: rule__Delta__Group_11__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4257:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4258:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4258:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4259:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_11_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_11__3__Impl8440); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_11_3()); 

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
    // $ANTLR end "rule__Delta__Group_11__3__Impl"


    // $ANTLR start "rule__Delta__Group_12__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4280:1: rule__Delta__Group_12__0 : rule__Delta__Group_12__0__Impl rule__Delta__Group_12__1 ;
    public final void rule__Delta__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4284:1: ( rule__Delta__Group_12__0__Impl rule__Delta__Group_12__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4285:2: rule__Delta__Group_12__0__Impl rule__Delta__Group_12__1
            {
            pushFollow(FOLLOW_rule__Delta__Group_12__0__Impl_in_rule__Delta__Group_12__08479);
            rule__Delta__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_12__1_in_rule__Delta__Group_12__08482);
            rule__Delta__Group_12__1();

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
    // $ANTLR end "rule__Delta__Group_12__0"


    // $ANTLR start "rule__Delta__Group_12__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4292:1: rule__Delta__Group_12__0__Impl : ( 'addport' ) ;
    public final void rule__Delta__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4296:1: ( ( 'addport' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4297:1: ( 'addport' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4297:1: ( 'addport' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4298:1: 'addport'
            {
             before(grammarAccess.getDeltaAccess().getAddportKeyword_12_0()); 
            match(input,40,FOLLOW_40_in_rule__Delta__Group_12__0__Impl8510); 
             after(grammarAccess.getDeltaAccess().getAddportKeyword_12_0()); 

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
    // $ANTLR end "rule__Delta__Group_12__0__Impl"


    // $ANTLR start "rule__Delta__Group_12__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4311:1: rule__Delta__Group_12__1 : rule__Delta__Group_12__1__Impl rule__Delta__Group_12__2 ;
    public final void rule__Delta__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4315:1: ( rule__Delta__Group_12__1__Impl rule__Delta__Group_12__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4316:2: rule__Delta__Group_12__1__Impl rule__Delta__Group_12__2
            {
            pushFollow(FOLLOW_rule__Delta__Group_12__1__Impl_in_rule__Delta__Group_12__18541);
            rule__Delta__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_12__2_in_rule__Delta__Group_12__18544);
            rule__Delta__Group_12__2();

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
    // $ANTLR end "rule__Delta__Group_12__1"


    // $ANTLR start "rule__Delta__Group_12__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4323:1: rule__Delta__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Delta__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4327:1: ( ( '{' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4328:1: ( '{' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4328:1: ( '{' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4329:1: '{'
            {
             before(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,20,FOLLOW_20_in_rule__Delta__Group_12__1__Impl8572); 
             after(grammarAccess.getDeltaAccess().getLeftCurlyBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__Delta__Group_12__1__Impl"


    // $ANTLR start "rule__Delta__Group_12__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4342:1: rule__Delta__Group_12__2 : rule__Delta__Group_12__2__Impl rule__Delta__Group_12__3 ;
    public final void rule__Delta__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4346:1: ( rule__Delta__Group_12__2__Impl rule__Delta__Group_12__3 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4347:2: rule__Delta__Group_12__2__Impl rule__Delta__Group_12__3
            {
            pushFollow(FOLLOW_rule__Delta__Group_12__2__Impl_in_rule__Delta__Group_12__28603);
            rule__Delta__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Delta__Group_12__3_in_rule__Delta__Group_12__28606);
            rule__Delta__Group_12__3();

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
    // $ANTLR end "rule__Delta__Group_12__2"


    // $ANTLR start "rule__Delta__Group_12__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4354:1: rule__Delta__Group_12__2__Impl : ( ( rule__Delta__NewPortAssignment_12_2 )* ) ;
    public final void rule__Delta__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4358:1: ( ( ( rule__Delta__NewPortAssignment_12_2 )* ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4359:1: ( ( rule__Delta__NewPortAssignment_12_2 )* )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4359:1: ( ( rule__Delta__NewPortAssignment_12_2 )* )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4360:1: ( rule__Delta__NewPortAssignment_12_2 )*
            {
             before(grammarAccess.getDeltaAccess().getNewPortAssignment_12_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4361:1: ( rule__Delta__NewPortAssignment_12_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=16 && LA35_0<=17)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4361:2: rule__Delta__NewPortAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_rule__Delta__NewPortAssignment_12_2_in_rule__Delta__Group_12__2__Impl8633);
            	    rule__Delta__NewPortAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getDeltaAccess().getNewPortAssignment_12_2()); 

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
    // $ANTLR end "rule__Delta__Group_12__2__Impl"


    // $ANTLR start "rule__Delta__Group_12__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4371:1: rule__Delta__Group_12__3 : rule__Delta__Group_12__3__Impl ;
    public final void rule__Delta__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4375:1: ( rule__Delta__Group_12__3__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4376:2: rule__Delta__Group_12__3__Impl
            {
            pushFollow(FOLLOW_rule__Delta__Group_12__3__Impl_in_rule__Delta__Group_12__38664);
            rule__Delta__Group_12__3__Impl();

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
    // $ANTLR end "rule__Delta__Group_12__3"


    // $ANTLR start "rule__Delta__Group_12__3__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4382:1: rule__Delta__Group_12__3__Impl : ( '}' ) ;
    public final void rule__Delta__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4386:1: ( ( '}' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4387:1: ( '}' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4387:1: ( '}' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4388:1: '}'
            {
             before(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_12_3()); 
            match(input,22,FOLLOW_22_in_rule__Delta__Group_12__3__Impl8692); 
             after(grammarAccess.getDeltaAccess().getRightCurlyBracketKeyword_12_3()); 

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
    // $ANTLR end "rule__Delta__Group_12__3__Impl"


    // $ANTLR start "rule__DeltaAddPort__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4409:1: rule__DeltaAddPort__Group__0 : rule__DeltaAddPort__Group__0__Impl rule__DeltaAddPort__Group__1 ;
    public final void rule__DeltaAddPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4413:1: ( rule__DeltaAddPort__Group__0__Impl rule__DeltaAddPort__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4414:2: rule__DeltaAddPort__Group__0__Impl rule__DeltaAddPort__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__Group__0__Impl_in_rule__DeltaAddPort__Group__08731);
            rule__DeltaAddPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddPort__Group__1_in_rule__DeltaAddPort__Group__08734);
            rule__DeltaAddPort__Group__1();

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
    // $ANTLR end "rule__DeltaAddPort__Group__0"


    // $ANTLR start "rule__DeltaAddPort__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4421:1: rule__DeltaAddPort__Group__0__Impl : ( ( rule__DeltaAddPort__PortAssignment_0 ) ) ;
    public final void rule__DeltaAddPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4425:1: ( ( ( rule__DeltaAddPort__PortAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4426:1: ( ( rule__DeltaAddPort__PortAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4426:1: ( ( rule__DeltaAddPort__PortAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4427:1: ( rule__DeltaAddPort__PortAssignment_0 )
            {
             before(grammarAccess.getDeltaAddPortAccess().getPortAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4428:1: ( rule__DeltaAddPort__PortAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4428:2: rule__DeltaAddPort__PortAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__PortAssignment_0_in_rule__DeltaAddPort__Group__0__Impl8761);
            rule__DeltaAddPort__PortAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddPortAccess().getPortAssignment_0()); 

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
    // $ANTLR end "rule__DeltaAddPort__Group__0__Impl"


    // $ANTLR start "rule__DeltaAddPort__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4438:1: rule__DeltaAddPort__Group__1 : rule__DeltaAddPort__Group__1__Impl rule__DeltaAddPort__Group__2 ;
    public final void rule__DeltaAddPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4442:1: ( rule__DeltaAddPort__Group__1__Impl rule__DeltaAddPort__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4443:2: rule__DeltaAddPort__Group__1__Impl rule__DeltaAddPort__Group__2
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__Group__1__Impl_in_rule__DeltaAddPort__Group__18791);
            rule__DeltaAddPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddPort__Group__2_in_rule__DeltaAddPort__Group__18794);
            rule__DeltaAddPort__Group__2();

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
    // $ANTLR end "rule__DeltaAddPort__Group__1"


    // $ANTLR start "rule__DeltaAddPort__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4450:1: rule__DeltaAddPort__Group__1__Impl : ( 'in' ) ;
    public final void rule__DeltaAddPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4454:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4455:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4455:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4456:1: 'in'
            {
             before(grammarAccess.getDeltaAddPortAccess().getInKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DeltaAddPort__Group__1__Impl8822); 
             after(grammarAccess.getDeltaAddPortAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__DeltaAddPort__Group__1__Impl"


    // $ANTLR start "rule__DeltaAddPort__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4469:1: rule__DeltaAddPort__Group__2 : rule__DeltaAddPort__Group__2__Impl ;
    public final void rule__DeltaAddPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4473:1: ( rule__DeltaAddPort__Group__2__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4474:2: rule__DeltaAddPort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__Group__2__Impl_in_rule__DeltaAddPort__Group__28853);
            rule__DeltaAddPort__Group__2__Impl();

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
    // $ANTLR end "rule__DeltaAddPort__Group__2"


    // $ANTLR start "rule__DeltaAddPort__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4480:1: rule__DeltaAddPort__Group__2__Impl : ( ( rule__DeltaAddPort__PortComponentAssignment_2 ) ) ;
    public final void rule__DeltaAddPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4484:1: ( ( ( rule__DeltaAddPort__PortComponentAssignment_2 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4485:1: ( ( rule__DeltaAddPort__PortComponentAssignment_2 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4485:1: ( ( rule__DeltaAddPort__PortComponentAssignment_2 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4486:1: ( rule__DeltaAddPort__PortComponentAssignment_2 )
            {
             before(grammarAccess.getDeltaAddPortAccess().getPortComponentAssignment_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4487:1: ( rule__DeltaAddPort__PortComponentAssignment_2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4487:2: rule__DeltaAddPort__PortComponentAssignment_2
            {
            pushFollow(FOLLOW_rule__DeltaAddPort__PortComponentAssignment_2_in_rule__DeltaAddPort__Group__2__Impl8880);
            rule__DeltaAddPort__PortComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddPortAccess().getPortComponentAssignment_2()); 

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
    // $ANTLR end "rule__DeltaAddPort__Group__2__Impl"


    // $ANTLR start "rule__DeltaRemovePort__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4503:1: rule__DeltaRemovePort__Group__0 : rule__DeltaRemovePort__Group__0__Impl rule__DeltaRemovePort__Group__1 ;
    public final void rule__DeltaRemovePort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4507:1: ( rule__DeltaRemovePort__Group__0__Impl rule__DeltaRemovePort__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4508:2: rule__DeltaRemovePort__Group__0__Impl rule__DeltaRemovePort__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__0__Impl_in_rule__DeltaRemovePort__Group__08916);
            rule__DeltaRemovePort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__1_in_rule__DeltaRemovePort__Group__08919);
            rule__DeltaRemovePort__Group__1();

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
    // $ANTLR end "rule__DeltaRemovePort__Group__0"


    // $ANTLR start "rule__DeltaRemovePort__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4515:1: rule__DeltaRemovePort__Group__0__Impl : ( ( rule__DeltaRemovePort__PortNameAssignment_0 ) ) ;
    public final void rule__DeltaRemovePort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4519:1: ( ( ( rule__DeltaRemovePort__PortNameAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4520:1: ( ( rule__DeltaRemovePort__PortNameAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4520:1: ( ( rule__DeltaRemovePort__PortNameAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4521:1: ( rule__DeltaRemovePort__PortNameAssignment_0 )
            {
             before(grammarAccess.getDeltaRemovePortAccess().getPortNameAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4522:1: ( rule__DeltaRemovePort__PortNameAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4522:2: rule__DeltaRemovePort__PortNameAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__PortNameAssignment_0_in_rule__DeltaRemovePort__Group__0__Impl8946);
            rule__DeltaRemovePort__PortNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemovePortAccess().getPortNameAssignment_0()); 

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
    // $ANTLR end "rule__DeltaRemovePort__Group__0__Impl"


    // $ANTLR start "rule__DeltaRemovePort__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4532:1: rule__DeltaRemovePort__Group__1 : rule__DeltaRemovePort__Group__1__Impl rule__DeltaRemovePort__Group__2 ;
    public final void rule__DeltaRemovePort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4536:1: ( rule__DeltaRemovePort__Group__1__Impl rule__DeltaRemovePort__Group__2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4537:2: rule__DeltaRemovePort__Group__1__Impl rule__DeltaRemovePort__Group__2
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__1__Impl_in_rule__DeltaRemovePort__Group__18976);
            rule__DeltaRemovePort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__2_in_rule__DeltaRemovePort__Group__18979);
            rule__DeltaRemovePort__Group__2();

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
    // $ANTLR end "rule__DeltaRemovePort__Group__1"


    // $ANTLR start "rule__DeltaRemovePort__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4544:1: rule__DeltaRemovePort__Group__1__Impl : ( 'in' ) ;
    public final void rule__DeltaRemovePort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4548:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4549:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4549:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4550:1: 'in'
            {
             before(grammarAccess.getDeltaRemovePortAccess().getInKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DeltaRemovePort__Group__1__Impl9007); 
             after(grammarAccess.getDeltaRemovePortAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__DeltaRemovePort__Group__1__Impl"


    // $ANTLR start "rule__DeltaRemovePort__Group__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4563:1: rule__DeltaRemovePort__Group__2 : rule__DeltaRemovePort__Group__2__Impl ;
    public final void rule__DeltaRemovePort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4567:1: ( rule__DeltaRemovePort__Group__2__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4568:2: rule__DeltaRemovePort__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__Group__2__Impl_in_rule__DeltaRemovePort__Group__29038);
            rule__DeltaRemovePort__Group__2__Impl();

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
    // $ANTLR end "rule__DeltaRemovePort__Group__2"


    // $ANTLR start "rule__DeltaRemovePort__Group__2__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4574:1: rule__DeltaRemovePort__Group__2__Impl : ( ( rule__DeltaRemovePort__PortComponentAssignment_2 ) ) ;
    public final void rule__DeltaRemovePort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4578:1: ( ( ( rule__DeltaRemovePort__PortComponentAssignment_2 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4579:1: ( ( rule__DeltaRemovePort__PortComponentAssignment_2 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4579:1: ( ( rule__DeltaRemovePort__PortComponentAssignment_2 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4580:1: ( rule__DeltaRemovePort__PortComponentAssignment_2 )
            {
             before(grammarAccess.getDeltaRemovePortAccess().getPortComponentAssignment_2()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4581:1: ( rule__DeltaRemovePort__PortComponentAssignment_2 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4581:2: rule__DeltaRemovePort__PortComponentAssignment_2
            {
            pushFollow(FOLLOW_rule__DeltaRemovePort__PortComponentAssignment_2_in_rule__DeltaRemovePort__Group__2__Impl9065);
            rule__DeltaRemovePort__PortComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemovePortAccess().getPortComponentAssignment_2()); 

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
    // $ANTLR end "rule__DeltaRemovePort__Group__2__Impl"


    // $ANTLR start "rule__DeltaAddComponent__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4597:1: rule__DeltaAddComponent__Group__0 : rule__DeltaAddComponent__Group__0__Impl rule__DeltaAddComponent__Group__1 ;
    public final void rule__DeltaAddComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4601:1: ( rule__DeltaAddComponent__Group__0__Impl rule__DeltaAddComponent__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4602:2: rule__DeltaAddComponent__Group__0__Impl rule__DeltaAddComponent__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__Group__0__Impl_in_rule__DeltaAddComponent__Group__09101);
            rule__DeltaAddComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddComponent__Group__1_in_rule__DeltaAddComponent__Group__09104);
            rule__DeltaAddComponent__Group__1();

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
    // $ANTLR end "rule__DeltaAddComponent__Group__0"


    // $ANTLR start "rule__DeltaAddComponent__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4609:1: rule__DeltaAddComponent__Group__0__Impl : ( ( rule__DeltaAddComponent__ComponentAssignment_0 ) ) ;
    public final void rule__DeltaAddComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4613:1: ( ( ( rule__DeltaAddComponent__ComponentAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4614:1: ( ( rule__DeltaAddComponent__ComponentAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4614:1: ( ( rule__DeltaAddComponent__ComponentAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4615:1: ( rule__DeltaAddComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getDeltaAddComponentAccess().getComponentAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4616:1: ( rule__DeltaAddComponent__ComponentAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4616:2: rule__DeltaAddComponent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__ComponentAssignment_0_in_rule__DeltaAddComponent__Group__0__Impl9131);
            rule__DeltaAddComponent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddComponentAccess().getComponentAssignment_0()); 

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
    // $ANTLR end "rule__DeltaAddComponent__Group__0__Impl"


    // $ANTLR start "rule__DeltaAddComponent__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4626:1: rule__DeltaAddComponent__Group__1 : rule__DeltaAddComponent__Group__1__Impl ;
    public final void rule__DeltaAddComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4630:1: ( rule__DeltaAddComponent__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4631:2: rule__DeltaAddComponent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__Group__1__Impl_in_rule__DeltaAddComponent__Group__19161);
            rule__DeltaAddComponent__Group__1__Impl();

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
    // $ANTLR end "rule__DeltaAddComponent__Group__1"


    // $ANTLR start "rule__DeltaAddComponent__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4637:1: rule__DeltaAddComponent__Group__1__Impl : ( ( rule__DeltaAddComponent__Group_1__0 )? ) ;
    public final void rule__DeltaAddComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4641:1: ( ( ( rule__DeltaAddComponent__Group_1__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4642:1: ( ( rule__DeltaAddComponent__Group_1__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4642:1: ( ( rule__DeltaAddComponent__Group_1__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4643:1: ( rule__DeltaAddComponent__Group_1__0 )?
            {
             before(grammarAccess.getDeltaAddComponentAccess().getGroup_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4644:1: ( rule__DeltaAddComponent__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4644:2: rule__DeltaAddComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeltaAddComponent__Group_1__0_in_rule__DeltaAddComponent__Group__1__Impl9188);
                    rule__DeltaAddComponent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAddComponentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeltaAddComponent__Group__1__Impl"


    // $ANTLR start "rule__DeltaAddComponent__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4658:1: rule__DeltaAddComponent__Group_1__0 : rule__DeltaAddComponent__Group_1__0__Impl rule__DeltaAddComponent__Group_1__1 ;
    public final void rule__DeltaAddComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4662:1: ( rule__DeltaAddComponent__Group_1__0__Impl rule__DeltaAddComponent__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4663:2: rule__DeltaAddComponent__Group_1__0__Impl rule__DeltaAddComponent__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__Group_1__0__Impl_in_rule__DeltaAddComponent__Group_1__09223);
            rule__DeltaAddComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddComponent__Group_1__1_in_rule__DeltaAddComponent__Group_1__09226);
            rule__DeltaAddComponent__Group_1__1();

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
    // $ANTLR end "rule__DeltaAddComponent__Group_1__0"


    // $ANTLR start "rule__DeltaAddComponent__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4670:1: rule__DeltaAddComponent__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__DeltaAddComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4674:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4675:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4675:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4676:1: 'in'
            {
             before(grammarAccess.getDeltaAddComponentAccess().getInKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__DeltaAddComponent__Group_1__0__Impl9254); 
             after(grammarAccess.getDeltaAddComponentAccess().getInKeyword_1_0()); 

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
    // $ANTLR end "rule__DeltaAddComponent__Group_1__0__Impl"


    // $ANTLR start "rule__DeltaAddComponent__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4689:1: rule__DeltaAddComponent__Group_1__1 : rule__DeltaAddComponent__Group_1__1__Impl ;
    public final void rule__DeltaAddComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4693:1: ( rule__DeltaAddComponent__Group_1__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4694:2: rule__DeltaAddComponent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__Group_1__1__Impl_in_rule__DeltaAddComponent__Group_1__19285);
            rule__DeltaAddComponent__Group_1__1__Impl();

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
    // $ANTLR end "rule__DeltaAddComponent__Group_1__1"


    // $ANTLR start "rule__DeltaAddComponent__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4700:1: rule__DeltaAddComponent__Group_1__1__Impl : ( ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 ) ) ;
    public final void rule__DeltaAddComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4704:1: ( ( ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4705:1: ( ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4705:1: ( ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4706:1: ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 )
            {
             before(grammarAccess.getDeltaAddComponentAccess().getSuperComponentAssignment_1_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4707:1: ( rule__DeltaAddComponent__SuperComponentAssignment_1_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4707:2: rule__DeltaAddComponent__SuperComponentAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DeltaAddComponent__SuperComponentAssignment_1_1_in_rule__DeltaAddComponent__Group_1__1__Impl9312);
            rule__DeltaAddComponent__SuperComponentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddComponentAccess().getSuperComponentAssignment_1_1()); 

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
    // $ANTLR end "rule__DeltaAddComponent__Group_1__1__Impl"


    // $ANTLR start "rule__DeltaRemoveComponent__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4721:1: rule__DeltaRemoveComponent__Group__0 : rule__DeltaRemoveComponent__Group__0__Impl rule__DeltaRemoveComponent__Group__1 ;
    public final void rule__DeltaRemoveComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4725:1: ( rule__DeltaRemoveComponent__Group__0__Impl rule__DeltaRemoveComponent__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4726:2: rule__DeltaRemoveComponent__Group__0__Impl rule__DeltaRemoveComponent__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group__0__Impl_in_rule__DeltaRemoveComponent__Group__09346);
            rule__DeltaRemoveComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group__1_in_rule__DeltaRemoveComponent__Group__09349);
            rule__DeltaRemoveComponent__Group__1();

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group__0"


    // $ANTLR start "rule__DeltaRemoveComponent__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4733:1: rule__DeltaRemoveComponent__Group__0__Impl : ( ( rule__DeltaRemoveComponent__ComponentAssignment_0 ) ) ;
    public final void rule__DeltaRemoveComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4737:1: ( ( ( rule__DeltaRemoveComponent__ComponentAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4738:1: ( ( rule__DeltaRemoveComponent__ComponentAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4738:1: ( ( rule__DeltaRemoveComponent__ComponentAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4739:1: ( rule__DeltaRemoveComponent__ComponentAssignment_0 )
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getComponentAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4740:1: ( rule__DeltaRemoveComponent__ComponentAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4740:2: rule__DeltaRemoveComponent__ComponentAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__ComponentAssignment_0_in_rule__DeltaRemoveComponent__Group__0__Impl9376);
            rule__DeltaRemoveComponent__ComponentAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveComponentAccess().getComponentAssignment_0()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group__0__Impl"


    // $ANTLR start "rule__DeltaRemoveComponent__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4750:1: rule__DeltaRemoveComponent__Group__1 : rule__DeltaRemoveComponent__Group__1__Impl ;
    public final void rule__DeltaRemoveComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4754:1: ( rule__DeltaRemoveComponent__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4755:2: rule__DeltaRemoveComponent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group__1__Impl_in_rule__DeltaRemoveComponent__Group__19406);
            rule__DeltaRemoveComponent__Group__1__Impl();

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group__1"


    // $ANTLR start "rule__DeltaRemoveComponent__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4761:1: rule__DeltaRemoveComponent__Group__1__Impl : ( ( rule__DeltaRemoveComponent__Group_1__0 )? ) ;
    public final void rule__DeltaRemoveComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4765:1: ( ( ( rule__DeltaRemoveComponent__Group_1__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4766:1: ( ( rule__DeltaRemoveComponent__Group_1__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4766:1: ( ( rule__DeltaRemoveComponent__Group_1__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4767:1: ( rule__DeltaRemoveComponent__Group_1__0 )?
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getGroup_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4768:1: ( rule__DeltaRemoveComponent__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4768:2: rule__DeltaRemoveComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group_1__0_in_rule__DeltaRemoveComponent__Group__1__Impl9433);
                    rule__DeltaRemoveComponent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaRemoveComponentAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group__1__Impl"


    // $ANTLR start "rule__DeltaRemoveComponent__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4782:1: rule__DeltaRemoveComponent__Group_1__0 : rule__DeltaRemoveComponent__Group_1__0__Impl rule__DeltaRemoveComponent__Group_1__1 ;
    public final void rule__DeltaRemoveComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4786:1: ( rule__DeltaRemoveComponent__Group_1__0__Impl rule__DeltaRemoveComponent__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4787:2: rule__DeltaRemoveComponent__Group_1__0__Impl rule__DeltaRemoveComponent__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group_1__0__Impl_in_rule__DeltaRemoveComponent__Group_1__09468);
            rule__DeltaRemoveComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group_1__1_in_rule__DeltaRemoveComponent__Group_1__09471);
            rule__DeltaRemoveComponent__Group_1__1();

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group_1__0"


    // $ANTLR start "rule__DeltaRemoveComponent__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4794:1: rule__DeltaRemoveComponent__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__DeltaRemoveComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4798:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4799:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4799:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4800:1: 'in'
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getInKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__DeltaRemoveComponent__Group_1__0__Impl9499); 
             after(grammarAccess.getDeltaRemoveComponentAccess().getInKeyword_1_0()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group_1__0__Impl"


    // $ANTLR start "rule__DeltaRemoveComponent__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4813:1: rule__DeltaRemoveComponent__Group_1__1 : rule__DeltaRemoveComponent__Group_1__1__Impl ;
    public final void rule__DeltaRemoveComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4817:1: ( rule__DeltaRemoveComponent__Group_1__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4818:2: rule__DeltaRemoveComponent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__Group_1__1__Impl_in_rule__DeltaRemoveComponent__Group_1__19530);
            rule__DeltaRemoveComponent__Group_1__1__Impl();

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group_1__1"


    // $ANTLR start "rule__DeltaRemoveComponent__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4824:1: rule__DeltaRemoveComponent__Group_1__1__Impl : ( ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 ) ) ;
    public final void rule__DeltaRemoveComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4828:1: ( ( ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4829:1: ( ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4829:1: ( ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4830:1: ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 )
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getSuperComponentAssignment_1_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4831:1: ( rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4831:2: rule__DeltaRemoveComponent__SuperComponentAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveComponent__SuperComponentAssignment_1_1_in_rule__DeltaRemoveComponent__Group_1__1__Impl9557);
            rule__DeltaRemoveComponent__SuperComponentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveComponentAccess().getSuperComponentAssignment_1_1()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__Group_1__1__Impl"


    // $ANTLR start "rule__DeltaAddConnector__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4845:1: rule__DeltaAddConnector__Group__0 : rule__DeltaAddConnector__Group__0__Impl rule__DeltaAddConnector__Group__1 ;
    public final void rule__DeltaAddConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4849:1: ( rule__DeltaAddConnector__Group__0__Impl rule__DeltaAddConnector__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4850:2: rule__DeltaAddConnector__Group__0__Impl rule__DeltaAddConnector__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__Group__0__Impl_in_rule__DeltaAddConnector__Group__09591);
            rule__DeltaAddConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddConnector__Group__1_in_rule__DeltaAddConnector__Group__09594);
            rule__DeltaAddConnector__Group__1();

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
    // $ANTLR end "rule__DeltaAddConnector__Group__0"


    // $ANTLR start "rule__DeltaAddConnector__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4857:1: rule__DeltaAddConnector__Group__0__Impl : ( ( rule__DeltaAddConnector__ConnectorAssignment_0 ) ) ;
    public final void rule__DeltaAddConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4861:1: ( ( ( rule__DeltaAddConnector__ConnectorAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4862:1: ( ( rule__DeltaAddConnector__ConnectorAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4862:1: ( ( rule__DeltaAddConnector__ConnectorAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4863:1: ( rule__DeltaAddConnector__ConnectorAssignment_0 )
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getConnectorAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4864:1: ( rule__DeltaAddConnector__ConnectorAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4864:2: rule__DeltaAddConnector__ConnectorAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__ConnectorAssignment_0_in_rule__DeltaAddConnector__Group__0__Impl9621);
            rule__DeltaAddConnector__ConnectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddConnectorAccess().getConnectorAssignment_0()); 

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
    // $ANTLR end "rule__DeltaAddConnector__Group__0__Impl"


    // $ANTLR start "rule__DeltaAddConnector__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4874:1: rule__DeltaAddConnector__Group__1 : rule__DeltaAddConnector__Group__1__Impl ;
    public final void rule__DeltaAddConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4878:1: ( rule__DeltaAddConnector__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4879:2: rule__DeltaAddConnector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__Group__1__Impl_in_rule__DeltaAddConnector__Group__19651);
            rule__DeltaAddConnector__Group__1__Impl();

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
    // $ANTLR end "rule__DeltaAddConnector__Group__1"


    // $ANTLR start "rule__DeltaAddConnector__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4885:1: rule__DeltaAddConnector__Group__1__Impl : ( ( rule__DeltaAddConnector__Group_1__0 )? ) ;
    public final void rule__DeltaAddConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4889:1: ( ( ( rule__DeltaAddConnector__Group_1__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4890:1: ( ( rule__DeltaAddConnector__Group_1__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4890:1: ( ( rule__DeltaAddConnector__Group_1__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4891:1: ( rule__DeltaAddConnector__Group_1__0 )?
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getGroup_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4892:1: ( rule__DeltaAddConnector__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4892:2: rule__DeltaAddConnector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeltaAddConnector__Group_1__0_in_rule__DeltaAddConnector__Group__1__Impl9678);
                    rule__DeltaAddConnector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaAddConnectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeltaAddConnector__Group__1__Impl"


    // $ANTLR start "rule__DeltaAddConnector__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4906:1: rule__DeltaAddConnector__Group_1__0 : rule__DeltaAddConnector__Group_1__0__Impl rule__DeltaAddConnector__Group_1__1 ;
    public final void rule__DeltaAddConnector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4910:1: ( rule__DeltaAddConnector__Group_1__0__Impl rule__DeltaAddConnector__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4911:2: rule__DeltaAddConnector__Group_1__0__Impl rule__DeltaAddConnector__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__Group_1__0__Impl_in_rule__DeltaAddConnector__Group_1__09713);
            rule__DeltaAddConnector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaAddConnector__Group_1__1_in_rule__DeltaAddConnector__Group_1__09716);
            rule__DeltaAddConnector__Group_1__1();

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
    // $ANTLR end "rule__DeltaAddConnector__Group_1__0"


    // $ANTLR start "rule__DeltaAddConnector__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4918:1: rule__DeltaAddConnector__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__DeltaAddConnector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4922:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4923:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4923:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4924:1: 'in'
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getInKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__DeltaAddConnector__Group_1__0__Impl9744); 
             after(grammarAccess.getDeltaAddConnectorAccess().getInKeyword_1_0()); 

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
    // $ANTLR end "rule__DeltaAddConnector__Group_1__0__Impl"


    // $ANTLR start "rule__DeltaAddConnector__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4937:1: rule__DeltaAddConnector__Group_1__1 : rule__DeltaAddConnector__Group_1__1__Impl ;
    public final void rule__DeltaAddConnector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4941:1: ( rule__DeltaAddConnector__Group_1__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4942:2: rule__DeltaAddConnector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__Group_1__1__Impl_in_rule__DeltaAddConnector__Group_1__19775);
            rule__DeltaAddConnector__Group_1__1__Impl();

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
    // $ANTLR end "rule__DeltaAddConnector__Group_1__1"


    // $ANTLR start "rule__DeltaAddConnector__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4948:1: rule__DeltaAddConnector__Group_1__1__Impl : ( ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 ) ) ;
    public final void rule__DeltaAddConnector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4952:1: ( ( ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4953:1: ( ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4953:1: ( ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4954:1: ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 )
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getSuperComponentAssignment_1_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4955:1: ( rule__DeltaAddConnector__SuperComponentAssignment_1_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4955:2: rule__DeltaAddConnector__SuperComponentAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DeltaAddConnector__SuperComponentAssignment_1_1_in_rule__DeltaAddConnector__Group_1__1__Impl9802);
            rule__DeltaAddConnector__SuperComponentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAddConnectorAccess().getSuperComponentAssignment_1_1()); 

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
    // $ANTLR end "rule__DeltaAddConnector__Group_1__1__Impl"


    // $ANTLR start "rule__DeltaRemoveConnector__Group__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4969:1: rule__DeltaRemoveConnector__Group__0 : rule__DeltaRemoveConnector__Group__0__Impl rule__DeltaRemoveConnector__Group__1 ;
    public final void rule__DeltaRemoveConnector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4973:1: ( rule__DeltaRemoveConnector__Group__0__Impl rule__DeltaRemoveConnector__Group__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4974:2: rule__DeltaRemoveConnector__Group__0__Impl rule__DeltaRemoveConnector__Group__1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group__0__Impl_in_rule__DeltaRemoveConnector__Group__09836);
            rule__DeltaRemoveConnector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group__1_in_rule__DeltaRemoveConnector__Group__09839);
            rule__DeltaRemoveConnector__Group__1();

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group__0"


    // $ANTLR start "rule__DeltaRemoveConnector__Group__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4981:1: rule__DeltaRemoveConnector__Group__0__Impl : ( ( rule__DeltaRemoveConnector__ConnectorAssignment_0 ) ) ;
    public final void rule__DeltaRemoveConnector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4985:1: ( ( ( rule__DeltaRemoveConnector__ConnectorAssignment_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4986:1: ( ( rule__DeltaRemoveConnector__ConnectorAssignment_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4986:1: ( ( rule__DeltaRemoveConnector__ConnectorAssignment_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4987:1: ( rule__DeltaRemoveConnector__ConnectorAssignment_0 )
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getConnectorAssignment_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4988:1: ( rule__DeltaRemoveConnector__ConnectorAssignment_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4988:2: rule__DeltaRemoveConnector__ConnectorAssignment_0
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__ConnectorAssignment_0_in_rule__DeltaRemoveConnector__Group__0__Impl9866);
            rule__DeltaRemoveConnector__ConnectorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveConnectorAccess().getConnectorAssignment_0()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group__0__Impl"


    // $ANTLR start "rule__DeltaRemoveConnector__Group__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:4998:1: rule__DeltaRemoveConnector__Group__1 : rule__DeltaRemoveConnector__Group__1__Impl ;
    public final void rule__DeltaRemoveConnector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5002:1: ( rule__DeltaRemoveConnector__Group__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5003:2: rule__DeltaRemoveConnector__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group__1__Impl_in_rule__DeltaRemoveConnector__Group__19896);
            rule__DeltaRemoveConnector__Group__1__Impl();

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group__1"


    // $ANTLR start "rule__DeltaRemoveConnector__Group__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5009:1: rule__DeltaRemoveConnector__Group__1__Impl : ( ( rule__DeltaRemoveConnector__Group_1__0 )? ) ;
    public final void rule__DeltaRemoveConnector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5013:1: ( ( ( rule__DeltaRemoveConnector__Group_1__0 )? ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5014:1: ( ( rule__DeltaRemoveConnector__Group_1__0 )? )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5014:1: ( ( rule__DeltaRemoveConnector__Group_1__0 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5015:1: ( rule__DeltaRemoveConnector__Group_1__0 )?
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getGroup_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5016:1: ( rule__DeltaRemoveConnector__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5016:2: rule__DeltaRemoveConnector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group_1__0_in_rule__DeltaRemoveConnector__Group__1__Impl9923);
                    rule__DeltaRemoveConnector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeltaRemoveConnectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group__1__Impl"


    // $ANTLR start "rule__DeltaRemoveConnector__Group_1__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5030:1: rule__DeltaRemoveConnector__Group_1__0 : rule__DeltaRemoveConnector__Group_1__0__Impl rule__DeltaRemoveConnector__Group_1__1 ;
    public final void rule__DeltaRemoveConnector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5034:1: ( rule__DeltaRemoveConnector__Group_1__0__Impl rule__DeltaRemoveConnector__Group_1__1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5035:2: rule__DeltaRemoveConnector__Group_1__0__Impl rule__DeltaRemoveConnector__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group_1__0__Impl_in_rule__DeltaRemoveConnector__Group_1__09958);
            rule__DeltaRemoveConnector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group_1__1_in_rule__DeltaRemoveConnector__Group_1__09961);
            rule__DeltaRemoveConnector__Group_1__1();

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group_1__0"


    // $ANTLR start "rule__DeltaRemoveConnector__Group_1__0__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5042:1: rule__DeltaRemoveConnector__Group_1__0__Impl : ( 'in' ) ;
    public final void rule__DeltaRemoveConnector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5046:1: ( ( 'in' ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5047:1: ( 'in' )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5047:1: ( 'in' )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5048:1: 'in'
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getInKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__DeltaRemoveConnector__Group_1__0__Impl9989); 
             after(grammarAccess.getDeltaRemoveConnectorAccess().getInKeyword_1_0()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group_1__0__Impl"


    // $ANTLR start "rule__DeltaRemoveConnector__Group_1__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5061:1: rule__DeltaRemoveConnector__Group_1__1 : rule__DeltaRemoveConnector__Group_1__1__Impl ;
    public final void rule__DeltaRemoveConnector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5065:1: ( rule__DeltaRemoveConnector__Group_1__1__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5066:2: rule__DeltaRemoveConnector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__Group_1__1__Impl_in_rule__DeltaRemoveConnector__Group_1__110020);
            rule__DeltaRemoveConnector__Group_1__1__Impl();

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group_1__1"


    // $ANTLR start "rule__DeltaRemoveConnector__Group_1__1__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5072:1: rule__DeltaRemoveConnector__Group_1__1__Impl : ( ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 ) ) ;
    public final void rule__DeltaRemoveConnector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5076:1: ( ( ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5077:1: ( ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5077:1: ( ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5078:1: ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 )
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getSuperComponentAssignment_1_1()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5079:1: ( rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5079:2: rule__DeltaRemoveConnector__SuperComponentAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DeltaRemoveConnector__SuperComponentAssignment_1_1_in_rule__DeltaRemoveConnector__Group_1__1__Impl10047);
            rule__DeltaRemoveConnector__SuperComponentAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeltaRemoveConnectorAccess().getSuperComponentAssignment_1_1()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__Group_1__1__Impl"


    // $ANTLR start "rule__Deltarx__UnorderedGroup"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5094:1: rule__Deltarx__UnorderedGroup : rule__Deltarx__UnorderedGroup__0 {...}?;
    public final void rule__Deltarx__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5099:1: ( rule__Deltarx__UnorderedGroup__0 {...}?)
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5100:2: rule__Deltarx__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__0_in_rule__Deltarx__UnorderedGroup10082);
            rule__Deltarx__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeltarxAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeltarxAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deltarx__UnorderedGroup"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__Impl"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5111:1: rule__Deltarx__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Deltarx__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5116:1: ( ( ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5117:3: ( ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5117:3: ( ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt40=5;
            int LA40_0 = input.LA(1);

            if ( LA40_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                alt40=2;
            }
            else if ( LA40_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                alt40=3;
            }
            else if ( LA40_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                alt40=4;
            }
            else if ( LA40_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                alt40=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5119:4: ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5119:4: ({...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5120:5: {...}? => ( ( ( rule__Deltarx__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5120:102: ( ( ( rule__Deltarx__Group_0__0 ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5121:6: ( ( rule__Deltarx__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5127:6: ( ( rule__Deltarx__Group_0__0 ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5129:7: ( rule__Deltarx__Group_0__0 )
                    {
                     before(grammarAccess.getDeltarxAccess().getGroup_0()); 
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5130:7: ( rule__Deltarx__Group_0__0 )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5130:8: rule__Deltarx__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Deltarx__Group_0__0_in_rule__Deltarx__UnorderedGroup__Impl10171);
                    rule__Deltarx__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeltarxAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5136:4: ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5136:4: ({...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5137:5: {...}? => ( ( ( rule__Deltarx__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5137:102: ( ( ( rule__Deltarx__Group_1__0 ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5138:6: ( ( rule__Deltarx__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5144:6: ( ( rule__Deltarx__Group_1__0 ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5146:7: ( rule__Deltarx__Group_1__0 )
                    {
                     before(grammarAccess.getDeltarxAccess().getGroup_1()); 
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5147:7: ( rule__Deltarx__Group_1__0 )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5147:8: rule__Deltarx__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Deltarx__Group_1__0_in_rule__Deltarx__UnorderedGroup__Impl10262);
                    rule__Deltarx__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeltarxAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5153:4: ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5153:4: ({...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5154:5: {...}? => ( ( ( rule__Deltarx__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5154:102: ( ( ( rule__Deltarx__Group_2__0 ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5155:6: ( ( rule__Deltarx__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5161:6: ( ( rule__Deltarx__Group_2__0 ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5163:7: ( rule__Deltarx__Group_2__0 )
                    {
                     before(grammarAccess.getDeltarxAccess().getGroup_2()); 
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5164:7: ( rule__Deltarx__Group_2__0 )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5164:8: rule__Deltarx__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Deltarx__Group_2__0_in_rule__Deltarx__UnorderedGroup__Impl10353);
                    rule__Deltarx__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeltarxAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5170:4: ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5170:4: ({...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5171:5: {...}? => ( ( ( rule__Deltarx__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3)");
                    }
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5171:102: ( ( ( rule__Deltarx__Group_3__0 ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5172:6: ( ( rule__Deltarx__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5178:6: ( ( rule__Deltarx__Group_3__0 ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5180:7: ( rule__Deltarx__Group_3__0 )
                    {
                     before(grammarAccess.getDeltarxAccess().getGroup_3()); 
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5181:7: ( rule__Deltarx__Group_3__0 )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5181:8: rule__Deltarx__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Deltarx__Group_3__0_in_rule__Deltarx__UnorderedGroup__Impl10444);
                    rule__Deltarx__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeltarxAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5187:4: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5187:4: ({...}? => ( ( ( '}' ) ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5188:5: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Deltarx__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4)");
                    }
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5188:102: ( ( ( '}' ) ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5189:6: ( ( '}' ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5195:6: ( ( '}' ) )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5197:7: ( '}' )
                    {
                     before(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()); 
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5198:7: ( '}' )
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5199:2: '}'
                    {
                    match(input,22,FOLLOW_22_in_rule__Deltarx__UnorderedGroup__Impl10537); 

                    }

                     after(grammarAccess.getDeltarxAccess().getRightCurlyBracketKeyword_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeltarxAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deltarx__UnorderedGroup__Impl"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5215:1: rule__Deltarx__UnorderedGroup__0 : rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__1 )? ;
    public final void rule__Deltarx__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5219:1: ( rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__1 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5220:2: rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__010598);
            rule__Deltarx__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5221:2: ( rule__Deltarx__UnorderedGroup__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                alt41=1;
            }
            else if ( LA41_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5221:2: rule__Deltarx__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__1_in_rule__Deltarx__UnorderedGroup__010601);
                    rule__Deltarx__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Deltarx__UnorderedGroup__0"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5228:1: rule__Deltarx__UnorderedGroup__1 : rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__2 )? ;
    public final void rule__Deltarx__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5232:1: ( rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__2 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5233:2: rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__110626);
            rule__Deltarx__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5234:2: ( rule__Deltarx__UnorderedGroup__2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5234:2: rule__Deltarx__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__2_in_rule__Deltarx__UnorderedGroup__110629);
                    rule__Deltarx__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Deltarx__UnorderedGroup__1"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5241:1: rule__Deltarx__UnorderedGroup__2 : rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__3 )? ;
    public final void rule__Deltarx__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5245:1: ( rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__3 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5246:2: rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__210654);
            rule__Deltarx__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5247:2: ( rule__Deltarx__UnorderedGroup__3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5247:2: rule__Deltarx__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__3_in_rule__Deltarx__UnorderedGroup__210657);
                    rule__Deltarx__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Deltarx__UnorderedGroup__2"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5254:1: rule__Deltarx__UnorderedGroup__3 : rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__4 )? ;
    public final void rule__Deltarx__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5258:1: ( rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__4 )? )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5259:2: rule__Deltarx__UnorderedGroup__Impl ( rule__Deltarx__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__310682);
            rule__Deltarx__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5260:2: ( rule__Deltarx__UnorderedGroup__4 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeltarxAccess().getUnorderedGroup(), 4) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5260:2: rule__Deltarx__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__4_in_rule__Deltarx__UnorderedGroup__310685);
                    rule__Deltarx__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Deltarx__UnorderedGroup__3"


    // $ANTLR start "rule__Deltarx__UnorderedGroup__4"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5267:1: rule__Deltarx__UnorderedGroup__4 : rule__Deltarx__UnorderedGroup__Impl ;
    public final void rule__Deltarx__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5271:1: ( rule__Deltarx__UnorderedGroup__Impl )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5272:2: rule__Deltarx__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__410710);
            rule__Deltarx__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Deltarx__UnorderedGroup__4"


    // $ANTLR start "rule__Deltarx__NameAssignment_0_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5289:1: rule__Deltarx__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Deltarx__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5293:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5294:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5294:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5295:1: RULE_ID
            {
             before(grammarAccess.getDeltarxAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Deltarx__NameAssignment_0_110748); 
             after(grammarAccess.getDeltarxAccess().getNameIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Deltarx__NameAssignment_0_1"


    // $ANTLR start "rule__Deltarx__FmdirAssignment_0_3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5304:1: rule__Deltarx__FmdirAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Deltarx__FmdirAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5308:1: ( ( RULE_STRING ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5309:1: ( RULE_STRING )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5309:1: ( RULE_STRING )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5310:1: RULE_STRING
            {
             before(grammarAccess.getDeltarxAccess().getFmdirSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Deltarx__FmdirAssignment_0_310779); 
             after(grammarAccess.getDeltarxAccess().getFmdirSTRINGTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Deltarx__FmdirAssignment_0_3"


    // $ANTLR start "rule__Deltarx__SignalsAssignment_0_5_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5319:1: rule__Deltarx__SignalsAssignment_0_5_2 : ( ruleSignal ) ;
    public final void rule__Deltarx__SignalsAssignment_0_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5323:1: ( ( ruleSignal ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5324:1: ( ruleSignal )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5324:1: ( ruleSignal )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5325:1: ruleSignal
            {
             before(grammarAccess.getDeltarxAccess().getSignalsSignalParserRuleCall_0_5_2_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Deltarx__SignalsAssignment_0_5_210810);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getDeltarxAccess().getSignalsSignalParserRuleCall_0_5_2_0()); 

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
    // $ANTLR end "rule__Deltarx__SignalsAssignment_0_5_2"


    // $ANTLR start "rule__Deltarx__ComponentsAssignment_1_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5334:1: rule__Deltarx__ComponentsAssignment_1_2 : ( ruleComponent ) ;
    public final void rule__Deltarx__ComponentsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5338:1: ( ( ruleComponent ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5339:1: ( ruleComponent )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5339:1: ( ruleComponent )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5340:1: ruleComponent
            {
             before(grammarAccess.getDeltarxAccess().getComponentsComponentParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Deltarx__ComponentsAssignment_1_210841);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getDeltarxAccess().getComponentsComponentParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Deltarx__ComponentsAssignment_1_2"


    // $ANTLR start "rule__Deltarx__ConnectorsAssignment_2_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5349:1: rule__Deltarx__ConnectorsAssignment_2_2 : ( ruleConnector ) ;
    public final void rule__Deltarx__ConnectorsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5353:1: ( ( ruleConnector ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5354:1: ( ruleConnector )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5354:1: ( ruleConnector )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5355:1: ruleConnector
            {
             before(grammarAccess.getDeltarxAccess().getConnectorsConnectorParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__Deltarx__ConnectorsAssignment_2_210872);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getDeltarxAccess().getConnectorsConnectorParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Deltarx__ConnectorsAssignment_2_2"


    // $ANTLR start "rule__Deltarx__DeltasAssignment_3_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5364:1: rule__Deltarx__DeltasAssignment_3_2 : ( ruleDelta ) ;
    public final void rule__Deltarx__DeltasAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5368:1: ( ( ruleDelta ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5369:1: ( ruleDelta )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5369:1: ( ruleDelta )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5370:1: ruleDelta
            {
             before(grammarAccess.getDeltarxAccess().getDeltasDeltaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleDelta_in_rule__Deltarx__DeltasAssignment_3_210903);
            ruleDelta();

            state._fsp--;

             after(grammarAccess.getDeltarxAccess().getDeltasDeltaParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Deltarx__DeltasAssignment_3_2"


    // $ANTLR start "rule__Signal__NameAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5379:1: rule__Signal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5383:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5384:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5384:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5385:1: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_010934); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Signal__NameAssignment_0"


    // $ANTLR start "rule__Signal__TypeAssignment_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5394:1: rule__Signal__TypeAssignment_1 : ( ruleSignalType ) ;
    public final void rule__Signal__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5398:1: ( ( ruleSignalType ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5399:1: ( ruleSignalType )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5399:1: ( ruleSignalType )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5400:1: ruleSignalType
            {
             before(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_110965);
            ruleSignalType();

            state._fsp--;

             after(grammarAccess.getSignalAccess().getTypeSignalTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Signal__TypeAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5409:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5413:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5414:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5414:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5415:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_010996); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_0"


    // $ANTLR start "rule__Component__PortsAssignment_2_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5424:1: rule__Component__PortsAssignment_2_2 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5428:1: ( ( rulePort ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5429:1: ( rulePort )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5429:1: ( rulePort )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5430:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_2_211027);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Component__PortsAssignment_2_2"


    // $ANTLR start "rule__Component__ConnectorsAssignment_3_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5439:1: rule__Component__ConnectorsAssignment_3_2 : ( ruleConnector ) ;
    public final void rule__Component__ConnectorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5443:1: ( ( ruleConnector ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5444:1: ( ruleConnector )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5444:1: ( ruleConnector )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5445:1: ruleConnector
            {
             before(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_3_211058);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Component__ConnectorsAssignment_3_2"


    // $ANTLR start "rule__Component__SubcomponentsAssignment_4_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5454:1: rule__Component__SubcomponentsAssignment_4_2 : ( ruleComponent ) ;
    public final void rule__Component__SubcomponentsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5458:1: ( ( ruleComponent ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5459:1: ( ruleComponent )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5459:1: ( ruleComponent )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5460:1: ruleComponent
            {
             before(grammarAccess.getComponentAccess().getSubcomponentsComponentParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Component__SubcomponentsAssignment_4_211089);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getSubcomponentsComponentParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Component__SubcomponentsAssignment_4_2"


    // $ANTLR start "rule__Port__DirectionAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5469:1: rule__Port__DirectionAssignment_0 : ( rulePortDirection ) ;
    public final void rule__Port__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5473:1: ( ( rulePortDirection ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5474:1: ( rulePortDirection )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5474:1: ( rulePortDirection )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5475:1: rulePortDirection
            {
             before(grammarAccess.getPortAccess().getDirectionPortDirectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePortDirection_in_rule__Port__DirectionAssignment_011120);
            rulePortDirection();

            state._fsp--;

             after(grammarAccess.getPortAccess().getDirectionPortDirectionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Port__DirectionAssignment_0"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5484:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5488:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5489:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5489:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5490:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_111151); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Port__SignalAssignment_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5499:1: rule__Port__SignalAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Port__SignalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5503:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5504:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5504:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5505:1: ( RULE_ID )
            {
             before(grammarAccess.getPortAccess().getSignalSignalCrossReference_2_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5506:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5507:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__SignalAssignment_211186); 
             after(grammarAccess.getPortAccess().getSignalSignalIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPortAccess().getSignalSignalCrossReference_2_0()); 

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
    // $ANTLR end "rule__Port__SignalAssignment_2"


    // $ANTLR start "rule__Connector__NameAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5518:1: rule__Connector__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5522:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5523:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5523:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5524:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_011221); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Connector__NameAssignment_0"


    // $ANTLR start "rule__Connector__TypeAssignment_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5533:1: rule__Connector__TypeAssignment_1 : ( ( rule__Connector__TypeAlternatives_1_0 ) ) ;
    public final void rule__Connector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5537:1: ( ( ( rule__Connector__TypeAlternatives_1_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5538:1: ( ( rule__Connector__TypeAlternatives_1_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5538:1: ( ( rule__Connector__TypeAlternatives_1_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5539:1: ( rule__Connector__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getConnectorAccess().getTypeAlternatives_1_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5540:1: ( rule__Connector__TypeAlternatives_1_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5540:2: rule__Connector__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Connector__TypeAlternatives_1_0_in_rule__Connector__TypeAssignment_111252);
            rule__Connector__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Connector__TypeAssignment_1"


    // $ANTLR start "rule__ConnectorTypeOne__SourceAssignment_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5549:1: rule__ConnectorTypeOne__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeOne__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5553:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5554:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5554:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5555:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSourceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SourceAssignment_111285); 
             after(grammarAccess.getConnectorTypeOneAccess().getSourceIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__SourceAssignment_1"


    // $ANTLR start "rule__ConnectorTypeOne__PortnameoneAssignment_3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5564:1: rule__ConnectorTypeOne__PortnameoneAssignment_3 : ( ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 ) ) ;
    public final void rule__ConnectorTypeOne__PortnameoneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5568:1: ( ( ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5569:1: ( ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5569:1: ( ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5570:1: ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getPortnameoneAlternatives_3_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5571:1: ( rule__ConnectorTypeOne__PortnameoneAlternatives_3_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5571:2: rule__ConnectorTypeOne__PortnameoneAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__PortnameoneAlternatives_3_0_in_rule__ConnectorTypeOne__PortnameoneAssignment_311316);
            rule__ConnectorTypeOne__PortnameoneAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getPortnameoneAlternatives_3_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__PortnameoneAssignment_3"


    // $ANTLR start "rule__ConnectorTypeOne__SignaltypeoneAssignment_5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5580:1: rule__ConnectorTypeOne__SignaltypeoneAssignment_5 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeOne__SignaltypeoneAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5584:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5585:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5585:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5586:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSignaltypeoneIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SignaltypeoneAssignment_511349); 
             after(grammarAccess.getConnectorTypeOneAccess().getSignaltypeoneIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__SignaltypeoneAssignment_5"


    // $ANTLR start "rule__ConnectorTypeOne__SignaltypetwoAssignment_7"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5595:1: rule__ConnectorTypeOne__SignaltypetwoAssignment_7 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeOne__SignaltypetwoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5599:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5600:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5600:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5601:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeOneAccess().getSignaltypetwoIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SignaltypetwoAssignment_711380); 
             after(grammarAccess.getConnectorTypeOneAccess().getSignaltypetwoIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__SignaltypetwoAssignment_7"


    // $ANTLR start "rule__ConnectorTypeOne__PortnametwoAssignment_9"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5610:1: rule__ConnectorTypeOne__PortnametwoAssignment_9 : ( ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 ) ) ;
    public final void rule__ConnectorTypeOne__PortnametwoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5614:1: ( ( ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5615:1: ( ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5615:1: ( ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5616:1: ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 )
            {
             before(grammarAccess.getConnectorTypeOneAccess().getPortnametwoAlternatives_9_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5617:1: ( rule__ConnectorTypeOne__PortnametwoAlternatives_9_0 )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5617:2: rule__ConnectorTypeOne__PortnametwoAlternatives_9_0
            {
            pushFollow(FOLLOW_rule__ConnectorTypeOne__PortnametwoAlternatives_9_0_in_rule__ConnectorTypeOne__PortnametwoAssignment_911411);
            rule__ConnectorTypeOne__PortnametwoAlternatives_9_0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeOneAccess().getPortnametwoAlternatives_9_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__PortnametwoAssignment_9"


    // $ANTLR start "rule__ConnectorTypeOne__DestinationAssignment_11"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5626:1: rule__ConnectorTypeOne__DestinationAssignment_11 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeOne__DestinationAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5630:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5631:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5631:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5632:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeOneAccess().getDestinationIDTerminalRuleCall_11_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__DestinationAssignment_1111444); 
             after(grammarAccess.getConnectorTypeOneAccess().getDestinationIDTerminalRuleCall_11_0()); 

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
    // $ANTLR end "rule__ConnectorTypeOne__DestinationAssignment_11"


    // $ANTLR start "rule__ConnectorTypeTwo__SourceAssignment_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5641:1: rule__ConnectorTypeTwo__SourceAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeTwo__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5645:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5646:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5646:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5647:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getSourceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__SourceAssignment_111475); 
             after(grammarAccess.getConnectorTypeTwoAccess().getSourceIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__SourceAssignment_1"


    // $ANTLR start "rule__ConnectorTypeTwo__SourcesignalAssignment_3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5656:1: rule__ConnectorTypeTwo__SourcesignalAssignment_3 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeTwo__SourcesignalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5660:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5661:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5661:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5662:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getSourcesignalIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__SourcesignalAssignment_311506); 
             after(grammarAccess.getConnectorTypeTwoAccess().getSourcesignalIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__SourcesignalAssignment_3"


    // $ANTLR start "rule__ConnectorTypeTwo__DestinationsignalAssignment_5"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5671:1: rule__ConnectorTypeTwo__DestinationsignalAssignment_5 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeTwo__DestinationsignalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5675:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5676:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5676:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5677:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__DestinationsignalAssignment_511537); 
             after(grammarAccess.getConnectorTypeTwoAccess().getDestinationsignalIDTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__DestinationsignalAssignment_5"


    // $ANTLR start "rule__ConnectorTypeTwo__DestinationAssignment_7"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5686:1: rule__ConnectorTypeTwo__DestinationAssignment_7 : ( RULE_ID ) ;
    public final void rule__ConnectorTypeTwo__DestinationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5690:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5691:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5691:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5692:1: RULE_ID
            {
             before(grammarAccess.getConnectorTypeTwoAccess().getDestinationIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__DestinationAssignment_711568); 
             after(grammarAccess.getConnectorTypeTwoAccess().getDestinationIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__ConnectorTypeTwo__DestinationAssignment_7"


    // $ANTLR start "rule__Delta__NameAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5701:1: rule__Delta__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Delta__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5705:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5706:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5706:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5707:1: RULE_ID
            {
             before(grammarAccess.getDeltaAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delta__NameAssignment_011599); 
             after(grammarAccess.getDeltaAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Delta__NameAssignment_0"


    // $ANTLR start "rule__Delta__AfterAssignment_1_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5716:1: rule__Delta__AfterAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Delta__AfterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5720:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5721:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5721:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5722:1: RULE_ID
            {
             before(grammarAccess.getDeltaAccess().getAfterIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delta__AfterAssignment_1_111630); 
             after(grammarAccess.getDeltaAccess().getAfterIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Delta__AfterAssignment_1_1"


    // $ANTLR start "rule__Delta__AppconAssignment_3"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5731:1: rule__Delta__AppconAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Delta__AppconAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5735:1: ( ( RULE_STRING ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5736:1: ( RULE_STRING )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5736:1: ( RULE_STRING )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5737:1: RULE_STRING
            {
             before(grammarAccess.getDeltaAccess().getAppconSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Delta__AppconAssignment_311661); 
             after(grammarAccess.getDeltaAccess().getAppconSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Delta__AppconAssignment_3"


    // $ANTLR start "rule__Delta__RemoveConnectorAssignment_5_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5746:1: rule__Delta__RemoveConnectorAssignment_5_2 : ( ruleDeltaRemoveConnector ) ;
    public final void rule__Delta__RemoveConnectorAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5750:1: ( ( ruleDeltaRemoveConnector ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5751:1: ( ruleDeltaRemoveConnector )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5751:1: ( ruleDeltaRemoveConnector )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5752:1: ruleDeltaRemoveConnector
            {
             before(grammarAccess.getDeltaAccess().getRemoveConnectorDeltaRemoveConnectorParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleDeltaRemoveConnector_in_rule__Delta__RemoveConnectorAssignment_5_211692);
            ruleDeltaRemoveConnector();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getRemoveConnectorDeltaRemoveConnectorParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Delta__RemoveConnectorAssignment_5_2"


    // $ANTLR start "rule__Delta__RemoveComponentAssignment_6_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5761:1: rule__Delta__RemoveComponentAssignment_6_2 : ( ruleDeltaRemoveComponent ) ;
    public final void rule__Delta__RemoveComponentAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5765:1: ( ( ruleDeltaRemoveComponent ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5766:1: ( ruleDeltaRemoveComponent )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5766:1: ( ruleDeltaRemoveComponent )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5767:1: ruleDeltaRemoveComponent
            {
             before(grammarAccess.getDeltaAccess().getRemoveComponentDeltaRemoveComponentParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_ruleDeltaRemoveComponent_in_rule__Delta__RemoveComponentAssignment_6_211723);
            ruleDeltaRemoveComponent();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getRemoveComponentDeltaRemoveComponentParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Delta__RemoveComponentAssignment_6_2"


    // $ANTLR start "rule__Delta__RemoveSignalAssignment_7_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5776:1: rule__Delta__RemoveSignalAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__Delta__RemoveSignalAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5780:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5781:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5781:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5782:1: ( RULE_ID )
            {
             before(grammarAccess.getDeltaAccess().getRemoveSignalSignalCrossReference_7_2_0()); 
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5783:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5784:1: RULE_ID
            {
             before(grammarAccess.getDeltaAccess().getRemoveSignalSignalIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delta__RemoveSignalAssignment_7_211758); 
             after(grammarAccess.getDeltaAccess().getRemoveSignalSignalIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getDeltaAccess().getRemoveSignalSignalCrossReference_7_2_0()); 

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
    // $ANTLR end "rule__Delta__RemoveSignalAssignment_7_2"


    // $ANTLR start "rule__Delta__RemovePortAssignment_8_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5795:1: rule__Delta__RemovePortAssignment_8_2 : ( ruleDeltaRemovePort ) ;
    public final void rule__Delta__RemovePortAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5799:1: ( ( ruleDeltaRemovePort ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5800:1: ( ruleDeltaRemovePort )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5800:1: ( ruleDeltaRemovePort )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5801:1: ruleDeltaRemovePort
            {
             before(grammarAccess.getDeltaAccess().getRemovePortDeltaRemovePortParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_ruleDeltaRemovePort_in_rule__Delta__RemovePortAssignment_8_211793);
            ruleDeltaRemovePort();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getRemovePortDeltaRemovePortParserRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Delta__RemovePortAssignment_8_2"


    // $ANTLR start "rule__Delta__NewSignalAssignment_9_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5810:1: rule__Delta__NewSignalAssignment_9_2 : ( ruleSignal ) ;
    public final void rule__Delta__NewSignalAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5814:1: ( ( ruleSignal ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5815:1: ( ruleSignal )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5815:1: ( ruleSignal )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5816:1: ruleSignal
            {
             before(grammarAccess.getDeltaAccess().getNewSignalSignalParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__Delta__NewSignalAssignment_9_211824);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getNewSignalSignalParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Delta__NewSignalAssignment_9_2"


    // $ANTLR start "rule__Delta__NewComponentAssignment_10_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5825:1: rule__Delta__NewComponentAssignment_10_2 : ( ruleDeltaAddComponent ) ;
    public final void rule__Delta__NewComponentAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5829:1: ( ( ruleDeltaAddComponent ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5830:1: ( ruleDeltaAddComponent )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5830:1: ( ruleDeltaAddComponent )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5831:1: ruleDeltaAddComponent
            {
             before(grammarAccess.getDeltaAccess().getNewComponentDeltaAddComponentParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_ruleDeltaAddComponent_in_rule__Delta__NewComponentAssignment_10_211855);
            ruleDeltaAddComponent();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getNewComponentDeltaAddComponentParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Delta__NewComponentAssignment_10_2"


    // $ANTLR start "rule__Delta__NewConnectorAssignment_11_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5840:1: rule__Delta__NewConnectorAssignment_11_2 : ( ruleDeltaAddConnector ) ;
    public final void rule__Delta__NewConnectorAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5844:1: ( ( ruleDeltaAddConnector ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5845:1: ( ruleDeltaAddConnector )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5845:1: ( ruleDeltaAddConnector )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5846:1: ruleDeltaAddConnector
            {
             before(grammarAccess.getDeltaAccess().getNewConnectorDeltaAddConnectorParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_ruleDeltaAddConnector_in_rule__Delta__NewConnectorAssignment_11_211886);
            ruleDeltaAddConnector();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getNewConnectorDeltaAddConnectorParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Delta__NewConnectorAssignment_11_2"


    // $ANTLR start "rule__Delta__NewPortAssignment_12_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5855:1: rule__Delta__NewPortAssignment_12_2 : ( ruleDeltaAddPort ) ;
    public final void rule__Delta__NewPortAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5859:1: ( ( ruleDeltaAddPort ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5860:1: ( ruleDeltaAddPort )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5860:1: ( ruleDeltaAddPort )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5861:1: ruleDeltaAddPort
            {
             before(grammarAccess.getDeltaAccess().getNewPortDeltaAddPortParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_ruleDeltaAddPort_in_rule__Delta__NewPortAssignment_12_211917);
            ruleDeltaAddPort();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getNewPortDeltaAddPortParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__Delta__NewPortAssignment_12_2"


    // $ANTLR start "rule__DeltaAddPort__PortAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5870:1: rule__DeltaAddPort__PortAssignment_0 : ( rulePort ) ;
    public final void rule__DeltaAddPort__PortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5874:1: ( ( rulePort ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5875:1: ( rulePort )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5875:1: ( rulePort )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5876:1: rulePort
            {
             before(grammarAccess.getDeltaAddPortAccess().getPortPortParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__DeltaAddPort__PortAssignment_011948);
            rulePort();

            state._fsp--;

             after(grammarAccess.getDeltaAddPortAccess().getPortPortParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaAddPort__PortAssignment_0"


    // $ANTLR start "rule__DeltaAddPort__PortComponentAssignment_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5885:1: rule__DeltaAddPort__PortComponentAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeltaAddPort__PortComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5889:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5890:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5890:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5891:1: RULE_ID
            {
             before(grammarAccess.getDeltaAddPortAccess().getPortComponentIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaAddPort__PortComponentAssignment_211979); 
             after(grammarAccess.getDeltaAddPortAccess().getPortComponentIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeltaAddPort__PortComponentAssignment_2"


    // $ANTLR start "rule__DeltaRemovePort__PortNameAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5900:1: rule__DeltaRemovePort__PortNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeltaRemovePort__PortNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5904:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5905:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5905:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5906:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemovePortAccess().getPortNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemovePort__PortNameAssignment_012010); 
             after(grammarAccess.getDeltaRemovePortAccess().getPortNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaRemovePort__PortNameAssignment_0"


    // $ANTLR start "rule__DeltaRemovePort__PortComponentAssignment_2"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5915:1: rule__DeltaRemovePort__PortComponentAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeltaRemovePort__PortComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5919:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5920:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5920:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5921:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemovePortAccess().getPortComponentIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemovePort__PortComponentAssignment_212041); 
             after(grammarAccess.getDeltaRemovePortAccess().getPortComponentIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeltaRemovePort__PortComponentAssignment_2"


    // $ANTLR start "rule__DeltaAddComponent__ComponentAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5930:1: rule__DeltaAddComponent__ComponentAssignment_0 : ( ruleComponent ) ;
    public final void rule__DeltaAddComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5934:1: ( ( ruleComponent ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5935:1: ( ruleComponent )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5935:1: ( ruleComponent )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5936:1: ruleComponent
            {
             before(grammarAccess.getDeltaAddComponentAccess().getComponentComponentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__DeltaAddComponent__ComponentAssignment_012072);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getDeltaAddComponentAccess().getComponentComponentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaAddComponent__ComponentAssignment_0"


    // $ANTLR start "rule__DeltaAddComponent__SuperComponentAssignment_1_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5945:1: rule__DeltaAddComponent__SuperComponentAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeltaAddComponent__SuperComponentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5949:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5950:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5950:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5951:1: RULE_ID
            {
             before(grammarAccess.getDeltaAddComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaAddComponent__SuperComponentAssignment_1_112103); 
             after(grammarAccess.getDeltaAddComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DeltaAddComponent__SuperComponentAssignment_1_1"


    // $ANTLR start "rule__DeltaRemoveComponent__ComponentAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5960:1: rule__DeltaRemoveComponent__ComponentAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeltaRemoveComponent__ComponentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5964:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5965:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5965:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5966:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getComponentIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemoveComponent__ComponentAssignment_012134); 
             after(grammarAccess.getDeltaRemoveComponentAccess().getComponentIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__ComponentAssignment_0"


    // $ANTLR start "rule__DeltaRemoveComponent__SuperComponentAssignment_1_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5975:1: rule__DeltaRemoveComponent__SuperComponentAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeltaRemoveComponent__SuperComponentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5979:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5980:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5980:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5981:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemoveComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemoveComponent__SuperComponentAssignment_1_112165); 
             after(grammarAccess.getDeltaRemoveComponentAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DeltaRemoveComponent__SuperComponentAssignment_1_1"


    // $ANTLR start "rule__DeltaAddConnector__ConnectorAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5990:1: rule__DeltaAddConnector__ConnectorAssignment_0 : ( ruleConnector ) ;
    public final void rule__DeltaAddConnector__ConnectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5994:1: ( ( ruleConnector ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5995:1: ( ruleConnector )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5995:1: ( ruleConnector )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:5996:1: ruleConnector
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getConnectorConnectorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__DeltaAddConnector__ConnectorAssignment_012196);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getDeltaAddConnectorAccess().getConnectorConnectorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaAddConnector__ConnectorAssignment_0"


    // $ANTLR start "rule__DeltaAddConnector__SuperComponentAssignment_1_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6005:1: rule__DeltaAddConnector__SuperComponentAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeltaAddConnector__SuperComponentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6009:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6010:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6010:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6011:1: RULE_ID
            {
             before(grammarAccess.getDeltaAddConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaAddConnector__SuperComponentAssignment_1_112227); 
             after(grammarAccess.getDeltaAddConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DeltaAddConnector__SuperComponentAssignment_1_1"


    // $ANTLR start "rule__DeltaRemoveConnector__ConnectorAssignment_0"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6020:1: rule__DeltaRemoveConnector__ConnectorAssignment_0 : ( RULE_ID ) ;
    public final void rule__DeltaRemoveConnector__ConnectorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6024:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6025:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6025:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6026:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getConnectorIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemoveConnector__ConnectorAssignment_012258); 
             after(grammarAccess.getDeltaRemoveConnectorAccess().getConnectorIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__ConnectorAssignment_0"


    // $ANTLR start "rule__DeltaRemoveConnector__SuperComponentAssignment_1_1"
    // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6035:1: rule__DeltaRemoveConnector__SuperComponentAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DeltaRemoveConnector__SuperComponentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6039:1: ( ( RULE_ID ) )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6040:1: ( RULE_ID )
            {
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6040:1: ( RULE_ID )
            // ../org.xtext.deltarx.ui/src-gen/org/xtext/deltarx/ui/contentassist/antlr/internal/InternalDeltarx.g:6041:1: RULE_ID
            {
             before(grammarAccess.getDeltaRemoveConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeltaRemoveConnector__SuperComponentAssignment_1_112289); 
             after(grammarAccess.getDeltaRemoveConnectorAccess().getSuperComponentIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DeltaRemoveConnector__SuperComponentAssignment_1_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\13\uffff";
    static final String DFA3_eofS =
        "\13\uffff";
    static final String DFA3_minS =
        "\1\34\1\4\1\35\1\4\1\35\1\uffff\1\4\1\35\1\4\1\35\1\uffff";
    static final String DFA3_maxS =
        "\1\34\1\4\1\35\1\13\1\35\1\uffff\1\4\1\35\1\4\1\36\1\uffff";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\4\uffff\1\2";
    static final String DFA3_specialS =
        "\13\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\6\uffff\1\5",
            "\1\6",
            "",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\5\1\12",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "606:1: rule__Connector__TypeAlternatives_1_0 : ( ( ruleConnectorTypeOne ) | ( ruleConnectorTypeTwo ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleDeltarx_in_entryRuleDeltarx61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltarx68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup_in_ruleDeltarx94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0_in_ruleSignal154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_entryRuleSignalType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalType__Alternatives_in_ruleSignalType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortDirection_in_entryRulePortDirection361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePortDirection368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PortDirection__Alternatives_in_rulePortDirection394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_entryRuleEnvironmentMessage421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnvironmentMessage428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEnvironmentMessage455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0_in_ruleConnector516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeOne_in_entryRuleConnectorTypeOne543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorTypeOne550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__0_in_ruleConnectorTypeOne576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeTwo_in_entryRuleConnectorTypeTwo603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectorTypeTwo610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__0_in_ruleConnectorTypeTwo636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelta_in_entryRuleDelta663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelta670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__0_in_ruleDelta696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddPort_in_entryRuleDeltaAddPort723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddPort730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__0_in_ruleDeltaAddPort756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemovePort_in_entryRuleDeltaRemovePort783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemovePort790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__0_in_ruleDeltaRemovePort816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddComponent_in_entryRuleDeltaAddComponent843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddComponent850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group__0_in_ruleDeltaAddComponent876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveComponent_in_entryRuleDeltaRemoveComponent903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemoveComponent910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group__0_in_ruleDeltaRemoveComponent936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddConnector_in_entryRuleDeltaAddConnector963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaAddConnector970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group__0_in_ruleDeltaAddConnector996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveConnector_in_entryRuleDeltaRemoveConnector1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeltaRemoveConnector1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group__0_in_ruleDeltaRemoveConnector1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SignalType__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SignalType__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SignalType__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SignalType__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PortDirection__Alternatives1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PortDirection__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeOne_in_rule__Connector__TypeAlternatives_1_01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorTypeTwo_in_rule__Connector__TypeAlternatives_1_01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__PortnameoneAlternatives_3_01291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_rule__ConnectorTypeOne__PortnameoneAlternatives_3_01308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__PortnametwoAlternatives_9_01340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnvironmentMessage_in_rule__ConnectorTypeOne__PortnametwoAlternatives_9_01357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__0__Impl_in_rule__Deltarx__Group_0__01387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__1_in_rule__Deltarx__Group_0__01390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Deltarx__Group_0__0__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__1__Impl_in_rule__Deltarx__Group_0__11449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__2_in_rule__Deltarx__Group_0__11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__NameAssignment_0_1_in_rule__Deltarx__Group_0__1__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__2__Impl_in_rule__Deltarx__Group_0__21509 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__3_in_rule__Deltarx__Group_0__21512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Deltarx__Group_0__2__Impl1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__3__Impl_in_rule__Deltarx__Group_0__31571 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__4_in_rule__Deltarx__Group_0__31574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__FmdirAssignment_0_3_in_rule__Deltarx__Group_0__3__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__4__Impl_in_rule__Deltarx__Group_0__41631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__5_in_rule__Deltarx__Group_0__41634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Deltarx__Group_0__4__Impl1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__5__Impl_in_rule__Deltarx__Group_0__51693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__0_in_rule__Deltarx__Group_0__5__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__0__Impl_in_rule__Deltarx__Group_0_5__01763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__1_in_rule__Deltarx__Group_0_5__01766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Deltarx__Group_0_5__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__1__Impl_in_rule__Deltarx__Group_0_5__11825 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__2_in_rule__Deltarx__Group_0_5__11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Deltarx__Group_0_5__1__Impl1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__2__Impl_in_rule__Deltarx__Group_0_5__21887 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__3_in_rule__Deltarx__Group_0_5__21890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__SignalsAssignment_0_5_2_in_rule__Deltarx__Group_0_5__2__Impl1917 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0_5__3__Impl_in_rule__Deltarx__Group_0_5__31948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Deltarx__Group_0_5__3__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__0__Impl_in_rule__Deltarx__Group_1__02015 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__1_in_rule__Deltarx__Group_1__02018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Deltarx__Group_1__0__Impl2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__1__Impl_in_rule__Deltarx__Group_1__12077 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__2_in_rule__Deltarx__Group_1__12080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Deltarx__Group_1__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__2__Impl_in_rule__Deltarx__Group_1__22139 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__3_in_rule__Deltarx__Group_1__22142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__ComponentsAssignment_1_2_in_rule__Deltarx__Group_1__2__Impl2169 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__3__Impl_in_rule__Deltarx__Group_1__32200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Deltarx__Group_1__3__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__0__Impl_in_rule__Deltarx__Group_2__02267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__1_in_rule__Deltarx__Group_2__02270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Deltarx__Group_2__0__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__1__Impl_in_rule__Deltarx__Group_2__12329 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__2_in_rule__Deltarx__Group_2__12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Deltarx__Group_2__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__2__Impl_in_rule__Deltarx__Group_2__22391 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__3_in_rule__Deltarx__Group_2__22394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__ConnectorsAssignment_2_2_in_rule__Deltarx__Group_2__2__Impl2421 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__3__Impl_in_rule__Deltarx__Group_2__32452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Deltarx__Group_2__3__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__0__Impl_in_rule__Deltarx__Group_3__02519 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__1_in_rule__Deltarx__Group_3__02522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Deltarx__Group_3__0__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__1__Impl_in_rule__Deltarx__Group_3__12581 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__2_in_rule__Deltarx__Group_3__12584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Deltarx__Group_3__1__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__2__Impl_in_rule__Deltarx__Group_3__22643 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__3_in_rule__Deltarx__Group_3__22646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__DeltasAssignment_3_2_in_rule__Deltarx__Group_3__2__Impl2673 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__3__Impl_in_rule__Deltarx__Group_3__32704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Deltarx__Group_3__3__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__0__Impl_in_rule__Signal__Group__02771 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__Signal__Group__1_in_rule__Signal__Group__02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__NameAssignment_0_in_rule__Signal__Group__0__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Group__1__Impl_in_rule__Signal__Group__12831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__TypeAssignment_1_in_rule__Signal__Group__1__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__02892 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__02895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_0_in_rule__Component__Group__0__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__12952 = new BitSet(new long[]{0x000000000D400000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group__1__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__23014 = new BitSet(new long[]{0x000000000D400000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0_in_rule__Component__Group__2__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__33075 = new BitSet(new long[]{0x000000000D400000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__33078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__0_in_rule__Component__Group__3__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__43136 = new BitSet(new long[]{0x000000000D400000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__43139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0_in_rule__Component__Group__4__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__53197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Component__Group__5__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__0__Impl_in_rule__Component__Group_2__03268 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1_in_rule__Component__Group_2__03271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Component__Group_2__0__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__1__Impl_in_rule__Component__Group_2__13330 = new BitSet(new long[]{0x0000000000430000L});
    public static final BitSet FOLLOW_rule__Component__Group_2__2_in_rule__Component__Group_2__13333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group_2__1__Impl3361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__2__Impl_in_rule__Component__Group_2__23392 = new BitSet(new long[]{0x0000000000430000L});
    public static final BitSet FOLLOW_rule__Component__Group_2__3_in_rule__Component__Group_2__23395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_2_2_in_rule__Component__Group_2__2__Impl3422 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Component__Group_2__3__Impl_in_rule__Component__Group_2__33453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Component__Group_2__3__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__0__Impl_in_rule__Component__Group_3__03520 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Component__Group_3__1_in_rule__Component__Group_3__03523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Component__Group_3__0__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__1__Impl_in_rule__Component__Group_3__13582 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Component__Group_3__2_in_rule__Component__Group_3__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group_3__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_3__2__Impl_in_rule__Component__Group_3__23644 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Component__Group_3__3_in_rule__Component__Group_3__23647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ConnectorsAssignment_3_2_in_rule__Component__Group_3__2__Impl3674 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Component__Group_3__3__Impl_in_rule__Component__Group_3__33705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Component__Group_3__3__Impl3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__0__Impl_in_rule__Component__Group_4__03772 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1_in_rule__Component__Group_4__03775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Component__Group_4__0__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__1__Impl_in_rule__Component__Group_4__13834 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Component__Group_4__2_in_rule__Component__Group_4__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Component__Group_4__1__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group_4__2__Impl_in_rule__Component__Group_4__23896 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Component__Group_4__3_in_rule__Component__Group_4__23899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__SubcomponentsAssignment_4_2_in_rule__Component__Group_4__2__Impl3926 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Component__Group_4__3__Impl_in_rule__Component__Group_4__33957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Component__Group_4__3__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__04024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__04027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__14084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__2_in_rule__Port__Group__14087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__2__Impl_in_rule__Port__Group__24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__SignalAssignment_2_in_rule__Port__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__04208 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__04211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_0_in_rule__Connector__Group__0__Impl4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__14268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__0__Impl_in_rule__ConnectorTypeOne__Group__04329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__1_in_rule__ConnectorTypeOne__Group__04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ConnectorTypeOne__Group__0__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__1__Impl_in_rule__ConnectorTypeOne__Group__14391 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__2_in_rule__ConnectorTypeOne__Group__14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__SourceAssignment_1_in_rule__ConnectorTypeOne__Group__1__Impl4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__2__Impl_in_rule__ConnectorTypeOne__Group__24451 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__3_in_rule__ConnectorTypeOne__Group__24454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeOne__Group__2__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__3__Impl_in_rule__ConnectorTypeOne__Group__34513 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__4_in_rule__ConnectorTypeOne__Group__34516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__PortnameoneAssignment_3_in_rule__ConnectorTypeOne__Group__3__Impl4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__4__Impl_in_rule__ConnectorTypeOne__Group__44573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__5_in_rule__ConnectorTypeOne__Group__44576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeOne__Group__4__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__5__Impl_in_rule__ConnectorTypeOne__Group__54635 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__6_in_rule__ConnectorTypeOne__Group__54638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__SignaltypeoneAssignment_5_in_rule__ConnectorTypeOne__Group__5__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__6__Impl_in_rule__ConnectorTypeOne__Group__64695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__7_in_rule__ConnectorTypeOne__Group__64698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeOne__Group__6__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__7__Impl_in_rule__ConnectorTypeOne__Group__74757 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__8_in_rule__ConnectorTypeOne__Group__74760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__SignaltypetwoAssignment_7_in_rule__ConnectorTypeOne__Group__7__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__8__Impl_in_rule__ConnectorTypeOne__Group__84817 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__9_in_rule__ConnectorTypeOne__Group__84820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeOne__Group__8__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__9__Impl_in_rule__ConnectorTypeOne__Group__94879 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__10_in_rule__ConnectorTypeOne__Group__94882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__PortnametwoAssignment_9_in_rule__ConnectorTypeOne__Group__9__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__10__Impl_in_rule__ConnectorTypeOne__Group__104939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__11_in_rule__ConnectorTypeOne__Group__104942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeOne__Group__10__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__11__Impl_in_rule__ConnectorTypeOne__Group__115001 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__12_in_rule__ConnectorTypeOne__Group__115004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__DestinationAssignment_11_in_rule__ConnectorTypeOne__Group__11__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__Group__12__Impl_in_rule__ConnectorTypeOne__Group__125061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ConnectorTypeOne__Group__12__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__0__Impl_in_rule__ConnectorTypeTwo__Group__05146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__1_in_rule__ConnectorTypeTwo__Group__05149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ConnectorTypeTwo__Group__0__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__1__Impl_in_rule__ConnectorTypeTwo__Group__15208 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__2_in_rule__ConnectorTypeTwo__Group__15211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__SourceAssignment_1_in_rule__ConnectorTypeTwo__Group__1__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__2__Impl_in_rule__ConnectorTypeTwo__Group__25268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__3_in_rule__ConnectorTypeTwo__Group__25271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeTwo__Group__2__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__3__Impl_in_rule__ConnectorTypeTwo__Group__35330 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__4_in_rule__ConnectorTypeTwo__Group__35333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__SourcesignalAssignment_3_in_rule__ConnectorTypeTwo__Group__3__Impl5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__4__Impl_in_rule__ConnectorTypeTwo__Group__45390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__5_in_rule__ConnectorTypeTwo__Group__45393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeTwo__Group__4__Impl5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__5__Impl_in_rule__ConnectorTypeTwo__Group__55452 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__6_in_rule__ConnectorTypeTwo__Group__55455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__DestinationsignalAssignment_5_in_rule__ConnectorTypeTwo__Group__5__Impl5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__6__Impl_in_rule__ConnectorTypeTwo__Group__65512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__7_in_rule__ConnectorTypeTwo__Group__65515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ConnectorTypeTwo__Group__6__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__7__Impl_in_rule__ConnectorTypeTwo__Group__75574 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__8_in_rule__ConnectorTypeTwo__Group__75577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__DestinationAssignment_7_in_rule__ConnectorTypeTwo__Group__7__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeTwo__Group__8__Impl_in_rule__ConnectorTypeTwo__Group__85634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ConnectorTypeTwo__Group__8__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__0__Impl_in_rule__Delta__Group__05711 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Delta__Group__1_in_rule__Delta__Group__05714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__NameAssignment_0_in_rule__Delta__Group__0__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__1__Impl_in_rule__Delta__Group__15771 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Delta__Group__2_in_rule__Delta__Group__15774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_1__0_in_rule__Delta__Group__1__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__2__Impl_in_rule__Delta__Group__25832 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Delta__Group__3_in_rule__Delta__Group__25835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Delta__Group__2__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__3__Impl_in_rule__Delta__Group__35894 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group__4_in_rule__Delta__Group__35897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__AppconAssignment_3_in_rule__Delta__Group__3__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__4__Impl_in_rule__Delta__Group__45954 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__5_in_rule__Delta__Group__45957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group__4__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__5__Impl_in_rule__Delta__Group__56016 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__6_in_rule__Delta__Group__56019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__0_in_rule__Delta__Group__5__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__6__Impl_in_rule__Delta__Group__66077 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__7_in_rule__Delta__Group__66080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__0_in_rule__Delta__Group__6__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__7__Impl_in_rule__Delta__Group__76138 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__8_in_rule__Delta__Group__76141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__0_in_rule__Delta__Group__7__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__8__Impl_in_rule__Delta__Group__86199 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__9_in_rule__Delta__Group__86202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__0_in_rule__Delta__Group__8__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__9__Impl_in_rule__Delta__Group__96260 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__10_in_rule__Delta__Group__96263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__0_in_rule__Delta__Group__9__Impl6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__10__Impl_in_rule__Delta__Group__106321 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__11_in_rule__Delta__Group__106324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__0_in_rule__Delta__Group__10__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__11__Impl_in_rule__Delta__Group__116382 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__12_in_rule__Delta__Group__116385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__0_in_rule__Delta__Group__11__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__12__Impl_in_rule__Delta__Group__126443 = new BitSet(new long[]{0x000001FE00400000L});
    public static final BitSet FOLLOW_rule__Delta__Group__13_in_rule__Delta__Group__126446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__0_in_rule__Delta__Group__12__Impl6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group__13__Impl_in_rule__Delta__Group__136504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group__13__Impl6532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_1__0__Impl_in_rule__Delta__Group_1__06591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delta__Group_1__1_in_rule__Delta__Group_1__06594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Delta__Group_1__0__Impl6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_1__1__Impl_in_rule__Delta__Group_1__16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__AfterAssignment_1_1_in_rule__Delta__Group_1__1__Impl6680 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__0__Impl_in_rule__Delta__Group_5__06715 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__1_in_rule__Delta__Group_5__06718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Delta__Group_5__0__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__1__Impl_in_rule__Delta__Group_5__16777 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__2_in_rule__Delta__Group_5__16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_5__1__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__2__Impl_in_rule__Delta__Group_5__26839 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__3_in_rule__Delta__Group_5__26842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__RemoveConnectorAssignment_5_2_in_rule__Delta__Group_5__2__Impl6869 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_5__3__Impl_in_rule__Delta__Group_5__36900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_5__3__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__0__Impl_in_rule__Delta__Group_6__06967 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__1_in_rule__Delta__Group_6__06970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Delta__Group_6__0__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__1__Impl_in_rule__Delta__Group_6__17029 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__2_in_rule__Delta__Group_6__17032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_6__1__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__2__Impl_in_rule__Delta__Group_6__27091 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__3_in_rule__Delta__Group_6__27094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__RemoveComponentAssignment_6_2_in_rule__Delta__Group_6__2__Impl7121 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_6__3__Impl_in_rule__Delta__Group_6__37152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_6__3__Impl7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__0__Impl_in_rule__Delta__Group_7__07219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__1_in_rule__Delta__Group_7__07222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Delta__Group_7__0__Impl7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__1__Impl_in_rule__Delta__Group_7__17281 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__2_in_rule__Delta__Group_7__17284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_7__1__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__2__Impl_in_rule__Delta__Group_7__27343 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__3_in_rule__Delta__Group_7__27346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__RemoveSignalAssignment_7_2_in_rule__Delta__Group_7__2__Impl7373 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_7__3__Impl_in_rule__Delta__Group_7__37404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_7__3__Impl7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__0__Impl_in_rule__Delta__Group_8__07471 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__1_in_rule__Delta__Group_8__07474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Delta__Group_8__0__Impl7502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__1__Impl_in_rule__Delta__Group_8__17533 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__2_in_rule__Delta__Group_8__17536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_8__1__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__2__Impl_in_rule__Delta__Group_8__27595 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__3_in_rule__Delta__Group_8__27598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__RemovePortAssignment_8_2_in_rule__Delta__Group_8__2__Impl7625 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_8__3__Impl_in_rule__Delta__Group_8__37656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_8__3__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__0__Impl_in_rule__Delta__Group_9__07723 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__1_in_rule__Delta__Group_9__07726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Delta__Group_9__0__Impl7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__1__Impl_in_rule__Delta__Group_9__17785 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__2_in_rule__Delta__Group_9__17788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_9__1__Impl7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__2__Impl_in_rule__Delta__Group_9__27847 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__3_in_rule__Delta__Group_9__27850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__NewSignalAssignment_9_2_in_rule__Delta__Group_9__2__Impl7877 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_9__3__Impl_in_rule__Delta__Group_9__37908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_9__3__Impl7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__0__Impl_in_rule__Delta__Group_10__07975 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__1_in_rule__Delta__Group_10__07978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Delta__Group_10__0__Impl8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__1__Impl_in_rule__Delta__Group_10__18037 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__2_in_rule__Delta__Group_10__18040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_10__1__Impl8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__2__Impl_in_rule__Delta__Group_10__28099 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__3_in_rule__Delta__Group_10__28102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__NewComponentAssignment_10_2_in_rule__Delta__Group_10__2__Impl8129 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_10__3__Impl_in_rule__Delta__Group_10__38160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_10__3__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__0__Impl_in_rule__Delta__Group_11__08227 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__1_in_rule__Delta__Group_11__08230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Delta__Group_11__0__Impl8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__1__Impl_in_rule__Delta__Group_11__18289 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__2_in_rule__Delta__Group_11__18292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_11__1__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__2__Impl_in_rule__Delta__Group_11__28351 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__3_in_rule__Delta__Group_11__28354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__NewConnectorAssignment_11_2_in_rule__Delta__Group_11__2__Impl8381 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Delta__Group_11__3__Impl_in_rule__Delta__Group_11__38412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_11__3__Impl8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__0__Impl_in_rule__Delta__Group_12__08479 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__1_in_rule__Delta__Group_12__08482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Delta__Group_12__0__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__1__Impl_in_rule__Delta__Group_12__18541 = new BitSet(new long[]{0x0000000000430000L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__2_in_rule__Delta__Group_12__18544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Delta__Group_12__1__Impl8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__2__Impl_in_rule__Delta__Group_12__28603 = new BitSet(new long[]{0x0000000000430000L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__3_in_rule__Delta__Group_12__28606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delta__NewPortAssignment_12_2_in_rule__Delta__Group_12__2__Impl8633 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Delta__Group_12__3__Impl_in_rule__Delta__Group_12__38664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Delta__Group_12__3__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__0__Impl_in_rule__DeltaAddPort__Group__08731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__1_in_rule__DeltaAddPort__Group__08734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__PortAssignment_0_in_rule__DeltaAddPort__Group__0__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__1__Impl_in_rule__DeltaAddPort__Group__18791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__2_in_rule__DeltaAddPort__Group__18794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaAddPort__Group__1__Impl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__Group__2__Impl_in_rule__DeltaAddPort__Group__28853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddPort__PortComponentAssignment_2_in_rule__DeltaAddPort__Group__2__Impl8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__0__Impl_in_rule__DeltaRemovePort__Group__08916 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__1_in_rule__DeltaRemovePort__Group__08919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__PortNameAssignment_0_in_rule__DeltaRemovePort__Group__0__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__1__Impl_in_rule__DeltaRemovePort__Group__18976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__2_in_rule__DeltaRemovePort__Group__18979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaRemovePort__Group__1__Impl9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__Group__2__Impl_in_rule__DeltaRemovePort__Group__29038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemovePort__PortComponentAssignment_2_in_rule__DeltaRemovePort__Group__2__Impl9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group__0__Impl_in_rule__DeltaAddComponent__Group__09101 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group__1_in_rule__DeltaAddComponent__Group__09104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__ComponentAssignment_0_in_rule__DeltaAddComponent__Group__0__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group__1__Impl_in_rule__DeltaAddComponent__Group__19161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group_1__0_in_rule__DeltaAddComponent__Group__1__Impl9188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group_1__0__Impl_in_rule__DeltaAddComponent__Group_1__09223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group_1__1_in_rule__DeltaAddComponent__Group_1__09226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaAddComponent__Group_1__0__Impl9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__Group_1__1__Impl_in_rule__DeltaAddComponent__Group_1__19285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddComponent__SuperComponentAssignment_1_1_in_rule__DeltaAddComponent__Group_1__1__Impl9312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group__0__Impl_in_rule__DeltaRemoveComponent__Group__09346 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group__1_in_rule__DeltaRemoveComponent__Group__09349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__ComponentAssignment_0_in_rule__DeltaRemoveComponent__Group__0__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group__1__Impl_in_rule__DeltaRemoveComponent__Group__19406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group_1__0_in_rule__DeltaRemoveComponent__Group__1__Impl9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group_1__0__Impl_in_rule__DeltaRemoveComponent__Group_1__09468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group_1__1_in_rule__DeltaRemoveComponent__Group_1__09471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaRemoveComponent__Group_1__0__Impl9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__Group_1__1__Impl_in_rule__DeltaRemoveComponent__Group_1__19530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveComponent__SuperComponentAssignment_1_1_in_rule__DeltaRemoveComponent__Group_1__1__Impl9557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group__0__Impl_in_rule__DeltaAddConnector__Group__09591 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group__1_in_rule__DeltaAddConnector__Group__09594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__ConnectorAssignment_0_in_rule__DeltaAddConnector__Group__0__Impl9621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group__1__Impl_in_rule__DeltaAddConnector__Group__19651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group_1__0_in_rule__DeltaAddConnector__Group__1__Impl9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group_1__0__Impl_in_rule__DeltaAddConnector__Group_1__09713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group_1__1_in_rule__DeltaAddConnector__Group_1__09716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaAddConnector__Group_1__0__Impl9744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__Group_1__1__Impl_in_rule__DeltaAddConnector__Group_1__19775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaAddConnector__SuperComponentAssignment_1_1_in_rule__DeltaAddConnector__Group_1__1__Impl9802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group__0__Impl_in_rule__DeltaRemoveConnector__Group__09836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group__1_in_rule__DeltaRemoveConnector__Group__09839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__ConnectorAssignment_0_in_rule__DeltaRemoveConnector__Group__0__Impl9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group__1__Impl_in_rule__DeltaRemoveConnector__Group__19896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group_1__0_in_rule__DeltaRemoveConnector__Group__1__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group_1__0__Impl_in_rule__DeltaRemoveConnector__Group_1__09958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group_1__1_in_rule__DeltaRemoveConnector__Group_1__09961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DeltaRemoveConnector__Group_1__0__Impl9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__Group_1__1__Impl_in_rule__DeltaRemoveConnector__Group_1__110020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeltaRemoveConnector__SuperComponentAssignment_1_1_in_rule__DeltaRemoveConnector__Group_1__1__Impl10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__0_in_rule__Deltarx__UnorderedGroup10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_0__0_in_rule__Deltarx__UnorderedGroup__Impl10171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_1__0_in_rule__Deltarx__UnorderedGroup__Impl10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_2__0_in_rule__Deltarx__UnorderedGroup__Impl10353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__Group_3__0_in_rule__Deltarx__UnorderedGroup__Impl10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Deltarx__UnorderedGroup__Impl10537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__010598 = new BitSet(new long[]{0x0000000003C40002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__1_in_rule__Deltarx__UnorderedGroup__010601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__110626 = new BitSet(new long[]{0x0000000003C40002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__2_in_rule__Deltarx__UnorderedGroup__110629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__210654 = new BitSet(new long[]{0x0000000003C40002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__3_in_rule__Deltarx__UnorderedGroup__210657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__310682 = new BitSet(new long[]{0x0000000003C40002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__4_in_rule__Deltarx__UnorderedGroup__310685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Deltarx__UnorderedGroup__Impl_in_rule__Deltarx__UnorderedGroup__410710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Deltarx__NameAssignment_0_110748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Deltarx__FmdirAssignment_0_310779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Deltarx__SignalsAssignment_0_5_210810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Deltarx__ComponentsAssignment_1_210841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Deltarx__ConnectorsAssignment_2_210872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelta_in_rule__Deltarx__DeltasAssignment_3_210903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal__NameAssignment_010934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalType_in_rule__Signal__TypeAssignment_110965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_010996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_2_211027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_3_211058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Component__SubcomponentsAssignment_4_211089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePortDirection_in_rule__Port__DirectionAssignment_011120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_111151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__SignalAssignment_211186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_011221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__TypeAlternatives_1_0_in_rule__Connector__TypeAssignment_111252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SourceAssignment_111285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__PortnameoneAlternatives_3_0_in_rule__ConnectorTypeOne__PortnameoneAssignment_311316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SignaltypeoneAssignment_511349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__SignaltypetwoAssignment_711380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorTypeOne__PortnametwoAlternatives_9_0_in_rule__ConnectorTypeOne__PortnametwoAssignment_911411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeOne__DestinationAssignment_1111444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__SourceAssignment_111475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__SourcesignalAssignment_311506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__DestinationsignalAssignment_511537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectorTypeTwo__DestinationAssignment_711568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delta__NameAssignment_011599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delta__AfterAssignment_1_111630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Delta__AppconAssignment_311661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveConnector_in_rule__Delta__RemoveConnectorAssignment_5_211692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemoveComponent_in_rule__Delta__RemoveComponentAssignment_6_211723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delta__RemoveSignalAssignment_7_211758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaRemovePort_in_rule__Delta__RemovePortAssignment_8_211793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__Delta__NewSignalAssignment_9_211824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddComponent_in_rule__Delta__NewComponentAssignment_10_211855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddConnector_in_rule__Delta__NewConnectorAssignment_11_211886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeltaAddPort_in_rule__Delta__NewPortAssignment_12_211917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__DeltaAddPort__PortAssignment_011948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaAddPort__PortComponentAssignment_211979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemovePort__PortNameAssignment_012010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemovePort__PortComponentAssignment_212041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__DeltaAddComponent__ComponentAssignment_012072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaAddComponent__SuperComponentAssignment_1_112103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemoveComponent__ComponentAssignment_012134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemoveComponent__SuperComponentAssignment_1_112165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__DeltaAddConnector__ConnectorAssignment_012196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaAddConnector__SuperComponentAssignment_1_112227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemoveConnector__ConnectorAssignment_012258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeltaRemoveConnector__SuperComponentAssignment_1_112289 = new BitSet(new long[]{0x0000000000000002L});

}
