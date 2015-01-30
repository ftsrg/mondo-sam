package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ResultSerializer {
	
	public static void serializeToJson(BenchmarkResult bmr){
		ObjectMapper mapper = new ObjectMapper();
		// to enable standard indentation ("pretty-printing"):
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		// to allow serialization of "empty" POJOs (no properties to serialize)
		// (without this setting, an exception is thrown in those cases)
		mapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		mapper.setVisibilityChecker(mapper.getVisibilityChecker().with(JsonAutoDetect.Visibility.NONE));
		String filePath = "../results/results.json";
		try{
			File dir = new File("../results");
			dir.mkdir();
			mapper.writeValue(new File(filePath), bmr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Create JSON file: results/" + filePath);
	}
	
	/*
	public static void serializeToCSV(BenchmarkResult bmr){
		String filePath = "../results/results.csv";
		List<String> headers = new ArrayList<String>();
		List<BenchmarkPhase> phases = bmr.getBenchmarkConfig().getBenchmarkCase().getPhases();
		for(BenchmarkPhase p:phases){
			headers.add(p.toString());
			for(BenchmarkMetric m:p.getMetrics()){
				headers.add(m.toString());
			}
		}
		System.out.println(headers.toString());
		String[] row = (headers.toString()).split(",");
		//System.out.println(row);
		try(CSVWriter writer = new CSVWriter(new FileWriter(filePath), ';')){
			bmr.getBenchmarkConfig().getBenchmarkCase().getPhases().toArray();
			writer.writeNext(row);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	*/

}
