package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      long bmw;
      long audi;
      long k;
      long lcm;
      int count;
      long prod;
      int loop;
      while(times-- != 0){
        count = 0;
        loop = 1;
        bmw = scan.nextLong();
        audi = scan.nextLong();
        k = scan.nextLong();
        lcm = findLCM(bmw,audi);
        prod = lcm;
        while(prod<k){
          prod = lcm*loop;
          count++;
          loop++;
        }
        System.out.println(count);
      }
      
    }
    
    private static long findLCM(long a , long b){
      long prod = a*b;
      long gcd = findGcd(a,b);
      return prod/gcd;
    }
    
    private static long findGcd(long a, long b){
      if(a==0 || b==0)
        return Math.max(a,b);
      if(a>b)
        return findGcd(a-b,b);
      return findGcd(a,b-a);  
    }
  }