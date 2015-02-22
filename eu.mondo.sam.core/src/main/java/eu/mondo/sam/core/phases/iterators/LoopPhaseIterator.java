package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.LoopPhase;

public class LoopPhaseIterator implements PhaseIterator{

	private LoopPhase loopPhase;
	private PhaseIterator iterator;
	
	public LoopPhaseIterator(LoopPhase loopPhase) {
		this.loopPhase = loopPhase;
		iterator = loopPhase.getPhase().getIterator();
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (loopPhase.condition()){
			return iterator.nextPhase();
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return loopPhase.condition();
	}

}
