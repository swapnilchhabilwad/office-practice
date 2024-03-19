package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestP3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(button.isEnabled())			
		{
		System.out.println("Pass: Element is enabled");	
		}
		else
		{
		System.out.println("Fail: Element is disabled");	
		}	
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
