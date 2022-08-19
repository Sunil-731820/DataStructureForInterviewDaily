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
		
	
		// The use of the size()
		
		System.out.println("the size of the vector is " + vc.size());
		
		//Checking the tiger is present in the vector or not and the use of contains() and indexOf()
		if(vc.contains("Tiger")) {
			System.out.println("The Tiger is present in this vector " + vc.indexOf("Tiger"));
			
		}
		
		//getting the first Element from the vector
		
		System.out.println("the first element from the vector is " + vc.firstElement());
		
		//Getting the last element from the vector
		
		System.out.println("the last element of the vector is "+ vc.lastElement());
		
		
		
		//creating the another vector 
		Vector<Integer> in = new Vector<Integer>();
		    in.add(100);  
	        in.add(200);  
	        in.add(300);  
	        in.add(200);  
	        in.add(400);  
	        in.add(500);  
	        in.add(600);  
	        in.add(700);  
		
	        // Removing the first occurence of the data , here typecasting is required if 
	        // you are removing the value from the vector
	       
	        System.out.println(in.remove((Integer)100));
	        System.out.println("after the removal the vector is ");
	        System.out.println(in);
	        
	        // Removing the value by index
	        System.out.println("after the removal of the index value " + in.remove(4));
	        System.out.println("the vector is " + in );

	        //Getting the element at the specified positions
	        System.out.println("getting the data " + in.get(0));
	        
	        //Getting the hashcode of the vector
	        System.out.println("the hashcode of the vector is " + in.hashCode());
	}

}
