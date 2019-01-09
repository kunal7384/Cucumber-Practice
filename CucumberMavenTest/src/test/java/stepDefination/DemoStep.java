package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStep {
	WebDriver driver;
	
	
	
	
	

@Given("^Open and Launch the Browser$")
public void open_and_Launch_the_Browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 driver =new ChromeDriver();
	    driver.get("http://www.eyerne.com/sign-in");

}

@When("^i enter Valid\"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_Valid_and(String u, String p) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys(u);
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(p);
    throw new PendingException();
}

@Then("^user should login Sucessfully$")
public void user_should_login_Sucessfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("fkgh");
    throw new PendingException();
}






}
