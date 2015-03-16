package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.OptionalPhase;

public class OptionalPhaseIterator implements Iterator<BenchmarkPhase>{

	private OptionalPhase optionalPhase;
	private Iterator<BenchmarkPhase> iterator;
	private boolean hasNext;
	
	
	public OptionalPhaseIterator(OptionalPhase optionalPhase){
		this.optionalPhase = optionalPhase;
		this.hasNext = true;
		iterator = optionalPhase.getPhase().iterator();
	}
	
	@Override
	public AtomicPhase next() {
		if (optionalPhase.condition()){
			AtomicPhase atomic = (AtomicPhase) iterator.next();
			if (iterator.hasNext() == false){
				hasNext = false;
			}
			return atomic;
			
		}
		hasNext = false;
		return null;
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
