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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Time'", "'Memory'", "'Scalar'", "'package'", "'Scenario'", "'{'", "'}'", "'Sequence'", "'('", "')'", "'Iteration'", "'*'", "'Optional'", "'ClassName'", "'Atomic'", "'Metrics('", "'ID'", "'new Metric ClassName'", "'.'"
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
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==18||LA1_0==21||LA1_0==23||LA1_0==25) ) {
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
            case 25:
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
            else if ( (LA3_0==18||LA3_0==21||LA3_0==23||LA3_0==25) ) {
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

                if ( (LA6_0==15||LA6_0==18||LA6_0==21||LA6_0==23||LA6_0==25) ) {
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

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==21||LA8_0==23||LA8_0==25) ) {
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1349:1: rule__OptionalPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__OptionalPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1353:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1354:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1354:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1355:1: 'ClassName'
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassNameKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__OptionalPhase__Group__2__Impl2736); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1380:1: rule__OptionalPhase__Group__3__Impl : ( ( rule__OptionalPhase__ClassnameAssignment_3 ) ) ;
    public final void rule__OptionalPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1384:1: ( ( ( rule__OptionalPhase__ClassnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1385:1: ( ( rule__OptionalPhase__ClassnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1385:1: ( ( rule__OptionalPhase__ClassnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1386:1: ( rule__OptionalPhase__ClassnameAssignment_3 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1387:1: ( rule__OptionalPhase__ClassnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1387:2: rule__OptionalPhase__ClassnameAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__ClassnameAssignment_3_in_rule__OptionalPhase__Group__3__Impl2797);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1397:1: rule__OptionalPhase__Group__4 : rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5 ;
    public final void rule__OptionalPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1401:1: ( rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1402:2: rule__OptionalPhase__Group__4__Impl rule__OptionalPhase__Group__5
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42827);
            rule__OptionalPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__5_in_rule__OptionalPhase__Group__42830);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1409:1: rule__OptionalPhase__Group__4__Impl : ( '(' ) ;
    public final void rule__OptionalPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1413:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1414:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1414:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1415:1: '('
            {
             before(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__OptionalPhase__Group__4__Impl2858); 
             after(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1428:1: rule__OptionalPhase__Group__5 : rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6 ;
    public final void rule__OptionalPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1432:1: ( rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1433:2: rule__OptionalPhase__Group__5__Impl rule__OptionalPhase__Group__6
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__5__Impl_in_rule__OptionalPhase__Group__52889);
            rule__OptionalPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__6_in_rule__OptionalPhase__Group__52892);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1440:1: rule__OptionalPhase__Group__5__Impl : ( ( rule__OptionalPhase__PhaseAssignment_5 ) ) ;
    public final void rule__OptionalPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1444:1: ( ( ( rule__OptionalPhase__PhaseAssignment_5 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1445:1: ( ( rule__OptionalPhase__PhaseAssignment_5 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1445:1: ( ( rule__OptionalPhase__PhaseAssignment_5 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1446:1: ( rule__OptionalPhase__PhaseAssignment_5 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1447:1: ( rule__OptionalPhase__PhaseAssignment_5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1447:2: rule__OptionalPhase__PhaseAssignment_5
            {
            pushFollow(FOLLOW_rule__OptionalPhase__PhaseAssignment_5_in_rule__OptionalPhase__Group__5__Impl2919);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1457:1: rule__OptionalPhase__Group__6 : rule__OptionalPhase__Group__6__Impl ;
    public final void rule__OptionalPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1461:1: ( rule__OptionalPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1462:2: rule__OptionalPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__6__Impl_in_rule__OptionalPhase__Group__62949);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1468:1: rule__OptionalPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__OptionalPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1472:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1473:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1473:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1474:1: ')'
            {
             before(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__OptionalPhase__Group__6__Impl2977); 
             after(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1501:1: rule__AtomicPhase__Group__0 : rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 ;
    public final void rule__AtomicPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1505:1: ( rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1506:2: rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__03022);
            rule__AtomicPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__03025);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1513:1: rule__AtomicPhase__Group__0__Impl : ( 'Atomic' ) ;
    public final void rule__AtomicPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1517:1: ( ( 'Atomic' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1518:1: ( 'Atomic' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1518:1: ( 'Atomic' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1519:1: 'Atomic'
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__AtomicPhase__Group__0__Impl3053); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1532:1: rule__AtomicPhase__Group__1 : rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 ;
    public final void rule__AtomicPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1536:1: ( rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1537:2: rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__13084);
            rule__AtomicPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__13087);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1544:1: rule__AtomicPhase__Group__1__Impl : ( ( rule__AtomicPhase__NameAssignment_1 )? ) ;
    public final void rule__AtomicPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1548:1: ( ( ( rule__AtomicPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1549:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1549:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1550:1: ( rule__AtomicPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1551:1: ( rule__AtomicPhase__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1551:2: rule__AtomicPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3114);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1561:1: rule__AtomicPhase__Group__2 : rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 ;
    public final void rule__AtomicPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1565:1: ( rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1566:2: rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23145);
            rule__AtomicPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23148);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1573:1: rule__AtomicPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__AtomicPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1577:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1578:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1578:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1579:1: 'ClassName'
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__AtomicPhase__Group__2__Impl3176); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1592:1: rule__AtomicPhase__Group__3 : rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 ;
    public final void rule__AtomicPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1596:1: ( rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1597:2: rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33207);
            rule__AtomicPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33210);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1604:1: rule__AtomicPhase__Group__3__Impl : ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) ;
    public final void rule__AtomicPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1608:1: ( ( ( rule__AtomicPhase__ClassnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1609:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1609:1: ( ( rule__AtomicPhase__ClassnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1610:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1611:1: ( rule__AtomicPhase__ClassnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1611:2: rule__AtomicPhase__ClassnameAssignment_3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3237);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1621:1: rule__AtomicPhase__Group__4 : rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 ;
    public final void rule__AtomicPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1625:1: ( rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1626:2: rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43267);
            rule__AtomicPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43270);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1633:1: rule__AtomicPhase__Group__4__Impl : ( 'Metrics(' ) ;
    public final void rule__AtomicPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1637:1: ( ( 'Metrics(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1638:1: ( 'Metrics(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1638:1: ( 'Metrics(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1639:1: 'Metrics('
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3298); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1652:1: rule__AtomicPhase__Group__5 : rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 ;
    public final void rule__AtomicPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1656:1: ( rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1657:2: rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53329);
            rule__AtomicPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53332);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1664:1: rule__AtomicPhase__Group__5__Impl : ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) ;
    public final void rule__AtomicPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1668:1: ( ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1669:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1669:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1670:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1671:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=13)||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1671:2: rule__AtomicPhase__MetricsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3359);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1681:1: rule__AtomicPhase__Group__6 : rule__AtomicPhase__Group__6__Impl ;
    public final void rule__AtomicPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1685:1: ( rule__AtomicPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1686:2: rule__AtomicPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63390);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1692:1: rule__AtomicPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__AtomicPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1696:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1697:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1697:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1698:1: ')'
            {
             before(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3418); 
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


    // $ANTLR start "rule__MetricTypeReference__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1725:1: rule__MetricTypeReference__Group__0 : rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1 ;
    public final void rule__MetricTypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1729:1: ( rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1730:2: rule__MetricTypeReference__Group__0__Impl rule__MetricTypeReference__Group__1
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__0__Impl_in_rule__MetricTypeReference__Group__03463);
            rule__MetricTypeReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricTypeReference__Group__1_in_rule__MetricTypeReference__Group__03466);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1737:1: rule__MetricTypeReference__Group__0__Impl : ( ( rule__MetricTypeReference__MetricAssignment_0 ) ) ;
    public final void rule__MetricTypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1741:1: ( ( ( rule__MetricTypeReference__MetricAssignment_0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1742:1: ( ( rule__MetricTypeReference__MetricAssignment_0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1742:1: ( ( rule__MetricTypeReference__MetricAssignment_0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1743:1: ( rule__MetricTypeReference__MetricAssignment_0 )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1744:1: ( rule__MetricTypeReference__MetricAssignment_0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1744:2: rule__MetricTypeReference__MetricAssignment_0
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricAssignment_0_in_rule__MetricTypeReference__Group__0__Impl3493);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1754:1: rule__MetricTypeReference__Group__1 : rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2 ;
    public final void rule__MetricTypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1758:1: ( rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1759:2: rule__MetricTypeReference__Group__1__Impl rule__MetricTypeReference__Group__2
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__1__Impl_in_rule__MetricTypeReference__Group__13523);
            rule__MetricTypeReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MetricTypeReference__Group__2_in_rule__MetricTypeReference__Group__13526);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1766:1: rule__MetricTypeReference__Group__1__Impl : ( 'ID' ) ;
    public final void rule__MetricTypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1770:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1771:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1771:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1772:1: 'ID'
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getIDKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__MetricTypeReference__Group__1__Impl3554); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1785:1: rule__MetricTypeReference__Group__2 : rule__MetricTypeReference__Group__2__Impl ;
    public final void rule__MetricTypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1789:1: ( rule__MetricTypeReference__Group__2__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1790:2: rule__MetricTypeReference__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__Group__2__Impl_in_rule__MetricTypeReference__Group__23585);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1796:1: rule__MetricTypeReference__Group__2__Impl : ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) ) ;
    public final void rule__MetricTypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1800:1: ( ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1801:1: ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1801:1: ( ( rule__MetricTypeReference__MetricnameAssignment_2 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1802:1: ( rule__MetricTypeReference__MetricnameAssignment_2 )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricnameAssignment_2()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1803:1: ( rule__MetricTypeReference__MetricnameAssignment_2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1803:2: rule__MetricTypeReference__MetricnameAssignment_2
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricnameAssignment_2_in_rule__MetricTypeReference__Group__2__Impl3612);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1819:1: rule__NewMetric__Group__0 : rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 ;
    public final void rule__NewMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1823:1: ( rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1824:2: rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03648);
            rule__NewMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03651);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1831:1: rule__NewMetric__Group__0__Impl : ( 'new Metric ClassName' ) ;
    public final void rule__NewMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1835:1: ( ( 'new Metric ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1836:1: ( 'new Metric ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1836:1: ( 'new Metric ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1837:1: 'new Metric ClassName'
            {
             before(grammarAccess.getNewMetricAccess().getNewMetricClassNameKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__NewMetric__Group__0__Impl3679); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1850:1: rule__NewMetric__Group__1 : rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 ;
    public final void rule__NewMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1854:1: ( rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1855:2: rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13710);
            rule__NewMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13713);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1862:1: rule__NewMetric__Group__1__Impl : ( ( rule__NewMetric__ClassnameAssignment_1 ) ) ;
    public final void rule__NewMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1866:1: ( ( ( rule__NewMetric__ClassnameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1867:1: ( ( rule__NewMetric__ClassnameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1867:1: ( ( rule__NewMetric__ClassnameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1868:1: ( rule__NewMetric__ClassnameAssignment_1 )
            {
             before(grammarAccess.getNewMetricAccess().getClassnameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1869:1: ( rule__NewMetric__ClassnameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1869:2: rule__NewMetric__ClassnameAssignment_1
            {
            pushFollow(FOLLOW_rule__NewMetric__ClassnameAssignment_1_in_rule__NewMetric__Group__1__Impl3740);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1879:1: rule__NewMetric__Group__2 : rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3 ;
    public final void rule__NewMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1883:1: ( rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1884:2: rule__NewMetric__Group__2__Impl rule__NewMetric__Group__3
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23770);
            rule__NewMetric__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__3_in_rule__NewMetric__Group__23773);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1891:1: rule__NewMetric__Group__2__Impl : ( 'ID' ) ;
    public final void rule__NewMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1895:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1896:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1896:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1897:1: 'ID'
            {
             before(grammarAccess.getNewMetricAccess().getIDKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__NewMetric__Group__2__Impl3801); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1910:1: rule__NewMetric__Group__3 : rule__NewMetric__Group__3__Impl ;
    public final void rule__NewMetric__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1914:1: ( rule__NewMetric__Group__3__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1915:2: rule__NewMetric__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__3__Impl_in_rule__NewMetric__Group__33832);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1921:1: rule__NewMetric__Group__3__Impl : ( ( rule__NewMetric__MetricnameAssignment_3 ) ) ;
    public final void rule__NewMetric__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1925:1: ( ( ( rule__NewMetric__MetricnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1926:1: ( ( rule__NewMetric__MetricnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1926:1: ( ( rule__NewMetric__MetricnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1927:1: ( rule__NewMetric__MetricnameAssignment_3 )
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1928:1: ( rule__NewMetric__MetricnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1928:2: rule__NewMetric__MetricnameAssignment_3
            {
            pushFollow(FOLLOW_rule__NewMetric__MetricnameAssignment_3_in_rule__NewMetric__Group__3__Impl3859);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1946:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1950:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1951:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03897);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03900);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1958:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1962:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1963:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1963:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1964:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3927); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1975:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1979:1: ( rule__QualifiedName__Group__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1980:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13956);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1986:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1990:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1991:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1991:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1992:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1993:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1993:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3983);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2007:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2011:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2012:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04018);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04021);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2019:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2023:1: ( ( '.' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2024:1: ( '.' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2024:1: ( '.' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2025:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4049); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2038:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2042:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2043:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14080);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2049:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2053:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2054:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2054:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2055:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4107); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2071:1: rule__Benchmark__PackageNameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Benchmark__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2075:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2076:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2076:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2077:1: ruleQualifiedName
            {
             before(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_14145);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2086:1: rule__Benchmark__ElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__Benchmark__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2090:1: ( ( ruleElement ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2091:1: ( ruleElement )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2091:1: ( ruleElement )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2092:1: ruleElement
            {
             before(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_24176);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2101:1: rule__Scenario__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scenario__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2105:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2106:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2106:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2107:1: RULE_ID
            {
             before(grammarAccess.getScenarioAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Scenario__ClassnameAssignment_14207); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: rule__Scenario__RootPhaseAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__Scenario__RootPhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2120:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2121:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2121:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2122:1: ruleAttachedPhase
            {
             before(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__Scenario__RootPhaseAssignment_34238);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2131:1: rule__SequencePhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequencePhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2135:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2136:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2136:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2137:1: RULE_ID
            {
             before(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14269); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2146:1: rule__SequencePhase__PhasesAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__SequencePhase__PhasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2150:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2151:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2151:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2152:1: ruleAttachedPhase
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34300);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2161:1: rule__IterationPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IterationPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2165:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2166:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2166:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2167:1: RULE_ID
            {
             before(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14331); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2176:1: rule__IterationPhase__IterationAssignment_3 : ( RULE_INT ) ;
    public final void rule__IterationPhase__IterationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2180:1: ( ( RULE_INT ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2181:1: ( RULE_INT )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2181:1: ( RULE_INT )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2182:1: RULE_INT
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34362); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2191:1: rule__IterationPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__IterationPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2195:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2196:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2196:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2197:1: ruleAttachedPhase
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54393);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2206:1: rule__OptionalPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2210:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2211:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2211:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2212:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14424); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2221:1: rule__OptionalPhase__ClassnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__ClassnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2225:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2226:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2226:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2227:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__ClassnameAssignment_34455); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2236:1: rule__OptionalPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__OptionalPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2240:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2241:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2241:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2242:1: ruleAttachedPhase
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_54486);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2251:1: rule__PhaseReference__PhaseAssignment : ( ( RULE_ID ) ) ;
    public final void rule__PhaseReference__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2255:1: ( ( ( RULE_ID ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2256:1: ( ( RULE_ID ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2256:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2257:1: ( RULE_ID )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2258:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2259:1: RULE_ID
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4521); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2270:1: rule__NewPhase__PhaseAssignment : ( rulePhase ) ;
    public final void rule__NewPhase__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2274:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2275:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2275:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2276:1: rulePhase
            {
             before(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4556);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2285:1: rule__AtomicPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2289:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2290:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2290:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2291:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14587); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2300:1: rule__AtomicPhase__ClassnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__ClassnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2304:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2305:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2305:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2306:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__ClassnameAssignment_34618); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2315:1: rule__AtomicPhase__MetricsAssignment_5 : ( ruleAttachedMetric ) ;
    public final void rule__AtomicPhase__MetricsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2319:1: ( ( ruleAttachedMetric ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2320:1: ( ruleAttachedMetric )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2320:1: ( ruleAttachedMetric )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2321:1: ruleAttachedMetric
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54649);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2330:1: rule__MetricTypeReference__MetricAssignment_0 : ( ruleMetricType ) ;
    public final void rule__MetricTypeReference__MetricAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2334:1: ( ( ruleMetricType ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2335:1: ( ruleMetricType )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2335:1: ( ruleMetricType )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2336:1: ruleMetricType
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment_04680);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2345:1: rule__MetricTypeReference__MetricnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MetricTypeReference__MetricnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2349:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2350:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2350:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2351:1: RULE_ID
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MetricTypeReference__MetricnameAssignment_24711); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2360:1: rule__NewMetric__ClassnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewMetric__ClassnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2364:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2365:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2365:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2366:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getClassnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__ClassnameAssignment_14742); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2375:1: rule__NewMetric__MetricnameAssignment_3 : ( RULE_ID ) ;
    public final void rule__NewMetric__MetricnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2379:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2380:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2380:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2381:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__MetricnameAssignment_34773); 
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
    public static final BitSet FOLLOW_11_in_rule__MetricType__Alternatives1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetricType__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetricType__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__0__Impl_in_rule__Benchmark__Group__01312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1_in_rule__Benchmark__Group__01315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Benchmark__Group__0__Impl1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__1__Impl_in_rule__Benchmark__Group__11374 = new BitSet(new long[]{0x0000000002A48000L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2_in_rule__Benchmark__Group__11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__PackageNameAssignment_1_in_rule__Benchmark__Group__1__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__Group__2__Impl_in_rule__Benchmark__Group__21434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Benchmark__ElementsAssignment_2_in_rule__Benchmark__Group__2__Impl1461 = new BitSet(new long[]{0x0000000002A48002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Scenario__Group__0__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11560 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ClassnameAssignment_1_in_rule__Scenario__Group__1__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21620 = new BitSet(new long[]{0x0000000002A48010L});
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
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21934 = new BitSet(new long[]{0x0000000002A48010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SequencePhase__Group__2__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__31996 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__31999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2028 = new BitSet(new long[]{0x0000000002A48012L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2040 = new BitSet(new long[]{0x0000000002A48012L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SequencePhase__Group__4__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02142 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IterationPhase__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12204 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IterationPhase__Group__2__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32327 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42387 = new BitSet(new long[]{0x0000000002A48010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IterationPhase__Group__4__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IterationPhase__Group__6__Impl2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02582 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OptionalPhase__Group__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12644 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__OptionalPhase__Group__2__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32767 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__ClassnameAssignment_3_in_rule__OptionalPhase__Group__3__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42827 = new BitSet(new long[]{0x0000000002A48010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__5_in_rule__OptionalPhase__Group__42830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OptionalPhase__Group__4__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__5__Impl_in_rule__OptionalPhase__Group__52889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__6_in_rule__OptionalPhase__Group__52892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__PhaseAssignment_5_in_rule__OptionalPhase__Group__5__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__6__Impl_in_rule__OptionalPhase__Group__62949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OptionalPhase__Group__6__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__03022 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__03025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtomicPhase__Group__0__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__13084 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AtomicPhase__Group__2__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33207 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__ClassnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43267 = new BitSet(new long[]{0x0000000010103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53329 = new BitSet(new long[]{0x0000000010103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3359 = new BitSet(new long[]{0x0000000010003802L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__0__Impl_in_rule__MetricTypeReference__Group__03463 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__1_in_rule__MetricTypeReference__Group__03466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricAssignment_0_in_rule__MetricTypeReference__Group__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__1__Impl_in_rule__MetricTypeReference__Group__13523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__2_in_rule__MetricTypeReference__Group__13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MetricTypeReference__Group__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__Group__2__Impl_in_rule__MetricTypeReference__Group__23585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricnameAssignment_2_in_rule__MetricTypeReference__Group__2__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NewMetric__Group__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13710 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__ClassnameAssignment_1_in_rule__NewMetric__Group__1__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__3_in_rule__NewMetric__Group__23773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NewMetric__Group__2__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__3__Impl_in_rule__NewMetric__Group__33832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__MetricnameAssignment_3_in_rule__NewMetric__Group__3__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03897 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3983 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Benchmark__PackageNameAssignment_14145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment_24176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Scenario__ClassnameAssignment_14207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__Scenario__RootPhaseAssignment_34238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__ClassnameAssignment_34455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_54486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__ClassnameAssignment_34618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment_04680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MetricTypeReference__MetricnameAssignment_24711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__ClassnameAssignment_14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__MetricnameAssignment_34773 = new BitSet(new long[]{0x0000000000000002L});

}