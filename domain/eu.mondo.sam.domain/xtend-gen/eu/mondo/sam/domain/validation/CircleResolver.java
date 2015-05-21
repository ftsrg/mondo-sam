package eu.mondo.sam.domain.validation;

import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.PhaseReference;
import eu.mondo.sam.domain.benchmark.SequencePhase;
import java.util.Arrays;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class CircleResolver {
  protected static boolean _resolve(final OptionalPhase phase, final Set<EObject> phases) {
    InputOutput.<String>print("optional");
    boolean _contains = phases.contains(phase);
    if (_contains) {
      return true;
    } else {
      phases.add(phase);
      AttachedPhase _phase = phase.getPhase();
      boolean _resolve = CircleResolver.resolve(_phase, phases);
      if (_resolve) {
      }
    }
    return false;
  }
  
  protected static boolean _resolve(final Phase phase, final Set<EObject> phases) {
    InputOutput.<String>print("phase");
    return false;
  }
  
  protected static boolean _resolve(final AttachedPhase phase, final Set<EObject> phases) {
    InputOutput.<String>print("ttached");
    return false;
  }
  
  protected static boolean _resolve(final PhaseReference phase, final Set<EObject> phases) {
    InputOutput.<String>print("phase ref");
    Phase _phase = phase.getPhase();
    return CircleResolver.resolve(_phase, phases);
  }
  
  protected static boolean _resolve(final SequencePhase phase, final Set<EObject> phases) {
    InputOutput.<String>print("seq");
    boolean _contains = phases.contains(phase);
    if (_contains) {
      return true;
    } else {
      phases.add(phase);
      EList<AttachedPhase> _phases = phase.getPhases();
      for (final AttachedPhase p : _phases) {
        boolean _resolve = CircleResolver.resolve(p, phases);
        if (_resolve) {
          return true;
        }
      }
    }
    return false;
  }
  
  protected static boolean _resolve(final IterationPhase phase, final Set<EObject> phases) {
    InputOutput.<String>print("iter");
    boolean _contains = phases.contains(phase);
    if (_contains) {
      return true;
    } else {
      phases.add(phase);
      AttachedPhase _phase = phase.getPhase();
      boolean _resolve = CircleResolver.resolve(_phase, phases);
      if (_resolve) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean resolve(final EObject phase, final Set<EObject> phases) {
    if (phase instanceof IterationPhase) {
      return _resolve((IterationPhase)phase, phases);
    } else if (phase instanceof OptionalPhase) {
      return _resolve((OptionalPhase)phase, phases);
    } else if (phase instanceof SequencePhase) {
      return _resolve((SequencePhase)phase, phases);
    } else if (phase instanceof Phase) {
      return _resolve((Phase)phase, phases);
    } else if (phase instanceof PhaseReference) {
      return _resolve((PhaseReference)phase, phases);
    } else if (phase instanceof AttachedPhase) {
      return _resolve((AttachedPhase)phase, phases);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(phase, phases).toString());
    }
  }
}
