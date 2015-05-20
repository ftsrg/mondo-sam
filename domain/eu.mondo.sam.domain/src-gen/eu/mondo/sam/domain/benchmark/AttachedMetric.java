/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attached Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.AttachedMetric#getMetricname <em>Metricname</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAttachedMetric()
 * @model
 * @generated
 */
public interface AttachedMetric extends EObject
{
  /**
   * Returns the value of the '<em><b>Metricname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metricname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metricname</em>' attribute.
   * @see #setMetricname(String)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAttachedMetric_Metricname()
   * @model
   * @generated
   */
  String getMetricname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.AttachedMetric#getMetricname <em>Metricname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metricname</em>' attribute.
   * @see #getMetricname()
   * @generated
   */
  void setMetricname(String value);

} // AttachedMetric
