package eu.mondo.sam.proto;

import eu.mondo.sam.core.metric.BenchmarkMetric;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangesMetric extends BenchmarkMetric{

	@JsonProperty("ChangesValue")
	private int changesValue;
	
	public ChangesMetric(String name) {
		super(name);
	}

}
