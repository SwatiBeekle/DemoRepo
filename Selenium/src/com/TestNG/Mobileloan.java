package com.TestNG;

import org.testng.annotations.Test;

public class Mobileloan {
	@Test
	public void Personalloan() {
		System.out.println("homeloan");
	}
	@Test
	public void mobileloan() {
		System.out.println("mobileloan");
	}

	@Test(groups="Smoketesting")
	public void APLloan() {
		System.out.println("apl loan");
	}


}
