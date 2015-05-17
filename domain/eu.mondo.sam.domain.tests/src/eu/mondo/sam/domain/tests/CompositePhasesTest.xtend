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
class CompositePhasesTest {
	
	@Inject ParseHelper<Benchmark> parseHelper
 
	@Inject
 	private ValidationTestHelper helper;
 	
 	@Test
 	def testAtomicPhase(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
 	} 	

 	@Test
 	def testAtomicInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 * Atomic a1 ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedAtomicInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 *a1) 
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAtomicInOptional(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Optional ClassName OptionalTest (Atomic a1 ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedAtomicInOptional(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Optional ClassName OptionalTest (a1) 
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAtomicInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence (Atomic a1 ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedAtomicInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence (a1) 
  		Atomic a1 ClassName AtomicClass Metrics()
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testMoreAtomicInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence (a1 a2 Atomic ClassName AtomicClass3 Metrics()) 
  		Atomic a1 ClassName AtomicClass Metrics()
  		Atomic a2 ClassName AtomicClass2 Metrics()
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testOptinalInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 * Optional ClassName OptionalTest (Atomic a1 ClassName AtomicClass Metrics()))
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedOptionalInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 *o1) 
  		Optional o1 ClassName OptionalTest (Atomic ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testSequenceInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 * Sequence (Atomic a1 ClassName AtomicClass Metrics()))
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedSequenceInIteration(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Iteration (1 *s1) 
  		Sequence s1 (Atomic ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testCompositesInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence (
  			Iteration (1 * Atomic a1 ClassName AtomicClass Metrics())
  			Optional ClassName OptionalTest (Atomic a1 ClassName AtomicClass Metrics())
  			Sequence (Atomic a1 ClassName AtomicClass Metrics())
  			)
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testAttachedCompositesInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence s1 (it op seq)
  		
  		Iteration it (1 * Atomic a1 ClassName AtomicClass Metrics())
  		Optional op ClassName OptionalTest (Atomic a1 ClassName AtomicClass Metrics())
  		Sequence seq (Atomic a1 ClassName AtomicClass Metrics())
  		''')
  		helper.assertNoErrors(model)
 	}
 	
 	@Test
 	def testSamePhasesInSequence(){
 		val model = parseHelper.parse('''
  		package test.pack
  		
  		Sequence (it a1 a1 a1 it)
  			Iteration it (10 * a1)
  			
  			Atomic a1 ClassName AtomicClass Metrics()
  			
  		''')
  		helper.assertNoErrors(model)
 	}
}
