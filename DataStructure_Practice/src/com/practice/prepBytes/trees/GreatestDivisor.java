package com.practice.prepBytes.trees;
import java.util.*;
  import java.io.*;
  
  public class GreatestDivisor {
    
    
	int segmentTree[];

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		while (times-- != 0) {
			int length = scan.nextInt();
			int arr[] = new int[length];
			for (int i = 0; i < length; i++) {
				arr[i] = scan.nextInt();
			}

			GreatestDivisor main = new GreatestDivisor();
			main.constructSegmentTree(arr, length);
			int rangetime = scan.nextInt();
			while (rangetime-- != 0) {
				int low = scan.nextInt();
				int high = scan.nextInt();
				low--;
				high--;
				int queryIndex = main.findGcd(0, length - 1, low, high, 0);
				System.out.println(queryIndex);
			}

		}

	}

	private void constructSegmentTree(int[] arr, int n) {
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

		int max_size = 2 * (int) Math.pow(2, x) - 1;
		segmentTree = new int[max_size];

		constructSTUtil(arr, 0, n - 1, 0);
	}

	private void constructSTUtil(int[] arr, int low, int high, int pos) {
		if (low == high) {
			segmentTree[pos] = arr[low];
			return;
		}
		int mid = (low + high) / 2;
		constructSTUtil(arr, low, mid, (2 * pos) + 1);
		constructSTUtil(arr, mid + 1, high, (2 * pos) + 2);
		segmentTree[pos] = gcd(segmentTree[(2 * pos) + 1], segmentTree[(2 * pos) + 2]);
	}
	
    private int gcd(int a, int b) 
    { 
        if (a < b) 
        { 
            int temp = b; 
            b = a; 
            a = temp; 
        } 
  
        if (b==0) 
            return a; 
        return gcd(b,a%b); 
    } 
    
    public int findGcd(int low, int high, int qlow, int qhigh, int pos) 
    { 
        if (low>qhigh || high < qlow) 
            return 0; 
  
        if (qlow<=low && qhigh>=high) 
            return segmentTree[pos]; 
  
        int mid = (low+high)/2; 
  
        return gcd(findGcd(low, mid, qlow, qhigh, (pos*2)+1), 
                   findGcd(mid+1, high, qlow, qhigh, (pos*2)+2)); 
    }
	

    
  }