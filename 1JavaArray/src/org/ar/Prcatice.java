package org.ar;

import java.util.Arrays;

public class Prcatice {
	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 8; i++) {

			if (i % 2 == 0) {

				count = count + i;
			}		

		}

		System.out.println(count);

		int arr[] = { 1, 2, 3 };

		int max = arr[0];

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] < max) {

				max = arr[j];

			}

		}

		System.out.println(max);

		int arr1[] = { 0, 1, 1, 2, -3, -4 };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = i + 1; j < arr1.length; j++) {
				
				if (arr1[i]>arr1[j]) {
				
				int k = arr1[i];
				arr1[i] = arr1[j];
				arr1[j] = k;

			}
		}}

		System.out.println(Arrays.toString(arr1));

	}

}
