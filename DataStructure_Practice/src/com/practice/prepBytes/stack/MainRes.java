package com.practice.prepBytes.stack;

import java.util.*;
import java.io.*;

public class MainRes {
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		Stack<String> st = new Stack<String>();

		String res = "";

		res += "/";

		int len_A = str.length();

		for (int i = 0; i < len_A; i++) {
			String dir = "";

			while (i < len_A && str.charAt(i) == '/')
				i++;

			while (i < len_A && str.charAt(i) != '/') {
				dir += str.charAt(i);
				i++;
			}

			if (dir.equals("..") == true) {
				if (!st.empty())
					st.pop();
			}

			else if (dir.equals(".") == true)
				continue;

			else if (dir.length() != 0)
				st.push(dir);
		}
		Stack<String> st1 = new Stack<String>();
		while (!st.empty()) {

			st1.push(st.pop());
		}

		while (!st1.empty()) {
			if (st1.size() != 1)
				res += (st1.pop() + "/");
			else
				res += st1.pop();
		}
		System.out.println(res);

	}
}