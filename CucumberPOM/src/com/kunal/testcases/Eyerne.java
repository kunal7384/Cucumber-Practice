package com.kunal.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kunal.login.page.LoginPage;

public class Eyerne {
	
	public static WebDriver driver ; 
	
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("http://www.eyerne.com/sign-in");
		
	}
	
	
	public void enterUser() throws Throwable
	{
		
		LoginPage login = new LoginPage(driver);
		login.Login_verify("username", "password");
		
		
	}
	
	public void click()
	
	
	
	{
		LoginPage login = new LoginPage(driver);
		login.clickThe();
		
	}

}
