package com.aa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.util.Configuration;

public abstract class BaseTest {
	
	public static WebDriver driver;	

	@BeforeSuite
	public void beforeSuite() {
		 if(Configuration.BROWSER.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/neelima/Desktop/chromedriver");
			driver = new ChromeDriver();
		 }
	}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}
