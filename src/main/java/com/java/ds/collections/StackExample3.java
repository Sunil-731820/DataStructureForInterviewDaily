package com.java.ds.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample3 {
	public static void main(String[] args) {
		System.out.println("This is the example of the stack collections in java");
		Stack<String> st = new Stack<String>();
		st.push("Sunil");
		st.push("Harish");
		System.out.println("the stack objects is ");
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("the pop operations is ");
		st.pop();
		System.out.println("after the pop operation is ");
		System.out.println(st);
	}

}
