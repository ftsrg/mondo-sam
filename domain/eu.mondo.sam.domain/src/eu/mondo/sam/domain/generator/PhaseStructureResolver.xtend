package eu.mondo.sam.domain.generator

import eu.mondo.sam.domain.benchmark.Phase
import eu.mondo.sam.domain.benchmark.AtomicPhase
import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.AttachedPhase
import eu.mondo.sam.domain.benchmark.PhaseReference
import eu.mondo.sam.domain.benchmark.NewPhase

class PhaseStructureResolver {
	
	def static String resolvePhases(AttachedPhase phase){
		var structure = "rootPhase = "
		
		structure += phase.resolve
		
		structure += ";"
	}
	
	def static dispatch resolve(SequencePhase sequence){
		var structure = "new SequencePhase("
		var first = true
		for (AttachedPhase phase : sequence.phases){
			if (!first){
				structure += ''','''
			}
			structure += '''
				«phase.resolve»
			'''
			first = false
		}
		structure += ")"
	}
	
	def static dispatch resolve(IterationPhase iteration){
		var structure = '''new IterationPhase(«iteration.iteration», 
		«iteration.phase.resolve»
		)
		'''
		structure
	}
	
	def static dispatch resolve(OptionalPhase optional){
		
	}
	
	def static dispatch resolve(AttachedPhase attached){
		var structure = ""
		if (attached instanceof PhaseReference){
			structure += (attached as PhaseReference).phase.resolve
		}
		if (attached instanceof NewPhase){
			structure += (attached as NewPhase).phase.resolve
		}
		structure
	}
	
	def static dispatch resolve(AtomicPhase atomic){
		var structure = '''new «atomic.classname»("«atomic.classname»")'''
		structure
	}
}