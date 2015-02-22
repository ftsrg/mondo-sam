package eu.mondo.sam.test;

import eu.mondo.sam.core.BenchmarkEngine;
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
	
	@BeforeClass
	public static void init(){
		declaration = new DeclarationPhase("Declaration");
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
		builder.setScenario(scenario);
	}
	
	@Test
	public void iterationTest() {
		IterationPhase iter = new IterationPhase(10);
		iter.setPhase(declaration);
		
		runBenchmark(iter);
		assertEquals(10, measuredPhases());
	}

	@Test
	public void sequenceTest() {
		SequencePhase seq = new SequencePhase();
		seq.addPhases(declaration, declaration, declaration, declaration);
		
		runBenchmark(seq);
		assertEquals(4, measuredPhases());
	}
	
	@Test
	public void atomicTest(){
		runBenchmark(declaration);
		assertEquals(1, measuredPhases());
	}
	
	@Test
	public void optionalTest(){
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(true);
		optional.setPhase(declaration);
		
		runBenchmark(optional);
		assertEquals(1, measuredPhases());
	}
	
	@Test
	public void skipOptionalTest(){
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(false);
		optional.setPhase(declaration);
		
		runBenchmark(optional);
		assertEquals(0, measuredPhases());
	}
	
	@Test
	public void complexIterationTest(){
		IterationPhase iter = new IterationPhase(10);
		IterationPhase iter2 = new IterationPhase(2);
		iter2.setPhase(declaration);
		iter.setPhase(iter2);
		
		runBenchmark(iter);
		assertEquals(20, measuredPhases());
	}
	
	@Test
	public void complexSequenceTest(){
		SequencePhase seq = new SequencePhase();
		SequencePhase seq2 = new SequencePhase();
		SequencePhase seq3 = new SequencePhase();
		seq3.addPhases(declaration, declaration);
		seq2.addPhases(declaration, declaration, declaration, seq3);
		seq.addPhases(declaration, seq2, declaration);
		
		runBenchmark(seq);
		assertEquals(7, measuredPhases());
	}
	
	@Test
	public void iterationContainsSequenceTest(){
		IterationPhase iter = new IterationPhase(8);
		SequencePhase seq = new SequencePhase();
		seq.addPhases(declaration, declaration);
		iter.setPhase(seq);
		
		runBenchmark(iter);
		assertEquals(16, measuredPhases());
	}
	
	@Test
	public void sequenceContainsIterationTest(){
		IterationPhase iter = new IterationPhase(8);
		SequencePhase seq = new SequencePhase();
		iter.setPhase(declaration);
		seq.addPhases(declaration, iter);
		
		runBenchmark(seq);;
		assertEquals(9, measuredPhases());
	}
	
	@Test
	public void optionalContainsIterationTest(){
		IterationPhase iter = new IterationPhase(7);
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(true);
		iter.setPhase(declaration);
		optional.setPhase(iter);
		
		runBenchmark(optional);
		assertEquals(7, measuredPhases());
	}
	
	@Test
	public void optionalContainsSequenceTest(){
		SequencePhase seq = new SequencePhase();
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(true);
		seq.addPhases(declaration, declaration, declaration);
		optional.setPhase(seq);
		
		runBenchmark(optional);
		assertEquals(3, measuredPhases());
	}
	
	@Test
	public void sequenceContainsOptionalTest(){
		SequencePhase seq = new SequencePhase();
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(true);
		optional.setPhase(declaration);
		seq.addPhases(declaration, optional, declaration);
		
		runBenchmark(seq);;
		assertEquals(3, measuredPhases());
	}
	
	@Test
	public void iterationContainsOptionalTest(){
		IterationPhase iter = new IterationPhase(7);
		OptionalProtoPhase optional = new OptionalProtoPhase();
		optional.setCondition(true);
		optional.setPhase(declaration);
		iter.setPhase(optional);
		
		runBenchmark(iter);;
		assertEquals(7, measuredPhases());
	}
}
