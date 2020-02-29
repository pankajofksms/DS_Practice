package com.practice.greedyAlgo;

import java.util.ArrayList;
import java.util.List;

public class CoinChnageProb {

	public static void main(String[] args) {

		System.out.println(returnChange(2028));
	}

	private static List<Integer> returnChange(int amount) {
		List<Integer> changeList = new  ArrayList<>();
		while(amount>0) {
			int temp = findLargestChange(amount);
			if(temp!=0)
				changeList.add(temp);
			amount = amount-temp;
		}
		return changeList;
	}

	private static int findLargestChange(int amount) {
		if (amount >= 1000)
			return 1000;
		if (amount >= 500)
			return 500;
		if (amount >= 100)
			return 100;
		if (amount >= 50)
			return 50;
		if (amount >= 20)
			return 20;
		if (amount >= 10)
			return 10;
		if (amount >= 5)
			return 5;
		if (amount >= 2)
			return 2;
		if (amount >= 1)
			return 1;
		return 0;
	}
}
