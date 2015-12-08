package eu.mondo.sam.core.publishers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import eu.mondo.sam.core.results.BenchmarkResult;

public class CsvPublisher implements Publisher {

	protected FilenameFactory factory;

	protected String resultPath;

	protected String extension;

	public CsvPublisher(FilenameFactory factory) {
		this.factory = factory;
		resultPath = "../results/csv/";
		extension = ".csv";
	}

	@Override
	public void publish(final BenchmarkResult benchmarkResult)
			throws IOException {
		CSVFormat format = CSVFormat.DEFAULT.withHeader(//
				"Scenario", //
				"Tool", //
				"CaseName", //
				"Size", //
				"RunIndex", //
				"Sequence", //
				"PhaseName", //
				"Iteration", //
				"MetricName", //
				"MetricValue");
		Appendable out = System.out;
		
		try (CSVPrinter csvPrinter = new CSVPrinter(out, format))  {		
			// TODO generate a row for each metric
			List<String> record = new ArrayList<>();
			record.add("...");
			csvPrinter.printRecord(record);
		}
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getResultPath() {
		return resultPath;
	}

	public void setResultPath(String resultPath) {
		this.resultPath = resultPath;
	}

	public String getFullname() {
		return resultPath + factory.getFilename() + extension;
	}

}
