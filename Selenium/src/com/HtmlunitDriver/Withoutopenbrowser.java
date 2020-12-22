package com.HtmlunitDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Withoutopenbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriver driver= new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");

		System.out.println("Before login: "+driver.getTitle());
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	System.out.println("After login:" +driver.getTitle());
		
		driver.close();
	}

}
