package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.metrics.BenchmarkMetric;
import eu.mondo.sam.core.phases.iterators.AtomicPhaseIterator;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

import java.util.List;
import java.util.ArrayList;


public abstract class AtomicPhase implements BenchmarkPhase{
	
	protected String phaseName;
//	protected AtomicPhaseIterator iterator;
	protected List<BenchmarkMetric> metrics;
	
	public AtomicPhase(String name){
		metrics = new ArrayList<BenchmarkMetric>();
		this.phaseName = name;
//		iterator = new AtomicPhaseIterator(this);
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
	public PhaseIterator getIterator() {
		return new AtomicPhaseIterator(this);
	}
	
}
