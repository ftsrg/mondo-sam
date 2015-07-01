package eu.mondo.sam.core.phases;

import java.util.Iterator;
import java.util.LinkedList;

import eu.mondo.sam.core.phases.iterators.SequencePhaseIterator;

/**
 * Contains arbitrary number of BenchmarkPhase objects in a list. Also provides
 * a SequenceIterator which is able to iterate the phases.
 * 
 * @author Zsolt Kovari
 *
 */
public class SequencePhase implements BenchmarkPhase {

	/**
	 * Contains BenchmarkPhase instances as a list.
	 */
	protected LinkedList<BenchmarkPhase> phases;

	/**
	 * Instantiates the LinkedList which consist of BenchmarkPhase objects.
	 */
	public SequencePhase() {
		this.phases = new LinkedList<BenchmarkPhase>();
	}

	/**
	 * Adds BenchmarkPhase objects to the LinkedList, phases. More than one
	 * parameters can be given at the same time via varargs.
	 * 
	 * @param phases
	 *                Arbitrary number of BenchmarkPhase or an array.
	 */
	public void addPhases(BenchmarkPhase... phases) {
		for (BenchmarkPhase p : phases) {
			this.phases.add(p);
		}
	}

	/**
	 * Returns a new SequencePhaseIterator instance, which has a reference
	 * to this object and also can control the access to the phases list.
	 * 
	 * @see SequencePhaseIterator
	 */
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new SequencePhaseIterator(this);
	}

	/**
	 * Returns every BenchmarkPhase which is contained by this object.
	 * 
	 * @return the phases attribute. Cannot be null.
	 */
	public LinkedList<BenchmarkPhase> getPhases() {
		return phases;
	}

	/**
	 * Returns the size of the phases list.
	 * 
	 * @return The size of the phases list. Cannot be null.
	 */
	public int getSize() {
		return phases.size();
	}

}
