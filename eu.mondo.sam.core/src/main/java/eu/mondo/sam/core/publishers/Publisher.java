package eu.mondo.sam.core.publishers;

import java.io.IOException;

import eu.mondo.sam.core.results.BenchmarkResult;

public interface Publisher {

	public abstract void publish(final BenchmarkResult benchmarkResult) throws IOException;

}
