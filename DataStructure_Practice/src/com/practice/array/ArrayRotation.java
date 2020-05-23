package com.practice.array;

import java.util.Arrays;

//https://www.geeksforgeeks.org/array-rotation/

public class ArrayRotation {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		rotateArrleft(arr, 2);
		int arr2[] = { 1, 2, 3, 4, 5, 6 };
		rotateArrRight(arr2, 2);
	}

	public static void rotateArrleft(int arr[], int d) {
		int temp[] = new int[d];

		// storing d numbers in temp Array
		for (int i = 0; i < d; i++)
			temp[i] = arr[i];
		
		// moving digits to place +d
		for (int i = 0; i < (arr.length - d); i++) {
			arr[i] = arr[d + i];
		}

		//Storing temp back to original Array
		for (int i = 0; i < d; i++) {
			arr[(arr.length) - d + i] = temp[i];
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void rotateArrRight(int arr[], int d) {

		int temp[] = new int[d];
		int k = 0;
		
		for (int i = arr.length - d; i < arr.length; i++, k++)
			temp[k] = arr[i];

		for (int i = 0; i < arr.length - d; i++) {
			arr[(arr.length - 1) - i] = arr[(arr.length - 1) - d - i];
		}
		
		for(int i=0;i<d;i++)
			arr[i] = temp[i];
		
		System.out.print(Arrays.toString(arr));
	}

}
