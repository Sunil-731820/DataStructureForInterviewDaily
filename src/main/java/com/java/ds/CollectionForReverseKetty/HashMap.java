package com.java.ds.CollectionForReverseKetty;

import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		System.out.println("This is the example of the hashmap ");
		
		java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer, String>();
		map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
		   
		   //Remove using key 
		   map.remove(1);
		   System.out.println("the map is ");
		   System.out.println(map);
		   
		   //key-value pair based removal  
		    map.remove(2, "Apple"); 
		    System.out.println("after removing this ");
		    System.out.println(map);
		    
		    // Use of Replace 
		    map.replace(3, "Papaya");
		    System.out.println("after the use of replace()");
		    System.out.println(map);
		}  
	
		
	}


