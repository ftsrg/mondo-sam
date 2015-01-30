package eu.mondo.sam.core.phases;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.results.PhaseResult;
import eu.mondo.sam.core.metric.BenchmarkMetric;

public class BenchmarkEngine {

	private BenchmarkResult benchmarkResult;
	private CaseBuilder caseBuilder;
	
	public BenchmarkEngine(CaseBuilder caseBuilder){
		this.caseBuilder = caseBuilder;
	}
	
	public void runBenchmark(){
		benchmarkResult = new BenchmarkResult();
		BenchmarkCase benchmarkCase = caseBuilder.buildCase();
		benchmarkResult.setBenchmarkCase(benchmarkCase);
		for(BenchmarkPhaseGroup group : benchmarkCase.getGroups()){
			for(int i=0; i<group.getLoop(); i++){
				for(BenchmarkPhase phase : group.getPhases()){
					PhaseResult result = new PhaseResult();
					result.setPhaseName(phase.getPhaseName());
					BenchmarkMetric timer = new BenchmarkMetric("Time");
					result.addMetrics(timer);
					long startTime = System.nanoTime();
					try {
						phase.execute(result);
					} catch (PhaseInterruptedException e) {
						continue;
					}
					finally{
						long endTime = System.nanoTime();
						timer.setValue(endTime-startTime);
					}
					benchmarkResult.storeResults(result);
				}
			}
		}
		benchmarkResult.publishResults();
	}

}
