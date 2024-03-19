package Popups;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/selenium-framework-automation-new");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement playbtn = driver.findElement(By.xpath("//div[@class='PlayButton_module_playButtonWrapper__fc6bec57']"));
		playbtn.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		//a.accept();
		driver.findElement(By.xpath("//span[text()='Share via Twitter']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.xpath("(//span[text()='Log in'])[2]")).click();
		//driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='text']"));
		txtbox.sendKeys("asdflkj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Forgot password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("8978456525");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
