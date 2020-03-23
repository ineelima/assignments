package com.walmartamazonassignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/neelima/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.walmart.com");
		
		WebElement we1 = driver.findElement(By.xpath("//input[@id='global-search-input']"));
		we1.sendKeys("ipad");
		we1.sendKeys(Keys.RETURN);
		
		String outArray[] = new String[5];
		Map<String, String> walMap = new HashMap<String, String>();
		for (int i = 0; i < 5; i++) {
			int n = i + 1;
			//Name of the product
			WebElement prodDesc = driver
					.findElement(By.xpath("//ul[@class='search-result-gridview-items four-items']/li[" + n
							+ "]/div/div[2]/div[5]/div/a/span"));
			//Price of the Product
			WebElement prodPrice = driver
					.findElement(By.xpath("//ul[@class='search-result-gridview-items four-items']/li[" + n
							+ "]/div/div[2]/div[7]/div/span/span/span[2]/span/span[1]"));

			// System.out.println(prodDesc.getText() );
			//Removing ...from the list showing in chrome
			String prodDesc1 = prodDesc.getText();
			if (prodDesc1.contains("...")) {
				prodDesc1 = prodDesc1.substring(0, prodDesc1.length() - 4);
			}
			walMap.put(prodDesc1, prodPrice.getText());
		}
		//Opening the Amazon website 
		driver.get("http:www.amazon.com");
		
		//Iterating the list in Amazon and searching th elements from walmart
		for (Map.Entry<String, String> m : walMap.entrySet()) {
			WebElement amznSearch = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
			//searching the same element and pressing enter then clearing the text box for another element
			amznSearch.clear();
			amznSearch.sendKeys(m.getKey());
			amznSearch.sendKeys(Keys.RETURN);
			WebElement amznPrice;
			try {
				//Finding the element sold by amazon
				amznPrice = driver.findElement(By.xpath(
						"//*[@id='search']/div[1]/div[2]/div/span[5]/span[1]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]"));
				System.out.println("Product sold by amazon");
			} catch (Exception e) {
				//If the element is not sold by Amazon and third party vendor
				System.out.println("Product not sold by amazon");
				amznPrice = driver.findElement(By.xpath(
						"//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div/div/span[2]"));
			}
			//Comparing the value from Walmart and Amazon
			System.out.println(m.getKey() + ": Walmart: " + m.getValue() + ", Amazon: " + amznPrice.getText());
		}

		driver.close();
		driver.quit();
	}
}
