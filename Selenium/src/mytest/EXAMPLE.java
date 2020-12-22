package mytest;


import org.testng.Assert;
import org.testng.annotations.Test;



public class EXAMPLE {
	//@Test(retryAnalyzer=Analyzer.RetryAnalyser.class)
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void test2() {
		Assert.assertEquals(false,true);
	}


}
