package com.TestNG;

import org.testng.annotations.Test;

public class Carloan {
	@Test
	public void Personalloan() {
		System.out.println("homeloan");
	}
	@Test(groups="Smoketesting")
	public void mobileloan() {
		System.out.println("mobileloan");
	}

	@Test
	public void APLloan() {
		System.out.println("apl loan");
	}


}
