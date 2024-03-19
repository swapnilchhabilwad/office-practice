package webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestP6 {

	public static void main(String[] args) throws InterruptedException {
           
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drp = driver.findElement(By.id("gh-cat"));
		Select s=new Select(drp);
		Thread.sleep(2000);
		s.selectByIndex(23);
		Thread.sleep(2000);
		s.selectByValue("11700");
		Thread.sleep(2000);
		s.selectByVisibleText("Sporting Goods");
		Thread.sleep(2000);

		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		
		for(WebElement b:allopt)
		{
			System.out.println(b.getText());
		}
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("Fail: element is not multiple selectable");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
