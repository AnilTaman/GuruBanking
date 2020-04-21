package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	 WebDriver ldriver;
	public loginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name="uid")
	WebElement username1;
	
	@FindBy(name="password")
	WebElement password1;
	
	@FindBy(name="btnLogin")
	WebElement Login; 
	
	public void getUsername1(String usnam)
	{
		username1.sendKeys(usnam);
	}
	
	public void getPassword1(String pas)
	{
		password1.sendKeys(pas);
	}
	
	public void getLogin()
	{
		Login.click();
	}
}
