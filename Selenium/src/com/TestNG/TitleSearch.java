package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleSearch {
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void GoogleTitle() {
		String title = driver.getTitle();
		System.out.println("title of the page: "+title);
		Assert.assertEquals(title, "Google");
		
		
	}

	@Test
	public void Logo() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
