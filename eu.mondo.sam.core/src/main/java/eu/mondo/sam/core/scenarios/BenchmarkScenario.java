package eu.mondo.sam.core.scenarios;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.iterators.PhaseIterator;

import org.codehaus.jackson.annotate.JsonProperty;


public abstract class BenchmarkScenario {

	@JsonProperty("CaseName")
	protected String caseName;
	
	@JsonProperty("RunIndex")
	protected int runIndex;
	
	@JsonProperty("Scenario")
	protected String scenario;
	
	@JsonProperty("Tool")
	protected String tool;
	
	@JsonProperty("Size")
	protected int size;
	
	private PhaseIterator iterator;
	protected BenchmarkPhase rootPhase;
	
	public BenchmarkScenario(String scenario){
		this.scenario = scenario;
	}
		
	protected void setRootPhase(BenchmarkPhase phase){
		this.rootPhase = phase;
	}
	
	public abstract BenchmarkScenario buildScenario();
	
	public boolean hasNextPhase(){
		if (iterator == null){
			iterator = rootPhase.getIterator();
		}
		return iterator.hasNext();
	}
	
	public AtomicPhase getNextPhase(){
		if (iterator == null){
			iterator = rootPhase.getIterator();
		}
		AtomicPhase phase = iterator.nextPhase();
		return phase;
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
	
	public String getScenarioName() {
		return scenario;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getTool() {
		return tool;
	}
}
