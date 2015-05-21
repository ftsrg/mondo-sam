/*
* generated by Xtext
*/
grammar InternalBenchmark;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package eu.mondo.sam.domain.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleBenchmark
entryRuleBenchmark returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBenchmarkRule()); }
	 iv_ruleBenchmark=ruleBenchmark 
	 { $current=$iv_ruleBenchmark.current; } 
	 EOF 
;

// Rule Benchmark
ruleBenchmark returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBenchmarkAccess().getPackageKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); 
	    }
		lv_packageName_1_0=ruleQualifiedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBenchmarkRule());
	        }
       		set(
       			$current, 
       			"packageName",
        		lv_packageName_1_0, 
        		"QualifiedName");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBenchmarkRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_2_0, 
        		"Element");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	 iv_ruleElement=ruleElement 
	 { $current=$iv_ruleElement.current; } 
	 EOF 
;

// Rule Element
ruleElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); 
    }
    this_Scenario_0=ruleScenario
    { 
        $current = $this_Scenario_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); 
    }
    this_Phase_1=rulePhase
    { 
        $current = $this_Phase_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	 iv_ruleScenario=ruleScenario 
	 { $current=$iv_ruleScenario.current; } 
	 EOF 
;

// Rule Scenario
ruleScenario returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Scenario' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
    }
(
(
		lv_classname_1_0=RULE_ID
		{
			newLeafNode(lv_classname_1_0, grammarAccess.getScenarioAccess().getClassnameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getScenarioRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classname",
        		lv_classname_1_0, 
        		"ID");
	    }

)
)this_LBRACE_2=RULE_LBRACE
    { 
    newLeafNode(this_LBRACE_2, grammarAccess.getScenarioAccess().getLBRACETerminalRuleCall_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0()); 
	    }
		lv_rootPhase_3_0=ruleAttachedPhase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getScenarioRule());
	        }
       		set(
       			$current, 
       			"rootPhase",
        		lv_rootPhase_3_0, 
        		"AttachedPhase");
	        afterParserOrEnumRuleCall();
	    }

)
)this_RBRACE_4=RULE_RBRACE
    { 
    newLeafNode(this_RBRACE_4, grammarAccess.getScenarioAccess().getRBRACETerminalRuleCall_4()); 
    }
)
;





// Entry rule entryRulePhase
entryRulePhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhaseRule()); }
	 iv_rulePhase=rulePhase 
	 { $current=$iv_rulePhase.current; } 
	 EOF 
;

// Rule Phase
rulePhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); 
    }
    this_SequencePhase_0=ruleSequencePhase
    { 
        $current = $this_SequencePhase_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); 
    }
    this_IterationPhase_1=ruleIterationPhase
    { 
        $current = $this_IterationPhase_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); 
    }
    this_OptionalPhase_2=ruleOptionalPhase
    { 
        $current = $this_OptionalPhase_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); 
    }
    this_AtomicPhase_3=ruleAtomicPhase
    { 
        $current = $this_AtomicPhase_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSequencePhase
entryRuleSequencePhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequencePhaseRule()); }
	 iv_ruleSequencePhase=ruleSequencePhase 
	 { $current=$iv_ruleSequencePhase.current; } 
	 EOF 
;

// Rule SequencePhase
ruleSequencePhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Sequence' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSequencePhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?this_LPAR_2=RULE_LPAR
    { 
    newLeafNode(this_LPAR_2, grammarAccess.getSequencePhaseAccess().getLPARTerminalRuleCall_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); 
	    }
		lv_phases_3_0=ruleAttachedPhase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequencePhaseRule());
	        }
       		add(
       			$current, 
       			"phases",
        		lv_phases_3_0, 
        		"AttachedPhase");
	        afterParserOrEnumRuleCall();
	    }

)
)+this_RPAR_4=RULE_RPAR
    { 
    newLeafNode(this_RPAR_4, grammarAccess.getSequencePhaseAccess().getRPARTerminalRuleCall_4()); 
    }
)
;





