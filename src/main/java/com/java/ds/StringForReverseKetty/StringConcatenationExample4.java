package com.java.ds.StringForReverseKetty;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringConcatenationExample4 {
	public static void main(String[] args) {
		System.out.println("This is the example of the concatenation in string ");
		String str1 = "Sachin " + "Tendulkar";
		System.out.println("the String is ");
		System.out.println(str1);
		
		// concatenating the String with Number 
		String str2 = 30+50 + "Sunil" + 50+50;
		System.out.println("after this concatenation of the two String is ");
		System.out.println(str2);
		
		// the use of the String Joiner class 
		
		StringJoiner join = new StringJoiner("  ");
		join.add("Sunil");
		join.add("Kumar");
		join.add("Gupta");
		System.out.println("after the concatenation of the String is ");
		System.out.println(join);
		
		
		// How to create the List Of the String array 
		
		List<String> list1 = Arrays.asList("sunil","kumar","gupta");
		System.out.println("the list of the array is ");
		System.out.println(list1);
		for(String str12 : list1) {
			System.out.println("the Objects is   " + str12);
		}
	}

}
