package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int testCases = scan.nextInt();
      int num;
      while(testCases-- != 0){
        num = scan.nextInt();
        System.out.println(fun(2));
      }
    }
    
    private static void printPattern(int num){
      System.out.print(num+" ");
      if(num<=0)
        return;
      printPattern(num-5);
      System.out.print(num+" ");
    }
    
    private static int fun(int n)
    {
     if (n == 4)
     return n;
     else return 2*fun(n+1);
    }
  }