package eu.mondo.sam.examples.calculator;

import java.io.IOException;

import eu.mondo.sam.core.BenchmarkEngine;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.publishers.DefaultFilenameFactory;
import eu.mondo.sam.core.publishers.FilePublisher;
import eu.mondo.sam.core.publishers.FilenameFactory;
import eu.mondo.sam.core.publishers.Publisher;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.formatters.JsonResultFormatter;

public class CalculatorMain {

	public static void main(String[] args) throws IOException {
		BenchmarkEngine engine = new BenchmarkEngine();
		NumberToken token = new NumberToken();
		BenchmarkPhase declarationPhase = new DeclarationPhase("Declaration");

		TestScenario scenario = new TestScenario();
		scenario.getCaseDescriptor();
		scenario.setRootPhase(declarationPhase);

		BenchmarkResult result = new BenchmarkResult();
		FilenameFactory factory = new DefaultFilenameFactory(scenario.getCaseDescriptor());
		// @formatter:off
		Publisher publisher = new FilePublisher.Builder()
						.filenameFactory(factory)
						.formatter(new JsonResultFormatter())
						.build();
		// @formatter:on
		result.addPublisher(publisher);

		engine.runBenchmark(result, scenario, token);
	}

}
