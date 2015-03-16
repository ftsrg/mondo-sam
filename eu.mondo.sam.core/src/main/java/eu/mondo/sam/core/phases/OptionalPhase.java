package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.OptionalPhaseIterator;

public abstract class OptionalPhase extends ConditionalPhase{

//	protected OptionalPhaseIterator iterator;
	
//	public OptionalPhase() {
//		iterator = new OptionalPhaseIterator(this);
//	}
	
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new OptionalPhaseIterator(this);
	}
}
