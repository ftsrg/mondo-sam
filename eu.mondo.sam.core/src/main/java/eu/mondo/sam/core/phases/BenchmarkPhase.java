package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.results.PhaseResult;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BenchmarkPhase {

	@JsonProperty("PhaseName")
	protected String phaseName;

	protected List<BenchmarkMetric> metrics;
	
	public BenchmarkPhase(String name){
		metrics = new ArrayList<BenchmarkMetric>();
		this.phaseName = name;
	}
	
	public void addMetrics(BenchmarkMetric... metrics){
		if (metrics.length > 0)
			for(BenchmarkMetric m:metrics){
				if(this.metrics.contains(m) == false)
					this.metrics.add(m);
		}
	}
	
	public String getPhaseName() {
		return phaseName;
	}
	
	public List<BenchmarkMetric> getMetrics() {
		return metrics;
	}
	
	@Override
	public String toString() {
		return phaseName;
	}

	public abstract void execute(PhaseResult phaseResult) throws PhaseInterruptedException;
	
}
