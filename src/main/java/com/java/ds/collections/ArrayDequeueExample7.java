package com.java.ds.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeueExample7 {
	public static void main(String[] args) {
		
		
		System.out.println("this is the example of the ");
		Deque<String> arrayDequeue = new ArrayDeque<String>();
		arrayDequeue.add("Sunil");
		arrayDequeue.add("Harish");
		System.out.println("The Deque array is ");
		Iterator itr = arrayDequeue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		arrayDequeue.addFirst("Ashok");
		System.out.println(arrayDequeue);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		arrayDequeue.addLast("Vinod");
		
		System.out.println("the deque array is ");
		System.out.println(arrayDequeue);
		System.out.println("removing the named element from the array is ");
		System.out.println(arrayDequeue.remove());
		System.out.println("the deque array is ");
		System.out.println(arrayDequeue);
		
		// the use of the offer() in java
		arrayDequeue.offer("Arti");
		
		System.out.println("after the use of the offer() in java");
		System.out.println(arrayDequeue);
		
		// the use of the peekFirst() in java
		System.out.println("after the use of the peekFirst()");
		System.out.println(arrayDequeue.peekFirst());
		System.out.println("again i am using peekFirst() ");
		System.out.println(arrayDequeue.peekFirst());
		
		
	}
}
