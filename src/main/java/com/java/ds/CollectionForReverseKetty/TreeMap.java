package com.java.ds.CollectionForReverseKetty;

import java.util.Map;

public class TreeMap {
	public static void main(String[] args) {
		System.out.println("this is the example of the tree map ");
		java.util.TreeMap<Integer, String> tm = new java.util.TreeMap<Integer, String>();
		tm.put(1, "Mango");
		tm.put(20, "Banana");
		tm.put(2, "papaya");
		System.out.println("the tree map is ");
		System.out.println(tm);
		
//		Iterating the tree map 
		for(Map.Entry h : tm.entrySet()) {
			System.out.println(h.getKey() + " " + h.getValue());
		}
		
//		Removing the element from the tree map 
		tm.remove(20);
		System.out.println("after this ");
		System.out.println(tm);
		
		
	}

}
