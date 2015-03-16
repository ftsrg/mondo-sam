package eu.mondo.sam.test.phases;

import java.util.Random;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class DeclarationPhase extends AtomicPhase{

	public DeclarationPhase(String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		ScalarMetric scalar = new ScalarMetric("Value");
		TestDataToken testToken = (TestDataToken) token;
		
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		testToken.setNumber(randomNumber);
		
		scalar.setValue(randomNumber);
		result.addMetrics(scalar);
	}

}
