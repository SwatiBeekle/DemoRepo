package com.TestNG;

import org.testng.annotations.Test;

public class RegularExpresion {
	@Test(groups= {"Include test case1"})
	public void test_case1() {
		System.out.println("this is  test_case1");
	}
	@Test(groups= {"Include test case2"})
	public void test_case2() {
		System.out.println("this is  test_case2");
	}
	@Test(groups= {"Exclude test case3"})
	public void test_case3() {
		System.out.println("this is  test_case3");
	}

}
