package eu.mondo.sam.domain.tests.generators;

import com.google.inject.Inject;
import eu.mondo.sam.domain.BenchmarkInjectorProvider;
import eu.mondo.sam.domain.benchmark.Benchmark;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BenchmarkInjectorProvider.class)
@SuppressWarnings("all")
public class MetricsGeneratorTest {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testNewMetric() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric ID test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric2 ID test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Time ID t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/metrics/TestMetric.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/metrics/TestMetric2.java"));
      Assert.assertTrue(_containsKey_1);
      Map<String, CharSequence> _files_2 = fsa.getFiles();
      boolean _containsKey_2 = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/metrics/TestAtomicMetrics.java"));
      Assert.assertTrue(_containsKey_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNewMetricCodeGeneration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric ID test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric2 ID test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Time ID t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package test.metrics;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.metrics.BenchmarkMetric;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class TestMetric extends BenchmarkMetric{");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public TestMetric(String name){");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("super(name);");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public String getValue() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("// TODO implement this");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return \"\";");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      String _string = _builder_1.toString();
      Map<String, CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get((IFileSystemAccess.DEFAULT_OUTPUT + "test/metrics/TestMetric.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMetricsInitilizer() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric ID test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName TestMetric2 ID test2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Time ID t");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package test.phases.metrics;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.metrics.BenchmarkMetric;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.metrics.TimeMetric;");
      _builder_1.newLine();
      _builder_1.append("import test.metrics.TestMetric2;");
      _builder_1.newLine();
      _builder_1.append("import test.metrics.TestMetric;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import java.util.Map;");
      _builder_1.newLine();
      _builder_1.append("import java.util.HashMap;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class TestAtomicMetrics {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private HashMap<String, BenchmarkMetric> metrics;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public TestAtomicMetrics(){");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("metrics = new HashMap<String, BenchmarkMetric>();");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("metrics.put(\"t\", new TimeMetric(\"t\"));");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("metrics.put(\"test\", new TestMetric(\"test\"));");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("metrics.put(\"test2\", new TestMetric2(\"test2\"));");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public Map<String, BenchmarkMetric> getMetrics(){");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return metrics;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      String _string = _builder_1.toString();
      Map<String, CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/metrics/TestAtomicMetrics.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
