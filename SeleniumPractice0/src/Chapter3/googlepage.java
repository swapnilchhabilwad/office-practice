package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlepage {
	
	
	// Declaration
	@FindBy(name="q")
	private WebElement searchtb;
	
	// Initialization
	public googlepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void searchtextbox(String name) {
		searchtb.sendKeys(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
