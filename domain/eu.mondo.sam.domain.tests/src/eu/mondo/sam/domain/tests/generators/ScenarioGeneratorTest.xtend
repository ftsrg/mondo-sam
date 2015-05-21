package eu.mondo.sam.domain.tests.generators

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
class ScenarioGeneratorTest {
	
	@Inject IGenerator underTest
    @Inject ParseHelper<Benchmark> parseHelper 
    
	@Inject
  	private ValidationTestHelper helper;
		
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java"))
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "fully/qualified/pack/name/scenarios/structures/TestScenarioStructure.java"))
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenario1Structure.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenario2Structure.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/testscenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/testscenarioStructure.java"))
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
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenario1Structure.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenario2Structure.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/testscenario.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/testscenarioStructure.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic1.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/TestAtomic3.java"))
	}
	
	@Test
	def testAtomicPhaseCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {a1}
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import test.phases.TestAtomic;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new TestAtomic("TestAtomic");
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
			
	}
	
	@Test
	def testAtomicInIterationCodeGenerator(){
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.IterationPhase;
			import test.phases.TestAtomic;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new IterationPhase(1,
							new TestAtomic("TestAtomic"));
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
	
	
	@Test
	def testAtomicInSequenceCodeGenerator(){
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new SequencePhase(
							new TestAtomic("TestAtomic")
					);
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
	
	@Test
	def testIterationInSequenceCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {Sequence(Iteration(3 * a1))}
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.IterationPhase;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new SequencePhase(
							new IterationPhase(3,
									new TestAtomic("TestAtomic"))
					);
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
	
	@Test
	def testSequenceInIterationCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {Iteration(12 * Sequence(a1))}
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.IterationPhase;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new IterationPhase(12,
							new SequencePhase(
									new TestAtomic("TestAtomic")
							));
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
	
	
	@Test
	def testMorePhasesInSequenceCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {
			Sequence(
				a1
				a2
				a3
				Iteration(3 * a1)
			)
		}
		Atomic a1 ClassName TestAtomic1 Metrics()
		Atomic a2 ClassName TestAtomic2 Metrics()
		Atomic a3 ClassName TestAtomic3 Metrics()
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.IterationPhase;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic1;
			import test.phases.TestAtomic2;
			import test.phases.TestAtomic3;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new SequencePhase(
							new TestAtomic1("TestAtomic1")
							,
							new TestAtomic2("TestAtomic2")
							,
							new TestAtomic3("TestAtomic3")
							,
							new IterationPhase(3,
									new TestAtomic1("TestAtomic1"))
					);
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
	
	@Test
	def testMorePhasesInIterationCodeGenerator(){
		val model = parseHelper.parse('''
		package test
		
		Scenario TestScenario {
			Iteration(3 * Sequence(
				a1
				a2
				a3
				)
			)
		}
		Atomic a1 ClassName TestAtomic1 Metrics()
		Atomic a2 ClassName TestAtomic2 Metrics()
		Atomic a3 ClassName TestAtomic3 Metrics()
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
			import test.scenarios.structures.TestScenarioStructure;


			public class TestScenario extends BenchmarkScenario {

				/**
				* Builds an arbitrary phase hierarchy where the leafs represent the
				* AtomicPhase objects.
				*/
				@Override
				public void build() {
					rootPhase = TestScenarioStructure.getPhaseStructure();
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
			
		
		assertEquals(
            '''
			package test.scenarios.structures;

			import eu.mondo.sam.core.phases.BenchmarkPhase;
			import eu.mondo.sam.core.phases.IterationPhase;
			import eu.mondo.sam.core.phases.SequencePhase;
			import test.phases.TestAtomic1;
			import test.phases.TestAtomic2;
			import test.phases.TestAtomic3;

			public class TestScenarioStructure {

				private static BenchmarkPhase rootPhase;
				
				public static BenchmarkPhase getPhaseStructure(){
					rootPhase = new IterationPhase(3,
							new SequencePhase(
									new TestAtomic1("TestAtomic1")
									,
									new TestAtomic2("TestAtomic2")
									,
									new TestAtomic3("TestAtomic3")
							));
					return rootPhase;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/scenarios/structures/TestScenarioStructure.java").toString)
	}
}