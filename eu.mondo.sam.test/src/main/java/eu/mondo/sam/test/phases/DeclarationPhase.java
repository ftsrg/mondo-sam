package eu.mondo.sam.test.phases;

import java.util.Random;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class DeclarationPhase extends AtomicPhase{

	public DeclarationPhase(String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		TestDataToken testToken = (TestDataToken) token;
		Random random = new Random();
		testToken.setNumber(random.nextInt(1000));
	}

}
