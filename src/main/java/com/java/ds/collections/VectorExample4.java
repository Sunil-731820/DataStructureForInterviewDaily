package com.java.ds.collections;

import java.util.Vector;

public class VectorExample4 {
	public static void main(String[] args) {
		System.out.println("This is the Example of the vector parts");
		Vector<String> Vc = new Vector<String>();
		Vc.add("Sunil");
		System.out.println("the list of the Vector is ");
		System.out.println(Vc);
		Vc.add("harish");
		System.out.println("the list of the vector is ");
		System.out.println(Vc);
		Vc.remove("Sunil");
		System.out.println("the list of the stack is ");
		System.out.println(Vc);
		
	}

}
