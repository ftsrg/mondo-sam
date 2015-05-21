package eu.mondo.sam.domain.validation

import eu.mondo.sam.domain.benchmark.Scenario
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.AtomicPhase
import eu.mondo.sam.domain.benchmark.AttachedPhase
import eu.mondo.sam.domain.benchmark.NewPhase
import eu.mondo.sam.domain.benchmark.NewMetric
import eu.mondo.sam.domain.benchmark.AttachedMetric
import eu.mondo.sam.domain.benchmark.MetricTypeReference
import eu.mondo.sam.domain.benchmark.MetricType
import java.util.Set
import org.eclipse.emf.ecore.EObject
import eu.mondo.sam.domain.benchmark.Phase
import eu.mondo.sam.domain.benchmark.PhaseReference

class CircleResolver {
			
	def static dispatch boolean resolve(OptionalPhase phase, Set<EObject> phases){
		if (phases.contains(phase)){
			return true
		}
		else{
			phases.add(phase)
			if (resolve(phase.phase, phases)){
				return true
			}
			
		}
		return false
	}
	
	def static dispatch boolean resolve(Phase phase, Set<EObject> phases){
		return false
	}
	
	def static dispatch boolean resolve(AttachedPhase phase, Set<EObject> phases){
		return false
	}
	
	def static dispatch boolean resolve(PhaseReference phase, Set<EObject> phases){
		return resolve(phase.phase, phases)
	}
	
	
	def static dispatch boolean resolve(SequencePhase phase, Set<EObject> phases){
		if (phases.contains(phase)){
			return true
		}
		else{
			phases.add(phase)
			for (p : phase.phases){
				if (resolve(p, phases)){
					return true
				}
			}
		}
		return false
	}
	
	def static dispatch boolean resolve(IterationPhase phase, Set<EObject> phases){
		if (phases.contains(phase)){
			return true
		}
		else{
			phases.add(phase)
			if (resolve(phase.phase, phases)){
				return true
			}
			
		}
		return false
	}
}