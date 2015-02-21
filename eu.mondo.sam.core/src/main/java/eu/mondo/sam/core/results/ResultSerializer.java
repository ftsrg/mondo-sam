package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ResultSerializer {
	
	public static void serializeToJson(BenchmarkResult bmr, String folderPath, String fileName){
		ObjectMapper mapper = new ObjectMapper();
		// to enable standard indentation ("pretty-printing"):
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		// to allow serialization of "empty" POJOs (no properties to serialize)
		// (without this setting, an exception is thrown in those cases)
		mapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		mapper.setVisibilityChecker(mapper.getVisibilityChecker().with(JsonAutoDetect.Visibility.NONE));
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
