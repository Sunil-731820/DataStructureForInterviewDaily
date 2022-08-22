package com.java.ds.ExceptionHandlingForReverseKetty;

public class TestOfFinallyBlock {
    public static void main(String[] args) {
        System.out.println("This is the Example of the Finally block statement ");
        try {
        	int data = 100/0;
        	
        }catch (ArithmeticException e) {
			System.out.println("You can not divide the Number by zero ");
		}finally {
			System.out.println("This finally block always executed ");
		}
    }


}
