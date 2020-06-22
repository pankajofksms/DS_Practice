package com.practice.prepBytes;

import java.util.HashMap;
import java.util.Map;

// https://www.prepbytes.com/panel/mycourses/125-days-expert-coder-program/java/week/2/arrays/video/379095516

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {7,2,7,3,7,2,7,7};
		Map<Integer,Integer> map =new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		map.forEach((key,value) -> {
			if(value> (arr.length/2))
				System.out.println(key);
		});
	}
}
