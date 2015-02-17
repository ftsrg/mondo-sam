package eu.mondo.sam.core.results;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetricResult {

	@JsonProperty("MetricName")
	private String name;
	
	@JsonProperty("MetricValue")
	private String value;
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
