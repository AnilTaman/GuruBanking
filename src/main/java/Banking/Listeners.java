package Banking;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utility.baseClass;
import Utility.extentReportNG;

public class Listeners extends baseClass implements ITestListener {
	
	ExtentReports extent=extentReportNG.extentReportGenertor(); //no need to create object if u make method as static
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Successful");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getThrowable());
		/*try {
			getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			test.addScreenCaptureFromPath(getScreenShot(result.getMethod().getMethodName()), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
