package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.LoopPhase;

public class ProtoLoopPhase extends LoopPhase{

	private int limit = 10;
	private int index = 0;
	
	@Override
	public boolean condition() {
		if (index < limit){
			return true;
		}
		return false;
	}
	
}
