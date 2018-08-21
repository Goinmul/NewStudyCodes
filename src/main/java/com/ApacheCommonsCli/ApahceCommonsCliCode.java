package com.ApacheCommonsCli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class ApahceCommonsCliCode {

	public static void main (String[] args) throws ParseException {

		// 1. create option
		Options options = new Options();

		
		// 2. add options
		
		// #1 parameter is String, representing the option.
		// #2 parameter is boolean, specifies whether the option
		// requires an argument or not.
		// the argument is passed from user, in the command line.
		// #3 parameter is description of the option.
		options.addOption("t", false, "display current time(no input needed");
		options.addOption("p", true, "print the input");

		
		
		// 3. create command line object with parser (recommended : DefaultParser)
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);

		
		
		// 2-1. 
		// if you want to retrieve the argument value passed by user with option 'p',
		// code goes like this :
		String userInput = cmd.getOptionValue("p");
		if (userInput == null)
		{
			System.out.println("No user input.");
		}
		else
			System.out.println("User input : " + userInput);

		
		// 4. hasOptions 
		
		//checks if option is present or not.
		// You can set your cases depending on user options, here.
		if (cmd.hasOption("t"))
		{
			System.out.println("current time.");
		}
		else if (cmd.hasOption("p"))
		{
			String countryCode = cmd.getOptionValue("c");
			if (countryCode == null)
			{
				// print default date
			}
			else
			{
				// print countryCode + date
			}
		}
		
		
		
		// 5. Boolean options
		
		// Just create, add and use them.
		// 1) create
		// Options options = new Options(); // we did this before, so skipped 
		Option help = new Option("help", "print this message!");
		Option sample1 = new Option("sample1", "sample message!");
		// 3) add
		options.addOption(help);
		options.addOption(sample1);
		
		
		
		
		// 6. Argument options
		
		// you can create these with "OptionBuilder".
		Option lf = Option.builder() // option builder.
				.longOpt("option log file") // option's long name.
				.argName("argument name") // ??
				.hasArg() // Indicates that this options requires an argument. It's like 'true' in 2. add options.
				.desc("Description of this option") // simple description.
				.build();

		// later when you need to set cases in the code, (for readability, use long name)
		if (cmd.hasOption("option log file"))
		{
			// get the log file argument(which is passed) and print it
			System.out.println(cmd.getOptionValue("optino log file"));
		}
		
		Option fp = Option.builder()
				.desc("Description")
				.build();
		// Option fp is same as
		// options.addOption("fp", false, "Description");
		
		
		
		
		// 7. extra
		
		//HelpFormatter prints all the options, providing explanations.
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("sampleCLI", options);

	}

}
