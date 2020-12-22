package com.actiTime.windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String parentwnd = driver.getWindowHandle();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]")).click();
		Set<String> window = driver.getWindowHandles();	
		int count = window.size();
		System.out.println("total window are :"+count);
		
		for(String wh:window) {
			WebDriver allwind = driver.switchTo().window(wh);
			System.out.println(allwind.getTitle());
			
		}
		String child=driver.getTitle();
		System.out.println(child);
		driver.switchTo().window(parentwnd);
		
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login ')]")).click();
		driver.close();
	}

}
