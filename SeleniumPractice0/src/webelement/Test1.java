package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Get Text
		
		WebElement ele = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the pe')]"));
		System.out.println(ele.getText());
		//driver.close();
		
		// Get Size.
		
		WebElement email = driver.findElement(By.id("email"));
		
		Dimension s = email.getSize();
		int h=s.getHeight();
		System.out.println(h+ ":- is the height of the element");
		
		int w = s.getWidth();
		System.out.println(w+ ":- is the width of the element");
		
		
		Point loc = email.getLocation();
		int X = loc.getX();
		int Y = loc.getY();
		
		System.out.println(X+":- is the X Co-ordinate of the element");
		System.out.println(Y+":- is the Y Co-ordinate of the element");
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
