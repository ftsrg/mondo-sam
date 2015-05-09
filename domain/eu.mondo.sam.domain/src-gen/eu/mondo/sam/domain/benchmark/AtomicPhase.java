/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getClassname <em>Classname</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getMetrics <em>Metrics</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAtomicPhase()
 * @model
 * @generated
 */
public interface AtomicPhase extends Phase
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
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAtomicPhase_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

  /**
   * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
   * The list contents are of type {@link eu.mondo.sam.domain.benchmark.AttachedMetric}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metrics</em>' containment reference list.
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAtomicPhase_Metrics()
   * @model containment="true"
   * @generated
   */
  EList<AttachedMetric> getMetrics();

} // AtomicPhase
