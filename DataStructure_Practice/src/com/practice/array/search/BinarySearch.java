package com.practice.array.search;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7,8};
		
		System.out.println(binarySearch(arr, 4)); 
	}

	private static boolean binarySearch(int arr[], int numberToSearch) {
		int low = 0;
		int high = arr.length;
		int medium;
		while(low<=high) {
			medium = (low + high) / 2;
			if (arr[medium] == numberToSearch)
				return true;
			if (arr[medium] < numberToSearch) {
				low = medium;
			} else {
				high = medium;
			}

		}
		return false;
	}

}
