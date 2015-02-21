package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.OptionalPhase;

public class OptionalPhaseIterator implements PhaseIterator{

	private OptionalPhase optionalPhase;
	
	public OptionalPhaseIterator(OptionalPhase optionalPhase){
		this.optionalPhase = optionalPhase;
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (optionalPhase.condition()){
			PhaseIterator iterator = optionalPhase.getPhase().getIterator();
			return iterator.nextPhase();
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

}
