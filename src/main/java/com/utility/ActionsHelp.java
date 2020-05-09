package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelp {
	private WebDriver driver;
	Actions actions;
	public static Logger log = LogManager.getLogger(ActionsHelp.class.getName());
	public ActionsHelp(WebDriver driver) {
		this.driver = driver;
	}
	
	public void moveToElement(WebElement element)
	{
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();;
	}
}
