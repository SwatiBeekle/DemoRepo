package com.TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Subtract {
	
		@Test
		@Parameters({"a","b"})
		public void Sub(int a,int b) {
			int c=a-b;
			System.out.println("Sub of number is :"+c);
		}
		
	}



