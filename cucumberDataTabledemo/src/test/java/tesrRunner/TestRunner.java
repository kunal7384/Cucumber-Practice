package tesrRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Selenium practice code\\cucumberDataTabledemo\\src\\test\\resources\\Feature\\eye.feature",glue= {"stepDefination"},dryRun=true,monochrome=true)
public class TestRunner {
	

}
