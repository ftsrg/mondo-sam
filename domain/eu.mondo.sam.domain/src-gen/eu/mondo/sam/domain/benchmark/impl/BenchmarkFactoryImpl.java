/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchmarkFactoryImpl extends EFactoryImpl implements BenchmarkFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BenchmarkFactory init()
  {
    try
    {
      BenchmarkFactory theBenchmarkFactory = (BenchmarkFactory)EPackage.Registry.INSTANCE.getEFactory(BenchmarkPackage.eNS_URI);
      if (theBenchmarkFactory != null)
      {
        return theBenchmarkFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BenchmarkFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BenchmarkPackage.BENCHMARK: return createBenchmark();
      case BenchmarkPackage.ELEMENT: return createElement();
      case BenchmarkPackage.SCENARIO: return createScenario();
      case BenchmarkPackage.PHASE: return createPhase();
      case BenchmarkPackage.SEQUENCE_PHASE: return createSequencePhase();
      case BenchmarkPackage.ITERATION_PHASE: return createIterationPhase();
      case BenchmarkPackage.OPTIONAL_PHASE: return createOptionalPhase();
      case BenchmarkPackage.ATTACHED_PHASE: return createAttachedPhase();
      case BenchmarkPackage.PHASE_REFERENCE: return createPhaseReference();
      case BenchmarkPackage.NEW_PHASE: return createNewPhase();
      case BenchmarkPackage.ATOMIC_PHASE: return createAtomicPhase();
      case BenchmarkPackage.ATTACHED_METRIC: return createAttachedMetric();
      case BenchmarkPackage.METRIC_TYPE_REFERENCE: return createMetricTypeReference();
      case BenchmarkPackage.NEW_METRIC: return createNewMetric();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BenchmarkPackage.METRIC_TYPE:
        return createMetricTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BenchmarkPackage.METRIC_TYPE:
        return convertMetricTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Benchmark createBenchmark()
  {
    BenchmarkImpl benchmark = new BenchmarkImpl();
    return benchmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scenario createScenario()
  {
    ScenarioImpl scenario = new ScenarioImpl();
    return scenario;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phase createPhase()
  {
    PhaseImpl phase = new PhaseImpl();
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencePhase createSequencePhase()
  {
    SequencePhaseImpl sequencePhase = new SequencePhaseImpl();
    return sequencePhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterationPhase createIterationPhase()
  {
    IterationPhaseImpl iterationPhase = new IterationPhaseImpl();
    return iterationPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalPhase createOptionalPhase()
  {
    OptionalPhaseImpl optionalPhase = new OptionalPhaseImpl();
    return optionalPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttachedPhase createAttachedPhase()
  {
    AttachedPhaseImpl attachedPhase = new AttachedPhaseImpl();
    return attachedPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhaseReference createPhaseReference()
  {
    PhaseReferenceImpl phaseReference = new PhaseReferenceImpl();
    return phaseReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewPhase createNewPhase()
  {
    NewPhaseImpl newPhase = new NewPhaseImpl();
    return newPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicPhase createAtomicPhase()
  {
    AtomicPhaseImpl atomicPhase = new AtomicPhaseImpl();
    return atomicPhase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttachedMetric createAttachedMetric()
  {
    AttachedMetricImpl attachedMetric = new AttachedMetricImpl();
    return attachedMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricTypeReference createMetricTypeReference()
  {
    MetricTypeReferenceImpl metricTypeReference = new MetricTypeReferenceImpl();
    return metricTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewMetric createNewMetric()
  {
    NewMetricImpl newMetric = new NewMetricImpl();
    return newMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricType createMetricTypeFromString(EDataType eDataType, String initialValue)
  {
    MetricType result = MetricType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetricTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkPackage getBenchmarkPackage()
  {
    return (BenchmarkPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BenchmarkPackage getPackage()
  {
    return BenchmarkPackage.eINSTANCE;
  }

} //BenchmarkFactoryImpl
