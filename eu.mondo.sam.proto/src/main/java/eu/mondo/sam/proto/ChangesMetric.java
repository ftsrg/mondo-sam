package eu.mondo.sam.proto;

import eu.mondo.sam.core.metrics.BenchmarkMetric;

public class ChangesMetric extends BenchmarkMetric{

	private int changesValue;
	
	public ChangesMetric(String name) {
		super(name);
	}
	
	public void setChangesValue(int changesValue) {
		this.changesValue = changesValue;
	}
	
	@Override
	public String getValue() {
		return Integer.toString(changesValue);
	}

}
