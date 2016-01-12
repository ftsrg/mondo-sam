package eu.mondo.sam.core.results;

import java.io.IOException;
import java.net.URI;

public interface ResultSerializer {

	public void serialize(BenchmarkResult benchmarkResult, URI resultFilePathWithoutExtension)
			throws IOException;
}
