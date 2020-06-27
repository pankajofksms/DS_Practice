package com.practice.prepBytes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "prepbytes";
		System.out.println(findNonRepeatingWithMap(str));
	}
	
	private static char findNonRepeatingWithMap(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		for(Entry<Character,Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return '0';
	}

}
