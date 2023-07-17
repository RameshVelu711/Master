package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test(retryAnalyzer= Failed.class)
	private void tc1() {

		Assert.assertTrue(true); 
	}
	@Test(enabled=false)
	private void tc2() {

		Assert.assertTrue(false);
	}
	@Test(invocationCount=11)
	private void tc3() {

		System.out.println("hello");
		Assert.assertTrue(true);
	}

}
