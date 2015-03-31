package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.SequencePhase;

/**
 * Provides an access mechanism to a SequencePhase object.
 * 
 * @author Zsolt Kovari
 *
 */
public class SequencePhaseIterator implements Iterator<BenchmarkPhase> {

    /**
     * Equals with the current index of the phases list, which belongs to the
     * SequencePhase object.
     */
    private int index;

    /**
     * Refers to a SequencePhase object.
     */
    private SequencePhase sequencePhase;

    /**
     * Refers to the iterator of the current BenchmarkPhase from the list, which
     * belongs to the SequencePhase object.
     */
    private Iterator<BenchmarkPhase> iterator;

    /**
     * Parameterized constructor, which sets the SequencePhase reference and
     * instantiate a iterator field. The latter refers to the first phase's
     * iterator from list in the SequencePhase instance.
     * 
     * @param phase
     *            SequencePhase object with initialized fields. It mustn't
     *            contain an empty list of phases.
     */
    public SequencePhaseIterator(SequencePhase phase) {
	this.sequencePhase = phase;
	this.iterator = sequencePhase.getPhases().getFirst().iterator();
    }

    /**
     * Returns an AtomicPhase object and increases the index variable. If this
     * is invoked again after the last AtomicPhase was returned, starts over the
     * iteration from the first element.
     * 
     * @return AtomicPhase object, can be null.
     */
    @Override
    public AtomicPhase next() {
	int size = sequencePhase.getSize();
	// if returned the last AtomicPhase before
	if (index == size) {
	    index = 0;
	    iterator = sequencePhase.getPhases().getFirst().iterator();
	}

	AtomicPhase atomic = (AtomicPhase) iterator.next();
	if (iterator.hasNext() == false) {
	    index++;
	    if (index < size) {
		iterator = sequencePhase.getPhases().get(index).iterator();
	    }
	}
	return atomic;
    }

    /**
     * Decides whether there are more achievable AtomicPhase objects or not.
     * 
     * @return True, if the current index is lower than the size of list in the
     *         SequencePhase object. In the other case, returns False.
     */
    @Override
    public boolean hasNext() {
	int size = sequencePhase.getSize();
	if (index < size) {
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
