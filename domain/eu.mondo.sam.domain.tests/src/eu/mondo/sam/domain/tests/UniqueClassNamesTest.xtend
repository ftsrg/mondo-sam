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
class UniqueClassNamesTest {
	
  @Inject ParseHelper<Benchmark> parseHelper
 
  @Inject
  private ValidationTestHelper helper;
 
  @Test
  def testSameClassNameOfScenarios(){
  	val model = parseHelper.parse('''
  	package test
  	Scenario TestName {
  		Atomic ClassName AtomicName Metrics()
  	}
  	
  	Scenario TestName {
  		Atomic ClassName AtomicName2 Metrics()
  	}
  	''')
  	helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
  }
  
	@Test
	def testSameClassNameOfScenariosAndAttachedAtomicPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario TestName {
  				a1
  			}
  			
  			Atomic a1 ClassName TestName Metrics()
  			''')
  	helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
  	}
  
  	@Test
	def testSameClassNameOfScenariosAndInvolvedAtomicPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario TestName {
  				Atomic a1 ClassName TestName Metrics()
  			}''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}

  	@Test
	def testSameClassNameOfScenariosAndExternalAtomicPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				Atomic a1 ClassName OtherAtomicName Metrics()
  			}
  			
  			Scenario OtherName {
  				Atomic ClassName SameName Metrics()
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}

	@Test
	def testSameClassNameOfScenariosAndAttachedOptionalPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				o1
  			}
  			
  			Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
  	}

	@Test
	def testSameClassNameOfScenariosAndInvolvedOptionalPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
  	}

	@Test
	def testSameClassNameOfScenariosAndExternalOptionalPhases(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				Atomic ClassName OtherAtomic Metrics()
  			}
  			
  			Scenario OtherName {
  				Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
  	}

  	@Test
	def testSameClassNameOfScenariosAndMetrics(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				Atomic a1 ClassName OtherAtomicName Metrics(
  					new Metric ClassName SameName
  				)
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}	
	
  	@Test
	def testSameClassNameOfScenariosAndExternalMetrics(){
		val model = parseHelper.parse('''
  			package test
  			Scenario SameName {
  				Atomic a1 ClassName OtherAtomicName Metrics()
  			}
  			
  			Scenario OtherName {
  				Atomic a1 ClassName OtherAtomicName2 Metrics(
  					new Metric ClassName SameName
  				)
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
  	@Test
	def testSameClassNameOfAtomics1(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  			}
  			
  			Scenario OtherName {
  				Atomic a1 ClassName SameName Metrics(
  					new Metric ClassName Other2
  				)
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomics2(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  			}
  			
  			Scenario OtherName {
  				a1
  				
  			}
  			Atomic a1 ClassName SameName Metrics()
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomics3(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				a2
  			}
  			
  			Scenario OtherName {
  				a1
  				
  			}
  			Atomic a1 ClassName SameName Metrics()
  			Atomic a2 ClassName SameName Metrics()
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomics4(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  				Atomic a2 ClassName SameName Metrics()
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomicsAndOptionals1(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  				Optional ClassName SameName (Atomic a2 ClassName Other2 Metrics())
  			}
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomicsAndOptionals2(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  				o1
  				
  			}
  			Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomicsAndOptionals3(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  				
  			}
  			
  			Scenario Other2 {
  				Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())
  			}  	
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
	@Test
	def testSameClassNameOfAtomicsAndOptionals4(){
		val model = parseHelper.parse('''
  			package test
  			Scenario Other1 {
  				Atomic a1 ClassName SameName Metrics()
  				o1
  			}
  			Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())
  			Optional o2 ClassName SameName (Atomic a2 ClassName Other2 Metrics())
  			''')
  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
	}
	
//	@Test
//	def testSameClassNameOfAtomicsAndMetrics(){
//		val model = parseHelper.parse('''
//  			package test
//  			Scenario SameName {
//  				Atomic a1 ClassName OtherAtomicName Metrics()
//  			}
//  			
//  			Scenario OtherName {
//  				Atomic a1 ClassName OtherAtomicName2 Metrics(
//  					new Metric ClassName SameName
//  				)
//  			}
//  			''')
//  		helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
//	}
}