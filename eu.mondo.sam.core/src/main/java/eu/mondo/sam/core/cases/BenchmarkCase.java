package eu.mondo.sam.core.cases;

import eu.mondo.sam.core.phases.BenchmarkPhaseGroup;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BenchmarkCase {

	@JsonProperty("CaseName")
	protected String caseName;
	
	protected List<BenchmarkPhaseGroup> groups;
	
	@JsonProperty("SeriesIndex")
	private int seriesIndex;
	
	@JsonProperty("Scenario")
	private String scenario;
	
	public BenchmarkCase(String name){
		this.groups = new ArrayList<BenchmarkPhaseGroup>();
		this.caseName = name;
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
	
}
