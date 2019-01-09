package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	
	public static WebDriver driver;
	
	
	@Given("^open chrome browsder and launch application$")
	public void open_chrome_browsder_and_launch_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("http://www.eyerne.com/sign-in");
		
	  
	}

	@When("^i enter username and password$")
	public void i_enter_username_and_password(DataTable user) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		user.raw();
		List<List<String>> data= user.raw();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(data.get(0).get(0));
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(data.get(0).get(1));
		driver.findElement(By.xpath("//*//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@href='/my-properties']")).click();

	   
	}

	@Then("^user should login$")
	public void user_should_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(driver);
	}
	
	




}
