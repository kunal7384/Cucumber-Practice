package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.Scenario;

public class StepDefination {
  public static WebDriver driver;
  
  
  
  @Given("^User is on Home Page$")
  public void user_is_on_Home_Page() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    
  }

  @When("^User Navigate to LogIn Page$")
  public void user_Navigate_to_LogIn_Page() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
    driver.get("http://practice-pad.com/");
    String title = driver.getTitle();
    System.out.println("=====Title of WebApp is ====="+title);
  }

  @When("^User enters \"([^\"]*)\"and\"([^\"]*)\"$")
  public void user_enters_and(String uname, String pass) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
     
  

	  driver.findElement(By.id("username_or_email")).clear();
	  driver.findElement(By.id("username_or_email")).sendKeys(uname);
	  
	  driver.findElement(By.id("login_password")).clear();
	  driver.findElement(By.id("login_password")).sendKeys(pass);
	  driver.findElement(By.name("commit")).click();
	  
	  String excepted_url = driver.getCurrentUrl();
	  if(excepted_url.contains("http://practice-pad.com/users/"))
	  {
		  
		  System.out.println("User Login Suessfully ");
		  
		  
	  }
	  else 
	  {
		  System.out.println("User Not Login Successfully");
		  WebElement error_msg = driver.findElement(By.xpath("//*[@class='alert alert-danger text-center']"));
		  
		  System.out.println(error_msg.getText());
		  
	  }
      
  }
  
 
  
  @Given("^i enter\"([^\"]*)\"$")
  public void i_enter(String name) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.xpath("//*[text()='New Student']")).click();
     
      driver.findElement(By.id("user_fname")).sendKeys(name);
      Thread.sleep(1000);
  }

  @Then("^i enterr\"([^\"]*)\"$")
  public void i_enterr(String pass) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("user_lname")).sendKeys(pass);
	  driver.findElement(By.xpath("//*[text()='×']")).click();
	  Thread.sleep(1000);
	 
  }



}
