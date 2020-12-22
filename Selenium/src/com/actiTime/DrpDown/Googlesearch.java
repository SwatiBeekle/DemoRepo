package com.actiTime.DrpDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlesearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("testing");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/Descendant::div[@class='sbct']"));
     System.out.println(list.size());
     for(int i=0;i<list.size();i++) {
    	String list1 = list.get(i).getText(); 
    	System.out.println(list1);
    	if(list1.equals("testing interview")) {
    		list.get(i).click();
    	}
     }
		Thread.sleep(2000);
	}

}
