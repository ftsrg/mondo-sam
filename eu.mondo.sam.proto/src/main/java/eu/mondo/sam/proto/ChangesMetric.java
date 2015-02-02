package eu.mondo.sam.proto;

import eu.mondo.sam.core.metric.BenchmarkMetric;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangesMetric extends BenchmarkMetric{

	@JsonProperty("ChangesValue")
	private int changesValue;
	
	public ChangesMetric(String name) {
		super(name);
	}
	
	public void setChangesValue(int changesValue) {
		this.changesValue = changesValue;
		this.measured = true;
	}
	
	public BenchmarkMetric clone() throws CloneNotSupportedException{
		return (BenchmarkMetric) super.clone();
	}

}
