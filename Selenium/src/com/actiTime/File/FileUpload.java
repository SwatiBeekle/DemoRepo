package com.actiTime.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		WebElement element = driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked on submenu");
		WebElement fileinput=driver.findElement(By.id("photofile"));
		fileinput.sendKeys("C:\\Users\\USER\\Desktop\\CV\\Sainath_DevOps_CV.docx");
		Thread.sleep(2000);
		System.out.println("uploaded file succesfully");
		driver.close();

	}

}
