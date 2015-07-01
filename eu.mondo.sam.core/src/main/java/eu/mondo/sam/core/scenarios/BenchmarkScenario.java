package eu.mondo.sam.core.scenarios;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.CaseDescriptor;

/**
 * Contains an arbitrary hierarchy of BenchmarkPhase objects where the leafs
 * represent AtomicPhase instances. The phases can be achieved one by one via
 * the getNextPhase method.
 * 
 * Also provides a CaseDescriptor which consists of the most important
 * parameters about benchmark.
 * 
 * @see CaseDescriptor
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class BenchmarkScenario {

	/**
	 * An iterator of the rootPhase via which can access the AtomicPhase
	 * objects from the hierarchy.
	 */
	private Iterator<BenchmarkPhase> iterator;

	/**
	 * Represents the root of an arbitrary phase hierarchy where the leafs
	 * defines the AtomicPhase instances.
	 */
	protected BenchmarkPhase rootPhase;

	/**
	 * Specifies the size of the used model during benchmarking. It is
	 * recommended to attach the same value to the CaseDescriptor.
	 */
	protected int size;

	/**
	 * Specifies the measured tool during benchmarking. It is recommended to
	 * attach the same value to the CaseDescriptor.
	 */
	protected String tool;

	/**
	 * Specifies the name of the current case during benchmarking. It is
	 * recommended to attach the same value to the CaseDescriptor.
	 */
	protected String caseName;

	/**
	 * Specifies an index for the benchmark. The measurements with the same
	 * configurations have to differ by the runIndex value. The default
	 * value is 1. It is recommended to attach the same value to the
	 * CaseDescriptor.
	 */
	protected int runIndex = 1;

	/**
	 * Builds an arbitrary phase hierarchy where the leafs represent the
	 * AtomicPhase objects.
	 */
	public abstract void build();

	/**
	 * Instantiates a CaseDescriptor object.
	 * 
	 * @see CaseDescriptor
	 * 
	 * @return CaseDescriptor with every one of its field being initialized.
	 */
	public abstract CaseDescriptor getCaseDescriptor();

	/**
	 * Determines whether there is another achievable AtomicPhase or not.
	 * 
	 * @return The returned value of the hasNext method of rootIterator.
	 */
	public boolean hasNextPhase() {
		if (iterator == null) {
			iterator = rootPhase.iterator();
		}
		return iterator.hasNext();
	}

	/**
	 * Returns the following AtomicPhase.
	 * 
	 * @return AtomicPhase object. Can be null.
	 */
	public AtomicPhase getNextPhase() {
		if (iterator == null) {
			iterator = rootPhase.iterator();
		}
		AtomicPhase phase = (AtomicPhase) iterator.next();
		return phase;
	}

	/**
	 * Receives a new iterator object from the rootPhase.
	 */
	public void resetIterator() {
		iterator = rootPhase.iterator();
	}

	/**
	 * Returns the value of the size variable.
	 * 
	 * @return size. Cannot be null.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Adjusts the size parameter after the given parameter.
	 * 
	 * @param size
	 *                The value of the used model's size-
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Returns the value of the tool variable.
	 * 
	 * @return tool. Cannot be null.
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * Sets the tool parameter after the given parameter.
	 * 
	 * @param tool
	 *                The name of the measured tool.
	 */
	public void setTool(String tool) {
		this.tool = tool;
	}

	/**
	 * Returns the value of the caseName variable.
	 * 
	 * @return caseName. Cannot be null.
	 */
	public String getCaseName() {
		return caseName;
	}

	/**
	 * Adjusts the value of the caseName variable.
	 * 
	 * @param caseName
	 *                Name of the used case during the benchmarking.
	 */
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	/**
	 * Returns the value of the runIndex variable.
	 * 
	 * @return runIndex. Cannot be null.
	 */
	public int getRunIndex() {
		return runIndex;
	}

	/**
	 * Adjusts the value of runIndex.
	 * 
	 * @param runIndex
	 *                An index of the currently running benchmark.
	 *                Recommended to be unique in the case if the benchmark
	 *                configuration parameters are the same.
	 */
	public void setRunIndex(int runIndex) {
		this.runIndex = runIndex;
	}

}
