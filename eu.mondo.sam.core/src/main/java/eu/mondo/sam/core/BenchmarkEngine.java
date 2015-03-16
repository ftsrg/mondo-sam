package eu.mondo.sam.core;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

/**
 * Represents the main engine of MONDO-SAM.
 * 
 * @author Zsolt Kovari
 * 
 */
public class BenchmarkEngine {

	private BenchmarkResult benchmarkResult;
	
	public BenchmarkEngine() {
		benchmarkResult = new BenchmarkResult();
	}
	
	public void runBenchmark(BenchmarkScenario scenario, DataToken token){
		token.init();
		scenario.build();
		benchmarkResult.clear();
		benchmarkResult.setCaseDescriptor(scenario.getCaseDescriptor());
		
		int sequence = 1;
		while(scenario.hasNextPhase()){
			AtomicPhase phase = scenario.getNextPhase();
			if (phase == null){
				continue;
			}
			PhaseResult phaseResult = new PhaseResult();
			phaseResult.setPhaseName(phase.getPhaseName());

			phase.execute(token, phaseResult);
			
			phaseResult.setSequence(sequence);
			
			if (phaseResult.numberOfMetrics() > 0){
				benchmarkResult.addResults(phaseResult);
				sequence++;
			}
		}
		
		benchmarkResult.publishResults();
		token.destroy();
	}

	public BenchmarkResult getBenchmarkResult() {
		return benchmarkResult;
	}
}
