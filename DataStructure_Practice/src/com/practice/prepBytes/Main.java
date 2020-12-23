package com.practice.prepBytes;
import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int length = scan.nextInt();
      int p[] = new int[length];
      int q[] = new int[length];
      int k = 0;
      int tempLength = length;
      while(tempLength-- != 0){
        p[k] = scan.nextInt();
        q[k] = scan.nextInt();
        k++;
      }
      int sum2=0;
      for(int i=0;i<length;i++){
        sum2 = sum2 + (q[i]*length -p[i]);
      }
      Integer result[] = new Integer[length];
      for(int i=0;i<length;i++){
        result[i] = p[i] - q[i];
      }
      Arrays.sort(result, Collections.reverseOrder());
      int sum1 = 0;
      for(int i=0;i<length;i++){
        sum1 = sum1 + (result[i] * (i+1));
      }
      
      System.out.println(sum1+sum2);
    
  }
}