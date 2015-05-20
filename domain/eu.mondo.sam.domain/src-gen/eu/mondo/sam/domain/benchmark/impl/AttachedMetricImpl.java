/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.AttachedMetric;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attached Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.impl.AttachedMetricImpl#getMetricname <em>Metricname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachedMetricImpl extends MinimalEObjectImpl.Container implements AttachedMetric
{
  /**
   * The default value of the '{@link #getMetricname() <em>Metricname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetricname()
   * @generated
   * @ordered
   */
  protected static final String METRICNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetricname() <em>Metricname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetricname()
   * @generated
   * @ordered
   */
  protected String metricname = METRICNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttachedMetricImpl()
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
    return BenchmarkPackage.Literals.ATTACHED_METRIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMetricname()
  {
    return metricname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetricname(String newMetricname)
  {
    String oldMetricname = metricname;
    metricname = newMetricname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BenchmarkPackage.ATTACHED_METRIC__METRICNAME, oldMetricname, metricname));
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
      case BenchmarkPackage.ATTACHED_METRIC__METRICNAME:
        return getMetricname();
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
      case BenchmarkPackage.ATTACHED_METRIC__METRICNAME:
        setMetricname((String)newValue);
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
      case BenchmarkPackage.ATTACHED_METRIC__METRICNAME:
        setMetricname(METRICNAME_EDEFAULT);
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
      case BenchmarkPackage.ATTACHED_METRIC__METRICNAME:
        return METRICNAME_EDEFAULT == null ? metricname != null : !METRICNAME_EDEFAULT.equals(metricname);
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
    result.append(" (metricname: ");
    result.append(metricname);
    result.append(')');
    return result.toString();
  }

} //AttachedMetricImpl
