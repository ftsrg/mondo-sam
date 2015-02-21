package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.phases.iterators.OptionalPhaseIterator;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

public abstract class OptionalPhase extends ConditionalPhase{

	protected OptionalPhaseIterator iterator;
	
	public OptionalPhase() {
		iterator = new OptionalPhaseIterator(this);
	}
	
	@Override
	public PhaseIterator getIterator() {
		return iterator;
	}
}
