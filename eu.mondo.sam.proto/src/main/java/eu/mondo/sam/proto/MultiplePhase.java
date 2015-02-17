package eu.mondo.sam.proto;

import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.PhaseInterruptedException;
import eu.mondo.sam.core.results.PhaseResult;

public class MultiplePhase extends BenchmarkPhase{

	private ProtoCase protoCase;
	
	public MultiplePhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoCase protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute() throws PhaseInterruptedException {
		int number = protoCase.getModel().getNumber();
		number *= 2;
		if (number > 32)
			throw new PhaseInterruptedException();
		protoCase.getModel().setNumber(number);
	}
}
