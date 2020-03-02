package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//Rest All the classes should access Page Driver
//Page Driver internally uses Webdriver.
public class PageDriver {
	WebDriver driver;

	public PageDriver(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void get(String url) {
	
	driver.get(url);
 }
	
//	public WebElement FindElement(String loc) {
//		return driver.findElement(locators.get(loc));
//		
//	}



}