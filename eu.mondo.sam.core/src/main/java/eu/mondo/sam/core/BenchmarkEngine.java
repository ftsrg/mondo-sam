package eu.mondo.sam.core;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import eu.mondo.sam.core.scenarios.ScenarioBuilder;
import eu.mondo.sam.core.metrics.BenchmarkMetric;
import eu.mondo.sam.core.metrics.TimerMetric;


public class BenchmarkEngine {

	private BenchmarkResult benchmarkResult;
	private ScenarioBuilder scenarioBuilder;
	
	public BenchmarkEngine(ScenarioBuilder scenarioBuilder){
		this.scenarioBuilder = scenarioBuilder;
	}
	
	public void runBenchmark(){
		benchmarkResult = new BenchmarkResult();
		BenchmarkScenario benchmarkScenario = scenarioBuilder.getScenario();
		benchmarkResult.setBenchmarkScenario(benchmarkScenario);
		
		int iteration = 1;
		while(benchmarkScenario.hasNextPhase()){
			AtomicPhase phase = benchmarkScenario.getNextPhase();
			if (phase == null){
				continue;
			}
			PhaseResult result = new PhaseResult();
			result.setPhaseName(phase.getPhaseName());

			phase.execute();
			
			for (BenchmarkMetric m : phase.getMetrics())
				result.addMetrics(m);
			result.setSequence(iteration);
			benchmarkResult.addResults(result);

			iteration++;
		}
		benchmarkResult.publishResults();
	}

	public BenchmarkResult getBenchmarkResult() {
		return benchmarkResult;
	}
}
