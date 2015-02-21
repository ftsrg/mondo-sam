package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;

public class AtomicPhaseIterator implements PhaseIterator{

	private AtomicPhase atomic;
	private volatile boolean hasNext;
	
	public AtomicPhaseIterator(AtomicPhase atomicPhase){
		this.atomic = atomicPhase;
		this.hasNext = true;
	}
	
	@Override
	public AtomicPhase nextPhase() {
		this.hasNext = false;
		return atomic;
	}

	@Override
	public boolean hasNext() {
		return hasNext;
	}

}
