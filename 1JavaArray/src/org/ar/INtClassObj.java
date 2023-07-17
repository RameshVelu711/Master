package org.ar;

public interface INtClassObj {

	void tc1();
	void tc2();
	void tc3();
	void tc4();
	void tc5();

public class M1  implements INtClassObj{

	@Override
	public void tc1() {System.out.println("tc1");}

	@Override
	public void tc2() {System.out.println("tc2");}

	@Override
	public void tc3() {
}

	@Override
	public void tc4() {
}

	@Override
	public void tc5() {
}
	public static void main(String[] args) {
		
		M1 name = new M1();
		
		name.tc1();
		name.tc2();
		name.tc3();
		
		
	}
	
	
	
	
	
	
}	
	
	
	
	
}
