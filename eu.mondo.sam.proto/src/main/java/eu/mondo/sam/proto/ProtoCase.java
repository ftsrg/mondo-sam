package eu.mondo.sam.proto;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.BenchmarkPhaseGroup;

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
		MultiplePhase multiple = new MultiplePhase("Multiple");
		DeclarationPhase declaration = new DeclarationPhase("Declaration");
		BenchmarkMetric decChanges = new BenchmarkMetric("Declaration Changes");
		BenchmarkMetric changes = new BenchmarkMetric("Changes");
		BenchmarkMetric time = new BenchmarkMetric("Time");
		BenchmarkMetric steps = new BenchmarkMetric("Steps");
		model = new ProtoModel(0);
		
		multiple.addMetrics(changes, time, steps);
		declaration.addMetrics(decChanges);
		BenchmarkPhaseGroup group1 = new BenchmarkPhaseGroup();
		group1.addPhase(declaration);
		BenchmarkPhaseGroup group2 = new BenchmarkPhaseGroup();
		group2.addPhase(multiple);
		group2.setLoop(5);
		
		this.addPhaseGroups(group1, group2);
		declaration.setProtoCase(this);
		multiple.setProtoCase(this);
		return this;
	}

}
