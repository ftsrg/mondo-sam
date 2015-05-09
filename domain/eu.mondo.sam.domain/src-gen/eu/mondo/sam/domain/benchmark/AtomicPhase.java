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
 *   <li>{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getAtomicname <em>Atomicname</em>}</li>
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
   * Returns the value of the '<em><b>Atomicname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atomicname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atomicname</em>' attribute.
   * @see #setAtomicname(String)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getAtomicPhase_Atomicname()
   * @model
   * @generated
   */
  String getAtomicname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.AtomicPhase#getAtomicname <em>Atomicname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atomicname</em>' attribute.
   * @see #getAtomicname()
   * @generated
   */
  void setAtomicname(String value);

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
