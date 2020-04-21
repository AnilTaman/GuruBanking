package Utility;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportNG {

	static ExtentReports extent;
	public static ExtentReports extentReportGenertor()
	{
		// ExtentReports- class which is responsible to drive all the reporting execution
		//ExtentSparkReporter- helper class to create configuration
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Anil automation Result");
		reporter.config().setDocumentTitle("Anil Test Result");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Tester", "Anil Tamang");
		
		return extent;
		
	}
}
