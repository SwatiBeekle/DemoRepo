package com.actiTime.DrpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownex1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement name = driver.findElement(By.name("country"));
		Select sel = new Select(name);
		//sel.selectByIndex(4);
		sel.selectByValue("ARUBA");
		Thread.sleep(2000);
		driver.close();
		
	}

}
