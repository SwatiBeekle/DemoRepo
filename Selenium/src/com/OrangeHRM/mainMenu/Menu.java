package com.OrangeHRM.mainMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Menu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/symfony/web/index.php/auth/login");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		List<WebElement> allmenu = driver.findElements(By.xpath("//b"));
		int nmenu = allmenu.size();
		System.out.println("Total number of submenu are: "+nmenu);
		for(int i=0;i<nmenu;i++) {
			String elem = allmenu.get(i).getText();
			System.out.println(elem);
		}
		driver.close();
	}

}
