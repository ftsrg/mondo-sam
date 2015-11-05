package eu.mondo.sam.core.metrics;

import java.util.ArrayList;

public class CompositeMetric extends BenchmarkMetric {

	protected ArrayList<BenchmarkMetric> metrics;

	public CompositeMetric(String name) {
		super(name);
		metrics = new ArrayList<>();
	}

	@Override
	public String getValue() {
		return null;
	}

	public void addMetric(BenchmarkMetric metric) {
		metrics.add(metric);
	}

	public ArrayList<BenchmarkMetric> getMetrics() {
		return metrics;
	}

	public void setMetrics(ArrayList<BenchmarkMetric> metrics) {
		this.metrics = metrics;
	}

}
