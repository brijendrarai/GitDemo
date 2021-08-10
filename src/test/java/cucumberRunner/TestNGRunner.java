package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features"
		,glue = "stepDefination"
		//,stepNotifications = true
		//,tags = "@SeleniumPractice"
		,publish = false
		//,plugin = {"pretty","json:target/cucumber.txt"}
		//,dryRun=true  //this is to verify whether all steps are implemented or not
		,monochrome = true //this is to remove funcky symbol and to generate clean console
		,plugin = {"pretty","html:target/cucumber2.html","json:target/cucumber1.txt","junit:target/junitreports.xml"}
		) 
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
