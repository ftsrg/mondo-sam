package eu.mondo.sam.domain.tests

import org.eclipse.xtext.junit4.XtextRunner
import eu.mondo.sam.domain.BenchmarkInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import eu.mondo.sam.domain.benchmark.Benchmark
import org.eclipse.xtext.junit4.util.ParseHelper
import javax.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import eu.mondo.sam.domain.benchmark.BenchmarkPackage

@InjectWith(BenchmarkInjectorProvider)
@RunWith(XtextRunner)
class IterationPhaseTest {
	
	@Inject ParseHelper<Benchmark> parseHelper
 
	@Inject
 	private ValidationTestHelper helper;
	
	@Test
	def testIteration(){
		val model = parseHelper.parse("Iteration Name (0 * 
			Atomic ClassName AtomicName Metrics(
			new Metric metricname
		))")
		helper.assertError(model, BenchmarkPackage.Literals.ITERATION_PHASE, "invalid_iteration");
	}
	
}