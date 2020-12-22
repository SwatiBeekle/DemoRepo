package com.actiTime.windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> handler = driver.getWindowHandles();
		System.out.println("total windows are: "+handler.size());
		Iterator<String> itr = handler.iterator();
		while(itr.hasNext()) {
			String windows = itr.next();
			driver.switchTo().window(windows);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
		}
		
		
		
		
		driver.close();
	}

}
