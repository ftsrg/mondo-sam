package eu.mondo.sam.proto;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;

public class ProtoCaseBuilder implements CaseBuilder{

	private ProtoConfig protoConfig;
	
	@Override
	public BenchmarkCase getCase() {
		ProtoCase protoCase = new ProtoCase("ProtoCase");
		protoCase.setProtoConfig(protoConfig);
		protoCase.buildCase();
		return protoCase;
	}
	
	public void setProtoConfig(ProtoConfig protoConfig) {
		this.protoConfig = protoConfig;
	}

}
