package com.practice.prepBytes;
import java.util.*;
  import java.io.*;
/* 
> 1) We can find that by dividing `p` and `q` by `r`.
> 2) `q/r` gives total number of values divisible by `r` in range [`1,q`] ( or [ `q,-1` ] if `q` is negative).
> 3) `p/r` gives total number of values divisible by `r` in range [`1,p`] ( or [ `p,-1` ] if `p` is negative).
> 4) We can get our answer on subtracting number of values found in range [`1,p`] ( or [`p,-1`] ) from number of values found in range [`1,q`] ( or [`q,-1`] ).
> 5) An extra value should also be considered if following conditions are satisfied:
> > 1) If range contains `0`, we would add an additional 1, as `0` is divisible by `r` but is not counted by above method.
> > 2) If `p` and `q` both values are positive and `p` is divisible by `r`.
> > 3) If `p` and `q` both values are negative and `q` is divisible by `r`.
*/  
  public class RamboNumbers {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int times = scan.nextInt();
        long r;
        long p;
        long q; 
        long count;
        while(times-- != 0){
          r = scan.nextLong();
          p = scan.nextLong();
          q = scan.nextLong();
          count=0;
          count = count + (q/r) - (p/r);
          if(p<0 && q>0)
            count++;
          if(p>0 && q>0 && p%r==0)
            count++;
          if(q<0 && p<0 && q%r==0)
            count++;
          
          System.out.println(count);  
          
        }
        
      }
    

  }