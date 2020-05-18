package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.ActionsHelp;

public class LoginPage {
	public WebDriver driver;
	ActionsHelp ah;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement navigation;
	
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']/a")
	WebElement signIn;
	
	@FindBy(name="email")
	WebElement emailField;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String pass)
	{
		ah = new ActionsHelp(driver);
		ah.moveToElement(navigation);
		signIn.click();
		emailField.sendKeys(email);
		continueButton.click();
		passwordField.sendKeys(pass);
		loginButton.click();
	}

}
