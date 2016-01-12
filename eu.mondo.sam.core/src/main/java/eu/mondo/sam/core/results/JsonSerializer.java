package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import eu.mondo.sam.core.util.FileOperations;
import eu.mondo.sam.core.util.UriUtils;

/**
 * Responsible for publishing the results of benchmarking.
 * 
 * @author Zsolt Kovari
 *
 */
public class JsonSerializer implements ResultSerializer {

	/**
	 * Saves the benchmark results to a new JSON file based on the folder
	 * and filename parameters. In the case of an already existing file,
	 * overrides the content of its.
	 * 
	 * The necessary values of the measurements are provided by JsonProperty
	 * annotations. The certain field which possesses such an annotation
	 * will be saved to the output JSON file automatically.
	 * 
	 * @param benchmarkResult
	 *                an initialized BenchmarkResult object with properly
	 *                used JsonProperty annotations
	 * 
	 * @throws IOException
	 *                 if some error occur during the JSON serialization
	 */
	public void serialize(BenchmarkResult benchmarkResult, URI resultFilePathWithoutExtension)
			throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		// to enable standard indentation ("pretty-printing"):
		mapper.configure(
				SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS,
				false);
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT,
				true);
		// turn off autodetection
		mapper.configure(
				SerializationConfig.Feature.AUTO_DETECT_FIELDS,
				false);
		mapper.configure(
				SerializationConfig.Feature.AUTO_DETECT_GETTERS,
				false);

		try {
			URI resultFilePath = UriUtils.appendSuffix(resultFilePathWithoutExtension, ".json");
			File tempFile = File.createTempFile("mondo-sam", null);
			OutputStream outputStream = FileUtils.openOutputStream(tempFile);
			mapper.writeValue(outputStream, benchmarkResult);
			outputStream.close();
			FileOperations.copy(tempFile, resultFilePath);
		} catch (JsonGenerationException e) {
			throw new IOException(e);
		} catch (JsonMappingException e) {
			throw new IOException(e);
		}
	}

}
