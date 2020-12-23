package com.practice.prepBytes.sorting;
import java.util.*;
  import java.io.*;
  
  public class PokemonBattle {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      int length;
      while(times-- != 0){
        length = scan.nextInt();  
        int arnabArr[] = new int[length];
        int daipArr[] = new int[length];
        for(int i=0;i<length;i++)
          arnabArr[i] = scan.nextInt();
        for(int i=0;i<length;i++)
          daipArr[i] = scan.nextInt();
          int start=0;
          int counter = 0;
        for(int i=0;i<length;i++){
          for(int j=start;j<length;j++){
            if(daipArr[i]<arnabArr[j]){
              start = j+1;
              counter++;
              break;
            }
          }
        }
        System.out.println(counter);
      }
    }
  }