package com.java.ds.ExceptionHandlingForReverseKetty;

public class StringException {
	public static void main(String[] args) {
		String str = "Hello";
		int res = str/0;
		System.out.println("what kind of the exception is " + res);
	}
}
