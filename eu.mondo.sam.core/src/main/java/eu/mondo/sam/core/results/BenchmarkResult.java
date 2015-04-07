package eu.mondo.sam.core.results;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Contains the results of the entire benchmark process, as consists of
 * PhaseResult objects in a list. Also responsible for using the appropriate
 * result serializer in the case of publishing.
 * 
 * @author Zsolt Kovari
 *
 */
public class BenchmarkResult {

    /**
     * Refers to a CaseDescriptor object, which includes the most important
     * parameters about the current benchmark process.
     * 
     * @see CaseDescriptor
     */
    @JsonProperty("Case")
    private CaseDescriptor caseDescriptor;

    /**
     * Contains PhaseResult objects as a list.
     */
    @JsonProperty("PhaseResults")
    private List<PhaseResult> phaseResults;

    /**
     * Represents the location of the output folder where the results will be
     * saved. The default value is: the ../results/json/ directory.
     */
    private static String resultPath;

    private static boolean publish;

    static {
	resultPath = "../results/json/";
	publish = true;
    }

    /**
     * Instantiates the paseResults list.
     */
    public BenchmarkResult() {
	phaseResults = new ArrayList<PhaseResult>();
    }

    /**
     * Adds a PhaseResult object to the list.
     * 
     * @param result
     *            a valid PhaseResult instance with measured metrics.
     */
    public void addResults(PhaseResult result) {
	this.phaseResults.add(result);
    }

    /**
     * Invokes the ResultSerializer, after collects the necessary parameters
     * from the CaseDescriptor so as to create an appropriate filename.
     * 
     * @throws IOException
     */
    public void publishResults() throws IOException {
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

    /**
     * Removes every element from the phaseResult list.
     */
    public void clear() {
	phaseResults.clear();
    }

    public static boolean isPublish() {
	return publish;
    }

    public static void setPublish(boolean publish) {
	BenchmarkResult.publish = publish;
    }

    /**
     * Returns the CaseDescriptor object.
     * 
     * @return caseDescriptor
     */
    public CaseDescriptor getCaseDescriptor() {
	return caseDescriptor;
    }

    /**
     * Returns the list which contains PhaseResult instances.
     * 
     * @return phaseResults, cannot be null.
     */
    public List<PhaseResult> getPhaseResults() {
	return phaseResults;
    }

    /**
     * Sets a reference to a CaseDescriptor.
     * 
     * @param caseDescriptor
     *            with initialized fields.
     */
    public void setCaseDescriptor(CaseDescriptor caseDescriptor) {
	this.caseDescriptor = caseDescriptor;
    }

    /**
     * Returns the location where the output files will be saved.
     * 
     * @return resultPath
     */
    public static String getResultPath() {
	return resultPath;
    }

    /**
     * Adjusts a new location of resultPath which determines the exact folder
     * where the results will be serialized.
     * 
     * @param resultPath
     *            a valid and existing path
     */
    public static void setResultPath(String resultPath) {
	BenchmarkResult.resultPath = resultPath;
    }

}
