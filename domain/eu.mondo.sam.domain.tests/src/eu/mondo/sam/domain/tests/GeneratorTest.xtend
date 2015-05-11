package eu.mondo.sam.domain.tests

import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import eu.mondo.sam.domain.benchmark.Benchmark
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import eu.mondo.sam.domain.BenchmarkInjectorProvider
import static org.junit.Assert.*
import org.junit.Test
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(BenchmarkInjectorProvider))
class GeneratorTest {
	
	@Inject IGenerator underTest
    @Inject ParseHelper<Benchmark> parseHelper 
    
	@Inject
  	private ValidationTestHelper helper;
	
	@Test
	def testAtomicPhaseGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Atomic a1 ClassName TestAtomic Metrics()
        ''')
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
//        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"test/scenarios/TestScenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"test/phases/TestAtomic.java"))
	}
	
	@Test
	def testScenarioGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {a1}
		
		Atomic a1 ClassName TestAtomic Metrics()
        ''')
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"test/scenarios/TestScenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"test/phases/TestAtomic.java"))
	}
}