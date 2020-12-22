package com.actiTime.DrpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownEX3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("selenium");
		  Thread.sleep(2000);
		 driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("First down arrow pressed");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		System.out.println("second down arrow pressed");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("clicked on enter button");
		driver.close();
		
		
	}

}
