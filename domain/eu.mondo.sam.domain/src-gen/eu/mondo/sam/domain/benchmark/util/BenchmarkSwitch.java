/**
 */
package eu.mondo.sam.domain.benchmark.util;

import eu.mondo.sam.domain.benchmark.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage
 * @generated
 */
public class BenchmarkSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BenchmarkPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BenchmarkPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BenchmarkPackage.BENCHMARK:
      {
        Benchmark benchmark = (Benchmark)theEObject;
        T result = caseBenchmark(benchmark);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.PACKAGE_DECLARATION:
      {
        PackageDeclaration packageDeclaration = (PackageDeclaration)theEObject;
        T result = casePackageDeclaration(packageDeclaration);
        if (result == null) result = caseElement(packageDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.SCENARIO:
      {
        Scenario scenario = (Scenario)theEObject;
        T result = caseScenario(scenario);
        if (result == null) result = caseElement(scenario);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.PHASE:
      {
        Phase phase = (Phase)theEObject;
        T result = casePhase(phase);
        if (result == null) result = caseElement(phase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.SEQUENCE_PHASE:
      {
        SequencePhase sequencePhase = (SequencePhase)theEObject;
        T result = caseSequencePhase(sequencePhase);
        if (result == null) result = casePhase(sequencePhase);
        if (result == null) result = caseElement(sequencePhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.ITERATION_PHASE:
      {
        IterationPhase iterationPhase = (IterationPhase)theEObject;
        T result = caseIterationPhase(iterationPhase);
        if (result == null) result = casePhase(iterationPhase);
        if (result == null) result = caseElement(iterationPhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.OPTIONAL_PHASE:
      {
        OptionalPhase optionalPhase = (OptionalPhase)theEObject;
        T result = caseOptionalPhase(optionalPhase);
        if (result == null) result = casePhase(optionalPhase);
        if (result == null) result = caseElement(optionalPhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.ATTACHED_PHASE:
      {
        AttachedPhase attachedPhase = (AttachedPhase)theEObject;
        T result = caseAttachedPhase(attachedPhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.PHASE_REFERENCE:
      {
        PhaseReference phaseReference = (PhaseReference)theEObject;
        T result = casePhaseReference(phaseReference);
        if (result == null) result = caseAttachedPhase(phaseReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.NEW_PHASE:
      {
        NewPhase newPhase = (NewPhase)theEObject;
        T result = caseNewPhase(newPhase);
        if (result == null) result = caseAttachedPhase(newPhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.ATOMIC_PHASE:
      {
        AtomicPhase atomicPhase = (AtomicPhase)theEObject;
        T result = caseAtomicPhase(atomicPhase);
        if (result == null) result = casePhase(atomicPhase);
        if (result == null) result = caseElement(atomicPhase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.ATTACHED_METRIC:
      {
        AttachedMetric attachedMetric = (AttachedMetric)theEObject;
        T result = caseAttachedMetric(attachedMetric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.METRIC_TYPE_REFERENCE:
      {
        MetricTypeReference metricTypeReference = (MetricTypeReference)theEObject;
        T result = caseMetricTypeReference(metricTypeReference);
        if (result == null) result = caseAttachedMetric(metricTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BenchmarkPackage.NEW_METRIC:
      {
        NewMetric newMetric = (NewMetric)theEObject;
        T result = caseNewMetric(newMetric);
        if (result == null) result = caseAttachedMetric(newMetric);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Benchmark</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Benchmark</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBenchmark(Benchmark object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDeclaration(PackageDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScenario(Scenario object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhase(Phase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequencePhase(SequencePhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIterationPhase(IterationPhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalPhase(OptionalPhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attached Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attached Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttachedPhase(AttachedPhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Phase Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Phase Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePhaseReference(PhaseReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewPhase(NewPhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Phase</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Phase</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicPhase(AtomicPhase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attached Metric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attached Metric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttachedMetric(AttachedMetric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metric Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metric Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetricTypeReference(MetricTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Metric</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Metric</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewMetric(NewMetric object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BenchmarkSwitch
