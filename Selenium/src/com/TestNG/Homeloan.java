package com.TestNG;

import org.testng.annotations.Test;

public class Homeloan {
	@Test(groups="Smoketesting")
	public void Personalloan() {
		System.out.println("homeloan");
	}
	@Test
	public void mobileloan() {
		System.out.println("mobileloan");
	}

	@Test
	public void APLloan() {
		System.out.println("apl loan");
	}


}
