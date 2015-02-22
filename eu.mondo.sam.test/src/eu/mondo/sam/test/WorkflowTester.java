package eu.mondo.sam.test;

import eu.mondo.sam.core.BenchmarkEngine;
import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.TimerMetric;
import eu.mondo.sam.core.phases.AtomicPhase;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.IterationPhase;
import eu.mondo.sam.core.phases.SequencePhase;
import eu.mondo.sam.core.results.BenchmarkResult;
import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import eu.mondo.sam.proto.DeclarationPhase;
import eu.mondo.sam.proto.OptionalProtoPhase;
import eu.mondo.sam.proto.ProtoConfig;
import eu.mondo.sam.proto.ProtoScenario;
import eu.mondo.sam.proto.ProtoScenarioBuilder;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WorkflowTester {
	
	private static TestScenarioBuilder builder; 
	private static BenchmarkEngine engine;
	private static DeclarationPhase declaration;
	
	private TestScenario scenario;
	private IterationPhase iteration;
	private IterationPhase iteration2;
	private IterationPhase iteration3;
	private SequencePhase sequence;
	private SequencePhase sequence2;
	private SequencePhase sequence3;
	private OptionalProtoPhase skippedOptional;
	private OptionalProtoPhase optional;
	
	@BeforeClass
	public static void init(){
		declaration = new DeclarationPhase("Declaration");
		TimerMetric timer = new TimerMetric("Time");
		MemoryMetric memory = new MemoryMetric("Memory");
		declaration.addMetrics(timer, memory);
		
		builder = new TestScenarioBuilder();
		engine = new BenchmarkEngine(builder);
		BenchmarkResult.setPublish(false);
	}
	
	public int measuredPhases(){
		return engine.getBenchmarkResult().getPhaseResults().size();
	}
	
	public void runBenchmark(BenchmarkPhase rootPhase){
		scenario.setRootPhase(rootPhase);
		engine.runBenchmark();
	}
	
	@Before
	public void instantiateScenario(){
		scenario = new TestScenario("TestScenario");
		iteration = new IterationPhase(10);
		iteration2 = new IterationPhase(2);
		iteration3 = new IterationPhase(20);
		sequence = new SequencePhase();
		sequence2 = new SequencePhase();
		sequence3 = new SequencePhase();
		skippedOptional = new OptionalProtoPhase();
		skippedOptional.setCondition(false);
		optional = new OptionalProtoPhase();
		optional.setCondition(true);
		builder.setScenario(scenario);
	}
	
	@Test
	public void iterationTest() {
		iteration.setPhase(declaration);
		
		runBenchmark(iteration);
		assertEquals(10, measuredPhases());
	}

	@Test
	public void sequenceTest() {
		sequence.addPhases(declaration, declaration, declaration, declaration);
		
		runBenchmark(sequence);
		assertEquals(4, measuredPhases());
	}
	
	@Test
	public void atomicTest(){
		runBenchmark(declaration);
		assertEquals(1, measuredPhases());
	}
	
	@Test
	public void optionalTest(){
		optional.setPhase(declaration);
		
		runBenchmark(optional);
		assertEquals(1, measuredPhases());
	}
	
	@Test
	public void skipOptionalTest(){
		skippedOptional.setPhase(declaration);
		
		runBenchmark(skippedOptional);
		assertEquals(0, measuredPhases());
	}
	
	@Test
	public void complexIterationTest(){
		iteration2.setPhase(declaration);
		iteration.setPhase(iteration2);
		
		runBenchmark(iteration);
		assertEquals(20, measuredPhases());
	}
	
	@Test
	public void complexSequenceTest(){
		sequence3.addPhases(declaration, declaration);
		sequence2.addPhases(declaration, declaration, declaration, sequence3);
		sequence.addPhases(declaration, sequence2, declaration);
		
		runBenchmark(sequence);
		assertEquals(7, measuredPhases());
	}
	
	@Test
	public void iterationContainsSequenceTest(){
		sequence.addPhases(declaration, declaration);
		iteration.setPhase(sequence);
		
		runBenchmark(iteration);
		assertEquals(20, measuredPhases());
	}
	
	@Test
	public void sequenceContainsIterationTest(){
		iteration.setPhase(declaration);
		sequence.addPhases(declaration, iteration);
		
		runBenchmark(sequence);
		assertEquals(11, measuredPhases());
	}
	
	@Test
	public void optionalContainsIterationTest(){
		iteration.setPhase(declaration);
		optional.setPhase(iteration);
		
		runBenchmark(optional);
		assertEquals(10, measuredPhases());
	}
	
	@Test
	public void optionalContainsSequenceTest(){
		sequence.addPhases(declaration, declaration, declaration);
		optional.setPhase(sequence);
		
		runBenchmark(optional);
		assertEquals(3, measuredPhases());
	}
	
	@Test
	public void sequenceContainsOptionalTest(){
		optional.setPhase(declaration);
		sequence.addPhases(declaration, optional, declaration);
		
		runBenchmark(sequence);;
		assertEquals(3, measuredPhases());
	}
	
	@Test
	public void iterationContainsOptionalTest(){
		optional.setPhase(declaration);
		iteration.setPhase(optional);
		
		runBenchmark(iteration);
		assertEquals(10, measuredPhases());
	}
	
	@Test
	public void complexTest(){
		sequence.addPhases(iteration, declaration, optional, sequence3);
		iteration.setPhase(sequence2);
		sequence2.addPhases(declaration, declaration, iteration2);
		iteration2.setPhase(skippedOptional);
		skippedOptional.setPhase(declaration);
		optional.setPhase(iteration3);
		iteration3.setPhase(declaration);
		sequence3.addPhases(declaration, declaration);
		
		runBenchmark(sequence);
		assertEquals(43, measuredPhases());
	}
}
