package Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class readConfig {
	static FileInputStream fis;
	static Properties pro;
	public readConfig()
	{
		File src=new File("./Configuration/config.properties");
		try {
			fis=new FileInputStream(src);
		    pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
		
			System.out.println("Exception is :"+e.getMessage());
			System.out.println("Exception is :"+e.getCause());
		} 
	}

	public String getURL()
	{	
		String URL=pro.getProperty("baseURL");
		return URL;		
	}
	
	public String getUsername()
	{
		String getUser=pro.getProperty("username");
		return getUser;
	}
	public String getpassword()
	{
		String getpass=pro.getProperty("password");
		return getpass;
	}
	public String getChrome()
	{
		String getpath=pro.getProperty("chrompath");
		return getpath;	
	}
	public String getIEPath()
	{
		String getIE=pro.getProperty("IEpath");
		return getIE;
	}
}
