package com.actiTime.mainMenu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement element = driver.findElement(By.linkText("TIME-TRACK"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("View My Time-Track")).click();
		Thread.sleep(2000);
		System.out.println("Clicked on Submenu");
		action.moveToElement(element).build().perform();
		WebElement name = driver.findElement(By.linkText("Current month"));
		Select st= new Select(name);
		st.selectByValue("Current week");
		driver.close();
		
		
		
		
	}

}
