package eu.mondo.sam.core.metrics;

/**
 * Defines an implementation for providing scalar values. The inherited getValue method provides the exact
 * value of the metric.
 * 
 * @author Zsolt Kovari
 *
 */
public class ScalarMetric extends BenchmarkMetric {

	/**
	 * Represents the exact value of metric, by default is 0.
	 */
	protected long value;

	/**
	 * Initializes the metricName variable after the given parameter.
	 * 
	 * @param name
	 *                Name of the current BenchmarkMetric implementation.
	 */
	public ScalarMetric(String name) {
		super(name);
	}

	/**
	 * Provides the exact value of this class.
	 * 
	 * @return the scalar value as a String.
	 */
	@Override
	public String getValue() {
		return Long.toString(value);
	}

	/**
	 * Adjusts the value of this class.
	 * 
	 * @param value
	 *                the new value of the scalar metric. Must be long.
	 */
	public void setValue(long value) {
		this.value = value;
	}
}
