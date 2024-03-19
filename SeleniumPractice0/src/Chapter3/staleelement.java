package Chapter3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleelement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// instead of writing this =/ WebElement search = driver.findElement(By.name("q")); i'll create an object for class googlepage.
		googlepage g=new googlepage(driver);
		
		
		driver.navigate().refresh();
		g.searchtextbox("phone");
		// search.sendKeys("bat and ball");
		
		
		
		
		
		
		
		
		//C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win64 (1)\\chromedriver.exe
		
		//C:\\Users\\swapn\\Downloads\\Selenium supportive files\chromedriver.exe
		
		//C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
