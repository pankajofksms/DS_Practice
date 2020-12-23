package com.practice.prepBytes.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {6,8,3,5,7,9};
		int arr1[] = {9,8,7,6,5,4,3,2,1};
		new SelectionSort().selectionSort(arr, arr.length);
		new SelectionSort().selectionSort(arr1, arr1.length);
	}
	
	private void selectionSort(int[] arr, int n) {
		int min;
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
