package com.practice.prepBytes;

import java.util.Scanner;

public class MultiplyTwoString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		String str1;
		String str2;
		while (times-- != 0) {
			str1 = scan.next();
			str2 = scan.next();
			System.out.println(multiplyStr(str1, str2));
		}
	}

	private static String multiplyStr(String str1, String str2) {
		if (str1.length() > str2.length()) {
			String temp = str1;
			str1 = str2;
			str2 = temp;
		}
		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();
		int prod;
		int carry = 0;
		String result = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				prod = ((str1.charAt(i) - '0') * (str2.charAt(j) - '0')) + carry;
				result = result.concat(String.valueOf((char) ((prod % 10) + '0')));
				carry = prod /10;
			}
		}
		if (carry > 0)
			result = result.concat(String.valueOf((char) (carry + '0')));
		result = new StringBuilder(result).reverse().toString();
		return result;

	}

}
