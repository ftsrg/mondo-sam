package eu.mondo.sam.core.results.formatters;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import eu.mondo.sam.core.results.BenchmarkResult;

public class JsonResultFormatter implements ResultFormatter {

	@Override
	public String format(BenchmarkResult benchmarkResult) throws FormatException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonResult;

		// to enable standard indentation ("pretty-printing"):
		mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
		// turn off autodetection
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, false);
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_GETTERS, false);

		try {
			jsonResult = mapper.writeValueAsString(benchmarkResult);
		} catch (IOException e) {
			// TODO logging
			throw new FormatException(e);
		}
		return jsonResult;
	}
}
