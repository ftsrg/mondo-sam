package eu.mondo.sam.core.results;
import eu.mondo.sam.core.metrics.BenchmarkMetric;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhaseResult {

	@JsonProperty("PhaseName")
	private String phaseName;
	
	@JsonProperty("Sequence")
	private String sequence;
	
	@JsonProperty("Metrics")
	private List<MetricResult> metrics;
	
	
	public PhaseResult(){
		this.metrics = new ArrayList<MetricResult>();
	}
	
	/**
	 * 
	 * @param metrics
	 */
	public void addMetrics(BenchmarkMetric... metrics){
		for(BenchmarkMetric m : metrics){
			MetricResult result = new MetricResult();
			result.setName(m.getMetricName());
			String value = m.getValue();
			if (value == null)
				throw new NullPointerException("Metric's value is not initialized");
			result.setValue(value);
			this.metrics.add(result);
		}
	}
	
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	
	public void setSequence(int iteration){
		this.sequence = Integer.toString(iteration);
	}
	
}
