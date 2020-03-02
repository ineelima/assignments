package com.aa.homepage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aa.Shopping.Shopping;
import com.aa.base.BaseTest;
import com.aa.loginPage.LoginPage;

public class OneTestForAll extends BaseTest {
	public HomePage hp;
	public LoginPage lp;
	public Shopping sh;

	@BeforeClass
	public void beforeClass() {
		hp = new HomePage(driver);
		lp=new LoginPage(driver);
		sh=new Shopping(driver);
	}

	@Test(priority=1)
	public void testLoginClick() {
		hp.openpage();
		hp.loginClick();
		assertEquals(hp.loginClick(), "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@Test(priority=2)
	public void testLogin() {
		assertTrue(lp.performLogin("training.qaprep@gmail.com","Testing123"));
	}
	
	@Test(priority=3)
	public void testAddToCart() {
	
		sh.shopTShirt();
	}
	
}
