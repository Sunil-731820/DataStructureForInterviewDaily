package com.java.ds.CollectionForReverseKetty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample7 {
	public static void main(String[] args) {
		System.out.println("This is the example of the hashSet ");
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Sunil");
		System.out.println("The hashSet is ");
		System.out.println(hs);
		
		//Iterating the objects using iterator()
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//adding the another set element into the other set element 
		
		HashSet<String> hs1  = new HashSet<String>();
		hs1.add("Sunil");
		hs1.add("Harish");
		System.out.println("the new set is ");
		System.out.println(hs1);
		
		// Now adding the new set element into the first Set
		
		hs.addAll(hs1);
		System.out.println("the new set is ");
		System.out.println(hs);
		
		//Removing all element of the set1 from the set2 
		
		hs.removeAll(hs1);
		System.out.println("the remaining set element is ");
		System.out.println(hs);
		
		//Removing the element on the basis of the specified conditions 
		
		hs.removeIf(str->str.contains("One"));
		System.out.println("the new set is ");
		System.out.println(hs);
		
		// clearing the new set 
		
		hs.clear();
		System.out.println("after removing all the element from the set");
		System.out.println(hs);
		
		
		//Adding the another collections into the set
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arti");
		list.add("Khushboo");
		System.out.println("the list is ");
		System.out.println(list);
		hs.addAll(list);
		System.out.println("after adding this ");
		System.out.println(hs);
		
	}

}
