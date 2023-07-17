package org.exception;

public class UserDefinedException {
	
	
	public void search() throws RameshNotFoundException {

		System.out.println("Throwing exception");
		
		throw new RameshNotFoundException();
	}
	
	public static void main(String[] args) throws RameshNotFoundException  {
		

		
		UserDefinedException definedException = new UserDefinedException();
		definedException.search();
		
	}

}
