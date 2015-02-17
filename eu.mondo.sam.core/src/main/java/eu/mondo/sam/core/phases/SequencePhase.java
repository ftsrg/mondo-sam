package eu.mondo.sam.core.phases;

import java.util.LinkedList;

public class SequencePhase implements BenchmarkPhase{

	protected LinkedList<BenchmarkPhase> phases;
	
	public SequencePhase(){
		phases = new LinkedList<BenchmarkPhase>();
	}
	
	@Override
	public BenchmarkPhase nextPhase() {
		if (this.phases.isEmpty() == false)
			return phases.poll().nextPhase();
		return null;
	}
	
	@Override
	public boolean hasNext() {
		System.out.println("Seq hasnext");
		if (this.phases.isEmpty() == false)
			return true;
		return false;
	}
	
	public void addPhases(BenchmarkPhase... phases){
		for(BenchmarkPhase p:phases){
			this.phases.add(p);
		}
	}



}
