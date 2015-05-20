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
import org.junit.Ignore

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(BenchmarkInjectorProvider))
class MetricsGeneratorTest {
	
	@Inject IGenerator underTest
    @Inject ParseHelper<Benchmark> parseHelper 
    
	@Inject
  	private ValidationTestHelper helper;
	
	@Test
	def testNewMetric(){
		val model = parseHelper.parse('''
		package test
		
		Atomic a1 ClassName TestAtomic Metrics(
			new Metric ClassName TestMetric ID test
			new Metric ClassName TestMetric2 ID test
			Time ID t
		)
        ''')
        
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/metrics/TestMetric.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/metrics/TestMetric2.java"))
        assertTrue(fsa.files.containsKey(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/metrics/TestAtomicMetrics.java"))
	}
	
	@Test
	def testNewMetricCodeGeneration(){
		val model = parseHelper.parse('''
		package test
		
		Atomic a1 ClassName TestAtomic Metrics(
			new Metric ClassName TestMetric ID test
			new Metric ClassName TestMetric2 ID test
			Time ID t
		)
        ''')
        
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertEquals(
            '''
			package test.metrics;
			
			import eu.mondo.sam.core.metrics.BenchmarkMetric;
			
			public class TestMetric extends BenchmarkMetric{
				
				public TestMetric(String name){
					super(name);
				}
				
				@Override
				public String getValue() {
					// TODO implement this
					return "";
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/metrics/TestMetric.java").toString)
	}
	
	@Test
	def testMetricsInitilizer(){
		val model = parseHelper.parse('''
		package test
		
		Atomic a1 ClassName TestAtomic Metrics(
			new Metric ClassName TestMetric ID test
			new Metric ClassName TestMetric2 ID test2
			Time ID t
		)
        ''')
        
        val fsa = new InMemoryFileSystemAccess()
        
        helper.assertNoErrors(model)
        
        underTest.doGenerate(model.eResource, fsa)
        assertEquals(
            '''
			package test.phases.metrics;
			
			import eu.mondo.sam.core.metrics.BenchmarkMetric;
			import eu.mondo.sam.core.metrics.TimeMetric;
			import test.metrics.TestMetric2;
			import test.metrics.TestMetric;
			
			import java.util.Map;
			import java.util.HashMap;
			
			
			public class TestAtomicMetrics {
				
				private HashMap<String, BenchmarkMetric> metrics;
				
				public TestAtomicMetrics(){
					metrics = new HashMap<String, BenchmarkMetric>();
					metrics.put("t", new TimeMetric("t"));
					metrics.put("test", new TestMetric("test"));
					metrics.put("test2", new TestMetric2("test2"));
				}
				
				public Map<String, BenchmarkMetric> getMetrics(){
					return metrics;
				}
			}'''.toString, fsa.files.get(IFileSystemAccess::DEFAULT_OUTPUT + "test/phases/metrics/TestAtomicMetrics.java").toString)
	}
	
}