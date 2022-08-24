package com.java.ds.StringForReverseKetty;

public class StringBuilderExample8 {
	public static void main(String[] args) {
		System.out.println("this is the example of the string Builder ");
		
//		String Builder is used to create the mutable String but it is non- synchronised (means it is not thread safe and it is slow)
		
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("Java");
		System.out.println("the String is ");
		System.out.println(sb);
		
		//insert the string at the specific index 
		sb.insert(1, "PythoN");
		System.out.println("the new String will be ");
		System.out.println(sb);
		
		// the use of the replace() in java
		StringBuilder sb1 = new StringBuilder("JAVA");
		sb1.replace(1, 3, "kava");
		System.out.println("the new String after the use of the replace()");
		System.out.println(sb1);
		
		// The use of the delete() in StringBuilder
		
		StringBuilder sb2 = new StringBuilder("hello");
		System.out.println("the use of the delete");
		sb2.delete(0, 1);
		System.out.println(sb2);
	}

}
