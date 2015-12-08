package eu.mondo.sam.core;

import java.io.File;
import java.io.IOException;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

/**
 * Represents the main engine of the framework. Responsible for executing the AtomicPhase objects which are
 * provided by a BenchmarkScenario instance.
 * 
 * After the evaluations, publish the results of measurement via the BenchmarkResult class.
 * 
 * @see BenchmarkScenario
 * @see BenchmarkResult
 * 
 * @author Zsolt Kovari
 * 
 */
public class BenchmarkEngine {

	public BenchmarkEngine() {
	}

	public void runBenchmark(final BenchmarkResult result, final BenchmarkScenario scenario,
			final DataToken token) throws IOException {
		token.init();
		scenario.build();
		result.removeResults();
		result.setCaseDescriptor(scenario.getCaseDescriptor());

		int sequence = 1;
		scenario.resetIterator();
		while (scenario.hasNextPhase()) {
			AtomicPhase phase = scenario.getNextPhase();
			if (phase == null) {
				continue;
			}
			PhaseResult phaseResult = new PhaseResult();
			phaseResult.setPhaseName(phase.getPhaseName());

			phase.execute(token, phaseResult);

			phaseResult.setSequence(sequence);

			if (phaseResult.numberOfMetrics() > 0) {
				result.addResults(phaseResult);
				sequence++;
			}
		}

		result.publish();
		token.destroy();
	}

}
