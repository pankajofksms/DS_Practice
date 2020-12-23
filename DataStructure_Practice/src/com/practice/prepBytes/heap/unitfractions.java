package com.practice.prepBytes.heap;
import java.util.*;
    class unitfractions { 

      static void printfrac(int nr, int dr) { 
        if (dr == 0 || nr == 0) { 
            return; 
        } 
        if (dr % nr == 0) { 
            System.out.print("1/" + dr / nr); 
            return; 
        } 
        if (nr % dr == 0) { 
            System.out.print(nr / dr); 
            return; 
        } 
        if (nr > dr) { 
            System.out.print(nr / dr + " "); 
            printfrac(nr % dr, dr); 
            return; 
        } 
        int n = dr / nr + 1; 
        System.out.print("1/" + n + " "); 
        printfrac(nr * n - dr, dr * n); }

    public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0 ){
            int nr = sc.nextInt();
            int dr = sc.nextInt();
        printfrac(nr, dr); }
    } 
    } 