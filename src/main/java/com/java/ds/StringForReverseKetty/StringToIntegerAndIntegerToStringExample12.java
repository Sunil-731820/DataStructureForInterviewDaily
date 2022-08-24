package com.java.ds.StringForReverseKetty;

public class StringToIntegerAndIntegerToStringExample12 {
	public static void main(String[] args) {
		System.out.println("this is the example of the String to Integer parts 1");
		String num = "12";
		System.out.println("the STring is " + num);
		//now adding something to the String such as 100
		System.out.println("the new String is  " + num + 100);
		System.out.println();
		int convertNumber = Integer.parseInt(num);
		System.out.println("the Integer is  " + convertNumber);
		//Now Adding the 100 to the converted Number  
		System.out.println(convertNumber+ 100);
		
		System.out.println("-----------------------------------------");
		System.out.println("this is the second parts of the Converting the String into the Number");
		int x = 5;
		System.out.println("The Integer is " + x);
		//now adding the 10 to the Integer 
		System.out.println("the Sum of the Integer is " + x+10);
		String strNum = Integer.toString(x);
		System.out.println("the String after converting the Number to String is " + strNum);
		// now adding 10 to the String after converting int to str
		System.out.println(strNum+10);
		
		
		
	}

}
