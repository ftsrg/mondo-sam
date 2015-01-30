package eu.mondo.sam.proto;


import org.apache.commons.cli.ParseException;

import eu.mondo.sam.core.phases.BenchmarkEngine;

public class ProtoMain {

	public static void main(String[] args) throws ParseException{
		BenchmarkEngine benchmarkEngine = new BenchmarkEngine(new ProtoCaseBuilder());
		benchmarkEngine.runBenchmark();
	}
}
