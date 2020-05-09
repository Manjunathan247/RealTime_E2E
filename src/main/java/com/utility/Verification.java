package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Verification {
	private WebDriver driver;
	private static Logger log=LogManager.getLogger(Verification.class.getName());
	
	public Verification(WebDriver driver) {
		this.driver = driver;
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
}
