package eu.mondo.sam.proto;

import eu.mondo.sam.core.metrics.MemoryMetric;
import eu.mondo.sam.core.metrics.TimerMetric;
import eu.mondo.sam.core.phases.AtomicPhase;

public class MultiplePhase extends AtomicPhase{

	private ProtoScenario protoCase;
	
	public MultiplePhase(String name) {
		super(name);
	}

	public void setProtoCase(ProtoScenario protoCase) {
		this.protoCase = protoCase;
	}

	@Override
	public void execute() {
		TimerMetric timer = (TimerMetric)metrics.get(0);
		MemoryMetric memory = (MemoryMetric)metrics.get(1);
		timer.startMeasure();
		
		int number = protoCase.getModel().getNumber();
		number *= 2;
		((ChangesMetric)this.metrics.get(2)).setChangesValue(number);
		protoCase.getModel().setNumber(number);
		
		timer.stopMeasure();
		memory.measure();
	}
}
