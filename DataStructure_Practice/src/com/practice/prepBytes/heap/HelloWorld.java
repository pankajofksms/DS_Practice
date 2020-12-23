package com.practice.prepBytes.heap;

import java.util.*;
import java.util.Scanner;

class HelloWorld {
	ArrayList<Integer> num = new ArrayList();

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		HelloWorld h = new HelloWorld();
		int t, n, m, count, a, b;
		t = Integer.parseInt(myObj.nextLine());
		String str;
		for (int c = 1; c <= t; c++) {
			str = myObj.nextLine();
			m = Integer.parseInt(myObj.nextLine());
			n = str.length();
			for (int i = 0; i < n; i++) {
				h.num.add(str.charAt(i) - '0');
			}
			count = 0;
			while (count < m) {
				for (int i = 0; i < h.num.size() - 1; i++) {
					if ((int) h.num.get(i) < (int) h.num.get(i + 1)) {
						h.num.remove(i);
						count++;
						break;
					} else if ((i + 1 == h.num.size() - 1) && (int) h.num.get(i) >= (int) h.num.get(i + 1)) {
						h.num.remove(i + 1);
						count++;
						break;

					}
				}
			}
			for (int i = 0; i < h.num.size(); i++) {
				System.out.print(h.num.get(i));
			}
			System.out.println();
			h.num.clear();
		}
	}
}