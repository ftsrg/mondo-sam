package eu.mondo.sam.domain.tests;

import eu.mondo.sam.domain.BenchmarkInjectorProvider;
import eu.mondo.sam.domain.benchmark.Benchmark;
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
public class BasicScenarioStructureTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testScenarioWithAtomicPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic ClassName AtomicClass Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithIterationPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Iteration (1 * Atomic ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithSequencePhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Sequence (Atomic ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithoptionalPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional ClassName OptionalTest (Atomic ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithAttachedAtomicPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicClass Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithAttachedIterationPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("iter");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Iteration iter (1*a1)");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicClass Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioWithAttachedOptionalPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.append("Scenario ScenarioName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("opt");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Optional opt ClassName OptionalTest (a1)");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicClass Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
