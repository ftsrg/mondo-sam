package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.IterationPhase;

public class IterationPhaseIterator implements PhaseIterator{

	private int maxIteration;
	private int iteration;
	private IterationPhase iterationPhase;
	private PhaseIterator iterator;
	
	public IterationPhaseIterator(IterationPhase phase){
		this.iterationPhase = phase;
		this.iteration = 0;
		this.maxIteration = phase.getMaxIteration();
		iterator = iterationPhase.getPhase().getIterator();
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (iteration == maxIteration){
			iteration = 0;
		}
		AtomicPhase atomic = iterator.nextPhase();
		if (iterator.hasNext() == false){
			iteration++;
		}
		return atomic;
	}

	@Override
	public boolean hasNext() {
		if (iteration < maxIteration){
			return true;
		}
		return false;
	}

}
