package eu.mondo.sam.test.phases;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class MultiplyPhase extends AtomicPhase {

    public MultiplyPhase(String phaseName) {
	super(phaseName);
    }

    @Override
    public void execute(DataToken token, PhaseResult result) {
	TimeMetric timer = new TimeMetric("Time");
	MemoryMetric memory = new MemoryMetric("Memory");

	TestDataToken testToken = (TestDataToken) token;

	int number = testToken.getNumber();

	timer.startMeasure();
	for (int i = 1; i < 10; i++) {
	    number *= 2;
	}
	timer.stopMeasure();
	memory.measure();

	testToken.setNumber(number);
	result.addMetrics(timer, memory);

    }

}
