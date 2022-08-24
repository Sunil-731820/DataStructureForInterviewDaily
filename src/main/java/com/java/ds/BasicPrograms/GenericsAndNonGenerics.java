package com.java.ds.BasicPrograms;

import java.util.ArrayList;

public class GenericsAndNonGenerics {
	public static void main(String[] args) {
		System.out.println("this is the example");
		ArrayList list1 = new ArrayList<>();
		list1.add("sunil");
		list1.add(1);
		System.out.println("the list is " + list1);
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("subham");
//		ls.add(1); you can not add the differnt datatype into the other list
		
		
	}

}
