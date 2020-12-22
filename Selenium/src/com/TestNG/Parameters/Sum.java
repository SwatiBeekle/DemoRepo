package com.TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//when parameters are applied below the tag which are applicable to all the class
public class Sum {
	@Test
	@Parameters({"a","b"})
	public void sum(int a,int b) {
		int c=a+b;
		System.out.println("sum of number is :"+c);
	}
	

}
