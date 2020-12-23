package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  
  public class FindFirstOccurrenceOfOne {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      int length;
      while(times-- != 0){
        length = scan.nextInt();
        int[] numArr = new int[length];
        for(int i=0;i<length;i++){
          numArr[i] = scan.nextInt();
        }
        System.out.println(findFirstOcc(numArr,length));
        
      }
    }
    
    private static int findFirstOcc(int[] arr,int length){
        int low = 0;
        int high = length-1;
        int mid;
        if(arr[0]==1){
              return 0;
          }
        while(low>high){
          mid = low + ((high-low)/2);
          if(arr[mid] == 1 && arr[mid-1] == 0){
            return mid;
          }else if(arr[mid] == 1){
            high = mid - 1;
          }else {
            low = mid + 1;
          }
        }
        return -1;
    }
  }