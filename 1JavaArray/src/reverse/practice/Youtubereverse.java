package reverse.practice;

public class Youtubereverse {

	public static void main(String[] args) {
		
		String string = "Ramesh";
		String string2 = "Ramesh";
		
		for (int i = string.length()-1; i >=0; i--) {
			
			System.out.print(string.charAt(i));
			
			string2 = string2+string.charAt(i);
			
		}
		
		System.out.println(" "+string2);
		
		if (string.equals(string2)) {
			
			System.out.println("Palindrome");
			
		} else {

			
			System.out.println("Not a Palindrome");

		}
		
		
		
		
		
		
		
		
		
	}
}
