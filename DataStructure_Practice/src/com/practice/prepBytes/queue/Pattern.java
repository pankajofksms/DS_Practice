package com.practice.prepBytes.queue;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
  
  public class Pattern {
    public static void main(String args[]) throws IOException {
    	Scanner scan = new Scanner(System.in);
    	int length = scan.nextInt();
    	Queue<Integer> queue = new LinkedList<>();
    	int arr[] = new int[length];
    	for(int i=0;i<length;i++) {
    		arr[i] = scan.nextInt();
    	}
    	for(int i=0;i<length;i++) {
    		queue.add(arr[i]);
    		queue.forEach(p -> System.out.print(p+" "));
    		System.out.println();
    	}
    	for(int i=0;i<length;i++) {
    		queue.remove();
    		queue.forEach(p -> System.out.print(p +" "));
    		System.out.println();
    	}
    	
    }
    
  }