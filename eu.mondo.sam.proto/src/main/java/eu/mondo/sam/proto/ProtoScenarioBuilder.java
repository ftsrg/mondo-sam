package eu.mondo.sam.proto;

import eu.mondo.sam.core.scenarios.BenchmarkScenario;
import eu.mondo.sam.core.scenarios.ScenarioBuilder;

public class ProtoScenarioBuilder implements ScenarioBuilder{

	private ProtoConfig protoConfig;
	
	@Override
	public BenchmarkScenario getScenario() {
		ProtoScenario protoCase = new ProtoScenario("ProtoScenario");
		protoCase.setProtoConfig(protoConfig);
		protoCase.buildScenario();
		return protoCase;
	}
	
	public void setProtoConfig(ProtoConfig protoConfig) {
		this.protoConfig = protoConfig;
	}

}
