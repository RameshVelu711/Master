package org.exception;

public class RameshNotFoundException extends Exception{
	
	
	public String getMessage() {

		for (int i = 1; i < 2; i++) {
			System.out.println("Hello");
			System.out.println("Welcome");
			i++;
			System.out.println("Java");
			

		}
		return null;
	}
	
	@Override
	public void printStackTrace() {

	}
	
	
	
}
