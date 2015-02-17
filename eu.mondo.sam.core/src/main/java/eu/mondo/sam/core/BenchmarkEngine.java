package eu.mondo.sam.core;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.metric.TimerMetric;
import eu.mondo.sam.core.metric.BenchmarkMetric;


public class BenchmarkEngine {

	private BenchmarkResult benchmarkResult;
	private CaseBuilder caseBuilder;
	
	public BenchmarkEngine(CaseBuilder caseBuilder){
		this.caseBuilder = caseBuilder;
	}
	
	public void runBenchmark(){
		benchmarkResult = new BenchmarkResult();
		BenchmarkCase benchmarkCase = caseBuilder.getCase();
		benchmarkResult.setBenchmarkCase(benchmarkCase);
		
		
		
		int iteration = 1;
		
		while(benchmarkCase.hasPhase()){
			AtomicPhase phase = benchmarkCase.getNextPhase();
			if (phase != null){
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
		}
		benchmarkResult.publishResults();
	}

}
