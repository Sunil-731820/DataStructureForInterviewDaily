package com.java.ds.StringForReverseKetty;

public class StringFirstExample1 {
	public static void main(String[] args) {
		System.out.println("This is the example of the String ");
		char[] ch = {'a','b','c','d','e'};
		System.out.println("the array of the character is ");
		System.out.println(ch);
		
		//converting the character into the string
		String str = new String(ch);
		System.out.println("the String is ");
		System.out.println(str);
		
		// we can create the string in three ways 
//		1  : You can use String
//		2  : You can use StringBuffer
//		3  : you can use StringBuilder
		
		String s = "welcome";
		System.out.println("The String is " + s);
		
		//Now assigning the same value to the other variable 
		
		String s1 = "Welcome";
		System.out.println("this  variable is of the String is " + s1);
		
//		creating the String using new keywords
		String str1 = new String();
		str1 = "harish";
		System.out.println("the string is " + str1);
		
		
	}
}
