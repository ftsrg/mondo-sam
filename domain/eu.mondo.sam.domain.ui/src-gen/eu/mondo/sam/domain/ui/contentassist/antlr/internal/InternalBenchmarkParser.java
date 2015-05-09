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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Time'", "'Memory'", "'Scalar'", "'package'", "'Scenario'", "'{'", "'}'", "'Sequence'", "'('", "')'", "'Iteration'", "'*'", "'Optional'", "'Atomic'", "'ClassName'", "'Metrics('", "'new Metric'", "'ID'", "'.'"
    };
    public static final int RULE_ID=4;
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
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:405:1: ruleMetricTypeReference : ( ( rule__MetricTypeReference__MetricAssignment ) ) ;
    public final void ruleMetricTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:409:2: ( ( ( rule__MetricTypeReference__MetricAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__MetricTypeReference__MetricAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__MetricTypeReference__MetricAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:411:1: ( rule__MetricTypeReference__MetricAssignment )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:1: ( rule__MetricTypeReference__MetricAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:2: rule__MetricTypeReference__MetricAssignment
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricAssignment_in_ruleMetricTypeReference814);
            rule__MetricTypeReference__MetricAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment()); 

            }


            }

        }
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

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==18||LA1_0==21||(LA1_0>=23 && LA1_0<=24)) ) {
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
            case 18:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
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
            else if ( (LA3_0==18||LA3_0==21||(LA3_0>=23 && LA3_0<=24)) ) {
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

            if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
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
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
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
                    match(input,11,FOLLOW_11_in_rule__MetricType__Alternatives1237); 

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
                    match(input,12,FOLLOW_12_in_rule__MetricType__Alternatives1258); 

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
                    match(input,13,FOLLOW_13_in_rule__MetricType__Alternatives1279); 

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
            match(input,14,FOLLOW_14_in_rule__Benchmark__Group__0__Impl1343); 
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

                if ( (LA6_0==15||LA6_0==18||LA6_0==21||(LA6_0>=23 && LA6_0<=24)) ) {
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
            match(input,15,FOLLOW_15_in_rule__Scenario__Group__0__Impl1529); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:798:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:802:1: ( ( '{' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:803:1: ( '{' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:803:1: ( '{' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:804:1: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Scenario__Group__2__Impl1651); 
             after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:817:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:821:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:822:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31682);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31685);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:829:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__RootPhaseAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:833:1: ( ( ( rule__Scenario__RootPhaseAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:834:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:834:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:835:1: ( rule__Scenario__RootPhaseAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:836:1: ( rule__Scenario__RootPhaseAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:836:2: rule__Scenario__RootPhaseAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1712);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:846:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:850:1: ( rule__Scenario__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:851:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41742);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:857:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:861:1: ( ( '}' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:862:1: ( '}' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:862:1: ( '}' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:863:1: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Scenario__Group__4__Impl1770); 
             after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:886:1: rule__SequencePhase__Group__0 : rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 ;
    public final void rule__SequencePhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:890:1: ( rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:891:2: rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01811);
            rule__SequencePhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01814);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:898:1: rule__SequencePhase__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__SequencePhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:902:1: ( ( 'Sequence' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:903:1: ( 'Sequence' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:903:1: ( 'Sequence' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:904:1: 'Sequence'
            {
             before(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SequencePhase__Group__0__Impl1842); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:917:1: rule__SequencePhase__Group__1 : rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 ;
    public final void rule__SequencePhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:921:1: ( rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:922:2: rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11873);
            rule__SequencePhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11876);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:929:1: rule__SequencePhase__Group__1__Impl : ( ( rule__SequencePhase__NameAssignment_1 )? ) ;
    public final void rule__SequencePhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:933:1: ( ( ( rule__SequencePhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:934:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:934:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:935:1: ( rule__SequencePhase__NameAssignment_1 )?
            {
             before(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:936:1: ( rule__SequencePhase__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:936:2: rule__SequencePhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1903);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:946:1: rule__SequencePhase__Group__2 : rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 ;
    public final void rule__SequencePhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:950:1: ( rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:951:2: rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21934);
            rule__SequencePhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21937);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:958:1: rule__SequencePhase__Group__2__Impl : ( '(' ) ;
    public final void rule__SequencePhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:962:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:963:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:963:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:964:1: '('
            {
             before(grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__SequencePhase__Group__2__Impl1965); 
             after(grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:977:1: rule__SequencePhase__Group__3 : rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 ;
    public final void rule__SequencePhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:981:1: ( rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:982:2: rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__31996);
            rule__SequencePhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__31999);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:989:1: rule__SequencePhase__Group__3__Impl : ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) ;
    public final void rule__SequencePhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:993:1: ( ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:994:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:994:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:995:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:995:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:996:1: ( rule__SequencePhase__PhasesAssignment_3 )
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:997:1: ( rule__SequencePhase__PhasesAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:997:2: rule__SequencePhase__PhasesAssignment_3
            {
            pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2028);
            rule__SequencePhase__PhasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 

            }

            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1000:1: ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1001:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1002:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==21||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1002:2: rule__SequencePhase__PhasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2040);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1013:1: rule__SequencePhase__Group__4 : rule__SequencePhase__Group__4__Impl ;
    public final void rule__SequencePhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1017:1: ( rule__SequencePhase__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1018:2: rule__SequencePhase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42073);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1024:1: rule__SequencePhase__Group__4__Impl : ( ')' ) ;
    public final void rule__SequencePhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1028:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1029:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1029:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1030:1: ')'
            {
             before(grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__SequencePhase__Group__4__Impl2101); 
             after(grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1053:1: rule__IterationPhase__Group__0 : rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 ;
    public final void rule__IterationPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1057:1: ( rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1058:2: rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02142);
            rule__IterationPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02145);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1065:1: rule__IterationPhase__Group__0__Impl : ( 'Iteration' ) ;
    public final void rule__IterationPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1069:1: ( ( 'Iteration' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1070:1: ( 'Iteration' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1070:1: ( 'Iteration' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1071:1: 'Iteration'
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__IterationPhase__Group__0__Impl2173); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1084:1: rule__IterationPhase__Group__1 : rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 ;
    public final void rule__IterationPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1088:1: ( rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1089:2: rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12204);
            rule__IterationPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12207);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1096:1: rule__IterationPhase__Group__1__Impl : ( ( rule__IterationPhase__NameAssignment_1 )? ) ;
    public final void rule__IterationPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1100:1: ( ( ( rule__IterationPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1101:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1101:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1102:1: ( rule__IterationPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1103:1: ( rule__IterationPhase__NameAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1103:2: rule__IterationPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2234);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1113:1: rule__IterationPhase__Group__2 : rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 ;
    public final void rule__IterationPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1117:1: ( rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1118:2: rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22265);
            rule__IterationPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22268);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1125:1: rule__IterationPhase__Group__2__Impl : ( '(' ) ;
    public final void rule__IterationPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1129:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1130:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1130:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1131:1: '('
            {
             before(grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__IterationPhase__Group__2__Impl2296); 
             after(grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1144:1: rule__IterationPhase__Group__3 : rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 ;
    public final void rule__IterationPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1148:1: ( rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1149:2: rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32327);
            rule__IterationPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32330);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1156:1: rule__IterationPhase__Group__3__Impl : ( ( rule__IterationPhase__IterationAssignment_3 ) ) ;
    public final void rule__IterationPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1160:1: ( ( ( rule__IterationPhase__IterationAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1161:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1161:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1162:1: ( rule__IterationPhase__IterationAssignment_3 )
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1163:1: ( rule__IterationPhase__IterationAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1163:2: rule__IterationPhase__IterationAssignment_3
            {
            pushFollow(FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2357);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1173:1: rule__IterationPhase__Group__4 : rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 ;
    public final void rule__IterationPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1177:1: ( rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1178:2: rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42387);
            rule__IterationPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42390);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1185:1: rule__IterationPhase__Group__4__Impl : ( '*' ) ;
    public final void rule__IterationPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1189:1: ( ( '*' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1190:1: ( '*' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1190:1: ( '*' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1191:1: '*'
            {
             before(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__IterationPhase__Group__4__Impl2418); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1204:1: rule__IterationPhase__Group__5 : rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 ;
    public final void rule__IterationPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1208:1: ( rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1209:2: rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52449);
            rule__IterationPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52452);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1216:1: rule__IterationPhase__Group__5__Impl : ( ( rule__IterationPhase__PhaseAssignment_5 ) ) ;
    public final void rule__IterationPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1220:1: ( ( ( rule__IterationPhase__PhaseAssignment_5 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1221:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1221:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1222:1: ( rule__IterationPhase__PhaseAssignment_5 )
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1223:1: ( rule__IterationPhase__PhaseAssignment_5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1223:2: rule__IterationPhase__PhaseAssignment_5
            {
            pushFollow(FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2479);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1233:1: rule__IterationPhase__Group__6 : rule__IterationPhase__Group__6__Impl ;
    public final void rule__IterationPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1237:1: ( rule__IterationPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1238:2: rule__IterationPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62509);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1244:1: rule__IterationPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__IterationPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1248:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1249:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1249:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1250:1: ')'
            {
             before(grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__IterationPhase__Group__6__Impl2537); 
             after(grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1277:1: rule__OptionalPhase__Group__0 : rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 ;
    public final void rule__OptionalPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1281:1: ( rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1282:2: rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02582);
            rule__OptionalPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02585);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1289:1: rule__OptionalPhase__Group__0__Impl : ( 'Optional' ) ;
    public final void rule__OptionalPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1293:1: ( ( 'Optional' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1294:1: ( 'Optional' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1294:1: ( 'Optional' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1295:1: 'Optional'
            {
             before(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__OptionalPhase__Group__0__Impl2613); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1308:1: rule__OptionalPhase__Group__1 : rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 ;
    public final void rule__OptionalPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1312:1: ( rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1313:2: rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12644);
            rule__OptionalPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12647);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1320:1: rule__OptionalPhase__Group__1__Impl : ( ( rule__OptionalPhase__NameAssignment_1 )? ) ;
    public final void rule__OptionalPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1324:1: ( ( ( rule__OptionalPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1325:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1325:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1326:1: ( rule__OptionalPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1327:1: ( rule__OptionalPhase__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1327:2: rule__OptionalPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2674);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1337:1: rule__OptionalPhase__Group__2 : rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 ;
    public final void rule__OptionalPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1341:1: ( rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1342:2: rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22705);
            rule__OptionalPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22708);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1349:1: rule__OptionalPhase__Group__2__Impl : ( '(' ) ;
    public final void rule__OptionalPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1353:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1354:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1354:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1355:1: '('
            {
             before(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__OptionalPhase__Group__2__Impl2736); 
             after(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1368:1: rule__OptionalPhase__Group__3 : rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 ;
    public final void rule__OptionalPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1372:1: ( rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1373:2: rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32767);
            rule__OptionalPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32770);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1380:1: rule__OptionalPhase__Group__3__Impl : ( ( rule__OptionalPhase__PhaseAssignment_3 ) ) ;
    public final void rule__OptionalPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1384:1: ( ( ( rule__OptionalPhase__PhaseAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1385:1: ( ( rule__OptionalPhase__PhaseAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1385:1: ( ( rule__OptionalPhase__PhaseAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1386:1: ( rule__OptionalPhase__PhaseAssignment_3 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1387:1: ( rule__OptionalPhase__PhaseAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1387:2: rule__OptionalPhase__PhaseAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__PhaseAssignment_3_in_rule__OptionalPhase__Group__3__Impl2797);
            rule__OptionalPhase__PhaseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_3()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1397:1: rule__OptionalPhase__Group__4 : rule__OptionalPhase__Group__4__Impl ;
    public final void rule__OptionalPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1401:1: ( rule__OptionalPhase__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1402:2: rule__OptionalPhase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42827);
            rule__OptionalPhase__Group__4__Impl();

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1408:1: rule__OptionalPhase__Group__4__Impl : ( ')' ) ;
    public final void rule__OptionalPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1412:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1413:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1413:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1414:1: ')'
            {
             before(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__OptionalPhase__Group__4__Impl2855); 
             after(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AtomicPhase__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1437:1: rule__AtomicPhase__Group__0 : rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 ;
    public final void rule__AtomicPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1441:1: ( rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1442:2: rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02896);
            rule__AtomicPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__02899);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1449:1: rule__AtomicPhase__Group__0__Impl : ( 'Atomic' ) ;
    public final void rule__AtomicPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1453:1: ( ( 'Atomic' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1454:1: ( 'Atomic' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1454:1: ( 'Atomic' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1455:1: 'Atomic'
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__AtomicPhase__Group__0__Impl2927); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1468:1: rule__AtomicPhase__Group__1 : rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 ;
    public final void rule__AtomicPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1472:1: ( rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1473:2: rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__12958);
            rule__AtomicPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__12961);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1480:1: rule__AtomicPhase__Group__1__Impl : ( ( rule__AtomicPhase__NameAssignment_1 )? ) ;
    public final void rule__AtomicPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1484:1: ( ( ( rule__AtomicPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1485:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1485:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1486:1: ( rule__AtomicPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1487:1: ( rule__AtomicPhase__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1487:2: rule__AtomicPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl2988);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1497:1: rule__AtomicPhase__Group__2 : rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 ;
    public final void rule__AtomicPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1501:1: ( rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1502:2: rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23019);
            rule__AtomicPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23022);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1509:1: rule__AtomicPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__AtomicPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1513:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1514:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1514:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1515:1: 'ClassName'
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3050); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1528:1: rule__AtomicPhase__Group__3 : rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 ;
    public final void rule__AtomicPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1532:1: ( rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1533:2: rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33081);
            rule__AtomicPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33084);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1540:1: rule__AtomicPhase__Group__3__Impl : ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) ;
    public final void rule__AtomicPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1544:1: ( ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1545:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1545:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1546:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1547:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1547:2: rule__AtomicPhase__ClassnameAssignment_3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3111);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1557:1: rule__AtomicPhase__Group__4 : rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 ;
    public final void rule__AtomicPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1561:1: ( rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1562:2: rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43141);
            rule__AtomicPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43144);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1569:1: rule__AtomicPhase__Group__4__Impl : ( 'Metrics(' ) ;
    public final void rule__AtomicPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1573:1: ( ( 'Metrics(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1574:1: ( 'Metrics(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1574:1: ( 'Metrics(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1575:1: 'Metrics('
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3172); 
             after(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1588:1: rule__AtomicPhase__Group__5 : rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 ;
    public final void rule__AtomicPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1592:1: ( rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1593:2: rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53203);
            rule__AtomicPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53206);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1600:1: rule__AtomicPhase__Group__5__Impl : ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) ;
    public final void rule__AtomicPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1604:1: ( ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1605:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1605:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1606:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1607:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=13)||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1607:2: rule__AtomicPhase__MetricsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3233);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1617:1: rule__AtomicPhase__Group__6 : rule__AtomicPhase__Group__6__Impl ;
    public final void rule__AtomicPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1621:1: ( rule__AtomicPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1622:2: rule__AtomicPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63264);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1628:1: rule__AtomicPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__AtomicPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1632:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1633:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1633:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1634:1: ')'
            {
             before(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3292); 
             after(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewMetric__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1661:1: rule__NewMetric__Group__0 : rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 ;
    public final void rule__NewMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1665:1: ( rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1666:2: rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03337);
            rule__NewMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03340);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1673:1: rule__NewMetric__Group__0__Impl : ( 'new Metric' ) ;
    public final void rule__NewMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1677:1: ( ( 'new Metric' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1678:1: ( 'new Metric' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1678:1: ( 'new Metric' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1679:1: 'new Metric'
            {
             before(grammarAccess.getNewMetricAccess().getNewMetricKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__NewMetric__Group__0__Impl3368); 
             after(grammarAccess.getNewMetricAccess().getNewMetricKeyword_0()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1692:1: rule__NewMetric__Group__1 : rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 ;
    public final void rule__NewMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1696:1: ( rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1697:2: rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13399);
            rule__NewMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13402);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1704:1: rule__NewMetric__Group__1__Impl : ( ( rule__NewMetric__Group_1__0 )? ) ;
    public final void rule__NewMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1708:1: ( ( ( rule__NewMetric__Group_1__0 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1709:1: ( ( rule__NewMetric__Group_1__0 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1709:1: ( ( rule__NewMetric__Group_1__0 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1710:1: ( rule__NewMetric__Group_1__0 )?
            {
             before(grammarAccess.getNewMetricAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1711:1: ( rule__NewMetric__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1711:2: rule__NewMetric__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NewMetric__Group_1__0_in_rule__NewMetric__Group__1__Impl3429);
                    rule__NewMetric__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewMetricAccess().getGroup_1()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1721:1: rule__NewMetric__Group__2 : rule__NewMetric__Group__2__Impl ;
    public final void rule__NewMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1725:1: ( rule__NewMetric__Group__2__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1726:2: rule__NewMetric__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23460);
            rule__NewMetric__Group__2__Impl();

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1732:1: rule__NewMetric__Group__2__Impl : ( ( rule__NewMetric__MetricnameAssignment_2 ) ) ;
    public final void rule__NewMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1736:1: ( ( ( rule__NewMetric__MetricnameAssignment_2 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1737:1: ( ( rule__NewMetric__MetricnameAssignment_2 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1737:1: ( ( rule__NewMetric__MetricnameAssignment_2 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1738:1: ( rule__NewMetric__MetricnameAssignment_2 )
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameAssignment_2()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1739:1: ( rule__NewMetric__MetricnameAssignment_2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1739:2: rule__NewMetric__MetricnameAssignment_2
            {
            pushFollow(FOLLOW_rule__NewMetric__MetricnameAssignment_2_in_rule__NewMetric__Group__2__Impl3487);
            rule__NewMetric__MetricnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNewMetricAccess().getMetricnameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__NewMetric__Group_1__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1755:1: rule__NewMetric__Group_1__0 : rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1 ;
    public final void rule__NewMetric__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1759:1: ( rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1760:2: rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group_1__0__Impl_in_rule__NewMetric__Group_1__03523);
            rule__NewMetric__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group_1__1_in_rule__NewMetric__Group_1__03526);
            rule__NewMetric__Group_1__1();

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
    // $ANTLR end "rule__NewMetric__Group_1__0"


    // $ANTLR start "rule__NewMetric__Group_1__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1767:1: rule__NewMetric__Group_1__0__Impl : ( 'ID' ) ;
    public final void rule__NewMetric__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1771:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1772:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1772:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1773:1: 'ID'
            {
             before(grammarAccess.getNewMetricAccess().getIDKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__NewMetric__Group_1__0__Impl3554); 
             after(grammarAccess.getNewMetricAccess().getIDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMetric__Group_1__0__Impl"


    // $ANTLR start "rule__NewMetric__Group_1__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1786:1: rule__NewMetric__Group_1__1 : rule__NewMetric__Group_1__1__Impl ;
    public final void rule__NewMetric__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1790:1: ( rule__NewMetric__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1791:2: rule__NewMetric__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group_1__1__Impl_in_rule__NewMetric__Group_1__13585);
            rule__NewMetric__Group_1__1__Impl();

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
    // $ANTLR end "rule__NewMetric__Group_1__1"


    // $ANTLR start "rule__NewMetric__Group_1__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1797:1: rule__NewMetric__Group_1__1__Impl : ( ( rule__NewMetric__NameAssignment_1_1 ) ) ;
    public final void rule__NewMetric__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1801:1: ( ( ( rule__NewMetric__NameAssignment_1_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1802:1: ( ( rule__NewMetric__NameAssignment_1_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1802:1: ( ( rule__NewMetric__NameAssignment_1_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1803:1: ( rule__NewMetric__NameAssignment_1_1 )
            {
             before(grammarAccess.getNewMetricAccess().getNameAssignment_1_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1804:1: ( rule__NewMetric__NameAssignment_1_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1804:2: rule__NewMetric__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NewMetric__NameAssignment_1_1_in_rule__NewMetric__Group_1__1__Impl3612);
            rule__NewMetric__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNewMetricAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMetric__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1818:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1822:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1823:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03646);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03649);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1830:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1834:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1835:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1835:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1836:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3676); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1847:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1851:1: ( rule__QualifiedName__Group__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1852:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13705);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1858:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1862:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1863:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1863:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1864:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1865:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1865:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3732);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1879:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1883:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1884:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03767);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03770);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1891:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1895:1: ( ( '.' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1896:1: ( '.' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1896:1: ( '.' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1897:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3798); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1910:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1914:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1915:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13829);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1921:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1925:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1926:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1926:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1927:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3856); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1943:1: rule__Benchmark__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Benchmark__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1947:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1948:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1948:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1949:1: ruleQualifiedName
            {
             before(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_13894);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1958:1: rule__Benchmark__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Benchmark__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1962:1: ( ( ruleElement ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1963:1: ( ruleElement )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1963:1: ( ruleElement )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1964:1: ruleElement
            {
             before(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_23925);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1973:1: rule__Scenario__ClassnameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Scenario__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1977:1: ( ( RULE_STRING ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1978:1: ( RULE_STRING )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1978:1: ( RULE_STRING )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1979:1: RULE_STRING
            {
             before(grammarAccess.getScenarioAccess().getClassnameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Scenario__ClassnameAssignment_13956); 
             after(grammarAccess.getScenarioAccess().getClassnameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1988:1: rule__Scenario__RootPhaseAssignment_3 : ( rulePhase ) ;
    public final void rule__Scenario__RootPhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1992:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1993:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1993:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1994:1: rulePhase
            {
             before(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__Scenario__RootPhaseAssignment_33987);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2003:1: rule__SequencePhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequencePhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2007:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2008:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2008:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2009:1: RULE_ID
            {
             before(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14018); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2018:1: rule__SequencePhase__PhasesAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__SequencePhase__PhasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2022:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2023:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2023:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2024:1: ruleAttachedPhase
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34049);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2033:1: rule__IterationPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IterationPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2037:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2038:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2038:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2039:1: RULE_ID
            {
             before(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14080); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2048:1: rule__IterationPhase__IterationAssignment_3 : ( RULE_INT ) ;
    public final void rule__IterationPhase__IterationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2052:1: ( ( RULE_INT ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2053:1: ( RULE_INT )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2053:1: ( RULE_INT )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2054:1: RULE_INT
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34111); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2063:1: rule__IterationPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__IterationPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2067:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2068:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2068:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2069:1: ruleAttachedPhase
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54142);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2078:1: rule__OptionalPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2082:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2083:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2083:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2084:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14173); 
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


    // $ANTLR start "rule__OptionalPhase__PhaseAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2093:1: rule__OptionalPhase__PhaseAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__OptionalPhase__PhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2097:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2098:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2098:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2099:1: ruleAttachedPhase
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_34204);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalPhase__PhaseAssignment_3"


    // $ANTLR start "rule__PhaseReference__PhaseAssignment"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2108:1: rule__PhaseReference__PhaseAssignment : ( ( RULE_ID ) ) ;
    public final void rule__PhaseReference__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2112:1: ( ( ( RULE_ID ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2113:1: ( ( RULE_ID ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2113:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2114:1: ( RULE_ID )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2115:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: RULE_ID
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4239); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2127:1: rule__NewPhase__PhaseAssignment : ( rulePhase ) ;
    public final void rule__NewPhase__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2131:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2132:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2132:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2133:1: rulePhase
            {
             before(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4274);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2142:1: rule__AtomicPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2146:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2147:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2147:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2148:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14305); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2157:1: rule__AtomicPhase__ClassnameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__AtomicPhase__ClassnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2161:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2162:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2162:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2163:1: ruleQualifiedName
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AtomicPhase__ClassnameAssignment_34336);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomicPhaseAccess().getClassnameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2172:1: rule__AtomicPhase__MetricsAssignment_5 : ( ruleAttachedMetric ) ;
    public final void rule__AtomicPhase__MetricsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2176:1: ( ( ruleAttachedMetric ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2177:1: ( ruleAttachedMetric )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2177:1: ( ruleAttachedMetric )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2178:1: ruleAttachedMetric
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54367);
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


    // $ANTLR start "rule__MetricTypeReference__MetricAssignment"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2187:1: rule__MetricTypeReference__MetricAssignment : ( ruleMetricType ) ;
    public final void rule__MetricTypeReference__MetricAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2191:1: ( ( ruleMetricType ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2192:1: ( ruleMetricType )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2192:1: ( ruleMetricType )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2193:1: ruleMetricType
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment4398);
            ruleMetricType();

            state._fsp--;

             after(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetricTypeReference__MetricAssignment"


    // $ANTLR start "rule__NewMetric__NameAssignment_1_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2202:1: rule__NewMetric__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__NewMetric__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2206:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2207:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2207:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2208:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__NameAssignment_1_14429); 
             after(grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMetric__NameAssignment_1_1"


    // $ANTLR start "rule__NewMetric__MetricnameAssignment_2"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2217:1: rule__NewMetric__MetricnameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NewMetric__MetricnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2221:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2222:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2222:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2223:1: ruleQualifiedName
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NewMetric__MetricnameAssignment_24460);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewMetric__MetricnameAssignment_2"

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
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricAssignment_in_ruleMetricTypeReference814 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_11_in_rule__MetricType__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetricType__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetricType__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__0__Impl_in_rule__Benchmark__Group__01312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1_in_rule__Benchmark__Group__01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Benchmark__Group__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1__Impl_in_rule__Benchmark__Group__11374 = new BitSet(new long[]{0x0000000001A48000L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2_in_rule__Benchmark__Group__11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__PackageNameAssignment_1_in_rule__Benchmark__Group__1__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2__Impl_in_rule__Benchmark__Group__21434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__ElementsAssignment_2_in_rule__Benchmark__Group__2__Impl1461 = new BitSet(new long[]{0x0000000001A48002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Scenario__Group__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11560 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ClassnameAssignment_1_in_rule__Scenario__Group__1__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21620 = new BitSet(new long[]{0x0000000001A48000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Scenario__Group__2__Impl1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31682 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Scenario__Group__4__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01811 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SequencePhase__Group__0__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11873 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21934 = new BitSet(new long[]{0x0000000001A48010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SequencePhase__Group__2__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__31996 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__31999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2028 = new BitSet(new long[]{0x0000000001A48012L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2040 = new BitSet(new long[]{0x0000000001A48012L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SequencePhase__Group__4__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02142 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IterationPhase__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12204 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22265 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IterationPhase__Group__2__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32327 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42387 = new BitSet(new long[]{0x0000000001A48010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IterationPhase__Group__4__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IterationPhase__Group__6__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02582 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OptionalPhase__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12644 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22705 = new BitSet(new long[]{0x0000000001A48010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OptionalPhase__Group__2__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32767 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__PhaseAssignment_3_in_rule__OptionalPhase__Group__3__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OptionalPhase__Group__4__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02896 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__02899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AtomicPhase__Group__0__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__12958 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__12961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33081 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43141 = new BitSet(new long[]{0x0000000008103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53203 = new BitSet(new long[]{0x0000000008103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3233 = new BitSet(new long[]{0x0000000008003802L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03337 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NewMetric__Group__0__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13399 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__0_in_rule__NewMetric__Group__1__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__MetricnameAssignment_2_in_rule__NewMetric__Group__2__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__0__Impl_in_rule__NewMetric__Group_1__03523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__1_in_rule__NewMetric__Group_1__03526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NewMetric__Group_1__0__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__1__Impl_in_rule__NewMetric__Group_1__13585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__NameAssignment_1_1_in_rule__NewMetric__Group_1__1__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03646 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3732 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_13894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_23925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Scenario__ClassnameAssignment_13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__Scenario__RootPhaseAssignment_33987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_34204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AtomicPhase__ClassnameAssignment_34336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__NameAssignment_1_14429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NewMetric__MetricnameAssignment_24460 = new BitSet(new long[]{0x0000000000000002L});

}