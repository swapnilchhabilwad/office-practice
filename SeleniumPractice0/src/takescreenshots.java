import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshots {

	public static void main(String[] args) throws IOException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.grammarly.com/ddocs/1959750640");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Typecasting.
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		// take screenshot and store it in ram
		
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		// now give it a path of folder
		
		File dest=new File("./Photo/again.png");
		
		// now move product from ram to specific folder
		
		FileUtils.copyFile(ram, dest);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
