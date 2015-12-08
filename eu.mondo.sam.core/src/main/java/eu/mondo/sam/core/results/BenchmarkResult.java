package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import eu.mondo.sam.core.publishers.Publisher;

/**
 * Contains the results of the entire benchmark process, as consists of PhaseResult objects as a list. Also
 * responsible for using the appropriate result serializer in order to publish.
 * 
 * @author Zsolt Kovari
 *
 */
public class BenchmarkResult {

	/**
	 * Refers to a CaseDescriptor object, which includes the most important parameters about the current
	 * benchmark process.
	 * 
	 * @see CaseDescriptor
	 */
	@JsonProperty("Case")
	protected CaseDescriptor caseDescriptor;

	/**
	 * Contains PhaseResult objects as a list.
	 */
	@JsonProperty("PhaseResults")
	protected final List<PhaseResult> phaseResults;

	private final File resultsDirectory;

	/**
	 * Includes of {@Publisher} instances. The elements in the list are responsible for the process of
	 * publishing benchmark results.
	 */
	protected final List<Publisher> publishers;

	/**
	 * Instantiates the phaseResults list and the serializers as well.
	 * @param baseDirectory 
	 */
	public BenchmarkResult(File baseDirectory) {
		this.resultsDirectory = new File(baseDirectory, "results");
		phaseResults = new ArrayList<PhaseResult>();
		publishers = new ArrayList<Publisher>();
	}

	/**
	 * Adds a PhaseResult object to the list.
	 * 
	 * @param result
	 *                a valid PhaseResult instance with measured metrics.
	 */
	public void addResults(final PhaseResult result) {
		this.phaseResults.add(result);
	}

	public void publish() throws IOException {
		for (final Publisher publisher : publishers) {
			publisher.publish(this);
		}
	}

	/**
	 * Removes every element from the phaseResult list.
	 */
	public void removeResults() {
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
	 *                with initialized fields.
	 */
	public void setCaseDescriptor(final CaseDescriptor caseDescriptor) {
		this.caseDescriptor = caseDescriptor;
	}

	public boolean addPublisher(Publisher e) {
		return publishers.add(e);
	}

	public boolean removePublisher(final Publisher publisher) {
		if (publishers.contains(publisher)) {
			return publishers.remove(publisher);
		}
		return false;
	}

	public List<Publisher> getPublishers() {
		return publishers;
	}

	public boolean addAllPublishers(Collection<? extends Publisher> publishers) {
		return this.publishers.addAll(publishers);
	}

}
