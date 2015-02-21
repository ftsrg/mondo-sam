package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.OptionalPhase;

public class OptionalPhaseIterator implements PhaseIterator{

	private OptionalPhase optionalPhase;
	private PhaseIterator iterator;
	private boolean hasNext;
	
	
	public OptionalPhaseIterator(OptionalPhase optionalPhase){
		this.optionalPhase = optionalPhase;
		this.hasNext = true;
		iterator = optionalPhase.getPhase().getIterator();
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (optionalPhase.condition()){
			AtomicPhase atomic = iterator.nextPhase();
			if (iterator.hasNext() == false){
				hasNext = false;
			}
			return atomic;
			
		}
		hasNext = false;
		return null;
	}

	@Override
	public boolean hasNext() {
		return hasNext;
	}

}
