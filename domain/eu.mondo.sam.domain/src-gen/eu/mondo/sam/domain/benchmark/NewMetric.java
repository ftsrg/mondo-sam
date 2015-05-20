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
 *   <li>{@link eu.mondo.sam.domain.benchmark.NewMetric#getClassname <em>Classname</em>}</li>
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
   * Returns the value of the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classname</em>' attribute.
   * @see #setClassname(String)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getNewMetric_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.NewMetric#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

} // NewMetric
