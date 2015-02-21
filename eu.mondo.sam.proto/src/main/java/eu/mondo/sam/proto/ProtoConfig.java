package eu.mondo.sam.proto;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import eu.mondo.sam.core.results.BenchmarkResult;

public class ProtoConfig{

	private CommandLine cmd;
	private int size;
	private String scenario;
	private int runIndex;
	private String tool;
	private String caseName;
	
	public ProtoConfig(String... args) throws ParseException{
		initializeOptions(args);
	}
		
	public void initializeOptions(String... args) throws ParseException{
		Options options = new Options();
		/*Option size = new Option("size", "Size of the model");
		size.setRequired(true);
		options.addOption(size);*/
		Option size = OptionBuilder.withArgName("size")
								   .withLongOpt("size")
								   .isRequired()
								   .hasArg()
								   .withDescription("Size of he model")
								   .create();
		Option scenario = OptionBuilder.withArgName("scenario")
				                       .withLongOpt("scenario")
				                       .isRequired()
				                       .hasArg()
				                       .withDescription("Scenario")
				                       .create();
		options.addOption(size);
		options.addOption(scenario);
		options.addOption("resultPath", true, "Path of the result folder");
		options.addOption("runIndex", true, "Index");
		options.addOption("tool", true, "Tool");
		
		CommandLineParser parser = new PosixParser();
		cmd = parser.parse(options, args);
	}
	
	public void processArguments(){
		tool = cmd.getOptionValue("tool");
		if (tool == null)
			tool = "ProtoTool";
		size = Integer.parseInt(cmd.getOptionValue("size"));
		String resultPath = cmd.getOptionValue("resultPath");
		if (resultPath != null)
			BenchmarkResult.changeResultPath(resultPath);
		this.scenario = cmd.getOptionValue("scenario");
		String runIndexString = cmd.getOptionValue("runIndex");
		if (runIndexString != null)
			this.runIndex = Integer.parseInt(runIndexString);
		else this.runIndex = 1;
	}
	
	public String getScenario() {
		return scenario;
	}
	
	public int getSize() {
		return size;
	}
	
	public int getRunIndex() {
		return runIndex;
	}
	
	public String getTool() {
		return tool;
	}
	
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}
}
