package eu.mondo.sam.test;

import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class TestScenario extends BenchmarkScenario{

	public TestScenario(String scenario) {
		super(scenario);
	}

	@Override
	public BenchmarkScenario buildScenario() {
		return this;
	}

	public void setRootPhase(BenchmarkPhase phase){
		this.rootPhase = phase;
	}
	
}
