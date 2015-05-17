package eu.mondo.sam.domain.generator;

import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.NewPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.PhaseReference;
import eu.mondo.sam.domain.benchmark.SequencePhase;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PhaseImportResolver {
  public static Set<String> resolvePhases(final AttachedPhase phase, final String ownPackage) {
    Set<String> _xblockexpression = null;
    {
      Set<String> imports = new TreeSet<String>();
      PhaseImportResolver.resolve(phase, imports, ownPackage);
      _xblockexpression = imports;
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final SequencePhase sequence, final Set<String> imports, final String ownPackage) {
    imports.add("eu.mondo.sam.core.phases.SequencePhase;");
    EList<AttachedPhase> _phases = sequence.getPhases();
    for (final AttachedPhase attached : _phases) {
      PhaseImportResolver.resolve(attached, imports, ownPackage);
    }
    return null;
  }
  
  protected static Object _resolve(final IterationPhase iteration, final Set<String> imports, final String ownPackage) {
    Object _xblockexpression = null;
    {
      imports.add("eu.mondo.sam.core.phases.IterationPhase;");
      AttachedPhase _phase = iteration.getPhase();
      _xblockexpression = PhaseImportResolver.resolve(_phase, imports, ownPackage);
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final OptionalPhase optional, final Set<String> imports, final String ownPackage) {
    Object _xblockexpression = null;
    {
      imports.add("eu.mondo.sam.core.phases.OptionalPhase;");
      AttachedPhase _phase = optional.getPhase();
      _xblockexpression = PhaseImportResolver.resolve(_phase, imports, ownPackage);
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final AttachedPhase attached, final Set<String> imports, final String ownPackage) {
    Object _xblockexpression = null;
    {
      if ((attached instanceof PhaseReference)) {
        Phase _phase = ((PhaseReference) attached).getPhase();
        PhaseImportResolver.resolve(_phase, imports, ownPackage);
      }
      Object _xifexpression = null;
      if ((attached instanceof NewPhase)) {
        Phase _phase_1 = ((NewPhase) attached).getPhase();
        _xifexpression = PhaseImportResolver.resolve(_phase_1, imports, ownPackage);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final AtomicPhase atomic, final Set<String> imports, final String ownPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(ownPackage, "");
    _builder.append(".phases.");
    String _classname = atomic.getClassname();
    _builder.append(_classname, "");
    _builder.append(";");
    return Boolean.valueOf(imports.add(_builder.toString()));
  }
  
  public static Object resolve(final EObject atomic, final Set<String> imports, final String ownPackage) {
    if (atomic instanceof AtomicPhase) {
      return _resolve((AtomicPhase)atomic, imports, ownPackage);
    } else if (atomic instanceof IterationPhase) {
      return _resolve((IterationPhase)atomic, imports, ownPackage);
    } else if (atomic instanceof OptionalPhase) {
      return _resolve((OptionalPhase)atomic, imports, ownPackage);
    } else if (atomic instanceof SequencePhase) {
      return _resolve((SequencePhase)atomic, imports, ownPackage);
    } else if (atomic instanceof AttachedPhase) {
      return _resolve((AttachedPhase)atomic, imports, ownPackage);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atomic, imports, ownPackage).toString());
    }
  }
}
