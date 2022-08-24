package com.java.ds.StringForReverseKetty;

import java.util.StringTokenizer;

public class StringTokenizerExample11 {
	public static void main(String[] args) {
		System.out.println("This is the example of the String tokenizer");
		StringTokenizer st = new StringTokenizer("My Name is Sunil");
		System.out.println("the String is ");
		System.out.println(st);
		//Iterating the token using while loop
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//now i am going to the count the number of thr tokens in String 
//		System.out.println(st.countTokens());
//		while(st.hasMoreTokens()) {
//			System.out.println(st.countTokens());
//		}
		
//		The Another way to iterate the token using hasMoreElement()
		System.out.println("the use of the hasMoreElement() in String token ");
		StringTokenizer st1 = new StringTokenizer("Hello EveryOne i Am java Developer");
		while(st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}
		
		System.out.println("The number of the token is ");
		System.out.println(st1.countTokens());
		
	}

}
