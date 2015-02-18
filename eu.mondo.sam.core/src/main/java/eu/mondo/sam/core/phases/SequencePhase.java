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
		System.out.println("Seq getphase " + this.index);
		if (this.index < this.phases.size()){
			BenchmarkPhase phase = phases.get(this.index).getPhase();
			if (this.phases.get(index).hasNext() == false){
				if (this.index < (this.phases.size()-1) ){
					System.out.println("Increase index");
					this.index++;
				}
				else
					{System.out.println("null index called");this.index = 0;}
			}
			return phase;
		}
		return null;
	}
	
	@Override
	public boolean hasNext() {
		System.out.println("Seq hasnext " + this.index);
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
