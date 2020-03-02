package com.aa.loginPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aa.base.BaseTest;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass() {
		
		lp=new LoginPage(driver);
	}
	
	@Test
	public void testLogin() {
		assertTrue(lp.performLogin("training.qaprep@gmail.com","Training123"));
	}
	
}
