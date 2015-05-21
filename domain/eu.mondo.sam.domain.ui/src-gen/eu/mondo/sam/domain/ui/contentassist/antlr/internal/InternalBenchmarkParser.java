package eu.mondo.sam.domain.ui.contentassist.antlr.internal; 

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
import eu.mondo.sam.domain.services.BenchmarkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBenchmarkParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_RPAR", "RULE_METRICS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Time'", "'Memory'", "'Scalar'", "'package'", "'Scenario'", "'Sequence'", "'Iteration'", "'*'", "'Optional'", "'ClassName'", "'Atomic'", "'ID'", "'new Metric ClassName'", "'.'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int RULE_RBRACE=5;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LPAR=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_STRING=11;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_RPAR=7;
    public static final int RULE_INT=10;
    public static final int RULE_LBRACE=4;
    public static final int RULE_WS=14;
    public static final int RULE_METRICS=8;

    // delegates
    // delegators


        public InternalBenchmarkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBenchmarkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBenchmarkParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g"; }


     
     	private BenchmarkGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BenchmarkGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleBenchmark"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:60:1: entryRuleBenchmark : ruleBenchmark EOF ;
    public final void entryRuleBenchmark() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:61:1: ( ruleBenchmark EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:62:1: ruleBenchmark EOF
            {
             before(grammarAccess.getBenchmarkRule()); 
            pushFollow(FOLLOW_ruleBenchmark_in_entryRuleBenchmark61);
            ruleBenchmark();

            state._fsp--;

             after(grammarAccess.getBenchmarkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBenchmark68); 

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
    // $ANTLR end "entryRuleBenchmark"


    // $ANTLR start "ruleBenchmark"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:69:1: ruleBenchmark : ( ( rule__Benchmark__Group__0 ) ) ;
    public final void ruleBenchmark() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:73:2: ( ( ( rule__Benchmark__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:74:1: ( ( rule__Benchmark__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:74:1: ( ( rule__Benchmark__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:75:1: ( rule__Benchmark__Group__0 )
            {
             before(grammarAccess.getBenchmarkAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:76:1: ( rule__Benchmark__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:76:2: rule__Benchmark__Group__0
            {
            pushFollow(FOLLOW_rule__Benchmark__Group__0_in_ruleBenchmark94);
            rule__Benchmark__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkAccess().getGroup()); 

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
    // $ANTLR end "ruleBenchmark"


    // $ANTLR start "entryRuleElement"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:89:1: ( ruleElement EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:104:1: ( rule__Element__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleScenario"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:116:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:117:1: ( ruleScenario EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:118:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario181);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario188); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:125:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:129:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:130:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:130:1: ( ( rule__Scenario__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:131:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:132:1: ( rule__Scenario__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:132:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario214);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRulePhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:144:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:145:1: ( rulePhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:146:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_rulePhase_in_entryRulePhase241);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhase248); 

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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:153:1: rulePhase : ( ( rule__Phase__Alternatives ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:157:2: ( ( ( rule__Phase__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:158:1: ( ( rule__Phase__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:158:1: ( ( rule__Phase__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:159:1: ( rule__Phase__Alternatives )
            {
             before(grammarAccess.getPhaseAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:160:1: ( rule__Phase__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:160:2: rule__Phase__Alternatives
            {
            pushFollow(FOLLOW_rule__Phase__Alternatives_in_rulePhase274);
            rule__Phase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getAlternatives()); 

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleSequencePhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:172:1: entryRuleSequencePhase : ruleSequencePhase EOF ;
    public final void entryRuleSequencePhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:173:1: ( ruleSequencePhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:174:1: ruleSequencePhase EOF
            {
             before(grammarAccess.getSequencePhaseRule()); 
            pushFollow(FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase301);
            ruleSequencePhase();

            state._fsp--;

             after(grammarAccess.getSequencePhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePhase308); 

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
    // $ANTLR end "entryRuleSequencePhase"


    // $ANTLR start "ruleSequencePhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:181:1: ruleSequencePhase : ( ( rule__SequencePhase__Group__0 ) ) ;
    public final void ruleSequencePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:185:2: ( ( ( rule__SequencePhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:186:1: ( ( rule__SequencePhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:186:1: ( ( rule__SequencePhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:187:1: ( rule__SequencePhase__Group__0 )
            {
             before(grammarAccess.getSequencePhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:188:1: ( rule__SequencePhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:188:2: rule__SequencePhase__Group__0
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__0_in_ruleSequencePhase334);
            rule__SequencePhase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequencePhaseAccess().getGroup()); 

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
    // $ANTLR end "ruleSequencePhase"


    // $ANTLR start "entryRuleIterationPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:200:1: entryRuleIterationPhase : ruleIterationPhase EOF ;
    public final void entryRuleIterationPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:201:1: ( ruleIterationPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:202:1: ruleIterationPhase EOF
            {
             before(grammarAccess.getIterationPhaseRule()); 
            pushFollow(FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase361);
            ruleIterationPhase();

            state._fsp--;

             after(grammarAccess.getIterationPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationPhase368); 

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
    // $ANTLR end "entryRuleIterationPhase"


    // $ANTLR start "ruleIterationPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:209:1: ruleIterationPhase : ( ( rule__IterationPhase__Group__0 ) ) ;
    public final void ruleIterationPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:213:2: ( ( ( rule__IterationPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:214:1: ( ( rule__IterationPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:214:1: ( ( rule__IterationPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:215:1: ( rule__IterationPhase__Group__0 )
            {
             before(grammarAccess.getIterationPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:216:1: ( rule__IterationPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:216:2: rule__IterationPhase__Group__0
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__0_in_ruleIterationPhase394);
            rule__IterationPhase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIterationPhaseAccess().getGroup()); 

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
    // $ANTLR end "ruleIterationPhase"


    // $ANTLR start "entryRuleOptionalPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:228:1: entryRuleOptionalPhase : ruleOptionalPhase EOF ;
    public final void entryRuleOptionalPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:229:1: ( ruleOptionalPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:230:1: ruleOptionalPhase EOF
            {
             before(grammarAccess.getOptionalPhaseRule()); 
            pushFollow(FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase421);
            ruleOptionalPhase();

            state._fsp--;

             after(grammarAccess.getOptionalPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalPhase428); 

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
    // $ANTLR end "entryRuleOptionalPhase"


    // $ANTLR start "ruleOptionalPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:237:1: ruleOptionalPhase : ( ( rule__OptionalPhase__Group__0 ) ) ;
    public final void ruleOptionalPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:241:2: ( ( ( rule__OptionalPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:242:1: ( ( rule__OptionalPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:242:1: ( ( rule__OptionalPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:243:1: ( rule__OptionalPhase__Group__0 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:244:1: ( rule__OptionalPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:244:2: rule__OptionalPhase__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__0_in_ruleOptionalPhase454);
            rule__OptionalPhase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalPhaseAccess().getGroup()); 

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
    // $ANTLR end "ruleOptionalPhase"


    // $ANTLR start "entryRuleAttachedPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:256:1: entryRuleAttachedPhase : ruleAttachedPhase EOF ;
    public final void entryRuleAttachedPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:257:1: ( ruleAttachedPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:258:1: ruleAttachedPhase EOF
            {
             before(grammarAccess.getAttachedPhaseRule()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase481);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getAttachedPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedPhase488); 

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
    // $ANTLR end "entryRuleAttachedPhase"


    // $ANTLR start "ruleAttachedPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:265:1: ruleAttachedPhase : ( ( rule__AttachedPhase__Alternatives ) ) ;
    public final void ruleAttachedPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:269:2: ( ( ( rule__AttachedPhase__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:270:1: ( ( rule__AttachedPhase__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:270:1: ( ( rule__AttachedPhase__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:271:1: ( rule__AttachedPhase__Alternatives )
            {
             before(grammarAccess.getAttachedPhaseAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:272:1: ( rule__AttachedPhase__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:272:2: rule__AttachedPhase__Alternatives
            {
            pushFollow(FOLLOW_rule__AttachedPhase__Alternatives_in_ruleAttachedPhase514);
            rule__AttachedPhase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttachedPhaseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttachedPhase"


    // $ANTLR start "entryRulePhaseReference"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:284:1: entryRulePhaseReference : rulePhaseReference EOF ;
    public final void entryRulePhaseReference() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:285:1: ( rulePhaseReference EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:286:1: rulePhaseReference EOF
            {
             before(grammarAccess.getPhaseReferenceRule()); 
            pushFollow(FOLLOW_rulePhaseReference_in_entryRulePhaseReference541);
            rulePhaseReference();

            state._fsp--;

             after(grammarAccess.getPhaseReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseReference548); 

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
    // $ANTLR end "entryRulePhaseReference"


    // $ANTLR start "rulePhaseReference"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:293:1: rulePhaseReference : ( ( rule__PhaseReference__PhaseAssignment ) ) ;
    public final void rulePhaseReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:297:2: ( ( ( rule__PhaseReference__PhaseAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:298:1: ( ( rule__PhaseReference__PhaseAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:298:1: ( ( rule__PhaseReference__PhaseAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:299:1: ( rule__PhaseReference__PhaseAssignment )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhaseAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:300:1: ( rule__PhaseReference__PhaseAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:300:2: rule__PhaseReference__PhaseAssignment
            {
            pushFollow(FOLLOW_rule__PhaseReference__PhaseAssignment_in_rulePhaseReference574);
            rule__PhaseReference__PhaseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPhaseReferenceAccess().getPhaseAssignment()); 

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
    // $ANTLR end "rulePhaseReference"


    // $ANTLR start "entryRuleNewPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:312:1: entryRuleNewPhase : ruleNewPhase EOF ;
    public final void entryRuleNewPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:313:1: ( ruleNewPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:314:1: ruleNewPhase EOF
            {
             before(grammarAccess.getNewPhaseRule()); 
            pushFollow(FOLLOW_ruleNewPhase_in_entryRuleNewPhase601);
            ruleNewPhase();

            state._fsp--;

             after(grammarAccess.getNewPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewPhase608); 

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
    // $ANTLR end "entryRuleNewPhase"


    // $ANTLR start "ruleNewPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:321:1: ruleNewPhase : ( ( rule__NewPhase__PhaseAssignment ) ) ;
    public final void ruleNewPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:325:2: ( ( ( rule__NewPhase__PhaseAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:326:1: ( ( rule__NewPhase__PhaseAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:326:1: ( ( rule__NewPhase__PhaseAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:327:1: ( rule__NewPhase__PhaseAssignment )
            {
             before(grammarAccess.getNewPhaseAccess().getPhaseAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:328:1: ( rule__NewPhase__PhaseAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:328:2: rule__NewPhase__PhaseAssignment
            {
            pushFollow(FOLLOW_rule__NewPhase__PhaseAssignment_in_ruleNewPhase634);
            rule__NewPhase__PhaseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNewPhaseAccess().getPhaseAssignment()); 

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
    // $ANTLR end "ruleNewPhase"


    // $ANTLR start "entryRuleAtomicPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:340:1: entryRuleAtomicPhase : ruleAtomicPhase EOF ;
    public final void entryRuleAtomicPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:341:1: ( ruleAtomicPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:342:1: ruleAtomicPhase EOF
            {
             before(grammarAccess.getAtomicPhaseRule()); 
            pushFollow(FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase661);
            ruleAtomicPhase();

            state._fsp--;

             after(grammarAccess.getAtomicPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicPhase668); 

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
    // $ANTLR end "entryRuleAtomicPhase"


    // $ANTLR start "ruleAtomicPhase"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:349:1: ruleAtomicPhase : ( ( rule__AtomicPhase__Group__0 ) ) ;
    public final void ruleAtomicPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:353:2: ( ( ( rule__AtomicPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:354:1: ( ( rule__AtomicPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:354:1: ( ( rule__AtomicPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:355:1: ( rule__AtomicPhase__Group__0 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:356:1: ( rule__AtomicPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:356:2: rule__AtomicPhase__Group__0
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0_in_ruleAtomicPhase694);
            rule__AtomicPhase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicPhaseAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomicPhase"


    // $ANTLR start "entryRuleAttachedMetric"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:368:1: entryRuleAttachedMetric : ruleAttachedMetric EOF ;
    public final void entryRuleAttachedMetric() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:369:1: ( ruleAttachedMetric EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:370:1: ruleAttachedMetric EOF
            {
             before(grammarAccess.getAttachedMetricRule()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric721);
            ruleAttachedMetric();

            state._fsp--;

             after(grammarAccess.getAttachedMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedMetric728); 

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
    // $ANTLR end "entryRuleAttachedMetric"


    // $ANTLR start "ruleAttachedMetric"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:377:1: ruleAttachedMetric : ( ( rule__AttachedMetric__Alternatives ) ) ;
    public final void ruleAttachedMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:381:2: ( ( ( rule__AttachedMetric__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:382:1: ( ( rule__AttachedMetric__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:382:1: ( ( rule__AttachedMetric__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:383:1: ( rule__AttachedMetric__Alternatives )
            {
             before(grammarAccess.getAttachedMetricAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:384:1: ( rule__AttachedMetric__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:384:2: rule__AttachedMetric__Alternatives
            {
            pushFollow(FOLLOW_rule__AttachedMetric__Alternatives_in_ruleAttachedMetric754);
            rule__AttachedMetric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttachedMetricAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttachedMetric"


    // $ANTLR start "entryRuleMetricTypeReference"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:396:1: entryRuleMetricTypeReference : ruleMetricTypeReference EOF ;
    public final void entryRuleMetricTypeReference() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:397:1: ( ruleMetricTypeReference EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:398:1: ruleMetricTypeReference EOF
            {
             before(grammarAccess.getMetricTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference781);
            ruleMetricTypeReference();

            state._fsp--;

             after(grammarAccess.getMetricTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricTypeReference788); 

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
    // $ANTLR end "entryRuleMetricTypeReference"


    // $ANTLR start "ruleMetricTypeReference"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:405:1: ruleMetricTypeReference : ( ( rule__MetricTypeReference__Group__0 ) ) ;
    public final void ruleMetricTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:409:2: ( ( ( rule__MetricTypeReference__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__MetricTypeReference__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__MetricTypeReference__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:411:1: ( rule__MetricTypeReference__Group__0 )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:1: ( rule__MetricTypeReference__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:2: rule__MetricTypeReference__Group__0
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__0_in_ruleMetricTypeReference814);
            rule__MetricTypeReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetricTypeReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleMetricTypeReference"


    // $ANTLR start "entryRuleNewMetric"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:424:1: entryRuleNewMetric : ruleNewMetric EOF ;
    public final void entryRuleNewMetric() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:425:1: ( ruleNewMetric EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:426:1: ruleNewMetric EOF
            {
             before(grammarAccess.getNewMetricRule()); 
            pushFollow(FOLLOW_ruleNewMetric_in_entryRuleNewMetric841);
            ruleNewMetric();

            state._fsp--;

             after(grammarAccess.getNewMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMetric848); 

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
    // $ANTLR end "entryRuleNewMetric"


    // $ANTLR start "ruleNewMetric"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:433:1: ruleNewMetric : ( ( rule__NewMetric__Group__0 ) ) ;
    public final void ruleNewMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:437:2: ( ( ( rule__NewMetric__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:438:1: ( ( rule__NewMetric__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:438:1: ( ( rule__NewMetric__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:439:1: ( rule__NewMetric__Group__0 )
            {
             before(grammarAccess.getNewMetricAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:440:1: ( rule__NewMetric__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:440:2: rule__NewMetric__Group__0
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0_in_ruleNewMetric874);
            rule__NewMetric__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewMetricAccess().getGroup()); 

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
    // $ANTLR end "ruleNewMetric"


    // $ANTLR start "entryRuleQualifiedName"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:452:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:453:1: ( ruleQualifiedName EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:454:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName908); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:461:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:465:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:466:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:467:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:468:1: ( rule__QualifiedName__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:468:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934);
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


    // $ANTLR start "ruleMetricType"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:481:1: ruleMetricType : ( ( rule__MetricType__Alternatives ) ) ;
    public final void ruleMetricType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:485:1: ( ( ( rule__MetricType__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:486:1: ( ( rule__MetricType__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:486:1: ( ( rule__MetricType__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:487:1: ( rule__MetricType__Alternatives )
            {
             before(grammarAccess.getMetricTypeAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:488:1: ( rule__MetricType__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:488:2: rule__MetricType__Alternatives
            {
            pushFollow(FOLLOW_rule__MetricType__Alternatives_in_ruleMetricType971);
            rule__MetricType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetricTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMetricType"


    // $ANTLR start "rule__Element__Alternatives"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:499:1: rule__Element__Alternatives : ( ( ruleScenario ) | ( rulePhase ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:503:1: ( ( ruleScenario ) | ( rulePhase ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=21 && LA1_0<=22)||LA1_0==24||LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:504:1: ( ruleScenario )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:504:1: ( ruleScenario )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:505:1: ruleScenario
                    {
                     before(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__Element__Alternatives1006);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:510:6: ( rulePhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:510:6: ( rulePhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:511:1: rulePhase
                    {
                     before(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePhase_in_rule__Element__Alternatives1023);
                    rulePhase();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Phase__Alternatives"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:521:1: rule__Phase__Alternatives : ( ( ruleSequencePhase ) | ( ruleIterationPhase ) | ( ruleOptionalPhase ) | ( ruleAtomicPhase ) );
    public final void rule__Phase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:525:1: ( ( ruleSequencePhase ) | ( ruleIterationPhase ) | ( ruleOptionalPhase ) | ( ruleAtomicPhase ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:526:1: ( ruleSequencePhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:526:1: ( ruleSequencePhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:527:1: ruleSequencePhase
                    {
                     before(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSequencePhase_in_rule__Phase__Alternatives1055);
                    ruleSequencePhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:532:6: ( ruleIterationPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:532:6: ( ruleIterationPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:533:1: ruleIterationPhase
                    {
                     before(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIterationPhase_in_rule__Phase__Alternatives1072);
                    ruleIterationPhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:538:6: ( ruleOptionalPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:538:6: ( ruleOptionalPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:539:1: ruleOptionalPhase
                    {
                     before(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOptionalPhase_in_rule__Phase__Alternatives1089);
                    ruleOptionalPhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:544:6: ( ruleAtomicPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:544:6: ( ruleAtomicPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:545:1: ruleAtomicPhase
                    {
                     before(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAtomicPhase_in_rule__Phase__Alternatives1106);
                    ruleAtomicPhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Phase__Alternatives"


    // $ANTLR start "rule__AttachedPhase__Alternatives"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:555:1: rule__AttachedPhase__Alternatives : ( ( rulePhaseReference ) | ( ruleNewPhase ) );
    public final void rule__AttachedPhase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:559:1: ( ( rulePhaseReference ) | ( ruleNewPhase ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=21 && LA3_0<=22)||LA3_0==24||LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:560:1: ( rulePhaseReference )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:560:1: ( rulePhaseReference )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:561:1: rulePhaseReference
                    {
                     before(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePhaseReference_in_rule__AttachedPhase__Alternatives1138);
                    rulePhaseReference();

                    state._fsp--;

                     after(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:566:6: ( ruleNewPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:566:6: ( ruleNewPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:567:1: ruleNewPhase
                    {
                     before(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNewPhase_in_rule__AttachedPhase__Alternatives1155);
                    ruleNewPhase();

                    state._fsp--;

                     after(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 

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
    // $ANTLR end "rule__AttachedPhase__Alternatives"


    // $ANTLR start "rule__AttachedMetric__Alternatives"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:577:1: rule__AttachedMetric__Alternatives : ( ( ruleMetricTypeReference ) | ( ruleNewMetric ) );
    public final void rule__AttachedMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:581:1: ( ( ruleMetricTypeReference ) | ( ruleNewMetric ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=18)) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:582:1: ( ruleMetricTypeReference )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:582:1: ( ruleMetricTypeReference )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:583:1: ruleMetricTypeReference
                    {
                     before(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMetricTypeReference_in_rule__AttachedMetric__Alternatives1187);
                    ruleMetricTypeReference();

                    state._fsp--;

                     after(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:588:6: ( ruleNewMetric )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:588:6: ( ruleNewMetric )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:589:1: ruleNewMetric
                    {
                     before(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNewMetric_in_rule__AttachedMetric__Alternatives1204);
                    ruleNewMetric();

                    state._fsp--;

                     after(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 

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
    // $ANTLR end "rule__AttachedMetric__Alternatives"


    // $ANTLR start "rule__MetricType__Alternatives"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:599:1: rule__MetricType__Alternatives : ( ( ( 'Time' ) ) | ( ( 'Memory' ) ) | ( ( 'Scalar' ) ) );
    public final void rule__MetricType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:603:1: ( ( ( 'Time' ) ) | ( ( 'Memory' ) ) | ( ( 'Scalar' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:604:1: ( ( 'Time' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:604:1: ( ( 'Time' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:605:1: ( 'Time' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:606:1: ( 'Time' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:606:3: 'Time'
                    {
                    match(input,16,FOLLOW_16_in_rule__MetricType__Alternatives1237); 

                    }

                     after(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:611:6: ( ( 'Memory' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:611:6: ( ( 'Memory' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:612:1: ( 'Memory' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:613:1: ( 'Memory' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:613:3: 'Memory'
                    {
                    match(input,17,FOLLOW_17_in_rule__MetricType__Alternatives1258); 

                    }

                     after(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:618:6: ( ( 'Scalar' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:618:6: ( ( 'Scalar' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:619:1: ( 'Scalar' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:620:1: ( 'Scalar' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:620:3: 'Scalar'
                    {
                    match(input,18,FOLLOW_18_in_rule__MetricType__Alternatives1279); 

                    }

                     after(grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MetricType__Alternatives"


    // $ANTLR start "rule__Benchmark__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:632:1: rule__Benchmark__Group__0 : rule__Benchmark__Group__0__Impl rule__Benchmark__Group__1 ;
    public final void rule__Benchmark__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:636:1: ( rule__Benchmark__Group__0__Impl rule__Benchmark__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:637:2: rule__Benchmark__Group__0__Impl rule__Benchmark__Group__1
            {
            pushFollow(FOLLOW_rule__Benchmark__Group__0__Impl_in_rule__Benchmark__Group__01312);
            rule__Benchmark__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Benchmark__Group__1_in_rule__Benchmark__Group__01315);
            rule__Benchmark__Group__1();

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
    // $ANTLR end "rule__Benchmark__Group__0"


    // $ANTLR start "rule__Benchmark__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:644:1: rule__Benchmark__Group__0__Impl : ( 'package' ) ;
    public final void rule__Benchmark__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:648:1: ( ( 'package' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:649:1: ( 'package' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:649:1: ( 'package' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:650:1: 'package'
            {
             before(grammarAccess.getBenchmarkAccess().getPackageKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Benchmark__Group__0__Impl1343); 
             after(grammarAccess.getBenchmarkAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__Benchmark__Group__0__Impl"


    // $ANTLR start "rule__Benchmark__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:663:1: rule__Benchmark__Group__1 : rule__Benchmark__Group__1__Impl rule__Benchmark__Group__2 ;
    public final void rule__Benchmark__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:667:1: ( rule__Benchmark__Group__1__Impl rule__Benchmark__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:668:2: rule__Benchmark__Group__1__Impl rule__Benchmark__Group__2
            {
            pushFollow(FOLLOW_rule__Benchmark__Group__1__Impl_in_rule__Benchmark__Group__11374);
            rule__Benchmark__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Benchmark__Group__2_in_rule__Benchmark__Group__11377);
            rule__Benchmark__Group__2();

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
    // $ANTLR end "rule__Benchmark__Group__1"


    // $ANTLR start "rule__Benchmark__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:675:1: rule__Benchmark__Group__1__Impl : ( ( rule__Benchmark__PackageNameAssignment_1 ) ) ;
    public final void rule__Benchmark__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:679:1: ( ( ( rule__Benchmark__PackageNameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:680:1: ( ( rule__Benchmark__PackageNameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:680:1: ( ( rule__Benchmark__PackageNameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:681:1: ( rule__Benchmark__PackageNameAssignment_1 )
            {
             before(grammarAccess.getBenchmarkAccess().getPackageNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:682:1: ( rule__Benchmark__PackageNameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:682:2: rule__Benchmark__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Benchmark__PackageNameAssignment_1_in_rule__Benchmark__Group__1__Impl1404);
            rule__Benchmark__PackageNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBenchmarkAccess().getPackageNameAssignment_1()); 

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
    // $ANTLR end "rule__Benchmark__Group__1__Impl"


    // $ANTLR start "rule__Benchmark__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:692:1: rule__Benchmark__Group__2 : rule__Benchmark__Group__2__Impl ;
    public final void rule__Benchmark__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:696:1: ( rule__Benchmark__Group__2__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:697:2: rule__Benchmark__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Benchmark__Group__2__Impl_in_rule__Benchmark__Group__21434);
            rule__Benchmark__Group__2__Impl();

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
    // $ANTLR end "rule__Benchmark__Group__2"


    // $ANTLR start "rule__Benchmark__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:703:1: rule__Benchmark__Group__2__Impl : ( ( rule__Benchmark__ElementsAssignment_2 )* ) ;
    public final void rule__Benchmark__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:707:1: ( ( ( rule__Benchmark__ElementsAssignment_2 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:708:1: ( ( rule__Benchmark__ElementsAssignment_2 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:708:1: ( ( rule__Benchmark__ElementsAssignment_2 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:709:1: ( rule__Benchmark__ElementsAssignment_2 )*
            {
             before(grammarAccess.getBenchmarkAccess().getElementsAssignment_2()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:710:1: ( rule__Benchmark__ElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=20 && LA6_0<=22)||LA6_0==24||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:710:2: rule__Benchmark__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Benchmark__ElementsAssignment_2_in_rule__Benchmark__Group__2__Impl1461);
            	    rule__Benchmark__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBenchmarkAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__Benchmark__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:726:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:730:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:731:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01498);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01501);
            rule__Scenario__Group__1();

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
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:738:1: rule__Scenario__Group__0__Impl : ( 'Scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:742:1: ( ( 'Scenario' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:743:1: ( 'Scenario' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:743:1: ( 'Scenario' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:744:1: 'Scenario'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Scenario__Group__0__Impl1529); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 

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
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:757:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:761:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:762:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11560);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11563);
            rule__Scenario__Group__2();

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
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:769:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__ClassnameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:773:1: ( ( ( rule__Scenario__ClassnameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:774:1: ( ( rule__Scenario__ClassnameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:774:1: ( ( rule__Scenario__ClassnameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:775:1: ( rule__Scenario__ClassnameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getClassnameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:776:1: ( rule__Scenario__ClassnameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:776:2: rule__Scenario__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__ClassnameAssignment_1_in_rule__Scenario__Group__1__Impl1590);
            rule__Scenario__ClassnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getClassnameAssignment_1()); 

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
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:786:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:790:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:791:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21620);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21623);
            rule__Scenario__Group__3();

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
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:798:1: rule__Scenario__Group__2__Impl : ( RULE_LBRACE ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:802:1: ( ( RULE_LBRACE ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:803:1: ( RULE_LBRACE )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:803:1: ( RULE_LBRACE )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:804:1: RULE_LBRACE
            {
             before(grammarAccess.getScenarioAccess().getLBRACETerminalRuleCall_2()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__Scenario__Group__2__Impl1650); 
             after(grammarAccess.getScenarioAccess().getLBRACETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:815:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:819:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:820:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31679);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31682);
            rule__Scenario__Group__4();

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
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:827:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__RootPhaseAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:831:1: ( ( ( rule__Scenario__RootPhaseAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:832:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:832:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:833:1: ( rule__Scenario__RootPhaseAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:834:1: ( rule__Scenario__RootPhaseAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:834:2: rule__Scenario__RootPhaseAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1709);
            rule__Scenario__RootPhaseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); 

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
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:844:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:848:1: ( rule__Scenario__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:849:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41739);
            rule__Scenario__Group__4__Impl();

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
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:855:1: rule__Scenario__Group__4__Impl : ( RULE_RBRACE ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:859:1: ( ( RULE_RBRACE ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:860:1: ( RULE_RBRACE )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:860:1: ( RULE_RBRACE )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:861:1: RULE_RBRACE
            {
             before(grammarAccess.getScenarioAccess().getRBRACETerminalRuleCall_4()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__Scenario__Group__4__Impl1766); 
             after(grammarAccess.getScenarioAccess().getRBRACETerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__SequencePhase__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:882:1: rule__SequencePhase__Group__0 : rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 ;
    public final void rule__SequencePhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:886:1: ( rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:887:2: rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01805);
            rule__SequencePhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01808);
            rule__SequencePhase__Group__1();

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
    // $ANTLR end "rule__SequencePhase__Group__0"


    // $ANTLR start "rule__SequencePhase__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:894:1: rule__SequencePhase__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__SequencePhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:898:1: ( ( 'Sequence' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:899:1: ( 'Sequence' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:899:1: ( 'Sequence' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:900:1: 'Sequence'
            {
             before(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__SequencePhase__Group__0__Impl1836); 
             after(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); 

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
    // $ANTLR end "rule__SequencePhase__Group__0__Impl"


    // $ANTLR start "rule__SequencePhase__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:913:1: rule__SequencePhase__Group__1 : rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 ;
    public final void rule__SequencePhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:917:1: ( rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:918:2: rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11867);
            rule__SequencePhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11870);
            rule__SequencePhase__Group__2();

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
    // $ANTLR end "rule__SequencePhase__Group__1"


    // $ANTLR start "rule__SequencePhase__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:925:1: rule__SequencePhase__Group__1__Impl : ( ( rule__SequencePhase__NameAssignment_1 )? ) ;
    public final void rule__SequencePhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:929:1: ( ( ( rule__SequencePhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:930:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:930:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:931:1: ( rule__SequencePhase__NameAssignment_1 )?
            {
             before(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:932:1: ( rule__SequencePhase__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:932:2: rule__SequencePhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1897);
                    rule__SequencePhase__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SequencePhase__Group__1__Impl"


    // $ANTLR start "rule__SequencePhase__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:942:1: rule__SequencePhase__Group__2 : rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 ;
    public final void rule__SequencePhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:946:1: ( rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:947:2: rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21928);
            rule__SequencePhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21931);
            rule__SequencePhase__Group__3();

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
    // $ANTLR end "rule__SequencePhase__Group__2"


    // $ANTLR start "rule__SequencePhase__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:954:1: rule__SequencePhase__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__SequencePhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:958:1: ( ( RULE_LPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:959:1: ( RULE_LPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:959:1: ( RULE_LPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:960:1: RULE_LPAR
            {
             before(grammarAccess.getSequencePhaseAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__SequencePhase__Group__2__Impl1958); 
             after(grammarAccess.getSequencePhaseAccess().getLPARTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__SequencePhase__Group__2__Impl"


    // $ANTLR start "rule__SequencePhase__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:971:1: rule__SequencePhase__Group__3 : rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 ;
    public final void rule__SequencePhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:975:1: ( rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:976:2: rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__31987);
            rule__SequencePhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__31990);
            rule__SequencePhase__Group__4();

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
    // $ANTLR end "rule__SequencePhase__Group__3"


    // $ANTLR start "rule__SequencePhase__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:983:1: rule__SequencePhase__Group__3__Impl : ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) ;
    public final void rule__SequencePhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:987:1: ( ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:988:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:988:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:989:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:989:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:990:1: ( rule__SequencePhase__PhasesAssignment_3 )
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:991:1: ( rule__SequencePhase__PhasesAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:991:2: rule__SequencePhase__PhasesAssignment_3
            {
            pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2019);
            rule__SequencePhase__PhasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 

            }

            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:994:1: ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:995:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:996:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=21 && LA8_0<=22)||LA8_0==24||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:996:2: rule__SequencePhase__PhasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2031);
            	    rule__SequencePhase__PhasesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 

            }


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
    // $ANTLR end "rule__SequencePhase__Group__3__Impl"


    // $ANTLR start "rule__SequencePhase__Group__4"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1007:1: rule__SequencePhase__Group__4 : rule__SequencePhase__Group__4__Impl ;
    public final void rule__SequencePhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1011:1: ( rule__SequencePhase__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1012:2: rule__SequencePhase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42064);
            rule__SequencePhase__Group__4__Impl();

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
    // $ANTLR end "rule__SequencePhase__Group__4"


    // $ANTLR start "rule__SequencePhase__Group__4__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1018:1: rule__SequencePhase__Group__4__Impl : ( RULE_RPAR ) ;
    public final void rule__SequencePhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1022:1: ( ( RULE_RPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1023:1: ( RULE_RPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1023:1: ( RULE_RPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1024:1: RULE_RPAR
            {
             before(grammarAccess.getSequencePhaseAccess().getRPARTerminalRuleCall_4()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__SequencePhase__Group__4__Impl2091); 
             after(grammarAccess.getSequencePhaseAccess().getRPARTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__SequencePhase__Group__4__Impl"


    // $ANTLR start "rule__IterationPhase__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1045:1: rule__IterationPhase__Group__0 : rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 ;
    public final void rule__IterationPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1049:1: ( rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1050:2: rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02130);
            rule__IterationPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02133);
            rule__IterationPhase__Group__1();

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
    // $ANTLR end "rule__IterationPhase__Group__0"


    // $ANTLR start "rule__IterationPhase__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1057:1: rule__IterationPhase__Group__0__Impl : ( 'Iteration' ) ;
    public final void rule__IterationPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1061:1: ( ( 'Iteration' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1062:1: ( 'Iteration' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1062:1: ( 'Iteration' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1063:1: 'Iteration'
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__IterationPhase__Group__0__Impl2161); 
             after(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); 

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
    // $ANTLR end "rule__IterationPhase__Group__0__Impl"


    // $ANTLR start "rule__IterationPhase__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1076:1: rule__IterationPhase__Group__1 : rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 ;
    public final void rule__IterationPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1080:1: ( rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1081:2: rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12192);
            rule__IterationPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12195);
            rule__IterationPhase__Group__2();

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
    // $ANTLR end "rule__IterationPhase__Group__1"


    // $ANTLR start "rule__IterationPhase__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1088:1: rule__IterationPhase__Group__1__Impl : ( ( rule__IterationPhase__NameAssignment_1 )? ) ;
    public final void rule__IterationPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1092:1: ( ( ( rule__IterationPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1093:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1093:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1094:1: ( rule__IterationPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1095:1: ( rule__IterationPhase__NameAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1095:2: rule__IterationPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2222);
                    rule__IterationPhase__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__IterationPhase__Group__1__Impl"


    // $ANTLR start "rule__IterationPhase__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1105:1: rule__IterationPhase__Group__2 : rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 ;
    public final void rule__IterationPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1109:1: ( rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1110:2: rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22253);
            rule__IterationPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22256);
            rule__IterationPhase__Group__3();

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
    // $ANTLR end "rule__IterationPhase__Group__2"


    // $ANTLR start "rule__IterationPhase__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1117:1: rule__IterationPhase__Group__2__Impl : ( RULE_LPAR ) ;
    public final void rule__IterationPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1121:1: ( ( RULE_LPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1122:1: ( RULE_LPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1122:1: ( RULE_LPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1123:1: RULE_LPAR
            {
             before(grammarAccess.getIterationPhaseAccess().getLPARTerminalRuleCall_2()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__IterationPhase__Group__2__Impl2283); 
             after(grammarAccess.getIterationPhaseAccess().getLPARTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__IterationPhase__Group__2__Impl"


    // $ANTLR start "rule__IterationPhase__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1134:1: rule__IterationPhase__Group__3 : rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 ;
    public final void rule__IterationPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1138:1: ( rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1139:2: rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32312);
            rule__IterationPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32315);
            rule__IterationPhase__Group__4();

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
    // $ANTLR end "rule__IterationPhase__Group__3"


    // $ANTLR start "rule__IterationPhase__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1146:1: rule__IterationPhase__Group__3__Impl : ( ( rule__IterationPhase__IterationAssignment_3 ) ) ;
    public final void rule__IterationPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1150:1: ( ( ( rule__IterationPhase__IterationAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1151:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1151:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1152:1: ( rule__IterationPhase__IterationAssignment_3 )
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1153:1: ( rule__IterationPhase__IterationAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1153:2: rule__IterationPhase__IterationAssignment_3
            {
            pushFollow(FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2342);
            rule__IterationPhase__IterationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); 

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
    // $ANTLR end "rule__IterationPhase__Group__3__Impl"


    // $ANTLR start "rule__IterationPhase__Group__4"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1163:1: rule__IterationPhase__Group__4 : rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 ;
    public final void rule__IterationPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1167:1: ( rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1168:2: rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42372);
            rule__IterationPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42375);
            rule__IterationPhase__Group__5();

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
    // $ANTLR end "rule__IterationPhase__Group__4"


    // $ANTLR start "rule__IterationPhase__Group__4__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1175:1: rule__IterationPhase__Group__4__Impl : ( '*' ) ;
    public final void rule__IterationPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1179:1: ( ( '*' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1180:1: ( '*' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1180:1: ( '*' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1181:1: '*'
            {
             before(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); 
            match(input,23,FOLLOW_23_in_rule__IterationPhase__Group__4__Impl2403); 
             after(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); 

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
    // $ANTLR end "rule__IterationPhase__Group__4__Impl"


    // $ANTLR start "rule__IterationPhase__Group__5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1194:1: rule__IterationPhase__Group__5 : rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 ;
    public final void rule__IterationPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1198:1: ( rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1199:2: rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52434);
            rule__IterationPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52437);
            rule__IterationPhase__Group__6();

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
    // $ANTLR end "rule__IterationPhase__Group__5"


    // $ANTLR start "rule__IterationPhase__Group__5__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1206:1: rule__IterationPhase__Group__5__Impl : ( ( rule__IterationPhase__PhaseAssignment_5 ) ) ;
    public final void rule__IterationPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1210:1: ( ( ( rule__IterationPhase__PhaseAssignment_5 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1211:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1211:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1212:1: ( rule__IterationPhase__PhaseAssignment_5 )
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1213:1: ( rule__IterationPhase__PhaseAssignment_5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1213:2: rule__IterationPhase__PhaseAssignment_5
            {
            pushFollow(FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2464);
            rule__IterationPhase__PhaseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); 

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
    // $ANTLR end "rule__IterationPhase__Group__5__Impl"


    // $ANTLR start "rule__IterationPhase__Group__6"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1223:1: rule__IterationPhase__Group__6 : rule__IterationPhase__Group__6__Impl ;
    public final void rule__IterationPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1227:1: ( rule__IterationPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1228:2: rule__IterationPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62494);
            rule__IterationPhase__Group__6__Impl();

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
    // $ANTLR end "rule__IterationPhase__Group__6"


    // $ANTLR start "rule__IterationPhase__Group__6__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1234:1: rule__IterationPhase__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__IterationPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1238:1: ( ( RULE_RPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1239:1: ( RULE_RPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1239:1: ( RULE_RPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1240:1: RULE_RPAR
            {
             before(grammarAccess.getIterationPhaseAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__IterationPhase__Group__6__Impl2521); 
             after(grammarAccess.getIterationPhaseAccess().getRPARTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__IterationPhase__Group__6__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1265:1: rule__OptionalPhase__Group__0 : rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 ;
    public final void rule__OptionalPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1269:1: ( rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1270:2: rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02564);
            rule__OptionalPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02567);
            rule__OptionalPhase__Group__1();

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
    // $ANTLR end "rule__OptionalPhase__Group__0"


    // $ANTLR start "rule__OptionalPhase__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1277:1: rule__OptionalPhase__Group__0__Impl : ( 'Optional' ) ;
    public final void rule__OptionalPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1281:1: ( ( 'Optional' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1282:1: ( 'Optional' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1282:1: ( 'Optional' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1283:1: 'Optional'
            {
             before(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__OptionalPhase__Group__0__Impl2595); 
             after(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__0__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1296:1: rule__OptionalPhase__Group__1 : rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 ;
    public final void rule__OptionalPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1300:1: ( rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1301:2: rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12626);
            rule__OptionalPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12629);
            rule__OptionalPhase__Group__2();

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
    // $ANTLR end "rule__OptionalPhase__Group__1"


    // $ANTLR start "rule__OptionalPhase__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1308:1: rule__OptionalPhase__Group__1__Impl : ( ( rule__OptionalPhase__NameAssignment_1 )? ) ;
    public final void rule__OptionalPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1312:1: ( ( ( rule__OptionalPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1313:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1313:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1314:1: ( rule__OptionalPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1315:1: ( rule__OptionalPhase__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1315:2: rule__OptionalPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2656);
                    rule__OptionalPhase__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__1__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1325:1: rule__OptionalPhase__Group__2 : rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 ;
    public final void rule__OptionalPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1329:1: ( rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1330:2: rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22687);
            rule__OptionalPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22690);
            rule__OptionalPhase__Group__3();

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
    // $ANTLR end "rule__OptionalPhase__Group__2"


    // $ANTLR start "rule__OptionalPhase__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1337:1: rule__OptionalPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__OptionalPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1341:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1342:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1342:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1343:1: 'ClassName'
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassNameKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__OptionalPhase__Group__2__Impl2718); 
             after(grammarAccess.getOptionalPhaseAccess().getClassNameKeyword_2()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__2__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1356:1: rule__OptionalPhase__Group__3 : rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 ;
    public final void rule__OptionalPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1360:1: ( rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1361:2: rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32749);
            rule__OptionalPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32752);
            rule__OptionalPhase__Group__4();

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
    // $ANTLR end "rule__OptionalPhase__Group__3"


    // $ANTLR start "rule__OptionalPhase__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1368:1: rule__OptionalPhase__Group__3__Impl : ( ( rule__OptionalPhase__ClassnameAssignment_3 ) ) ;
    public final void rule__OptionalPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1372:1: ( ( ( rule__OptionalPhase__ClassnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1373:1: ( ( rule__OptionalPhase__ClassnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1373:1: ( ( rule__OptionalPhase__ClassnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1374:1: ( rule__OptionalPhase__ClassnameAssignment_3 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1375:1: ( rule__OptionalPhase__ClassnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1375:2: rule__OptionalPhase__ClassnameAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__ClassnameAssignment_3_in_rule__OptionalPhase__Group__3__Impl2779);
            rule__OptionalPhase__ClassnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionalPhaseAccess().getClassnameAssignment_3()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__3__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__4"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1385:1: rule__OptionalPhase__Group__4 : rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5 ;
    public final void rule__OptionalPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1389:1: ( rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1390:2: rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42809);
            rule__OptionalPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__5_in_rule__OptionalPhase__Group__42812);
            rule__OptionalPhase__Group__5();

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
    // $ANTLR end "rule__OptionalPhase__Group__4"


    // $ANTLR start "rule__OptionalPhase__Group__4__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1397:1: rule__OptionalPhase__Group__4__Impl : ( RULE_LPAR ) ;
    public final void rule__OptionalPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1401:1: ( ( RULE_LPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1402:1: ( RULE_LPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1402:1: ( RULE_LPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1403:1: RULE_LPAR
            {
             before(grammarAccess.getOptionalPhaseAccess().getLPARTerminalRuleCall_4()); 
            match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_rule__OptionalPhase__Group__4__Impl2839); 
             after(grammarAccess.getOptionalPhaseAccess().getLPARTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__4__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1414:1: rule__OptionalPhase__Group__5 : rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6 ;
    public final void rule__OptionalPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1418:1: ( rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1419:2: rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__5__Impl_in_rule__OptionalPhase__Group__52868);
            rule__OptionalPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__6_in_rule__OptionalPhase__Group__52871);
            rule__OptionalPhase__Group__6();

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
    // $ANTLR end "rule__OptionalPhase__Group__5"


    // $ANTLR start "rule__OptionalPhase__Group__5__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1426:1: rule__OptionalPhase__Group__5__Impl : ( ( rule__OptionalPhase__PhaseAssignment_5 ) ) ;
    public final void rule__OptionalPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1430:1: ( ( ( rule__OptionalPhase__PhaseAssignment_5 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1431:1: ( ( rule__OptionalPhase__PhaseAssignment_5 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1431:1: ( ( rule__OptionalPhase__PhaseAssignment_5 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1432:1: ( rule__OptionalPhase__PhaseAssignment_5 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1433:1: ( rule__OptionalPhase__PhaseAssignment_5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1433:2: rule__OptionalPhase__PhaseAssignment_5
            {
            pushFollow(FOLLOW_rule__OptionalPhase__PhaseAssignment_5_in_rule__OptionalPhase__Group__5__Impl2898);
            rule__OptionalPhase__PhaseAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_5()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__5__Impl"


    // $ANTLR start "rule__OptionalPhase__Group__6"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1443:1: rule__OptionalPhase__Group__6 : rule__OptionalPhase__Group__6__Impl ;
    public final void rule__OptionalPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1447:1: ( rule__OptionalPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1448:2: rule__OptionalPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__6__Impl_in_rule__OptionalPhase__Group__62928);
            rule__OptionalPhase__Group__6__Impl();

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
    // $ANTLR end "rule__OptionalPhase__Group__6"


    // $ANTLR start "rule__OptionalPhase__Group__6__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1454:1: rule__OptionalPhase__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__OptionalPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1458:1: ( ( RULE_RPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1459:1: ( RULE_RPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1459:1: ( RULE_RPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1460:1: RULE_RPAR
            {
             before(grammarAccess.getOptionalPhaseAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__OptionalPhase__Group__6__Impl2955); 
             after(grammarAccess.getOptionalPhaseAccess().getRPARTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__OptionalPhase__Group__6__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1485:1: rule__AtomicPhase__Group__0 : rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 ;
    public final void rule__AtomicPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1489:1: ( rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1490:2: rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02998);
            rule__AtomicPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__03001);
            rule__AtomicPhase__Group__1();

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
    // $ANTLR end "rule__AtomicPhase__Group__0"


    // $ANTLR start "rule__AtomicPhase__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1497:1: rule__AtomicPhase__Group__0__Impl : ( 'Atomic' ) ;
    public final void rule__AtomicPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1501:1: ( ( 'Atomic' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1502:1: ( 'Atomic' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1502:1: ( 'Atomic' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1503:1: 'Atomic'
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__AtomicPhase__Group__0__Impl3029); 
             after(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__0__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1516:1: rule__AtomicPhase__Group__1 : rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 ;
    public final void rule__AtomicPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1520:1: ( rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1521:2: rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__13060);
            rule__AtomicPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__13063);
            rule__AtomicPhase__Group__2();

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
    // $ANTLR end "rule__AtomicPhase__Group__1"


    // $ANTLR start "rule__AtomicPhase__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1528:1: rule__AtomicPhase__Group__1__Impl : ( ( rule__AtomicPhase__NameAssignment_1 )? ) ;
    public final void rule__AtomicPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1532:1: ( ( ( rule__AtomicPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1533:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1533:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1534:1: ( rule__AtomicPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1535:1: ( rule__AtomicPhase__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1535:2: rule__AtomicPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3090);
                    rule__AtomicPhase__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__1__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1545:1: rule__AtomicPhase__Group__2 : rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 ;
    public final void rule__AtomicPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1549:1: ( rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1550:2: rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23121);
            rule__AtomicPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23124);
            rule__AtomicPhase__Group__3();

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
    // $ANTLR end "rule__AtomicPhase__Group__2"


    // $ANTLR start "rule__AtomicPhase__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1557:1: rule__AtomicPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__AtomicPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1561:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1562:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1562:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1563:1: 'ClassName'
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3152); 
             after(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__2__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1576:1: rule__AtomicPhase__Group__3 : rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 ;
    public final void rule__AtomicPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1580:1: ( rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1581:2: rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33183);
            rule__AtomicPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33186);
            rule__AtomicPhase__Group__4();

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
    // $ANTLR end "rule__AtomicPhase__Group__3"


    // $ANTLR start "rule__AtomicPhase__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1588:1: rule__AtomicPhase__Group__3__Impl : ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) ;
    public final void rule__AtomicPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1592:1: ( ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1593:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1593:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1594:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1595:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1595:2: rule__AtomicPhase__ClassnameAssignment_3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3213);
            rule__AtomicPhase__ClassnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__3__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__4"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1605:1: rule__AtomicPhase__Group__4 : rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 ;
    public final void rule__AtomicPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1609:1: ( rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1610:2: rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43243);
            rule__AtomicPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43246);
            rule__AtomicPhase__Group__5();

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
    // $ANTLR end "rule__AtomicPhase__Group__4"


    // $ANTLR start "rule__AtomicPhase__Group__4__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1617:1: rule__AtomicPhase__Group__4__Impl : ( RULE_METRICS ) ;
    public final void rule__AtomicPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1621:1: ( ( RULE_METRICS ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1622:1: ( RULE_METRICS )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1622:1: ( RULE_METRICS )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1623:1: RULE_METRICS
            {
             before(grammarAccess.getAtomicPhaseAccess().getMETRICSTerminalRuleCall_4()); 
            match(input,RULE_METRICS,FOLLOW_RULE_METRICS_in_rule__AtomicPhase__Group__4__Impl3273); 
             after(grammarAccess.getAtomicPhaseAccess().getMETRICSTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__4__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1634:1: rule__AtomicPhase__Group__5 : rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 ;
    public final void rule__AtomicPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1638:1: ( rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1639:2: rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53302);
            rule__AtomicPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53305);
            rule__AtomicPhase__Group__6();

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
    // $ANTLR end "rule__AtomicPhase__Group__5"


    // $ANTLR start "rule__AtomicPhase__Group__5__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1646:1: rule__AtomicPhase__Group__5__Impl : ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) ;
    public final void rule__AtomicPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1650:1: ( ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1651:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1651:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1652:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1653:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=16 && LA12_0<=18)||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1653:2: rule__AtomicPhase__MetricsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3332);
            	    rule__AtomicPhase__MetricsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__5__Impl"


    // $ANTLR start "rule__AtomicPhase__Group__6"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1663:1: rule__AtomicPhase__Group__6 : rule__AtomicPhase__Group__6__Impl ;
    public final void rule__AtomicPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1667:1: ( rule__AtomicPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1668:2: rule__AtomicPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63363);
            rule__AtomicPhase__Group__6__Impl();

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
    // $ANTLR end "rule__AtomicPhase__Group__6"


    // $ANTLR start "rule__AtomicPhase__Group__6__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1674:1: rule__AtomicPhase__Group__6__Impl : ( RULE_RPAR ) ;
    public final void rule__AtomicPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1678:1: ( ( RULE_RPAR ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1679:1: ( RULE_RPAR )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1679:1: ( RULE_RPAR )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1680:1: RULE_RPAR
            {
             before(grammarAccess.getAtomicPhaseAccess().getRPARTerminalRuleCall_6()); 
            match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_rule__AtomicPhase__Group__6__Impl3390); 
             after(grammarAccess.getAtomicPhaseAccess().getRPARTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__AtomicPhase__Group__6__Impl"


    // $ANTLR start "rule__MetricTypeReference__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1705:1: rule__MetricTypeReference__Group__0 : rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1 ;
    public final void rule__MetricTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1709:1: ( rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1710:2: rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__0__Impl_in_rule__MetricTypeReference__Group__03433);
            rule__MetricTypeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricTypeReference__Group__1_in_rule__MetricTypeReference__Group__03436);
            rule__MetricTypeReference__Group__1();

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
    // $ANTLR end "rule__MetricTypeReference__Group__0"


    // $ANTLR start "rule__MetricTypeReference__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1717:1: rule__MetricTypeReference__Group__0__Impl : ( ( rule__MetricTypeReference__MetricAssignment_0 ) ) ;
    public final void rule__MetricTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1721:1: ( ( ( rule__MetricTypeReference__MetricAssignment_0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1722:1: ( ( rule__MetricTypeReference__MetricAssignment_0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1722:1: ( ( rule__MetricTypeReference__MetricAssignment_0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1723:1: ( rule__MetricTypeReference__MetricAssignment_0 )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1724:1: ( rule__MetricTypeReference__MetricAssignment_0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1724:2: rule__MetricTypeReference__MetricAssignment_0
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricAssignment_0_in_rule__MetricTypeReference__Group__0__Impl3463);
            rule__MetricTypeReference__MetricAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment_0()); 

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
    // $ANTLR end "rule__MetricTypeReference__Group__0__Impl"


    // $ANTLR start "rule__MetricTypeReference__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1734:1: rule__MetricTypeReference__Group__1 : rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2 ;
    public final void rule__MetricTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1738:1: ( rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1739:2: rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__1__Impl_in_rule__MetricTypeReference__Group__13493);
            rule__MetricTypeReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricTypeReference__Group__2_in_rule__MetricTypeReference__Group__13496);
            rule__MetricTypeReference__Group__2();

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
    // $ANTLR end "rule__MetricTypeReference__Group__1"


    // $ANTLR start "rule__MetricTypeReference__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1746:1: rule__MetricTypeReference__Group__1__Impl : ( 'ID' ) ;
    public final void rule__MetricTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1750:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1751:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1751:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1752:1: 'ID'
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getIDKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__MetricTypeReference__Group__1__Impl3524); 
             after(grammarAccess.getMetricTypeReferenceAccess().getIDKeyword_1()); 

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
    // $ANTLR end "rule__MetricTypeReference__Group__1__Impl"


    // $ANTLR start "rule__MetricTypeReference__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1765:1: rule__MetricTypeReference__Group__2 : rule__MetricTypeReference__Group__2__Impl ;
    public final void rule__MetricTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1769:1: ( rule__MetricTypeReference__Group__2__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1770:2: rule__MetricTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__2__Impl_in_rule__MetricTypeReference__Group__23555);
            rule__MetricTypeReference__Group__2__Impl();

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
    // $ANTLR end "rule__MetricTypeReference__Group__2"


    // $ANTLR start "rule__MetricTypeReference__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1776:1: rule__MetricTypeReference__Group__2__Impl : ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) ) ;
    public final void rule__MetricTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1780:1: ( ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1781:1: ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1781:1: ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1782:1: ( rule__MetricTypeReference__MetricnameAssignment_2 )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricnameAssignment_2()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1783:1: ( rule__MetricTypeReference__MetricnameAssignment_2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1783:2: rule__MetricTypeReference__MetricnameAssignment_2
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricnameAssignment_2_in_rule__MetricTypeReference__Group__2__Impl3582);
            rule__MetricTypeReference__MetricnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMetricTypeReferenceAccess().getMetricnameAssignment_2()); 

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
    // $ANTLR end "rule__MetricTypeReference__Group__2__Impl"


    // $ANTLR start "rule__NewMetric__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1799:1: rule__NewMetric__Group__0 : rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 ;
    public final void rule__NewMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1803:1: ( rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1804:2: rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03618);
            rule__NewMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03621);
            rule__NewMetric__Group__1();

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
    // $ANTLR end "rule__NewMetric__Group__0"


    // $ANTLR start "rule__NewMetric__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1811:1: rule__NewMetric__Group__0__Impl : ( 'new Metric ClassName' ) ;
    public final void rule__NewMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1815:1: ( ( 'new Metric ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1816:1: ( 'new Metric ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1816:1: ( 'new Metric ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1817:1: 'new Metric ClassName'
            {
             before(grammarAccess.getNewMetricAccess().getNewMetricClassNameKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__NewMetric__Group__0__Impl3649); 
             after(grammarAccess.getNewMetricAccess().getNewMetricClassNameKeyword_0()); 

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
    // $ANTLR end "rule__NewMetric__Group__0__Impl"


    // $ANTLR start "rule__NewMetric__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1830:1: rule__NewMetric__Group__1 : rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 ;
    public final void rule__NewMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1834:1: ( rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1835:2: rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13680);
            rule__NewMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13683);
            rule__NewMetric__Group__2();

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
    // $ANTLR end "rule__NewMetric__Group__1"


    // $ANTLR start "rule__NewMetric__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1842:1: rule__NewMetric__Group__1__Impl : ( ( rule__NewMetric__ClassnameAssignment_1 ) ) ;
    public final void rule__NewMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1846:1: ( ( ( rule__NewMetric__ClassnameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1847:1: ( ( rule__NewMetric__ClassnameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1847:1: ( ( rule__NewMetric__ClassnameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1848:1: ( rule__NewMetric__ClassnameAssignment_1 )
            {
             before(grammarAccess.getNewMetricAccess().getClassnameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1849:1: ( rule__NewMetric__ClassnameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1849:2: rule__NewMetric__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__NewMetric__ClassnameAssignment_1_in_rule__NewMetric__Group__1__Impl3710);
            rule__NewMetric__ClassnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewMetricAccess().getClassnameAssignment_1()); 

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
    // $ANTLR end "rule__NewMetric__Group__1__Impl"


    // $ANTLR start "rule__NewMetric__Group__2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1859:1: rule__NewMetric__Group__2 : rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3 ;
    public final void rule__NewMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1863:1: ( rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1864:2: rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23740);
            rule__NewMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__3_in_rule__NewMetric__Group__23743);
            rule__NewMetric__Group__3();

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
    // $ANTLR end "rule__NewMetric__Group__2"


    // $ANTLR start "rule__NewMetric__Group__2__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1871:1: rule__NewMetric__Group__2__Impl : ( 'ID' ) ;
    public final void rule__NewMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1875:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1876:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1876:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1877:1: 'ID'
            {
             before(grammarAccess.getNewMetricAccess().getIDKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__NewMetric__Group__2__Impl3771); 
             after(grammarAccess.getNewMetricAccess().getIDKeyword_2()); 

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
    // $ANTLR end "rule__NewMetric__Group__2__Impl"


    // $ANTLR start "rule__NewMetric__Group__3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1890:1: rule__NewMetric__Group__3 : rule__NewMetric__Group__3__Impl ;
    public final void rule__NewMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1894:1: ( rule__NewMetric__Group__3__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1895:2: rule__NewMetric__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__3__Impl_in_rule__NewMetric__Group__33802);
            rule__NewMetric__Group__3__Impl();

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
    // $ANTLR end "rule__NewMetric__Group__3"


    // $ANTLR start "rule__NewMetric__Group__3__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1901:1: rule__NewMetric__Group__3__Impl : ( ( rule__NewMetric__MetricnameAssignment_3 ) ) ;
    public final void rule__NewMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1905:1: ( ( ( rule__NewMetric__MetricnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1906:1: ( ( rule__NewMetric__MetricnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1906:1: ( ( rule__NewMetric__MetricnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1907:1: ( rule__NewMetric__MetricnameAssignment_3 )
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1908:1: ( rule__NewMetric__MetricnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1908:2: rule__NewMetric__MetricnameAssignment_3
            {
            pushFollow(FOLLOW_rule__NewMetric__MetricnameAssignment_3_in_rule__NewMetric__Group__3__Impl3829);
            rule__NewMetric__MetricnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNewMetricAccess().getMetricnameAssignment_3()); 

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
    // $ANTLR end "rule__NewMetric__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1926:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1930:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1931:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03867);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03870);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1938:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1942:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1943:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1943:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1944:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3897); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1955:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1959:1: ( rule__QualifiedName__Group__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1960:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13926);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1966:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1970:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1971:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1971:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1972:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1973:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1973:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3953);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1987:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1991:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1992:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03988);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03991);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1999:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2003:1: ( ( '.' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2004:1: ( '.' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2004:1: ( '.' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2005:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4019); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2018:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2022:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2023:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14050);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2029:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2033:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2034:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2034:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2035:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4077); 
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


    // $ANTLR start "rule__Benchmark__PackageNameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2051:1: rule__Benchmark__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Benchmark__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2055:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2056:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2056:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2057:1: ruleQualifiedName
            {
             before(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_14115);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Benchmark__PackageNameAssignment_1"


    // $ANTLR start "rule__Benchmark__ElementsAssignment_2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2066:1: rule__Benchmark__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Benchmark__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2070:1: ( ( ruleElement ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2071:1: ( ruleElement )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2071:1: ( ruleElement )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2072:1: ruleElement
            {
             before(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_24146);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Benchmark__ElementsAssignment_2"


    // $ANTLR start "rule__Scenario__ClassnameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2081:1: rule__Scenario__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2085:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2086:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2086:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2087:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Scenario__ClassnameAssignment_14177); 
             after(grammarAccess.getScenarioAccess().getClassnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scenario__ClassnameAssignment_1"


    // $ANTLR start "rule__Scenario__RootPhaseAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2096:1: rule__Scenario__RootPhaseAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__Scenario__RootPhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2100:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2101:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2101:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2102:1: ruleAttachedPhase
            {
             before(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__Scenario__RootPhaseAssignment_34208);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenario__RootPhaseAssignment_3"


    // $ANTLR start "rule__SequencePhase__NameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2111:1: rule__SequencePhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequencePhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2115:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2117:1: RULE_ID
            {
             before(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14239); 
             after(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SequencePhase__NameAssignment_1"


    // $ANTLR start "rule__SequencePhase__PhasesAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2126:1: rule__SequencePhase__PhasesAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__SequencePhase__PhasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2130:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2131:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2131:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2132:1: ruleAttachedPhase
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34270);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SequencePhase__PhasesAssignment_3"


    // $ANTLR start "rule__IterationPhase__NameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2141:1: rule__IterationPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IterationPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2145:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2146:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2146:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2147:1: RULE_ID
            {
             before(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14301); 
             after(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__IterationPhase__NameAssignment_1"


    // $ANTLR start "rule__IterationPhase__IterationAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2156:1: rule__IterationPhase__IterationAssignment_3 : ( RULE_INT ) ;
    public final void rule__IterationPhase__IterationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2160:1: ( ( RULE_INT ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2161:1: ( RULE_INT )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2161:1: ( RULE_INT )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2162:1: RULE_INT
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34332); 
             after(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__IterationPhase__IterationAssignment_3"


    // $ANTLR start "rule__IterationPhase__PhaseAssignment_5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2171:1: rule__IterationPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__IterationPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2175:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2176:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2176:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2177:1: ruleAttachedPhase
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54363);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IterationPhase__PhaseAssignment_5"


    // $ANTLR start "rule__OptionalPhase__NameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2186:1: rule__OptionalPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2190:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2191:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2191:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2192:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14394); 
             after(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__OptionalPhase__NameAssignment_1"


    // $ANTLR start "rule__OptionalPhase__ClassnameAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2201:1: rule__OptionalPhase__ClassnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__ClassnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2205:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2206:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2206:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2207:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__ClassnameAssignment_34425); 
             after(grammarAccess.getOptionalPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__OptionalPhase__ClassnameAssignment_3"


    // $ANTLR start "rule__OptionalPhase__PhaseAssignment_5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2216:1: rule__OptionalPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__OptionalPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2220:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2221:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2221:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2222:1: ruleAttachedPhase
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_54456);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__OptionalPhase__PhaseAssignment_5"


    // $ANTLR start "rule__PhaseReference__PhaseAssignment"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2231:1: rule__PhaseReference__PhaseAssignment : ( ( RULE_ID ) ) ;
    public final void rule__PhaseReference__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2235:1: ( ( ( RULE_ID ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2236:1: ( ( RULE_ID ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2236:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2237:1: ( RULE_ID )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2238:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2239:1: RULE_ID
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4491); 
             after(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 

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
    // $ANTLR end "rule__PhaseReference__PhaseAssignment"


    // $ANTLR start "rule__NewPhase__PhaseAssignment"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2250:1: rule__NewPhase__PhaseAssignment : ( rulePhase ) ;
    public final void rule__NewPhase__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2254:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2255:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2255:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2256:1: rulePhase
            {
             before(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4526);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 

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
    // $ANTLR end "rule__NewPhase__PhaseAssignment"


    // $ANTLR start "rule__AtomicPhase__NameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2265:1: rule__AtomicPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2269:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2270:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2270:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2271:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14557); 
             after(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AtomicPhase__NameAssignment_1"


    // $ANTLR start "rule__AtomicPhase__ClassnameAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2280:1: rule__AtomicPhase__ClassnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__ClassnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2284:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2285:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2285:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2286:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__ClassnameAssignment_34588); 
             after(grammarAccess.getAtomicPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__AtomicPhase__ClassnameAssignment_3"


    // $ANTLR start "rule__AtomicPhase__MetricsAssignment_5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2295:1: rule__AtomicPhase__MetricsAssignment_5 : ( ruleAttachedMetric ) ;
    public final void rule__AtomicPhase__MetricsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2299:1: ( ( ruleAttachedMetric ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2300:1: ( ruleAttachedMetric )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2300:1: ( ruleAttachedMetric )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2301:1: ruleAttachedMetric
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54619);
            ruleAttachedMetric();

            state._fsp--;

             after(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__AtomicPhase__MetricsAssignment_5"


    // $ANTLR start "rule__MetricTypeReference__MetricAssignment_0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2310:1: rule__MetricTypeReference__MetricAssignment_0 : ( ruleMetricType ) ;
    public final void rule__MetricTypeReference__MetricAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2314:1: ( ( ruleMetricType ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2315:1: ( ruleMetricType )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2315:1: ( ruleMetricType )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2316:1: ruleMetricType
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment_04650);
            ruleMetricType();

            state._fsp--;

             after(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__MetricTypeReference__MetricAssignment_0"


    // $ANTLR start "rule__MetricTypeReference__MetricnameAssignment_2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2325:1: rule__MetricTypeReference__MetricnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MetricTypeReference__MetricnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2329:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2330:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2330:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2331:1: RULE_ID
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetricTypeReference__MetricnameAssignment_24681); 
             after(grammarAccess.getMetricTypeReferenceAccess().getMetricnameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MetricTypeReference__MetricnameAssignment_2"


    // $ANTLR start "rule__NewMetric__ClassnameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2340:1: rule__NewMetric__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewMetric__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2344:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2345:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2345:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2346:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__ClassnameAssignment_14712); 
             after(grammarAccess.getNewMetricAccess().getClassnameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NewMetric__ClassnameAssignment_1"


    // $ANTLR start "rule__NewMetric__MetricnameAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2355:1: rule__NewMetric__MetricnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__NewMetric__MetricnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2359:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2360:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2360:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2361:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__MetricnameAssignment_34743); 
             after(grammarAccess.getNewMetricAccess().getMetricnameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__NewMetric__MetricnameAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBenchmark_in_entryRuleBenchmark61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBenchmark68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__0_in_ruleBenchmark94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_entryRulePhase241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhase248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phase__Alternatives_in_rulePhase274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePhase308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__0_in_ruleSequencePhase334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationPhase368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0_in_ruleIterationPhase394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalPhase428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0_in_ruleOptionalPhase454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedPhase488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttachedPhase__Alternatives_in_ruleAttachedPhase514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_entryRulePhaseReference541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseReference548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhaseReference__PhaseAssignment_in_rulePhaseReference574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_entryRuleNewPhase601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewPhase608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewPhase__PhaseAssignment_in_ruleNewPhase634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicPhase668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0_in_ruleAtomicPhase694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedMetric728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttachedMetric__Alternatives_in_ruleAttachedMetric754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricTypeReference788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__0_in_ruleMetricTypeReference814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_entryRuleNewMetric841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMetric848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0_in_ruleNewMetric874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricType__Alternatives_in_ruleMetricType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__Element__Alternatives1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__Element__Alternatives1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_rule__Phase__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_rule__Phase__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_rule__Phase__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_rule__Phase__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_rule__AttachedPhase__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_rule__AttachedPhase__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_rule__AttachedMetric__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_rule__AttachedMetric__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MetricType__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MetricType__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MetricType__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__0__Impl_in_rule__Benchmark__Group__01312 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1_in_rule__Benchmark__Group__01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Benchmark__Group__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1__Impl_in_rule__Benchmark__Group__11374 = new BitSet(new long[]{0x0000000005700000L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2_in_rule__Benchmark__Group__11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__PackageNameAssignment_1_in_rule__Benchmark__Group__1__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2__Impl_in_rule__Benchmark__Group__21434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__ElementsAssignment_2_in_rule__Benchmark__Group__2__Impl1461 = new BitSet(new long[]{0x0000000005700002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01498 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Scenario__Group__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ClassnameAssignment_1_in_rule__Scenario__Group__1__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21620 = new BitSet(new long[]{0x0000000005700200L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__Scenario__Group__2__Impl1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31679 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__Scenario__Group__4__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01805 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SequencePhase__Group__0__Impl1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11867 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21928 = new BitSet(new long[]{0x0000000005700200L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__SequencePhase__Group__2__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__31987 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__31990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2019 = new BitSet(new long[]{0x0000000005700202L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2031 = new BitSet(new long[]{0x0000000005700202L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__SequencePhase__Group__4__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02130 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IterationPhase__Group__0__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12192 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22253 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__IterationPhase__Group__2__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32312 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42372 = new BitSet(new long[]{0x0000000005700200L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__IterationPhase__Group__4__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52434 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__IterationPhase__Group__6__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02564 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OptionalPhase__Group__0__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12626 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22687 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__OptionalPhase__Group__2__Impl2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32749 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__ClassnameAssignment_3_in_rule__OptionalPhase__Group__3__Impl2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42809 = new BitSet(new long[]{0x0000000005700200L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__5_in_rule__OptionalPhase__Group__42812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAR_in_rule__OptionalPhase__Group__4__Impl2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__5__Impl_in_rule__OptionalPhase__Group__52868 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__6_in_rule__OptionalPhase__Group__52871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__PhaseAssignment_5_in_rule__OptionalPhase__Group__5__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__6__Impl_in_rule__OptionalPhase__Group__62928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__OptionalPhase__Group__6__Impl2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02998 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__03001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomicPhase__Group__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__13060 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__13063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23121 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43243 = new BitSet(new long[]{0x0000000010070080L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METRICS_in_rule__AtomicPhase__Group__4__Impl3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53302 = new BitSet(new long[]{0x0000000010070080L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3332 = new BitSet(new long[]{0x0000000010070002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAR_in_rule__AtomicPhase__Group__6__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__0__Impl_in_rule__MetricTypeReference__Group__03433 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__1_in_rule__MetricTypeReference__Group__03436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricAssignment_0_in_rule__MetricTypeReference__Group__0__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__1__Impl_in_rule__MetricTypeReference__Group__13493 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__2_in_rule__MetricTypeReference__Group__13496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MetricTypeReference__Group__1__Impl3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__2__Impl_in_rule__MetricTypeReference__Group__23555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricnameAssignment_2_in_rule__MetricTypeReference__Group__2__Impl3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03618 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NewMetric__Group__0__Impl3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13680 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__ClassnameAssignment_1_in_rule__NewMetric__Group__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23740 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__3_in_rule__NewMetric__Group__23743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NewMetric__Group__2__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__3__Impl_in_rule__NewMetric__Group__33802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__MetricnameAssignment_3_in_rule__NewMetric__Group__3__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03867 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3953 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03988 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_24146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__ClassnameAssignment_14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__Scenario__RootPhaseAssignment_34208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__ClassnameAssignment_34425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_54456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__ClassnameAssignment_34588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment_04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetricTypeReference__MetricnameAssignment_24681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__ClassnameAssignment_14712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__MetricnameAssignment_34743 = new BitSet(new long[]{0x0000000000000002L});

}