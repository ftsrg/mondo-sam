/**
 */
package eu.mondo.sam.domain.benchmark.impl;

import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedMetric;
import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.BenchmarkFactory;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.Element;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.MetricType;
import eu.mondo.sam.domain.benchmark.MetricTypeReference;
import eu.mondo.sam.domain.benchmark.NewMetric;
import eu.mondo.sam.domain.benchmark.NewPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.PhaseReference;
import eu.mondo.sam.domain.benchmark.Scenario;
import eu.mondo.sam.domain.benchmark.SequencePhase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BenchmarkPackageImpl extends EPackageImpl implements BenchmarkPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass benchmarkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scenarioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequencePhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iterationPhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalPhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attachedPhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phaseReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newPhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicPhaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attachedMetricEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metricTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newMetricEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum metricTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see eu.mondo.sam.domain.benchmark.BenchmarkPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BenchmarkPackageImpl()
  {
    super(eNS_URI, BenchmarkFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BenchmarkPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BenchmarkPackage init()
  {
    if (isInited) return (BenchmarkPackage)EPackage.Registry.INSTANCE.getEPackage(BenchmarkPackage.eNS_URI);

    // Obtain or create and register package
    BenchmarkPackageImpl theBenchmarkPackage = (BenchmarkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BenchmarkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BenchmarkPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBenchmarkPackage.createPackageContents();

    // Initialize created meta-data
    theBenchmarkPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBenchmarkPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BenchmarkPackage.eNS_URI, theBenchmarkPackage);
    return theBenchmarkPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBenchmark()
  {
    return benchmarkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBenchmark_PackageName()
  {
    return (EAttribute)benchmarkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBenchmark_Elements()
  {
    return (EReference)benchmarkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScenario()
  {
    return scenarioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScenario_Classname()
  {
    return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScenario_RootPhase()
  {
    return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhase()
  {
    return phaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPhase_Name()
  {
    return (EAttribute)phaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSequencePhase()
  {
    return sequencePhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSequencePhase_Phases()
  {
    return (EReference)sequencePhaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIterationPhase()
  {
    return iterationPhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIterationPhase_Iteration()
  {
    return (EAttribute)iterationPhaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIterationPhase_Phase()
  {
    return (EReference)iterationPhaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalPhase()
  {
    return optionalPhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalPhase_Phase()
  {
    return (EReference)optionalPhaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttachedPhase()
  {
    return attachedPhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhaseReference()
  {
    return phaseReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPhaseReference_Phase()
  {
    return (EReference)phaseReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewPhase()
  {
    return newPhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewPhase_Phase()
  {
    return (EReference)newPhaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicPhase()
  {
    return atomicPhaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicPhase_Classname()
  {
    return (EAttribute)atomicPhaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicPhase_Metrics()
  {
    return (EReference)atomicPhaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttachedMetric()
  {
    return attachedMetricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetricTypeReference()
  {
    return metricTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetricTypeReference_Metric()
  {
    return (EAttribute)metricTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewMetric()
  {
    return newMetricEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewMetric_Name()
  {
    return (EAttribute)newMetricEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewMetric_Metricname()
  {
    return (EAttribute)newMetricEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMetricType()
  {
    return metricTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BenchmarkFactory getBenchmarkFactory()
  {
    return (BenchmarkFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    benchmarkEClass = createEClass(BENCHMARK);
    createEAttribute(benchmarkEClass, BENCHMARK__PACKAGE_NAME);
    createEReference(benchmarkEClass, BENCHMARK__ELEMENTS);

    elementEClass = createEClass(ELEMENT);

    scenarioEClass = createEClass(SCENARIO);
    createEAttribute(scenarioEClass, SCENARIO__CLASSNAME);
    createEReference(scenarioEClass, SCENARIO__ROOT_PHASE);

    phaseEClass = createEClass(PHASE);
    createEAttribute(phaseEClass, PHASE__NAME);

    sequencePhaseEClass = createEClass(SEQUENCE_PHASE);
    createEReference(sequencePhaseEClass, SEQUENCE_PHASE__PHASES);

    iterationPhaseEClass = createEClass(ITERATION_PHASE);
    createEAttribute(iterationPhaseEClass, ITERATION_PHASE__ITERATION);
    createEReference(iterationPhaseEClass, ITERATION_PHASE__PHASE);

    optionalPhaseEClass = createEClass(OPTIONAL_PHASE);
    createEReference(optionalPhaseEClass, OPTIONAL_PHASE__PHASE);

    attachedPhaseEClass = createEClass(ATTACHED_PHASE);

    phaseReferenceEClass = createEClass(PHASE_REFERENCE);
    createEReference(phaseReferenceEClass, PHASE_REFERENCE__PHASE);

    newPhaseEClass = createEClass(NEW_PHASE);
    createEReference(newPhaseEClass, NEW_PHASE__PHASE);

    atomicPhaseEClass = createEClass(ATOMIC_PHASE);
    createEAttribute(atomicPhaseEClass, ATOMIC_PHASE__CLASSNAME);
    createEReference(atomicPhaseEClass, ATOMIC_PHASE__METRICS);

    attachedMetricEClass = createEClass(ATTACHED_METRIC);

    metricTypeReferenceEClass = createEClass(METRIC_TYPE_REFERENCE);
    createEAttribute(metricTypeReferenceEClass, METRIC_TYPE_REFERENCE__METRIC);

    newMetricEClass = createEClass(NEW_METRIC);
    createEAttribute(newMetricEClass, NEW_METRIC__NAME);
    createEAttribute(newMetricEClass, NEW_METRIC__METRICNAME);

    // Create enums
    metricTypeEEnum = createEEnum(METRIC_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    scenarioEClass.getESuperTypes().add(this.getElement());
    phaseEClass.getESuperTypes().add(this.getElement());
    sequencePhaseEClass.getESuperTypes().add(this.getPhase());
    iterationPhaseEClass.getESuperTypes().add(this.getPhase());
    optionalPhaseEClass.getESuperTypes().add(this.getPhase());
    phaseReferenceEClass.getESuperTypes().add(this.getAttachedPhase());
    newPhaseEClass.getESuperTypes().add(this.getAttachedPhase());
    atomicPhaseEClass.getESuperTypes().add(this.getPhase());
    metricTypeReferenceEClass.getESuperTypes().add(this.getAttachedMetric());
    newMetricEClass.getESuperTypes().add(this.getAttachedMetric());

    // Initialize classes and features; add operations and parameters
    initEClass(benchmarkEClass, Benchmark.class, "Benchmark", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBenchmark_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBenchmark_Elements(), this.getElement(), null, "elements", null, 0, -1, Benchmark.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScenario_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScenario_RootPhase(), this.getAttachedPhase(), null, "rootPhase", null, 0, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPhase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Phase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequencePhaseEClass, SequencePhase.class, "SequencePhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequencePhase_Phases(), this.getAttachedPhase(), null, "phases", null, 0, -1, SequencePhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iterationPhaseEClass, IterationPhase.class, "IterationPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIterationPhase_Iteration(), ecorePackage.getEInt(), "iteration", null, 0, 1, IterationPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIterationPhase_Phase(), this.getAttachedPhase(), null, "phase", null, 0, 1, IterationPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalPhaseEClass, OptionalPhase.class, "OptionalPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionalPhase_Phase(), this.getAttachedPhase(), null, "phase", null, 0, 1, OptionalPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attachedPhaseEClass, AttachedPhase.class, "AttachedPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(phaseReferenceEClass, PhaseReference.class, "PhaseReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPhaseReference_Phase(), this.getPhase(), null, "phase", null, 0, 1, PhaseReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newPhaseEClass, NewPhase.class, "NewPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewPhase_Phase(), this.getPhase(), null, "phase", null, 0, 1, NewPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicPhaseEClass, AtomicPhase.class, "AtomicPhase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtomicPhase_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, AtomicPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicPhase_Metrics(), this.getAttachedMetric(), null, "metrics", null, 0, -1, AtomicPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attachedMetricEClass, AttachedMetric.class, "AttachedMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metricTypeReferenceEClass, MetricTypeReference.class, "MetricTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetricTypeReference_Metric(), this.getMetricType(), "metric", null, 0, 1, MetricTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newMetricEClass, NewMetric.class, "NewMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNewMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, NewMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewMetric_Metricname(), ecorePackage.getEString(), "metricname", null, 0, 1, NewMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(metricTypeEEnum, MetricType.class, "MetricType");
    addEEnumLiteral(metricTypeEEnum, MetricType.TIME);
    addEEnumLiteral(metricTypeEEnum, MetricType.MEMORY);
    addEEnumLiteral(metricTypeEEnum, MetricType.SCALAR);

    // Create resource
    createResource(eNS_URI);
  }

} //BenchmarkPackageImpl
