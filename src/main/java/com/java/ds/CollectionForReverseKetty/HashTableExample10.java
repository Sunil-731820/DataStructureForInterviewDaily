package com.java.ds.CollectionForReverseKetty;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableExample10 {
	public static void main(String[] args) {
		System.out.println("This is the example of the hashTable ");
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Arti");
		ht.put(102, "khushboo");
		ht.put(103,"urvashi");
		System.out.println("the hashTable is ");
		System.out.println(ht);
		
		
		// getting the values only here
		System.out.println("the values is ");
		for(Map.Entry hm : ht.entrySet()) {
			System.out.println(hm.getValue());
		}
		
		//Getting the keys Only Here
		System.out.println("the keys is ");
		for(Map.Entry hm : ht.entrySet()) {
			System.out.println(hm.getKey());
		}
		
		// if you want to print the both keys and values at the same time do this one 
		for(Map.Entry<Integer, String> hm : ht.entrySet()) {
			System.out.println(hm.getKey() + " ->" + hm.getValue());
		}
		
		// removing the values from the hashTable
		ht.remove(101);
		System.out.println("after removing the hashtable ");
		System.out.println(ht);
		
		
		// use of the GetDefaultOr Method yea it just like if or else statement 
		System.out.println(ht.getOrDefault(101, "Not found in this map"));
		System.out.println("after the use of the getOrDefault()");
		System.out.println(ht);
		
		//The use of putIfAbsent() in hashTable 
		
		ht.putIfAbsent(101, "Divyani");
		System.out.println("the new Map after using puIfAbsent()");
		System.out.println(ht);
		
		
		
	}

}
