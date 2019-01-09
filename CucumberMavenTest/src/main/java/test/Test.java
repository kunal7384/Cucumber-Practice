package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="F:\\Selenium practice code\\CucumberMavenTest\\src\\test\\resources\\Feature\\test.feature"
		,glue={"F:\\Selenium practice code\\CucumberMavenTest\\src\\main\\java\\test"})
		
public class Test {

}
