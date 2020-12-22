package com.actiTime.mainMenu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Hoe page
		driver.findElement(By.xpath("//div[contains(text(),'USERS')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Add User')]")).click();
		 WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 boolean isselect = checkbox.isSelected();
		 if(isselect==false) {
			 checkbox.click();
		 }else {
			 System.out.println("Already selected");
		 }
		driver.close();
		
	
	}

}
