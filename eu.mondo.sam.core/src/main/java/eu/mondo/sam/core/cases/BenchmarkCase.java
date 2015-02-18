package eu.mondo.sam.core.cases;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.IterationPhase;
import eu.mondo.sam.core.phases.SequencePhase;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BenchmarkCase {

	@JsonProperty("CaseName")
	protected String caseName;
	
	protected IterationPhase rootPhase;
	
	@JsonProperty("RunIndex")
	protected int runIndex;
	
	@JsonProperty("Scenario")
	protected String scenario;
	
	@JsonProperty("Tool")
	protected String tool;
	
	@JsonProperty("Size")
	protected int size;
	
	public BenchmarkCase(String name){
		this.rootPhase = new IterationPhase(0, 1);
	}
		
	protected void setPhases(BenchmarkPhase... phases){
		SequencePhase seq = new SequencePhase();
		for(BenchmarkPhase p:phases)
			seq.addPhases(p);
		this.rootPhase.setPhase(seq);
	}
	
//	public List<BenchmarkPhase> getPhases() {
//		return phases;
//	}
	
	public abstract BenchmarkCase buildCase();
	
	public boolean hasPhase(){
		return this.rootPhase.hasNext();
	}
	
	public AtomicPhase getNextPhase(){
		if (this.rootPhase.hasNext()){
			AtomicPhase phase = (AtomicPhase) this.rootPhase.getPhase();
			return phase;
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
