package eu.mondo.sam.core.metric;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BenchmarkMetric implements Cloneable{

	@JsonProperty("MetricName")
	protected String metricName;
	@JsonProperty("MetricValue")
	protected long value;
	
	protected boolean measured = false;
	
	public BenchmarkMetric(String name){
		this.metricName = name;
	}
	
	public void setValue(long value) {
		this.value = value;
		this.measured = true;
	}
	
	public String getMetricName() {
		return metricName;
	}
	
	public boolean isMeasured(){
		return this.measured;
	}
	/*
	public BenchmarkMetric clone() throws CloneNotSupportedException{
		return (BenchmarkMetric) super.clone();
		
	}*/
	
	public long getValue() {
		return value;
	}	
	
	@Override
	public String toString() {
		return this.metricName + " " + this.value;
	}

}
