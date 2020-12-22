package com.actiTime.mainMenu;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 List<WebElement> anchortag = driver.findElements(By.tagName("a"));
		 
		 Iterator<WebElement> itr = anchortag.iterator();
		 while(itr.hasNext()) {
			 WebElement element = itr.next();
			 System.out.println("number of anchor tag"+element.getAttribute("id")+" "+element.getText());
			
		 }
		 driver.close();
	}

}
