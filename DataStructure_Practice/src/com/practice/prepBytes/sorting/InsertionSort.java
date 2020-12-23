package com.practice.prepBytes.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,21};
		new InsertionSort().sorting(arr, arr.length);
	}

	void sorting(int arr[], int n) {
		int j;
		int v;
		for(int i=1;i<n-1;i++) {
			v = arr[i];
			j = i;
			while(j>=1 && arr[j-1]>v) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = v;
		}
		System.out.println(Arrays.toString(arr));
	}
}
