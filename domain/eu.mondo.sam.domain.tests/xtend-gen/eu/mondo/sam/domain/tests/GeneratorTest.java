package eu.mondo.sam.domain.tests;

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
public class GeneratorTest {
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
      _builder.append("Scenario \"TestScenario\" {a1}");
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
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
