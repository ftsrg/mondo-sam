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
public class CircleTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testIterations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario Name {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("it1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Iteration it1 (1 * it2)");
      _builder.newLine();
      _builder.append("Iteration it2 (2 * seq)");
      _builder.newLine();
      _builder.append("Sequence seq (it1 a1)");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "circle_in_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSequences() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario Name {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Sequence s1 (");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s2");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.append("Sequence s2 (s1 a1 s1)\t    ");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "circle_in_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSequences2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario Name {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Sequence s1 (");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("s1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "circle_in_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOptional() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack ");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario Name {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Optional o1 ClassName OptTest2 (");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o2");
      _builder.newLine();
      _builder.append(")");
      _builder.newLine();
      _builder.append("Optional o2 ClassName OptTest (o1)");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "circle_in_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
