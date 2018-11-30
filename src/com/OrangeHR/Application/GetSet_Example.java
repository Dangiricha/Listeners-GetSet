package com.OrangeHR.Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listener.class)
public class GetSet_Example {
	Properties pro;
	WebDriver driver;
	DataVariable obj_DV =new DataVariable();
	
	@Test(priority=1)
	public void Login( ) throws IOException{
		System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver");
		File src = new File ("./Data.properties");
		

		FileInputStream fis = new FileInputStream(src);
		
		
		pro = new Properties();
		 pro.load(fis);;
	
	}
	@Test(priority=2)
	public void dashboard(){
		//obj_DV.GetName();
		//System.out.println(obj_DV.GetName());
		System.out.println("inside Testmethod2");
		obj_DV.SetName("Admin");
		obj_DV.GetName();
		System.out.println(obj_DV.GetName());
		
		obj_DV.SetPassword("admin123");
			
			obj_DV.GetPswd();
			
			System.out.println(obj_DV.GetPswd());
	}
	@Test(priority=3)
public void setdashboard(){
	//obj_DV.SetName("ram");
		System.out.println("inside Testmethod3");
		obj_DV.SetName("admin123");
		obj_DV.GetName();
		System.out.println(obj_DV.GetName());
		obj_DV.SetPassword("admin");
			
			obj_DV.GetPswd();
			
			System.out.println(obj_DV.GetPswd());
		Assert.fail();
}
}
