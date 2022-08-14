package com.java.ds.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("Sunil");
		lk.add("harish");
		lk.add("Suman");
		lk.add("khushboo");
		System.out.println("the linkedList is ");
		System.out.println(lk);
		Iterator itr = lk.iterator();
		while(itr.hasNext()) {
			System.out.println("the element is " + itr.next());
			
		}
		
	}

}
