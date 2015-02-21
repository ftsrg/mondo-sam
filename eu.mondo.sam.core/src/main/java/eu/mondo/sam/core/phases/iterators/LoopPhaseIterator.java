package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.LoopPhase;

public class LoopPhaseIterator implements PhaseIterator{

	private LoopPhase loopPhase;
	
	public LoopPhaseIterator(LoopPhase loopPhase) {
		this.loopPhase = loopPhase;
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (loopPhase.condition()){
			PhaseIterator iterator = loopPhase.getPhase().getIterator();
			return iterator.nextPhase();
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return loopPhase.condition();
	}

}
