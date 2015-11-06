package eu.mondo.sam.test.scenarios;

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
		// CaseDescriptor descriptor = new CaseDescriptor();
		// descriptor.setCaseName("TestCase");
		// descriptor.setRunIndex(1);
		// descriptor.setScenario("TestScenario");
		// descriptor.setSize(1);
		// descriptor.setTool("TestTool");
		// return descriptor;
		CaseDescriptor caseDescriptor = new CaseDescriptor.Builder()
				.caseName("TestCase").runIndex(1).scenario("TestScenario")
				.size(1).tool("TestTool").build();
		return caseDescriptor;
	}
}
