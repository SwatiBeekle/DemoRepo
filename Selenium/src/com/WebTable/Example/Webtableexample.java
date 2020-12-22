package com.WebTable.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		String beforexpath="//*[@id='customers']/tbody/tr[";
		String afterxpath="]/td[1]";
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		String beforexpath2="//*[@id='customers']/tbody/tr[";
		String afterxpath2="]/td[2]";
		
		List<WebElement> element = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int count = element.size()-1;
		System.out.println(count);
		
		for(int i=2;i<=count;i++) {
			String actualxpath=beforexpath+i+afterxpath;
			String comapany=driver.findElement(By.xpath(actualxpath)).getText();
			System.out.println(comapany);
			
			
			String actualxpath2=beforexpath2+i+afterxpath2;
			String contact=driver.findElement(By.xpath(actualxpath2)).getText();
			System.out.println(contact);
			
			
		}
		
	}

}
