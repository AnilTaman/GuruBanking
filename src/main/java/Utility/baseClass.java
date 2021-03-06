package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class baseClass {
	
	readConfig config=new readConfig();	
	public String baseURL=config.getURL();
	public String user=config.getUsername();
	public String ps=config.getpassword();
	public static WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(baseClass.class.getName());
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", config.getChrome());
		
		/*ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		driver=new ChromeDriver(option);*/
		
		DesiredCapabilities ch =new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("headless");
		option.merge(ch);
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.quit();
	}*/
	/*public String getScreenShot(String result) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Path=System.getProperty("user.dir")+"\\ScreensShot\\"+result+".png";
		File destPath=new File(Path);
		FileUtils.copyFile(src,destPath);
		return Path;
	}*/
	public String getScreenShot(String testCaseName) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Path=System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png";
		File destPath=new File(Path);
		FileUtils.copyFile(src,destPath);
		return Path;
	}
}
