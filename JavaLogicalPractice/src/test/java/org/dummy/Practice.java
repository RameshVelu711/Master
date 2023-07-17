package org.dummy;


import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {

		String string = " ramesh";

		System.out.println(System.identityHashCode(string));

		String string2 = " Ramesh";
		System.out.println(System.identityHashCode(string2));

		String concat = string.concat(string2);
		System.out.println(concat);
		
		System.out.println(System.identityHashCode(concat));

		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(System.identityHashCode(buffer));

		StringBuffer buffer2 = new StringBuffer("  Java");
		System.out.println(System.identityHashCode(buffer2));

		StringBuffer append = buffer.append(buffer2);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

	}
}
