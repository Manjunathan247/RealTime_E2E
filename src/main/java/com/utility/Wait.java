package com.utility;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testBase.Configuration;

public class Wait {
	private WebDriver driver;
	Configuration config;
	WebDriverWait wait;
	private static Logger log = LogManager.getLogger(Wait.class.getName());
	
	public Wait(WebDriver driver) {
		this.driver = driver;
	}
	
	public void implicitWait(long time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void elementToBeClickable(WebDriver driver,long time,WebElement locator)
	{
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void visibilityOf(WebDriver driver,long time,WebElement locator)
	{
		wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(locator));
	}
}
