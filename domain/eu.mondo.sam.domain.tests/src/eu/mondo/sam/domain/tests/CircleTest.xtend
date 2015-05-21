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
class CircleTest {
	
	
	@Inject ParseHelper<Benchmark> parseHelper
 
  	@Inject
  	private ValidationTestHelper helper;
 
  	@Test
  	def testIterations() {
	    val model = parseHelper.parse('''
	    package test.pack 
	    
	    Scenario Name {
	    	it1
	    }
	    Iteration it1 (1 * it2)
	    Iteration it2 (2 * seq)
	    Sequence seq (it1 a1)
	    Atomic a1 ClassName AtomicName Metrics()
	    ''')
		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "circle_in_scenario");
  	}
}