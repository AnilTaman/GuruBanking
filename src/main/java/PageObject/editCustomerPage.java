package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editCustomerPage {
	WebDriver driver;
	public editCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(linkText="Edit Customer")
	WebElement EditCustomer;
	
	@FindBy(name="cusid")
	WebElement custId;
	
	@FindBy(name="AccSubmit")
	WebElement AccSubmit;
	
	@FindBy(name="sub")
	WebElement ConfirmSubmit;
	
	public void editCustomer()
	{
		EditCustomer.click();
	}
	public void giveCustID(String id)
	{
		custId.sendKeys(id);
	}
	public void AccSubmit()
	{
		AccSubmit.click();
	}
	public void cSubmit()
	{
		ConfirmSubmit.click();
	}
}
