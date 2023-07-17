package org.group;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = "reg")
	private void tc1() {
		System.out.println("reg");
	}
	
	@Test(groups = "smoke")
	private void tc2() {
   System.out.println("smoke");
   
	}

	@Test(groups = "e2e")
	private void tc3() {
		System.out.println("e2e");
		
	}
	
	@Test(groups ="riyo")
	private void tc4() {
		System.out.println("riyo");
	}
}
