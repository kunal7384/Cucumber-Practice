package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public static WebDriver driver;
	 @FindBy(xpath="//*[@href='http://shop.demoqa.com/product-tag/men/']")
    public static WebElement shop;
	public Home(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this); 
	//PageFactory.initElements(driver, this);
		
		
	}
	public void homePgae() throws InterruptedException
	{
	driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	driver.get("http://shop.demoqa.com/");
	}
	public void click() throws InterruptedException{
	System.out.println("Hello ");
	Thread.sleep(2000);
    shop.click();
	}
}
