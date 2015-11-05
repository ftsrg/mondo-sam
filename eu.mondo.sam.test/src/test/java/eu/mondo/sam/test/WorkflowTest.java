package eu.mondo.sam.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.mondo.sam.core.BenchmarkEngine;
import eu.mondo.sam.core.phases.BenchmarkPhase;
import eu.mondo.sam.core.phases.IterationPhase;
import eu.mondo.sam.core.phases.SequencePhase;
import eu.mondo.sam.test.phases.ClearancePhase;
import eu.mondo.sam.test.phases.DeclarationPhase;
import eu.mondo.sam.test.scenarios.TestScenario;

public class WorkflowTest {

	private static BenchmarkEngine engine;
	private static DeclarationPhase declaration;

	private TestScenario scenario;
	private static TestDataToken token;

	private IterationPhase iteration;
	private IterationPhase iteration2;
	private IterationPhase iteration3;
	private SequencePhase sequence;
	private SequencePhase sequence2;
	private SequencePhase sequence3;
	private ClearancePhase skippedOptional;
	private ClearancePhase optional;

	@BeforeClass
	public static void init() {
		declaration = new DeclarationPhase("Declaration");
		token = new TestDataToken();
		engine = new BenchmarkEngine();
	}

	public int measuredPhases() {
		return engine.getBenchmarkResult().getPhaseResults().size();
	}

	public void runBenchmark(final BenchmarkPhase rootPhase) throws IOException {
		scenario.setRootPhase(rootPhase);
		engine.runBenchmark(scenario, token);
	}

	@Before
	public void instantiateScenario() {
		scenario = new TestScenario();
		iteration = new IterationPhase(10);
		iteration2 = new IterationPhase(2);
		iteration3 = new IterationPhase(20);
		sequence = new SequencePhase();
		sequence2 = new SequencePhase();
		sequence3 = new SequencePhase();
		skippedOptional = new ClearancePhase();
		skippedOptional.setCondition(false);
		optional = new ClearancePhase();
		optional.setCondition(true);
	}

	@Test
	public void iterationTest() throws IOException {
		iteration.setPhase(declaration);

		runBenchmark(iteration);
		assertEquals(10, measuredPhases());
	}

	@Test
	public void sequenceTest() throws IOException {
		sequence.addPhases(declaration, declaration, declaration, declaration);

		runBenchmark(sequence);
		assertEquals(4, measuredPhases());
	}

	@Test
	public void atomicTest() throws IOException {
		runBenchmark(declaration);
		assertEquals(1, measuredPhases());
	}

	@Test
	public void optionalTest() throws IOException {
		optional.setPhase(declaration);

		runBenchmark(optional);
		assertEquals(1, measuredPhases());
	}

	@Test
	public void skipOptionalTest() throws IOException {
		skippedOptional.setPhase(declaration);

		runBenchmark(skippedOptional);
		assertEquals(0, measuredPhases());
	}

	@Test
	public void complexIterationTest() throws IOException {
		iteration2.setPhase(declaration);
		iteration.setPhase(iteration2);

		runBenchmark(iteration);
		assertEquals(20, measuredPhases());
	}

	@Test
	public void complexSequenceTest() throws IOException {
		sequence3.addPhases(declaration, declaration);
		sequence2.addPhases(declaration, declaration, declaration, sequence3);
		sequence.addPhases(declaration, sequence2, declaration);

		runBenchmark(sequence);
		assertEquals(7, measuredPhases());
	}

	@Test
	public void iterationContainsSequenceTest() throws IOException {
		sequence.addPhases(declaration, declaration);
		iteration.setPhase(sequence);

		runBenchmark(iteration);
		assertEquals(20, measuredPhases());
	}

	@Test
	public void sequenceContainsIterationTest() throws IOException {
		iteration.setPhase(declaration);
		sequence.addPhases(declaration, iteration);

		runBenchmark(sequence);
		assertEquals(11, measuredPhases());
	}

	@Test
	public void optionalContainsIterationTest() throws IOException {
		iteration.setPhase(declaration);
		optional.setPhase(iteration);

		runBenchmark(optional);
		assertEquals(10, measuredPhases());
	}

	@Test
	public void optionalContainsSequenceTest() throws IOException {
		sequence.addPhases(declaration, declaration, declaration);
		optional.setPhase(sequence);

		runBenchmark(optional);
		assertEquals(3, measuredPhases());
	}

	@Test
	public void sequenceContainsOptionalTest() throws IOException {
		optional.setPhase(declaration);
		sequence.addPhases(declaration, optional, declaration);

		runBenchmark(sequence);
		assertEquals(3, measuredPhases());
	}

	@Test
	public void iterationContainsOptionalTest() throws IOException {
		optional.setPhase(declaration);
		iteration.setPhase(optional);

		runBenchmark(iteration);
		assertEquals(10, measuredPhases());

	}

	@Test
	public void complexTest() throws IOException {
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
