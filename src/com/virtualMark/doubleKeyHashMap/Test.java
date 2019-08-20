package com.virtualMark.doubleKeyHashMap;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		DoubleKeyHashMap<Integer, Integer, String> doubleKeyHashMap1 = new DoubleKeyHashMap<Integer, Integer, String>();
		DoubleKeyHashMap<String, String, String> doubleKeyHashMap2 = new DoubleKeyHashMap<String, String, String>();
		
		doubleKeyHashMap1.put(1, 1, "India");
		doubleKeyHashMap1.put(1, 2, "Japan");
		doubleKeyHashMap1.put(1, 2, "Bhutan");
		System.out.println(doubleKeyHashMap1.size());
		System.out.println(doubleKeyHashMap1.toString());
		
		doubleKeyHashMap2.put("One", "One", "One");
		doubleKeyHashMap2.put("Two", "Two", "Four");
		doubleKeyHashMap2.put("Three", "Three", "Three");
		System.out.println(doubleKeyHashMap2.size());
		System.out.println(doubleKeyHashMap2.toString());
		
		Iterator<DoubleKeyHashMap<Integer, Integer, String>.Pair<Integer, Integer>> iterator = doubleKeyHashMap1.iterator();
		
		while(iterator.hasNext()) {
			DoubleKeyHashMap<Integer, Integer, String>.Pair<Integer, Integer> pair = iterator.next();
	        System.out.println(pair.key1 + "," + pair.key2 + " = " +  doubleKeyHashMap1.get(pair.key1, pair.key2));	
		}		
	}
}
