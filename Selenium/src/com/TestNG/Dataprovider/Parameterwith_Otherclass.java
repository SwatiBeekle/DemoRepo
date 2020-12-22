package com.TestNG.Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parameterwith_Otherclass {
	WebDriver driver;
	@BeforeTest
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider="SearchData",dataProviderClass=DataProviderOther_Cls.class)
	public void getData(String author,String SearchKey) throws InterruptedException {
		 WebElement Searchtext = driver.findElement(By.name("q"));
		 Searchtext.sendKeys(SearchKey);
		 System.out.println("welcome---> "+author+" your searchtext is: "+SearchKey);
		 Thread.sleep(2000);
		 String text = Searchtext.getAttribute("value");
		 System.out.println(text+":::::::"+SearchKey);
		 Searchtext.clear();
	     Assert.assertTrue(text.equalsIgnoreCase(SearchKey));	
			}
	@AfterTest
    public void tearDown() {
    driver.close();
}
	

}
