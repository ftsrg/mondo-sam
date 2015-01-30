package eu.mondo.sam.core.results;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.mondo.sam.core.cases.BenchmarkCase;

public class BenchmarkResult {

	//@JsonProperty("Config")
	//private BenchmarkConfig benchmarkConfig;
	
	/*@JsonProperty("Metrics")
	private List<BenchmarkMetric> metrics;
	*/
	@JsonProperty("Case")
	private BenchmarkCase benchmarkCase;
	
	@JsonProperty("PhaseResults")
	private List<PhaseResult> phaseResults;
	
	public BenchmarkResult(){
		//metrics = new ArrayList<BenchmarkMetric>();
		phaseResults = new ArrayList<PhaseResult>();
	}
	
	public void setBenchmarkCase(BenchmarkCase benchmarkCase) {
		this.benchmarkCase = benchmarkCase;
	}
	
	public void storeResults(PhaseResult result){
		if (result.isMeasuredPhase() == true)
			this.phaseResults.add(result);
	}
	
	public void publishResults(){
		ResultSerializer.serializeToJson(this);
	}
	
	/*public void storeMetric(BenchmarkMetric m) throws CloneNotSupportedException{
		//BenchmarkMetric metric = new BenchmarkMetric(m.getMetricName());
		//metric.setValue(m.getValue());
		System.out.println("Before clone: " + m.getValue());
		BenchmarkMetric metric = m.clone();
		System.out.println("After clone: " + metric.getValue());
		metrics.add(metric);
	}*/
	
	
	
}
