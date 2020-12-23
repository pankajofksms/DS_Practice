package com.practice.prepBytes.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair {
	Integer key;
	Integer value;

	public Pair(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}

class GFG {
	static List<Integer> result;

	public static void printKclosest(int[] arr, int n, int x, int k) {
		result = new ArrayList<>();

		PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p2.getValue().compareTo(p1.getValue());
			}
		});

		for (int i = 0; i < k; i++) {
			pq.offer(new Pair(arr[i], Math.abs(arr[i] - x)));
		}

		for (int i = k; i < n; i++) {
			int diff = Math.abs(arr[i] - x);

			if (diff > pq.peek().getValue())
				continue;

			pq.poll();
			pq.offer(new Pair(arr[i], diff));
		}

		while (!pq.isEmpty()) {
			result.add(pq.poll().getKey());
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while (times-- != 0) {
			int length = scan.nextInt();
			int p = scan.nextInt();
			int q = scan.nextInt();
			int arr[] = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scan.nextInt();
			}
			printKclosest(arr, length, p, q);
			Collections.sort(result, Collections.reverseOrder());
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			System.out.println();
		}
	}
}
