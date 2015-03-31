package eu.mondo.sam.core.results;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class BenchmarkResult {

    @JsonProperty("Case")
    private CaseDescriptor caseDescriptor;

    @JsonProperty("PhaseResults")
    private List<PhaseResult> phaseResults;

    private static String resultPath;
    private static boolean publish;

    static {
	resultPath = "../results/json/";
	publish = true;
    }

    public BenchmarkResult() {
	phaseResults = new ArrayList<PhaseResult>();
    }

    public void addResults(PhaseResult result) {
	this.phaseResults.add(result);
    }

    public void publishResults() {
	String tool = caseDescriptor.getTool();
	String scenario = caseDescriptor.getScenario();
	String benchCase = caseDescriptor.getCaseName();
	int size = caseDescriptor.getSize();
	int runIndex = caseDescriptor.getRunIndex();
	String fileName = tool + "-" + benchCase + "-" + scenario + "-Size"
		+ size + "-Index" + runIndex + ".json";
	if (publish) {
	    ResultSerializer.serializeToJson(this, resultPath, fileName);
	}
    }

    public void clear() {
	phaseResults.clear();
    }

    public static boolean isPublish() {
	return publish;
    }

    public static void setPublish(boolean publish) {
	BenchmarkResult.publish = publish;
    }

    public CaseDescriptor getCaseDescriptor() {
	return caseDescriptor;
    }

    public List<PhaseResult> getPhaseResults() {
	return phaseResults;
    }

    public void setCaseDescriptor(CaseDescriptor caseDescriptor) {
	this.caseDescriptor = caseDescriptor;
    }

    public static String getResultPath() {
	return resultPath;
    }

    public static void setResultPath(String resultPath) {
	BenchmarkResult.resultPath = resultPath;
    }

}
