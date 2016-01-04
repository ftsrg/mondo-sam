package eu.mondo.sam.core.results;

import java.io.IOException;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public interface ResultSerializer {

	public void serialize(BenchmarkResult benchmarkResult, FileSystem fileSystem, Path resultFilePath)
			throws IOException;
}
