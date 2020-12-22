package com.TestNG.Dataprovider;


import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterwith_Methodlevel {
	
	
	WebDriver driver;
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider="searchmethod")
	public void MethodA(String author,String SearchKey) throws InterruptedException {
		 WebElement Searchtext = driver.findElement(By.name("q"));
		 Searchtext.sendKeys(SearchKey);
		 System.out.println("welcome---> "+author+" your searchtext is: "+SearchKey);
		 Thread.sleep(2000);
		 String text = Searchtext.getAttribute("value");
		 System.out.println(text+":::::::"+SearchKey);
		 Searchtext.clear();
	     Assert.assertTrue(text.equalsIgnoreCase(SearchKey));	
			}
		
	@Test(dataProvider="searchmethod")
	public void MethodB(String SearchKey) throws InterruptedException {
		WebElement Searchtext = driver.findElement(By.name("q"));
		 Searchtext.sendKeys(SearchKey);
		 System.out.println("welcome---> unknown user your searchtext is: "+SearchKey);
		 Thread.sleep(2000);
		 String text = Searchtext.getAttribute("value");
		 System.out.println(text+":::::::"+SearchKey);
		 Searchtext.clear();
	     Assert.assertTrue(text.equalsIgnoreCase(SearchKey));	
			}
		
		
	
	
	@DataProvider(name="searchmethod")
	public static Object[][] getdatafrommethod(Method m){
		if(m.getName().equalsIgnoreCase("MethodA")) {
		return new Object[][] {
			{"vinod","India"},
			{"ravi","USA"},
			{"Rock","UK"}
			
		};
	}else {
		return new Object[][] {
			{"India"},
			{"USA"},
			{"UK"}
			
		};
	}
		
}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
