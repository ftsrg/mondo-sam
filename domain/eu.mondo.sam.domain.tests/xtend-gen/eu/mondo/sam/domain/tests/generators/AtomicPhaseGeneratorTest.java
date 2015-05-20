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
public class AtomicPhaseGeneratorTest {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testAtomicPhaseGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAtomicPhaseCodeGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package test.phases;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.phases.AtomicPhase;");
      _builder_1.newLine();
      _builder_1.append("import test.phases.metrics.TestAtomicMetrics;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.metrics.BenchmarkMetric;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.DataToken;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.results.PhaseResult;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class TestAtomic extends AtomicPhase {");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("private TestAtomicMetrics metrics; ");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public TestAtomic(String phaseName) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("super(phaseName);");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("metrics = new TestAtomicMetrics();");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* Executes the operations which belongs to the AtomicPhase. Communicates");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* with other AtomicPhase operations via the DataToken object. Every");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* significant Metric result should be attached to the PhaseResult parameter");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* as BenchmarkMetric instance. The results of measurements will be");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* published only when the PhaseResult object contains the certain Metrics.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @see PhaseResult");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @see BenchmarkMetric");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @param token");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*            Represents a communication unit between this and other phases.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @param result");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*            PhaseResult object. In the case of publishing metrics attach");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*            BenchmarkMetric objects to it.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void execute(DataToken token, PhaseResult phaseResult) {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      String _string = _builder_1.toString();
      Map<String, CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
