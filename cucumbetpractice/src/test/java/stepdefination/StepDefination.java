package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	
	@Given("^user is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://www.eyerne.com/");
	  
	}

	@When("^user navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	
	    // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(arg1);
        driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys(arg2);
        driver.findElement(By.xpath("//*[@class='o-btn o-btn--small o-btn--primary o-btn--shadow-green']")).click();
	}

	@Then("^user should Login Successfully$")
	public void user_should_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	String title =	driver.getTitle();
	System.out.println(title);
	  
	}



}
