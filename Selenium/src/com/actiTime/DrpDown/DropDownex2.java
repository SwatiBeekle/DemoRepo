package com.actiTime.DrpDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownex2 {

	public static void main(String[] args) {
		String name="Orange";
		int count=0;
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		WebElement elem = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select select = new Select(elem);
		List<WebElement> alloptions = select.getOptions();
		int cf = alloptions.size();
		System.out.println("number of fruits are"+cf);
		for(int i=0;i<cf;i++){
			String fname = alloptions.get(i).getText();
			if(fname.equals(name)) {
			count=count+1;
		}else if(count>1) {
			System.out.println("Specified name is dublicate");
		}
		
		}
		System.out.println("not dublicate");
		driver.close();
			
		}
		

	}


