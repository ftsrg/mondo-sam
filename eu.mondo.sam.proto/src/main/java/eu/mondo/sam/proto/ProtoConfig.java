package eu.mondo.sam.proto;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

public class ProtoConfig{

	public ProtoConfig(String... args) throws ParseException{
		initializeOptions(args);
	}
		
	public void initializeOptions(String... args) throws ParseException{
		Options options = new Options();
		
		options.addOption("size", true, "Size of the model");
		options.addOption("case", true, "Benchmark case");
		
		CommandLineParser parser = new PosixParser();
		CommandLine cmd = parser.parse(options, args);
	}
	
}
