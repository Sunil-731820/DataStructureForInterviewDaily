package com.java.ds.ExceptionHandlingForReverseKetty;

public class ExampleOfThrowKeywords {
	

	//Throw is basically used to throw the error at the compile time not at thr run time 
	//These exception may be related to the user input and server
	
//	1 :  Example of the checked exceptions 
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("the person can not vote ");
		}else {
			System.out.println("the person can vote ");
		}
		
	}
	
	public static void checkPositiveNumber(int number) {
		if(number<0) {
			throw new ArithmeticException("The Number is not positive okay ");
		}else {
			System.out.println("The number is positive " + number);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is the example of the throw keywords in java ");
//		validate(13);
//		checkPositiveNumber(-1);
		checkPositiveNumber(10);
		
		
		
	}

}
