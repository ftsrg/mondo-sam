package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.phases.iterators.PhaseIterator;

public interface BenchmarkPhase {

	public PhaseIterator getIterator();
}
