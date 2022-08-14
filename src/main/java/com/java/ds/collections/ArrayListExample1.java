package com.java.ds.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Sunil");
		System.out.println("the element of the array List is ");
		System.out.println(list);
		list.add("Harish");
		System.out.println("the array list of obect is ");
		System.out.println(list);
		Iterator itr = list.iterator();
		System.out.println("iterating the objects of the Array List");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list.remove(0));
		System.out.println(list);
		
	}

}
