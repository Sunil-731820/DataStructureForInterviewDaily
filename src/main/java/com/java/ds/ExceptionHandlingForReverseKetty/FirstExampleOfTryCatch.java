package com.java.ds.ExceptionHandlingForReverseKetty;

public class FirstExampleOfTryCatch {
	public static void main(String[] args) {
		System.out.println("This is the Example of the try catch ");
		
		//This is the first parts 
//		try {
//			System.out.println("Dividing the Number by zero");
//			int data = 1000/0;
//		}catch(ArithmeticException e){
//			System.out.println("You can not divide this number by Zero");
//		}
		
		//this is second Parts 
		
		//scenerio of the Arithmetic Exceptions
		
//		try {
//			int number = 50/0;
//		}catch(ArithmeticException e) {
//			System.out.println("This can not be divide by Zero");
//		}
//		
//		
		//Scenerio Of nullPointException
		
		
//		try {
//			String data = null;
//			System.out.println(data.length());
//		}catch(NullPointerException e) {
//			System.out.println("You can not check the length of the string");
//		}
//		
//		
		
		//Scenerio of the NumberFormatException
		
//		try {
//			String data = "abc";
//			int number = Integer.parseInt(data);
//			System.out.println("the Number is " + number);
//			
//		}catch (NumberFormatException e) {
//			System.out.println("You can not parse the String into the Integer ");
//			// TODO: handle exception
//		}
		
		
		//Scenerio Of the ArrayIndexOutOfBoundsExceptions
		
		try {
			int[] arr = new int[5];
			arr[11] = 100;
			System.out.println("the array is " + arr[1]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You can not find the data at the index of the 10");
		}
		
		
		
		
	}

}
