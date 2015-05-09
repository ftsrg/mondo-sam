/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage
 * @generated
 */
public interface BenchmarkFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BenchmarkFactory eINSTANCE = eu.mondo.sam.domain.benchmark.impl.BenchmarkFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Benchmark</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Benchmark</em>'.
   * @generated
   */
  Benchmark createBenchmark();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scenario</em>'.
   * @generated
   */
  Scenario createScenario();

  /**
   * Returns a new object of class '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase</em>'.
   * @generated
   */
  Phase createPhase();

  /**
   * Returns a new object of class '<em>Sequence Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Phase</em>'.
   * @generated
   */
  SequencePhase createSequencePhase();

  /**
   * Returns a new object of class '<em>Iteration Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Phase</em>'.
   * @generated
   */
  IterationPhase createIterationPhase();

  /**
   * Returns a new object of class '<em>Optional Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Phase</em>'.
   * @generated
   */
  OptionalPhase createOptionalPhase();

  /**
   * Returns a new object of class '<em>Attached Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attached Phase</em>'.
   * @generated
   */
  AttachedPhase createAttachedPhase();

  /**
   * Returns a new object of class '<em>Phase Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase Reference</em>'.
   * @generated
   */
  PhaseReference createPhaseReference();

  /**
   * Returns a new object of class '<em>New Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Phase</em>'.
   * @generated
   */
  NewPhase createNewPhase();

  /**
   * Returns a new object of class '<em>Atomic Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Phase</em>'.
   * @generated
   */
  AtomicPhase createAtomicPhase();

  /**
   * Returns a new object of class '<em>Attached Metric</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attached Metric</em>'.
   * @generated
   */
  AttachedMetric createAttachedMetric();

  /**
   * Returns a new object of class '<em>Metric Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metric Type Reference</em>'.
   * @generated
   */
  MetricTypeReference createMetricTypeReference();

  /**
   * Returns a new object of class '<em>New Metric</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Metric</em>'.
   * @generated
   */
  NewMetric createNewMetric();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BenchmarkPackage getBenchmarkPackage();

} //BenchmarkFactory
