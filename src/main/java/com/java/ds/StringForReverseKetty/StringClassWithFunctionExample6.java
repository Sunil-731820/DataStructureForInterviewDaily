package com.java.ds.StringForReverseKetty;

public class StringClassWithFunctionExample6 {
	public static void main(String[] args) {
		System.out.println("this is the example of the string class ");
		
		String str = "Sachin";
		System.out.println("the capitalize string is ");
		System.out.println(str.toUpperCase());
		
		String str1 = "SACHIN";
		System.out.println("the lowercase string is");
		System.out.println(str1.toLowerCase());
		
		// the use of the trim() in String 
		
		String str2 = "      Sachin    ";
		System.out.println("the original String is ");
		System.out.println(str2);
		
		System.out.println("after the use of the trim() in string ");
		System.out.println(str2.trim());
		
		
//		the use of the StartWith() and EndWith() in java
		
		String str3 = "Sachin";
		System.out.println("after the use of the startWith()");
		System.out.println(str3.startsWith("Sa"));
		
		System.out.println("after the use of the endWith()");
		System.out.println(str3.endsWith("n"));
		
//		 The USe of the charAt() in java
		
		String str4 = "Sachin";
		System.out.println("printing the value at index 0 is ");
		System.out.println(str4.charAt(0));
		System.out.println("priting the value at the index 4 is ");
		System.out.println(str4.charAt(4));
		
//		 after the use of the length() in the String 
		String str5 = "Sunil";
		System.out.println("the length of the String is ");
		System.out.println(str5.length());
		
		
//		The USe of the valueOf() in java
		
		System.out.println("the use of the valueOf()");
		int a = 10;
		String s = String.valueOf(a);
		System.out.println("the String is after the use of the valueOf() in java");
		System.out.println(s);
		
		// Now adding something at the end of the string is 
		System.out.println(s+10);
		
//		The use of the Replace() in String 
		
		String str11 = "Java is a programming language. Java is a platform. Java is an Island.";
		System.out.println("the original String is ");
		System.out.println(str11);
		
		String ReplaceAllOccurence = str11.replace("java", "kava");
		System.out.println("the updated string will be ");
		System.out.println(ReplaceAllOccurence);
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
