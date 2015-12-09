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
	@JsonProperty("Case")
	protected String case_;

	/**
	 * Specifies an index for the current running of benchmark. The
	 * measurements with the same configurations have to differ by the
	 * run value.
	 */
	@JsonProperty("Run")
	protected int run;

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
	 * Specifies the artifact used during benchmarking.
	 */
	@JsonProperty("Artifact")
	protected String artifact;

	/**
	 * 
	 * @return case identifier of benchmark case
	 */
	public String getCase() {
		return case_;
	}

	/**
	 * 
	 * @param case a String identifier
	 */
	public void setCase(final String case_) {
		this.case_ = case_;
	}

	/**
	 * 
	 * @return index of the current run
	 */
	public int getRun() {
		return run;
	}

	/**
	 * 
	 * @param run index of the current run
	 */
	public void setRun(final int run) {
		this.run = run;
	}

	/**
	 * 
	 * @return scenario identifier of scenario
	 */
	public String getScenario() {
		return scenario;
	}

	/**
	 * 
	 * @param scenario
	 *                a String identifier
	 */
	public void setScenario(final String scenario) {
		this.scenario = scenario;
	}

	/**
	 * 
	 * @return tool identifier of tool
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * 
	 * @param tool a String identifier
	 */
	public void setTool(final String tool) {
		this.tool = tool;
	}

	/**
	 * 
	 * @return the artifact used in the benchmark
	 */
	public String getArtifact() {
		return artifact;
	}

	/**
	 * Sets the artifact of the model on which the benchmark executes.
	 * 
	 * @param artifact
	 */
	public void setArtifact(final String artifact) {
		this.artifact = artifact;
	}

	public static class Builder {
		private String case_;
		private int run;
		private String scenario;
		private String tool;
		private String artifact;		
		
		public Builder() {
		}
		
		public Builder case_(final String case_) {
			this.case_ = case_;
			return this;			
		}
		
		public Builder run(final int run) {
			this.run = run;
			return this;
		}
		
		public Builder scenario(final String scenario) {
			this.scenario = scenario;
			return this;
		}
		
		public Builder tool(final String tool) {
			this.tool = tool;
			return this;
		}
		
		public Builder artifact(final String artifact) {
			this.artifact = artifact;
			return this;
		}
		
		public CaseDescriptor build() {
			return new CaseDescriptor(this);
		}
	}

	private CaseDescriptor(final Builder builder) {
		case_ = builder.case_;
		run = builder.run;
		scenario = builder.scenario;
		tool = builder.tool;
		artifact = builder.artifact;
	}

}
