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
public class UniqueClassNamesTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testSameClassNameOfScenarios() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario TestName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic ClassName AtomicName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic ClassName AtomicName2 Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndAttachedAtomicPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario TestName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndInvolvedAtomicPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario TestName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName TestName Metrics()");
      _builder.newLine();
      _builder.append("}");
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndExternalAtomicPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomicName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndAttachedOptionalPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndInvolvedOptionalPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndExternalOptionalPhases() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic ClassName OtherAtomic Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional o1 ClassName SameName ( Atomic ClassName TestAtomic Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndMetrics() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomicName Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfScenariosAndExternalMetrics() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario SameName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomicName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomicName2 Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomics1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName Other2");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomics2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomics3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a2");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherName {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a1");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("Atomic a2 ClassName SameName Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomics4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a2 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndOptionals1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional ClassName SameName (Atomic a2 ClassName Other2 Metrics())");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndOptionals2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o1");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndOptionals3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario Other2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())");
      _builder.newLine();
      _builder.append("}  \t");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndOptionals4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Optional o1 ClassName SameName (Atomic a2 ClassName Other2 Metrics())");
      _builder.newLine();
      _builder.append("Optional o2 ClassName SameName (Atomic a2 ClassName Other2 Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndOptionals5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario Other1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName Other3 Metrics()");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("o1");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Optional o1 ClassName SameName (Atomic ClassName SameName Metrics())");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndMetrics1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario OtherS1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherS2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomicName2 Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfAtomicsAndMetrics2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario OtherS1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomic Metrics()");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherS2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName SameName Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfMetrics1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario OtherS1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomic Metrics(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName SameName)");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario OtherS2 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomic2 Metrics(");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSameClassNameOfMetrics2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.append("Scenario OtherS1 {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Atomic a1 ClassName OtherAtomic Metrics(");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("new Metric ClassName SameName");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(")");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      this.helper.assertError(model, BenchmarkPackage.Literals.SCENARIO, "not_unique_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
