package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
//Clock Angle Problem  
  public class Ques1 {
    public static void main(String args[]) throws IOException {
    Scanner scan = new Scanner(System.in);
    int times = scan.nextInt();
    int min = 0;
    int hour = 0;
    int result =0;
    final double permin_hour = 0.5;
    final int permin_min = 6;
    while(times-- != 0){
      hour = scan.nextInt();
      min = scan.nextInt();
    // Each degree hour = 0.5 per min (360/(12*60)) 
    // Each degree min = 6 per min (360/60)
     result = Math.abs((int)(permin_hour*(60*hour + min)) - (min*permin_min));
     result = Math.min(360-result, result);
    System.out.println(result);
    }
}
  }