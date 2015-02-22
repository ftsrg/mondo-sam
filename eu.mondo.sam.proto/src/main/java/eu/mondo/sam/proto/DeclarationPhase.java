package eu.mondo.sam.proto;

import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.TimerMetric;
import eu.mondo.sam.core.phases.AtomicPhase;

public class DeclarationPhase extends AtomicPhase{

	private ProtoScenario protoScenario;
	
	public DeclarationPhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoScenario protoScenario) {
		this.protoScenario = protoScenario;
	}

	@Override
	public void execute(){
		TimerMetric timer = (TimerMetric)metrics.get(0);
		MemoryMetric memory = (MemoryMetric)metrics.get(1);
		timer.startMeasure();
		
		int sum = 0;
		for (int i = 0; i < 10000; i++){
			sum += i;
		}
		timer.stopMeasure();
		memory.measure();
	}
	
}
