package com.practice.prepBytes.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int length;
		while(times-- != 0) {
			length = scan.nextInt();
			int arr[] = new int[length];
			for(int i=0;i<length;i++)
				arr[i] = scan.nextInt();
			mergeSort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	private static void mergeSort(int arr[]) {
		int n = arr.length;
		if(n<2)
			return;
		int mid = n/2;
		int left[] = new int[mid];
		int right[] = new int[n-mid];
		for(int i=0;i<mid;i++)
			left[i] = arr[i];
		for(int i=mid;i<n;i++)
			right[i-mid] = arr[i];
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
	}
	
	private static void merge(int[] left,int[] right,int[] arr) {
		int nleft = left.length;
		int nright = right.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<nleft && j<nright) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i = i+1;
			} else {
				arr[k] = right[j];
				j = j+1;
			}
			k = k+1;
		}
		while(i<nleft) {
			arr[k] = left[i];
			i = i+1;
			k = k+1;
		}
		while(j<nright) {
			arr[k] = right[j];
			j = j+1;
			k = k+1;
		}
	}
	
}