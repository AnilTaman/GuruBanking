package Banking;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.addCustomerPage;
import Utility.baseClass;

public class addCustomerTestCase extends baseClass{
	public static Logger log =LogManager.getLogger(addCustomerTestCase.class.getName());
	@Test
	public void addCustomer() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addCustomerPage cp=new addCustomerPage(driver);
		cp.addCustomer();
		log.info("Going to add customer page");
		String Name=randomstring1();
		cp.custName(Name);
		cp.dateOfBirth("04", "24", "1994");
		cp.getAddress("Global Village");
		cp.getCity("Bangalore");
		cp.getstate("Karnataka");
		cp.getpinno("123456");
		cp.gettelephoneno("9876543210");
		String email=randomstring()+"@gmail.com";
		cp.getemailid(email);
		cp.getpassword("asjjjpp");
		log.debug("All the details are filled");
		cp.clicksubmit();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Guru99 Bank Customer Registration Page"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}	
	}
	public String randomstring()
	{		
		String randomString=RandomStringUtils.randomAlphabetic(8);
		return randomString;
	}
	public String randomstring1()
	{		
		String randomString1=RandomStringUtils.randomAlphabetic(8);
		return randomString1;
	}
}
