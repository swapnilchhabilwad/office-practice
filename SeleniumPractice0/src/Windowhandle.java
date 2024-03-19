import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * 
		 * driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		 * 
		 * String parent = driver.getWindowHandle(); System.out.println(parent);
		 * 
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys(
		 * "swapnilchhabilwad@abcd.com");
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		//System.out.println(child);
		
		for(String b:child)
		{
			driver.switchTo().window(b);
			System.out.println(b);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("abceefghijklmnopqrstuvwxyz");
		
		/*
		 * Thread.sleep(2000); Alert a = driver.switchTo().alert();
		 * System.out.println(a.getText()); a.accept();
		 */
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ubuy.com.cn/en/search/?q=shoes");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Men's Charged Assert 10")).click();
		
		
		driver.close();
		/*
		 * driver.switchTo().defaultContent(); driver.close();
		 */
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
