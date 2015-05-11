/**
 */
package eu.mondo.sam.domain.benchmark;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.mondo.sam.domain.benchmark.Scenario#getClassname <em>Classname</em>}</li>
 *   <li>{@link eu.mondo.sam.domain.benchmark.Scenario#getRootPhase <em>Root Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Element
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
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getScenario_Classname()
   * @model
   * @generated
   */
  String getClassname();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.Scenario#getClassname <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Classname</em>' attribute.
   * @see #getClassname()
   * @generated
   */
  void setClassname(String value);

  /**
   * Returns the value of the '<em><b>Root Phase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Phase</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Phase</em>' containment reference.
   * @see #setRootPhase(AttachedPhase)
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#getScenario_RootPhase()
   * @model containment="true"
   * @generated
   */
  AttachedPhase getRootPhase();

  /**
   * Sets the value of the '{@link eu.mondo.sam.domain.benchmark.Scenario#getRootPhase <em>Root Phase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Phase</em>' containment reference.
   * @see #getRootPhase()
   * @generated
   */
  void setRootPhase(AttachedPhase value);

} // Scenario
