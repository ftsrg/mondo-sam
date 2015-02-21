package eu.mondo.sam.core.phases;

import java.util.LinkedList;

import eu.mondo.sam.core.phases.iterators.PhaseIterator;
import eu.mondo.sam.core.phases.iterators.SequencePhaseIterator;

public class SequencePhase implements BenchmarkPhase{

	protected LinkedList<BenchmarkPhase> phases;
//	protected SequencePhaseIterator iterator;
	
	public SequencePhase(){
		this.phases = new LinkedList<BenchmarkPhase>();
//		this.iterator = new SequencePhaseIterator(this);
	}
	
	public void addPhases(BenchmarkPhase... phases){
		for(BenchmarkPhase p:phases){
			this.phases.add(p);
		}
	}

	@Override
	public PhaseIterator getIterator() {
		return new SequencePhaseIterator(this);
	}
	
	public LinkedList<BenchmarkPhase> getPhases() {
		return phases;
	}
	
	public int getSize(){
		return phases.size();
	}
}
