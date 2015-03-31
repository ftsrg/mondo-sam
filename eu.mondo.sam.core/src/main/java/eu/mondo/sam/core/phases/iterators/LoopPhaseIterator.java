package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.LoopPhase;

/**
 * Provides an access mechanism to a LoopPhase object. Abstract class, the next
 * method must be implemented by the subclasses.
 * 
 * @author Zsolt Kovari
 *
 */
public class LoopPhaseIterator implements Iterator<BenchmarkPhase> {

    /**
     * Refers to a LoopPhase object.
     */
    private LoopPhase loopPhase;

    /**
     * Refers to the iterator of the BenchmarkPhase which belongs to the
     * loopPhase variable.
     */
    private Iterator<BenchmarkPhase> iterator;

    /**
     * Parameterized constructor. Makes reference to a LoopPhase object, and
     * initializes the local fields.
     * 
     * @param loopPhase
     *            LoopPhase object with initialized fields. It must contain a
     *            BenchmarkPhase.
     */
    public LoopPhaseIterator(LoopPhase loopPhase) {
	this.loopPhase = loopPhase;
	iterator = loopPhase.getPhase().iterator();
    }

    /**
     * Returns an AtomicPhase object if the condition of the loopPhase proves
     * true.
     * 
     * @return AtomicPhase or null.
     */
    @Override
    public AtomicPhase next() {
	if (loopPhase.condition()) {
	    return (AtomicPhase) iterator.next();
	}
	return null;
    }

    /**
     * Determines whether there are another achievable AtomicPhase object
     * according to the condition of the loopPhase variable.
     * 
     * @return True, if the condition of the contained LoopPhase instance proves
     *         true, and false in the other case.
     */
    @Override
    public boolean hasNext() {
	return loopPhase.condition();
    }

    /**
     * Unsupported method.
     * 
     * @throws UnsupportedOperationException
     */
    @Override
    public void remove() {
	throw new UnsupportedOperationException(
		"The remove method is unsupported!");
    }

}
