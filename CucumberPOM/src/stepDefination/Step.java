package stepDefination;

import com.kunal.testcases.Eyerne;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	@Given("^open chrome browser and luanch the application$")
	public void open_chrome_browser_and_luanch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Eyerne eyerne = new Eyerne();
	    eyerne.launch();
	}

	@When("^Enter the \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void enter_the_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	    Eyerne eyerne = new Eyerne();
	    eyerne.enterUser();
	}


		
	

	@Then("^Login sucessfully$")
	public void login_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Eyerne eyerne = new Eyerne();
		    eyerne.click();
	}



}
