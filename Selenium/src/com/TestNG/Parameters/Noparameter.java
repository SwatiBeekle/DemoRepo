package com.TestNG.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Noparameter {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void searchkey() throws InterruptedException {
		String author="varun";
		String searchkey="India";
		WebElement searchtext = driver.findElement(By.name("q"));
		searchtext.sendKeys(searchkey);
		System.out.println("welcome--->"+author+ "your searchtext is: "+searchkey);
		Thread.sleep(2000);
		System.out.println("value in google search box :"+searchtext.getAttribute(searchkey));
		//verify
		Assert.assertTrue(searchtext.getAttribute("value").equalsIgnoreCase(searchkey));
	}
	
@AfterMethod
public void teardown() {
	driver.close();
	
}


}
