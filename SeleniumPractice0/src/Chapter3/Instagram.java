package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {
	
	
	
	// Declaration
	@FindBy (name="username")
	private WebElement usernametb;
	
	@FindBy (name="password")
	private WebElement passwordtb;
	
	@FindBy (xpath="(//div[contains(@class,'x9f619 xjbqb8w x78zum5 x')])[5]")
	private WebElement loginbtn;
	
	//Initialization
	public Instagram(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void usernametextbox(String user)
	{
		usernametb.sendKeys(user);
	}
	public void passwordtextbox(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
