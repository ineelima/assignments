package com.aa.homepage;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	import com.aa.base.BasePage;

	public class HomePage extends BasePage{
		String loginLink="login";
		
		public HomePage(WebDriver driver) {
			super(driver);
			
		}

		public void openpage() {
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
		}
		
		public String loginClick() {
			driver.findElement(By.xpath("//*[@class='login']")).click();
			return driver.getCurrentUrl();
		}
}
	
	