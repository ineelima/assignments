package com.aa.Shopping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aa.base.BasePage;

	public class Shopping extends BasePage{

		public Shopping(WebDriver driver) {
			super(driver);
		
		}
		
		public void shopTShirt(){
			
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
			action.moveToElement(we).build().perform();
			
			driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[3]/a")).click();
			driver.findElement(By.xpath("//div[@id='uniform-layered_id_attribute_group_3']/span/input")).isSelected();
			
			WebElement we1=driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
			action.moveToElement(we1).build().perform();
			
			driver.findElement(By.xpath("//div[@class='button-container']/a[2]")).click();
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
			Select drpSize= new Select(driver.findElement(By.xpath("//*[@id='group_1']")));
			drpSize.selectByVisibleText("L");
		
			WebElement color=driver.findElement(By.xpath("//*[@id='color_14']"));
			action.click(color).build().perform();
			
			
		    driver.findElement(By.name("Submit")).click();
	    
	    	
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	
	    	driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
	    	
	    	driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		 
	    	driver.findElement(By.xpath("//button[@name='processAddress']")).click();

	    	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	driver.findElement(By.xpath("//div[@id='uniform-cgv']")).click();
	   
	        driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
	        
	        driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	        try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	        
	       
	        String actualString  = driver.findElement(By.xpath("//p[@class='cheque-indent']/strong")).getText();
	        //String expectedString = "Your order on My Store is complete.";
	        Assert.assertTrue(actualString.contains("Your order on My Store is complete."));
	        
			driver.quit();
		}
	}	
		

