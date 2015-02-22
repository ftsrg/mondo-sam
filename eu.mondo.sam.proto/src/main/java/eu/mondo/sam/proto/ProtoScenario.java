package eu.mondo.sam.proto;

import eu.mondo.sam.core.metrics.BenchmarkMetric;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.TimerMetric;
import eu.mondo.sam.core.phases.IterationPhase;
import eu.mondo.sam.core.phases.SequencePhase;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;


public class ProtoScenario extends BenchmarkScenario{

	protected ProtoConfig protoConfig;
	private ProtoModel model;
	
	public ProtoScenario(String name) {
		super(name);
	}
	
	public ProtoConfig getProtoConfig() {
		return protoConfig;
	}
	
	public ProtoModel getModel() {
		return model;
	}
	
	public void setProtoConfig(ProtoConfig protoConfig) {
		this.protoConfig = protoConfig;
	}

	@Override
	public BenchmarkScenario buildScenario() {
		scenario = protoConfig.getScenario();
		runIndex = protoConfig.getRunIndex();
		size = protoConfig.getSize();
		tool = protoConfig.getTool();
		caseName = protoConfig.getCaseName();
		
		MultiplePhase multiple = new MultiplePhase("Multiple");
		DeclarationPhase declaration = new DeclarationPhase("Declaration");
		TimerMetric timer = new TimerMetric("Time");
		MemoryMetric memory = new MemoryMetric("Memory");
		multiple.addMetrics(timer, memory);
		declaration.addMetrics(timer, memory);
		
		BenchmarkMetric changes = new ChangesMetric("Changes");
		model = new ProtoModel(2);
		
		OptionalProtoPhase optional = new OptionalProtoPhase();
		ProtoLoopPhase loopPhase = new ProtoLoopPhase();
		SequencePhase seq = new SequencePhase();
		SequencePhase seq2 = new SequencePhase();
		SequencePhase seq3 = new SequencePhase();
		IterationPhase iter = new IterationPhase(3);
		IterationPhase iter2 = new IterationPhase(5);
		
		optional.setPhase(multiple);
		loopPhase.setPhase(multiple);
		seq.addPhases(declaration, optional, multiple);
		seq2.addPhases(multiple, multiple);
		seq3.addPhases(multiple);
		iter.setPhase(iter2);
		iter2.setPhase(seq);
		
		
		
		multiple.addMetrics(changes);
		
		this.setRootPhase(iter);
		declaration.setProtoCase(this);
		multiple.setProtoCase(this);
		return this;
	}

}