/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Phase Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.PhaseReference#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getPhaseReference()
 * @model
 * @generated
 */
public interface PhaseReference extends AttachedPhase
{
  /**
   * Returns the value of the '<em><b>Phase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phase</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phase</em>' reference.
   * @see #setPhase(Phase)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getPhaseReference_Phase()
   * @model
   * @generated
   */
  Phase getPhase();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.PhaseReference#getPhase <em>Phase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phase</em>' reference.
   * @see #getPhase()
   * @generated
   */
  void setPhase(Phase value);

} // PhaseReference
