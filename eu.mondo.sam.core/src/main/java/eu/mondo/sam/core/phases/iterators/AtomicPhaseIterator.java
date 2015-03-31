package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;

/**
 * Provides an access mechanism to an AtomicPhase object.
 * 
 * @author Zsolt Kovari
 *
 */
public class AtomicPhaseIterator implements Iterator<BenchmarkPhase> {

    /**
     * Refers to an AtomicPhase object.
     */
    private AtomicPhase atomic;

    /**
     * Determines whether the atomic object has been already accessed. In that
     * case, the value is false. By default it is true.
     */
    private boolean hasNext;

    /**
     * Parameterized constructor. Makes reference to an AtomicPhase object, and
     * initializes the hasNext variable with the value of true.
     * 
     * @param atomicPhase
     *            A subclass of AtomicPhase.
     */
    public AtomicPhaseIterator(AtomicPhase atomicPhase) {
	this.atomic = atomicPhase;
	this.hasNext = true;
    }

    /**
     * Returns the atomic object and sets the hasNext variable to false.
     * 
     * @return AtomicPhase object. Cannot be null.
     */
    @Override
    public AtomicPhase next() {
	this.hasNext = false;
	return atomic;
    }

    /**
     * Returns true if the AtomicPhase object has not been accessed yet, and
     * false in the other case.
     * 
     * @return the hasNext variable.
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
