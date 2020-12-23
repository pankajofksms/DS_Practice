package com.practice.prepBytes;
public class GFG { 
   
	/**
	 * This method is used
	 * 
	 * @param n 
	 * @return
	 */
	static int totalDigits(int n) 
    { 
        // number_of_digits store total 
        // digits we have to write 
        int number_of_digits = 0; 
        // In the loop we are decreasing 
        // 0, 9, 99 ... from n till 
        // ( n - i + 1 ) is greater than 0 
        // and sum them to number_of_digits 
        // to get the required sum 
        for (int i = 1; i <= n; i *= 10) 
            number_of_digits += (n - i + 1); 
  
        return number_of_digits; 
    } 
  
    // Driver Method 
    public static void main(String[] args) 
    { 
        int n = 13; 
        System.out.println(totalDigits(n)); 
    } 
} 