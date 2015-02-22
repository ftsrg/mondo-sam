package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.phases.iterators.IterationPhaseIterator;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

public class IterationPhase implements BenchmarkPhase{

	protected int maxIteration;
	protected BenchmarkPhase phase;
	
	public IterationPhase(int maxIteration){
		this.maxIteration = maxIteration;
	}
	
	@Override
	public PhaseIterator getIterator() {
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
