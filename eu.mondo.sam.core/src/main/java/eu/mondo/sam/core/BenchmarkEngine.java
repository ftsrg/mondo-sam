package eu.mondo.sam.core;

import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import eu.mondo.sam.core.scenarios.ScenarioBuilder;
import eu.mondo.sam.core.metric.TimerMetric;
import eu.mondo.sam.core.metric.BenchmarkMetric;


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
			System.out.println(phase);
			PhaseResult result = new PhaseResult();
			result.setPhaseName(phase.getPhaseName());

			TimerMetric timer = new TimerMetric("Time");

			timer.startMeasure();
			phase.execute();
			timer.stopMeasure();

			for (BenchmarkMetric m : phase.getMetrics())
				result.addMetrics(m);
			result.addMetrics(timer);
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
