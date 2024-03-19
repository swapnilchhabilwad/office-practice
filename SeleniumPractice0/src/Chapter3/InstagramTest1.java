package Chapter3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//creating an object for class Instagram
		Instagram in=new Instagram(driver);
		
		Thread.sleep(2000);
		in.usernametextbox("admin");
		
		Thread.sleep(2000);
		in.passwordtextbox("password");
		
		Thread.sleep(2000);
		in.loginbutton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
