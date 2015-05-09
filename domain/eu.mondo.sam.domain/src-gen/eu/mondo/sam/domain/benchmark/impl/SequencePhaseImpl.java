/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.SequencePhase;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.SequencePhaseImpl#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequencePhaseImpl extends PhaseImpl implements SequencePhase
{
  /**
   * The cached value of the '{@link #getPhases() <em>Phases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhases()
   * @generated
   * @ordered
   */
  protected EList<AttachedPhase> phases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequencePhaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BenchmarkPackage.Literals.SEQUENCE_PHASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttachedPhase> getPhases()
  {
    if (phases == null)
    {
      phases = new EObjectContainmentEList<AttachedPhase>(AttachedPhase.class, this, BenchmarkPackage.SEQUENCE_PHASE__PHASES);
    }
    return phases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SEQUENCE_PHASE__PHASES:
        return ((InternalEList<?>)getPhases()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SEQUENCE_PHASE__PHASES:
        return getPhases();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SEQUENCE_PHASE__PHASES:
        getPhases().clear();
        getPhases().addAll((Collection<? extends AttachedPhase>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SEQUENCE_PHASE__PHASES:
        getPhases().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BenchmarkPackage.SEQUENCE_PHASE__PHASES:
        return phases != null && !phases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequencePhaseImpl
