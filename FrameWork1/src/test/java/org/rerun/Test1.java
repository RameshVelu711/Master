package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test(retryAnalyzer= Failed.class)
	private void tc1() {

		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer= Failed.class)
	private void tc2() {

		Assert.assertTrue(false);
	}

}
