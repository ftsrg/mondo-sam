package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.IterationPhase;

public class IterationPhaseIterator implements Iterator<BenchmarkPhase>{

	private int maxIteration;
	private int iteration;
	private IterationPhase iterationPhase;
	private Iterator<BenchmarkPhase> iterator;
	
	public IterationPhaseIterator(IterationPhase phase){
		this.iterationPhase = phase;
		this.iteration = 0;
		this.maxIteration = phase.getMaxIteration();
		iterator = iterationPhase.getPhase().iterator();
	}
	
	@Override
	public AtomicPhase next() {
		if (iteration == maxIteration){
			iteration = 0;
		}
		AtomicPhase atomic = (AtomicPhase) iterator.next();
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

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}

}
