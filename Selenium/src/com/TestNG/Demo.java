package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeSuite
	public void m1() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void m2() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void m3() {
		System.out.println("@beforeclass");
	}
	@BeforeMethod
	public void m4() {
		System.out.println("@BeforeMethod");
	}
	@Test
	public void test1() {
		System.out.println("@test1");
	}
	@Test
	public void test2() {
		System.out.println("@test2");
	}
	
	
	
	
	@AfterMethod
	public void n1() {
		System.out.println("@aftermethod");
	}
	@AfterClass
	public void n2() {
		System.out.println("@afterclass");
	}
	
	
	@AfterTest
	public void n3() {
		System.out.println("@afterTest");
	}
	
//	@AfterSuite
//	public void n4() {
//		System.out.println("@aftersuite");
//	}
//	
	
}
