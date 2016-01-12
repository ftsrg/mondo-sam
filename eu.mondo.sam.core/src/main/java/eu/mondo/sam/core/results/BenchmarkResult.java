package eu.mondo.sam.core.results;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import eu.mondo.sam.core.util.UriUtils;

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

	private final URI resultsPath;

	/**
	 * Includes of ResultSerializer instances. The elements in the list are
	 * responsible for the process of publishing benchmark results. By
	 * default, this list contains a JsonSerializer object.
	 */
	private static List<ResultSerializer> serializers;

	/**
	 * Instantiates the phaseResults list and the serializers as well.
	 * @param resultsPath the directory where the results should be output 
	 */
	public BenchmarkResult(URI resultsPath) {
		this.resultsPath = resultsPath;
		phaseResults = new ArrayList<PhaseResult>();
		serializers = new ArrayList<ResultSerializer>();

		JsonSerializer json = new JsonSerializer();
		serializers.add(json);
	}

	/**
	 * Adds a PhaseResult object to the list.
	 * 
	 * @param result
	 *                a valid PhaseResult instance with measured metrics.
	 */
	public void addResults(PhaseResult result) {
		this.phaseResults.add(result);
	}

	/**
	 * Extends the serializers list with a new component.
	 * 
	 * @param serializer
	 *                A ResultSerializer instance.
	 */
	public static void addSerializer(ResultSerializer serializer) {
		serializers.add(serializer);
	}

	/**
	 * Returns the list of ResultSerializer objects.
	 * 
	 * @return serializers
	 */
	public static List<ResultSerializer> getSerializers() {
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
		String fileName = tool + "-" + benchCase + "-" + scenario
				+ "-Size" + size + "-Index" + runIndex;
		URI resultFilePath = UriUtils.appendSegment(resultsPath, fileName);

		for (ResultSerializer serializer : serializers) {
			serializer.serialize(this, resultFilePath);
		}
	}

	/**
	 * Removes every element from the phaseResult list.
	 */
	public void removeResults() {
		phaseResults.clear();
	}

	/**
	 * Removes every ResultSerializer instance from the serializers list.
	 */
	public static void removeAllSerializers() {
		serializers.clear();
	}

	/**
	 * Removes a ResutSerializer instance from the serializers list.
	 * 
	 * @param serializer
	 *                represents a ResultSerializer object that will be
	 *                removed
	 */
	public static void removeSerializer(ResultSerializer serializer) {
		if (serializers.contains(serializer)) {
			serializers.remove(serializer);
		}
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
	 *                with initialized fields.
	 */
	public void setCaseDescriptor(CaseDescriptor caseDescriptor) {
		this.caseDescriptor = caseDescriptor;
	}

}
