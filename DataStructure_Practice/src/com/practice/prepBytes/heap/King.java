package com.practice.prepBytes.heap;

import java.util.*;

import java.util.PriorityQueue;

class King {
	static int MinSum(int arr[], int n) {
		int i, sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (i = 0; i < n; i++)
			pq.add(arr[i]);
		while (pq.size() > 1) {
			int min = pq.poll();
			int secondMin = pq.poll();
			sum += (min + secondMin);
			pq.add(min + secondMin);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(MinSum(arr, n));
		}
	}
}