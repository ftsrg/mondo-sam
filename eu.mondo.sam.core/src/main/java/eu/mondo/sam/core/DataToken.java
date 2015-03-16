package eu.mondo.sam.core;

import eu.mondo.sam.core.phases.BenchmarkPhase;

/**
 * Provides the main communication unit between benchmark phases.
 * 
 * @author Zsolt Kovari
 * @see BenchmarkPhase
 */
public interface DataToken {
	
	/**
	 * An initialization method.
	 */
	public void init();
	
	/**
	 * Disposes the resources used by DataToken.
	 */
	public void destroy();
}
