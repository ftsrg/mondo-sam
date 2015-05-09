/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.IterationPhase#getIteration <em>Iteration</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.IterationPhase#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getIterationPhase()
 * @model
 * @generated
 */
public interface IterationPhase extends Phase
{
  /**
   * Returns the value of the '<em><b>Iteration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iteration</em>' attribute.
   * @see #setIteration(int)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getIterationPhase_Iteration()
   * @model
   * @generated
   */
  int getIteration();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.IterationPhase#getIteration <em>Iteration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iteration</em>' attribute.
   * @see #getIteration()
   * @generated
   */
  void setIteration(int value);

  /**
   * Returns the value of the '<em><b>Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phase</em>' containment reference.
   * @see #setPhase(AttachedPhase)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getIterationPhase_Phase()
   * @model containment="true"
   * @generated
   */
  AttachedPhase getPhase();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.IterationPhase#getPhase <em>Phase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phase</em>' containment reference.
   * @see #getPhase()
   * @generated
   */
  void setPhase(AttachedPhase value);

} // IterationPhase
