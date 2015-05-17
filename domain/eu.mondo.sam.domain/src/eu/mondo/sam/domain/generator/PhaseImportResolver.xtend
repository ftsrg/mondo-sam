package eu.mondo.sam.domain.generator

import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.AttachedPhase
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.PhaseReference
import eu.mondo.sam.domain.benchmark.NewPhase
import eu.mondo.sam.domain.benchmark.AtomicPhase
import java.util.Set
import java.util.HashSet
import java.util.TreeSet

class PhaseImportResolver {
	
	def static Set<String> resolvePhases(AttachedPhase phase, String ownPackage){
		var Set<String> imports = new TreeSet<String>()
		
		phase.resolve(imports, ownPackage)
		
		imports
	}
	
	def static dispatch resolve(SequencePhase sequence, Set<String> imports, String ownPackage){
		imports.add("eu.mondo.sam.core.phases.SequencePhase;")
		for (AttachedPhase attached : sequence.phases){
			attached.resolve(imports, ownPackage)
		}
	}
	
	def static dispatch resolve(IterationPhase iteration, Set<String> imports, String ownPackage){
		imports.add("eu.mondo.sam.core.phases.IterationPhase;")
		iteration.phase.resolve(imports, ownPackage)
	}
	
	def static dispatch resolve(OptionalPhase optional, Set<String> imports, String ownPackage){
		imports.add('''«ownPackage».phases.«optional.classname»;''')
		optional.phase.resolve(imports, ownPackage)
	}
	
	def static dispatch resolve(AttachedPhase attached, Set<String> imports, String ownPackage){
		if (attached instanceof PhaseReference){
			(attached as PhaseReference).phase.resolve(imports, ownPackage)
		}
		if (attached instanceof NewPhase){
			(attached as NewPhase).phase.resolve(imports, ownPackage)
		}
	}
	
	def static dispatch resolve(AtomicPhase atomic, Set<String> imports, String ownPackage){
		imports.add('''«ownPackage».phases.«atomic.classname»;''')
	}
	
}