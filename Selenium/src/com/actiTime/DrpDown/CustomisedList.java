package com.actiTime.DrpDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
      Thread.sleep(2000);
     // List<WebElement> alloptions = driver.findElements(By.xpath("//body/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]"));
      List<WebElement> alloptions = driver.findElements(By.xpath("//ui[@class='erkvQe']//li/Descendant::div[@class='sbtc']')]"));
    int count = alloptions.size();
    System.out.println("no of values present in dropdown is: "+count);
    String expvalue="selenium download";
    for(int i=0;i<count;i++) {
    	String elem = alloptions.get(i).getText();
    	System.out.println(elem);
    	if(elem.equalsIgnoreCase(expvalue)) 
    		alloptions.get(i).click();
    		
    	
			
   
    	driver.close();
    }
    
	}
	
}
