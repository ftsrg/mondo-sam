package eu.mondo.sam.proto;


import org.apache.commons.cli.ParseException;

import eu.mondo.sam.core.phases.BenchmarkEngine;

public class ProtoMain {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException{
		ProtoConfig protoConfig = new ProtoConfig(args);
		ProtoEngine protoEngine = new ProtoEngine(new ProtoCaseBuilder());
		protoEngine.setProtoConfig(protoConfig);
		//BenchmarkEngine benchmarkEngine = new BenchmarkEngine(new ProtoCaseBuilder());
		//benchmarkEngine.runBenchmark();
		protoEngine.runBenchmark();
	}
}
