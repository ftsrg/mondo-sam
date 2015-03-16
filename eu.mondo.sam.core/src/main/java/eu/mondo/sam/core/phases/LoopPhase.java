package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.LoopPhaseIterator;

public abstract class LoopPhase extends ConditionalPhase{

	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new LoopPhaseIterator(this);
	}

}
