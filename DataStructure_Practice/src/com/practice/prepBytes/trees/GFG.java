package com.practice.prepBytes.trees;

import java.io.IOException;
import java.util.Scanner;

class GFG {

	static int[] tree_min = new int[1000001];
	static int[] tree_max = new int[1000001];

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while (times-- != 0) {
			int length = scan.nextInt();
			int arr[] = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scan.nextInt();
			}
			build_min(arr, 1, 0, length - 1);
			build_max(arr, 1, 0, length - 1);
			int size = scan.nextInt();
			while (size-- != 0) {
				int low = scan.nextInt();
				int high = scan.nextInt();
				high--;
				low--;
				System.out.println(isConsecutive(low, high, length));
			}
		}
	}

	static void build_min(int array[], int node, int left, int right) {
		if (left == right)
			tree_min[node] = array[left];

		else {
			build_min(array, 2 * node, left, (left + right) / 2);

			build_min(array, 2 * node + 1, (left + right) / 2 + 1, right);

			tree_min[node] = Math.min(tree_min[2 * node], tree_min[2 * node + 1]);
		}
	}

	static int query_min(int node, int left, int right, int l, int r) {
		if (left > r || right < l)
			return (int) 1e9;

		if (left >= l && right <= r)
			return tree_min[node];
		else
			return Math.min(query_min(2 * node, left, (left + right) / 2, l, r),
					query_min(2 * node + 1, (left + right) / 2 + 1, right, l, r));
	}

	static void build_max(int array[], int node, int left, int right) {
		if (left == right)
			tree_max[node] = array[left];

		else {
			build_max(array, 2 * node, left, (left + right) / 2);
			build_max(array, 2 * node + 1, (left + right) / 2 + 1, right);

			tree_max[node] = Math.max(tree_max[2 * node], tree_max[2 * node + 1]);
		}
	}

	static int query_max(int node, int left, int right, int l, int r) {
		if (left > r || right < l)
			return -1;

		if (left >= l && right <= r)
			return tree_max[node];
		else
			return Math.max(query_max(2 * node, left, (left + right) / 2, l, r),
					query_max(2 * node + 1, (left + right) / 2 + 1, right, l, r));
	}

	static boolean isConsecutive(int x, int y, int n) {
		return ((query_max(1, 0, n - 1, x, y) - query_min(1, 0, n - 1, x, y)) == (y - x));
	}

}
