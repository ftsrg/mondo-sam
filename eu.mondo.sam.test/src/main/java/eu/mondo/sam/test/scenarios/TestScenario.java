package eu.mondo.sam.test.scenarios;

import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.CaseDescriptor;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

public class TestScenario extends BenchmarkScenario {

	@Override
	public void build() {
	}

	public void setRootPhase(final BenchmarkPhase phase) {
		this.rootPhase = phase;
	}

	@Override
	public CaseDescriptor getCaseDescriptor() {
		final CaseDescriptor caseDescriptor = new CaseDescriptor.Builder()
				.case_("TestCase").run(1).scenario("TestScenario")
				.artifact("1").tool("TestTool").build();
		return caseDescriptor;
	}
}
