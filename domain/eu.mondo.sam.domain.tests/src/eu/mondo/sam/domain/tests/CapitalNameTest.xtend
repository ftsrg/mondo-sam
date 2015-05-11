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
class CapitalNameTest {
	
  @Inject ParseHelper<Benchmark> parseHelper
 
  @Inject
  private ValidationTestHelper helper;
 
  @Test
  def testValidScenarioDeclaration() {
    val model = parseHelper.parse('package test.pack Scenario "name" {Atomic ClassName AtomicName Metrics()}')
	helper.assertWarning(model, BenchmarkPackage.Literals.SCENARIO, "invalid_scenario");
  }
  
  @Test
  def testValidAtomicPhaseDeclaration() {
    val model = parseHelper.parse('package test.pack Scenario "Name" {Atomic ClassName atomicName Metrics()}')
    helper.assertNoErrors(model);
	helper.assertWarning(model, BenchmarkPackage.Literals.ATOMIC_PHASE, "invalid_atomicphase");
  }
  
  @Test
  def testValidMetricDeclaration() {
    val model = parseHelper.parse('package test.pack Scenario "name" {
				Atomic ClassName AtomicName Metrics(
		new Metric metricname
		)
	}')
	helper.assertNoErrors(model);
	helper.assertWarning(model, BenchmarkPackage.Literals.NEW_METRIC, "invalid_metric");
  }
  
}