package eu.mondo.sam.test.phases;

import java.util.Random;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

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
		MemoryMetric memory = new MemoryMetric("Memory");
		TestDataToken testToken = (TestDataToken) token;

		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		testToken.setNumber(randomNumber);

		MemoryMetric.setNumberOfGC(1);
		memory.measure();
		scalar.setValue(randomNumber);
		result.addMetrics(scalar, memory);
	}

}
