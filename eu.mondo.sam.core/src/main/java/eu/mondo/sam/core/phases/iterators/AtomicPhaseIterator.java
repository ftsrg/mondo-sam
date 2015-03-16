package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;

public class AtomicPhaseIterator implements Iterator<BenchmarkPhase>{

	private AtomicPhase atomic;
	private volatile boolean hasNext;
	
	public AtomicPhaseIterator(AtomicPhase atomicPhase){
		this.atomic = atomicPhase;
		this.hasNext = true;
	}
	
	@Override
	public AtomicPhase next() {
		this.hasNext = false;
		return atomic;
	}

	@Override
	public boolean hasNext() {
		return hasNext;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
