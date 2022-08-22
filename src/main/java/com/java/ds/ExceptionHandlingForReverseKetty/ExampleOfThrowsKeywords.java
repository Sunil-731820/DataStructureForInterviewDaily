package com.java.ds.ExceptionHandlingForReverseKetty;

public class ExampleOfThrowsKeywords {
	//throws keywords is used to declare an exception ,
//	it gives the information to the programmer that there may occur an exceptions
//	So it is better for the programmer to maintain the normal code flow 
	
	public static int DivFirstNumBySecNumber(int num1 , int num2) throws ArithmeticException {
		int res  = num1/num2;
		return res;
		
	}
	public static void main(String[] args) {
		System.out.println("this is the example of the throws keywords");
		int finalRes = DivFirstNumBySecNumber(1, 10);
		System.out.println("the result will be " + finalRes);

		
	}

}
