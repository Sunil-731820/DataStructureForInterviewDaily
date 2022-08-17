package com.java.ds.CollectionForReverseKetty;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
	public static void main(String[] args) {
		System.out.println("this is the example of all the buildIn functions for linkedList in Java");
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("Ravi");
		lk.add("Vijay");
		lk.add("Ravi");
		lk.add("Ajay");
		System.out.println("the list of the objects is");
		System.out.println(lk);
		
		
		//iterating the object of the linkedList using Iterator method 
		Iterator itr = lk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//adding the list of second list object into the first List 
		LinkedList<String> lk1 = new LinkedList<String>();
		lk1.add("Sunil");
		lk1.add("Harish");
		lk1.add("Arti");
		System.out.println("the list of the second List is ");
		System.out.println(lk1);
		
		System.out.println("after adding the second list into the first list ");
		lk.addAll(lk1);
		System.out.println(lk);

		//Now adding the specified element to the specific positions
		
		lk.add(1, "suman");
		System.out.println("the list of the objects is after adding ");
		System.out.println(lk);
		
		//adding the whole list of another at the specific positions 
		
		LinkedList<String> lk2 = new LinkedList<String>();
		lk2.add("subham");
		lk2.add("sachin");
		lk2.add("rohit");
		System.out.println("the new List is ");
		System.out.println(lk2);
		
		// Now adding the list of the whole element at the specific positions 
		
		lk.addAll(0, lk2);
		System.out.println("then the first List is ");
		System.out.println(lk);
		
		
		//the size of the linkedList is 
		System.out.println(lk.size());
		
		//adding the element at the first positions 
		
		lk.addFirst("khushboo");
		System.out.println("after adding element at front end ");
		System.out.println(lk);
		
		// adding the element at the last positions 
		
		lk.addLast("Geeta");
		System.out.println("after adding last ");
		System.out.println(lk);
		
		
		//Removing specific element from the array by Name
		
		lk.remove("Geeta");
		System.out.println("after removing the element by name");
		System.out.println(lk);
		
		// Removing the specific element from the array by using positions 
		lk.remove(0);
		System.out.println("after removing from the index ");
		System.out.println(lk);
		
		//Removing the last Element from the array 
		lk.removeLast();
		System.out.println("after the use of this ");
		System.out.println(lk);
		
		//Removing the first elemnet from the array
		
		lk.removeFirst();
		System.out.println("after this ");
		System.out.println(lk);
		
		
		// Removing the first Ocurrence of the objects 
		lk.removeFirstOccurrence("Ravi");
		System.out.println("after this ");
		System.out.println(lk);
		
		// adding one element for last occurence 
		lk.add(1,"Harish");
		System.out.println(lk);
		
		// Removing the last occurenec of the element 
		
		lk.removeLastOccurrence("Harish");
		System.out.println("after this ");
		System.out.println(lk);
		
		// Traversing the list of the objects in reversing direction
		
		Iterator itr2 = lk.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// The use of clear() 
		
		lk.clear();
		System.out.println("this removes all the element from the list");
		System.out.println(lk);
		
		
		
		
	}

}
