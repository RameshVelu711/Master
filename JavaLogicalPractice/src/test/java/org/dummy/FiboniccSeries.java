package org.dummy;

public class FiboniccSeries {

	public static void main(String[] args) {
		int  firstTerm = 1, secondTerm = 0;

		for (int i = 0; i <= 10; ++i) {

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
			System.out.println(firstTerm );

		}
	}

}
