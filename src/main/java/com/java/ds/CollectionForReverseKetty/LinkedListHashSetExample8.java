package com.java.ds.CollectionForReverseKetty;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListHashSetExample8 {
	public static void main(String[] args) {
		System.out.println("This is the example of the LinkedListhashSets");
		LinkedHashSet<String> lk = new LinkedHashSet<String>();
		lk.add("Ravi");
		lk.add("Vijay");
		lk.add("Ravi");
		lk.add("Sunil");
		
		System.out.println("now printing the linkedlist hashSet ");
		System.out.println(lk);
		
		//Iterating the linkedListHashSet 
		Iterator<String> itr = lk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Creating the another linkedList hashSet
		
		LinkedHashSet<String> lk1 = new LinkedHashSet<String>();
		lk1.add("Suman");
		lk1.add("Arti");
		lk1.add("Rakesh");
		System.out.println("the LinkedHashSet is ");
		System.out.println(lk1);
		
		// Now Adding one LinkedListHashSet into the Another LinkedListHashSet
		
		lk.addAll(lk1);
		System.out.println("the new LinkedListHashSet is ");
		System.out.println(lk);
		
		// The use of the Remove()
		
		LinkedHashSet<String> lk2 = new LinkedHashSet<String>();
		lk2.add("Good");
		lk2.add("Better");
		lk2.add("Best");
		lk2.add("Worst");
		System.out.println("This is the new linkedHashSet ");
		System.out.println(lk2);
		
		System.out.println(lk2.remove("Good"));
		System.out.println("the linkedListHasSet is ");
		System.out.println(lk2);
		
		
		
		
	}

}
