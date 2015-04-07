package eu.mondo.sam.core.results;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import eu.mondo.sam.core.metrics.BenchmarkMetric;

/**
 * Contains the measured metrics as MetricResult objects of a phase
 * implementation. It cannot consist of null valued metrics. This class will be
 * used during the serialization process, such as the attributes of its will
 * appear in the output files too.
 * 
 * @author Zsolt Kovari
 *
 */
public class PhaseResult {

    /**
     * Represents a name identifier of the phase implementation.
     */
    @JsonProperty("PhaseName")
    private String phaseName;

    /**
     * Defines an unambiguous order of executions of phases. It is the
     * recommended manner, that every instance of this class has a unique
     * sequence identifier.
     */
    @JsonProperty("Sequence")
    private String sequence;

    /**
     * Contains MetricResult objects as a list.
     */
    @JsonProperty("Metrics")
    private List<MetricResult> metrics;

    /**
     * Instantiates a metrics list.
     */
    public PhaseResult() {
	this.metrics = new ArrayList<MetricResult>();
    }

    /**
     * Adds BenchmarkMetric objects to the metrics list. Every one of them will
     * be copied as a new MetricResult instance with the attributes provided by
     * the original metric such as the name and the measured value.
     * 
     * @param metrics
     *            One or more measured BenchmarkMetric objects as an array.
     * 
     * @throws NullPointerException
     *             If a metric object has null value.
     */
    public void addMetrics(BenchmarkMetric... metrics) {
	for (BenchmarkMetric m : metrics) {
	    MetricResult result = new MetricResult();
	    result.setName(m.getMetricName());
	    String value = m.getValue();
	    if (value == null) {
		throw new NullPointerException(
			"Metric's value is not initialized");
	    }
	    result.setValue(value);

	    this.metrics.add(result);
	}
    }

    /**
     * Returns the size of the list contains MetricResult objects.
     * 
     * @return size of metrics. Cannot be null.
     */
    public int numberOfMetrics() {
	return metrics.size();
    }

    /**
     * Adjusts the name identifier of phase.
     * 
     * @param phaseName
     *            a name of the phase.
     */
    public void setPhaseName(String phaseName) {
	this.phaseName = phaseName;
    }

    /**
     * Adjusts the sequence number.
     * 
     * @param sequence
     *            the place of the execution order of phases.
     */
    public void setSequence(int sequence) {
	this.sequence = Integer.toString(sequence);
    }

}
