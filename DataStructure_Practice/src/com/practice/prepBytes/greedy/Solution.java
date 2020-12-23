package com.practice.prepBytes.greedy;

import java.util.*;

class Solution {
	private static int kabbaddi(String arr, int n, int k) {
		int res = 0;
		ArrayList<Integer> thi = new ArrayList<>();
		ArrayList<Integer> pol = new ArrayList<>();
		;
		for (int i = 0; i < n; i++) {
			if (arr.charAt(i) == '1')
				pol.add(i);
			else if (arr.charAt(i) == '0')
				thi.add(i);
		}
		int l = 0, r = 0;
		while (l < thi.size() && r < pol.size()) {
			if (Math.abs(thi.get(l) - pol.get(r)) <= k) {
				res++;
				l++;
				r++;
			} else if (thi.get(l) < pol.get(r))
				l++;
			else
				r++;
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int times = sc.nextInt();

		while (times-- != 0) {
			String s = sc.next();
			int k = sc.nextInt();

			System.out.println(kabbaddi(s, s.length(), k));
		}
	}
}