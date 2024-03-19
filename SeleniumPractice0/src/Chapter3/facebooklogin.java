package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooklogin {
	
	// Declaration
	@FindBy (id="email")
	private WebElement usernametb;
	
	@FindBy (id="pass" )
	private WebElement passwordtb;
	
	@FindBy (xpath="(//a[@role='button'])[2]")
	private WebElement loginbtn;
	
	//initialization
	public facebooklogin(WebDriver driver)
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
