package com.java.ds.StringForReverseKetty;

public class StringCompareExample3 {
	public static void main(String[] args) {
		System.out.println("This is the example of the comparing the string in java");
		//you can use three ways to compare the String 
//		1 : equal()
//		2 : ==
//		3 : compareTo()
		
		System.out.println("the use of equal() in java");
		String str1 = "Sachin";
		String str2 = "Sachin";
		String str3 = new String("Sachin");
		String str4 = new String("Saurav");
		
		System.out.println("comparing the first and second String ");
		System.out.println(str1.equals(str2));
		System.out.println("comparing tyhe second and third string ");
		System.out.println(str2.equals(str3));
		System.out.println("comparing the third and fourth String ");
		System.out.println(str3.equals(str4));
		
		// The another way 
		String str5 = "sachin";
		String str6 = "SACHIN";
		System.out.println("the string is " + str5);
		System.out.println("the String is " + str6);
		System.out.println("comparing these string is  ");
		System.out.println(str5.equals(str6));
		System.out.println("comparing without case value ");
		System.out.println(str5.equalsIgnoreCase(str6));
	
		
		// the use of == Operator for the String 
		
		String str11 = "Sachin";// These Str11 and str22 is belonging to the same pool
		String str22 = "Sachin";
		System.out.println("after comparing the string is ");
		System.out.println(str11==str22);
		
		String str33 = new String("Sachin");// these are belonging to the different pool i.e str33 and str44 are different
		String str44 = new String("Sachin");
		System.out.println("the use of the == operator ");
		System.out.println(str33==str11);
		System.out.println("the use of the == operator ");
		System.out.println(str33==str44);
		
		// The use of the comapreTo()
		
		String str111 = "Sachin";
		String str222 = "Sachin";
		System.out.println(str111.compareTo(str222));

		
		
	}

}