// Entry rule entryRuleIterationPhase
entryRuleIterationPhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIterationPhaseRule()); }
	 iv_ruleIterationPhase=ruleIterationPhase 
	 { $current=$iv_ruleIterationPhase.current; } 
	 EOF 
;

// Rule IterationPhase
ruleIterationPhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Iteration' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIterationPhaseAccess().getIterationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIterationPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?this_LPAR_2=RULE_LPAR
    { 
    newLeafNode(this_LPAR_2, grammarAccess.getIterationPhaseAccess().getLPARTerminalRuleCall_2()); 
    }
(
(
		lv_iteration_3_0=RULE_INT
		{
			newLeafNode(lv_iteration_3_0, grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIterationPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"iteration",
        		lv_iteration_3_0, 
        		"INT");
	    }

)
)	otherlv_4='*' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
	    }
		lv_phase_5_0=ruleAttachedPhase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIterationPhaseRule());
	        }
       		set(
       			$current, 
       			"phase",
        		lv_phase_5_0, 
        		"AttachedPhase");
	        afterParserOrEnumRuleCall();
	    }

)
)this_RPAR_6=RULE_RPAR
    { 
    newLeafNode(this_RPAR_6, grammarAccess.getIterationPhaseAccess().getRPARTerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleOptionalPhase
entryRuleOptionalPhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionalPhaseRule()); }
	 iv_ruleOptionalPhase=ruleOptionalPhase 
	 { $current=$iv_ruleOptionalPhase.current; } 
	 EOF 
;

// Rule OptionalPhase
ruleOptionalPhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Optional' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionalPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?	otherlv_2='ClassName' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOptionalPhaseAccess().getClassNameKeyword_2());
    }
(
(
		lv_classname_3_0=RULE_ID
		{
			newLeafNode(lv_classname_3_0, grammarAccess.getOptionalPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOptionalPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classname",
        		lv_classname_3_0, 
        		"ID");
	    }

)
)this_LPAR_4=RULE_LPAR
    { 
    newLeafNode(this_LPAR_4, grammarAccess.getOptionalPhaseAccess().getLPARTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); 
	    }
		lv_phase_5_0=ruleAttachedPhase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalPhaseRule());
	        }
       		set(
       			$current, 
       			"phase",
        		lv_phase_5_0, 
        		"AttachedPhase");
	        afterParserOrEnumRuleCall();
	    }

)
)this_RPAR_6=RULE_RPAR
    { 
    newLeafNode(this_RPAR_6, grammarAccess.getOptionalPhaseAccess().getRPARTerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleAttachedPhase
entryRuleAttachedPhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttachedPhaseRule()); }
	 iv_ruleAttachedPhase=ruleAttachedPhase 
	 { $current=$iv_ruleAttachedPhase.current; } 
	 EOF 
;

// Rule AttachedPhase
ruleAttachedPhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); 
    }
    this_PhaseReference_0=rulePhaseReference
    { 
        $current = $this_PhaseReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); 
    }
    this_NewPhase_1=ruleNewPhase
    { 
        $current = $this_NewPhase_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePhaseReference
entryRulePhaseReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhaseReferenceRule()); }
	 iv_rulePhaseReference=rulePhaseReference 
	 { $current=$iv_rulePhaseReference.current; } 
	 EOF 
;

// Rule PhaseReference
rulePhaseReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPhaseReferenceRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); 
	}

)
)
;





// Entry rule entryRuleNewPhase
entryRuleNewPhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNewPhaseRule()); }
	 iv_ruleNewPhase=ruleNewPhase 
	 { $current=$iv_ruleNewPhase.current; } 
	 EOF 
;

// Rule NewPhase
ruleNewPhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); 
	    }
		lv_phase_0_0=rulePhase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNewPhaseRule());
	        }
       		set(
       			$current, 
       			"phase",
        		lv_phase_0_0, 
        		"Phase");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleAtomicPhase
