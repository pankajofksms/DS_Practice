package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  
  public class ArraySeqProb {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      int arrSize;
      while(times-- != 0){
        arrSize = scan.nextInt();
        int arr[] = new int[arrSize];
        int resultArr[] = new int[arrSize];
        int k=arr.length-1;
        int l=0;
        for(int i=0;i<arrSize;i++)
          arr[i] = scan.nextInt();
        for(int i=0;i<arr.length;i++){
          if(i%2==0)
              resultArr[i] = arr[k--];
          else
              resultArr[i] = arr[l++];
        }
        for(int i=0;i<arr.length;i++)
          System.out.print(resultArr[i]+ " ");
        
      }
      
      
    }
  }