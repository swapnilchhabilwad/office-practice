package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//is displayed
		
		WebElement searchtb = driver.findElement(By.id("navbar-search-input"));
		if(searchtb.isDisplayed()) {
			
			System.out.println("Pass: Element is Displayed");
			
		}
		else 
		{
			System.out.println("Fail: Element is not Displayed");
		}
		driver.close();
		
		
		
		

	}

}
