package com.kunal.login.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepDefination.Step;

public class LoginPage {
	
	public static WebDriver driver;
	
	By username = By.xpath("//*[@id='email']");
	By pass = By.xpath("//*[@id='password']");
	By click = By.xpath("//*[@class='o-btn o-btn--primary o-btn--large o-btn--shadow-green']");

	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
		
	}
	
	public void Login_verify(String user ,String password) throws Throwable
	{
		
	driver.findElement(username).sendKeys(user);
	driver.findElement(pass).sendKeys(password);

	
		
	}
	public void clickThe()
	{
		
		driver.findElement(click).click();
	}
}
