/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.mondo.sam.domain.benchmark.BenchmarkFactory
 * @model kind="package"
 * @generated
 */
public interface BenchmarkPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "benchmark";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mondo.eu/sam/domain/Benchmark";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "benchmark";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BenchmarkPackage eINSTANCE = eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
   * @generated
   */
  int BENCHMARK = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Benchmark</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BENCHMARK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.ElementImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.ScenarioImpl <em>Scenario</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.ScenarioImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getScenario()
   * @generated
   */
  int SCENARIO = 2;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__CLASSNAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO__ROOT_PHASE = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Scenario</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCENARIO_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.PhaseImpl <em>Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.PhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getPhase()
   * @generated
   */
  int PHASE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.SequencePhaseImpl <em>Sequence Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.SequencePhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getSequencePhase()
   * @generated
   */
  int SEQUENCE_PHASE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PHASE__NAME = PHASE__NAME;

  /**
   * The feature id for the '<em><b>Phases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PHASE__PHASES = PHASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequence Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_PHASE_FEATURE_COUNT = PHASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl <em>Iteration Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getIterationPhase()
   * @generated
   */
  int ITERATION_PHASE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_PHASE__NAME = PHASE__NAME;

  /**
   * The feature id for the '<em><b>Iteration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_PHASE__ITERATION = PHASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_PHASE__PHASE = PHASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Iteration Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_PHASE_FEATURE_COUNT = PHASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.OptionalPhaseImpl <em>Optional Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.OptionalPhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getOptionalPhase()
   * @generated
   */
  int OPTIONAL_PHASE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PHASE__NAME = PHASE__NAME;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PHASE__CLASSNAME = PHASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PHASE__PHASE = PHASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Optional Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_PHASE_FEATURE_COUNT = PHASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.AttachedPhaseImpl <em>Attached Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.AttachedPhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAttachedPhase()
   * @generated
   */
  int ATTACHED_PHASE = 7;

  /**
   * The number of structural features of the '<em>Attached Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACHED_PHASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.PhaseReferenceImpl <em>Phase Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.PhaseReferenceImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getPhaseReference()
   * @generated
   */
  int PHASE_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Phase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_REFERENCE__PHASE = ATTACHED_PHASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Phase Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_REFERENCE_FEATURE_COUNT = ATTACHED_PHASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.NewPhaseImpl <em>New Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.NewPhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getNewPhase()
   * @generated
   */
  int NEW_PHASE = 9;

  /**
   * The feature id for the '<em><b>Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PHASE__PHASE = ATTACHED_PHASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PHASE_FEATURE_COUNT = ATTACHED_PHASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl <em>Atomic Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAtomicPhase()
   * @generated
   */
  int ATOMIC_PHASE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PHASE__NAME = PHASE__NAME;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PHASE__CLASSNAME = PHASE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PHASE__METRICS = PHASE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Atomic Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_PHASE_FEATURE_COUNT = PHASE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.AttachedMetricImpl <em>Attached Metric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.AttachedMetricImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAttachedMetric()
   * @generated
   */
  int ATTACHED_METRIC = 11;

  /**
   * The number of structural features of the '<em>Attached Metric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACHED_METRIC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.MetricTypeReferenceImpl <em>Metric Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.MetricTypeReferenceImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getMetricTypeReference()
   * @generated
   */
  int METRIC_TYPE_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Metric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_TYPE_REFERENCE__METRIC = ATTACHED_METRIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Metric Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METRIC_TYPE_REFERENCE_FEATURE_COUNT = ATTACHED_METRIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.impl.NewMetricImpl <em>New Metric</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.impl.NewMetricImpl
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getNewMetric()
   * @generated
   */
  int NEW_METRIC = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_METRIC__NAME = ATTACHED_METRIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Metricname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_METRIC__METRICNAME = ATTACHED_METRIC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>New Metric</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_METRIC_FEATURE_COUNT = ATTACHED_METRIC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.mondo.sam.domain.benchmark.MetricType <em>Metric Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.mondo.sam.domain.benchmark.MetricType
   * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getMetricType()
   * @generated
   */
  int METRIC_TYPE = 14;


  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.Benchmark <em>Benchmark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Benchmark</em>'.
   * @see eu.mondo.sam.domain.benchmark.Benchmark
   * @generated
   */
  EClass getBenchmark();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.Benchmark#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see eu.mondo.sam.domain.benchmark.Benchmark#getPackageName()
   * @see #getBenchmark()
   * @generated
   */
  EAttribute getBenchmark_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link eu.mondo.sam.domain.benchmark.Benchmark#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see eu.mondo.sam.domain.benchmark.Benchmark#getElements()
   * @see #getBenchmark()
   * @generated
   */
  EReference getBenchmark_Elements();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see eu.mondo.sam.domain.benchmark.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scenario</em>'.
   * @see eu.mondo.sam.domain.benchmark.Scenario
   * @generated
   */
  EClass getScenario();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.Scenario#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see eu.mondo.sam.domain.benchmark.Scenario#getClassname()
   * @see #getScenario()
   * @generated
   */
  EAttribute getScenario_Classname();

  /**
   * Returns the meta object for the containment reference '{@link eu.mondo.sam.domain.benchmark.Scenario#getRootPhase <em>Root Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.Scenario#getRootPhase()
   * @see #getScenario()
   * @generated
   */
  EReference getScenario_RootPhase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.Phase
   * @generated
   */
  EClass getPhase();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.Phase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.mondo.sam.domain.benchmark.Phase#getName()
   * @see #getPhase()
   * @generated
   */
  EAttribute getPhase_Name();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.SequencePhase <em>Sequence Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.SequencePhase
   * @generated
   */
  EClass getSequencePhase();

  /**
   * Returns the meta object for the containment reference list '{@link eu.mondo.sam.domain.benchmark.SequencePhase#getPhases <em>Phases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phases</em>'.
   * @see eu.mondo.sam.domain.benchmark.SequencePhase#getPhases()
   * @see #getSequencePhase()
   * @generated
   */
  EReference getSequencePhase_Phases();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.IterationPhase <em>Iteration Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.IterationPhase
   * @generated
   */
  EClass getIterationPhase();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.IterationPhase#getIteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iteration</em>'.
   * @see eu.mondo.sam.domain.benchmark.IterationPhase#getIteration()
   * @see #getIterationPhase()
   * @generated
   */
  EAttribute getIterationPhase_Iteration();

  /**
   * Returns the meta object for the containment reference '{@link eu.mondo.sam.domain.benchmark.IterationPhase#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.IterationPhase#getPhase()
   * @see #getIterationPhase()
   * @generated
   */
  EReference getIterationPhase_Phase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.OptionalPhase <em>Optional Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.OptionalPhase
   * @generated
   */
  EClass getOptionalPhase();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see eu.mondo.sam.domain.benchmark.OptionalPhase#getClassname()
   * @see #getOptionalPhase()
   * @generated
   */
  EAttribute getOptionalPhase_Classname();

  /**
   * Returns the meta object for the containment reference '{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.OptionalPhase#getPhase()
   * @see #getOptionalPhase()
   * @generated
   */
  EReference getOptionalPhase_Phase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.AttachedPhase <em>Attached Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attached Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.AttachedPhase
   * @generated
   */
  EClass getAttachedPhase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.PhaseReference <em>Phase Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phase Reference</em>'.
   * @see eu.mondo.sam.domain.benchmark.PhaseReference
   * @generated
   */
  EClass getPhaseReference();

  /**
   * Returns the meta object for the reference '{@link eu.mondo.sam.domain.benchmark.PhaseReference#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.PhaseReference#getPhase()
   * @see #getPhaseReference()
   * @generated
   */
  EReference getPhaseReference_Phase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.NewPhase <em>New Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.NewPhase
   * @generated
   */
  EClass getNewPhase();

  /**
   * Returns the meta object for the containment reference '{@link eu.mondo.sam.domain.benchmark.NewPhase#getPhase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.NewPhase#getPhase()
   * @see #getNewPhase()
   * @generated
   */
  EReference getNewPhase_Phase();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.AtomicPhase <em>Atomic Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic Phase</em>'.
   * @see eu.mondo.sam.domain.benchmark.AtomicPhase
   * @generated
   */
  EClass getAtomicPhase();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see eu.mondo.sam.domain.benchmark.AtomicPhase#getClassname()
   * @see #getAtomicPhase()
   * @generated
   */
  EAttribute getAtomicPhase_Classname();

  /**
   * Returns the meta object for the containment reference list '{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getMetrics <em>Metrics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metrics</em>'.
   * @see eu.mondo.sam.domain.benchmark.AtomicPhase#getMetrics()
   * @see #getAtomicPhase()
   * @generated
   */
  EReference getAtomicPhase_Metrics();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.AttachedMetric <em>Attached Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attached Metric</em>'.
   * @see eu.mondo.sam.domain.benchmark.AttachedMetric
   * @generated
   */
  EClass getAttachedMetric();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.MetricTypeReference <em>Metric Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metric Type Reference</em>'.
   * @see eu.mondo.sam.domain.benchmark.MetricTypeReference
   * @generated
   */
  EClass getMetricTypeReference();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.MetricTypeReference#getMetric <em>Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metric</em>'.
   * @see eu.mondo.sam.domain.benchmark.MetricTypeReference#getMetric()
   * @see #getMetricTypeReference()
   * @generated
   */
  EAttribute getMetricTypeReference_Metric();

  /**
   * Returns the meta object for class '{@link eu.mondo.sam.domain.benchmark.NewMetric <em>New Metric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Metric</em>'.
   * @see eu.mondo.sam.domain.benchmark.NewMetric
   * @generated
   */
  EClass getNewMetric();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.NewMetric#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.mondo.sam.domain.benchmark.NewMetric#getName()
   * @see #getNewMetric()
   * @generated
   */
  EAttribute getNewMetric_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.mondo.sam.domain.benchmark.NewMetric#getMetricname <em>Metricname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metricname</em>'.
   * @see eu.mondo.sam.domain.benchmark.NewMetric#getMetricname()
   * @see #getNewMetric()
   * @generated
   */
  EAttribute getNewMetric_Metricname();

  /**
   * Returns the meta object for enum '{@link eu.mondo.sam.domain.benchmark.MetricType <em>Metric Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Metric Type</em>'.
   * @see eu.mondo.sam.domain.benchmark.MetricType
   * @generated
   */
  EEnum getMetricType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BenchmarkFactory getBenchmarkFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.BenchmarkImpl <em>Benchmark</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getBenchmark()
     * @generated
     */
    EClass BENCHMARK = eINSTANCE.getBenchmark();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BENCHMARK__PACKAGE_NAME = eINSTANCE.getBenchmark_PackageName();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BENCHMARK__ELEMENTS = eINSTANCE.getBenchmark_Elements();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.ElementImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.ScenarioImpl <em>Scenario</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.ScenarioImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getScenario()
     * @generated
     */
    EClass SCENARIO = eINSTANCE.getScenario();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCENARIO__CLASSNAME = eINSTANCE.getScenario_Classname();

    /**
     * The meta object literal for the '<em><b>Root Phase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCENARIO__ROOT_PHASE = eINSTANCE.getScenario_RootPhase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.PhaseImpl <em>Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.PhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getPhase()
     * @generated
     */
    EClass PHASE = eINSTANCE.getPhase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHASE__NAME = eINSTANCE.getPhase_Name();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.SequencePhaseImpl <em>Sequence Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.SequencePhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getSequencePhase()
     * @generated
     */
    EClass SEQUENCE_PHASE = eINSTANCE.getSequencePhase();

    /**
     * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE_PHASE__PHASES = eINSTANCE.getSequencePhase_Phases();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl <em>Iteration Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getIterationPhase()
     * @generated
     */
    EClass ITERATION_PHASE = eINSTANCE.getIterationPhase();

    /**
     * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITERATION_PHASE__ITERATION = eINSTANCE.getIterationPhase_Iteration();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION_PHASE__PHASE = eINSTANCE.getIterationPhase_Phase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.OptionalPhaseImpl <em>Optional Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.OptionalPhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getOptionalPhase()
     * @generated
     */
    EClass OPTIONAL_PHASE = eINSTANCE.getOptionalPhase();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_PHASE__CLASSNAME = eINSTANCE.getOptionalPhase_Classname();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_PHASE__PHASE = eINSTANCE.getOptionalPhase_Phase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.AttachedPhaseImpl <em>Attached Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.AttachedPhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAttachedPhase()
     * @generated
     */
    EClass ATTACHED_PHASE = eINSTANCE.getAttachedPhase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.PhaseReferenceImpl <em>Phase Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.PhaseReferenceImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getPhaseReference()
     * @generated
     */
    EClass PHASE_REFERENCE = eINSTANCE.getPhaseReference();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHASE_REFERENCE__PHASE = eINSTANCE.getPhaseReference_Phase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.NewPhaseImpl <em>New Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.NewPhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getNewPhase()
     * @generated
     */
    EClass NEW_PHASE = eINSTANCE.getNewPhase();

    /**
     * The meta object literal for the '<em><b>Phase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_PHASE__PHASE = eINSTANCE.getNewPhase_Phase();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl <em>Atomic Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.AtomicPhaseImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAtomicPhase()
     * @generated
     */
    EClass ATOMIC_PHASE = eINSTANCE.getAtomicPhase();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_PHASE__CLASSNAME = eINSTANCE.getAtomicPhase_Classname();

    /**
     * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_PHASE__METRICS = eINSTANCE.getAtomicPhase_Metrics();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.AttachedMetricImpl <em>Attached Metric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.AttachedMetricImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getAttachedMetric()
     * @generated
     */
    EClass ATTACHED_METRIC = eINSTANCE.getAttachedMetric();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.MetricTypeReferenceImpl <em>Metric Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.MetricTypeReferenceImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getMetricTypeReference()
     * @generated
     */
    EClass METRIC_TYPE_REFERENCE = eINSTANCE.getMetricTypeReference();

    /**
     * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METRIC_TYPE_REFERENCE__METRIC = eINSTANCE.getMetricTypeReference_Metric();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.impl.NewMetricImpl <em>New Metric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.impl.NewMetricImpl
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getNewMetric()
     * @generated
     */
    EClass NEW_METRIC = eINSTANCE.getNewMetric();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_METRIC__NAME = eINSTANCE.getNewMetric_Name();

    /**
     * The meta object literal for the '<em><b>Metricname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_METRIC__METRICNAME = eINSTANCE.getNewMetric_Metricname();

    /**
     * The meta object literal for the '{@link eu.mondo.sam.domain.benchmark.MetricType <em>Metric Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.mondo.sam.domain.benchmark.MetricType
     * @see eu.mondo.sam.domain.benchmark.impl.BenchmarkPackageImpl#getMetricType()
     * @generated
     */
    EEnum METRIC_TYPE = eINSTANCE.getMetricType();

  }

} //BenchmarkPackage
