package com.practice.prepBytes.stack;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while(times-- != 0) {
			int length = scan.nextInt();
			Stack<Character> stack = new Stack<>();
			String str = scan.next();
			int counter = 0;
			for(int i=0;i<length;i++) {
				if(str.charAt(i)=='<') {
					stack.push('<');
				}else if(!stack.empty()){
					char element = stack.pop();
					if(element == '<')
						counter += 2;
				}
			}
			System.out.println(counter);
		}
	}
}
