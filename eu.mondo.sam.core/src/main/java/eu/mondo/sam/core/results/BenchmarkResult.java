package eu.mondo.sam.core.results;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Contains the results of the entire benchmark process, as consists of
 * PhaseResult objects as a list. Also responsible for using the appropriate
 * result serializer in order to publish.
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
     * Includes of ResultSerializer instances. The elements in the list are
     * responsible for the process of publishing benchmark results. By default,
     * this list contains a JsonSerializer object.
     */
    private List<ResultSerializer> serializers;

    /**
     * Instantiates the paseResults list and the serializers as well.
     */
    public BenchmarkResult() {
	phaseResults = new ArrayList<PhaseResult>();
	serializers = new ArrayList<ResultSerializer>();

	JsonSerializer json = new JsonSerializer();
	serializers.add(json);
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
     * Extends the serializers list with a new component.
     * 
     * @param serializer
     *            A ResultSerializer instance.
     */
    public void addSerializer(ResultSerializer serializer) {
	this.serializers.add(serializer);
    }

    /**
     * Returns the list of ResultSerializer objects.
     * 
     * @return serializers
     */
    public List<ResultSerializer> getSerializers() {
	return serializers;
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
		+ size + "-Index" + runIndex;

	for (ResultSerializer serializer : serializers) {
	    serializer.serialize(this, fileName);
	}
    }

    /**
     * Removes every element from the phaseResult list.
     */
    public void clear() {
	phaseResults.clear();
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

}
