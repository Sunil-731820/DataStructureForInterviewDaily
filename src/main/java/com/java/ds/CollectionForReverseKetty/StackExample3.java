package com.java.ds.CollectionForReverseKetty;

import java.util.Iterator;
import java.util.Stack;

public class StackExample3 {
	public static void main(String[] args) {
		System.out.println("This is the example of stack in collections");
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean result = stack.isEmpty();
		System.out.println("Checking whether the Stack is empty or Not" + result);
		stack.push(78);
		stack.push(113);
		stack.push(90);
		stack.push(120);
		System.out.println("the stack is ");
		System.out.println(stack);
		
		
		// Again Creating the stack 
		
		Stack<String> stk = new Stack<String>();
		stk.push("Apple");
		stk.push("Banana");
		stk.push("Oranges");
		stk.push("Mango");
		stk.push("Grapes");
		System.out.println("the list of the stack is ");
		System.out.println(stk);
		
		
		//Accessing the element from the top of the stack 
		
		String top = stk.peek();
		System.out.println("The peek element is " + top);
		
		//Searching the objects in the stack
		
		Stack<String> laptop = new Stack<String>();
		laptop.push("Mac Book");
		laptop.push("HP");
		laptop.push("Dell");
		laptop.push("Asus");
		System.out.println("the stack is ");
		System.out.println(laptop);
		
		//searching the element 
		int locations = laptop.search("HP");
		System.out.println("the Locations of the stack objects  is : ->  " + locations);
		int locations1 = laptop.search("Mac Book");
		System.out.println("the objects positions is :->  " + locations1);

		//printing the size of the stack is 
		System.out.println(laptop.size());
		
		
		//Iterating the objects using Iterator 
		
		Iterator itr = laptop.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
