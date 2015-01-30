package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.PhaseInterruptedException;
import eu.mondo.sam.core.results.PhaseResult;

public class DeclarationPhase extends BenchmarkPhase{

	private ProtoCase protoCase;
	
	public DeclarationPhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoCase protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute(PhaseResult result) throws PhaseInterruptedException {
		
	}

}
