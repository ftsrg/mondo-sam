package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.PhaseInterruptedException;
import eu.mondo.sam.core.results.PhaseResult;

public class DeclarationPhase extends AtomicPhase{

	private ProtoCase protoCase;
	//private ChangesMetric cm;
	
	public DeclarationPhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoCase protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute(){
	}
	
	/*public void setCm(ChangesMetric cm) {
		this.cm = cm;
	}*/

}
