package com.testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public void initilizeDriver() throws Throwable {
		loadConfigurationFile();
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(getImplicitWait(),TimeUnit.SECONDS);
	}
	
	public void loadConfigurationFile() throws Throwable
	{
		prop = new Properties();
		String path = System.getProperty("user.dir") + "./Configuration/GlobalData.properties";
		FileInputStream fis = new FileInputStream(path);	
		prop.load(fis);
	}

	public long getImplicitWait()
	{
		String implicitWait = prop.getProperty("ImplicitWait");
		if(implicitWait != null)
		{
			return Long.parseLong(implicitWait);
		}
		else
		{
			throw new RuntimeException("ImplicitWait not specified in Configurstion file");
		}
	}

}
