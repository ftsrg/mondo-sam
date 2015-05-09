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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'Scenario'", "'{'", "'}'", "'Sequence'", "'('", "')'", "'Iteration'", "'*'", "'Optional'", "'Atomic'", "'ClassName'", "'Metrics('", "'new Metric'", "'ID'", "'.'", "'Time'", "'Memory'", "'Scalar'"
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:77:1: ruleBenchmark returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleBenchmark() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:80:28: ( ( (lv_elements_0_0= ruleElement ) )* )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:81:1: ( (lv_elements_0_0= ruleElement ) )*
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:81:1: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==15||LA1_0==18||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:82:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:82:1: (lv_elements_0_0= ruleElement )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:83:3: lv_elements_0_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleBenchmark130);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBenchmarkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:107:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:108:2: (iv_ruleElement= ruleElement EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:109:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:116:1: ruleElement returns [EObject current=null] : (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase | this_PackageDeclaration_2= rulePackageDeclaration ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Scenario_0 = null;

        EObject this_Phase_1 = null;

        EObject this_PackageDeclaration_2 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:119:28: ( (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase | this_PackageDeclaration_2= rulePackageDeclaration ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:120:1: (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase | this_PackageDeclaration_2= rulePackageDeclaration )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:120:1: (this_Scenario_0= ruleScenario | this_Phase_1= rulePhase | this_PackageDeclaration_2= rulePackageDeclaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 15:
            case 18:
            case 20:
            case 21:
                {
                alt2=2;
                }
                break;
            case 11:
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
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:121:5: this_Scenario_0= ruleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleScenario_in_ruleElement223);
                    this_Scenario_0=ruleScenario();

                    state._fsp--;

                     
                            current = this_Scenario_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:131:5: this_Phase_1= rulePhase
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePhase_in_ruleElement250);
                    this_Phase_1=rulePhase();

                    state._fsp--;

                     
                            current = this_Phase_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:141:5: this_PackageDeclaration_2= rulePackageDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getPackageDeclarationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePackageDeclaration_in_ruleElement277);
                    this_PackageDeclaration_2=rulePackageDeclaration();

                    state._fsp--;

                     
                            current = this_PackageDeclaration_2; 
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


    // $ANTLR start "entryRulePackageDeclaration"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:157:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:158:2: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:159:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration312);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackageDeclaration322); 

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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:166:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:169:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:170:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:170:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:170:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackageDeclaration359); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:174:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:175:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:175:1: (lv_name_1_0= ruleQualifiedName )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:176:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePackageDeclaration380);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleScenario"
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:200:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:201:2: (iv_ruleScenario= ruleScenario EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:202:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_ruleScenario_in_entryRuleScenario416);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenario426); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:209:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario' ( (lv_scenarioname_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_rootPhase_3_0= rulePhase ) ) otherlv_4= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_scenarioname_1_0 = null;

        EObject lv_rootPhase_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:212:28: ( (otherlv_0= 'Scenario' ( (lv_scenarioname_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_rootPhase_3_0= rulePhase ) ) otherlv_4= '}' ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:213:1: (otherlv_0= 'Scenario' ( (lv_scenarioname_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_rootPhase_3_0= rulePhase ) ) otherlv_4= '}' )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:213:1: (otherlv_0= 'Scenario' ( (lv_scenarioname_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_rootPhase_3_0= rulePhase ) ) otherlv_4= '}' )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:213:3: otherlv_0= 'Scenario' ( (lv_scenarioname_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_rootPhase_3_0= rulePhase ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleScenario463); 

                	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:217:1: ( (lv_scenarioname_1_0= ruleQualifiedName ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:218:1: (lv_scenarioname_1_0= ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:218:1: (lv_scenarioname_1_0= ruleQualifiedName )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:219:3: lv_scenarioname_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getScenarioAccess().getScenarionameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleScenario484);
            lv_scenarioname_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	        }
                   		set(
                   			current, 
                   			"scenarioname",
                    		lv_scenarioname_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleScenario496); 

                	newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:239:1: ( (lv_rootPhase_3_0= rulePhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:240:1: (lv_rootPhase_3_0= rulePhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:240:1: (lv_rootPhase_3_0= rulePhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:241:3: lv_rootPhase_3_0= rulePhase
            {
             
            	        newCompositeNode(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePhase_in_ruleScenario517);
            lv_rootPhase_3_0=rulePhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getScenarioRule());
            	        }
                   		set(
                   			current, 
                   			"rootPhase",
                    		lv_rootPhase_3_0, 
                    		"Phase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleScenario529); 

                	newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:269:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:270:2: (iv_rulePhase= rulePhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:271:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_rulePhase_in_entryRulePhase565);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhase575); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:278:1: rulePhase returns [EObject current=null] : (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        EObject this_SequencePhase_0 = null;

        EObject this_IterationPhase_1 = null;

        EObject this_OptionalPhase_2 = null;

        EObject this_AtomicPhase_3 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:281:28: ( (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:282:1: (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:282:1: (this_SequencePhase_0= ruleSequencePhase | this_IterationPhase_1= ruleIterationPhase | this_OptionalPhase_2= ruleOptionalPhase | this_AtomicPhase_3= ruleAtomicPhase )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
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
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:283:5: this_SequencePhase_0= ruleSequencePhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSequencePhase_in_rulePhase622);
                    this_SequencePhase_0=ruleSequencePhase();

                    state._fsp--;

                     
                            current = this_SequencePhase_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:293:5: this_IterationPhase_1= ruleIterationPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIterationPhase_in_rulePhase649);
                    this_IterationPhase_1=ruleIterationPhase();

                    state._fsp--;

                     
                            current = this_IterationPhase_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:303:5: this_OptionalPhase_2= ruleOptionalPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleOptionalPhase_in_rulePhase676);
                    this_OptionalPhase_2=ruleOptionalPhase();

                    state._fsp--;

                     
                            current = this_OptionalPhase_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:313:5: this_AtomicPhase_3= ruleAtomicPhase
                    {
                     
                            newCompositeNode(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAtomicPhase_in_rulePhase703);
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:329:1: entryRuleSequencePhase returns [EObject current=null] : iv_ruleSequencePhase= ruleSequencePhase EOF ;
    public final EObject entryRuleSequencePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequencePhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:330:2: (iv_ruleSequencePhase= ruleSequencePhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:331:2: iv_ruleSequencePhase= ruleSequencePhase EOF
            {
             newCompositeNode(grammarAccess.getSequencePhaseRule()); 
            pushFollow(FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase738);
            iv_ruleSequencePhase=ruleSequencePhase();

            state._fsp--;

             current =iv_ruleSequencePhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencePhase748); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:338:1: ruleSequencePhase returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phases_3_0= ruleAttachedPhase ) )+ otherlv_4= ')' ) ;
    public final EObject ruleSequencePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_phases_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:341:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phases_3_0= ruleAttachedPhase ) )+ otherlv_4= ')' ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:342:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phases_3_0= ruleAttachedPhase ) )+ otherlv_4= ')' )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:342:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phases_3_0= ruleAttachedPhase ) )+ otherlv_4= ')' )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:342:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phases_3_0= ruleAttachedPhase ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSequencePhase785); 

                	newLeafNode(otherlv_0, grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:346:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:347:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:347:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:348:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequencePhase802); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSequencePhase820); 

                	newLeafNode(otherlv_2, grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:368:1: ( (lv_phases_3_0= ruleAttachedPhase ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==15||LA5_0==18||(LA5_0>=20 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:369:1: (lv_phases_3_0= ruleAttachedPhase )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:369:1: (lv_phases_3_0= ruleAttachedPhase )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:370:3: lv_phases_3_0= ruleAttachedPhase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttachedPhase_in_ruleSequencePhase841);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSequencePhase854); 

                	newLeafNode(otherlv_4, grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4());
                

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:398:1: entryRuleIterationPhase returns [EObject current=null] : iv_ruleIterationPhase= ruleIterationPhase EOF ;
    public final EObject entryRuleIterationPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:399:2: (iv_ruleIterationPhase= ruleIterationPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:400:2: iv_ruleIterationPhase= ruleIterationPhase EOF
            {
             newCompositeNode(grammarAccess.getIterationPhaseRule()); 
            pushFollow(FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase890);
            iv_ruleIterationPhase=ruleIterationPhase();

            state._fsp--;

             current =iv_ruleIterationPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationPhase900); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:407:1: ruleIterationPhase returns [EObject current=null] : (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) otherlv_6= ')' ) ;
    public final EObject ruleIterationPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_iteration_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_phase_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:410:28: ( (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) otherlv_6= ')' ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:411:1: (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) otherlv_6= ')' )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:411:1: (otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) otherlv_6= ')' )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:411:3: otherlv_0= 'Iteration' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_iteration_3_0= RULE_INT ) ) otherlv_4= '*' ( (lv_phase_5_0= ruleAttachedPhase ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIterationPhase937); 

                	newLeafNode(otherlv_0, grammarAccess.getIterationPhaseAccess().getIterationKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:415:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:416:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:416:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:417:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIterationPhase954); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleIterationPhase972); 

                	newLeafNode(otherlv_2, grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:437:1: ( (lv_iteration_3_0= RULE_INT ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:438:1: (lv_iteration_3_0= RULE_INT )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:438:1: (lv_iteration_3_0= RULE_INT )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:439:3: lv_iteration_3_0= RULE_INT
            {
            lv_iteration_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIterationPhase989); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleIterationPhase1006); 

                	newLeafNode(otherlv_4, grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:459:1: ( (lv_phase_5_0= ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:460:1: (lv_phase_5_0= ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:460:1: (lv_phase_5_0= ruleAttachedPhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:461:3: lv_phase_5_0= ruleAttachedPhase
            {
             
            	        newCompositeNode(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttachedPhase_in_ruleIterationPhase1027);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleIterationPhase1039); 

                	newLeafNode(otherlv_6, grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6());
                

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:489:1: entryRuleOptionalPhase returns [EObject current=null] : iv_ruleOptionalPhase= ruleOptionalPhase EOF ;
    public final EObject entryRuleOptionalPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:490:2: (iv_ruleOptionalPhase= ruleOptionalPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:491:2: iv_ruleOptionalPhase= ruleOptionalPhase EOF
            {
             newCompositeNode(grammarAccess.getOptionalPhaseRule()); 
            pushFollow(FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase1075);
            iv_ruleOptionalPhase=ruleOptionalPhase();

            state._fsp--;

             current =iv_ruleOptionalPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalPhase1085); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:498:1: ruleOptionalPhase returns [EObject current=null] : (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phase_3_0= ruleAttachedPhase ) ) otherlv_4= ')' ) ;
    public final EObject ruleOptionalPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_phase_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:501:28: ( (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phase_3_0= ruleAttachedPhase ) ) otherlv_4= ')' ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:502:1: (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phase_3_0= ruleAttachedPhase ) ) otherlv_4= ')' )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:502:1: (otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phase_3_0= ruleAttachedPhase ) ) otherlv_4= ')' )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:502:3: otherlv_0= 'Optional' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '(' ( (lv_phase_3_0= ruleAttachedPhase ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleOptionalPhase1122); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:506:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:507:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:507:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:508:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOptionalPhase1139); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOptionalPhase1157); 

                	newLeafNode(otherlv_2, grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:528:1: ( (lv_phase_3_0= ruleAttachedPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:529:1: (lv_phase_3_0= ruleAttachedPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:529:1: (lv_phase_3_0= ruleAttachedPhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:530:3: lv_phase_3_0= ruleAttachedPhase
            {
             
            	        newCompositeNode(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttachedPhase_in_ruleOptionalPhase1178);
            lv_phase_3_0=ruleAttachedPhase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalPhaseRule());
            	        }
                   		set(
                   			current, 
                   			"phase",
                    		lv_phase_3_0, 
                    		"AttachedPhase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleOptionalPhase1190); 

                	newLeafNode(otherlv_4, grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4());
                

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:558:1: entryRuleAttachedPhase returns [EObject current=null] : iv_ruleAttachedPhase= ruleAttachedPhase EOF ;
    public final EObject entryRuleAttachedPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachedPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:559:2: (iv_ruleAttachedPhase= ruleAttachedPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:560:2: iv_ruleAttachedPhase= ruleAttachedPhase EOF
            {
             newCompositeNode(grammarAccess.getAttachedPhaseRule()); 
            pushFollow(FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase1226);
            iv_ruleAttachedPhase=ruleAttachedPhase();

            state._fsp--;

             current =iv_ruleAttachedPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedPhase1236); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:567:1: ruleAttachedPhase returns [EObject current=null] : (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase ) ;
    public final EObject ruleAttachedPhase() throws RecognitionException {
        EObject current = null;

        EObject this_PhaseReference_0 = null;

        EObject this_NewPhase_1 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:570:28: ( (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:571:1: (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:571:1: (this_PhaseReference_0= rulePhaseReference | this_NewPhase_1= ruleNewPhase )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==15||LA8_0==18||(LA8_0>=20 && LA8_0<=21)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:572:5: this_PhaseReference_0= rulePhaseReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePhaseReference_in_ruleAttachedPhase1283);
                    this_PhaseReference_0=rulePhaseReference();

                    state._fsp--;

                     
                            current = this_PhaseReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:582:5: this_NewPhase_1= ruleNewPhase
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNewPhase_in_ruleAttachedPhase1310);
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:598:1: entryRulePhaseReference returns [EObject current=null] : iv_rulePhaseReference= rulePhaseReference EOF ;
    public final EObject entryRulePhaseReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhaseReference = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:599:2: (iv_rulePhaseReference= rulePhaseReference EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:600:2: iv_rulePhaseReference= rulePhaseReference EOF
            {
             newCompositeNode(grammarAccess.getPhaseReferenceRule()); 
            pushFollow(FOLLOW_rulePhaseReference_in_entryRulePhaseReference1345);
            iv_rulePhaseReference=rulePhaseReference();

            state._fsp--;

             current =iv_rulePhaseReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhaseReference1355); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:607:1: rulePhaseReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePhaseReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:610:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:611:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:611:1: ( (otherlv_0= RULE_ID ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:612:1: (otherlv_0= RULE_ID )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:612:1: (otherlv_0= RULE_ID )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:613:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPhaseReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhaseReference1399); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:632:1: entryRuleNewPhase returns [EObject current=null] : iv_ruleNewPhase= ruleNewPhase EOF ;
    public final EObject entryRuleNewPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:633:2: (iv_ruleNewPhase= ruleNewPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:634:2: iv_ruleNewPhase= ruleNewPhase EOF
            {
             newCompositeNode(grammarAccess.getNewPhaseRule()); 
            pushFollow(FOLLOW_ruleNewPhase_in_entryRuleNewPhase1434);
            iv_ruleNewPhase=ruleNewPhase();

            state._fsp--;

             current =iv_ruleNewPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewPhase1444); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:641:1: ruleNewPhase returns [EObject current=null] : ( (lv_phase_0_0= rulePhase ) ) ;
    public final EObject ruleNewPhase() throws RecognitionException {
        EObject current = null;

        EObject lv_phase_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:644:28: ( ( (lv_phase_0_0= rulePhase ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:645:1: ( (lv_phase_0_0= rulePhase ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:645:1: ( (lv_phase_0_0= rulePhase ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:646:1: (lv_phase_0_0= rulePhase )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:646:1: (lv_phase_0_0= rulePhase )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:647:3: lv_phase_0_0= rulePhase
            {
             
            	        newCompositeNode(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePhase_in_ruleNewPhase1489);
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:671:1: entryRuleAtomicPhase returns [EObject current=null] : iv_ruleAtomicPhase= ruleAtomicPhase EOF ;
    public final EObject entryRuleAtomicPhase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicPhase = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:672:2: (iv_ruleAtomicPhase= ruleAtomicPhase EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:673:2: iv_ruleAtomicPhase= ruleAtomicPhase EOF
            {
             newCompositeNode(grammarAccess.getAtomicPhaseRule()); 
            pushFollow(FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase1524);
            iv_ruleAtomicPhase=ruleAtomicPhase();

            state._fsp--;

             current =iv_ruleAtomicPhase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicPhase1534); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:680:1: ruleAtomicPhase returns [EObject current=null] : (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_atomicname_3_0= ruleQualifiedName ) ) otherlv_4= 'Metrics(' ( (lv_metrics_5_0= ruleAttachedMetric ) )* otherlv_6= ')' ) ;
    public final EObject ruleAtomicPhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_atomicname_3_0 = null;

        EObject lv_metrics_5_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:683:28: ( (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_atomicname_3_0= ruleQualifiedName ) ) otherlv_4= 'Metrics(' ( (lv_metrics_5_0= ruleAttachedMetric ) )* otherlv_6= ')' ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:684:1: (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_atomicname_3_0= ruleQualifiedName ) ) otherlv_4= 'Metrics(' ( (lv_metrics_5_0= ruleAttachedMetric ) )* otherlv_6= ')' )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:684:1: (otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_atomicname_3_0= ruleQualifiedName ) ) otherlv_4= 'Metrics(' ( (lv_metrics_5_0= ruleAttachedMetric ) )* otherlv_6= ')' )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:684:3: otherlv_0= 'Atomic' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'ClassName' ( (lv_atomicname_3_0= ruleQualifiedName ) ) otherlv_4= 'Metrics(' ( (lv_metrics_5_0= ruleAttachedMetric ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAtomicPhase1571); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:688:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:689:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:689:1: (lv_name_1_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:690:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicPhase1588); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAtomicPhase1606); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:710:1: ( (lv_atomicname_3_0= ruleQualifiedName ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:711:1: (lv_atomicname_3_0= ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:711:1: (lv_atomicname_3_0= ruleQualifiedName )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:712:3: lv_atomicname_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAtomicPhaseAccess().getAtomicnameQualifiedNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAtomicPhase1627);
            lv_atomicname_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicPhaseRule());
            	        }
                   		set(
                   			current, 
                   			"atomicname",
                    		lv_atomicname_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAtomicPhase1639); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:732:1: ( (lv_metrics_5_0= ruleAttachedMetric ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=27 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:733:1: (lv_metrics_5_0= ruleAttachedMetric )
            	    {
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:733:1: (lv_metrics_5_0= ruleAttachedMetric )
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:734:3: lv_metrics_5_0= ruleAttachedMetric
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttachedMetric_in_ruleAtomicPhase1660);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAtomicPhase1673); 

                	newLeafNode(otherlv_6, grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6());
                

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:762:1: entryRuleAttachedMetric returns [EObject current=null] : iv_ruleAttachedMetric= ruleAttachedMetric EOF ;
    public final EObject entryRuleAttachedMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachedMetric = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:763:2: (iv_ruleAttachedMetric= ruleAttachedMetric EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:764:2: iv_ruleAttachedMetric= ruleAttachedMetric EOF
            {
             newCompositeNode(grammarAccess.getAttachedMetricRule()); 
            pushFollow(FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric1709);
            iv_ruleAttachedMetric=ruleAttachedMetric();

            state._fsp--;

             current =iv_ruleAttachedMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttachedMetric1719); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:771:1: ruleAttachedMetric returns [EObject current=null] : (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric ) ;
    public final EObject ruleAttachedMetric() throws RecognitionException {
        EObject current = null;

        EObject this_MetricTypeReference_0 = null;

        EObject this_NewMetric_1 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:774:28: ( (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:775:1: (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:775:1: (this_MetricTypeReference_0= ruleMetricTypeReference | this_NewMetric_1= ruleNewMetric )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=27 && LA11_0<=29)) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:776:5: this_MetricTypeReference_0= ruleMetricTypeReference
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMetricTypeReference_in_ruleAttachedMetric1766);
                    this_MetricTypeReference_0=ruleMetricTypeReference();

                    state._fsp--;

                     
                            current = this_MetricTypeReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:786:5: this_NewMetric_1= ruleNewMetric
                    {
                     
                            newCompositeNode(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNewMetric_in_ruleAttachedMetric1793);
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:802:1: entryRuleMetricTypeReference returns [EObject current=null] : iv_ruleMetricTypeReference= ruleMetricTypeReference EOF ;
    public final EObject entryRuleMetricTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricTypeReference = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:803:2: (iv_ruleMetricTypeReference= ruleMetricTypeReference EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:804:2: iv_ruleMetricTypeReference= ruleMetricTypeReference EOF
            {
             newCompositeNode(grammarAccess.getMetricTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference1828);
            iv_ruleMetricTypeReference=ruleMetricTypeReference();

            state._fsp--;

             current =iv_ruleMetricTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetricTypeReference1838); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:811:1: ruleMetricTypeReference returns [EObject current=null] : ( (lv_metric_0_0= ruleMetricType ) ) ;
    public final EObject ruleMetricTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_metric_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:814:28: ( ( (lv_metric_0_0= ruleMetricType ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:815:1: ( (lv_metric_0_0= ruleMetricType ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:815:1: ( (lv_metric_0_0= ruleMetricType ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:816:1: (lv_metric_0_0= ruleMetricType )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:816:1: (lv_metric_0_0= ruleMetricType )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:817:3: lv_metric_0_0= ruleMetricType
            {
             
            	        newCompositeNode(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleMetricType_in_ruleMetricTypeReference1883);
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:841:1: entryRuleNewMetric returns [EObject current=null] : iv_ruleNewMetric= ruleNewMetric EOF ;
    public final EObject entryRuleNewMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewMetric = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:842:2: (iv_ruleNewMetric= ruleNewMetric EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:843:2: iv_ruleNewMetric= ruleNewMetric EOF
            {
             newCompositeNode(grammarAccess.getNewMetricRule()); 
            pushFollow(FOLLOW_ruleNewMetric_in_entryRuleNewMetric1918);
            iv_ruleNewMetric=ruleNewMetric();

            state._fsp--;

             current =iv_ruleNewMetric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMetric1928); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:850:1: ruleNewMetric returns [EObject current=null] : (otherlv_0= 'new Metric' (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_metricname_3_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleNewMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_metricname_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:853:28: ( (otherlv_0= 'new Metric' (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_metricname_3_0= ruleQualifiedName ) ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:854:1: (otherlv_0= 'new Metric' (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_metricname_3_0= ruleQualifiedName ) ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:854:1: (otherlv_0= 'new Metric' (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_metricname_3_0= ruleQualifiedName ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:854:3: otherlv_0= 'new Metric' (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )? ( (lv_metricname_3_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleNewMetric1965); 

                	newLeafNode(otherlv_0, grammarAccess.getNewMetricAccess().getNewMetricKeyword_0());
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:858:1: (otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:858:3: otherlv_1= 'ID' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleNewMetric1978); 

                        	newLeafNode(otherlv_1, grammarAccess.getNewMetricAccess().getIDKeyword_1_0());
                        
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:862:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:863:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:863:1: (lv_name_2_0= RULE_ID )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:864:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNewMetric1995); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNewMetricRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:880:4: ( (lv_metricname_3_0= ruleQualifiedName ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:881:1: (lv_metricname_3_0= ruleQualifiedName )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:881:1: (lv_metricname_3_0= ruleQualifiedName )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:882:3: lv_metricname_3_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNewMetric2023);
            lv_metricname_3_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNewMetricRule());
            	        }
                   		set(
                   			current, 
                   			"metricname",
                    		lv_metricname_3_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:906:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:907:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:908:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2060);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2071); 

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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:915:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:918:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:919:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:919:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:919:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2111); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:926:1: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:927:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName2130); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName2145); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:947:1: ruleMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) ) ;
    public final Enumerator ruleMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:949:28: ( ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) ) )
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:950:1: ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) )
            {
            // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:950:1: ( (enumLiteral_0= 'Time' ) | (enumLiteral_1= 'Memory' ) | (enumLiteral_2= 'Scalar' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:950:2: (enumLiteral_0= 'Time' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:950:2: (enumLiteral_0= 'Time' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:950:4: enumLiteral_0= 'Time'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_27_in_ruleMetricType2206); 

                            current = grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:956:6: (enumLiteral_1= 'Memory' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:956:6: (enumLiteral_1= 'Memory' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:956:8: enumLiteral_1= 'Memory'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleMetricType2223); 

                            current = grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:962:6: (enumLiteral_2= 'Scalar' )
                    {
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:962:6: (enumLiteral_2= 'Scalar' )
                    // ../eu.mondo.sam.domain/src-gen/eu/mondo/sam/domain/parser/antlr/internal/InternalBenchmark.g:962:8: enumLiteral_2= 'Scalar'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleMetricType2240); 

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
    public static final BitSet FOLLOW_ruleElement_in_ruleBenchmark130 = new BitSet(new long[]{0x0000000000349802L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_ruleElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackageDeclaration_in_entryRulePackageDeclaration312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackageDeclaration322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackageDeclaration359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePackageDeclaration380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenario_in_entryRuleScenario416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenario426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleScenario463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleScenario484 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleScenario496 = new BitSet(new long[]{0x0000000000348000L});
    public static final BitSet FOLLOW_rulePhase_in_ruleScenario517 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleScenario529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_entryRulePhase565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhase575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_rulePhase622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_rulePhase649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_rulePhase676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_rulePhase703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequencePhase_in_entryRuleSequencePhase738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencePhase748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSequencePhase785 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequencePhase802 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSequencePhase820 = new BitSet(new long[]{0x0000000000348010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleSequencePhase841 = new BitSet(new long[]{0x0000000000368010L});
    public static final BitSet FOLLOW_17_in_ruleSequencePhase854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationPhase_in_entryRuleIterationPhase890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationPhase900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIterationPhase937 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIterationPhase954 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIterationPhase972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIterationPhase989 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIterationPhase1006 = new BitSet(new long[]{0x0000000000348010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleIterationPhase1027 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIterationPhase1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalPhase_in_entryRuleOptionalPhase1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalPhase1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOptionalPhase1122 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalPhase1139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleOptionalPhase1157 = new BitSet(new long[]{0x0000000000348010L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_ruleOptionalPhase1178 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOptionalPhase1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedPhase_in_entryRuleAttachedPhase1226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedPhase1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_ruleAttachedPhase1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_ruleAttachedPhase1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhaseReference_in_entryRulePhaseReference1345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhaseReference1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhaseReference1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewPhase_in_entryRuleNewPhase1434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewPhase1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhase_in_ruleNewPhase1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicPhase_in_entryRuleAtomicPhase1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicPhase1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAtomicPhase1571 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicPhase1588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAtomicPhase1606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAtomicPhase1627 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicPhase1639 = new BitSet(new long[]{0x0000000039020000L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_ruleAtomicPhase1660 = new BitSet(new long[]{0x0000000039020000L});
    public static final BitSet FOLLOW_17_in_ruleAtomicPhase1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttachedMetric_in_entryRuleAttachedMetric1709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttachedMetric1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_ruleAttachedMetric1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_ruleAttachedMetric1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricTypeReference_in_entryRuleMetricTypeReference1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetricTypeReference1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetricType_in_ruleMetricTypeReference1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMetric_in_entryRuleNewMetric1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMetric1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNewMetric1965 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleNewMetric1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNewMetric1995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNewMetric2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2111 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName2130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2145 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27_in_ruleMetricType2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMetricType2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMetricType2240 = new BitSet(new long[]{0x0000000000000002L});

}