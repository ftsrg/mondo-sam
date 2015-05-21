package eu.mondo.sam.domain.validation;

import com.google.common.base.Objects;
import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedMetric;
import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.Element;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.MetricType;
import eu.mondo.sam.domain.benchmark.MetricTypeReference;
import eu.mondo.sam.domain.benchmark.NewMetric;
import eu.mondo.sam.domain.benchmark.NewPhase;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.Scenario;
import eu.mondo.sam.domain.benchmark.SequencePhase;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ClassNameResolver {
  protected static Object _resolve(final Scenario scenario, final List<String> classNames, final Element original) {
    AttachedPhase _rootPhase = scenario.getRootPhase();
    return ClassNameResolver.resolve(_rootPhase, classNames, original);
  }
  
  protected static Object _resolve(final OptionalPhase optional, final List<String> classNames, final Element original) {
    Object _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(optional, original));
      if (_notEquals) {
        String _classname = optional.getClassname();
        classNames.add(_classname);
      }
      AttachedPhase _phase = optional.getPhase();
      _xblockexpression = ClassNameResolver.resolve(_phase, classNames, original);
    }
    return _xblockexpression;
  }
  
  protected static Object _resolve(final IterationPhase iteration, final List<String> classNames, final Element original) {
    AttachedPhase _phase = iteration.getPhase();
    return ClassNameResolver.resolve(_phase, classNames, original);
  }
  
  protected static Object _resolve(final SequencePhase sequence, final List<String> classNames, final Element original) {
    EList<AttachedPhase> _phases = sequence.getPhases();
    for (final AttachedPhase p : _phases) {
      ClassNameResolver.resolve(p, classNames, original);
    }
    return null;
  }
  
  protected static Object _resolve(final AtomicPhase atomic, final List<String> classNames, final Element original) {
    boolean _notEquals = (!Objects.equal(atomic, original));
    if (_notEquals) {
      String _classname = atomic.getClassname();
      classNames.add(_classname);
    }
    EList<AttachedMetric> _metrics = atomic.getMetrics();
    for (final AttachedMetric m : _metrics) {
      ClassNameResolver.resolve(m, classNames, original);
    }
    return null;
  }
  
  protected static Object _resolve(final MetricType metric, final List<String> classNames, final Element original) {
    return null;
  }
  
  protected static Object _resolve(final MetricTypeReference metric, final List<String> classNames, final Element original) {
    return null;
  }
  
  protected static Object _resolve(final AttachedMetric metric, final List<String> classNames, final Element original) {
    Object _xifexpression = null;
    if ((metric instanceof NewMetric)) {
      _xifexpression = ClassNameResolver.resolve(metric, classNames, original);
    }
    return _xifexpression;
  }
  
  protected static Object _resolve(final NewMetric metric, final List<String> classNames, final Element original) {
    boolean _xifexpression = false;
    boolean _notEquals = (!Objects.equal(metric, original));
    if (_notEquals) {
      String _classname = metric.getClassname();
      _xifexpression = classNames.add(_classname);
    }
    return Boolean.valueOf(_xifexpression);
  }
  
  protected static Object _resolve(final AttachedPhase attached, final List<String> classNames, final Element original) {
    Object _xifexpression = null;
    if ((attached instanceof NewPhase)) {
      Phase _phase = ((NewPhase) attached).getPhase();
      _xifexpression = ClassNameResolver.resolve(_phase, classNames, original);
    }
    return _xifexpression;
  }
  
  public static Object resolve(final Object atomic, final List<String> classNames, final Element original) {
    if (atomic instanceof AtomicPhase) {
      return _resolve((AtomicPhase)atomic, classNames, original);
    } else if (atomic instanceof IterationPhase) {
      return _resolve((IterationPhase)atomic, classNames, original);
    } else if (atomic instanceof OptionalPhase) {
      return _resolve((OptionalPhase)atomic, classNames, original);
    } else if (atomic instanceof SequencePhase) {
      return _resolve((SequencePhase)atomic, classNames, original);
    } else if (atomic instanceof MetricTypeReference) {
      return _resolve((MetricTypeReference)atomic, classNames, original);
    } else if (atomic instanceof NewMetric) {
      return _resolve((NewMetric)atomic, classNames, original);
    } else if (atomic instanceof Scenario) {
      return _resolve((Scenario)atomic, classNames, original);
    } else if (atomic instanceof AttachedMetric) {
      return _resolve((AttachedMetric)atomic, classNames, original);
    } else if (atomic instanceof AttachedPhase) {
      return _resolve((AttachedPhase)atomic, classNames, original);
    } else if (atomic instanceof MetricType) {
      return _resolve((MetricType)atomic, classNames, original);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atomic, classNames, original).toString());
    }
  }
}
