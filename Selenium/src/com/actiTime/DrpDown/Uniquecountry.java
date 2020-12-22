package com.actiTime.DrpDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uniquecountry {

	public static void main(String[] args) {
		String expCName="India";
		String msg="Not Found";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	WebElement name = driver.findElement(By.xpath("//select[@name='country']"));
		Select select= new Select(name);
		
		List<WebElement> alloptions = select.getOptions();
		int val =alloptions.size();
		System.out.println("total country are: "+val);
		for(int i=0;i<val;i++) {
			String actualname = alloptions.get(i).getText();
	
		if(actualname.equalsIgnoreCase(expCName)) {
			msg="Found";
			}
		}
		System.out.println("specified country name is" +expCName+ "is present in the listbox: "+msg);
	}
}