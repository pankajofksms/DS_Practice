package com.practice.array;

import java.util.Arrays;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class FindNumberOfRotation {

	public static void main(String[] args) {
		int arr[] = { 15, 18, 2, 3, 6, 12 };

		int arr2[] = { 7, 9, 11, 12, 5 };

		int arr3[] = { 7, 9, 11, 12, 15 };

		String printMsg = "Number of rotation of arr %s is : %d";

		int rotation = numberOfRptation(arr);

		System.out.println(String.format(printMsg, Arrays.toString(arr), rotation));

		rotation = numberOfRptation(arr2);

		System.out.println(String.format(printMsg, Arrays.toString(arr2), rotation));

		rotation = numberOfRptation(arr3);

		System.out.println(String.format(printMsg, Arrays.toString(arr3), rotation));
	}

	private static int numberOfRptation(int arr[]) {
		int rotation;

		// Loop from 0 to (Array length - 2)
		for (rotation = 0; rotation < arr.length - 1; rotation++) {
			if (arr[rotation + 1] < arr[rotation])
				break;
		}

		if (rotation == arr.length - 1)
			return 0;
		return rotation + 1;

	}

}
