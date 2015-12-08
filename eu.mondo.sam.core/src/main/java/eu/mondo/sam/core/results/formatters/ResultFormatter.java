package eu.mondo.sam.core.results.formatters;

import eu.mondo.sam.core.results.BenchmarkResult;

public interface ResultFormatter {

	public String format(final BenchmarkResult benchmarkResult) throws FormatException;
}
