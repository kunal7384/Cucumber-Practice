package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStep {
	
	public static WebDriver driver;
	
	@Given("^open chrome browser and luanch the application$")
	public void open_chrome_browser_and_luanch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver =new ChromeDriver();
	    driver.get("http://www.eyerne.com/sign-in");
	}

	@When("^Enter the Username \"([^\"]*)\"and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String u, String p) throws Throwable {
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(u);
	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys(p);
	  Thread.sleep(1000);
;
	}

	@Then("^Login sucessfully$")
	public void login_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
driver.findElement(By.xpath("//*[@alt='http://www.eyerne.com/system/users/professional_avatars/000/000/012/original/download_%281%29.jpeg']")).click();
	}
	
	


	



	

}
