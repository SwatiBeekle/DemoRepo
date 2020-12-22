package com.TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fruits {
	//when parameters are specific
	@Test
	@Parameters("mango")
	public void mango(String m) {
		System.out.println("fruits are :");
		System.out.println(m);
	}
	@Test
	@Parameters("orange")
	public void orange(String o) {
		System.out.println(o);
	}

}
