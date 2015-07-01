package eu.mondo.sam.core.results;

import java.io.IOException;

public interface ResultSerializer {

	public void serialize(BenchmarkResult benchmarkResult, String fileName)
			throws IOException;
}
