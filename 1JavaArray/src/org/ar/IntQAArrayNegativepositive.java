package org.ar;

import java.util.Arrays;

public class IntQAArrayNegativepositive {
	public static void main(String[] args) {
		
		//move all negative number to the begining and positive to the end

		int arr[] = {1,0, 2, 3, -12, -11, -10};

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;

				}

			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
