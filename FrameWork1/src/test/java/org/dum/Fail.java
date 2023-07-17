package org.dum;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fail {

	@Test(retryAnalyzer = Failed.class)
	private void tc1() {
		Assert.assertTrue(true);

	}

	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
		Assert.assertTrue(true);

	}

	@Test(retryAnalyzer = Failed.class)
	private void tc3() {
		Assert.assertTrue(false);

	}

	@Test(retryAnalyzer = Failed.class)
	private void tc4() {
		Assert.assertTrue(false);
	}

}
