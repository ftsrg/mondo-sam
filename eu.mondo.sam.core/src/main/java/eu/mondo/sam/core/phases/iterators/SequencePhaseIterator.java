package eu.mondo.sam.core.phases.iterators;

import java.util.Iterator;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.SequencePhase;

public class SequencePhaseIterator implements Iterator<BenchmarkPhase>{

	private int index;
	private SequencePhase sequencePhase;
	private Iterator<BenchmarkPhase> iterator;
	
	public SequencePhaseIterator(SequencePhase phase){
		this.sequencePhase = phase;
		this.iterator = sequencePhase.getPhases().getFirst().iterator();
	}
	
	@Override
	public AtomicPhase next() {
		int size = sequencePhase.getSize();
		// if returned the last AtomicPhase before
		if (index == size){
			index = 0;
			iterator = sequencePhase.getPhases().getFirst().iterator();
		}
		
		AtomicPhase atomic = (AtomicPhase) iterator.next();
		if (iterator.hasNext() == false){
			index++;
			if (index < size){
				iterator = sequencePhase.getPhases().get(index).iterator();
			}
		}
		return atomic;
//		}
	}

	@Override
	public boolean hasNext() {
		int size = sequencePhase.getSize();
		if (index < size){
			return true;
		}
		return false;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
