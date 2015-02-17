package eu.mondo.sam.core.results;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import eu.mondo.sam.core.cases.BenchmarkCase;

public class BenchmarkResult {

	@JsonProperty("Case")
	private BenchmarkCase benchmarkCase;
	
	@JsonProperty("PhaseResults")
	private List<PhaseResult> phaseResults;

	private static String resultPath;
	
	static{
		resultPath = "../results/json/";
	}
	
	public BenchmarkResult(){
		phaseResults = new ArrayList<PhaseResult>();
	}
	
	public void setBenchmarkCase(BenchmarkCase benchmarkCase) {
		this.benchmarkCase = benchmarkCase;
	}
	
	public void addResults(PhaseResult result){
		this.phaseResults.add(result);
	}
	
	public void publishResults(){
		String tool = benchmarkCase.getTool();
		String scenario = benchmarkCase.getScenario();
		String benchCase = benchmarkCase.getCaseName();
		int size = benchmarkCase.getSize();
		int runIndex = benchmarkCase.getRunIndex();
		String fileName = tool + "-" + benchCase + "-" + scenario + "-Size" + size + "-Index" + runIndex + ".json";
		ResultSerializer.serializeToJson(this, resultPath, fileName);
	}
	
	public static void changeResultPath(String p){
		resultPath = p;
	}
}
