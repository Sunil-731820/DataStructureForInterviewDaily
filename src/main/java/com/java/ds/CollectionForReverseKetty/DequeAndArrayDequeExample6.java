package com.java.ds.CollectionForReverseKetty;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeAndArrayDequeExample6 {
	public static void main(String[] args) {
		System.out.println("This is the example of the Deque and ArrayDequeu");
		
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		
		System.out.println("the list of the deque aray is ");
		System.out.println(deque);
		
		//Iterating the deque using iterator()
		
		Iterator<String> itr = deque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		// creating the another deque 
		
		Deque<String> deque1 = new ArrayDeque<String>();
		deque1.offer("Arvind");
		deque1.offer("vimal");
		deque1.add("mukul");
		System.out.println("the new dequeu is ");
		System.out.println(deque1);
		
		//Adding the element at the first positions
		
		deque1.addFirst("Jay");
		
		//Adding the element at the last position 
		deque1.addLast("suman");
		
		System.out.println("after this the new deque is");
		System.out.println(deque1);
		
		// the use of poll -> it is same as pollFirst() 
		deque1.pollFirst();
		System.out.println("after the pollFirst() first time ");
		System.out.println(deque1);
		deque1.pollFirst();
		System.out.println("after this polfirst()");
		System.out.println(deque1);
		
		
		
	}

}
