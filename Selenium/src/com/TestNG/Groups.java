package com.TestNG;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"index","search"})
	public void method1() {
		System.out.println("mt1");
	}	
		@Test(groups="search")
		public void method2() {
			System.out.println("mt2");
		}
		

		@Test(groups="delete")
		public void method3() {
			System.out.println("mt3");
		}
		@Test(groups="search")
		public void method4() {
			System.out.println("mt4");
		}
		
		
	}


