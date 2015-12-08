package eu.mondo.sam.examples.calculator;

import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.CaseDescriptor;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class TestScenario extends BenchmarkScenario {

	public void build() {
	}

	public void setRootPhase(BenchmarkPhase phase) {
		this.rootPhase = phase;
	}

	@Override
	public CaseDescriptor getCaseDescriptor() {
		CaseDescriptor caseDescriptor = new CaseDescriptor.Builder()
				.caseName("TestCase").runIndex(1).scenario("TestScenario")
				.size(1).tool("TestTool").build();
		return caseDescriptor;
	}
	
}
