package com.java.ds.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample6 {
	public static void main(String[] args) {
		System.out.println("This is the Example of the dequeue");
		Deque<String> dequ = new ArrayDeque<String>();
		dequ.add("Sunil");
		dequ.add("Suman");
		System.out.println("the dequeue list is ");
		System.out.println(dequ);
		System.out.println(dequ.removeFirst());
		System.out.println(dequ);
		System.out.println(dequ.removeLast());
		System.out.println(dequ);
		System.out.println("adding the element from the last end of the dequue");
		dequ.addLast("Khushboo");
		System.out.println(dequ);
		dequ.addFirst("Subham");
		System.out.println(dequ);
		
	}

}
