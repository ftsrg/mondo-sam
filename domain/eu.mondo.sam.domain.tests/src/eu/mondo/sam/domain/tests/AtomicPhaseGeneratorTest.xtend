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
import org.junit.Ignore

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(BenchmarkInjectorProvider))
class AtomicPhaseGeneratorTest {
	
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic.java"))
	}
	
	@Test
	def testAtomicPhaseCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Atomic a1 ClassName TestAtomic Metrics()
        ''')
		val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        
        assertEquals(
            '''
			package test.phases;

			import eu.mondo.sam.core.phases.AtomicPhase;
			import eu.mondo.sam.core.DataToken;
			import eu.mondo.sam.core.results.PhaseResult;


			public class TestAtomic extends AtomicPhase {
			
			
				public TestAtomic(String phaseName) {
					super(phaseName);
				}
			
				/**
				* Executes the operations which belongs to the AtomicPhase. Communicates
				* with other AtomicPhase operations via the DataToken object. Every
				* significant Metric result should be attached to the PhaseResult parameter
				* as BenchmarkMetric instance. The results of measurements will be
				* published only when the PhaseResult object contains the certain Metrics.
				* @see PhaseResult
				* @see BenchmarkMetric
				* 
				* @param token
				*            Represents a communication unit between this and other phases.
				* @param result
				*            PhaseResult object. In the case of publishing metrics attach
				*            BenchmarkMetric objects to it.
				*/
				@Override
				public void execute(DataToken token, PhaseResult phaseResult) {
					
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic.java").toString)
	}
}