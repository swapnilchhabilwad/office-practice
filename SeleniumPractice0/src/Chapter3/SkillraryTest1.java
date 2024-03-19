package Chapter3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillraryTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		//create an object for class Skillrary
		Skillrary sk=new Skillrary(driver);
		
		Thread.sleep(2000);
		sk.loginlink();
		Thread.sleep(2000);
		sk.usernametextbox("admin");
		Thread.sleep(2000);
		sk.passwordtextbox("password");
		Thread.sleep(2000);
		sk.loginbutton();
		Thread.sleep(6000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
