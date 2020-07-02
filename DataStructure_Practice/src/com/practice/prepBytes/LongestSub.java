package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
  public class LongestSub {
    public static void main(String args[]) throws IOException {
      Scanner scan = new Scanner(System.in);
      int times = scan.nextInt();
      String str;
      while(times-- != 0){
        str = scan.next();
        System.out.println(longestSubStr(str));
      }
    }
    private static int longestSubStr(String str){
      int start = 0;
      int end = 0;
      int maxCount = 0;
      HashSet<Character> hs = new HashSet<>();
      while(end<str.length()){
        if(!hs.contains(str.charAt(end))){
          hs.add(str.charAt(end));
          end++;
          maxCount = Math.max(hs.size(),maxCount);
        }else{
          hs.remove(str.charAt(start));
          start++;
        }
      }
      return maxCount;
    }
  }