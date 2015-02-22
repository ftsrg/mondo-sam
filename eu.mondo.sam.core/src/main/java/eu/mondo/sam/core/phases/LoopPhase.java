package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.phases.iterators.LoopPhaseIterator;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

public abstract class LoopPhase extends ConditionalPhase{

	@Override
	public PhaseIterator getIterator() {
		return new LoopPhaseIterator(this);
	}

}
