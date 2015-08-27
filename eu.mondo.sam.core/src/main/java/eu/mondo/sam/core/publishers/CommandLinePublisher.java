package eu.mondo.sam.core.publishers;

import java.io.IOException;

import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.CaseDescriptor;

public class CommandLinePublisher extends Publisher {

	@Override
	public void publish(BenchmarkResult benchmarkResult) throws IOException {
		CaseDescriptor desc = benchmarkResult.getCaseDescriptor();
		System.out.println("Running benchmark: " + desc.getScenario() + " scenario, "
				+ desc.getTool() + ", " + desc.getCaseName() + ", " + desc.getSize());

	}

}
