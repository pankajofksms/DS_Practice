package com.practice.prepBytes.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int length;
		while(times-- != 0) {
			length = scan.nextInt();
			int arr[] = new int[length];
			for(int i=0;i<length;i++)
				arr[i] = scan.nextInt();
			quickSort(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	private static void quickSort(int[] arr,int start,int end) {
		int pIndex;
		if(start>=end)
			return;
		pIndex = partition(arr,start,end);
		quickSort(arr, start, pIndex-1);
		quickSort(arr, pIndex+1, end);
	}

	private static int partition(int arr[],int start,int end){
		int pivot = arr[end];
		int pIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i]<pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
			int temp = arr[pIndex];
			arr[pIndex] = arr[end];
			arr[end] = temp;
		
		return pIndex;
	}
}
