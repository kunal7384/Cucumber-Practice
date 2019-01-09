package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	  
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("http://www.eyerne.com/");
		 
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mis@narola.email");
	  driver.findElement(By.xpath("//*[@id='password_login']")).sendKeys("password");
	  driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	String title = driver.getTitle();
	System.out.println(title);
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	  System.out.println("Hello");
		driver.findElement(By.xpath("//*[@src='/assets/images/logo.svg']")).click();
		driver.findElement(By.xpath("//*[@class='c-user-menu__icon c-user-menu__icon-logout']")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String tit = driver.getTitle();
	    System.out.println(tit);
	}

	
}