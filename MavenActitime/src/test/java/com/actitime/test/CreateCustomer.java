package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testCreateCustomer() {
		Reporter.log("create customer");
		
	}

}
