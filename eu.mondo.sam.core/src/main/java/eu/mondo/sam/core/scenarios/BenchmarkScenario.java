package eu.mondo.sam.core.scenarios;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.CaseDescriptor;


public abstract class BenchmarkScenario {

	/**
	 * An iterator of the rootPhase .
	 */
	private Iterator<BenchmarkPhase> iterator;
	
	/**
	 * Represents the root of an arbitrary phase hierarchy where the leafs defines the AtomicPhase instances.
	 */
	protected BenchmarkPhase rootPhase;
	
	protected int size;
	
	protected String tool;
	
	protected String caseName;
	
	protected int runIndex;
	
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
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public String getCaseName() {
		return caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public int getRunIndex() {
		return runIndex;
	}

	public void setRunIndex(int runIndex) {
		this.runIndex = runIndex;
	}
	
	
}
