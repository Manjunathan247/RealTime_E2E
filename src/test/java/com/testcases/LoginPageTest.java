package com.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.objectRepo.LoginPage;
import com.testBase.Base;
import com.testBase.Configuration;
import com.utility.Verification;

public class LoginPageTest extends Base {
	Configuration config;
	Verification verify;
	private static Logger log = LogManager.getLogger(LoginPageTest.class.getName());

	@Test
	public void login() throws Throwable {
		LoginPage loginPage = new LoginPage(driver);
		config = new Configuration(prop);
		verify = new Verification(driver);
		driver.get(config.url());
		loginPage.login(config.username(), config.password());
		Assert.assertEquals(verify.verifyTitle(),
				"nline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		log.info("Login - Success");
	}

}
