package com.java.ds.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueExample5 {
	public static void main(String[] args) {
		System.out.println("This is the example of the Queue ");
		Queue<String > que = new ArrayDeque<String>();
		que.add("Sunil");
		que.add("Arti");
		System.out.println("the list of the queue is ");
		System.out.println(que);
		Iterator itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("priting the first element in the queue");
		System.out.println(que.remove());
		System.out.println(que);
	}

}
