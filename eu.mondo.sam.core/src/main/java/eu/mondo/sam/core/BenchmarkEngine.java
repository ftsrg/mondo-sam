package eu.mondo.sam.core;

import java.util.concurrent.TimeUnit;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.metric.BenchmarkMetric;
import eu.mondo.sam.core.phases.PhaseInterruptedException;
import eu.mondo.sam.core.phases.BenchmarkPhaseGroup;

import com.google.common.base.Stopwatch;

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
					BenchmarkMetric timer = new BenchmarkMetric("Time");
					
					Stopwatch stopwatch = Stopwatch.createStarted();
					
					try {
						phase.execute();
					} catch (PhaseInterruptedException e) {
						continue;
					}
					finally{
						stopwatch.stop();
					}
					long time = stopwatch.elapsed(TimeUnit.NANOSECONDS);
					timer.setValue(time);
					for (BenchmarkMetric m : phase.getMetrics()){
						if (m.isMeasured())
							result.addMetrics(m.clone());
					}
					result.addMetrics(timer);
					result.setSequence(iteration, i+1);
					benchmarkResult.storeResults(result);
				}
			}
			iteration++;
		}
		benchmarkResult.publishResults();
	}

}
