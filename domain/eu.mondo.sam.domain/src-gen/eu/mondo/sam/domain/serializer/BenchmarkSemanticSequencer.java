package eu.mondo.sam.domain.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.MetricTypeReference;
import eu.mondo.sam.domain.benchmark.NewMetric;
import eu.mondo.sam.domain.benchmark.NewPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.PhaseReference;
import eu.mondo.sam.domain.benchmark.Scenario;
import eu.mondo.sam.domain.benchmark.SequencePhase;
import eu.mondo.sam.domain.services.BenchmarkGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BenchmarkSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BenchmarkGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BenchmarkPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BenchmarkPackage.ATOMIC_PHASE:
				if(context == grammarAccess.getAtomicPhaseRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPhaseRule()) {
					sequence_AtomicPhase(context, (AtomicPhase) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.BENCHMARK:
				if(context == grammarAccess.getBenchmarkRule()) {
					sequence_Benchmark(context, (Benchmark) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.ITERATION_PHASE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getIterationPhaseRule() ||
				   context == grammarAccess.getPhaseRule()) {
					sequence_IterationPhase(context, (IterationPhase) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.METRIC_TYPE_REFERENCE:
				if(context == grammarAccess.getAttachedMetricRule() ||
				   context == grammarAccess.getMetricTypeReferenceRule()) {
					sequence_MetricTypeReference(context, (MetricTypeReference) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.NEW_METRIC:
				if(context == grammarAccess.getAttachedMetricRule() ||
				   context == grammarAccess.getNewMetricRule()) {
					sequence_NewMetric(context, (NewMetric) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.NEW_PHASE:
				if(context == grammarAccess.getAttachedPhaseRule() ||
				   context == grammarAccess.getNewPhaseRule()) {
					sequence_NewPhase(context, (NewPhase) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.OPTIONAL_PHASE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getOptionalPhaseRule() ||
				   context == grammarAccess.getPhaseRule()) {
					sequence_OptionalPhase(context, (OptionalPhase) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.PHASE_REFERENCE:
				if(context == grammarAccess.getAttachedPhaseRule() ||
				   context == grammarAccess.getPhaseReferenceRule()) {
					sequence_PhaseReference(context, (PhaseReference) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.SCENARIO:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getScenarioRule()) {
					sequence_Scenario(context, (Scenario) semanticObject); 
					return; 
				}
				else break;
			case BenchmarkPackage.SEQUENCE_PHASE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getPhaseRule() ||
				   context == grammarAccess.getSequencePhaseRule()) {
					sequence_SequencePhase(context, (SequencePhase) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID? classname=ID metrics+=AttachedMetric*)
	 */
	protected void sequence_AtomicPhase(EObject context, AtomicPhase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName elements+=Element*)
	 */
	protected void sequence_Benchmark(EObject context, Benchmark semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? iteration=INT phase=AttachedPhase)
	 */
	protected void sequence_IterationPhase(EObject context, IterationPhase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     metric=MetricType
	 */
	protected void sequence_MetricTypeReference(EObject context, MetricTypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BenchmarkPackage.Literals.METRIC_TYPE_REFERENCE__METRIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BenchmarkPackage.Literals.METRIC_TYPE_REFERENCE__METRIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0(), semanticObject.getMetric());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? metricname=QualifiedName)
	 */
	protected void sequence_NewMetric(EObject context, NewMetric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     phase=Phase
	 */
	protected void sequence_NewPhase(EObject context, NewPhase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BenchmarkPackage.Literals.NEW_PHASE__PHASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BenchmarkPackage.Literals.NEW_PHASE__PHASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0(), semanticObject.getPhase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? phase=AttachedPhase)
	 */
	protected void sequence_OptionalPhase(EObject context, OptionalPhase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     phase=[Phase|ID]
	 */
	protected void sequence_PhaseReference(EObject context, PhaseReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BenchmarkPackage.Literals.PHASE_REFERENCE__PHASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BenchmarkPackage.Literals.PHASE_REFERENCE__PHASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1(), semanticObject.getPhase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (classname=STRING rootPhase=AttachedPhase)
	 */
	protected void sequence_Scenario(EObject context, Scenario semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BenchmarkPackage.Literals.SCENARIO__CLASSNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BenchmarkPackage.Literals.SCENARIO__CLASSNAME));
			if(transientValues.isValueTransient(semanticObject, BenchmarkPackage.Literals.SCENARIO__ROOT_PHASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BenchmarkPackage.Literals.SCENARIO__ROOT_PHASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScenarioAccess().getClassnameSTRINGTerminalRuleCall_1_0(), semanticObject.getClassname());
		feeder.accept(grammarAccess.getScenarioAccess().getRootPhaseAttachedPhaseParserRuleCall_3_0(), semanticObject.getRootPhase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? phases+=AttachedPhase+)
	 */
	protected void sequence_SequencePhase(EObject context, SequencePhase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
