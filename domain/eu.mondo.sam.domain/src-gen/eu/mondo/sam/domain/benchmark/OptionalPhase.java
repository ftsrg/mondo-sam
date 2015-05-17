/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getClassname <em>Classname</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getOptionalPhase()
 * @model
 * @generated
 */
public interface OptionalPhase extends Phase
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
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getOptionalPhase_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

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
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getOptionalPhase_Phase()
   * @model containment="true"
   * @generated
   */
  AttachedPhase getPhase();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.OptionalPhase#getPhase <em>Phase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Phase</em>' containment reference.
   * @see #getPhase()
   * @generated
   */
  void setPhase(AttachedPhase value);

} // OptionalPhase
