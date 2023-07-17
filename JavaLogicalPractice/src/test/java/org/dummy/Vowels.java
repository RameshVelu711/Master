package org.dummy;

public class Vowels {
	public static void main(String[] args) {
		
		String s = "aeioup",v1="",nV="";
		
		int vCount = 0,nCount=0;
		
		for(int i =0;i<s.length();i++) {
			
			char c = s.charAt(i);
			
			if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
				
				v1=v1+c;
				vCount++;
				
			} else {   nV=nV+c; 
			
			nCount++;

			}
			

			}
		
		System.out.println("count : "+ vCount);
		System.out.println(nCount);
		System.out.println(v1);
		System.out.println(nV);
		
		
		
		
		
		
		
		
		
	}

}
