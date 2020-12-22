package com.TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multiplication {
	
		@Test
		@Parameters({"a","b"})
		public void mul(int a,int b) {
			int c=a*b;
			System.out.println("mul of number is :"+c);
		}
		


}
