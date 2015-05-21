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


@InjectWith(BenchmarkInjectorProvider)
@RunWith(XtextRunner)
class BasicScenarioStructureTest {
	 
	@Inject ParseHelper<Benchmark> parseHelper
 
  	@Inject
  	private ValidationTestHelper helper;
  	
  	@Test
  	def testScenarioWithAtomicPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName{
  			Atomic ClassName AtomicClass Metrics()
  		}
  		''')
  		helper.assertNoErrors(model)
  	}
  	
  	@Test
  	def testScenarioWithIterationPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName{
  			Iteration (1 * Atomic ClassName AtomicClass Metrics())
  		}
  		''')
  		helper.assertNoErrors(model)
  	}
  	
  	@Test
  	def testScenarioWithSequencePhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName{
  			Sequence (Atomic ClassName AtomicClass Metrics())
  		}
  		''')
  		helper.assertNoErrors(model)
  	} 	
 
 
  	@Test
  	def testScenarioWithoptionalPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName{
  			Optional ClassName OptionalTest (Atomic ClassName AtomicClass Metrics())
  		}
  		''')
  		helper.assertNoErrors(model)
  	} 	
  	
  	@Test
  	def testScenarioWithAttachedAtomicPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName{
  			a1
  		}
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
  	}
  	
  	@Test
  	def testScenarioWithAttachedIterationPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName {
  			iter
  		}
  		Iteration iter (1*a1)
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
  	}

  	@Test
  	def testScenarioWithAttachedOptionalPhase(){
  		val model = parseHelper.parse('''
  		package test.pack
  		Scenario ScenarioName {
  			opt
  		}
  		Optional opt ClassName OptionalTest (a1)
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
  	}
}