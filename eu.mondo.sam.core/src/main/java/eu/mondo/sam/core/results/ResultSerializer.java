package eu.mondo.sam.core.results;

import java.io.File;
import java.io.IOException;

public interface ResultSerializer {

	public void serialize(BenchmarkResult benchmarkResult, File file)
			throws IOException;
}
