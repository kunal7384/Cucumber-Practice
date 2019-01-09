package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\Selenium practice code\\cucumbetpractice\\src\\test\\resources\\feature\\logintest.feature",glue="stepdefination")
public class TestRunner {
	
	
	

}
