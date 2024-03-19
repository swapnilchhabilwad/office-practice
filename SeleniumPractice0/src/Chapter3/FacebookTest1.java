package Chapter3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// create an object for a class facebooklogin
		facebooklogin fb=new facebooklogin(driver);
		
		//access methods of class facebooklogin
		Thread.sleep(2000);
		fb.usernametextbox("swapnil");
		Thread.sleep(2000);
		fb.passwordtextbox("password");		
		Thread.sleep(2000);
		fb.loginbutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
