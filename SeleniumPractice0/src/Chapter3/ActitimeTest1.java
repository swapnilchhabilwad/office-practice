package Chapter3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//All the methods are non static so create an object.
		Actitime a=new Actitime(driver);
		
		//now access the methods of class Actitime.
		Thread.sleep(2000);
		a.usernametextbox("admin");
		Thread.sleep(2000);
		a.passwordtextbox("manager");
		Thread.sleep(2000);
		a.loginbutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
