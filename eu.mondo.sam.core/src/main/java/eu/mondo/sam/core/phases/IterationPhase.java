package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.phases.iterators.IterationPhaseIterator;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

public class IterationPhase implements BenchmarkPhase{

	protected int iteration;
	protected int maxIteration;
//	protected IterationPhaseIterator iterator;
	protected BenchmarkPhase phase;
	
	public IterationPhase(int initValue, int maxValue){
		this.iteration = initValue;
		this.maxIteration = maxValue;
//		iterator = new IterationPhaseIterator(this);
	}
	
	@Override
	public PhaseIterator getIterator() {
		return new IterationPhaseIterator(this);
	}

	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}
	
	public int getIteration() {
		return iteration;
	}
	
	public int getMaxIteration() {
		return maxIteration;
	}
	
	public BenchmarkPhase getPhase() {
		return phase;
	}
}
