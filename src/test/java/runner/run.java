package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Herouk/login.feature",glue = "definations")


public class run extends AbstractTestNGCucumberTests{
	
	

}
