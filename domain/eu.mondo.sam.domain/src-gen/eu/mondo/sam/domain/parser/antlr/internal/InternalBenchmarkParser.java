package eu.mondo.sam.domain.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.mondo.sam.domain.services.BenchmarkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBenchmarkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LBRACE", "RULE_RBRACE", "RULE_LPAR", "RULE_RPAR", "RULE_INT", "RULE_METRICS", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Scenario'", "'Sequence'", "'Iteration'", "'*'", "'Optional'", "'ClassName'", "'Atomic'", "'ID'", "'new Metric ClassName'", "'.'", "'Time'", "'Memory'", "'Scalar'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int RULE_RBRACE=6;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_LPAR=7;
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
    public static final int RULE_RPAR=8;
    public static final int RULE_INT=9;
    public static final int RULE_LBRACE=5;
    public static final int RULE_WS=14;
    public static final int RULE_METRICS=10;

    // delegates
    // delegators


        public InternalBenchmarkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBenchmarkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBenchmarkParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g"; }



     	private BenchmarkGrammarAccess grammarAccess;
     	
        public InternalBenchmarkParser(TokenStream input, BenchmarkGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Benchmark";	
       	}
       	
       	@Override
       	protected BenchmarkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBenchmark"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:68:1: entryRuleBenchmark returns [EObject current=null] : iv_ruleBenchmark= ruleBenchmark EOF ;
    public final EObject entryRuleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBenchmark = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:69:2: (iv_ruleBenchmark= ruleBenchmark EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:70:2: iv_ruleBenchmark= ruleBenchmark EOF
            {
             newCompositeNode(grammarAccess.getBenchmarkRule()); 
            pushFollow(FOLLOW_ruleBenchmark_in_entryRuleBenchmark75);
            iv_ruleBenchmark=ruleBenchmark();

            state._fsp--;

             current =iv_ruleBenchmark; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBenchmark85); 

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
    // $ANTLR end "entryRuleBenchmark"


    // $ANTLR start "ruleBenchmark"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:77:1: ruleBenchmark returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_elements_2_0= ruleElement ) )* ) ;
    public final EObject ruleBenchmark() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_packageName_1_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_elements_2_0= ruleElement ) )* ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_elements_2_0= ruleElement ) )* )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_elements_2_0= ruleElement ) )* )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= ruleQualifiedName ) ) ( (lv_elements_2_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleBenchmark122); 

                	newLeafNode(otherlv_0, grammarAccess.getBenchmarkAccess().getPackageKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:85:1: ( (lv_packageName_1_0= ruleQualifiedName ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:86:1: (lv_packageName_1_0= ruleQualifiedName )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:87:3: lv_packageName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleBenchmark143);
            lv_packageName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBenchmarkRule());
            	        }
                   		set(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:103:2: ( (lv_elements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=19)||LA1_0==21||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:104:1: (lv_elements_2_0= ruleElement )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:104:1: (lv_elements_2_0= ruleElement )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:105:3: lv_elements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleBenchmark164);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBenchmarkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleBenchmark"


    // $ANTLR start "entryRuleElement"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:129:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:130:2: (iv_ruleElement= ruleElement EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:131:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement201);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement211); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:138:1: ruleElement returns [EObject current=null] : (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Scenario_0 = null;

        EObject this_Phase_1 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:141:28: ( (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:142:1: (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:142:1: (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=18 && LA2_0<=19)||LA2_0==21||LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:143:5: this_Scenario_0= ruleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleElement258);
                    this_Scenario_0=ruleScenario();

                    state._fsp--;

                     
                            current = this_Scenario_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:153:5: this_Phase_1= rulePhase
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePhase_in_ruleElement285);
                    this_Phase_1=rulePhase();

                    state._fsp--;

                     
                            current = this_Phase_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleScenario"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:169:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:170:2: (iv_ruleScenario= ruleScenario EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:171:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario320);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario330); 

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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:178:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_classname_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_rootPhase_3_0= ruleAttachedPhase ) ) this_RBRACE_4= RULE_RBRACE ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classname_1_0=null;
        Token this_LBRACE_2=null;
        Token this_RBRACE_4=null;
        EObject lv_rootPhase_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:181:28: ( (otherlv_0= 'Scenario' ( (lv_classname_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_rootPhase_3_0= ruleAttachedPhase ) ) this_RBRACE_4= RULE_RBRACE ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:182:1: (otherlv_0= 'Scenario' ( (lv_classname_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_rootPhase_3_0= ruleAttachedPhase ) ) this_RBRACE_4= RULE_RBRACE )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:182:1: (otherlv_0= 'Scenario' ( (lv_classname_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_rootPhase_3_0= ruleAttachedPhase ) ) this_RBRACE_4= RULE_RBRACE )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:182:3: otherlv_0= 'Scenario' ( (lv_classname_1_0= RULE_ID ) ) this_LBRACE_2= RULE_LBRACE ( (lv_rootPhase_3_0= ruleAttachedPhase ) ) this_RBRACE_4= RULE_RBRACE
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleScenario367); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:186:1: ( (lv_classname_1_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:187:1: (lv_classname_1_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:187:1: (lv_classname_1_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:188:3: lv_classname_1_0= RULE_ID
            {
            lv_classname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScenario384); 

            			newLeafNode(lv_classname_1_0, grammarAccess.getScenarioAccess().getClassnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_1_0, 
                    		"ID");
            	    

            }


            }

            this_LBRACE_2=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleScenario400); 
             
                newLeafNode(this_LBRACE_2, grammarAccess.getScenarioAccess().getLBRACETerminalRuleCall_2()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:208:1: ( (lv_rootPhase_3_0= ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:209:1: (lv_rootPhase_3_0= ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:209:1: (lv_rootPhase_3_0= ruleAttachedPhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:210:3: lv_rootPhase_3_0= ruleAttachedPhase
            {
             
            	        newCompositeNode(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttachedPhase_in_ruleScenario420);
            lv_rootPhase_3_0=ruleAttachedPhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	        }
                   		set(
                   			current, 
                   			"rootPhase",
                    		lv_rootPhase_3_0, 
                    		"AttachedPhase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RBRACE_4=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleScenario431); 
             
                newLeafNode(this_RBRACE_4, grammarAccess.getScenarioAccess().getRBRACETerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRulePhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:238:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:239:2: (iv_rulePhase= rulePhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:240:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_rulePhase_in_entryRulePhase466);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhase476); 

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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:247:1: rulePhase returns [EObject current=null] : (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        EObject this_SequencePhase_0 = null;

        EObject this_IterationPhase_1 = null;

        EObject this_OptionalPhase_2 = null;

        EObject this_AtomicPhase_3 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:250:28: ( (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:251:1: (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:251:1: (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 23:
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
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:252:5: this_SequencePhase_0= ruleSequencePhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequencePhase_in_rulePhase523);
                    this_SequencePhase_0=ruleSequencePhase();

                    state._fsp--;

                     
                            current = this_SequencePhase_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:262:5: this_IterationPhase_1= ruleIterationPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIterationPhase_in_rulePhase550);
                    this_IterationPhase_1=ruleIterationPhase();

                    state._fsp--;

                     
                            current = this_IterationPhase_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:272:5: this_OptionalPhase_2= ruleOptionalPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOptionalPhase_in_rulePhase577);
                    this_OptionalPhase_2=ruleOptionalPhase();

                    state._fsp--;

                     
                            current = this_OptionalPhase_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:282:5: this_AtomicPhase_3= ruleAtomicPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAtomicPhase_in_rulePhase604);
                    this_AtomicPhase_3=ruleAtomicPhase();

                    state._fsp--;

                     
                            current = this_AtomicPhase_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleSequencePhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:298:1: entryRuleSequencePhase returns [EObject current=null] : iv_ruleSequencePhase= ruleSequencePhase EOF ;
    public final EObject entryRuleSequencePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencePhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:299:2: (iv_ruleSequencePhase= ruleSequencePhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:300:2: iv_ruleSequencePhase= ruleSequencePhase EOF
            {
             newCompositeNode(grammarAccess.getSequencePhaseRule()); 
            pushFollow(FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase639);
            iv_ruleSequencePhase=ruleSequencePhase();

            state._fsp--;

             current =iv_ruleSequencePhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePhase649); 

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
    // $ANTLR end "entryRuleSequencePhase"


    // $ANTLR start "ruleSequencePhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:307:1: ruleSequencePhase returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_phases_3_0= ruleAttachedPhase ) )+ this_RPAR_4= RULE_RPAR ) ;
    public final EObject ruleSequencePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LPAR_2=null;
        Token this_RPAR_4=null;
        EObject lv_phases_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:310:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_phases_3_0= ruleAttachedPhase ) )+ this_RPAR_4= RULE_RPAR ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:311:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_phases_3_0= ruleAttachedPhase ) )+ this_RPAR_4= RULE_RPAR )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:311:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_phases_3_0= ruleAttachedPhase ) )+ this_RPAR_4= RULE_RPAR )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:311:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_phases_3_0= ruleAttachedPhase ) )+ this_RPAR_4= RULE_RPAR
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSequencePhase686); 

                	newLeafNode(otherlv_0, grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:315:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:316:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:316:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:317:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequencePhase703); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequencePhaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleSequencePhase720); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getSequencePhaseAccess().getLPARTerminalRuleCall_2()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:337:1: ( (lv_phases_3_0= ruleAttachedPhase ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||(LA5_0>=18 && LA5_0<=19)||LA5_0==21||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:338:1: (lv_phases_3_0= ruleAttachedPhase )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:338:1: (lv_phases_3_0= ruleAttachedPhase )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:339:3: lv_phases_3_0= ruleAttachedPhase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttachedPhase_in_ruleSequencePhase740);
            	    lv_phases_3_0=ruleAttachedPhase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequencePhaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"phases",
            	            		lv_phases_3_0, 
            	            		"AttachedPhase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            this_RPAR_4=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleSequencePhase752); 
             
                newLeafNode(this_RPAR_4, grammarAccess.getSequencePhaseAccess().getRPARTerminalRuleCall_4()); 
                

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
    // $ANTLR end "ruleSequencePhase"


    // $ANTLR start "entryRuleIterationPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:367:1: entryRuleIterationPhase returns [EObject current=null] : iv_ruleIterationPhase= ruleIterationPhase EOF ;
    public final EObject entryRuleIterationPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:368:2: (iv_ruleIterationPhase= ruleIterationPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:369:2: iv_ruleIterationPhase= ruleIterationPhase EOF
            {
             newCompositeNode(grammarAccess.getIterationPhaseRule()); 
            pushFollow(FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase787);
            iv_ruleIterationPhase=ruleIterationPhase();

            state._fsp--;

             current =iv_ruleIterationPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationPhase797); 

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
    // $ANTLR end "entryRuleIterationPhase"


    // $ANTLR start "ruleIterationPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:376:1: ruleIterationPhase returns [EObject current=null] : (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR ) ;
    public final EObject ruleIterationPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LPAR_2=null;
        Token lv_iteration_3_0=null;
        Token otherlv_4=null;
        Token this_RPAR_6=null;
        EObject lv_phase_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:379:28: ( (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:380:1: (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:380:1: (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:380:3: otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? this_LPAR_2= RULE_LPAR ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleIterationPhase834); 

                	newLeafNode(otherlv_0, grammarAccess.getIterationPhaseAccess().getIterationKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:384:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:385:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:385:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:386:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIterationPhase851); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIterationPhaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            this_LPAR_2=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleIterationPhase868); 
             
                newLeafNode(this_LPAR_2, grammarAccess.getIterationPhaseAccess().getLPARTerminalRuleCall_2()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:406:1: ( (lv_iteration_3_0= RULE_INT ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:407:1: (lv_iteration_3_0= RULE_INT )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:407:1: (lv_iteration_3_0= RULE_INT )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:408:3: lv_iteration_3_0= RULE_INT
            {
            lv_iteration_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterationPhase884); 

            			newLeafNode(lv_iteration_3_0, grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIterationPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"iteration",
                    		lv_iteration_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleIterationPhase901); 

                	newLeafNode(otherlv_4, grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:428:1: ( (lv_phase_5_0= ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:429:1: (lv_phase_5_0= ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:429:1: (lv_phase_5_0= ruleAttachedPhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:430:3: lv_phase_5_0= ruleAttachedPhase
            {
             
            	        newCompositeNode(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttachedPhase_in_ruleIterationPhase922);
            lv_phase_5_0=ruleAttachedPhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIterationPhaseRule());
            	        }
                   		set(
                   			current, 
                   			"phase",
                    		lv_phase_5_0, 
                    		"AttachedPhase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleIterationPhase933); 
             
                newLeafNode(this_RPAR_6, grammarAccess.getIterationPhaseAccess().getRPARTerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleIterationPhase"


    // $ANTLR start "entryRuleOptionalPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:458:1: entryRuleOptionalPhase returns [EObject current=null] : iv_ruleOptionalPhase= ruleOptionalPhase EOF ;
    public final EObject entryRuleOptionalPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:459:2: (iv_ruleOptionalPhase= ruleOptionalPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:460:2: iv_ruleOptionalPhase= ruleOptionalPhase EOF
            {
             newCompositeNode(grammarAccess.getOptionalPhaseRule()); 
            pushFollow(FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase968);
            iv_ruleOptionalPhase=ruleOptionalPhase();

            state._fsp--;

             current =iv_ruleOptionalPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalPhase978); 

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
    // $ANTLR end "entryRuleOptionalPhase"


    // $ANTLR start "ruleOptionalPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:467:1: ruleOptionalPhase returns [EObject current=null] : (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_LPAR_4= RULE_LPAR ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR ) ;
    public final EObject ruleOptionalPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_classname_3_0=null;
        Token this_LPAR_4=null;
        Token this_RPAR_6=null;
        EObject lv_phase_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:470:28: ( (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_LPAR_4= RULE_LPAR ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:471:1: (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_LPAR_4= RULE_LPAR ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:471:1: (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_LPAR_4= RULE_LPAR ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:471:3: otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_LPAR_4= RULE_LPAR ( (lv_phase_5_0= ruleAttachedPhase ) ) this_RPAR_6= RULE_RPAR
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleOptionalPhase1015); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:475:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:476:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:476:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:477:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOptionalPhase1032); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalPhaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleOptionalPhase1050); 

                	newLeafNode(otherlv_2, grammarAccess.getOptionalPhaseAccess().getClassNameKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:497:1: ( (lv_classname_3_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:498:1: (lv_classname_3_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:498:1: (lv_classname_3_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:499:3: lv_classname_3_0= RULE_ID
            {
            lv_classname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOptionalPhase1067); 

            			newLeafNode(lv_classname_3_0, grammarAccess.getOptionalPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionalPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_3_0, 
                    		"ID");
            	    

            }


            }

            this_LPAR_4=(Token)match(input,RULE_LPAR,FOLLOW_RULE_LPAR_in_ruleOptionalPhase1083); 
             
                newLeafNode(this_LPAR_4, grammarAccess.getOptionalPhaseAccess().getLPARTerminalRuleCall_4()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:519:1: ( (lv_phase_5_0= ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:520:1: (lv_phase_5_0= ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:520:1: (lv_phase_5_0= ruleAttachedPhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:521:3: lv_phase_5_0= ruleAttachedPhase
            {
             
            	        newCompositeNode(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttachedPhase_in_ruleOptionalPhase1103);
            lv_phase_5_0=ruleAttachedPhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalPhaseRule());
            	        }
                   		set(
                   			current, 
                   			"phase",
                    		lv_phase_5_0, 
                    		"AttachedPhase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleOptionalPhase1114); 
             
                newLeafNode(this_RPAR_6, grammarAccess.getOptionalPhaseAccess().getRPARTerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleOptionalPhase"


    // $ANTLR start "entryRuleAttachedPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:549:1: entryRuleAttachedPhase returns [EObject current=null] : iv_ruleAttachedPhase= ruleAttachedPhase EOF ;
    public final EObject entryRuleAttachedPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachedPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:550:2: (iv_ruleAttachedPhase= ruleAttachedPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:551:2: iv_ruleAttachedPhase= ruleAttachedPhase EOF
            {
             newCompositeNode(grammarAccess.getAttachedPhaseRule()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase1149);
            iv_ruleAttachedPhase=ruleAttachedPhase();

            state._fsp--;

             current =iv_ruleAttachedPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedPhase1159); 

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
    // $ANTLR end "entryRuleAttachedPhase"


    // $ANTLR start "ruleAttachedPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:558:1: ruleAttachedPhase returns [EObject current=null] : (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase ) ;
    public final EObject ruleAttachedPhase() throws RecognitionException {
        EObject current = null;

        EObject this_PhaseReference_0 = null;

        EObject this_NewPhase_1 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:561:28: ( (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:562:1: (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:562:1: (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=18 && LA8_0<=19)||LA8_0==21||LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:563:5: this_PhaseReference_0= rulePhaseReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePhaseReference_in_ruleAttachedPhase1206);
                    this_PhaseReference_0=rulePhaseReference();

                    state._fsp--;

                     
                            current = this_PhaseReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:573:5: this_NewPhase_1= ruleNewPhase
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNewPhase_in_ruleAttachedPhase1233);
                    this_NewPhase_1=ruleNewPhase();

                    state._fsp--;

                     
                            current = this_NewPhase_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAttachedPhase"


    // $ANTLR start "entryRulePhaseReference"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:589:1: entryRulePhaseReference returns [EObject current=null] : iv_rulePhaseReference= rulePhaseReference EOF ;
    public final EObject entryRulePhaseReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseReference = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:590:2: (iv_rulePhaseReference= rulePhaseReference EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:591:2: iv_rulePhaseReference= rulePhaseReference EOF
            {
             newCompositeNode(grammarAccess.getPhaseReferenceRule()); 
            pushFollow(FOLLOW_rulePhaseReference_in_entryRulePhaseReference1268);
            iv_rulePhaseReference=rulePhaseReference();

            state._fsp--;

             current =iv_rulePhaseReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseReference1278); 

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
    // $ANTLR end "entryRulePhaseReference"


    // $ANTLR start "rulePhaseReference"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:598:1: rulePhaseReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePhaseReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:601:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:602:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:602:1: ( (otherlv_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:603:1: (otherlv_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:603:1: (otherlv_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:604:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhaseReference1322); 

            		newLeafNode(otherlv_0, grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
            	

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
    // $ANTLR end "rulePhaseReference"


    // $ANTLR start "entryRuleNewPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:623:1: entryRuleNewPhase returns [EObject current=null] : iv_ruleNewPhase= ruleNewPhase EOF ;
    public final EObject entryRuleNewPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:624:2: (iv_ruleNewPhase= ruleNewPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:625:2: iv_ruleNewPhase= ruleNewPhase EOF
            {
             newCompositeNode(grammarAccess.getNewPhaseRule()); 
            pushFollow(FOLLOW_ruleNewPhase_in_entryRuleNewPhase1357);
            iv_ruleNewPhase=ruleNewPhase();

            state._fsp--;

             current =iv_ruleNewPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewPhase1367); 

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
    // $ANTLR end "entryRuleNewPhase"


    // $ANTLR start "ruleNewPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:632:1: ruleNewPhase returns [EObject current=null] : ( (lv_phase_0_0= rulePhase ) ) ;
    public final EObject ruleNewPhase() throws RecognitionException {
        EObject current = null;

        EObject lv_phase_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:635:28: ( ( (lv_phase_0_0= rulePhase ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:636:1: ( (lv_phase_0_0= rulePhase ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:636:1: ( (lv_phase_0_0= rulePhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:637:1: (lv_phase_0_0= rulePhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:637:1: (lv_phase_0_0= rulePhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:638:3: lv_phase_0_0= rulePhase
            {
             
            	        newCompositeNode(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePhase_in_ruleNewPhase1412);
            lv_phase_0_0=rulePhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNewPhaseRule());
            	        }
                   		set(
                   			current, 
                   			"phase",
                    		lv_phase_0_0, 
                    		"Phase");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleNewPhase"


    // $ANTLR start "entryRuleAtomicPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:662:1: entryRuleAtomicPhase returns [EObject current=null] : iv_ruleAtomicPhase= ruleAtomicPhase EOF ;
    public final EObject entryRuleAtomicPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:663:2: (iv_ruleAtomicPhase= ruleAtomicPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:664:2: iv_ruleAtomicPhase= ruleAtomicPhase EOF
            {
             newCompositeNode(grammarAccess.getAtomicPhaseRule()); 
            pushFollow(FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase1447);
            iv_ruleAtomicPhase=ruleAtomicPhase();

            state._fsp--;

             current =iv_ruleAtomicPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicPhase1457); 

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
    // $ANTLR end "entryRuleAtomicPhase"


    // $ANTLR start "ruleAtomicPhase"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:671:1: ruleAtomicPhase returns [EObject current=null] : (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_METRICS_4= RULE_METRICS ( (lv_metrics_5_0= ruleAttachedMetric ) )* this_RPAR_6= RULE_RPAR ) ;
    public final EObject ruleAtomicPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_classname_3_0=null;
        Token this_METRICS_4=null;
        Token this_RPAR_6=null;
        EObject lv_metrics_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:674:28: ( (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_METRICS_4= RULE_METRICS ( (lv_metrics_5_0= ruleAttachedMetric ) )* this_RPAR_6= RULE_RPAR ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:675:1: (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_METRICS_4= RULE_METRICS ( (lv_metrics_5_0= ruleAttachedMetric ) )* this_RPAR_6= RULE_RPAR )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:675:1: (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_METRICS_4= RULE_METRICS ( (lv_metrics_5_0= ruleAttachedMetric ) )* this_RPAR_6= RULE_RPAR )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:675:3: otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_classname_3_0= RULE_ID ) ) this_METRICS_4= RULE_METRICS ( (lv_metrics_5_0= ruleAttachedMetric ) )* this_RPAR_6= RULE_RPAR
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAtomicPhase1494); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:679:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:680:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:680:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:681:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicPhase1511); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicPhaseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAtomicPhase1529); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:701:1: ( (lv_classname_3_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:702:1: (lv_classname_3_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:702:1: (lv_classname_3_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:703:3: lv_classname_3_0= RULE_ID
            {
            lv_classname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicPhase1546); 

            			newLeafNode(lv_classname_3_0, grammarAccess.getAtomicPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicPhaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_3_0, 
                    		"ID");
            	    

            }


            }

            this_METRICS_4=(Token)match(input,RULE_METRICS,FOLLOW_RULE_METRICS_in_ruleAtomicPhase1562); 
             
                newLeafNode(this_METRICS_4, grammarAccess.getAtomicPhaseAccess().getMETRICSTerminalRuleCall_4()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:723:1: ( (lv_metrics_5_0= ruleAttachedMetric ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25||(LA10_0>=27 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:724:1: (lv_metrics_5_0= ruleAttachedMetric )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:724:1: (lv_metrics_5_0= ruleAttachedMetric )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:725:3: lv_metrics_5_0= ruleAttachedMetric
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttachedMetric_in_ruleAtomicPhase1582);
            	    lv_metrics_5_0=ruleAttachedMetric();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAtomicPhaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"metrics",
            	            		lv_metrics_5_0, 
            	            		"AttachedMetric");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            this_RPAR_6=(Token)match(input,RULE_RPAR,FOLLOW_RULE_RPAR_in_ruleAtomicPhase1594); 
             
                newLeafNode(this_RPAR_6, grammarAccess.getAtomicPhaseAccess().getRPARTerminalRuleCall_6()); 
                

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
    // $ANTLR end "ruleAtomicPhase"


    // $ANTLR start "entryRuleAttachedMetric"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:753:1: entryRuleAttachedMetric returns [EObject current=null] : iv_ruleAttachedMetric= ruleAttachedMetric EOF ;
    public final EObject entryRuleAttachedMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachedMetric = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:754:2: (iv_ruleAttachedMetric= ruleAttachedMetric EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:755:2: iv_ruleAttachedMetric= ruleAttachedMetric EOF
            {
             newCompositeNode(grammarAccess.getAttachedMetricRule()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric1629);
            iv_ruleAttachedMetric=ruleAttachedMetric();

            state._fsp--;

             current =iv_ruleAttachedMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedMetric1639); 

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
    // $ANTLR end "entryRuleAttachedMetric"


    // $ANTLR start "ruleAttachedMetric"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:762:1: ruleAttachedMetric returns [EObject current=null] : (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric ) ;
    public final EObject ruleAttachedMetric() throws RecognitionException {
        EObject current = null;

        EObject this_MetricTypeReference_0 = null;

        EObject this_NewMetric_1 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:765:28: ( (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:766:1: (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:766:1: (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=29)) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:767:5: this_MetricTypeReference_0= ruleMetricTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMetricTypeReference_in_ruleAttachedMetric1686);
                    this_MetricTypeReference_0=ruleMetricTypeReference();

                    state._fsp--;

                     
                            current = this_MetricTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:777:5: this_NewMetric_1= ruleNewMetric
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNewMetric_in_ruleAttachedMetric1713);
                    this_NewMetric_1=ruleNewMetric();

                    state._fsp--;

                     
                            current = this_NewMetric_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAttachedMetric"


    // $ANTLR start "entryRuleMetricTypeReference"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:793:1: entryRuleMetricTypeReference returns [EObject current=null] : iv_ruleMetricTypeReference= ruleMetricTypeReference EOF ;
    public final EObject entryRuleMetricTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricTypeReference = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:794:2: (iv_ruleMetricTypeReference= ruleMetricTypeReference EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:795:2: iv_ruleMetricTypeReference= ruleMetricTypeReference EOF
            {
             newCompositeNode(grammarAccess.getMetricTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference1748);
            iv_ruleMetricTypeReference=ruleMetricTypeReference();

            state._fsp--;

             current =iv_ruleMetricTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricTypeReference1758); 

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
    // $ANTLR end "entryRuleMetricTypeReference"


    // $ANTLR start "ruleMetricTypeReference"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:802:1: ruleMetricTypeReference returns [EObject current=null] : ( ( (lv_metric_0_0= ruleMetricType ) ) otherlv_1= 'ID' ( (lv_metricname_2_0= RULE_ID ) ) ) ;
    public final EObject ruleMetricTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_metricname_2_0=null;
        Enumerator lv_metric_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:805:28: ( ( ( (lv_metric_0_0= ruleMetricType ) ) otherlv_1= 'ID' ( (lv_metricname_2_0= RULE_ID ) ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:806:1: ( ( (lv_metric_0_0= ruleMetricType ) ) otherlv_1= 'ID' ( (lv_metricname_2_0= RULE_ID ) ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:806:1: ( ( (lv_metric_0_0= ruleMetricType ) ) otherlv_1= 'ID' ( (lv_metricname_2_0= RULE_ID ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:806:2: ( (lv_metric_0_0= ruleMetricType ) ) otherlv_1= 'ID' ( (lv_metricname_2_0= RULE_ID ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:806:2: ( (lv_metric_0_0= ruleMetricType ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:807:1: (lv_metric_0_0= ruleMetricType )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:807:1: (lv_metric_0_0= ruleMetricType )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:808:3: lv_metric_0_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleMetricTypeReference1804);
            lv_metric_0_0=ruleMetricType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetricTypeReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"metric",
                    		lv_metric_0_0, 
                    		"MetricType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleMetricTypeReference1816); 

                	newLeafNode(otherlv_1, grammarAccess.getMetricTypeReferenceAccess().getIDKeyword_1());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:828:1: ( (lv_metricname_2_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:829:1: (lv_metricname_2_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:829:1: (lv_metricname_2_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:830:3: lv_metricname_2_0= RULE_ID
            {
            lv_metricname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetricTypeReference1833); 

            			newLeafNode(lv_metricname_2_0, grammarAccess.getMetricTypeReferenceAccess().getMetricnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetricTypeReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"metricname",
                    		lv_metricname_2_0, 
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
    // $ANTLR end "ruleMetricTypeReference"


    // $ANTLR start "entryRuleNewMetric"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:854:1: entryRuleNewMetric returns [EObject current=null] : iv_ruleNewMetric= ruleNewMetric EOF ;
    public final EObject entryRuleNewMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewMetric = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:855:2: (iv_ruleNewMetric= ruleNewMetric EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:856:2: iv_ruleNewMetric= ruleNewMetric EOF
            {
             newCompositeNode(grammarAccess.getNewMetricRule()); 
            pushFollow(FOLLOW_ruleNewMetric_in_entryRuleNewMetric1874);
            iv_ruleNewMetric=ruleNewMetric();

            state._fsp--;

             current =iv_ruleNewMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMetric1884); 

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
    // $ANTLR end "entryRuleNewMetric"


    // $ANTLR start "ruleNewMetric"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:863:1: ruleNewMetric returns [EObject current=null] : (otherlv_0= 'new Metric ClassName' ( (lv_classname_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_metricname_3_0= RULE_ID ) ) ) ;
    public final EObject ruleNewMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classname_1_0=null;
        Token otherlv_2=null;
        Token lv_metricname_3_0=null;

         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:866:28: ( (otherlv_0= 'new Metric ClassName' ( (lv_classname_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_metricname_3_0= RULE_ID ) ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:867:1: (otherlv_0= 'new Metric ClassName' ( (lv_classname_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_metricname_3_0= RULE_ID ) ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:867:1: (otherlv_0= 'new Metric ClassName' ( (lv_classname_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_metricname_3_0= RULE_ID ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:867:3: otherlv_0= 'new Metric ClassName' ( (lv_classname_1_0= RULE_ID ) ) otherlv_2= 'ID' ( (lv_metricname_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleNewMetric1921); 

                	newLeafNode(otherlv_0, grammarAccess.getNewMetricAccess().getNewMetricClassNameKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:871:1: ( (lv_classname_1_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:872:1: (lv_classname_1_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:872:1: (lv_classname_1_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:873:3: lv_classname_1_0= RULE_ID
            {
            lv_classname_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMetric1938); 

            			newLeafNode(lv_classname_1_0, grammarAccess.getNewMetricAccess().getClassnameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNewMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleNewMetric1955); 

                	newLeafNode(otherlv_2, grammarAccess.getNewMetricAccess().getIDKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:893:1: ( (lv_metricname_3_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:894:1: (lv_metricname_3_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:894:1: (lv_metricname_3_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:895:3: lv_metricname_3_0= RULE_ID
            {
            lv_metricname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMetric1972); 

            			newLeafNode(lv_metricname_3_0, grammarAccess.getNewMetricAccess().getMetricnameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNewMetricRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"metricname",
                    		lv_metricname_3_0, 
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
    // $ANTLR end "ruleNewMetric"


    // $ANTLR start "entryRuleQualifiedName"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:919:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:920:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:921:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2014);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2025); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:928:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:931:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:932:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:932:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:932:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2065); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:939:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:940:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName2084); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2099); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "ruleMetricType"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:960:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:962:28: ( ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:963:1: ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:963:1: ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:963:2: (enumLiteral_0= 'Time' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:963:2: (enumLiteral_0= 'Time' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:963:4: enumLiteral_0= 'Time'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleMetricType2160); 

                            current = grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:969:6: (enumLiteral_1= 'Memory' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:969:6: (enumLiteral_1= 'Memory' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:969:8: enumLiteral_1= 'Memory'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleMetricType2177); 

                            current = grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:975:6: (enumLiteral_2= 'Scalar' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:975:6: (enumLiteral_2= 'Scalar' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:975:8: enumLiteral_2= 'Scalar'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleMetricType2194); 

                            current = grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleMetricType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBenchmark_in_entryRuleBenchmark75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBenchmark85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBenchmark122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleBenchmark143 = new BitSet(new long[]{0x0000000000AE0002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleBenchmark164 = new BitSet(new long[]{0x0000000000AE0002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleElement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_ruleElement285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleScenario367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScenario384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleScenario400 = new BitSet(new long[]{0x0000000000AE0010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleScenario420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleScenario431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_entryRulePhase466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhase476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_rulePhase523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_rulePhase550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_rulePhase577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_rulePhase604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePhase649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSequencePhase686 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequencePhase703 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleSequencePhase720 = new BitSet(new long[]{0x0000000000AE0010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleSequencePhase740 = new BitSet(new long[]{0x0000000000AE0110L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleSequencePhase752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationPhase797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleIterationPhase834 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIterationPhase851 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleIterationPhase868 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterationPhase884 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIterationPhase901 = new BitSet(new long[]{0x0000000000AE0010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleIterationPhase922 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleIterationPhase933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalPhase978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOptionalPhase1015 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalPhase1032 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleOptionalPhase1050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalPhase1067 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LPAR_in_ruleOptionalPhase1083 = new BitSet(new long[]{0x0000000000AE0010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleOptionalPhase1103 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleOptionalPhase1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedPhase1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_ruleAttachedPhase1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_ruleAttachedPhase1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_entryRulePhaseReference1268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseReference1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhaseReference1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_entryRuleNewPhase1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewPhase1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_ruleNewPhase1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicPhase1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtomicPhase1494 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicPhase1511 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicPhase1529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicPhase1546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_METRICS_in_ruleAtomicPhase1562 = new BitSet(new long[]{0x000000003A000100L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_ruleAtomicPhase1582 = new BitSet(new long[]{0x000000003A000100L});
    public static final BitSet FOLLOW_RULE_RPAR_in_ruleAtomicPhase1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedMetric1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_ruleAttachedMetric1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_ruleAttachedMetric1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricTypeReference1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleMetricTypeReference1804 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMetricTypeReference1816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetricTypeReference1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_entryRuleNewMetric1874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMetric1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNewMetric1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMetric1938 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNewMetric1955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMetric1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2065 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName2084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2099 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27_in_ruleMetricType2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMetricType2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMetricType2194 = new BitSet(new long[]{0x0000000000000002L});

}