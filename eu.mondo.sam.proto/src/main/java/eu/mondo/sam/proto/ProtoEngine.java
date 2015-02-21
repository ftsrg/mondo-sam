package eu.mondo.sam.proto;

import eu.mondo.sam.core.scenarios.ScenarioBuilder;
import eu.mondo.sam.core.BenchmarkEngine;

public class ProtoEngine extends BenchmarkEngine{

	private ProtoConfig protoConfig;
	private ProtoScenarioBuilder protoCaseBuilder;
	
	public ProtoEngine(ProtoScenarioBuilder protoCaseBuilder) {
		super((ScenarioBuilder)protoCaseBuilder);
		this.protoCaseBuilder = protoCaseBuilder;
	}
	
	public void setProtoConfig(ProtoConfig protoConfig) {
		this.protoConfig = protoConfig;
	}
	
	@Override
	public void runBenchmark(){
		protoConfig.processArguments();
		protoCaseBuilder.setProtoConfig(protoConfig);
		super.runBenchmark();
	}
	
	
}
