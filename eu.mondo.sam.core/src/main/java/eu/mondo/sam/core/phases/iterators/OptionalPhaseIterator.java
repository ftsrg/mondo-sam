package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.OptionalPhase;

/**
 * Provides an access mechanism to an OptionalPhase object.
 * 
 * @author Zsolt Kovari
 *
 */
public class OptionalPhaseIterator implements Iterator<BenchmarkPhase> {

    /**
     * Refers to an OptionalPhase object.
     */
    private OptionalPhase optionalPhase;

    /**
     * Refers to the iterator of the BenchmarkPhase which belongs to the
     * optionalPhase variable.
     */
    private Iterator<BenchmarkPhase> iterator;

    /**
     * Determines whether there is a following achievable AtomicPhase. Default
     * value is true.
     */
    private boolean hasNext;

    /**
     * Parameterized constructor. Makes reference to an OptionalPhase object,
     * and initializes the local fields as hasNext and iterator.
     * 
     * @param optionalPhase
     *            OptionalPhase object with initialized fields. It must contain
     *            a BenchmarkPhase.
     */
    public OptionalPhaseIterator(OptionalPhase optionalPhase) {
	this.optionalPhase = optionalPhase;
	this.hasNext = true;
	iterator = optionalPhase.getPhase().iterator();
    }

    /**
     * Returns an AtomicPhase object or Null in that case if the condition of
     * optionalPhase proves false.
     */
    @Override
    public AtomicPhase next() {
	if (optionalPhase.condition()) {
	    AtomicPhase atomic = (AtomicPhase) iterator.next();
	    if (iterator.hasNext() == false) {
		hasNext = false;
	    }
	    return atomic;

	}
	hasNext = false;
	return null;
    }

    /**
     * Returns true if there still exists another achievable AtomicPhase, and
     * false in the other case.
     * 
     * @return hasNext variable.
     */
    @Override
    public boolean hasNext() {
	return hasNext;
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
