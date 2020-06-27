package com.practice.prepBytes;

// A simple program to check performance
public class TestPerformance {
	
	public static void main(String[] args) {
		long start = System.nanoTime();
		
		for(long i=1;i<100000;i++) {
			for(long j=1;j<100000;j++) {}
			
		}
		System.out.println("In NanoSec: " + (System.nanoTime() - start));
		System.out.println("In MilliSec: " + ((System.nanoTime()-start)/1000000.00));
		System.out.println("In Sec: " + (((System.nanoTime()-start)/1000000.00)/1000.00));
	}

}
