package eu.mondo.sam.test.phases;

import eu.mondo.sam.core.DataToken;
import eu.mondo.sam.core.metrics.ScalarMetric;
import eu.mondo.sam.core.phases.OptionalPhase;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.test.TestDataToken;

public class ClearancePhase extends OptionalPhase{

	private boolean condition;
	
	public ClearancePhase() {
		phase = new ClearanceAtomicPhase("Clearance Phase");
		condition = false;
	}
	
	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	
	@Override
	public boolean condition() {
		return condition;
	}
	
	private class ClearanceAtomicPhase extends AtomicPhase{

		public ClearanceAtomicPhase(String phaseName) {
			super(phaseName);
		}

		@Override
		public void execute(DataToken token, PhaseResult result) {
			TestDataToken testToken = (TestDataToken) token;
			ScalarMetric scalar = new ScalarMetric("Value");
			
			testToken.setNumber(0);
			scalar.setValue(0);
			
			result.addMetrics(scalar);
		}
		
	}

}
