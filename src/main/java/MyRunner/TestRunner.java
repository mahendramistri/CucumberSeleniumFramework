package MyRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "/home/dell/Documents/Projects/CucumberSeleniumFramework/src/main/java/Features/deals.feature", //the path of the feature files
			glue={"/src/main/java/stepDefinitions"} //the path of the step definition files
//			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
//			monochrome = true, //display the console output in a proper readable format
//			strict = true, //it will check if any step is not defined in step definition file
//			dryRun = false //to check the mapping is proper between feature file and step def file
//			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
			)
	 
	public class TestRunner {
	 
	}
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	

