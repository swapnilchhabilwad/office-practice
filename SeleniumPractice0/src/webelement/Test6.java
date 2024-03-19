package webelement;

import java.time.Duration;
import java.util.List;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(15);
		Thread.sleep(2000);
		s.selectByValue("search-alias=furniture");
		Thread.sleep(2000);
		s.selectByVisibleText("Grocery & Gourmet Foods");
		
	    List<WebElement> allopt = s.getOptions();		
	    System.out.println(allopt.size());
	    
	    for(WebElement b:allopt)
	    {
	    	System.out.println(b.getText());
	    }
	    driver.close();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
