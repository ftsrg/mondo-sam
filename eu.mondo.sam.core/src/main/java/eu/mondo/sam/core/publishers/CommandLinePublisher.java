package eu.mondo.sam.core.publishers;

import java.io.IOException;

import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.CaseDescriptor;

public class CommandLinePublisher implements Publisher {

	@Override
	public void publish(final BenchmarkResult benchmarkResult) throws IOException {
		final CaseDescriptor desc = benchmarkResult.getCaseDescriptor();
		System.out.println("Running benchmark: " + //
				desc.getScenario() + " scenario, " + //
				desc.getTool() + ", " + //
				desc.getCase() + ", " + //
				desc.getArtifact());
	}

}
