/**
 */
package eu.mondo.sam.domain.benchmark;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.SequencePhase#getPhases <em>Phases</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getSequencePhase()
 * @model
 * @generated
 */
public interface SequencePhase extends Phase
{
  /**
   * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
   * The list contents are of type {@link eu.mondo.sam.domain.benchmark.AttachedPhase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phases</em>' containment reference list.
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getSequencePhase_Phases()
   * @model containment="true"
   * @generated
   */
  EList<AttachedPhase> getPhases();

} // SequencePhase
