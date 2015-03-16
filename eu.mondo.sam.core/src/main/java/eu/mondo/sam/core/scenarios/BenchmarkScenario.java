package eu.mondo.sam.core.scenarios;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.CaseDescriptor;


public abstract class BenchmarkScenario {

	/**
	 * An iterator of the root BenchmarkPhase.
	 */
	private Iterator<BenchmarkPhase> iterator;
	
	/**
	 * Represents the root of an arbitrary phase hierarchy where the leafs defines the AtomicPhase instances.
	 */
	protected BenchmarkPhase rootPhase;
	
	/**
	 * Builds an arbitrary phase hierarchy where the leafs represent the AtomicPhase objects. 
	 */
	public abstract void build();
	
	/**
	 * Instantiate a CaseDescriptor object.
	 * 
	 * @see CaseDescriptor
	 * 
	 * @return CaseDescriptor with every one of its field being initialized.
	 */
	public abstract CaseDescriptor getCaseDescriptor();
	
	public boolean hasNextPhase(){
		if (iterator == null){
			iterator = rootPhase.iterator();
		}
		return iterator.hasNext();
	}
	
	public AtomicPhase getNextPhase(){
		if (iterator == null){
			iterator = rootPhase.iterator();
		}
		AtomicPhase phase = (AtomicPhase) iterator.next();
		return phase;
	}
}
