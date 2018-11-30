package Test_Nov10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {
	
			
		

				WebDriver driver;
				   
				System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver");
				
				driver = new ChromeDriver();
				
				//driver.manage().window().maximize();
				
				driver.get("https://www.google.com/");
				java.util.List<WebElement> MyLinks= driver.findElements(By.tagName("a"));
				for(WebElement e1:MyLinks)
				{
					System.out.println(e1.getText());
				}
				
				
	}

}
