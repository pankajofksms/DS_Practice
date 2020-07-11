package com.practice.prepBytes;

import java.util.ArrayList;
import java.util.List;

public class Recursion_GetAllFactors {

	public static void main(String[] args) {
		List<List<Integer>> list = getFactors(8);
		list.forEach(a -> {
			a.forEach(System.out::print);
			System.out.println();
		});
	}

	public static List<List<Integer>> getFactors(int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		factors(2, 1, n, result, list);
		return result;
	}

	public static void factors(int start, int product, int n, List<List<Integer>> result, List<Integer> curr) {
		if (start > n || product > n)
			return;

		if (product == n) {
			ArrayList<Integer> t = new ArrayList<Integer>(curr);
			result.add(t);
			return;
		}

		for (int i = start; i <= n; i++) {
			if (i * product > n)
				break;

			if (n % i == 0) {
				if (curr.isEmpty())
					curr.add(1);
				curr.add(i);
				factors(i, i * product, n, result, curr);
				curr.remove(curr.size() - 1);
			}
		}
	}

}
