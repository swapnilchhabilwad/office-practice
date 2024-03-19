package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		Point loc = button.getLocation();
		int X = loc.getX();
		System.out.println(X+" is the X co-ordinate of the submit button");
		
		int Y = loc.getY();
		System.out.println(Y+" is the Y co-ordinate of the submit button");
		
		driver.close();
		
		
		
		
		
		
		

	}

}
