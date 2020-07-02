package com.practice.prepBytes;

import java.io.IOException;
import java.util.Scanner;

public class ChaturExamPaper {
	 public static void main(String args[]) throws IOException {
	      Scanner scan = new Scanner(System.in);
	      int times = scan.nextInt();
	      String str;
	      int count;
	      while(times-- != 0){
	        str = scan.next();
	        count = 0;
	        for(int i=0;i<(str.length()/2);i++){
	          count = count + Math.abs((str.charAt(i) - str.charAt(str.length() -i -1)));
	        }
	        System.out.println(count);
	      }
	    }

}
