package com.practice.prepBytes;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(iterMethod(str));
	}
	
	private static String recurMethod(String str) {
		return null;
	}
	
	private static String iterMethod(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
			sb.append(str.charAt(i));
		return sb.toString();
	}

}
