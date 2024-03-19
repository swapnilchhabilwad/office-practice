package Chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary {
	
	
	//Declatation
	@FindBy (xpath="//a[text()='LOGIN']")
	private WebElement login;
	
	@FindBy (id="email")
	private WebElement usernametb;
	
	@FindBy (id="password")
	private WebElement passwordtb;
	
	@FindBy (name="login")
	private WebElement loginbtn;
	
	//Initialization
	public Skillrary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void loginlink()
	{
		login.click();
	}
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
