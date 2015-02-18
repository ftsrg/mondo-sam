package eu.mondo.sam.proto;

import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

public class MultiplePhase extends AtomicPhase{

	private ProtoCase protoCase;
	
	public MultiplePhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoCase protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute() {
		int number = protoCase.getModel().getNumber();
		number *= 2;
		((ChangesMetric)this.metrics.get(0)).setChangesValue(number);
		protoCase.getModel().setNumber(number);
	}
}
