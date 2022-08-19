package com.java.ds.CollectionForReverseKetty;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample9 {
	public static void main(String[] args) {
		System.out.println("This is the example of the treeset ");
		
		TreeSet<String>  ts = new TreeSet<String>();
		ts.add("Sunil");
//		ts.add(null); you can not store the null values in the tree set 
		System.out.println("the tree set is ");
		System.out.println(ts);
		
		ts.add("Harish");
		ts.add("Arti");
		ts.add("subham");
		System.out.println("after new objects insertion ");
		System.out.println(ts);
		
		//Iterating the treeset using Iterator()
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Iterating the treeset in reverse direction 
		System.out.println("the list of the treeset is ");
		Iterator<String> itr1 = ts.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		//creating the new TreeSet for the other Functions

		TreeSet<Integer> number = new TreeSet<Integer>();
		number.add(24);
		number.add(66);
		number.add(12);
		number.add(15);
		System.out.println("the list of the Number of the set is ");
		System.out.println(number);
		//Calculating the lowest value using builtIn Functions
		System.out.println("the Lowest Value is " + number.pollFirst());
		
		//Calculating the highest value using builtIn Functions
		// Basically poll is used to remove and retrive the data from the set and return to the main functions 
		System.out.println("The Highest Value is " + number.pollLast());
		
		
		// You can also reverse the set using builtIn Function 
		
		System.out.println("reversing the function using built In ");
		System.out.println(number.descendingSet());

		
		
	}

}
