package eu.mondo.sam.test.scenarios;

import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class TestScenario extends BenchmarkScenario{

	public TestScenario(String scenario) {
		super(scenario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BenchmarkScenario buildScenario() {
		return null;
	}
	
	public void setRootPhase(BenchmarkPhase phase){
		this.rootPhase = phase;
	}
}
