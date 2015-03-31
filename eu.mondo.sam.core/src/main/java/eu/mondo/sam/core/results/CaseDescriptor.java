package eu.mondo.sam.core.results;

import org.codehaus.jackson.annotate.JsonProperty;

public class CaseDescriptor {

    @JsonProperty("CaseName")
    protected String caseName;

    @JsonProperty("RunIndex")
    protected int runIndex;

    @JsonProperty("Scenario")
    protected String scenario;

    @JsonProperty("Tool")
    protected String tool;

    @JsonProperty("Size")
    protected int size;

    public String getCaseName() {
	return caseName;
    }

    public void setCaseName(String caseName) {
	this.caseName = caseName;
    }

    public int getRunIndex() {
	return runIndex;
    }

    public void setRunIndex(int runIndex) {
	this.runIndex = runIndex;
    }

    public String getScenario() {
	return scenario;
    }

    public void setScenario(String scenario) {
	this.scenario = scenario;
    }

    public String getTool() {
	return tool;
    }

    public void setTool(String tool) {
	this.tool = tool;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

}
