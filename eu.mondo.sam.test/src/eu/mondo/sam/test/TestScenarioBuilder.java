package eu.mondo.sam.test;

import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import eu.mondo.sam.core.scenarios.ScenarioBuilder;

public class TestScenarioBuilder implements ScenarioBuilder{

	private TestScenario scenario;
	
	@Override
	public BenchmarkScenario getScenario() {
		return scenario;
	}
	
	public void setScenario(TestScenario scenario) {
		this.scenario = scenario;
	}
}
