package com.WebTable.Example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		String cname="Hubtown";
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupb");
		List<WebElement> companynames = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("number of coloumns are: "+companynames.size());
		List<WebElement> Currentprice = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));
		System.out.println("number of rows are: "+Currentprice.size());
		for(int i=0;i<companynames.size();i++) {
			if(cname.equalsIgnoreCase(companynames.get(i).getText())) {
				System.out.println(companynames.get(i).getText()+"..."+Currentprice.get(i).getText());
				break;
			}
		}
		
	}

	}


