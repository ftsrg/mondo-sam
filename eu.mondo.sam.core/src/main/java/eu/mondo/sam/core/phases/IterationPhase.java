package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.IterationPhaseIterator;

/**
 * Contains a BenchmarkPhase object and also provides an IterationPhaseIterator
 * which is able to control the access to the fields of this class. The maximum
 * access is defined by the maxIteration variable.
 * 
 * @author Zsolt Kovari
 *
 */
public class IterationPhase implements BenchmarkPhase {

    /**
     * Represents a maximum bound for the IterationPhaseIterator by restricting
     * the access to the phase field of this class.
     */
    protected int maxIteration;

    /**
     * A BenchmarkPhase implementation.
     */
    protected BenchmarkPhase phase;

    /**
     * Parameterized constructor. The value of maxIteration attribute must be
     * given.
     * 
     * @param maxIteration
     *            Defines the maximum number of access to the phase field.
     */
    public IterationPhase(int maxIteration) {
	this.maxIteration = maxIteration;
    }

    public IterationPhase(int maxIteration, BenchmarkPhase phase) {
	this.maxIteration = maxIteration;
	this.phase = phase;
    }

    /**
     * Returns a new IterationPhaseIterator instance, which has a reference to
     * this object and also can control the access to the field of this class.
     * 
     * @return new LoopPhaseIterator instance. Cannot be null.
     */
    @Override
    public Iterator<BenchmarkPhase> iterator() {
	return new IterationPhaseIterator(this);
    }

    /**
     * Sets the phase attribute.
     * 
     * @param phase
     *            A realization of BenchmarkPhase interface.
     */
    public void setPhase(BenchmarkPhase phase) {
	this.phase = phase;
    }

    /**
     * Returns the maxIteration value.
     * 
     * @return maxIteration. Cannot be null and the default value is 0.
     */
    public int getMaxIteration() {
	return maxIteration;
    }

    /**
     * Returns the phase instance.
     * 
     * @return a BenchmarkPhase implementation.
     */
    public BenchmarkPhase getPhase() {
	return phase;
    }
}
