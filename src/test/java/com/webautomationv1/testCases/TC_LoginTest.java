package com.webautomationv1.testCases;

import org.testng.annotations.Test;

import com.webautomationv1.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {

	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(pass);
		lp.clickLogin();
	}
}
