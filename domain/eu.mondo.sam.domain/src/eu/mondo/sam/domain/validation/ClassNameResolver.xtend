package eu.mondo.sam.domain.validation

import eu.mondo.sam.domain.benchmark.AtomicPhase
import eu.mondo.sam.domain.benchmark.AttachedPhase
import java.util.List
import eu.mondo.sam.domain.benchmark.PhaseReference
import eu.mondo.sam.domain.benchmark.NewPhase
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.NewMetric
import eu.mondo.sam.domain.benchmark.Element
import eu.mondo.sam.domain.benchmark.MetricType
import eu.mondo.sam.domain.benchmark.MetricTypeReference
import eu.mondo.sam.domain.benchmark.AttachedMetric
import eu.mondo.sam.domain.benchmark.Scenario

class ClassNameResolver {
	
		
	def static dispatch resolve(Scenario scenario, List<String> classNames, Element original){
		scenario.rootPhase.resolve(classNames, original)
		
	}
		
	def static dispatch resolve(OptionalPhase optional, List<String> classNames, Element original){
		if (optional != original){
			classNames.add(optional.classname)
		}
		
		optional.phase.resolve(classNames, original)
	}
	
	def static dispatch resolve(IterationPhase iteration, List<String> classNames, Element original){
		iteration.phase.resolve(classNames, original)
	}
	
	def static dispatch resolve(SequencePhase sequence, List<String> classNames, Element original){
		for (p : sequence.phases){
			p.resolve(classNames, original)
		}
	}
	
	def static dispatch resolve(AtomicPhase atomic, List<String> classNames, Element original){
		if (atomic != original){
			classNames.add(atomic.classname)
		}
		for (m : atomic.metrics){
			m.resolve(classNames, original)
		}
	}
	
	
	
	def static dispatch resolve(MetricType metric, List<String> classNames, Element original){
	}
	
	def static dispatch resolve(MetricTypeReference metric, List<String> classNames, Element original){
	}
	
	def static dispatch resolve(AttachedMetric metric, List<String> classNames, Element original){
		if (metric instanceof NewMetric){
			metric.resolve(classNames, original)
		}
	}
	
	def static dispatch resolve(NewMetric metric, List<String> classNames, Element original){
		if (metric != original){
			classNames.add(metric.classname)
		}
	}	

	def static dispatch resolve(AttachedPhase attached, List<String> classNames, Element original){
		if (attached instanceof NewPhase){
			(attached as NewPhase).phase.resolve(classNames, original)
		}
	}	
}