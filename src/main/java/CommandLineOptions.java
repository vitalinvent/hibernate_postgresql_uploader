import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

public class CommandLineOptions extends OptionsBase {
    @Option(
            name = "help",
            abbrev = 'h',
            help = "Prints usage info.",
            defaultValue = "false"
    )
    public String help;
    @Option(
            name = "mconf",
            help = "Main config file.",
            defaultValue = ""
    )
    public String main_config;
    @Option(
            name = "hconf",
            help = "Hibernate config file (To change default settings).",
            defaultValue = ""
    )
    public String hibernate_config;
//    @Option(
//            name = "xmlld",
//            help = "Xml file to analyse, create database and load to database",
//            defaultValue = ""
//    )
//    public String xml_file_to_load;
    @Option(
            name = "compile",
            help = "Compile java enfile",
            defaultValue = ""
    )
    public String compile_file;
    @Option(
            name = "factscsv",
            help = "Load CSV file facts",
            defaultValue = ".\\csv"
    )
    public String facts_cvs_file;
    @Option(
            name = "analyticsxml",
            help = "Load XML file analytics",
            defaultValue = "tree1c.xml"
    )
    public String analytics_xml_file;}
