package eu.mondo.sam.examples.calculator;

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
		final CaseDescriptor caseDescriptor = new CaseDescriptor.Builder() //
				.case_("MyCase") //
				.run(1) //
				.scenario("MyScenario") //
				.artifact("1") //
				.tool("MyTool") //
				.build();
		return caseDescriptor;
	}

}
