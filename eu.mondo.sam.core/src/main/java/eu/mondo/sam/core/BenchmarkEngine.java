package eu.mondo.sam.core;

import java.io.File;
import java.io.IOException;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;

/**
 * Represents the main engine of the framework. Responsible for executing the
 * AtomicPhase objects which are provided by a BenchmarkScenario instance.
 * 
 * After the evaluations, publish the results of measurement via the
 * BenchmarkResult class.
 * 
 * @see BenchmarkScenario
 * @see BenchmarkResult
 * 
 * @author Zsolt Kovari
 * 
 */
public class BenchmarkEngine {

	/**
	 * Refers a BenchmarkResult instance which is responsible to store the
	 * results of every executed phase and also save them to an external
	 * file.
	 */
	private BenchmarkResult benchmarkResult;

	/**
	 * Instantiates the benchmarkResult variable.
	 */
	public BenchmarkEngine(File resultsDirectory) {
		benchmarkResult = new BenchmarkResult(resultsDirectory);
	}

	/**
	 * Initializes the DataToken at first then builds hierarchy of phases.
	 * 
	 * Executes the AtomicPhase objects' operations in the same order as the
	 * BenchmarkScenario provides them. Always instantiate a new PhaseResult
	 * object for the phases. Finally publish the results via the
	 * BenchmarkResult object.
	 * 
	 * @param scenario
	 *                An instance of BenchmarkScenario,
	 * @param token
	 *                DataToken implementation which acts like a
	 *                communication unit between phases.
	 * @throws IOException
	 */
	public void runBenchmark(BenchmarkScenario scenario, DataToken token)
			throws IOException {
		token.init();
		scenario.build();
		benchmarkResult.removeResults();
		benchmarkResult.setCaseDescriptor(scenario.getCaseDescriptor());

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
				benchmarkResult.addResults(phaseResult);
				sequence++;
			}
		}

		benchmarkResult.publishResults();
		token.destroy();
	}

	/**
	 * Returns a BenchmarkResult object.
	 * 
	 * @return BenchmarkResult, cannot be null.
	 */
	public BenchmarkResult getBenchmarkResult() {
		return benchmarkResult;
	}
}
