package eu.mondo.sam.core.results;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Provides the most important parameters about benchmarking, thus describing
 * the current execution of measurement.
 * 
 * @author Zsolt Kovari
 *
 */
public class CaseDescriptor {

	/**
	 * Specifies the name of the current case during benchmarking. The case
	 * affect mostly a functionality of phases.
	 */
	@JsonProperty("CaseName")
	protected String caseName;

	/**
	 * Specifies an index for the current running of benchmark. The
	 * measurements with the same configurations have to differ by the
	 * runIndex value.
	 */
	@JsonProperty("RunIndex")
	protected int runIndex;

	/**
	 * Identifies the scenario after its name.
	 */
	@JsonProperty("Scenario")
	protected String scenario;

	/**
	 * Represents the name of the measured tool.
	 */
	@JsonProperty("Tool")
	protected String tool;

	/**
	 * Specifies the size of the used model during benchmarking.
	 */
	@JsonProperty("Size")
	protected int size;

	/**
	 * Returns the identifier of benchmark case.
	 * 
	 * @return caseName identifier of benchmark case
	 */
	public String getCaseName() {
		return caseName;
	}

	/**
	 * Adjusts a benchmark case.
	 * 
	 * @param caseName
	 *                a String identifier
	 */
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	/**
	 * Returns the value of the current index of running.
	 * 
	 * @return runIndex current index of running
	 */
	public int getRunIndex() {
		return runIndex;
	}

	/**
	 * Sets the the current index of benchmark running.
	 * 
	 * @param runIndex
	 *                current index
	 */
	public void setRunIndex(int runIndex) {
		this.runIndex = runIndex;
	}

	/**
	 * Returns name identifier of scenario.
	 * 
	 * @return scenario identifier of scenario
	 */
	public String getScenario() {
		return scenario;
	}

	/**
	 * Adjusts a benchmark scenario.
	 * 
	 * @param scenario
	 *                a String identifier
	 */
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	/**
	 * Returns name identifier of tool.
	 * 
	 * @return tool identifier of tool
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * Adjusts the name the measured tool.
	 * 
	 * @param tool
	 *                a String identifier
	 */
	public void setTool(String tool) {
		this.tool = tool;
	}

	/**
	 * Returns the size of the currently used model.
	 * 
	 * @return size the size of the used model
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Sets the size of the model on which the benchmark executes.
	 * 
	 * @param size
	 *                an integer value of size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public static class Builder {
		private String caseName;
		private int runIndex;
		private String scenario;
		private String tool;
		private int size;		
		
		public Builder() {
		}
		
		public Builder caseName(String caseName) {
			this.caseName = caseName;
			return this;			
		}
		
		public Builder runIndex(int runIndex) {
			this.runIndex = runIndex;
			return this;
		}
		
		public Builder scenario(String scenario) {
			this.scenario = scenario;
			return this;
		}
		
		public Builder tool(String tool) {
			this.tool = tool;
			return this;
		}
		
		public Builder size(int size) {
			this.size = size;
			return this;
		}
		
		public CaseDescriptor build() {
			return new CaseDescriptor(this);
		}
	}

	private CaseDescriptor(Builder builder) {
		caseName = builder.caseName;
		runIndex = builder.runIndex;
		scenario = builder.scenario;
		tool = builder.tool;
		size = builder.size;
	}

}
