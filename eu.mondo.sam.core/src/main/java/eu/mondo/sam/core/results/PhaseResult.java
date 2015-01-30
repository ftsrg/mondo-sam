package eu.mondo.sam.core.results;

import eu.mondo.sam.core.metric.BenchmarkMetric;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhaseResult {

	@JsonProperty("PhaseName")
	private String phaseName;
	
	@JsonProperty("Metrics")
	private List<BenchmarkMetric> metrics;
	
	
	public PhaseResult(){
		this.metrics = new ArrayList<BenchmarkMetric>();
	}
	
	public void addMetrics(BenchmarkMetric... metrics){
		for(BenchmarkMetric m : metrics){
			this.metrics.add(m);
		}
	}
	
	public boolean isMeasuredPhase(){
		for(BenchmarkMetric m : metrics){
			if(m.isMeasured() == true)
				return true;
		}
		return false;
	}
	
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	
}
