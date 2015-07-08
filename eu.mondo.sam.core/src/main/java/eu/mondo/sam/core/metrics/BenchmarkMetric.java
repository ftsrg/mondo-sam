package eu.mondo.sam.core.metrics;

/**
 * Represents the metrics of performance evaluation. An abstract class, the
 * subclasses' responsibility to define the getValue method which provides the
 * exact value of the measured metric.
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class BenchmarkMetric {

	/**
	 * Represents a name of the current BenchmarkMetric object which
	 * describes well the type or dimension of the metric.
	 */
	protected String metricName;

	/**
	 * Initializes the metricName variable after the given parameter.
	 * 
	 * @param name
	 *                Name of the current BenchmarkMetric implementation.
	 */
	public BenchmarkMetric(String name) {
		this.metricName = name;
	}

	public BenchmarkMetric() {

	}

	/**
	 * Returns the name of the BenchmarkMetric instance,
	 * 
	 * @return metricName. Cannot be null.
	 */
	public String getMetricName() {
		return metricName;
	}

	/**
	 * Adjusts metric name.
	 * 
	 * @param metricName
	 */
	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	/**
	 * Overrides the toString method of Object.
	 * 
	 * @return the metricName and the exact value.
	 */
	@Override
	public String toString() {
		return metricName + " " + getValue();
	}

	/**
	 * Returns the exact measured value of the BenchmarkMetric instance as a
	 * String.
	 * 
	 * @return the value of metric
	 */
	public abstract String getValue();

}
