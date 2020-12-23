package com.practice.prepBytes.stack;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);

		for (int i = 0;; i++) {
			String s;
			s = scan.next();
			if (s.equals("---")) {
				break;
			}
			Stack<Character> st = new Stack<>();
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '{') {
					st.push(s.charAt(j));
				} else if (s.charAt(j) == '}') {
					if (st.empty()) {
						count++;
						st.push('{');
					} else {
						st.pop();
					}
				}
			}
			int n = st.size();
			System.out.println( (i + 1) + ". " + (count + n / 2));
		}
	}

}
