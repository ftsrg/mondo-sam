/**
 */
package eu.mondo.sam.domain.benchmark.util;

import eu.mondo.sam.domain.benchmark.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage
 * @generated
 */
public class BenchmarkAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BenchmarkPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BenchmarkPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BenchmarkSwitch<Adapter> modelSwitch =
    new BenchmarkSwitch<Adapter>()
    {
      @Override
      public Adapter caseBenchmark(Benchmark object)
      {
        return createBenchmarkAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter casePhase(Phase object)
      {
        return createPhaseAdapter();
      }
      @Override
      public Adapter caseSequencePhase(SequencePhase object)
      {
        return createSequencePhaseAdapter();
      }
      @Override
      public Adapter caseIterationPhase(IterationPhase object)
      {
        return createIterationPhaseAdapter();
      }
      @Override
      public Adapter caseOptionalPhase(OptionalPhase object)
      {
        return createOptionalPhaseAdapter();
      }
      @Override
      public Adapter caseAttachedPhase(AttachedPhase object)
      {
        return createAttachedPhaseAdapter();
      }
      @Override
      public Adapter casePhaseReference(PhaseReference object)
      {
        return createPhaseReferenceAdapter();
      }
      @Override
      public Adapter caseNewPhase(NewPhase object)
      {
        return createNewPhaseAdapter();
      }
      @Override
      public Adapter caseAtomicPhase(AtomicPhase object)
      {
        return createAtomicPhaseAdapter();
      }
      @Override
      public Adapter caseAttachedMetric(AttachedMetric object)
      {
        return createAttachedMetricAdapter();
      }
      @Override
      public Adapter caseMetricTypeReference(MetricTypeReference object)
      {
        return createMetricTypeReferenceAdapter();
      }
      @Override
      public Adapter caseNewMetric(NewMetric object)
      {
        return createNewMetricAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.Benchmark <em>Benchmark</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.Benchmark
   * @generated
   */
  public Adapter createBenchmarkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.Phase
   * @generated
   */
  public Adapter createPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.SequencePhase <em>Sequence Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.SequencePhase
   * @generated
   */
  public Adapter createSequencePhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.IterationPhase <em>Iteration Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.IterationPhase
   * @generated
   */
  public Adapter createIterationPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.OptionalPhase <em>Optional Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.OptionalPhase
   * @generated
   */
  public Adapter createOptionalPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.AttachedPhase <em>Attached Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.AttachedPhase
   * @generated
   */
  public Adapter createAttachedPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.PhaseReference <em>Phase Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.PhaseReference
   * @generated
   */
  public Adapter createPhaseReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.NewPhase <em>New Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.NewPhase
   * @generated
   */
  public Adapter createNewPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.AtomicPhase <em>Atomic Phase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.AtomicPhase
   * @generated
   */
  public Adapter createAtomicPhaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.AttachedMetric <em>Attached Metric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.AttachedMetric
   * @generated
   */
  public Adapter createAttachedMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.MetricTypeReference <em>Metric Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.MetricTypeReference
   * @generated
   */
  public Adapter createMetricTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.mondo.sam.domain.benchmark.NewMetric <em>New Metric</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.mondo.sam.domain.benchmark.NewMetric
   * @generated
   */
  public Adapter createNewMetricAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BenchmarkAdapterFactory
