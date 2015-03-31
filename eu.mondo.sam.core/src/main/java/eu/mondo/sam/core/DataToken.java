package eu.mondo.sam.core;

import eu.mondo.sam.core.phases.BenchmarkPhase;

/**
 * Provides the main communication unit between benchmark phases. Every phase
 * can share their information to each other via a DataToken object.
 * 
 * @author Zsolt Kovari
 * 
 * @see BenchmarkPhase
 */
public interface DataToken {

    /**
     * Initializes the necessary resources.
     */
    public void init();

    /**
     * Disposes the resources which are used by the DataToken.
     */
    public void destroy();
}
