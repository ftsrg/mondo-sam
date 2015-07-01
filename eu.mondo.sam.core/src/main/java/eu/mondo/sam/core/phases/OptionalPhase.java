package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.OptionalPhaseIterator;

/**
 * Subclass of ConditionalPhase. Provides an OptionalPhaseIterator.
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class OptionalPhase extends ConditionalPhase {

	/**
	 * Returns a new OptionalPhaseIterator instance, which has a reference
	 * to this object and also can control the access to the field of this
	 * class.
	 * 
	 * @return new OptionalPhaseIterator instance. Cannot be null.
	 */
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new OptionalPhaseIterator(this);
	}
}
