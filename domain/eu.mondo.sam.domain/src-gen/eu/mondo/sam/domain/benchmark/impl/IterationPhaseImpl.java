/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.IterationPhase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iteration Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.IterationPhaseImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterationPhaseImpl extends PhaseImpl implements IterationPhase
{
  /**
   * The default value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIteration()
   * @generated
   * @ordered
   */
  protected static final int ITERATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIteration()
   * @generated
   * @ordered
   */
  protected int iteration = ITERATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPhase() <em>Phase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPhase()
   * @generated
   * @ordered
   */
  protected AttachedPhase phase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IterationPhaseImpl()
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
    return BenchmarkPackage.Literals.ITERATION_PHASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIteration()
  {
    return iteration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIteration(int newIteration)
  {
    int oldIteration = iteration;
    iteration = newIteration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.ITERATION_PHASE__ITERATION, oldIteration, iteration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttachedPhase getPhase()
  {
    return phase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPhase(AttachedPhase newPhase, NotificationChain msgs)
  {
    AttachedPhase oldPhase = phase;
    phase = newPhase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BenchmarkPackage.ITERATION_PHASE__PHASE, oldPhase, newPhase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPhase(AttachedPhase newPhase)
  {
    if (newPhase != phase)
    {
      NotificationChain msgs = null;
      if (phase != null)
        msgs = ((InternalEObject)phase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.ITERATION_PHASE__PHASE, null, msgs);
      if (newPhase != null)
        msgs = ((InternalEObject)newPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BenchmarkPackage.ITERATION_PHASE__PHASE, null, msgs);
      msgs = basicSetPhase(newPhase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.ITERATION_PHASE__PHASE, newPhase, newPhase));
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
      case BenchmarkPackage.ITERATION_PHASE__PHASE:
        return basicSetPhase(null, msgs);
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
      case BenchmarkPackage.ITERATION_PHASE__ITERATION:
        return getIteration();
      case BenchmarkPackage.ITERATION_PHASE__PHASE:
        return getPhase();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BenchmarkPackage.ITERATION_PHASE__ITERATION:
        setIteration((Integer)newValue);
        return;
      case BenchmarkPackage.ITERATION_PHASE__PHASE:
        setPhase((AttachedPhase)newValue);
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
      case BenchmarkPackage.ITERATION_PHASE__ITERATION:
        setIteration(ITERATION_EDEFAULT);
        return;
      case BenchmarkPackage.ITERATION_PHASE__PHASE:
        setPhase((AttachedPhase)null);
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
      case BenchmarkPackage.ITERATION_PHASE__ITERATION:
        return iteration != ITERATION_EDEFAULT;
      case BenchmarkPackage.ITERATION_PHASE__PHASE:
        return phase != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (iteration: ");
    result.append(iteration);
    result.append(')');
    return result.toString();
  }

} //IterationPhaseImpl
