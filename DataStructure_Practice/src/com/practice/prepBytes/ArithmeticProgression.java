package com.practice.prepBytes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * https://www.prepbytes.com/panel/mycourses/125-days-expert-coder-program/java/week/2/arrays/codingAssignment/ARITHPRO
 * 
 * Program to find Arithmetic Progression sequence in an array
 */
public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		int temp;
		int count = 0;
		Map<Integer, List<Integer>> map = new TreeMap<>();
		Map<Integer,Integer> resultMap = new TreeMap<>();
		for (int i = 0; i < numbers; i++) {
			temp = scan.nextInt();
			map.computeIfAbsent(temp, value -> new ArrayList<>()).add(i);
		}
		
		map.forEach((key, value) -> {
			if (value.size() == 1)
				resultMap.put(key,0);
			else {
				List<Integer> list = map.get(key);
				boolean flag = true;
				if(list.size()==2) {
					resultMap.put(key, list.get(1)-list.get(0));
				}

				for (int i = 2; i < list.size(); i++) {
					if ((list.get(i) - list.get(i - 1)) != (list.get(i - 1) - list.get(i - 2))) {
						flag = false;
					}
				}
				if (flag == true) {
					resultMap.put(key, list.get(1)-list.get(0));
				}
			}
		});
		
		System.out.println(resultMap.size());
		resultMap.forEach((key,value) -> System.out.println(key+ " " + value));
	}

}
