package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  import java.util.Map.Entry;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      String str;
      Map<Character, Integer> map;
      boolean flag;
      while(times-- != 0){
        map = new LinkedHashMap<>();
        str = scan.next();
        flag = false;
        for(int i=0;i<str.length();i++){
          map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0) + 1);
        }
        for(Entry<Character,Integer> entry : map.entrySet()){
          if(entry.getValue() == 1){
            flag = true;
            System.out.println(str.indexOf(entry.getKey()));
            break;
          }
        }
        if(!flag)
          System.out.println(-1);
        
      }
      
    }
  }