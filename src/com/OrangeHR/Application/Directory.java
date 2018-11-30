package com.OrangeHR.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Directory {
	WebDriver driver;
	By directoryTab =By.id("menu_directory_viewDirectory");
	By enterName = By.id("searchDirectory_emp_name_empName");
	By searchButton = By.cssSelector("[name='_search']");
	
	public Directory(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void clickOnDirectoryTab(){
		driver.findElement(directoryTab).click();
	}

	public void EnterName(String name){
		driver.findElement(enterName).sendKeys(name);
	}

	public void clickOnSearchButton(){
		driver.findElement(searchButton).click();;
	}
	
	
}
