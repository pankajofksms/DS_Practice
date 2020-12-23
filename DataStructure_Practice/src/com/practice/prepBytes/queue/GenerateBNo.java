package com.practice.prepBytes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBNo {
	public static void generatePrintBinary(int length) {
		Queue<String> q = new LinkedList<String>();

		q.add("1");

		while (length-- > 0) {
			String s1 = q.poll();
			System.out.print(s1 + " ");
			String s2 = s1;
			q.add(s1 + "0");
			q.add(s2 + "1");
		}
	}

	// Driver program to test above function
	public static void main(String[] args) {
		int n = 10;
		generatePrintBinary(n);
	}
}
//This code is contributed by Sumit Ghosh 
