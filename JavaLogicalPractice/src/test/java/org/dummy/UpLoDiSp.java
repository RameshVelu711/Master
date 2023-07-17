package org.dummy;

public class UpLoDiSp {
	public static void main(String[] args) {

		String s = "WELcome@123";

		int u = 0, l = 0, d = 0, sp = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (Character.isUpperCase(c)) {
				u++;
			} else if (Character.isLowerCase(c)) {
				l++;
			} else if (Character.isDigit(c)) {
				d++;
			} else {
				sp++;
			}

		}
		System.out.println(u);
		System.out.println(l);
		System.out.println(d);
		System.out.println(sp);

	}

}
