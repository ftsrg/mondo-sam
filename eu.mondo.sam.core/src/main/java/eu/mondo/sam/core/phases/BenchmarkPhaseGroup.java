package eu.mondo.sam.core.phases;

import java.util.List;
import java.util.ArrayList;

public class BenchmarkPhaseGroup {

	private List<BenchmarkPhase> phases;
	
	private int loop = 1;
	
	public BenchmarkPhaseGroup(){
		this.phases = new ArrayList<BenchmarkPhase>();
	}
	
	public void addPhase(BenchmarkPhase... phases){
		for(BenchmarkPhase p : phases)
			this.phases.add(p);
	}
	
	public void setLoop(int loop) {
		this.loop = loop;
	}
	
	public int getLoop() {
		return loop;
	}
	
	public List<BenchmarkPhase> getPhases() {
		return phases;
	}
}
