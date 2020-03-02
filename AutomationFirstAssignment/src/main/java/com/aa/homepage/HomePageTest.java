package com.aa.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.base.BaseTest;
import com.aa.loginPage.LoginPage;

public class HomePageTest extends BaseTest {
	public HomePage hp;

	@BeforeClass
	public void beforeClass() {
		hp = new HomePage(driver);
	}

	@Test(priority=1)
	public void testLoginClick() {
		hp.openpage();
		hp.loginClick();
		assertEquals(hp.loginClick(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
}
