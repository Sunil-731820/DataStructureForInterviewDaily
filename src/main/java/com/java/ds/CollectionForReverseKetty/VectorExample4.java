package com.java.ds.CollectionForReverseKetty;

import java.util.Vector;

public class VectorExample4 {
	public static void main(String[] args) {
		System.out.println("This is the example of the vector ");
		
		Vector<String> vc = new Vector<String>();
		System.out.println("the size of the vector is " + vc.size());
		vc.add("Tiger");
		vc.add("Lion");
		vc.add("Dog");
		vc.add("Elephant");
		System.out.println("the vector element is ");
		System.out.println(vc);
		
		
		Vector<String > vc1 = new Vector<String>();
		vc1.add("Rat");
		vc1.add("Cat");
		System.out.println("the list of the vector part2 is ");
		System.out.println(vc1);
		System.out.println("adding into the vector one to vector 2");
		
		vc.addAll(vc1);
		System.out.println("then the list of the vector is ");
		System.out.println(vc);
		
		

	}

}
