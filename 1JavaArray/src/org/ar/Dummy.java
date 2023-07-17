package org.ar;

public class Dummy {
	public static void main(String[] args) {
		int array[]= {1,1,1,2,3,1};
		int one=0;
		int two=0;
		int three=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==1) {
				one++;
				
			}else if(array[i]==2) {
				two++;
				
			}
			else if(array[i]==3){
				three++;
				
			}else {
				System.out.println("invalid");
			}
			
		
		}
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}
	

}


