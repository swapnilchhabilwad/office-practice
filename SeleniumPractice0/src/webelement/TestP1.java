package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestP1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Dimension s = search.getSize();
		int H = s.getHeight();
		System.out.println("Height of the search box is = "+H);
		
		int W = s.getWidth();
		System.out.println("Width of the serch box is = "+W);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
