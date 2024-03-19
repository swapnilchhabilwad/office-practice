package Multipleselect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("cars"));
		ele.click();
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("opel");
		s.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else 
		{
			System.out.println("Fail: element is not multiselectable ");
		}
		
		Thread.sleep(2000);
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
