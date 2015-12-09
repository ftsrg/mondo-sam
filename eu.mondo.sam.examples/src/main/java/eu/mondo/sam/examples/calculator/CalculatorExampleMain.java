package eu.mondo.sam.examples.calculator;

import java.io.File;
import java.io.IOException;

import eu.mondo.sam.core.BenchmarkEngine;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.publishers.CsvPublisher;
import eu.mondo.sam.core.publishers.DefaultFilenameFactory;
import eu.mondo.sam.core.publishers.FilenameFactory;
import eu.mondo.sam.core.publishers.Publisher;
import eu.mondo.sam.core.results.BenchmarkResult;

public class CalculatorExampleMain {

	public static void main(final String[] args) throws IOException {
		final BenchmarkEngine engine = new BenchmarkEngine();
		final NumberToken token = new NumberToken();
		final BenchmarkPhase declarationPhase = new CalculationPhase("Declaration");

		final TestScenario scenario = new TestScenario();
		scenario.getCaseDescriptor();
		scenario.setRootPhase(declarationPhase);

		final BenchmarkResult result = new BenchmarkResult(new File("."));
		final FilenameFactory factory = new DefaultFilenameFactory(scenario.getCaseDescriptor());
		// @formatter:off
//		Publisher publisher = new FilePublisher.Builder()
//						.filenameFactory(factory)
//						.formatter(new JsonResultFormatter())
//						.build();
		// @formatter:on
		final Publisher publisher = new CsvPublisher(factory);
		
		result.addPublisher(publisher);

		engine.runBenchmark(result, scenario, token);
	}

}
