package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.IterationPhase;

public class IterationPhaseIterator implements PhaseIterator{

	private int maxIteration;
	private int iteration;
	private int initValue;
	private IterationPhase iterationPhase;
	private PhaseIterator iterator;
	
	public IterationPhaseIterator(IterationPhase phase){
		this.iterationPhase = phase;
		this.iteration = phase.getIteration();
		this.initValue = iteration;
		this.maxIteration = phase.getMaxIteration();
		iterator = iterationPhase.getPhase().getIterator();
	}
	
	@Override
	public AtomicPhase nextPhase() {
		if (iteration == maxIteration){
			iteration = initValue;
		}
//		PhaseIterator iterator = iterationPhase.getPhase().getIterator();
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
