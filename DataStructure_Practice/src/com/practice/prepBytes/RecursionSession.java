package com.practice.prepBytes;

import java.util.Scanner;

// https://codeforces.com/contest/31/problem/D 

public class RecursionSession {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int height = scan.nextInt();
		int n = scan.nextInt();
		int vertical[][][] = new int[width][height][height];
		int horizontal[][][] = new int [height][width][width];
		for(int i=0;i<n;i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			if(x1==x2)
				vertical[x1][y1][y2] = 1;
			else
				horizontal[y1][x1][x2] = 1;
		}
		
		
	}
	
	
	
	public static void calculateArea(int lx, int ly, int ux,int uy,int vertical[][][],int horizontal[][][]) {
		for(int i=lx+1;i<=ux;i++) {
			
		}
			
	}
}
