package org.dummy;

public class Triangle {
	public static void main(String[] args) {

		// to print * as triangle in 5 line

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
