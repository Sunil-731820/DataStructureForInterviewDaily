package com.java.ds.RegexInJava;

import java.util.regex.Pattern;

public class RegexFirstExample1 {
	public static void main(String[] args) {
		System.out.println("this is the example of the regex in java");
		
		System.out.println("-----------------------1 ways is -------------------");
		Pattern p = Pattern.compile(".s");// single character 
		System.out.println(p);
		
		System.out.println("the another example is ");
		//the use of the Pattern.match() in Regex in java
		//WithOut the . operator 
		System.out.println(Pattern.matches("s", "as"));
		
//		The use of the Pattern.match() in Regex in java
		//With . Operator 
		System.out.println(Pattern.matches(".s", "as"));
		
		
		
	}

}
