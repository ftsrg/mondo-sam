package eu.mondo.sam.core.cases;

import eu.mondo.sam.core.phases.BenchmarkPhaseGroup;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BenchmarkCase {

	@JsonProperty("CaseName")
	protected String caseName;
	
	protected List<BenchmarkPhaseGroup> groups;
	
	@JsonProperty("RunIndex")
	protected int runIndex;
	
	@JsonProperty("Scenario")
	protected String scenario;
	
	@JsonProperty("Tool")
	protected String tool;
	
	@JsonProperty("Size")
	protected int size;
	
	public BenchmarkCase(String name){
		this.groups = new ArrayList<BenchmarkPhaseGroup>();
	}
		
	protected void addPhaseGroups(BenchmarkPhaseGroup... groups){
		for(BenchmarkPhaseGroup g:groups){
			this.groups.add(g);
		}
	}
	
	public List<BenchmarkPhaseGroup> getGroups() {
		return groups;
	}
	
	public abstract BenchmarkCase buildCase();
	
	@Override
	public String toString() {
		return caseName;
	}
	
	public boolean isInitialized(){
		if (this.caseName == null || 
			this.size == 0 ||
			this.scenario == null ||
			this.tool == null ||
			this.runIndex == 0)return false;
		return true;
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
