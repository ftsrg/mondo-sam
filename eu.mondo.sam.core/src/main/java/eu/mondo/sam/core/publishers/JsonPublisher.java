package eu.mondo.sam.core.publishers;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import eu.mondo.sam.core.results.BenchmarkResult;

public class JsonPublisher extends Publisher {

	protected FilenameFactory factory;

	public JsonPublisher(FilenameFactory factory) {
		this.factory = factory;
		resultPath = "../results/json/";
		extension = ".json";
	}

	@Override
	public void publish(final BenchmarkResult benchmarkResult) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		// to enable standard indentation ("pretty-printing"):
		mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
		// turn off autodetection
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, false);
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_GETTERS, false);

		String filePath = resultPath + factory.getFilename() + ".json";
		try {
			File dir = new File(resultPath);
			dir.mkdir();
			mapper.writeValue(new File(filePath), benchmarkResult);
		} catch (JsonGenerationException e) {
			throw new IOException(e);
		} catch (JsonMappingException e) {
			throw new IOException(e);
		}
	}

}
