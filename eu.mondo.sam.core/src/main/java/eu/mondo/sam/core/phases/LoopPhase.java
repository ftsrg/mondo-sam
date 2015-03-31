package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.LoopPhaseIterator;

/**
 * Subclass of ConditionalPhase. Provides a LoopPhaseIterator.
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class LoopPhase extends ConditionalPhase {

    /**
     * Returns a new LoopPhaseIterator instance, which has a reference to this
     * object and also can control the access to the field of this class.
     * 
     * @return new LoopPhaseIterator instance. Cannot be null.
     */
    @Override
    public Iterator<BenchmarkPhase> iterator() {
	return new LoopPhaseIterator(this);
    }

}
