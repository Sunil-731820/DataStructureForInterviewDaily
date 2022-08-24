package com.java.ds.StringForReverseKetty;

public class StringImmutableExample2 {
	public static void main(String[] args) {
		System.out.println("This is the example of the String immutable example ");
		String str1 = "sachin";
		str1.concat("tendulkar");// This will not able to concat the string because of immutable string in java 
		System.out.println("the final string is " + str1);
		
		// the another example
		String str2 = "sunil";
		str2 = str2.concat("kumar"); // This will concate the both the string using concate() 
		System.out.println("Now the String is " + str2);
		
		
		
		
	}

}
