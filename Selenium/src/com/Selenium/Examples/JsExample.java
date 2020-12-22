package com.Selenium.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		System.out.println(gettitle(driver));
		//System.out.println(getinnertext(driver));
		scroll(driver);
		WebElement elname = driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
		scrollInview(elname,driver);
	}
	public static String gettitle(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String name=js.executeScript("return document.title;").toString();
		return name;
		
		
	}
//	public static String getinnertext(WebDriver driver) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String text=js.executeScript("return document.documnetElement.innertext;").toString();
//		return text;
//	}
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
				
		
	}
	public static void scrollInview(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0],scrollIntoView()true:", element);
		
	}
	}
