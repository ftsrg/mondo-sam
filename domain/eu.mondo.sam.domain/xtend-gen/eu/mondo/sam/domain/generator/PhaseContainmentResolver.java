package eu.mondo.sam.domain.generator;

import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.Element;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.NewPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.PhaseReference;
import eu.mondo.sam.domain.benchmark.SequencePhase;
import java.util.Arrays;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class PhaseContainmentResolver {
  public static Set<Element> resolvePhases(final AttachedPhase phase, final Set<Element> elements) {
    Set<Element> _xblockexpression = null;
    {
      PhaseContainmentResolver.resolve(phase, elements);
      _xblockexpression = elements;
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final SequencePhase sequence, final Set<Element> elements) {
    EList<AttachedPhase> _phases = sequence.getPhases();
    for (final AttachedPhase attached : _phases) {
      PhaseContainmentResolver.resolve(attached, elements);
    }
    return null;
  }
  
  protected static Object _resolve(final IterationPhase iteration, final Set<Element> elements) {
    AttachedPhase _phase = iteration.getPhase();
    return PhaseContainmentResolver.resolve(_phase, elements);
  }
  
  protected static Object _resolve(final OptionalPhase optional, final Set<Element> elements) {
    Object _xblockexpression = null;
    {
      elements.add(optional);
      AttachedPhase _phase = optional.getPhase();
      _xblockexpression = PhaseContainmentResolver.resolve(_phase, elements);
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final AttachedPhase attached, final Set<Element> elements) {
    Object _xblockexpression = null;
    {
      if ((attached instanceof PhaseReference)) {
        Phase _phase = ((PhaseReference) attached).getPhase();
        PhaseContainmentResolver.resolve(_phase, elements);
      }
      Object _xifexpression = null;
      if ((attached instanceof NewPhase)) {
        Phase _phase_1 = ((NewPhase) attached).getPhase();
        _xifexpression = PhaseContainmentResolver.resolve(_phase_1, elements);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final AtomicPhase atomic, final Set<Element> elements) {
    return Boolean.valueOf(elements.add(atomic));
  }
  
  public static Object resolve(final EObject atomic, final Set<Element> elements) {
    if (atomic instanceof AtomicPhase) {
      return _resolve((AtomicPhase)atomic, elements);
    } else if (atomic instanceof IterationPhase) {
      return _resolve((IterationPhase)atomic, elements);
    } else if (atomic instanceof OptionalPhase) {
      return _resolve((OptionalPhase)atomic, elements);
    } else if (atomic instanceof SequencePhase) {
      return _resolve((SequencePhase)atomic, elements);
    } else if (atomic instanceof AttachedPhase) {
      return _resolve((AttachedPhase)atomic, elements);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atomic, elements).toString());
    }
  }
}
