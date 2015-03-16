package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.LoopPhase;

public class LoopPhaseIterator implements Iterator<BenchmarkPhase>{

	private LoopPhase loopPhase;
	private Iterator<BenchmarkPhase> iterator;
	
	public LoopPhaseIterator(LoopPhase loopPhase) {
		this.loopPhase = loopPhase;
		iterator = loopPhase.getPhase().iterator();
	}
	
	@Override
	public AtomicPhase next() {
		if (loopPhase.condition()){
			return (AtomicPhase) iterator.next();
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return loopPhase.condition();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
