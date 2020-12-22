package com.actiTime.mainMenu;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/login.do");
		if(driver.getTitle().equalsIgnoreCase("actiTIME-Login")) {
			System.out.println("title matches");
		}else {
			System.out.println("title not matched and expected title is" +driver.getTitle());
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("login successful");
		Thread.sleep(2000);
		driver.close();
		
		

}
}