package com.practice.prepBytes;
// Java program to print all combination of size r in an array of size n 
import java.io.*; 

class Combination { 

	static void getPattern(int arr[], int temp[], int start, 
								int end, int index, int k) 
	{ 
		if (index == k) 
		{ 
			for (int j=0; j<k; j++) 
				System.out.print(temp[j]); 
			System.out.println(""); 
			return; 
		} 

		for (int i=start; i<=end && end-i+1 >= k-index; i++) 
		{ 
			temp[index] = arr[i]; 
			getPattern(arr, temp, i+1, end, index+1, k); 
		} 
	} 



	public static void main (String[] args) { 
		int arr[] = {1, 2, 3, 4, 5}; 
		int k = 3; 
		int n = arr.length;
		int temp[]=new int[k]; 
		getPattern(arr, temp, 0, n-1, 0, k); 
	} 
} 

