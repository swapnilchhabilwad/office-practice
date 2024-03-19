package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	
	//Declaration
	@FindBy ( name="username")
	private WebElement usernametb;
	
	@FindBy (name="pwd")
	private WebElement passwordtb;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginbtn;
	
	
	//initialization
	public Actitime(WebDriver driver) 
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
