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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Time'", "'Memory'", "'Scalar'", "'package'", "'Scenario'", "'{'", "'}'", "'Sequence'", "'('", "')'", "'Iteration'", "'*'", "'Optional'", "'Atomic'", "'ClassName'", "'Metrics('", "'new Metric'", "'ID'", "'.'"
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:69:1: ruleBenchmark : ( ( rule__Benchmark__ElementsAssignment )* ) ;
    public final void ruleBenchmark() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:73:2: ( ( ( rule__Benchmark__ElementsAssignment )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:74:1: ( ( rule__Benchmark__ElementsAssignment )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:74:1: ( ( rule__Benchmark__ElementsAssignment )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:75:1: ( rule__Benchmark__ElementsAssignment )*
            {
             before(grammarAccess.getBenchmarkAccess().getElementsAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:76:1: ( rule__Benchmark__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==21||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:76:2: rule__Benchmark__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Benchmark__ElementsAssignment_in_ruleBenchmark94);
            	    rule__Benchmark__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBenchmarkAccess().getElementsAssignment()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement122);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement129); 

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
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement155);
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:116:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:117:1: ( rulePackageDeclaration EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:118:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration182);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration189); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:125:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:129:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:130:1: ( ( rule__PackageDeclaration__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:131:1: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:132:1: ( rule__PackageDeclaration__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:132:2: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration215);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleScenario"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:144:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:145:1: ( ruleScenario EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:146:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario242);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario249); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:153:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:157:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:158:1: ( ( rule__Scenario__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:158:1: ( ( rule__Scenario__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:159:1: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:160:1: ( rule__Scenario__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:160:2: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0_in_ruleScenario275);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:172:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:173:1: ( rulePhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:174:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_rulePhase_in_entryRulePhase302);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhase309); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:181:1: rulePhase : ( ( rule__Phase__Alternatives ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:185:2: ( ( ( rule__Phase__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:186:1: ( ( rule__Phase__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:186:1: ( ( rule__Phase__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:187:1: ( rule__Phase__Alternatives )
            {
             before(grammarAccess.getPhaseAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:188:1: ( rule__Phase__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:188:2: rule__Phase__Alternatives
            {
            pushFollow(FOLLOW_rule__Phase__Alternatives_in_rulePhase335);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:200:1: entryRuleSequencePhase : ruleSequencePhase EOF ;
    public final void entryRuleSequencePhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:201:1: ( ruleSequencePhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:202:1: ruleSequencePhase EOF
            {
             before(grammarAccess.getSequencePhaseRule()); 
            pushFollow(FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase362);
            ruleSequencePhase();

            state._fsp--;

             after(grammarAccess.getSequencePhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePhase369); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:209:1: ruleSequencePhase : ( ( rule__SequencePhase__Group__0 ) ) ;
    public final void ruleSequencePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:213:2: ( ( ( rule__SequencePhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:214:1: ( ( rule__SequencePhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:214:1: ( ( rule__SequencePhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:215:1: ( rule__SequencePhase__Group__0 )
            {
             before(grammarAccess.getSequencePhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:216:1: ( rule__SequencePhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:216:2: rule__SequencePhase__Group__0
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__0_in_ruleSequencePhase395);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:228:1: entryRuleIterationPhase : ruleIterationPhase EOF ;
    public final void entryRuleIterationPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:229:1: ( ruleIterationPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:230:1: ruleIterationPhase EOF
            {
             before(grammarAccess.getIterationPhaseRule()); 
            pushFollow(FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase422);
            ruleIterationPhase();

            state._fsp--;

             after(grammarAccess.getIterationPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationPhase429); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:237:1: ruleIterationPhase : ( ( rule__IterationPhase__Group__0 ) ) ;
    public final void ruleIterationPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:241:2: ( ( ( rule__IterationPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:242:1: ( ( rule__IterationPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:242:1: ( ( rule__IterationPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:243:1: ( rule__IterationPhase__Group__0 )
            {
             before(grammarAccess.getIterationPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:244:1: ( rule__IterationPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:244:2: rule__IterationPhase__Group__0
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__0_in_ruleIterationPhase455);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:256:1: entryRuleOptionalPhase : ruleOptionalPhase EOF ;
    public final void entryRuleOptionalPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:257:1: ( ruleOptionalPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:258:1: ruleOptionalPhase EOF
            {
             before(grammarAccess.getOptionalPhaseRule()); 
            pushFollow(FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase482);
            ruleOptionalPhase();

            state._fsp--;

             after(grammarAccess.getOptionalPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalPhase489); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:265:1: ruleOptionalPhase : ( ( rule__OptionalPhase__Group__0 ) ) ;
    public final void ruleOptionalPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:269:2: ( ( ( rule__OptionalPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:270:1: ( ( rule__OptionalPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:270:1: ( ( rule__OptionalPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:271:1: ( rule__OptionalPhase__Group__0 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:272:1: ( rule__OptionalPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:272:2: rule__OptionalPhase__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__0_in_ruleOptionalPhase515);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:284:1: entryRuleAttachedPhase : ruleAttachedPhase EOF ;
    public final void entryRuleAttachedPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:285:1: ( ruleAttachedPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:286:1: ruleAttachedPhase EOF
            {
             before(grammarAccess.getAttachedPhaseRule()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase542);
            ruleAttachedPhase();

            state._fsp--;

             after(grammarAccess.getAttachedPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedPhase549); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:293:1: ruleAttachedPhase : ( ( rule__AttachedPhase__Alternatives ) ) ;
    public final void ruleAttachedPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:297:2: ( ( ( rule__AttachedPhase__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:298:1: ( ( rule__AttachedPhase__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:298:1: ( ( rule__AttachedPhase__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:299:1: ( rule__AttachedPhase__Alternatives )
            {
             before(grammarAccess.getAttachedPhaseAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:300:1: ( rule__AttachedPhase__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:300:2: rule__AttachedPhase__Alternatives
            {
            pushFollow(FOLLOW_rule__AttachedPhase__Alternatives_in_ruleAttachedPhase575);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:312:1: entryRulePhaseReference : rulePhaseReference EOF ;
    public final void entryRulePhaseReference() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:313:1: ( rulePhaseReference EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:314:1: rulePhaseReference EOF
            {
             before(grammarAccess.getPhaseReferenceRule()); 
            pushFollow(FOLLOW_rulePhaseReference_in_entryRulePhaseReference602);
            rulePhaseReference();

            state._fsp--;

             after(grammarAccess.getPhaseReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseReference609); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:321:1: rulePhaseReference : ( ( rule__PhaseReference__PhaseAssignment ) ) ;
    public final void rulePhaseReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:325:2: ( ( ( rule__PhaseReference__PhaseAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:326:1: ( ( rule__PhaseReference__PhaseAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:326:1: ( ( rule__PhaseReference__PhaseAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:327:1: ( rule__PhaseReference__PhaseAssignment )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhaseAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:328:1: ( rule__PhaseReference__PhaseAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:328:2: rule__PhaseReference__PhaseAssignment
            {
            pushFollow(FOLLOW_rule__PhaseReference__PhaseAssignment_in_rulePhaseReference635);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:340:1: entryRuleNewPhase : ruleNewPhase EOF ;
    public final void entryRuleNewPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:341:1: ( ruleNewPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:342:1: ruleNewPhase EOF
            {
             before(grammarAccess.getNewPhaseRule()); 
            pushFollow(FOLLOW_ruleNewPhase_in_entryRuleNewPhase662);
            ruleNewPhase();

            state._fsp--;

             after(grammarAccess.getNewPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewPhase669); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:349:1: ruleNewPhase : ( ( rule__NewPhase__PhaseAssignment ) ) ;
    public final void ruleNewPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:353:2: ( ( ( rule__NewPhase__PhaseAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:354:1: ( ( rule__NewPhase__PhaseAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:354:1: ( ( rule__NewPhase__PhaseAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:355:1: ( rule__NewPhase__PhaseAssignment )
            {
             before(grammarAccess.getNewPhaseAccess().getPhaseAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:356:1: ( rule__NewPhase__PhaseAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:356:2: rule__NewPhase__PhaseAssignment
            {
            pushFollow(FOLLOW_rule__NewPhase__PhaseAssignment_in_ruleNewPhase695);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:368:1: entryRuleAtomicPhase : ruleAtomicPhase EOF ;
    public final void entryRuleAtomicPhase() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:369:1: ( ruleAtomicPhase EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:370:1: ruleAtomicPhase EOF
            {
             before(grammarAccess.getAtomicPhaseRule()); 
            pushFollow(FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase722);
            ruleAtomicPhase();

            state._fsp--;

             after(grammarAccess.getAtomicPhaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicPhase729); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:377:1: ruleAtomicPhase : ( ( rule__AtomicPhase__Group__0 ) ) ;
    public final void ruleAtomicPhase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:381:2: ( ( ( rule__AtomicPhase__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:382:1: ( ( rule__AtomicPhase__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:382:1: ( ( rule__AtomicPhase__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:383:1: ( rule__AtomicPhase__Group__0 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:384:1: ( rule__AtomicPhase__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:384:2: rule__AtomicPhase__Group__0
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0_in_ruleAtomicPhase755);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:396:1: entryRuleAttachedMetric : ruleAttachedMetric EOF ;
    public final void entryRuleAttachedMetric() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:397:1: ( ruleAttachedMetric EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:398:1: ruleAttachedMetric EOF
            {
             before(grammarAccess.getAttachedMetricRule()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric782);
            ruleAttachedMetric();

            state._fsp--;

             after(grammarAccess.getAttachedMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedMetric789); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:405:1: ruleAttachedMetric : ( ( rule__AttachedMetric__Alternatives ) ) ;
    public final void ruleAttachedMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:409:2: ( ( ( rule__AttachedMetric__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__AttachedMetric__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:410:1: ( ( rule__AttachedMetric__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:411:1: ( rule__AttachedMetric__Alternatives )
            {
             before(grammarAccess.getAttachedMetricAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:1: ( rule__AttachedMetric__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:412:2: rule__AttachedMetric__Alternatives
            {
            pushFollow(FOLLOW_rule__AttachedMetric__Alternatives_in_ruleAttachedMetric815);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:424:1: entryRuleMetricTypeReference : ruleMetricTypeReference EOF ;
    public final void entryRuleMetricTypeReference() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:425:1: ( ruleMetricTypeReference EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:426:1: ruleMetricTypeReference EOF
            {
             before(grammarAccess.getMetricTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference842);
            ruleMetricTypeReference();

            state._fsp--;

             after(grammarAccess.getMetricTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricTypeReference849); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:433:1: ruleMetricTypeReference : ( ( rule__MetricTypeReference__MetricAssignment ) ) ;
    public final void ruleMetricTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:437:2: ( ( ( rule__MetricTypeReference__MetricAssignment ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:438:1: ( ( rule__MetricTypeReference__MetricAssignment ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:438:1: ( ( rule__MetricTypeReference__MetricAssignment ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:439:1: ( rule__MetricTypeReference__MetricAssignment )
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:440:1: ( rule__MetricTypeReference__MetricAssignment )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:440:2: rule__MetricTypeReference__MetricAssignment
            {
            pushFollow(FOLLOW_rule__MetricTypeReference__MetricAssignment_in_ruleMetricTypeReference875);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:452:1: entryRuleNewMetric : ruleNewMetric EOF ;
    public final void entryRuleNewMetric() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:453:1: ( ruleNewMetric EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:454:1: ruleNewMetric EOF
            {
             before(grammarAccess.getNewMetricRule()); 
            pushFollow(FOLLOW_ruleNewMetric_in_entryRuleNewMetric902);
            ruleNewMetric();

            state._fsp--;

             after(grammarAccess.getNewMetricRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMetric909); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:461:1: ruleNewMetric : ( ( rule__NewMetric__Group__0 ) ) ;
    public final void ruleNewMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:465:2: ( ( ( rule__NewMetric__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:466:1: ( ( rule__NewMetric__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:466:1: ( ( rule__NewMetric__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:467:1: ( rule__NewMetric__Group__0 )
            {
             before(grammarAccess.getNewMetricAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:468:1: ( rule__NewMetric__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:468:2: rule__NewMetric__Group__0
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0_in_ruleNewMetric935);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:480:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:481:1: ( ruleQualifiedName EOF )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:482:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName962);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName969); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:489:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:493:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:494:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:494:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:495:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:496:1: ( rule__QualifiedName__Group__0 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:496:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName995);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:509:1: ruleMetricType : ( ( rule__MetricType__Alternatives ) ) ;
    public final void ruleMetricType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:513:1: ( ( ( rule__MetricType__Alternatives ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:514:1: ( ( rule__MetricType__Alternatives ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:514:1: ( ( rule__MetricType__Alternatives ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:515:1: ( rule__MetricType__Alternatives )
            {
             before(grammarAccess.getMetricTypeAccess().getAlternatives()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:516:1: ( rule__MetricType__Alternatives )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:516:2: rule__MetricType__Alternatives
            {
            pushFollow(FOLLOW_rule__MetricType__Alternatives_in_ruleMetricType1032);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:527:1: rule__Element__Alternatives : ( ( ruleScenario ) | ( rulePhase ) | ( rulePackageDeclaration ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:531:1: ( ( ruleScenario ) | ( rulePhase ) | ( rulePackageDeclaration ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
            case 21:
            case 23:
            case 24:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:532:1: ( ruleScenario )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:532:1: ( ruleScenario )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:533:1: ruleScenario
                    {
                     before(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleScenario_in_rule__Element__Alternatives1067);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:538:6: ( rulePhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:538:6: ( rulePhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:539:1: rulePhase
                    {
                     before(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePhase_in_rule__Element__Alternatives1084);
                    rulePhase();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:544:6: ( rulePackageDeclaration )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:544:6: ( rulePackageDeclaration )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:545:1: rulePackageDeclaration
                    {
                     before(grammarAccess.getElementAccess().getPackageDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePackageDeclaration_in_rule__Element__Alternatives1101);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getPackageDeclarationParserRuleCall_2()); 

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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:555:1: rule__Phase__Alternatives : ( ( ruleSequencePhase ) | ( ruleIterationPhase ) | ( ruleOptionalPhase ) | ( ruleAtomicPhase ) );
    public final void rule__Phase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:559:1: ( ( ruleSequencePhase ) | ( ruleIterationPhase ) | ( ruleOptionalPhase ) | ( ruleAtomicPhase ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:560:1: ( ruleSequencePhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:560:1: ( ruleSequencePhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:561:1: ruleSequencePhase
                    {
                     before(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSequencePhase_in_rule__Phase__Alternatives1133);
                    ruleSequencePhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:566:6: ( ruleIterationPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:566:6: ( ruleIterationPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:567:1: ruleIterationPhase
                    {
                     before(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIterationPhase_in_rule__Phase__Alternatives1150);
                    ruleIterationPhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:572:6: ( ruleOptionalPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:572:6: ( ruleOptionalPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:573:1: ruleOptionalPhase
                    {
                     before(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleOptionalPhase_in_rule__Phase__Alternatives1167);
                    ruleOptionalPhase();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:578:6: ( ruleAtomicPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:578:6: ( ruleAtomicPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:579:1: ruleAtomicPhase
                    {
                     before(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAtomicPhase_in_rule__Phase__Alternatives1184);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:589:1: rule__AttachedPhase__Alternatives : ( ( rulePhaseReference ) | ( ruleNewPhase ) );
    public final void rule__AttachedPhase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:593:1: ( ( rulePhaseReference ) | ( ruleNewPhase ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==18||LA4_0==21||(LA4_0>=23 && LA4_0<=24)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:594:1: ( rulePhaseReference )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:594:1: ( rulePhaseReference )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:595:1: rulePhaseReference
                    {
                     before(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePhaseReference_in_rule__AttachedPhase__Alternatives1216);
                    rulePhaseReference();

                    state._fsp--;

                     after(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:600:6: ( ruleNewPhase )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:600:6: ( ruleNewPhase )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:601:1: ruleNewPhase
                    {
                     before(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNewPhase_in_rule__AttachedPhase__Alternatives1233);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:611:1: rule__AttachedMetric__Alternatives : ( ( ruleMetricTypeReference ) | ( ruleNewMetric ) );
    public final void rule__AttachedMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:615:1: ( ( ruleMetricTypeReference ) | ( ruleNewMetric ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=11 && LA5_0<=13)) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:616:1: ( ruleMetricTypeReference )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:616:1: ( ruleMetricTypeReference )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:617:1: ruleMetricTypeReference
                    {
                     before(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMetricTypeReference_in_rule__AttachedMetric__Alternatives1265);
                    ruleMetricTypeReference();

                    state._fsp--;

                     after(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:622:6: ( ruleNewMetric )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:622:6: ( ruleNewMetric )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:623:1: ruleNewMetric
                    {
                     before(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNewMetric_in_rule__AttachedMetric__Alternatives1282);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:633:1: rule__MetricType__Alternatives : ( ( ( 'Time' ) ) | ( ( 'Memory' ) ) | ( ( 'Scalar' ) ) );
    public final void rule__MetricType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:637:1: ( ( ( 'Time' ) ) | ( ( 'Memory' ) ) | ( ( 'Scalar' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:638:1: ( ( 'Time' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:638:1: ( ( 'Time' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:639:1: ( 'Time' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:640:1: ( 'Time' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:640:3: 'Time'
                    {
                    match(input,11,FOLLOW_11_in_rule__MetricType__Alternatives1315); 

                    }

                     after(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:645:6: ( ( 'Memory' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:645:6: ( ( 'Memory' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:646:1: ( 'Memory' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:647:1: ( 'Memory' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:647:3: 'Memory'
                    {
                    match(input,12,FOLLOW_12_in_rule__MetricType__Alternatives1336); 

                    }

                     after(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:652:6: ( ( 'Scalar' ) )
                    {
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:652:6: ( ( 'Scalar' ) )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:653:1: ( 'Scalar' )
                    {
                     before(grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); 
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:654:1: ( 'Scalar' )
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:654:3: 'Scalar'
                    {
                    match(input,13,FOLLOW_13_in_rule__MetricType__Alternatives1357); 

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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:666:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:670:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:671:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01390);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01393);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:678:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:682:1: ( ( 'package' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:683:1: ( 'package' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:683:1: ( 'package' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:684:1: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__PackageDeclaration__Group__0__Impl1421); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:697:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:701:1: ( rule__PackageDeclaration__Group__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:702:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11452);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:708:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:712:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:713:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:713:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:714:1: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:715:1: ( rule__PackageDeclaration__NameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:715:2: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1479);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:729:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:733:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:734:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01513);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01516);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:741:1: rule__Scenario__Group__0__Impl : ( 'Scenario' ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:745:1: ( ( 'Scenario' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:746:1: ( 'Scenario' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:746:1: ( 'Scenario' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:747:1: 'Scenario'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Scenario__Group__0__Impl1544); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:760:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:764:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:765:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11575);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11578);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:772:1: rule__Scenario__Group__1__Impl : ( ( rule__Scenario__ScenarionameAssignment_1 ) ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:776:1: ( ( ( rule__Scenario__ScenarionameAssignment_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:777:1: ( ( rule__Scenario__ScenarionameAssignment_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:777:1: ( ( rule__Scenario__ScenarionameAssignment_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:778:1: ( rule__Scenario__ScenarionameAssignment_1 )
            {
             before(grammarAccess.getScenarioAccess().getScenarionameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:779:1: ( rule__Scenario__ScenarionameAssignment_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:779:2: rule__Scenario__ScenarionameAssignment_1
            {
            pushFollow(FOLLOW_rule__Scenario__ScenarionameAssignment_1_in_rule__Scenario__Group__1__Impl1605);
            rule__Scenario__ScenarionameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getScenarionameAssignment_1()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:789:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:793:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:794:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21635);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21638);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:801:1: rule__Scenario__Group__2__Impl : ( '{' ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:805:1: ( ( '{' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:806:1: ( '{' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:806:1: ( '{' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:807:1: '{'
            {
             before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Scenario__Group__2__Impl1666); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:820:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:824:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:825:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31697);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31700);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:832:1: rule__Scenario__Group__3__Impl : ( ( rule__Scenario__RootPhaseAssignment_3 ) ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:836:1: ( ( ( rule__Scenario__RootPhaseAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:837:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:837:1: ( ( rule__Scenario__RootPhaseAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:838:1: ( rule__Scenario__RootPhaseAssignment_3 )
            {
             before(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:839:1: ( rule__Scenario__RootPhaseAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:839:2: rule__Scenario__RootPhaseAssignment_3
            {
            pushFollow(FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1727);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:849:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:853:1: ( rule__Scenario__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:854:2: rule__Scenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41757);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:860:1: rule__Scenario__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:864:1: ( ( '}' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:865:1: ( '}' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:865:1: ( '}' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:866:1: '}'
            {
             before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Scenario__Group__4__Impl1785); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:889:1: rule__SequencePhase__Group__0 : rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 ;
    public final void rule__SequencePhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:893:1: ( rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:894:2: rule__SequencePhase__Group__0__Impl rule__SequencePhase__Group__1
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01826);
            rule__SequencePhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01829);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:901:1: rule__SequencePhase__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__SequencePhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:905:1: ( ( 'Sequence' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:906:1: ( 'Sequence' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:906:1: ( 'Sequence' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:907:1: 'Sequence'
            {
             before(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__SequencePhase__Group__0__Impl1857); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:920:1: rule__SequencePhase__Group__1 : rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 ;
    public final void rule__SequencePhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:924:1: ( rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:925:2: rule__SequencePhase__Group__1__Impl rule__SequencePhase__Group__2
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11888);
            rule__SequencePhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11891);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:932:1: rule__SequencePhase__Group__1__Impl : ( ( rule__SequencePhase__NameAssignment_1 )? ) ;
    public final void rule__SequencePhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:936:1: ( ( ( rule__SequencePhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:937:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:937:1: ( ( rule__SequencePhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:938:1: ( rule__SequencePhase__NameAssignment_1 )?
            {
             before(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:939:1: ( rule__SequencePhase__NameAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:939:2: rule__SequencePhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1918);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:949:1: rule__SequencePhase__Group__2 : rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 ;
    public final void rule__SequencePhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:953:1: ( rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:954:2: rule__SequencePhase__Group__2__Impl rule__SequencePhase__Group__3
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21949);
            rule__SequencePhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21952);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:961:1: rule__SequencePhase__Group__2__Impl : ( '(' ) ;
    public final void rule__SequencePhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:965:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:966:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:966:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:967:1: '('
            {
             before(grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__SequencePhase__Group__2__Impl1980); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:980:1: rule__SequencePhase__Group__3 : rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 ;
    public final void rule__SequencePhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:984:1: ( rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:985:2: rule__SequencePhase__Group__3__Impl rule__SequencePhase__Group__4
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__32011);
            rule__SequencePhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__32014);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:992:1: rule__SequencePhase__Group__3__Impl : ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) ;
    public final void rule__SequencePhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:996:1: ( ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:997:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:997:1: ( ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:998:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) ) ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:998:1: ( ( rule__SequencePhase__PhasesAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:999:1: ( rule__SequencePhase__PhasesAssignment_3 )
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1000:1: ( rule__SequencePhase__PhasesAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1000:2: rule__SequencePhase__PhasesAssignment_3
            {
            pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2043);
            rule__SequencePhase__PhasesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 

            }

            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1003:1: ( ( rule__SequencePhase__PhasesAssignment_3 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1004:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1005:1: ( rule__SequencePhase__PhasesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==18||LA8_0==21||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1005:2: rule__SequencePhase__PhasesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2055);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1016:1: rule__SequencePhase__Group__4 : rule__SequencePhase__Group__4__Impl ;
    public final void rule__SequencePhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1020:1: ( rule__SequencePhase__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1021:2: rule__SequencePhase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42088);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1027:1: rule__SequencePhase__Group__4__Impl : ( ')' ) ;
    public final void rule__SequencePhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1031:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1032:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1032:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1033:1: ')'
            {
             before(grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__SequencePhase__Group__4__Impl2116); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1056:1: rule__IterationPhase__Group__0 : rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 ;
    public final void rule__IterationPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1060:1: ( rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1061:2: rule__IterationPhase__Group__0__Impl rule__IterationPhase__Group__1
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02157);
            rule__IterationPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02160);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1068:1: rule__IterationPhase__Group__0__Impl : ( 'Iteration' ) ;
    public final void rule__IterationPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1072:1: ( ( 'Iteration' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1073:1: ( 'Iteration' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1073:1: ( 'Iteration' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1074:1: 'Iteration'
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__IterationPhase__Group__0__Impl2188); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1087:1: rule__IterationPhase__Group__1 : rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 ;
    public final void rule__IterationPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1091:1: ( rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1092:2: rule__IterationPhase__Group__1__Impl rule__IterationPhase__Group__2
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12219);
            rule__IterationPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12222);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1099:1: rule__IterationPhase__Group__1__Impl : ( ( rule__IterationPhase__NameAssignment_1 )? ) ;
    public final void rule__IterationPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1103:1: ( ( ( rule__IterationPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1104:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1104:1: ( ( rule__IterationPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1105:1: ( rule__IterationPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1106:1: ( rule__IterationPhase__NameAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1106:2: rule__IterationPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2249);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1116:1: rule__IterationPhase__Group__2 : rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 ;
    public final void rule__IterationPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1120:1: ( rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1121:2: rule__IterationPhase__Group__2__Impl rule__IterationPhase__Group__3
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22280);
            rule__IterationPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22283);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1128:1: rule__IterationPhase__Group__2__Impl : ( '(' ) ;
    public final void rule__IterationPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1132:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1133:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1133:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1134:1: '('
            {
             before(grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__IterationPhase__Group__2__Impl2311); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1147:1: rule__IterationPhase__Group__3 : rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 ;
    public final void rule__IterationPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1151:1: ( rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1152:2: rule__IterationPhase__Group__3__Impl rule__IterationPhase__Group__4
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32342);
            rule__IterationPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32345);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1159:1: rule__IterationPhase__Group__3__Impl : ( ( rule__IterationPhase__IterationAssignment_3 ) ) ;
    public final void rule__IterationPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1163:1: ( ( ( rule__IterationPhase__IterationAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1164:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1164:1: ( ( rule__IterationPhase__IterationAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1165:1: ( rule__IterationPhase__IterationAssignment_3 )
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1166:1: ( rule__IterationPhase__IterationAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1166:2: rule__IterationPhase__IterationAssignment_3
            {
            pushFollow(FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2372);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1176:1: rule__IterationPhase__Group__4 : rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 ;
    public final void rule__IterationPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1180:1: ( rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1181:2: rule__IterationPhase__Group__4__Impl rule__IterationPhase__Group__5
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42402);
            rule__IterationPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42405);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1188:1: rule__IterationPhase__Group__4__Impl : ( '*' ) ;
    public final void rule__IterationPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1192:1: ( ( '*' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1193:1: ( '*' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1193:1: ( '*' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1194:1: '*'
            {
             before(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__IterationPhase__Group__4__Impl2433); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1207:1: rule__IterationPhase__Group__5 : rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 ;
    public final void rule__IterationPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1211:1: ( rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1212:2: rule__IterationPhase__Group__5__Impl rule__IterationPhase__Group__6
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52464);
            rule__IterationPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52467);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1219:1: rule__IterationPhase__Group__5__Impl : ( ( rule__IterationPhase__PhaseAssignment_5 ) ) ;
    public final void rule__IterationPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1223:1: ( ( ( rule__IterationPhase__PhaseAssignment_5 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1224:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1224:1: ( ( rule__IterationPhase__PhaseAssignment_5 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1225:1: ( rule__IterationPhase__PhaseAssignment_5 )
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1226:1: ( rule__IterationPhase__PhaseAssignment_5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1226:2: rule__IterationPhase__PhaseAssignment_5
            {
            pushFollow(FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2494);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1236:1: rule__IterationPhase__Group__6 : rule__IterationPhase__Group__6__Impl ;
    public final void rule__IterationPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1240:1: ( rule__IterationPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1241:2: rule__IterationPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62524);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1247:1: rule__IterationPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__IterationPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1251:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1252:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1252:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1253:1: ')'
            {
             before(grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__IterationPhase__Group__6__Impl2552); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1280:1: rule__OptionalPhase__Group__0 : rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 ;
    public final void rule__OptionalPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1284:1: ( rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1285:2: rule__OptionalPhase__Group__0__Impl rule__OptionalPhase__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02597);
            rule__OptionalPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02600);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1292:1: rule__OptionalPhase__Group__0__Impl : ( 'Optional' ) ;
    public final void rule__OptionalPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1296:1: ( ( 'Optional' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1297:1: ( 'Optional' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1297:1: ( 'Optional' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1298:1: 'Optional'
            {
             before(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__OptionalPhase__Group__0__Impl2628); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1311:1: rule__OptionalPhase__Group__1 : rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 ;
    public final void rule__OptionalPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1315:1: ( rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1316:2: rule__OptionalPhase__Group__1__Impl rule__OptionalPhase__Group__2
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12659);
            rule__OptionalPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12662);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1323:1: rule__OptionalPhase__Group__1__Impl : ( ( rule__OptionalPhase__NameAssignment_1 )? ) ;
    public final void rule__OptionalPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1327:1: ( ( ( rule__OptionalPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1328:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1328:1: ( ( rule__OptionalPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1329:1: ( rule__OptionalPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1330:1: ( rule__OptionalPhase__NameAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1330:2: rule__OptionalPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2689);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1340:1: rule__OptionalPhase__Group__2 : rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 ;
    public final void rule__OptionalPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1344:1: ( rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1345:2: rule__OptionalPhase__Group__2__Impl rule__OptionalPhase__Group__3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22720);
            rule__OptionalPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22723);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1352:1: rule__OptionalPhase__Group__2__Impl : ( '(' ) ;
    public final void rule__OptionalPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1356:1: ( ( '(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1357:1: ( '(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1357:1: ( '(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1358:1: '('
            {
             before(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__OptionalPhase__Group__2__Impl2751); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1371:1: rule__OptionalPhase__Group__3 : rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 ;
    public final void rule__OptionalPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1375:1: ( rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1376:2: rule__OptionalPhase__Group__3__Impl rule__OptionalPhase__Group__4
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32782);
            rule__OptionalPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32785);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1383:1: rule__OptionalPhase__Group__3__Impl : ( ( rule__OptionalPhase__PhaseAssignment_3 ) ) ;
    public final void rule__OptionalPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1387:1: ( ( ( rule__OptionalPhase__PhaseAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1388:1: ( ( rule__OptionalPhase__PhaseAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1388:1: ( ( rule__OptionalPhase__PhaseAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1389:1: ( rule__OptionalPhase__PhaseAssignment_3 )
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1390:1: ( rule__OptionalPhase__PhaseAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1390:2: rule__OptionalPhase__PhaseAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionalPhase__PhaseAssignment_3_in_rule__OptionalPhase__Group__3__Impl2812);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1400:1: rule__OptionalPhase__Group__4 : rule__OptionalPhase__Group__4__Impl ;
    public final void rule__OptionalPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1404:1: ( rule__OptionalPhase__Group__4__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1405:2: rule__OptionalPhase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42842);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1411:1: rule__OptionalPhase__Group__4__Impl : ( ')' ) ;
    public final void rule__OptionalPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1415:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1416:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1416:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1417:1: ')'
            {
             before(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__OptionalPhase__Group__4__Impl2870); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1440:1: rule__AtomicPhase__Group__0 : rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 ;
    public final void rule__AtomicPhase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1444:1: ( rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1445:2: rule__AtomicPhase__Group__0__Impl rule__AtomicPhase__Group__1
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02911);
            rule__AtomicPhase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__02914);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1452:1: rule__AtomicPhase__Group__0__Impl : ( 'Atomic' ) ;
    public final void rule__AtomicPhase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1456:1: ( ( 'Atomic' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1457:1: ( 'Atomic' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1457:1: ( 'Atomic' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1458:1: 'Atomic'
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__AtomicPhase__Group__0__Impl2942); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1471:1: rule__AtomicPhase__Group__1 : rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 ;
    public final void rule__AtomicPhase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1475:1: ( rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1476:2: rule__AtomicPhase__Group__1__Impl rule__AtomicPhase__Group__2
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__12973);
            rule__AtomicPhase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__12976);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1483:1: rule__AtomicPhase__Group__1__Impl : ( ( rule__AtomicPhase__NameAssignment_1 )? ) ;
    public final void rule__AtomicPhase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1487:1: ( ( ( rule__AtomicPhase__NameAssignment_1 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1488:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1488:1: ( ( rule__AtomicPhase__NameAssignment_1 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1489:1: ( rule__AtomicPhase__NameAssignment_1 )?
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1490:1: ( rule__AtomicPhase__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1490:2: rule__AtomicPhase__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3003);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1500:1: rule__AtomicPhase__Group__2 : rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 ;
    public final void rule__AtomicPhase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1504:1: ( rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1505:2: rule__AtomicPhase__Group__2__Impl rule__AtomicPhase__Group__3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23034);
            rule__AtomicPhase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23037);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1512:1: rule__AtomicPhase__Group__2__Impl : ( 'ClassName' ) ;
    public final void rule__AtomicPhase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1516:1: ( ( 'ClassName' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1517:1: ( 'ClassName' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1517:1: ( 'ClassName' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1518:1: 'ClassName'
            {
             before(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3065); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1531:1: rule__AtomicPhase__Group__3 : rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 ;
    public final void rule__AtomicPhase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1535:1: ( rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1536:2: rule__AtomicPhase__Group__3__Impl rule__AtomicPhase__Group__4
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33096);
            rule__AtomicPhase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33099);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1543:1: rule__AtomicPhase__Group__3__Impl : ( ( rule__AtomicPhase__AtomicnameAssignment_3 ) ) ;
    public final void rule__AtomicPhase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1547:1: ( ( ( rule__AtomicPhase__AtomicnameAssignment_3 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1548:1: ( ( rule__AtomicPhase__AtomicnameAssignment_3 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1548:1: ( ( rule__AtomicPhase__AtomicnameAssignment_3 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1549:1: ( rule__AtomicPhase__AtomicnameAssignment_3 )
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicnameAssignment_3()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1550:1: ( rule__AtomicPhase__AtomicnameAssignment_3 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1550:2: rule__AtomicPhase__AtomicnameAssignment_3
            {
            pushFollow(FOLLOW_rule__AtomicPhase__AtomicnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3126);
            rule__AtomicPhase__AtomicnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicPhaseAccess().getAtomicnameAssignment_3()); 

            }


            }

        }
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1560:1: rule__AtomicPhase__Group__4 : rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 ;
    public final void rule__AtomicPhase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1564:1: ( rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1565:2: rule__AtomicPhase__Group__4__Impl rule__AtomicPhase__Group__5
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43156);
            rule__AtomicPhase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43159);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1572:1: rule__AtomicPhase__Group__4__Impl : ( 'Metrics(' ) ;
    public final void rule__AtomicPhase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1576:1: ( ( 'Metrics(' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1577:1: ( 'Metrics(' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1577:1: ( 'Metrics(' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1578:1: 'Metrics('
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3187); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1591:1: rule__AtomicPhase__Group__5 : rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 ;
    public final void rule__AtomicPhase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1595:1: ( rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1596:2: rule__AtomicPhase__Group__5__Impl rule__AtomicPhase__Group__6
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53218);
            rule__AtomicPhase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53221);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1603:1: rule__AtomicPhase__Group__5__Impl : ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) ;
    public final void rule__AtomicPhase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1607:1: ( ( ( rule__AtomicPhase__MetricsAssignment_5 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1608:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1608:1: ( ( rule__AtomicPhase__MetricsAssignment_5 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1609:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1610:1: ( rule__AtomicPhase__MetricsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=13)||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1610:2: rule__AtomicPhase__MetricsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3248);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1620:1: rule__AtomicPhase__Group__6 : rule__AtomicPhase__Group__6__Impl ;
    public final void rule__AtomicPhase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1624:1: ( rule__AtomicPhase__Group__6__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1625:2: rule__AtomicPhase__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63279);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1631:1: rule__AtomicPhase__Group__6__Impl : ( ')' ) ;
    public final void rule__AtomicPhase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1635:1: ( ( ')' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1636:1: ( ')' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1636:1: ( ')' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1637:1: ')'
            {
             before(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3307); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1664:1: rule__NewMetric__Group__0 : rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 ;
    public final void rule__NewMetric__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1668:1: ( rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1669:2: rule__NewMetric__Group__0__Impl rule__NewMetric__Group__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03352);
            rule__NewMetric__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03355);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1676:1: rule__NewMetric__Group__0__Impl : ( 'new Metric' ) ;
    public final void rule__NewMetric__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1680:1: ( ( 'new Metric' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1681:1: ( 'new Metric' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1681:1: ( 'new Metric' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1682:1: 'new Metric'
            {
             before(grammarAccess.getNewMetricAccess().getNewMetricKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__NewMetric__Group__0__Impl3383); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1695:1: rule__NewMetric__Group__1 : rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 ;
    public final void rule__NewMetric__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1699:1: ( rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1700:2: rule__NewMetric__Group__1__Impl rule__NewMetric__Group__2
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13414);
            rule__NewMetric__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13417);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1707:1: rule__NewMetric__Group__1__Impl : ( ( rule__NewMetric__Group_1__0 )? ) ;
    public final void rule__NewMetric__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1711:1: ( ( ( rule__NewMetric__Group_1__0 )? ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1712:1: ( ( rule__NewMetric__Group_1__0 )? )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1712:1: ( ( rule__NewMetric__Group_1__0 )? )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1713:1: ( rule__NewMetric__Group_1__0 )?
            {
             before(grammarAccess.getNewMetricAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1714:1: ( rule__NewMetric__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1714:2: rule__NewMetric__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NewMetric__Group_1__0_in_rule__NewMetric__Group__1__Impl3444);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1724:1: rule__NewMetric__Group__2 : rule__NewMetric__Group__2__Impl ;
    public final void rule__NewMetric__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1728:1: ( rule__NewMetric__Group__2__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1729:2: rule__NewMetric__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23475);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1735:1: rule__NewMetric__Group__2__Impl : ( ( rule__NewMetric__MetricnameAssignment_2 ) ) ;
    public final void rule__NewMetric__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1739:1: ( ( ( rule__NewMetric__MetricnameAssignment_2 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1740:1: ( ( rule__NewMetric__MetricnameAssignment_2 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1740:1: ( ( rule__NewMetric__MetricnameAssignment_2 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1741:1: ( rule__NewMetric__MetricnameAssignment_2 )
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameAssignment_2()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1742:1: ( rule__NewMetric__MetricnameAssignment_2 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1742:2: rule__NewMetric__MetricnameAssignment_2
            {
            pushFollow(FOLLOW_rule__NewMetric__MetricnameAssignment_2_in_rule__NewMetric__Group__2__Impl3502);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1758:1: rule__NewMetric__Group_1__0 : rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1 ;
    public final void rule__NewMetric__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1762:1: ( rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1763:2: rule__NewMetric__Group_1__0__Impl rule__NewMetric__Group_1__1
            {
            pushFollow(FOLLOW_rule__NewMetric__Group_1__0__Impl_in_rule__NewMetric__Group_1__03538);
            rule__NewMetric__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NewMetric__Group_1__1_in_rule__NewMetric__Group_1__03541);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1770:1: rule__NewMetric__Group_1__0__Impl : ( 'ID' ) ;
    public final void rule__NewMetric__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1774:1: ( ( 'ID' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1775:1: ( 'ID' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1775:1: ( 'ID' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1776:1: 'ID'
            {
             before(grammarAccess.getNewMetricAccess().getIDKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__NewMetric__Group_1__0__Impl3569); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1789:1: rule__NewMetric__Group_1__1 : rule__NewMetric__Group_1__1__Impl ;
    public final void rule__NewMetric__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1793:1: ( rule__NewMetric__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1794:2: rule__NewMetric__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMetric__Group_1__1__Impl_in_rule__NewMetric__Group_1__13600);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1800:1: rule__NewMetric__Group_1__1__Impl : ( ( rule__NewMetric__NameAssignment_1_1 ) ) ;
    public final void rule__NewMetric__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1804:1: ( ( ( rule__NewMetric__NameAssignment_1_1 ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1805:1: ( ( rule__NewMetric__NameAssignment_1_1 ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1805:1: ( ( rule__NewMetric__NameAssignment_1_1 ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1806:1: ( rule__NewMetric__NameAssignment_1_1 )
            {
             before(grammarAccess.getNewMetricAccess().getNameAssignment_1_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1807:1: ( rule__NewMetric__NameAssignment_1_1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1807:2: rule__NewMetric__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NewMetric__NameAssignment_1_1_in_rule__NewMetric__Group_1__1__Impl3627);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1821:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1825:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1826:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03661);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03664);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1833:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1837:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1838:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1838:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1839:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3691); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1850:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1854:1: ( rule__QualifiedName__Group__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1855:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13720);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1861:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1865:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1866:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1866:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1867:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1868:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1868:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3747);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1882:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1886:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1887:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03782);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03785);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1894:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1898:1: ( ( '.' ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1899:1: ( '.' )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1899:1: ( '.' )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1900:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3813); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1913:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1917:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1918:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13844);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1924:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1928:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1929:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1929:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1930:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3871); 
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


    // $ANTLR start "rule__Benchmark__ElementsAssignment"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1946:1: rule__Benchmark__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Benchmark__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1950:1: ( ( ruleElement ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1951:1: ( ruleElement )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1951:1: ( ruleElement )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1952:1: ruleElement
            {
             before(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment3909);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Benchmark__ElementsAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1961:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1965:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1966:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1966:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1967:1: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13940);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Scenario__ScenarionameAssignment_1"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1976:1: rule__Scenario__ScenarionameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Scenario__ScenarionameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1980:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1981:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1981:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1982:1: ruleQualifiedName
            {
             before(grammarAccess.getScenarioAccess().getScenarionameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Scenario__ScenarionameAssignment_13971);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getScenarionameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__ScenarionameAssignment_1"


    // $ANTLR start "rule__Scenario__RootPhaseAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1991:1: rule__Scenario__RootPhaseAssignment_3 : ( rulePhase ) ;
    public final void rule__Scenario__RootPhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1995:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1996:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1996:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:1997:1: rulePhase
            {
             before(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__Scenario__RootPhaseAssignment_34002);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2006:1: rule__SequencePhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequencePhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2010:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2011:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2011:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2012:1: RULE_ID
            {
             before(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14033); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2021:1: rule__SequencePhase__PhasesAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__SequencePhase__PhasesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2025:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2026:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2026:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2027:1: ruleAttachedPhase
            {
             before(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34064);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2036:1: rule__IterationPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IterationPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2040:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2041:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2041:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2042:1: RULE_ID
            {
             before(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14095); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2051:1: rule__IterationPhase__IterationAssignment_3 : ( RULE_INT ) ;
    public final void rule__IterationPhase__IterationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2055:1: ( ( RULE_INT ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2056:1: ( RULE_INT )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2056:1: ( RULE_INT )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2057:1: RULE_INT
            {
             before(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34126); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2066:1: rule__IterationPhase__PhaseAssignment_5 : ( ruleAttachedPhase ) ;
    public final void rule__IterationPhase__PhaseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2070:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2071:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2071:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2072:1: ruleAttachedPhase
            {
             before(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54157);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2081:1: rule__OptionalPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OptionalPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2085:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2086:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2086:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2087:1: RULE_ID
            {
             before(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14188); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2096:1: rule__OptionalPhase__PhaseAssignment_3 : ( ruleAttachedPhase ) ;
    public final void rule__OptionalPhase__PhaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2100:1: ( ( ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2101:1: ( ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2101:1: ( ruleAttachedPhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2102:1: ruleAttachedPhase
            {
             before(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_34219);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2111:1: rule__PhaseReference__PhaseAssignment : ( ( RULE_ID ) ) ;
    public final void rule__PhaseReference__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2115:1: ( ( ( RULE_ID ) ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: ( ( RULE_ID ) )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2116:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2117:1: ( RULE_ID )
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2118:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2119:1: RULE_ID
            {
             before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4254); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2130:1: rule__NewPhase__PhaseAssignment : ( rulePhase ) ;
    public final void rule__NewPhase__PhaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2134:1: ( ( rulePhase ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2135:1: ( rulePhase )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2135:1: ( rulePhase )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2136:1: rulePhase
            {
             before(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4289);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2145:1: rule__AtomicPhase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtomicPhase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2149:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2150:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2150:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2151:1: RULE_ID
            {
             before(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14320); 
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


    // $ANTLR start "rule__AtomicPhase__AtomicnameAssignment_3"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2160:1: rule__AtomicPhase__AtomicnameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__AtomicPhase__AtomicnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2164:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2165:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2165:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2166:1: ruleQualifiedName
            {
             before(grammarAccess.getAtomicPhaseAccess().getAtomicnameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AtomicPhase__AtomicnameAssignment_34351);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomicPhaseAccess().getAtomicnameQualifiedNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicPhase__AtomicnameAssignment_3"


    // $ANTLR start "rule__AtomicPhase__MetricsAssignment_5"
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2175:1: rule__AtomicPhase__MetricsAssignment_5 : ( ruleAttachedMetric ) ;
    public final void rule__AtomicPhase__MetricsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2179:1: ( ( ruleAttachedMetric ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2180:1: ( ruleAttachedMetric )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2180:1: ( ruleAttachedMetric )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2181:1: ruleAttachedMetric
            {
             before(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54382);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2190:1: rule__MetricTypeReference__MetricAssignment : ( ruleMetricType ) ;
    public final void rule__MetricTypeReference__MetricAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2194:1: ( ( ruleMetricType ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2195:1: ( ruleMetricType )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2195:1: ( ruleMetricType )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2196:1: ruleMetricType
            {
             before(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment4413);
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2205:1: rule__NewMetric__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__NewMetric__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2209:1: ( ( RULE_ID ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2210:1: ( RULE_ID )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2210:1: ( RULE_ID )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2211:1: RULE_ID
            {
             before(grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMetric__NameAssignment_1_14444); 
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
    // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2220:1: rule__NewMetric__MetricnameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__NewMetric__MetricnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2224:1: ( ( ruleQualifiedName ) )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2225:1: ( ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2225:1: ( ruleQualifiedName )
            // ../eu.mondo.sam.domain.ui/src-gen/eu/mondo/sam/domain/ui/contentassist/antlr/internal/InternalBenchmark.g:2226:1: ruleQualifiedName
            {
             before(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__NewMetric__MetricnameAssignment_24475);
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
    public static final BitSet FOLLOW_rule__Benchmark__ElementsAssignment_in_ruleBenchmark94 = new BitSet(new long[]{0x0000000001A4C002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0_in_rulePackageDeclaration215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0_in_ruleScenario275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_entryRulePhase302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhase309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phase__Alternatives_in_rulePhase335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePhase369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__0_in_ruleSequencePhase395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationPhase429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0_in_ruleIterationPhase455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalPhase489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0_in_ruleOptionalPhase515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedPhase549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttachedPhase__Alternatives_in_ruleAttachedPhase575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_entryRulePhaseReference602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseReference609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhaseReference__PhaseAssignment_in_rulePhaseReference635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_entryRuleNewPhase662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewPhase669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewPhase__PhaseAssignment_in_ruleNewPhase695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicPhase729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0_in_ruleAtomicPhase755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedMetric789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttachedMetric__Alternatives_in_ruleAttachedMetric815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricTypeReference849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricTypeReference__MetricAssignment_in_ruleMetricTypeReference875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_entryRuleNewMetric902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMetric909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0_in_ruleNewMetric935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetricType__Alternatives_in_ruleMetricType1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_rule__Element__Alternatives1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__Element__Alternatives1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_rule__Element__Alternatives1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_rule__Phase__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_rule__Phase__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_rule__Phase__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_rule__Phase__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_rule__AttachedPhase__Alternatives1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_rule__AttachedPhase__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_rule__AttachedMetric__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_rule__AttachedMetric__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__MetricType__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__MetricType__Alternatives1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MetricType__Alternatives1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__0__Impl_in_rule__PackageDeclaration__Group__01390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1_in_rule__PackageDeclaration__Group__01393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PackageDeclaration__Group__0__Impl1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__Group__1__Impl_in_rule__PackageDeclaration__Group__11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackageDeclaration__NameAssignment_1_in_rule__PackageDeclaration__Group__1__Impl1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__0__Impl_in_rule__Scenario__Group__01513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1_in_rule__Scenario__Group__01516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Scenario__Group__0__Impl1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__1__Impl_in_rule__Scenario__Group__11575 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2_in_rule__Scenario__Group__11578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__ScenarionameAssignment_1_in_rule__Scenario__Group__1__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__2__Impl_in_rule__Scenario__Group__21635 = new BitSet(new long[]{0x0000000001A40000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3_in_rule__Scenario__Group__21638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Scenario__Group__2__Impl1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__3__Impl_in_rule__Scenario__Group__31697 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4_in_rule__Scenario__Group__31700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__RootPhaseAssignment_3_in_rule__Scenario__Group__3__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenario__Group__4__Impl_in_rule__Scenario__Group__41757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Scenario__Group__4__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__0__Impl_in_rule__SequencePhase__Group__01826 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1_in_rule__SequencePhase__Group__01829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__SequencePhase__Group__0__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__1__Impl_in_rule__SequencePhase__Group__11888 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2_in_rule__SequencePhase__Group__11891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__NameAssignment_1_in_rule__SequencePhase__Group__1__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__2__Impl_in_rule__SequencePhase__Group__21949 = new BitSet(new long[]{0x0000000001A40010L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3_in_rule__SequencePhase__Group__21952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SequencePhase__Group__2__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__3__Impl_in_rule__SequencePhase__Group__32011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4_in_rule__SequencePhase__Group__32014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2043 = new BitSet(new long[]{0x0000000001A40012L});
    public static final BitSet FOLLOW_rule__SequencePhase__PhasesAssignment_3_in_rule__SequencePhase__Group__3__Impl2055 = new BitSet(new long[]{0x0000000001A40012L});
    public static final BitSet FOLLOW_rule__SequencePhase__Group__4__Impl_in_rule__SequencePhase__Group__42088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SequencePhase__Group__4__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__0__Impl_in_rule__IterationPhase__Group__02157 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1_in_rule__IterationPhase__Group__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IterationPhase__Group__0__Impl2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__1__Impl_in_rule__IterationPhase__Group__12219 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2_in_rule__IterationPhase__Group__12222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__NameAssignment_1_in_rule__IterationPhase__Group__1__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__2__Impl_in_rule__IterationPhase__Group__22280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3_in_rule__IterationPhase__Group__22283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__IterationPhase__Group__2__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__3__Impl_in_rule__IterationPhase__Group__32342 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4_in_rule__IterationPhase__Group__32345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__IterationAssignment_3_in_rule__IterationPhase__Group__3__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__4__Impl_in_rule__IterationPhase__Group__42402 = new BitSet(new long[]{0x0000000001A40010L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5_in_rule__IterationPhase__Group__42405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__IterationPhase__Group__4__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__5__Impl_in_rule__IterationPhase__Group__52464 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6_in_rule__IterationPhase__Group__52467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__PhaseAssignment_5_in_rule__IterationPhase__Group__5__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IterationPhase__Group__6__Impl_in_rule__IterationPhase__Group__62524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IterationPhase__Group__6__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__0__Impl_in_rule__OptionalPhase__Group__02597 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1_in_rule__OptionalPhase__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__OptionalPhase__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__1__Impl_in_rule__OptionalPhase__Group__12659 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2_in_rule__OptionalPhase__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__NameAssignment_1_in_rule__OptionalPhase__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__2__Impl_in_rule__OptionalPhase__Group__22720 = new BitSet(new long[]{0x0000000001A40010L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3_in_rule__OptionalPhase__Group__22723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__OptionalPhase__Group__2__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__3__Impl_in_rule__OptionalPhase__Group__32782 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4_in_rule__OptionalPhase__Group__32785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__PhaseAssignment_3_in_rule__OptionalPhase__Group__3__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalPhase__Group__4__Impl_in_rule__OptionalPhase__Group__42842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__OptionalPhase__Group__4__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__0__Impl_in_rule__AtomicPhase__Group__02911 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1_in_rule__AtomicPhase__Group__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AtomicPhase__Group__0__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__1__Impl_in_rule__AtomicPhase__Group__12973 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2_in_rule__AtomicPhase__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__NameAssignment_1_in_rule__AtomicPhase__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__2__Impl_in_rule__AtomicPhase__Group__23034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3_in_rule__AtomicPhase__Group__23037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AtomicPhase__Group__2__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__3__Impl_in_rule__AtomicPhase__Group__33096 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4_in_rule__AtomicPhase__Group__33099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__AtomicnameAssignment_3_in_rule__AtomicPhase__Group__3__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__4__Impl_in_rule__AtomicPhase__Group__43156 = new BitSet(new long[]{0x0000000008103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5_in_rule__AtomicPhase__Group__43159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AtomicPhase__Group__4__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__5__Impl_in_rule__AtomicPhase__Group__53218 = new BitSet(new long[]{0x0000000008103800L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6_in_rule__AtomicPhase__Group__53221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AtomicPhase__MetricsAssignment_5_in_rule__AtomicPhase__Group__5__Impl3248 = new BitSet(new long[]{0x0000000008003802L});
    public static final BitSet FOLLOW_rule__AtomicPhase__Group__6__Impl_in_rule__AtomicPhase__Group__63279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AtomicPhase__Group__6__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__0__Impl_in_rule__NewMetric__Group__03352 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1_in_rule__NewMetric__Group__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NewMetric__Group__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__1__Impl_in_rule__NewMetric__Group__13414 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2_in_rule__NewMetric__Group__13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__0_in_rule__NewMetric__Group__1__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group__2__Impl_in_rule__NewMetric__Group__23475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__MetricnameAssignment_2_in_rule__NewMetric__Group__2__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__0__Impl_in_rule__NewMetric__Group_1__03538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__1_in_rule__NewMetric__Group_1__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NewMetric__Group_1__0__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__Group_1__1__Impl_in_rule__NewMetric__Group_1__13600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMetric__NameAssignment_1_1_in_rule__NewMetric__Group_1__1__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03661 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3747 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualifiedName__Group_1__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Benchmark__ElementsAssignment3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PackageDeclaration__NameAssignment_13940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Scenario__ScenarionameAssignment_13971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__Scenario__RootPhaseAssignment_34002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequencePhase__NameAssignment_14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__SequencePhase__PhasesAssignment_34064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IterationPhase__NameAssignment_14095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IterationPhase__IterationAssignment_34126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__IterationPhase__PhaseAssignment_54157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OptionalPhase__NameAssignment_14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_rule__OptionalPhase__PhaseAssignment_34219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PhaseReference__PhaseAssignment4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_rule__NewPhase__PhaseAssignment4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AtomicPhase__NameAssignment_14320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AtomicPhase__AtomicnameAssignment_34351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_rule__AtomicPhase__MetricsAssignment_54382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_rule__MetricTypeReference__MetricAssignment4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMetric__NameAssignment_1_14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__NewMetric__MetricnameAssignment_24475 = new BitSet(new long[]{0x0000000000000002L});

}