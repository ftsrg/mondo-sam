package eu.mondo.sam.proto;

import eu.mondo.sam.core.cases.BenchmarkCase;
import eu.mondo.sam.core.cases.CaseBuilder;

public class ProtoCaseBuilder implements CaseBuilder{

	@Override
	public BenchmarkCase buildCase() {
		ProtoCase protoCase = new ProtoCase("ProtoCase");
		protoCase.buildCase();
		return protoCase;
	}

}
