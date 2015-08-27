package eu.mondo.sam.core.results;

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

	/**
	 * Includes of ResultSerializer instances. The elements in the list are responsible for the process of
	 * publishing benchmark results. By default, this list contains a JsonSerializer object.
	 * 
	 * @deprecated use {@link #publishers} instead.
	 */
	@Deprecated
	protected final List<ResultSerializer> serializers;

	protected final List<Publisher> publishers;

	/**
	 * Instantiates the phaseResults list and the serializers as well.
	 */
	public BenchmarkResult() {
		phaseResults = new ArrayList<PhaseResult>();
		serializers = new ArrayList<ResultSerializer>();
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

	/**
	 * Extends the serializers list with a new component.
	 * 
	 * @param serializer
	 *                A ResultSerializer instance.
	 * 
	 * @deprecated use {@link #addPublisher(Publisher)} instead.
	 */
	@Deprecated
	public void addSerializer(final ResultSerializer serializer) {
		serializers.add(serializer);
	}

	/**
	 * Returns the list of ResultSerializer objects.
	 * 
	 * @return serializers
	 * 
	 * @deprecated use {@link #getPublishers()} instead.
	 */
	@Deprecated
	public List<ResultSerializer> getSerializers() {
		return serializers;
	}

	/**
	 * Invokes the ResultSerializer, after collects the necessary parameters from the CaseDescriptor so as
	 * to create an appropriate filename.
	 * 
	 * @throws IOException
	 * 
	 * @deprecated use {@link #publish()} instead.
	 */
	@Deprecated
	public void publishResults() throws IOException {
		final String tool = caseDescriptor.getTool();
		final String scenario = caseDescriptor.getScenario();
		final String benchCase = caseDescriptor.getCaseName();
		final int size = caseDescriptor.getSize();
		final int runIndex = caseDescriptor.getRunIndex();
		final String fileName = tool + "-" + benchCase + "-" + scenario + "-Size" + size + "-Index"
				+ runIndex;

		for (final ResultSerializer serializer : serializers) {
			serializer.serialize(this, fileName);
		}
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
	 * Removes every ResultSerializer instance from the serializers list.
	 */
	@Deprecated
	public void removeAllSerializers() {
		serializers.clear();
	}

	/**
	 * Removes a ResutSerializer instance from the serializers list.
	 * 
	 * @param serializer
	 *                represents a ResultSerializer object that will be removed
	 * 
	 * @deprecated use {@link #removePublisher(Publisher)} instead.
	 */
	@Deprecated
	public void removeSerializer(final ResultSerializer serializer) {
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
