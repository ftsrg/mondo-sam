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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PhaseStructureResolver {
  public static String resolvePhases(final AttachedPhase phase) {
    String _xblockexpression = null;
    {
      String structure = "rootPhase = ";
      String _structure = structure;
      String _resolve = PhaseStructureResolver.resolve(phase);
      structure = (_structure + _resolve);
      String _structure_1 = structure;
      _xblockexpression = structure = (_structure_1 + ";");
    }
    return _xblockexpression;
  }
  
  protected static String _resolve(final SequencePhase sequence) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new SequencePhase(");
      _builder.newLine();
      String structure = _builder.toString();
      boolean first = true;
      EList<AttachedPhase> _phases = sequence.getPhases();
      for (final AttachedPhase phase : _phases) {
        {
          if ((!first)) {
            String _structure = structure;
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\t\t");
            _builder_1.append(",");
            _builder_1.newLine();
            structure = (_structure + _builder_1);
          }
          String _structure_1 = structure;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("\t\t");
          Object _resolve = PhaseStructureResolver.resolve(phase);
          _builder_2.append(_resolve, "\t\t");
          _builder_2.newLineIfNotEmpty();
          structure = (_structure_1 + _builder_2);
          first = false;
        }
      }
      String _structure = structure;
      _xblockexpression = structure = (_structure + ")");
    }
    return _xblockexpression;
  }
  
  protected static String _resolve(final IterationPhase iteration) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new IterationPhase(");
      int _iteration = iteration.getIteration();
      _builder.append(_iteration, "");
      _builder.append(", ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      AttachedPhase _phase = iteration.getPhase();
      Object _resolve = PhaseStructureResolver.resolve(_phase);
      _builder.append(_resolve, "\t\t");
      _builder.append(")");
      String structure = _builder.toString();
      _xblockexpression = structure;
    }
    return _xblockexpression;
  }
  
  protected static String _resolve(final OptionalPhase optional) {
    return null;
  }
  
  protected static String _resolve(final AttachedPhase attached) {
    String _xblockexpression = null;
    {
      String structure = "";
      if ((attached instanceof PhaseReference)) {
        String _structure = structure;
        Phase _phase = ((PhaseReference) attached).getPhase();
        Object _resolve = PhaseStructureResolver.resolve(_phase);
        structure = (_structure + _resolve);
      }
      if ((attached instanceof NewPhase)) {
        String _structure_1 = structure;
        Phase _phase_1 = ((NewPhase) attached).getPhase();
        Object _resolve_1 = PhaseStructureResolver.resolve(_phase_1);
        structure = (_structure_1 + _resolve_1);
      }
      _xblockexpression = structure;
    }
    return _xblockexpression;
  }
  
  protected static String _resolve(final AtomicPhase atomic) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new ");
      String _classname = atomic.getClassname();
      _builder.append(_classname, "");
      _builder.append("(\"");
      String _classname_1 = atomic.getClassname();
      _builder.append(_classname_1, "");
      _builder.append("\")");
      String structure = _builder.toString();
      _xblockexpression = structure;
    }
    return _xblockexpression;
  }
  
  public static String resolve(final EObject atomic) {
    if (atomic instanceof AtomicPhase) {
      return _resolve((AtomicPhase)atomic);
    } else if (atomic instanceof IterationPhase) {
      return _resolve((IterationPhase)atomic);
    } else if (atomic instanceof OptionalPhase) {
      return _resolve((OptionalPhase)atomic);
    } else if (atomic instanceof SequencePhase) {
      return _resolve((SequencePhase)atomic);
    } else if (atomic instanceof AttachedPhase) {
      return _resolve((AttachedPhase)atomic);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atomic).toString());
    }
  }
}
