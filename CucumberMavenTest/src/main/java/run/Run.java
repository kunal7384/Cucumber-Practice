package run;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;

public class Run {
	
	
	WebDriver driver;
	

	
	    // Write code here that turns the phrase above into concrete actions
	    
	

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Home home = new Home(driver);
		   home.homePgae();
		   home.click();
	}

	@When("^user navigate to shopping page$")
	public void user_navigate_to_shopping_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 String s =driver.getTitle();
		  System.out.println(s);
	}

	@Then("^user should sucessfully navigate$")
	public void user_should_sucessfully_navigate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String get = driver.getCurrentUrl();
	    System.out.println(get);
	}



	}


