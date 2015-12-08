package eu.mondo.sam.core.publishers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.formatters.FormatException;
import eu.mondo.sam.core.results.formatters.ResultFormatter;

public class FilePublisher implements Publisher {

	protected FilenameFactory factory;
	protected ResultFormatter formatter;
	protected String resultPath;
	protected String extension;

	private FilePublisher(Builder builder) {
		this.factory = builder.factory;
		this.formatter = builder.formatter;
		this.resultPath = builder.resultPath;
		this.extension = builder.extension;
	}

	@Override
	public void publish(final BenchmarkResult benchmarkResult) throws IOException {
		String filePath = getFullname();
		String formattedResult;
		try {
			formattedResult = formatter.format(benchmarkResult);
		} catch (FormatException e) {
			throw new IOException(e);
		}
		File dir = new File(resultPath);
		dir.mkdir();
		File file = new File(filePath);
		FileUtils.writeStringToFile(file, formattedResult, "UTF-8");
	}

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

	public String getFullname() {
		// add some validation
		return resultPath + factory.getFilename() + "." + extension;
	}

	public static class Builder {

		private FilenameFactory factory;
		private ResultFormatter formatter;
		private String resultPath;
		private String resultPathDefault = "../results/";
		private String extension;
		private String extensionDefault = "json";

		public Builder filenameFactory(final FilenameFactory filenameFactory) {
			this.factory = filenameFactory;
			return this;
		}

		public Builder formatter(final ResultFormatter formatter) {
			this.formatter = formatter;
			return this;
		}

		public Builder resultPath(final String resultPath) {
			this.resultPath = resultPath;
			return this;
		}

		public Builder extension(final String extension) {
			this.extension = extension;
			return this;
		}

		public FilePublisher build() {
			if (factory == null) {
				throw new IllegalStateException("FilenameFactory is not initialized!");
			}
			if (formatter == null) {
				throw new IllegalStateException("Formatter is not initialized!");
			}
			if (resultPath == null || resultPath.isEmpty()) {
				// log warning
				resultPath = resultPathDefault;
			}
			if (extension == null || extension.isEmpty()) {
				// log warning
				extension = extensionDefault;
			}
			return new FilePublisher(this);
		}

	}

}
