package com.TestNG.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginParameterEx {
	WebDriver driver;
	@Test
	@Parameters({"url","username"})
	public void Login(String url,String username) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("admin");
		
	}

}
