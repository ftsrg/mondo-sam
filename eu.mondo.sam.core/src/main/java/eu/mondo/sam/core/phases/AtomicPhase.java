package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.metric.BenchmarkMetric;

import java.util.List;
import java.util.ArrayList;


public abstract class AtomicPhase implements BenchmarkPhase{
	
	protected String phaseName;

	protected List<BenchmarkMetric> metrics;
	
	public AtomicPhase(String name){
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

	public abstract void execute();
	
	@Override
	public BenchmarkPhase getPhase() {
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return false;
	}
	
	@Override
	public void remove() {
		return;
	}
	
}
