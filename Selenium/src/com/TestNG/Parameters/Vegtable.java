package com.TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegtable {
	@Test
	@Parameters("gd")
	public void g1(String g) {
		System.out.println("veg are :");
		System.out.println(g);
	}
	@Test
	@Parameters("tomato")
	public void t1(String t) {
		System.out.println(t);
	}


}
