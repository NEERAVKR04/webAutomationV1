package com.webautomationv1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public String baseUrl = "http://demo.guru99.com/v4/";
	public String userName ="mngr164225";
	public String pass = "jahetAp";
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
