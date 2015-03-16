package eu.mondo.sam.core.metrics;

public class ScalarMetric extends BenchmarkMetric{

	private long value;
	
	public ScalarMetric(String name) {
		super(name);
	}

	@Override
	public String getValue() {
		return Long.toString(value);
	}

	public void setValue(long value) {
		this.value = value;
	}
}
