/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.NewMetric#getName <em>Name</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.NewMetric#getMetricname <em>Metricname</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getNewMetric()
 * @model
 * @generated
 */
public interface NewMetric extends AttachedMetric
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getNewMetric_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.NewMetric#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getNewMetric_Metricname()
   * @model
   * @generated
   */
  String getMetricname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.NewMetric#getMetricname <em>Metricname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metricname</em>' attribute.
   * @see #getMetricname()
   * @generated
   */
  void setMetricname(String value);

} // NewMetric
