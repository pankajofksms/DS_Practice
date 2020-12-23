package com.practice.prepBytes.stack;

import java.util.*;
  import java.io.*;
  
  public class Test1 {
    public static void main(String args[]) throws IOException {
    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    String exp = "";
    for(int i=0;i<length;i++){
      exp = exp + scan.next();
    }
      
   	Stack<Long> stack = new Stack<>(); 
		for(int i = 0; i < exp.length(); i++) 
		{ 
			char c = exp.charAt(i); 
		   if(Character.isDigit(c)) 
			{ 
				long n = 0; 
				while(Character.isDigit(c)) 
				{ 
					n = n*10 + (long)(c-'0'); 
					i++; 
					c = exp.charAt(i); 
				} 
				i--; 
				stack.push(n); 
			} 
			
			else
			{ 
				long val1 = stack.pop(); 
				long val2 = stack.pop(); 
				
				switch(c) 
				{ 
					case '+': 
					stack.push(val2+val1); 
					break; 
					case '-': 
					stack.push(val2- val1); 
					break; 
					case '/': 
					stack.push(val2/val1); 
					break; 
					case '*': 
					stack.push(val2*val1); 
					break; 
			} 
			} 
		} 
		System.out.println(stack.pop()); 
    }
  }