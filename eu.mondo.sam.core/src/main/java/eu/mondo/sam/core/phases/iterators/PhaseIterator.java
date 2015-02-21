package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;

public interface PhaseIterator {

	public AtomicPhase nextPhase();
	public boolean hasNext();
}
