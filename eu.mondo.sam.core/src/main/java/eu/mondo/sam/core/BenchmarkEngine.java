package eu.mondo.sam.core;

import java.util.concurrent.TimeUnit;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.metric.TimerMetric;
import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.PhaseInterruptedException;
import eu.mondo.sam.core.phases.BenchmarkPhaseGroup;



public class BenchmarkEngine {

	private BenchmarkResult benchmarkResult;
	private CaseBuilder caseBuilder;
	
	public BenchmarkEngine(CaseBuilder caseBuilder){
		this.caseBuilder = caseBuilder;
	}
	
	public void runBenchmark() throws CloneNotSupportedException{
		benchmarkResult = new BenchmarkResult();
		BenchmarkCase benchmarkCase = caseBuilder.getCase();
		benchmarkResult.setBenchmarkCase(benchmarkCase);
		
		int iteration = 1;
		for(BenchmarkPhaseGroup group : benchmarkCase.getGroups()){
			for(int i=0; i<group.getLoop(); i++){
				for(BenchmarkPhase phase : group.getPhases()){
					PhaseResult result = new PhaseResult();
					result.setPhaseName(phase.getPhaseName());
					TimerMetric timer = new TimerMetric("Time");
					
					timer.startMeasure();
					try {
						phase.execute();
					} catch (PhaseInterruptedException e) {
						continue;
					}
					finally{
						timer.stopMeasure();
					}
					for (BenchmarkMetric m : phase.getMetrics()){
						result.addMetrics(m);
					}
					result.addMetrics(timer);
					result.setSequence(iteration, i+1);
					benchmarkResult.addResults(result);
				}
			}
			iteration++;
		}
		benchmarkResult.publishResults();
	}

}
