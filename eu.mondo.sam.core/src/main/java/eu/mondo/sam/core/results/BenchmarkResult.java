package eu.mondo.sam.core.results;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class BenchmarkResult {

	@JsonProperty("Case")
	private BenchmarkScenario benchmarkScenario;
	
	@JsonProperty("PhaseResults")
	private List<PhaseResult> phaseResults;

	private static String resultPath;
	private static boolean publish;
	
	static{
		resultPath = "../results/json/";
		publish = true;
	}
	
	public BenchmarkResult(){
		phaseResults = new ArrayList<PhaseResult>();
	}
	
	public List<PhaseResult> getPhaseResults() {
		return phaseResults;
	}
	
	public void setBenchmarkScenario(BenchmarkScenario benchmarkScenario) {
		this.benchmarkScenario = benchmarkScenario;
	}
	
	public void addResults(PhaseResult result){
		this.phaseResults.add(result);
	}
	
	public void publishResults(){
		String tool = benchmarkScenario.getTool();
		String scenario = benchmarkScenario.getScenarioName();
		String benchCase = benchmarkScenario.getCaseName();
		int size = benchmarkScenario.getSize();
		int runIndex = benchmarkScenario.getRunIndex();
		String fileName = tool + "-" + benchCase + "-" + scenario + "-Size" + size + "-Index" + runIndex + ".json";
		if(publish){
			ResultSerializer.serializeToJson(this, resultPath, fileName);
		}
	}
	
	public static void changeResultPath(String p){
		resultPath = p;
	}
	
	public static void setPublish(boolean publish) {
		BenchmarkResult.publish = publish;
	}
}
