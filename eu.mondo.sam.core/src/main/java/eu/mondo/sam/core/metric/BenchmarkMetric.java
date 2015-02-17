package eu.mondo.sam.core.metric;


public abstract class BenchmarkMetric{

	protected String metricName;
	
	public BenchmarkMetric(String name){
		this.metricName = name;
	}
	
	public String getMetricName() {
		return metricName;
	}
	
	@Override
	public String toString() {
		return this.metricName + " " + this.getValue();
	}
	
	public abstract String getValue();
	
}
