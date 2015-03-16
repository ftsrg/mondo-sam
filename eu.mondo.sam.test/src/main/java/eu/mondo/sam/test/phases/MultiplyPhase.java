package eu.mondo.sam.test.phases;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class MultiplyPhase extends AtomicPhase{

	public MultiplyPhase(String phaseName) {
		super(phaseName);
	}

	@Override
	public void execute(DataToken token, PhaseResult result) {
		TestDataToken testToken = (TestDataToken) token;
		
		int number = testToken.getNumber();
		
		for(int i=1; i<10; i++){
			number *= 2;
		}
		
		testToken.setNumber(number);
		
	}

}
