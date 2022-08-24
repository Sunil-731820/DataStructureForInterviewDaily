package com.java.ds.StringForReverseKetty;

public class SubStringExample5 {
	public static void main(String[] args) {
		System.out.println("this is the example of the Substring");
		String str1 = "hello";
		System.out.println("the String is ");
		System.out.println(str1);
		
		//printing the data from the index 1 
		System.out.println("the subString is ");
		System.out.println(str1.substring(1));
		
		//printing the data from the index 0 to 2 in range
		System.out.println("the use of the subString() ");
		System.out.println(str1.substring(0, 2));
		
		// Splitting the array using delimiter in java
		
		String str2 = new String("Hello, My name is Sachin"); 
		System.out.println("the String is ");
		System.out.println(str2);
		
		//Now Splitting the array using delimiter argument 
		  String[] sentences = str2.split("\\.");  
		System.out.println("the list of the array is ");
		System.out.println(sentences);
		
	}

}
