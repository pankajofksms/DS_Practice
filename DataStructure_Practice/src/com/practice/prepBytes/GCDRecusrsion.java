package com.practice.prepBytes;

import java.util.*;
import java.io.*;

//Using Euclieadian Principle
public class GCDRecusrsion {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num1;
		int num2;
		while (times-- != 0) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			if (num2 < num1) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.println(gcd(num1, num2));
		}
	}

	private static int gcd(int num1, int num2) {
		if (num1 == 0)
			return num2;
		if (num2 == 0)
			return num1;
		if (num1 > num2)
			return gcd(num1 - num2, num2);
		return gcd(num1, num2 - num1);
	}

}