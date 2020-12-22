package com.TestNG;

import java.text.NumberFormat;

import org.testng.annotations.Test;

public class TestngFeatures {


	@Test(invocationCount=10)
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);//if we want to print this as 10 times
	}
	@Test(invocationTimeOut=2,enabled=false )//we not execute this
	public void infiniteloop() {
		int i=10;
		while(i==10) {
			//System.out.println(i);//it will stop after 2ms
		}
	}
		//using ex[ected exception we can handle exception in testng
	@Test(expectedExceptions=NumberFormat.class)
	public void exce() {
		String x="10A";
		Integer.parseInt(x);
	}
		
		
		}
	


