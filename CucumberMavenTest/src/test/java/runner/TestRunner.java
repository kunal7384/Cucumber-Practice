package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="F:\\Selenium practice code\\CucumberMavenTest\\Feature\\my.feature"
		,glue={"/CucumberMavenTest/src/test/java/stepDefination"},tags={"@SmokeTest"}
		,dryRun= true,monochrome = true)
		
public class TestRunner {

}
