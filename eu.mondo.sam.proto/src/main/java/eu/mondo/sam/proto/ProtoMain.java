package eu.mondo.sam.proto;


import org.apache.commons.cli.ParseException;

public class ProtoMain {

	public static void main(String[] args) throws ParseException{
		ProtoConfig protoConfig = new ProtoConfig(args);
		ProtoEngine protoEngine = new ProtoEngine(new ProtoScenarioBuilder());
		protoEngine.setProtoConfig(protoConfig);
		protoEngine.runBenchmark();
	}
}
