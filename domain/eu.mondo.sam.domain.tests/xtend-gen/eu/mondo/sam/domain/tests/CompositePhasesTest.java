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
public class CompositePhasesTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testAtomicPhase() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
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
  public void testAtomicInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 * Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedAtomicInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 *a1) ");
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
  public void testAtomicInOptional() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Optional (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedAtomicInOptional() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Optional (a1) ");
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
  public void testAtomicInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedAtomicInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence (a1) ");
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
  public void testMoreAtomicInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence (a1 a2 Atomic ClassName AtomicClass3 Metrics()) ");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName AtomicClass Metrics()");
      _builder.newLine();
      _builder.append("Atomic a2 ClassName AtomicClass2 Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOptinalInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 * Optional (Atomic a1 ClassName AtomicClass Metrics()))");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedOptionalInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 *o1) ");
      _builder.newLine();
      _builder.append("Optional o1 (Atomic ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSequenceInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 * Sequence (Atomic a1 ClassName AtomicClass Metrics()))");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedSequenceInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration (1 *s1) ");
      _builder.newLine();
      _builder.append("Sequence s1 (Atomic ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompositesInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence (");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Iteration (1 * Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Sequence (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttachedCompositesInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence s1 (it op seq)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Iteration it (1 * Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("Optional op (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      _builder.append("Sequence seq (Atomic a1 ClassName AtomicClass Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSamePhasesInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test.pack");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Sequence (it a1 a1 a1 it)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Iteration it (10 * a1)");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName AtomicClass Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
