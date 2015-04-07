package eu.mondo.sam.core.metrics;

/**
 * Defines an implementation for measuring memory. The inherited getValue method
 * provides the exact value of the metric. The dimension of the value is
 * represented in kilobytes.
 * 
 * @author Zsolt Kovari
 *
 */
public class MemoryMetric extends BenchmarkMetric {

    /**
     * Represents the measured value of used memory.
     */
    private long memory;

    /**
     * Initializes the metricName variable after the given parameter.
     * 
     * @param name
     *            Name of the current BenchmarkMetric implementation.
     */
    public MemoryMetric(String name) {
	super(name);
    }

    /**
     * Provides the exact value of measurement.
     * 
     * @return the measured memory as a String.
     */
    @Override
    public String getValue() {
	return Long.toString(memory);
    }

    /**
     * Measures the used memory.
     */
    public void measure() {
	memory = Runtime.getRuntime().totalMemory()
		- Runtime.getRuntime().freeMemory();
    }

}
