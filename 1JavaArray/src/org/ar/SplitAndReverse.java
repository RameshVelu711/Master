package org.ar;

public class SplitAndReverse {
	public static void main(String[] args) {

		String s = "Ramesh Riyo kumar";

	String[] split = s.split(" ");
		for (int i = split.length-1; i >= 0; i--) {
			System.out.print(" "+split[i]);
			
		}
//	String s1= "RameshRiyo";
//for (int i = 0; i < 6; i++) {
//	System.out.print(s1.charAt(i));
//	
//}
//for (int i = s1.length()-1; i >=6; i--) {
//	System.out.print(s1.charAt(i));
//	
//}
//System.out.println();
//String substring = s1.substring(0, 6);
//System.out.println(substring);
//String substring2= s1.substring(6, 10);
//System.out.println(substring2);
//for (int i = substring2.length()-1; i >=0; i--) {
//	System.out.print(s1.charAt(i));
//	
//}

	

	}
}
