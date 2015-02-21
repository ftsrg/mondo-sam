package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;

public class AtomicPhaseIterator implements PhaseIterator{

	private AtomicPhase atomic;
	
	public AtomicPhaseIterator(AtomicPhase atomicPhase){
		this.atomic = atomicPhase;
	}
	
	@Override
	public AtomicPhase nextPhase() {
		return atomic;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

}
