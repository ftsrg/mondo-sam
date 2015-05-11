package eu.mondo.sam.domain.tests;

import eu.mondo.sam.domain.BenchmarkInjectorProvider;
import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(BenchmarkInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class IterationPhaseTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testNullIteration() {
    try {
      final Benchmark model = this.parseHelper.parse("package test.pack Iteration Name (0 * \n\t\t\tAtomic ClassName AtomicName Metrics(\n\t\t\tnew Metric MetricName\n\t\t))");
      this.helper.assertError(model, BenchmarkPackage.Literals.ITERATION_PHASE, "invalid_iteration");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPositiveIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack Iteration it ( 1 * ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Atomic ClassName AtomicName Metrics(");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("new Metric MetricName");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("))");
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
