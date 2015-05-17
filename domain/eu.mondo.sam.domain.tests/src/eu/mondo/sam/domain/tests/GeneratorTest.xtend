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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic.java"))
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic.java"))
	}

	@Test
	def testPackageGenerator(){
		val model = parseHelper.parse('''
		package fully.qualified.pack.name
		
		Scenario TestScenario {a1}
		
		Atomic a1 ClassName TestAtomic Metrics()
        ''')
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "fully/qualified/pack/name/scenarios/TestScenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "fully/qualified/pack/name/phases/TestAtomic.java"))
	}

	@Test
	def testMoreScenarioGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario1 {a1 }
		
		Scenario TestScenario2 {a1}
		
		Scenario testscenario {a1}
		
		Atomic a1 ClassName TestAtomic Metrics()
		''')
		
		val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario1.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/testscenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic.java"))
		
	}
	
	@Test
	def testMoreAtomicPhaseGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario1 {a1 }
		
		Scenario TestScenario2 {a2}
		
		Scenario testscenario {Iteration (3 * a3)}
		
		Atomic a1 ClassName TestAtomic1 Metrics()
		Atomic a2 ClassName TestAtomic2 Metrics()
		Atomic a3 ClassName TestAtomic3 Metrics()
		''')
		
		val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario1.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/testscenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic1.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic3.java"))
	}
	
	@Test
	def testAtomicInIteration(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {Iteration(1 * a1)}
		Atomic a1 ClassName TestAtomic Metrics()
		'''
		)
		
		
		val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
		
		assertEquals(
            '''
			package test.scenarios;

			import eu.mondo.sam.core.scenarios.BenchmarkScenario;
			import eu.mondo.sam.core.results.CaseDescriptor;
			import eu.mondo.sam.core.phases.IterationPhase;
			import test.phases.TestAtomic;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = new IterationPhase(1, 
							new TestAtomic("TestAtomic"));
				}

				/**
				* Instantiates a CaseDescriptor object.
				* @see CaseDescriptor
				* 
				* @return CaseDescriptor with every one of its field being initialized.
				*/
				@Override
				public CaseDescriptor getCaseDescriptor() {
					// TODO Instantiates a CaseDescriptor object
					return null;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario.java").toString)
	}
	
	
	@Test
	def testAtomicInSequence(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {Sequence(a1)}
		Atomic a1 ClassName TestAtomic Metrics()
		'''
		)
		
		
		val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
		
		assertEquals(
            '''
			package test.scenarios;

			import eu.mondo.sam.core.scenarios.BenchmarkScenario;
			import eu.mondo.sam.core.results.CaseDescriptor;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = new SequencePhase(
							new TestAtomic("TestAtomic")
					);
				}

				/**
				* Instantiates a CaseDescriptor object.
				* @see CaseDescriptor
				* 
				* @return CaseDescriptor with every one of its field being initialized.
				*/
				@Override
				public CaseDescriptor getCaseDescriptor() {
					// TODO Instantiates a CaseDescriptor object
					return null;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario.java").toString)
		
	}
	
}