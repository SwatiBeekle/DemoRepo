package com.Dynamicxpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonEx {

	
	public static void main(String[] args) throws InterruptedException {
		String expname="RoundTrip";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		 List<WebElement> radio1 = driver.findElements(By.xpath("//input[@type='radio']"));
		int button = radio1.size();
		System.out.println("numb of radio buttons are: "+button);
	    WebElement radio = driver.findElement(By.id("RoundTrip"));
		radio.click();
		Thread.sleep(2000);
		System.out.println("check if selected: "+radio.isSelected());
		driver.close();
		
	}

}
