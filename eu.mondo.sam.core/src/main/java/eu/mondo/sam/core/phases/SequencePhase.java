package eu.mondo.sam.core.phases;

import java.util.LinkedList;

public class SequencePhase implements BenchmarkPhase{

	protected LinkedList<BenchmarkPhase> phases;
	private int index;
	
	public SequencePhase(){
		this.phases = new LinkedList<BenchmarkPhase>();
		this.index = 0;
	}
	
	@Override
	public BenchmarkPhase getPhase() {
		boolean increase = false;
		boolean init = false;
		if (this.index < this.phases.size()){
			if (this.phases.get(index).hasNext() == false){
				if (this.index < (this.phases.size()-1) ){
					increase = true;
				}
				else
					init = true;
			}
			BenchmarkPhase phase = phases.get(this.index).getPhase();
			if (increase)
				this.index++;
			else if (init)
				this.index = 0;
			return phase;
		}
		return null;
	}
	
	@Override
	public boolean hasNext() {
		if (index < this.phases.size()){
			if (this.phases.get(index).hasNext()){
				return true;
			}
			if (index != (this.phases.size() -1) ) 
				return true;
		}
		return false;
	}
	
	public void addPhases(BenchmarkPhase... phases){
		for(BenchmarkPhase p:phases){
			this.phases.add(p);
		}
	}

	@Override
	public void remove() {
		System.out.println("seq remove " + this.index);
		this.phases.remove();
		if (this.index > 0)
			this.index--;
	}



}
