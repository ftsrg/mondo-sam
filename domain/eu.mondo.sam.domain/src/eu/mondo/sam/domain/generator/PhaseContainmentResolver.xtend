package eu.mondo.sam.domain.generator

import java.util.Set
import eu.mondo.sam.domain.benchmark.AttachedPhase
import eu.mondo.sam.domain.benchmark.Element
import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.NewPhase
import eu.mondo.sam.domain.benchmark.AtomicPhase
import eu.mondo.sam.domain.benchmark.PhaseReference

class PhaseContainmentResolver {
	
	def static Set<Element> resolvePhases(AttachedPhase phase, Set<Element> elements){
		phase.resolve(elements)
		elements
	}
	
	def static dispatch resolve(SequencePhase sequence, Set<Element> elements){
		for (AttachedPhase attached : sequence.phases){
			attached.resolve(elements)
		}
	}
	
	def static dispatch resolve(IterationPhase iteration, Set<Element> elements){
		iteration.phase.resolve(elements)
	}
	
	def static dispatch resolve(OptionalPhase optional, Set<Element> elements){
		elements.add(optional)
		optional.phase.resolve(elements)
	}
	
	def static dispatch resolve(AttachedPhase attached, Set<Element> elements){
		if (attached instanceof PhaseReference){
			(attached as PhaseReference).phase.resolve(elements)
		}
		if (attached instanceof NewPhase){
			(attached as NewPhase).phase.resolve(elements)
		}
	}
	
	def static dispatch resolve(AtomicPhase atomic, Set<Element> elements){
		elements.add(atomic)
	}
	
}