package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadpopups {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement version = driver.findElement(By.xpath("((//a[text()='API Docs'])[5]"));
		//WebElement version = driver.findElement(By.xpath("//a[text()='4.16.1']"));
		//WebElement version = driver.findElement(By.xpath("(//a[text()='Changelog'])[5]"));
		WebElement version = driver.findElement(By.xpath("(//div[@class='row justify-content-center p-5'])[1]"));
		
		Point loc = version.getLocation();
		int X = loc.getX();
		int Y = loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		
		driver.findElement(By.xpath("//a[text()='4.16.1']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
