package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

public class DeclarationPhase extends AtomicPhase{

	private ProtoScenario protoCase;
	//private ChangesMetric cm;
	
	public DeclarationPhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoScenario protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute(){
	}
	
}
