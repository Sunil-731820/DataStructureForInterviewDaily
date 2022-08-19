package com.java.ds.CollectionForReverseKetty;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample5 {
	public static void main(String[] args) {
		System.out.println("This is the example of the priority queue");
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jay");
		queue.add("Rahul");
		System.out.println("the queue is ");
		System.out.println(queue);
		
		//Iterating the queue using Iterator()
		
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// the use of the element() in the queue
		System.out.println("the head of the queue is " + queue.element());
		
		// The use of the peek() i.e. it also find the top element in the queue
		System.out.println("the Peek of the queue is " + queue.peek());
		
		// The use of the remove() in queue
		System.out.println(queue.remove());
		System.out.println("after this the queue is ");
		System.out.println(queue);
		
		//Now adding one more Objects in the queue
		queue.add("suman");
		System.out.println("the new queue is ");
		System.out.println(queue);
		
		
		
		
		
	}

}
