package eu.mondo.sam.core.results;

import java.io.IOException;
import java.nio.file.Path;

public interface ResultSerializer {

	public void serialize(BenchmarkResult benchmarkResult, Path resultFilePathWithoutExtension)
			throws IOException;
}
