package eu.mondo.sam.core.results;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Represents the final results of a BenchmarkMetric object. This class will be used during the serialization
 * process, and the variables of its will also appear in the output files. Every instance of this class
 * belongs to one BenchmarkMetric object.
 * 
 * @author Zsolt Kovari
 *
 */
public class MetricResult {

	/**
	 * Identifies the metric.
	 */
	@JsonProperty("MetricName")
	protected String metricName;

	/**
	 * Represents the measured value of a metric.
	 */
	@JsonProperty("MetricValue")
	protected String value;

	/**
	 * Returns the name of the metric.
	 * 
	 * @return metricName
	 */
	public String getName() {
		return metricName;
	}

	/**
	 * Returns the measured value of the metric.
	 * 
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Adjusts the name identifier of the metric.
	 * 
	 * @param name
	 *                recommended to be the same name, as in the BenchmarkMetric object to which this
	 *                class belongs
	 */
	public void setName(String name) {
		this.metricName = name;
	}

	/**
	 * Adjusts the value of the measurement of a BenchmarkMetric instance.
	 * 
	 * @param value
	 *                the exact value of measurement as String
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
