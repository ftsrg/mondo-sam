package eu.mondo.sam.proto;

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
	public void execute(PhaseResult result) throws PhaseInterruptedException {
		int number = protoCase.getModel().getNumber();
		number *= number;
		metrics.get(0).setValue(number/2);
		metrics.get(1).setValue(number/3);
	}
}
