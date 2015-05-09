/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.MetricTypeReference#getMetric <em>Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getMetricTypeReference()
 * @model
 * @generated
 */
public interface MetricTypeReference extends AttachedMetric
{
  /**
   * Returns the value of the '<em><b>Metric</b></em>' attribute.
   * The literals are from the enumeration {@link eu.mondo.sam.domain.benchmark.MetricType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metric</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' attribute.
   * @see eu.mondo.sam.domain.benchmark.MetricType
   * @see #setMetric(MetricType)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getMetricTypeReference_Metric()
   * @model
   * @generated
   */
  MetricType getMetric();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.MetricTypeReference#getMetric <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' attribute.
   * @see eu.mondo.sam.domain.benchmark.MetricType
   * @see #getMetric()
   * @generated
   */
  void setMetric(MetricType value);

} // MetricTypeReference
