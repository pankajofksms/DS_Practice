package com.practice.string;

import java.util.Scanner;

// https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

public class CheckStringRotation {

	public static void main(String[] args) {
		
		String firstStr = "ABCD";
		String secondStr = "CDAB";
		System.out.println(checkRotationStr(firstStr, secondStr));
		
	}
	
	private static boolean checkRotationStr(String firstStr, String rotatedStr) {
		if(firstStr.length() != rotatedStr.length())
			return false;
		if((firstStr + firstStr).contains(rotatedStr))
			return true;
		return false;
	}
	
}
