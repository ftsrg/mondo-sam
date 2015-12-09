package eu.mondo.sam.core.publishers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.MetricResult;
import eu.mondo.sam.core.results.PhaseResult;

public class CsvPublisher implements Publisher {

	protected FilenameFactory factory;

	protected String resultPath;

	protected String extension;

	public CsvPublisher(final FilenameFactory factory) {
		this.factory = factory;
		resultPath = "../results/csv/";
		extension = ".csv";
	}

	@Override
	public void publish(final BenchmarkResult benchmarkResult)
			throws IOException {
		final CSVFormat format = CSVFormat.DEFAULT.withHeader(//
				"Scenario", //
				"Tool", //
				"Run", //
				"Case", //
				"Artifact", //
				"Phase", //
				"Iteration", //
				"Metric", //
				"Value");
		final Appendable out = System.out;
		
		// CSV rows
		// Scenario, Tool, Run, Case attributes
		try (CSVPrinter csvPrinter = new CSVPrinter(out, format))  {		
			final List<String> record1 = new ArrayList<>();
			record1.add(benchmarkResult.getCaseDescriptor().getScenario());
			record1.add(benchmarkResult.getCaseDescriptor().getTool());
			record1.add(Integer.toString(benchmarkResult.getCaseDescriptor().getRun()));
			record1.add(benchmarkResult.getCaseDescriptor().getCase());
			record1.add(benchmarkResult.getCaseDescriptor().getArtifact());
						
			// Phase, Iteration attributes
			for (final PhaseResult phaseResult : benchmarkResult.getPhaseResults()) {
				final List<String> record2 = new ArrayList<>(record1);
			
				record2.add(phaseResult.getPhaseName());
				record2.add(phaseResult.getSequence());

				// Metric, Value attributes
				for (final MetricResult metricResult : phaseResult.getMetrics()) {
					final List<String> record3 = new ArrayList<>(record2);
					
					final String metricName = metricResult.getName();
					final String value = metricResult.getValue();
					
					record3.add(metricName);
					record3.add(value);
			
					csvPrinter.printRecord(record3);
				}
			}
		}
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(final String extension) {
		this.extension = extension;
	}

	public String getResultPath() {
		return resultPath;
	}

	public void setResultPath(final String resultPath) {
		this.resultPath = resultPath;
	}

	public String getFullname() {
		return resultPath + factory.getFilename() + extension;
	}

}
