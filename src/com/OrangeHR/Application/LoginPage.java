package com.OrangeHR.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By username =By.id("txtUsername");
	By password= By.id("txtPassword");
	By loginButton = By.cssSelector("[name='Submit']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
public void typeUserName(String uid){
	driver.findElement(username).sendKeys(uid);
}

public void typePassword(String pass){
	driver.findElement(password).sendKeys(pass);
}

public void clickOnLoginButton(){
	driver.findElement(loginButton).click();;
}
}
