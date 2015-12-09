package eu.mondo.sam.examples.calculator;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.metrics.TimeMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

/**
 * TODO add Javadoc
 * 
 * @author szarnyasg
 *
 */
public class CalculationPhase extends AtomicPhase {

	public CalculationPhase(final String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(final DataToken token, final PhaseResult result) {
		final ScalarMetric resultMetric = new ScalarMetric("Result");
		final TimeMetric timeMetric = new TimeMetric("Time");	
		
		timeMetric.startMeasure();
		final int number = 1 + 2 + 3;
		timeMetric.stopMeasure();
		
		final NumberToken numberToken = (NumberToken) token;
		numberToken.setNumber(number);
		resultMetric.setValue(number);
		
		result.addMetrics(resultMetric, timeMetric);
	}

}
