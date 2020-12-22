package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleton_driver {
	
	private static Singleton_driver instanceDriver=null;
	private WebDriver driver;
	
	//create private const
	
	private Singleton_driver() {
		
	}
	
	public WebDriver openbrowser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static Singleton_driver getInstance() {
		if(instanceDriver==null)
			instanceDriver =new Singleton_driver();
		return instanceDriver;
		
		
	}

}

