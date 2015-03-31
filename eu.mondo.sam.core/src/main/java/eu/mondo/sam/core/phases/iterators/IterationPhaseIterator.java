package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.IterationPhase;

/**
 * Provides an access mechanism to an IterationPhase object. The latter can be
 * achieved with a limitation, restricted by the maxIteration variable, which is
 * defined in IterationPhase instance.
 * 
 * @author Zsolt Kovari
 *
 */
public class IterationPhaseIterator implements Iterator<BenchmarkPhase> {

    /**
     * Represents the maximum bound of access to the iterationPhase.
     */
    private int maxIteration;

    /**
     * Stores the current index of the iteration.
     */
    private int index;

    /**
     * Refers to an IterationPhase object.
     */
    private IterationPhase iterationPhase;

    /**
     * Refers to the iterator of the BenchmarkPhase instance which belongs to
     * the iterationPhase variable.
     */
    private Iterator<BenchmarkPhase> iterator;

    /**
     * Parameterized constructor. Makes reference to a IterationPhase object,
     * and initializes the local fields.
     * 
     * @param phase
     *            IterationPhase object with initialized fields. It must contain
     *            a BenchmarkPhase.
     */
    public IterationPhaseIterator(IterationPhase phase) {
	this.iterationPhase = phase;
	this.index = 0;
	this.maxIteration = phase.getMaxIteration();
	iterator = iterationPhase.getPhase().iterator();
    }

    /**
     * Returns an AtomicPhase object and increases the value of index, if
     * iterator variable has not another new achievable AtomicPhase object.
     * 
     * @return AtomicPhase. Can be null.
     */
    @Override
    public AtomicPhase next() {
	if (index == maxIteration) {
	    index = 0;
	}
	AtomicPhase atomic = (AtomicPhase) iterator.next();
	if (iterator.hasNext() == false) {
	    index++;
	}
	return atomic;
    }

    /**
     * Determines whether there is another achievable AtomicPhase object.
     * 
     * @return True, if index is lower than maxIteration, and false in the other
     *         case.
     */
    @Override
    public boolean hasNext() {
	if (index < maxIteration) {
	    return true;
	}
	return false;
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
