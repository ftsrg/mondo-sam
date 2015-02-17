package eu.mondo.sam.core.cases;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BenchmarkCase {

	@JsonProperty("CaseName")
	protected String caseName;
	
	protected LinkedList<BenchmarkPhase> phases;
	
	@JsonProperty("RunIndex")
	protected int runIndex;
	
	@JsonProperty("Scenario")
	protected String scenario;
	
	@JsonProperty("Tool")
	protected String tool;
	
	@JsonProperty("Size")
	protected int size;
	
	public BenchmarkCase(String name){
		this.phases = new LinkedList<BenchmarkPhase>();
	}
		
	protected void addPhases(BenchmarkPhase... phases){
		for(BenchmarkPhase p:phases){
			this.phases.add(p);
		}
	}
	
	public List<BenchmarkPhase> getPhases() {
		return phases;
	}
	
	public abstract BenchmarkCase buildCase();
	
	public boolean hasPhase(){
		return this.phases.isEmpty() ? false : true;
	}
	
	public AtomicPhase getNextPhase(){
		if (phases.isEmpty() == false){
			BenchmarkPhase phase = phases.getFirst();
			AtomicPhase followingPhase = (AtomicPhase) phase.nextPhase();
			if (phase.hasNext() == false)
				phases.poll();
			return followingPhase;
		}
		return null;
		
	}
	
	@Override
	public String toString() {
		return caseName;
	}
	
	public String getCaseName() {
		return caseName;
	}
	
	public int getRunIndex() {
		return runIndex;
	}
	
	public String getScenario() {
		return scenario;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getTool() {
		return tool;
	}
}
