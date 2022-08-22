package com.java.ds.ExceptionHandlingForReverseKetty;

public class ExampleOfFinally {
	public static void main(String[] args) {
		System.out.println("This is the example of the finally ");
		
//		finally is the block in Java Exception Handling to execute
//		the important code whether the exception occurs or not.
		
//		Finally block is always related to the try and catch block in exception handling.
		
// 		(1) finally block runs the important code even if exception occurs or not.
//		(2) finally block cleans up all the resources used in try block
		
//		Finally block is executed as soon as the try-catch block is executed.
//		It's execution is not dependent on the exception.
		
		
		try {
			System.out.println("This is inside the try block");
			int data = 25/0;
			System.out.println("the result us " + data);
		}catch (ArithmeticException e) {
			System.out.println("You can not divide this number by Zero");
		}finally {
			System.out.println("it will always executes ");
		}
		
	}

}
