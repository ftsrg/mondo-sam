package eu.mondo.sam.core.phases;

import java.util.Iterator;

import eu.mondo.sam.core.phases.iterators.IterationPhaseIterator;

public class IterationPhase implements BenchmarkPhase{

	protected int maxIteration;
	protected BenchmarkPhase phase;
	
	public IterationPhase(int maxIteration){
		this.maxIteration = maxIteration;
	}
	
	@Override
	public Iterator<BenchmarkPhase> iterator() {
		return new IterationPhaseIterator(this);
	}

	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}
		
	public int getMaxIteration() {
		return maxIteration;
	}
	
	public BenchmarkPhase getPhase() {
		return phase;
	}
}
