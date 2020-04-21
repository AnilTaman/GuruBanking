package Banking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import PageObject.loginPage;
import Utility.baseClass;
import junit.framework.Assert;


public class loginTestCase extends baseClass {
	public static Logger log =LogManager.getLogger(loginTestCase.class.getName());
	@Test
	public void LoginHomePage()
	{
		driver.get(baseURL);
		log.info("Site is Open");
		loginPage lp=new loginPage (driver);
		lp.getUsername1(user);
		log.debug("Username is given");
		lp.getPassword1(ps);
		log.debug("Password is given");
		lp.getLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
}
