package eu.mondo.sam.core.phases.iterators;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.SequencePhase;

public class SequencePhaseIterator implements PhaseIterator{

	private int index;
	private SequencePhase sequencePhase;
	private PhaseIterator iterator;
	
	public SequencePhaseIterator(SequencePhase phase){
		this.sequencePhase = phase;
		this.iterator = sequencePhase.getPhases().getFirst().getIterator();
	}
	
	@Override
	public AtomicPhase nextPhase() {
		int size = sequencePhase.getSize();
		// if returned the last AtomicPhase before
		if (index == size){
			index = 0;
			iterator = sequencePhase.getPhases().getFirst().getIterator();
		}
		
		AtomicPhase atomic = iterator.nextPhase();
		if (iterator.hasNext() == false){
			index++;
			if (index < size){
				iterator = sequencePhase.getPhases().get(index).getIterator();
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

}
