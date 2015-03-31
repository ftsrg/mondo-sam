package eu.mondo.sam.core.metrics;

public class MemoryMetric extends BenchmarkMetric {

    private long memory;

    public MemoryMetric(String name) {
	super(name);
    }

    @Override
    public String getValue() {
	return Long.toString(memory);
    }

    public void measure() {
	memory = Runtime.getRuntime().totalMemory()
		- Runtime.getRuntime().freeMemory();
    }

}
