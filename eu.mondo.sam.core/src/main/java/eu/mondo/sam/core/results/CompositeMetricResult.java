package eu.mondo.sam.core.results;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties({ "MetricValue", "MetricName" })
public class CompositeMetricResult extends MetricResult {

	@JsonProperty("CompositeName")
	protected String name;

	@JsonProperty("NestedMetrics")
	protected ArrayList<MetricResult> metrics;

	public CompositeMetricResult() {
		metrics = new ArrayList<>();
	}

	public boolean add(MetricResult e) {
		return metrics.add(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<MetricResult> getMetrics() {
		return metrics;
	}

	public void setMetrics(ArrayList<MetricResult> metrics) {
		this.metrics = metrics;
	}

}
