package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingletonPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		Singleton_driver instancedriver = Singleton_driver.getInstance();
		driver=instancedriver.openbrowser();
     }

	@Test
	public void gettest() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
