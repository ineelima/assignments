package com.aa.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aa.homepage.HomePage;


	public class LoginPage extends HomePage {
		String userName="";
		String password="";
		String submit="";
		String logout="";
		
		public LoginPage(WebDriver driver) {
			super(driver);
			
		}
		
		public boolean performLogin(String userName,String password) {
		
			WebElement email=driver.findElement(By.id("email"));
			email.sendKeys(userName);
			
			WebElement passwd=driver.findElement(By.id("passwd"));
			passwd.sendKeys(password);
			
			driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
			
			return driver.findElement(By.xpath("//*[@class='logout']")).isDisplayed();
		}
	}

