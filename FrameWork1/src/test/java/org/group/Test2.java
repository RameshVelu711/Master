package org.group;

import org.testng.annotations.Test;

public class Test2 {
	

	@Test(groups = "Ram")
	private void tc1() {
		System.out.println("Ram");
	}
	
	@Test(groups = "smoke")
	private void tc2() {
   System.out.println("smoke");
   
	}

	@Test(groups = "smoke")
	private void tc3() {
		System.out.println("smoke");
		
	}
	
	@Test(groups ="reg")
	private void tc4() {
		System.out.println("reg");
	}
	

}
