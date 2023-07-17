package org.group;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups = "riyo")
	private void tc1() {
		System.out.println("riyo");
	}
	
	@Test(groups = "smoke")
	private void tc2() {
   System.out.println("smoke");
   
	}

	@Test(groups = "Ram")
	private void tc3() {
		System.out.println("Ram");
		
	}
	
	@Test(groups ="reg")
	private void tc4() {
		System.out.println("reg");
	}
	

}
