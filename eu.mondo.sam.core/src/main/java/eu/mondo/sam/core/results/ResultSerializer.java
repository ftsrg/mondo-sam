package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

public class ResultSerializer {
	
	public static void serializeToJson(BenchmarkResult bmr, String folderPath, String fileName){
		ObjectMapper mapper = new ObjectMapper();
		// to enable standard indentation ("pretty-printing"):
		mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT, true);
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, false);
		mapper.configure(SerializationConfig.Feature.AUTO_DETECT_GETTERS, false);
		String filePath = folderPath + fileName;
		try{
			File dir = new File(folderPath);
			dir.mkdir();
			mapper.writeValue(new File(filePath), bmr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Create JSON file: " + filePath);
	}
}
