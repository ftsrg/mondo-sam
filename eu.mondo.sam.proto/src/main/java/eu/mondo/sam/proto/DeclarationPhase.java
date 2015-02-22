package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.AtomicPhase;

public class DeclarationPhase extends AtomicPhase{

	private ProtoScenario protoScenario;
	
	public DeclarationPhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoScenario protoScenario) {
		this.protoScenario = protoScenario;
	}

	@Override
	public void execute(){
	}
	
}
