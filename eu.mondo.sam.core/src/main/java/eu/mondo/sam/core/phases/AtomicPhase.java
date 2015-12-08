package eu.mondo.sam.core.phases;

import java.io.IOException;
import java.util.Iterator;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.BenchmarkMetric;
import eu.mondo.sam.core.phases.iterators.AtomicPhaseIterator;
import eu.mondo.sam.core.results.PhaseResult;

/**
 * Represents an implementation of BenchmarkPhase. Symbolize the atomic unit among phases, as does not contain other nested one. Declare an
 * abstract execute method which should include the main operations over the benchmark model. The subclasses' responsibility to define it
 * with the certain processes. Also provides an AtomicPhaseIterator via which the instance of this class is achievable.
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class AtomicPhase implements BenchmarkPhase {

	/**
	 * The identifier of AtomicPhase. The value of this variable will be showed in the benchmark results too.
	 */
	protected String phaseName;

	/**
	 * Parameterized constructor. Adjusts the phaseName identifier. It is recommended to use unique names for every AtomicPhase object.
	 * 
	 * @param phaseName
	 *            Identifier.
	 */
	public AtomicPhase(final String phaseName) {
		this.phaseName = phaseName;
	}

	/**
	 * Returns the phase identifier.
	 * 
	 * @return phaseName. Cannot be null.
	 */
	public String getPhaseName() {
		return phaseName;
	}

	/**
	 * Overrides the Object's method.
	 * 
	 * @return The AtomicPhase identifier, the phasename variable.
	 */
	@Override
	public String toString() {
		return phaseName;
	}

	/**
	 * Executes the operations which belongs to the AtomicPhase. Communicates with other AtomicPhase operations via the DataToken object.
	 * Every significant Metric result should be attached to the PhaseResult parameter as BenchmarkMetric instance. The results of
	 * measurements will be published only when the PhaseResult object contains the certain Metrics.
	 * 
	 * @see PhaseResult
	 * @see BenchmarkMetric
	 * 
	 * @param token
	 *            Represents a communication unit between this and other phases.
	 * @param result
	 *            PhaseResult object. In the case of publishing metrics attach BenchmarkMetric objects to it.
	 * @throws IOException
	 */
	public abstract void execute(DataToken token, PhaseResult phaseResult) throws IOException;

	/**
	 * Returns a new AtomicPhaseIterator instance, which has a reference to this object and also can control the access to the field of this
	 * class.
	 * 
	 * @return new AtomicPhaseIterator instance. Cannot be null.
	 */
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new AtomicPhaseIterator(this);
	}

}
