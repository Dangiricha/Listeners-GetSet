package com.OrangeHR.Application;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_Example {
	static List<String> failedlink;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver");
driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard/");
List<WebElement> links= driver.findElements(By.tagName("a"));
System.out.println("Total links are "+ links.size());
 failedlink = new ArrayList<String>();
for (int i=0; i<links.size(); i++){
	WebElement ele= links.get(i);
	String url=ele.getAttribute("href");
	System.out.println("Total links are"+ links.size());
	ValidateLinks(url);
	}

}
	
	public static void ValidateLinks (String linkUrl){
		
	
		
		try{
			
			
			URL url= new URL(linkUrl);
			HttpURLConnection httpURLConnect =(HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()!=200)
			{
				System.out.println(linkUrl+"-is not giving 200 status code"+ httpURLConnect.getResponseMessage());
				failedlink.add(linkUrl);
			}if(httpURLConnect.getResponseCode()== 200){
				System.out.println(linkUrl+" - "+ httpURLConnect.getResponseMessage());
			
			}if (httpURLConnect.getResponseCode()== HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+" - "+ httpURLConnect.getResponseMessage()+ " - "+ HttpURLConnection.HTTP_NOT_FOUND);
				failedlink.add(linkUrl);
			}
			if (failedlink.size()>0){
				System.out.println("error in link");
			}
		}catch(Exception e){
			
		}
		
	}

}
