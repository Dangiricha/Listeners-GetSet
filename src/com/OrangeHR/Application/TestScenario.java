package com.OrangeHR.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestScenario {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver");
		
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/ined.php/auth/login");
		}
	@Test(priority=1)
	public void verifyValidLogin(){
		LoginPage login=new LoginPage(driver);
		login.typeUserName("Admin");
		login.typePassword("admin123");
		login.clickOnLoginButton();
	}
	
	@Test(priority=2)
	public void verifyDirectotyTab(){
		Directory tab=new Directory(driver);
		tab.clickOnDirectoryTab();
		tab.EnterName("Thomas");
		tab.clickOnSearchButton();
}}
