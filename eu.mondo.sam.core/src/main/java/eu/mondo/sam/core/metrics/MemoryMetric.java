package eu.mondo.sam.core.metrics;

/**
 * Defines an implementation for measuring memory. The inherited getValue method provides the exact value of
 * the metric. The dimension of the value is represented in kilobytes.
 * 
 * @author Zsolt Kovari
 *
 */
public class MemoryMetric extends BenchmarkMetric {

	/**
	 * Represents the measured value of used memory.
	 */
	protected long memory;

	/**
	 * Represents the number of calls of garbage collection before measure memory. Default value is 0.
	 */
	private static int numberOfGC = 0;

	/**
	 * Initializes the metricName variable after the given parameter.
	 * 
	 * @param name
	 *                Name of the current BenchmarkMetric implementation.
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
	 * Calls GC as many times as numberOfGC is adjusted, then measures the used memory.
	 */
	public void measure() {
		for (int i = 0; i < MemoryMetric.numberOfGC; i++) {
			Runtime.getRuntime().gc();
		}

		memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}

	/**
	 * Returns the number of calls of garbage collection.
	 * 
	 * @return
	 */
	public static int getNumberOfGC() {
		return numberOfGC;
	}

	/**
	 * Adjusts the number of invocations of garbage collection that is called before the measurement.
	 * 
	 * @param numberOfGC
	 */
	public static void setNumberOfGC(int numberOfGC) {
		MemoryMetric.numberOfGC = numberOfGC;
	}

}
