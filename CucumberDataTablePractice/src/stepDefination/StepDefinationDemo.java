package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationDemo {

	public static WebDriver driver;
	@Given("^Enter url and hit Enter button$")
	public void enter_url_and_hit_Enter_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver= new ChromeDriver();
	   driver.get("http://www.eyerne.com/");
	}

/*	@When("^user Enter First name and Last Name$")
	public void user_Enter_First_name_and_Last_Name(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> dataTable= data.raw();
driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys(dataTable.get(0).get(0));
driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(dataTable.get(0).get(1));
		
	}

	@When("^User Enter Email and ConfirmEmail$")
	public void user_Enter_Email_and_ConfirmEmail(DataTable data1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> dataTable1= data1.raw();
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(dataTable1.get(0).get(0));
		driver.findElement(By.xpath("//*[@name='confirmEmail']")).sendKeys(dataTable1.get(0).get(1));
				
			}
	

	@When("^user enter password and date of birth$")
	public void user_enter_password_and_date_of_birth(DataTable data2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> dataTable2= data2.raw();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(dataTable2.get(0).get(0));
		//driver.findElement(By.xpath("//*[@name='confirmEmail']")).sendKeys(dataTable1.get(0).get(1));
				
	}

	@When("^user select his gender$")
	public void user_select_his_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^User accept terms and condition$")
	public void user_accept_terms_and_condition() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User click on submit link$")
	public void user_click_on_submit_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("^user sucessfully registered and redirect to Home page$")
	public void user_sucessfully_registered_and_redirect_to_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}*/
	
	
	@When("^user Enterdetails of Registration$")
	public void user_Enterdetails_of_Registration(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>>  datatable = data.raw();
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys(datatable.get(0).get(0));
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(datatable.get(0).get(1));
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(datatable.get(0).get(2));
		driver.findElement(By.xpath("//*[@name='confirmEmail']")).sendKeys(datatable.get(0).get(3));
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(datatable.get(0).get(4));		
				
		
	 
	}

	@Then("^user refirect to home page$")
	public void user_refirect_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}




}