entryRuleAtomicPhase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicPhaseRule()); }
	 iv_ruleAtomicPhase=ruleAtomicPhase 
	 { $current=$iv_ruleAtomicPhase.current; } 
	 EOF 
;

// Rule AtomicPhase
ruleAtomicPhase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Atomic' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)?	otherlv_2='ClassName' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2());
    }
(
(
		lv_classname_3_0=RULE_ID
		{
			newLeafNode(lv_classname_3_0, grammarAccess.getAtomicPhaseAccess().getClassnameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicPhaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classname",
        		lv_classname_3_0, 
        		"ID");
	    }

)
)this_METRICS_4=RULE_METRICS
    { 
    newLeafNode(this_METRICS_4, grammarAccess.getAtomicPhaseAccess().getMETRICSTerminalRuleCall_4()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); 
	    }
		lv_metrics_5_0=ruleAttachedMetric		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAtomicPhaseRule());
	        }
       		add(
       			$current, 
       			"metrics",
        		lv_metrics_5_0, 
        		"AttachedMetric");
	        afterParserOrEnumRuleCall();
	    }

)
)*this_RPAR_6=RULE_RPAR
    { 
    newLeafNode(this_RPAR_6, grammarAccess.getAtomicPhaseAccess().getRPARTerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleAttachedMetric
entryRuleAttachedMetric returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttachedMetricRule()); }
	 iv_ruleAttachedMetric=ruleAttachedMetric 
	 { $current=$iv_ruleAttachedMetric.current; } 
	 EOF 
;

// Rule AttachedMetric
ruleAttachedMetric returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); 
    }
    this_MetricTypeReference_0=ruleMetricTypeReference
    { 
        $current = $this_MetricTypeReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); 
    }
    this_NewMetric_1=ruleNewMetric
    { 
        $current = $this_NewMetric_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMetricTypeReference
entryRuleMetricTypeReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMetricTypeReferenceRule()); }
	 iv_ruleMetricTypeReference=ruleMetricTypeReference 
	 { $current=$iv_ruleMetricTypeReference.current; } 
	 EOF 
;

// Rule MetricTypeReference
ruleMetricTypeReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0_0()); 
	    }
		lv_metric_0_0=ruleMetricType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMetricTypeReferenceRule());
	        }
       		set(
       			$current, 
       			"metric",
        		lv_metric_0_0, 
        		"MetricType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='ID' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMetricTypeReferenceAccess().getIDKeyword_1());
    }
(
(
		lv_metricname_2_0=RULE_ID
		{
			newLeafNode(lv_metricname_2_0, grammarAccess.getMetricTypeReferenceAccess().getMetricnameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMetricTypeReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"metricname",
        		lv_metricname_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleNewMetric
entryRuleNewMetric returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNewMetricRule()); }
	 iv_ruleNewMetric=ruleNewMetric 
	 { $current=$iv_ruleNewMetric.current; } 
	 EOF 
;

// Rule NewMetric
ruleNewMetric returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='new Metric ClassName' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNewMetricAccess().getNewMetricClassNameKeyword_0());
    }
(
(
		lv_classname_1_0=RULE_ID
		{
			newLeafNode(lv_classname_1_0, grammarAccess.getNewMetricAccess().getClassnameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNewMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"classname",
        		lv_classname_1_0, 
        		"ID");
	    }

)
)	otherlv_2='ID' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getNewMetricAccess().getIDKeyword_2());
    }
(
(
		lv_metricname_3_0=RULE_ID
		{
			newLeafNode(lv_metricname_3_0, grammarAccess.getNewMetricAccess().getMetricnameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNewMetricRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"metricname",
        		lv_metricname_3_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule MetricType
ruleMetricType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Time' 
	{
        $current = grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Memory' 
	{
        $current = grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Scalar' 
	{
        $current = grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); 
    }
));



RULE_LBRACE : '{';

RULE_RBRACE : '}';

RULE_METRICS : 'Metrics(';

RULE_LPAR : '(';

RULE_RPAR : ')';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


