package com.practice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Program to count occurrence of each characters present in a string

public class CountString {
	public static void main(String[] args) {
		String sentence = "MY NAME IS PANKAJ KUMAR";
		Map<Character, Integer> map = occurence(sentence);
		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			System.out.println(
					String.format("Character '%c' is present %d times. ", entrySet.getKey(), entrySet.getValue()));
		}

	}

	private static Map<Character, Integer> occurence(String str) {
		Map<Character, Integer> counterMap = new HashMap<>();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			counterMap.put(ch, counterMap.getOrDefault(ch, 0) + 1);

		}
		return counterMap;
	}
}
