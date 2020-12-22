package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
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
	@Test(priority=1,groups="title")
	public void GoogleTitle() {
		String title = driver.getTitle();
		System.out.println("title of the page: "+title);
	}
	
	@Test(priority=2)
	public void Logo() {
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3)
	public void link() {
		boolean b = driver.findElement(By.linkText("Images")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	

}
