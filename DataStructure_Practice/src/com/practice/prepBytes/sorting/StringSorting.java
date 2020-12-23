package com.practice.prepBytes.sorting;

import java.util.Arrays;

public class StringSorting {
	public static void main(String[] args) {
		String s1 = new String("fecdba");
		char arr[] = s1.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
	}
}
