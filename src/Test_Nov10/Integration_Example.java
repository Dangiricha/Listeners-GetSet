package Test_Nov10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Integration_Example {
	
	
	public void LaunchBrowser() throws IOException{
		Properties prop;
		File src = new File("./Data.properties");
		FileInputStream fis = new  FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println("*****"+ pro.getProperty("url"));
		System.out.println("*****"+ pro.getProperty("Username"));
		System.out.println("*****"+ pro.getProperty("Password"));
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/Riaan/Downloads");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
	}

}
