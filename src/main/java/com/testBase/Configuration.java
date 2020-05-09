package com.testBase;

import java.util.Properties;

public class Configuration extends Base {
	private Properties prop;

	public Configuration(Properties prop) {
		this.prop = prop;
	}

	public String browserName() {
		return prop.getProperty("browser");
	}

	public String url() {
		return prop.getProperty("url");
	}

	public String username() {
		return prop.getProperty("username");
	}

	public String password() {
		return prop.getProperty("password");
	}

	public long ImplicitWait() {
		String time = prop.getProperty("ImplicitWait");
		return Long.parseLong(time);
	}

	public String WebDriverWait() {
		return prop.getProperty("WebDriverWait");
	}

}
