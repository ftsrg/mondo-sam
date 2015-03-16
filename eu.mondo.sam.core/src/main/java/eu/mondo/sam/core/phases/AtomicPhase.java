package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.BenchmarkMetric;
import eu.mondo.sam.core.phases.iterators.AtomicPhaseIterator;
import eu.mondo.sam.core.results.PhaseResult;

public abstract class AtomicPhase implements BenchmarkPhase{
	
	/**
	 * The identifier of AtomicPhase. This variable will be showed in the benchmark results too.
	 */
	protected String phaseName;
	
	public AtomicPhase(String phaseName){
		this.phaseName = phaseName;
	}
	
	public String getPhaseName() {
		return phaseName;
	}
	
	/**
	 * @return The AtomicPhase identifier, the phasename variable.
	 */
	@Override
	public String toString() {
		return phaseName;
	}

	/**
	 * Executes the operations which belongs to the AtomicPhase. Communicates with other AtomicPhase operations
	 * via the DataToken object. Every significant Metric result should be attached to the PhaseResult 
	 * parameter as BenchmarkMetric instance. 
	 * The results of measurements will be published only when the PhaseResult object possess the certain Metrics.
	 * 
	 *  @see PhaseResult
	 *  @see BenchmarkMetric
	 * 
	 * @param token Represents a communication unit between this and other phases.
	 * @param result PhaseResult object. In the case of publishing metrics attach BenchmarkMetric objects to it.  
	 */
	public abstract void execute(DataToken token, PhaseResult result);
	
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new AtomicPhaseIterator(this);
	}
	
}
