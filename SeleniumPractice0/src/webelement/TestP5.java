package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Female']"));
		if (checkbox.isSelected()) 
		{
			System.out.println("Pass: Element is checked");
		}
		else 
		{
			System.out.println("Fail: Element is not checked");
		}
		driver.close();
		

	}

}
