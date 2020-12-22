package com.TestNG;

import org.testng.annotations.Test;

//depends on method
public class GoogleLogin {
	@Test
	public void login() {
		//int i= 10/0;//skippped the depends method
		System.out.println("login");
		
	}

	@Test(dependsOnMethods="login")
	public void add() {
		System.out.println("add employee");
	}
	
	@Test(dependsOnMethods="login")
	public void delete() {
		System.out.println("delete the employee");
	}
}
