package Banking;

import org.testng.annotations.Test;

import PageObject.editCustomerPage;
import Utility.baseClass;

public class EditCustomerTestCase extends baseClass {
	@Test
	public void EditCustomer()
	{
		editCustomerPage e=new editCustomerPage(driver);
		e.editCustomer();
		e.giveCustID("14250");
		e.AccSubmit();
		e.cSubmit();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

}
