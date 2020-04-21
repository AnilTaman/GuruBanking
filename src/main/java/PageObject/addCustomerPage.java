package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
	WebDriver ldriver;
	
	public addCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement addCustamer;
	
	@FindBy(name="name")
	WebElement CustName;
	
	@FindBy(name="rad1")
	WebElement gender;
	
	@FindBy(name="dob")
	WebElement dateOfBirth;
	
	@FindBy(name="addr")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pinno;
	
	@FindBy(name="telephoneno")
	WebElement telephoneno;
	
	@FindBy(name="emailid")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement submit;
	
	public void addCustomer()
	{
		addCustamer.click();
	}
	public void custName(String Name)
	{
		CustName.sendKeys(Name);
	}
	public void getGender()
	{
		gender.click();
	}
	public void dateOfBirth(String mm, String dd, String yyyy)
	{
		dateOfBirth.sendKeys(mm);
		dateOfBirth.sendKeys(dd);
		dateOfBirth.sendKeys(yyyy);
	}
	public void getAddress(String add)
	{
		Address.sendKeys(add);
	}
	public void getCity(String city)
	{
		City.sendKeys(city);
	}
	public void getstate(String st)
	{
		state.sendKeys(st);
	}
	public void getpinno(String pin)
	{
		pinno.sendKeys(pin);
	}
	public void gettelephoneno(String ctelephoneno)
	{
		telephoneno.sendKeys(ctelephoneno);
	}
	
	public void getemailid(String cemailid)
	{
		emailid.sendKeys(cemailid);
	}
	
	public void getpassword(String cpassword)
	{
		password.sendKeys(cpassword);
	}
	
	public void clicksubmit()
	{
		submit.click();
	}
}
