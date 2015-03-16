package eu.mondo.sam.test.phases;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.TimerMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class MultiplyPhase extends AtomicPhase{

	public MultiplyPhase(String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		TimerMetric timer = new TimerMetric("Time");
		TestDataToken testToken = (TestDataToken) token;
		
		int number = testToken.getNumber();
		
		timer.startMeasure();
		for(int i=1; i<10; i++){
			number *= 2;
		}
		timer.stopMeasure();
		
		testToken.setNumber(number);
		result.addMetrics(timer);
		
	}

}
