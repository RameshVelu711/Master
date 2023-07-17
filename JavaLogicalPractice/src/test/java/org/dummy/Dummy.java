package org.dummy;

public class Dummy {
public static void main(String[] args) {
	
	String s = "RAMEshefuiv",v="",count="";
	
	int v1 =0, count1=0;
	
	for (int i = 0; i < s.length(); i++) {
		
		char c = s.charAt(i);
		if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
			v=v+c;
			v1++;
		}else {
			count=count+c;
			count1++;
		}
		
	}
	System.out.println(v);
	System.out.println(count);
	System.out.println(v1);
	System.out.println(count1);
	
	
	
	
	
	
}
}
