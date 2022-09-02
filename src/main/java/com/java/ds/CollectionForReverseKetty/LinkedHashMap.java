package com.java.ds.CollectionForReverseKetty;

import java.util.Map;

public class LinkedHashMap {
	public static void main(String[] args) {
		System.out.println("this is the example of the linkedHashMap");
		java.util.LinkedHashMap<Integer, String> lhm = new java.util.LinkedHashMap<Integer, String>();
		  lhm.put(100,"Amit");  
		  lhm.put(101,"Vijay");  
		  lhm.put(102,"Rahul");  
		  System.out.println("the linked hash Map is ");
		  System.out.println(lhm);
		  
//		  Iterating the LinkedHashMap 
		  for(Map.Entry h : lhm.entrySet()) {
			  System.out.println(h.getKey() + " " + h.getValue());
		  }
		  
		  //Fetching key  
	       System.out.println("Keys: "+lhm.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+lhm.values());  
	       //Fetching key-value pair it will give the list  
	       System.out.println("Key-Value pairs: "+lhm.entrySet()); 
	       
//	       Removing the element from the LinkedHashMap
	       
	       lhm.remove(100);
	       System.out.println("the linkedhashMap is ");
	       System.out.println(lhm);
	}

}
