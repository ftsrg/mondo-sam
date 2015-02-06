package eu.mondo.sam.proto;

import eu.mondo.sam.core.cases.CaseBuilder;
import eu.mondo.sam.core.BenchmarkEngine;

public class ProtoEngine extends BenchmarkEngine{

	private ProtoConfig protoConfig;
	private ProtoCaseBuilder protoCaseBuilder;
	
	public ProtoEngine(ProtoCaseBuilder protoCaseBuilder) {
		super((CaseBuilder)protoCaseBuilder);
		this.protoCaseBuilder = protoCaseBuilder;
	}
	
	public void setProtoConfig(ProtoConfig protoConfig) {
		this.protoConfig = protoConfig;
	}
	
	@Override
	public void runBenchmark() throws CloneNotSupportedException{
		protoConfig.processArguments();
		protoCaseBuilder.setProtoConfig(protoConfig);
		super.runBenchmark();
	}
	
	
}
