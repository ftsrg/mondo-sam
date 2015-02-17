package eu.mondo.sam.proto;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.IterationPhase;
import eu.mondo.sam.core.phases.SequencePhase;


public class ProtoCase extends BenchmarkCase{

	protected ProtoConfig protoConfig;
	private ProtoModel model;
	
	public ProtoCase(String name) {
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
	public BenchmarkCase buildCase() {
		this.scenario = this.protoConfig.getScenario();
		this.runIndex = this.protoConfig.getRunIndex();
		this.size = this.protoConfig.getSize();
		this.tool = this.protoConfig.getTool();
		this.caseName = "ProtoCase";
		
		MultiplePhase multiple = new MultiplePhase("Multiple");
		DeclarationPhase declaration = new DeclarationPhase("Declaration");
		
//		BenchmarkMetric decChanges = new BenchmarkMetric("Declaration Changes");
		BenchmarkMetric changes = new ChangesMetric("Changes");
//		BenchmarkMetric steps = new BenchmarkMetric("Steps");
		model = new ProtoModel(2);
		
		IterationPhase iter = new IterationPhase(0, 3);
		SequencePhase seq = new SequencePhase();
		iter.setPhase(multiple);
		seq.addPhases(declaration, iter);
		
		
		
		multiple.addMetrics(changes);
		
		this.addPhases(seq);
		declaration.setProtoCase(this);
		multiple.setProtoCase(this);
		return this;
	}

}
