package reverse.practice;

public class NameReverse {
	public static void main(String[] args) {

		String string = "Ramesh";
		String rev = "Ramesh";

		for (int i = string.length() - 1; i >= 0; i--) {

			char charAt = string.charAt(i);
			rev = rev + charAt;

		}

		System.out.print(rev);

//		String string1 = "Ramesh";
//
//		for (int i = string.length() - 1; i >= 0; i--) {
//
//			char charAt = string1.charAt(i);
//
//			System.out.print(charAt);
//
//		}
	}
}
