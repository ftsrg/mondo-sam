package eu.mondo.sam.core.publishers;

import java.io.IOException;

import eu.mondo.sam.core.results.BenchmarkResult;

public abstract class Publisher {

	protected String resultPath;

	protected String extension;

	public abstract void publish(final BenchmarkResult benchmarkResult) throws IOException;

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getResultPath() {
		return resultPath;
	}

	public void setResultPath(String resultPath) {
		this.resultPath = resultPath;
	}

}
