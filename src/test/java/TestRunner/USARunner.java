package TestRunner;



import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class USARunner {
	@CucumberOptions(
			
					features = "C:\\Users\\19175\\eclipse-workspace\\com.toyota\\src\\resources\\java\\Features", //the path of the feature files
					glue={"StepDef"}, //the path of the step definition files
					format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
					dryRun = false, //to check the mapping is proper between feature file and step def file
					tags = {"@test"},
					monochrome=true
					)
			 
			
@Test
	public class MyTestRunner extends AbstractTestNGCucumberTests{

	}

}





//"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"