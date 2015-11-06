package eu.mondo.sam.examples.calculator;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;

/**
 * TODO add Javadoc
 * @author szarnyasg
 *
 */
public class DeclarationPhase extends AtomicPhase {

	public DeclarationPhase(String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		ScalarMetric scalar = new ScalarMetric("Value");
//		TimeMetric time = new TimeMetric("Time");
		NumberToken numberToken = (NumberToken) token;

		int number = 42;
		numberToken.setNumber(number);

		scalar.setValue(number);
//		result.addMetrics(scalar, time);
	}

}
